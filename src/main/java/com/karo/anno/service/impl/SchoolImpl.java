package com.karo.anno.service.impl;

import com.karo.anno.service.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class SchoolImpl implements School {

	@Value("森林大学")
	private String name;

	@Value("1037")
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
