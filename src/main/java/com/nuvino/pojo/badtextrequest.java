package com.nuvino.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class badtextrequest {
	
	@JsonProperty("content")
	String content;
	@JsonProperty("censor-character")
	String censorcharacter;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCensorcharacter() {
		return censorcharacter;
	}
	public void setCensorcharacter(String censorcharacter) {
		this.censorcharacter = censorcharacter;
	}
	
	

}
