package com.karo.service.impl;

import com.karo.service.School;

public class SchoolImpl implements School {

	private String name;

	public SchoolImpl(String name, String address) {
		this.name = name;
		this.address = address;
	}

	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SchoolImpl{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
