# Application Controller Pattern

***

## Problem

_(Problem section describes the design issues faced by the developer)_

You want to centralize and modularize _action_ and _view_ management.

In the presentation tier, there are typically two decisions to be made upon the arrival of each request:

* First, the incoming request must be resolved to an action that services the request. This is called _action management_.

* Second, the appropriate view is located and dispatched. This is called _view management_.

## Forces

* You want to reuse action and view-management code.

* You want to improve request-handling extensibility, such as adding use case functionality to an application incrementally.

* You want to improve code modularity and maintainability, making it easier to extend the application and easier to test discrete parts of your request-handling code independent of a web container.

## Solution

Use an _Application Controller_ to centralize retrieval and invocation of request-processing components, such as commands and views.

In the presentation tier, we map incoming request parameters to specific request-processing classes, and to view components that handle each request. _ _

*Action management* refers to locating and invoking actions to handle specific requests, while *view management* refers to navigating and dispatching to the appropriate view or view-generation mechanism.

## Structure

![](https://github.com/seth9341/CIT360/blob/master/Application%20Controller%20Pattern/application-controller-class-diagram.PNG)

![](https://github.com/seth9341/CIT360/blob/master/Application%20Controller%20Pattern/application-controller-sequence-diagram.PNG)

### Participants and Responsibilities

**Client:** Invokes the Application Controller. In the presentation tier, a [FrontController](http://www.javaguides.net/2018/08/front-controller-design-pattern-in-java.html) or an [InterceptingFilter](http://www.javaguides.net/2018/08/intercepting-filter-design-pattern-in-java.html)typically fulfill this role.

**ApplicationController :** Uses Mapper to resolve an incoming request to the appropriate action and view, to which it delegates or dispatches.

**Mapper :** Uses a Map to translate an incoming request into the appropriate action and view. A Mapper acts as a factory.

**Map:** Holds references to handles that represent target resources. Maps might be realized as a class or a registry.

**Target :** A resource that helps fulfill a particular request, including commands, views, and style sheets.

## Implementation

Let's understand *Application Controller Pattern* with an example.

**Step 1:** Let's create view components like *index.jsp* and *viewStudent.jsp* pages.
    
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
     <title>Index Page</title>
    </head>
    <body>
     <a href="studentView.do?id=10">Show Student Information</a>
    </body>
    </html>
    
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="student" type="design.StudentVO" scope="request" />
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Student Information</title>
    </head>
    <body>
     <p style="color: blue;font-size:x-large; large;font-family: sans-serif;">
     Student Id : <jsp:getProperty property="id" name="student"/><br>
     Student Name : <jsp:getProperty property="name" name="student"/>
     </p>
    </body>
    </html>

**Step 2:** _Application Controller Pattern_ is _J2EE Design Pattern_ so let's create deployment descriptor that is _web.xml_.
    
    <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"   
    xmlns="http://java.sun.com/xml/ns/javaee"   
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee   
    http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"   
    id="WebApp_ID" version="3.0">  
    
     <display-name>ApplicationControllerWeb</display-name>
     <servlet>
       <servlet-name>front</servlet-name>
       <servlet-class>design.FrontController</servlet-class>
     </servlet>
     <servlet-mapping>
       <servlet-name>front</servlet-name>
       <url-pattern>*.do</url-pattern>
     </servlet-mapping>
    
     <welcome-file-list>
      <welcome-file>index.jsp</welcome-file>
     </welcome-file-list>
     
    </web-app>

_Step 3: _Let's create Value Object Or DTO like _StudentVO.java_.
    
    public class StudentVO {
        private String id;
        private String name;
    
        //constructor
        public StudentVO(String id, String name) {
            this.id = id;
            this.name = name;
        }
    
        //setters and getters
    
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

Now create _Command_ interface.
    
    public interface Command {
        String execute(RequestContext requestContext);
    }

_StudentViewCommand_ class which implements _Command_ interface
    
    public class StudentViewCommand implements Command {
    
        @Override
        public String execute(RequestContext requestContext) {
    
            String id = null;
            StudentVO studentVo = null;
    
            id = requestContext.getParameter("id");
    
            //call delegate and dao 
            studentVo = new StudentVO(id, "Ramesh");
    
            requestContext.setAttribute("student", studentVo);
    
            return "showStudent";
        }
    
    }

Create _ContextFactory_ to handle context information.
    
    import java.util.Map;
    
    import javax.servlet.http.HttpServletRequest;
    
    public class ContextFactory {
    
        public RequestContext getContextObject(HttpServletRequest request) {
            Map < String, String[] > requestMap = null;
            RequestContext requestContext = null;
            HttpRequestMapper requestMapper = null;
    
            requestMapper = new HttpRequestMapper();
            requestMap = requestMapper.extract(request);
            requestContext = new RequestContext(request.getRequestURI(), requestMap);
    
            return requestContext;
        }
    
        public void bindContextObject(HttpServletRequest request, RequestContext requestContext) {
            HttpRequestMapper requestMapper = null;
    
            requestMapper = new HttpRequestMapper();
            requestMapper.bind(request, requestContext.getResponseMap());
        }
    
    }

Let's create _RequestContext_ class.
    
    import java.util.HashMap;
    import java.util.Map;
    
    public class RequestContext {
    
        private String requestUri;
        private Map < String, String[] > requestMap;
        private Map < String, Object > responseMap;
    
        public RequestContext() {
            requestUri = null;
            requestMap = new HashMap < String, String[] > ();
            responseMap = new HashMap < String, Object > ();
        }
    
        public RequestContext(String requestUri, Map < String, String[] > requestMap) {
            this.requestUri = requestUri;
            this.requestMap = requestMap;
            this.responseMap = new HashMap < String, Object > ();
        }
    
        public String getParameter(String param) {
            String[] val = null;
            if (param != null) {
                val = requestMap.get(param);
            }
            return val[0];
        }
    
        public void setAttribute(String param, Object value) {
            responseMap.put(param, value);
        }
    
        public String getRequestUri() {
            return requestUri;
        }
    
        public Map < String, String[] > getRequestMap() {
            return requestMap;
        }
    
        public Map < String, Object > getResponseMap() {
            return responseMap;
        }
    
    }

**Step 4:** It's time to create _FrontController.java_.
    
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    public class FrontController extends HttpServlet {
    
        private static final long serialVersionUID = 1 L;
    
        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    
            String page = null;
            String view = null;
            Dispatcher dispatcher = null;
            RequestContext requestContext = null;
            ContextFactory contextFactory = null;
            ApplicationController applicationController = null;
    
            // plubbing code (security, authorization)
    
            // extracting data from protocol
            contextFactory = new ContextFactory();
            requestContext = contextFactory.getContextObject(request);
    
            applicationController = new ApplicationController();
            view = applicationController.process(requestContext);
    
            // binding data back to protocol
            contextFactory.bindContextObject(request, requestContext);
            page = applicationController.mapViewToPage(view);
    
            dispatcher = new Dispatcher();
            dispatcher.dispatch(request, response, page);
        }
    }

**Step 5 :** Create _ApplicationController_ class and respective classes required to demonstrate this pattern.
    
    public class ApplicationController {
    
        public String process(RequestContext requestContext) {
            String view = null;
            Command command = null;
            CommandHelper commandHelper = null;
    
            commandHelper = new CommandHelper();
            command = commandHelper.getCommand(requestContext.getRequestUri());
            view = command.execute(requestContext);
    
            return view;
        }
    
        public String mapViewToPage(String view) {
            String page = null;
            if (view != null) {
                page = "viewStudent.jsp";
            }
    
            return page;
        }
    }
    
    public class CommandHelper {
    
        public Command getCommand(String uri) {
    
            Command command = null;
            if (uri.contains("studentView.do")) {
                command = new StudentViewCommand();
            }
    
            return command;
        }
    
    }
    
    public class Dispatcher {
    
        public void dispatch(HttpServletRequest request, HttpServletResponse response, String page) {
    
            RequestDispatcher rd = null;
    
            rd = request.getRequestDispatcher(page);
            try {
                rd.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
    }
    
    import java.util.Map;
    import java.util.Set;
    
    import javax.servlet.http.HttpServletRequest;
    
    public class HttpRequestMapper {
    
        public Map < String, String[] > extract(HttpServletRequest request) {
            Map < String, String[] > requestMap = null;
            requestMap = request.getParameterMap();
    
            return requestMap;
        }
    
        public void bind(HttpServletRequest request, Map < String, Object > responseMap) {
    
            Set < String > keys = null;
            keys = responseMap.keySet();
    
            for (String param: keys) {
                request.setAttribute(param, responseMap.get(param));
            }
    
        }
    
    }

Output :

    http://localhost:8001/javaT/
    
    http://localhost:8001/javaT/studentView.do?id=10
    
    browser :
    Student Id : 100
    Student Name : Ramesh


## Consequences

  * Improves modularity

  * Improves reusability

  * Improves extensibility 

## References

  * [Core J2EE Patterns: Best Practices and Design Strategies](https://www.amazon.in/Core-J2EE-Patterns-Practices-Strategies/dp/8177586718?tag=googinhydr18418-21&tag=googinkenshoo-21&ascsubtag=dd96a0fe-332d-495e-a94c-8f6f1cfaece6)
  * [http://www.corej2eepatterns.com](http://www.corej2eepatterns.com/BusinessDelegate.htm)
