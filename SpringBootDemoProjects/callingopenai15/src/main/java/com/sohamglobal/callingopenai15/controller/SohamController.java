package com.sohamglobal.callingopenai15.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.callingopenai15.airesponse.OpenAIResponse;

@RestController
@RequestMapping("/ai")
public class SohamController {
	
	@Value("${api_key}")
	private String API_KEY;
	
	@GetMapping("/test")
	public String test()
	{
		return "spring boot open ai tested ok";
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/call")
	public OpenAIResponse callOpenAIAPI(@RequestBody OpenAIResponse obj)
	{
		try
		{
			String END_POINT="https://api.openai.com/v1/chat/completions";
			
			JSONObject message=new JSONObject()
					.put("role", "user")
					.put("content", obj.getPrompt());
			
			JSONObject requestJson=new JSONObject()
					.put("model", "gpt-5")
					.append("messages", message);
			
			String requestBody=requestJson.toString();
			
			HttpRequest request=HttpRequest.newBuilder()
					.uri(URI.create(END_POINT))
					.header("Content-Type", "application/json")
					.header("Authorization", "Bearer "+API_KEY)
					.POST(HttpRequest.BodyPublishers.ofString(requestBody))
					.build();
			
			HttpClient client=HttpClient.newHttpClient();
			
			HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
			
			JSONObject jobj=new JSONObject(response.body());
			String AI_RESPONSE=jobj.getJSONArray("choices")
					.getJSONObject(0)
					.getJSONObject("message")
					.getString("content");
			
			obj.setResponse(AI_RESPONSE);
			
		}
		catch(Exception e)
		{
			obj.setResponse("failed to call open ai api");
		}
		return obj;
	}
}
