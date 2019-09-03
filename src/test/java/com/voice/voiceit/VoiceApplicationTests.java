package com.voice.voiceit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VoiceApplicationTests {

	@Test
	void contextLoads() {
	}


	private String apiKey = "key_da7ac07971094b4b911a7c88839c1ef0";

	private String apiToken = "tok_54e1005681494d81bf476f6c4a33bf89";
	@Test
	public void getUser(){
		VoiceItUtil vu = new VoiceItUtil(apiKey,apiToken);
		System.out.println(vu.createUser());
	}

}
