package com.nuvino.pojo;

import com.google.gson.JsonObject;

public class Badtext {
	
	
	private String key1;
	private String value1;
	private String key2;
	private String value2;
	private JsonObject samplejson;
	
	
	public String getKey1() {
		return key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public  String createjson() {
		 samplejson = new JsonObject();
		 samplejson.addProperty(key1, value1);
		 samplejson.addProperty(key2, value2);
		 return samplejson.toString();
	}
}
