package com.bidkraft.model;

import java.util.List;
import java.util.Map;

public class KraftRequest {
	
	private String masterKey;
	private List<String> addons;
	private Map<String,Object> entities;
	
	public String getMasterKey() {
		return masterKey;
	}
	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}
	public List<String> getAddons() {
		return addons;
	}
	public void setAddons(List<String> addons) {
		this.addons = addons;
	}
	public Map<String, Object> getEntities() {
		return entities;
	}
	public void setEntities(Map<String, Object> entities) {
		this.entities = entities;
	}
}
