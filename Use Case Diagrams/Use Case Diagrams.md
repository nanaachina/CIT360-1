# Use Case Diagrams

Several UML Diagrams And One Document In The Order In Which They Should Be Created.

| DOCUMENT TYPE | DESCRIPTION | LEVEL OF DETAIL | TARGET AUDIENCE | SCOPE	|
| -- | -- | -- | -- | --	|
| Use Case Diagram | What can the user do with the application?	| Low	| The customer’s management team	| One diagram per application. One Use Case ‘bubble’ per user activity	|
| Use Case Document | How does the user accoplish each activity listed in the Use Case Diagram?	| Medium	| The customer’s management team	| One document per Use Case ‘bubble’. No descriptions of inner workings of the application allowed.	|
| State Diagram | How does the application change internally? What loops, conditionals, and threads are needed?	| Low	| Internal production teams	| One diagram per Use Case Document	|
| Sequence Diagram | What objects, methods, parameters, and local variables are requied? When complete the programmer should be able to see every code step that is to be coded including loops, 	|cases, etc. d High	| Internal production teams	| One diagram per State Diagram	|
| Class Diagram | What are the objects, methods, attributes and inter-object relationships required within the application	| High	| Internal production teams	| One diagram per Sequence Diagram	|

From "Doing More With Java page 14"
