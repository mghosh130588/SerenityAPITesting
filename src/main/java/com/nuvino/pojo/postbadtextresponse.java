package com.nuvino.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class postbadtextresponse {
	
	@JsonProperty("bad-words-list")
	List<String> badWordsList;
	@JsonProperty("bad-words-total")
	int badWordsTotal;
	@JsonProperty("censored-content")
	String censoredContent;
	@JsonProperty("is-bad")
	boolean isBad;
	public List<String> getBadWordsList() {
		return badWordsList;
	}
	public void setBadWordsList(List<String> badWordsList) {
		this.badWordsList = badWordsList;
	}
	public int getBadWordsTotal() {
		return badWordsTotal;
	}
	public void setBadWordsTotal(int badWordsTotal) {
		this.badWordsTotal = badWordsTotal;
	}
	public String getCensoredContent() {
		return censoredContent;
	}
	public void setCensoredContent(String censoredContent) {
		this.censoredContent = censoredContent;
	}
	public boolean isBad() {
		return isBad;
	}
	public void setBad(boolean isBad) {
		this.isBad = isBad;
	}
	
	
	
}
