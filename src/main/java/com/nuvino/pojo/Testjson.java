package com.nuvino.pojo;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Testjson {

	public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String testJson = "{\n" + 
        		"    \"censored-content\": \"hello $$$$ world\"\n" + 
        		"}";
        User readValue = mapper.readValue(testJson, User.class);
        System.out.println("readValue = " + readValue);
    }
}
