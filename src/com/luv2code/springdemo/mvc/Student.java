package com.luv2code.springdemo.mvc;

import lombok.Data;
import java.util.LinkedHashMap;

@Data
public class Student {
	private String FirstName;
	private String LastName;
	private String country;
	private String favoriteLanguage;

	private String[] operatingSystems;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private LinkedHashMap<String, String> operatingSystemOptions;
	public Student() {
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United State of America");

		// populate favorite language options
		favoriteLanguageOptions = new LinkedHashMap<>();

		// parameter order: value, display label
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");

		// populate favorite language options
		operatingSystemOptions = new LinkedHashMap<>();

		// parameter order: value, display label
		operatingSystemOptions.put("Linux", "Linux");
		operatingSystemOptions.put("Mac OS", "Mac OS");
		operatingSystemOptions.put("MS Windows", "MS Windows");
		operatingSystemOptions.put("Cent OS", "Cent OS");
	}
}