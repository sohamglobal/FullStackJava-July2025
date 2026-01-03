package com.sharayu.programs;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BasicGenAIResponse {
	
	public static void main(String[] args) {
		
		try
		{
			String API_KEY="";
			String END_POINT="https://api.openai.com/v1/chat/completions";
			
			String requestBody="""
					{
					"model":"gpt-5",
					"messages":[{"role":"user","content":"My cholesterol level is 219 and i want to reduce to 150 in 1 month. suggest me diet and workout plan"}]
					}
					""";
			
			HttpRequest request=HttpRequest.newBuilder()
					.uri(URI.create(END_POINT))
					.header("Content-Type", "application/json")
					.header("Authorization", "Bearer "+API_KEY)
					.POST(HttpRequest.BodyPublishers.ofString(requestBody))
					.build();
			
			HttpClient client=HttpClient.newHttpClient();
			HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Response from AI -");
			System.out.println(response.body());
			
		}
		catch(Exception e)
		{
			System.out.println("Error calling AI API");
			System.out.println(e);
		}
	}

}
