package com.nuvino.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BINLookUpResponsePojo {
	
	String country;
	
	@JsonProperty("country-code")
	String countrycode;
	
	@JsonProperty("card-brand")
	String Cardbrand;
	
	@JsonProperty("card-category")
	String cardcategory;
	
	@JsonProperty("is-commercial")
	Boolean iscommercial;
	
	String issuer;
	
	@JsonProperty("issuer-website")
	String issuerwebsite;
	
	Boolean valid;
	
	@JsonProperty("card-type")
	String cardtype;
	
	@JsonProperty("is-prepaid")
	Boolean isprepaid;
	
	@JsonProperty("issuer-phone")
	String issuerphone;
	
	@JsonProperty("currency-code")
	String currencycode;
	
	@JsonProperty("country-code3")
	String countrycode3;
	
	@JsonProperty("ip-Blocklisted")
	Boolean ipBlocklisted;
	
	@JsonProperty("ip-Blocklists")
	ArrayList <String> ipBlocklists;
	
	@JsonProperty("ip-City")
	String ipCity;
	
	@JsonProperty("ip-Country")
	String ipCountry;
	
	@JsonProperty("ip-CountryCode")
	String ipCountryCode;
	
	@JsonProperty("ip-Region")
	String ipRegion;
	
	@JsonProperty("ip-matche-bin")
	Boolean ipMatchesBin;
	
	@JsonProperty("ip-country-code3")
	String ipCountryCode3;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCardbrand() {
		return Cardbrand;
	}

	public void setCardbrand(String cardbrand) {
		Cardbrand = cardbrand;
	}

	public Boolean getIscommercial() {
		return iscommercial;
	}

	public void setIscommercial(Boolean iscommercial) {
		this.iscommercial = iscommercial;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuerwebsite() {
		return issuerwebsite;
	}

	public void setIssuerwebsite(String issuerwebsite) {
		this.issuerwebsite = issuerwebsite;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public Boolean getIsprepaid() {
		return isprepaid;
	}

	public void setIsprepaid(Boolean isprepaid) {
		this.isprepaid = isprepaid;
	}

	public String getIssuerphone() {
		return issuerphone;
	}

	public void setIssuerphone(String issuerphone) {
		this.issuerphone = issuerphone;
	}

	public String getCurrencycode() {
		return currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getCountrycode3() {
		return countrycode3;
	}

	public void setCountrycode3(String countrycode3) {
		this.countrycode3 = countrycode3;
	}

	public Boolean getIpBlocklisted() {
		return ipBlocklisted;
	}

	public void setIpBlocklisted(Boolean ipBlocklisted) {
		this.ipBlocklisted = ipBlocklisted;
	}

	public ArrayList<String> getIpBlocklists() {
		return ipBlocklists;
	}

	public void setIpBlocklists(ArrayList<String> ipBlocklists) {
		this.ipBlocklists = ipBlocklists;
	}

	public String getIpCity() {
		return ipCity;
	}

	public void setIpCity(String ipCity) {
		this.ipCity = ipCity;
	}

	public String getIpCountry() {
		return ipCountry;
	}

	public void setIpCountry(String ipCountry) {
		this.ipCountry = ipCountry;
	}

	public String getIpCountryCode() {
		return ipCountryCode;
	}

	public void setIpCountryCode(String ipCountryCode) {
		this.ipCountryCode = ipCountryCode;
	}

	public String getIpRegion() {
		return ipRegion;
	}

	public void setIpRegion(String ipRegion) {
		this.ipRegion = ipRegion;
	}

	public Boolean getIpMatchesBin() {
		return ipMatchesBin;
	}

	public void setIpMatchesBin(Boolean ipMatchesBin) {
		this.ipMatchesBin = ipMatchesBin;
	}

	public String getIpCountryCode3() {
		return ipCountryCode3;
	}

	public void setIpCountryCode3(String ipCountryCode3) {
		this.ipCountryCode3 = ipCountryCode3;
	}

	public String getCardcategory() {
		return cardcategory;
	}

	public void setCardcategory(String cardcategory) {
		this.cardcategory = cardcategory;
	}
	
	
	
}
