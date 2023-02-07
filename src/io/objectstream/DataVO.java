package io.objectstream;

import java.io.Serializable;

// 스트림을 통과하는 객체는 반드시 직렬화 필요

public class DataVO implements Serializable{
	String name;
	int age;
	double height;
	char bloodType;
	
	public DataVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataVO(String name, int age, double height, char bloodType) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.bloodType = bloodType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getBloodType() {
		return bloodType;
	}
	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}
	
	
	
	
}
