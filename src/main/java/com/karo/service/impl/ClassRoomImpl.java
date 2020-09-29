package com.karo.service.impl;

import com.karo.service.ClassRoom;

public class ClassRoomImpl implements ClassRoom {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassRoomImpl{" +
				"name='" + name + '\'' +
				'}';
	}
}
