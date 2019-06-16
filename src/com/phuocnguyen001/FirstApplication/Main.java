package com.phuocnguyen001.FirstApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		Person person;
		String jsonString = "{\"name\": \"PhuocNguyen\", \"age\": 21, \"id\":1} ";
		/*
		 * Create g-son object using GsonBuilder
		 */
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();/* set pretty style */
		Gson gson = gsonBuilder.create();
		/*
		 * Deserialize JSON to Object. Use fromJson() method to get the Object from the
		 * JSON. Pass J-son string / source of J-son string and object type as
		 * parameter.
		 */
		person = gson.fromJson(jsonString, Person.class);
		System.out.println(person.toString());
		/*
		 * Serialize Object to JSON. Use toJson() method to get the JSON string
		 * representation of an object.
		 */
		jsonString = gson.toJson(person);
		System.out.println(jsonString);
	}

}
