package com.nuvino.pojo;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;




	class User {
		@JsonProperty("censored-content")
	    private String censoredcontent;
	    //private String lastName;

	    public String getCensoredcontent() {
			return censoredcontent;
		}

		public void setCensoredcontent(String censoredcontent) {
			this.censoredcontent = censoredcontent;
		}

			    @Override
	    public String toString() {
	        return "MyObject{" +
	                "censored-content='" + censoredcontent + '\'' +
	                '}';
	    }
	}

