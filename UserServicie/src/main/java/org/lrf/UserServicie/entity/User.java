package org.lrf.UserServicie.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -7810550657601685531L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
