/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

/**
 *
 * @author seth
 */


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionDemo {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		HttpURLConnectionDemo http = new HttpURLConnectionDemo();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		
		System.out.println("\nTesting 2 - Send Http POST request");
		http.sendPost();

	}

	// HTTP GET request
	private void sendGet() throws Exception {
            
                System.out.println("Please Enter a URL");
                
                Scanner inFile;
                inFile = new Scanner(System.in);
        
        // read the value of the next line typed in the console

		String url = inFile.nextLine();
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
                
                URL whatsIp = new URL(url);
                String hostIp = whatsIp.getHost();
                InetAddress netIp = InetAddress.getByName(hostIp);
                String ipAddress = netIp.getHostAddress();
                System.out.println(ipAddress + " is the IP for the URL Entered.");
                
                
                
                if(responseCode!=200) {
                System.out.println("The Server Is Not Responding\nPlease Resolve The Issue\n");
                return;
                }

                StringBuffer response;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }

		//print result
		System.out.println(response.toString());

	}
	
	// HTTP POST request
	private void sendPost() throws Exception {

		//"https://selfsolve.apple.com/wcResults.do"
            System.out.println("Please Enter a URL");
                
                Scanner inFile;
                inFile = new Scanner(System.in);
        
        // read the value of the next line typed in the console

		String url = inFile.nextLine();
                
                
            
                
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
                
                

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
		
		// Send post request
		con.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.writeBytes(urlParameters);
                wr.flush();
            }

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
                
               if(responseCode!=200) {
                System.out.println("The Server Is Not Responding\nPlease Resolve The Issue\n");
                return;
                }
               
                URL whatsIp = new URL(url);
                String hostIp = whatsIp.getHost();
                InetAddress netIp = InetAddress.getByName(hostIp);
                String ipAddress = netIp.getHostAddress();
                System.out.println(ipAddress + " is the IP for the URL Entered.");
                
                
                StringBuffer response;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }
		
		//print result
		System.out.println(response.toString());

	}

}