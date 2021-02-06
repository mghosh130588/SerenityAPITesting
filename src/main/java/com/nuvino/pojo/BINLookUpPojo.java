package com.nuvino.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BINLookUpPojo {
	

	@JsonProperty("bin-number")
	String bin;

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

}
