package com.luv2code.springdemo.mvc;

import com.luv2code.springdemo.mvc.validation.CourseCode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

	private String firstName;

	@NotNull(message= "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@NotNull(message= "is required")
	@Min(value = 0, message= "must be less than or equal to 0")
	@Max(value = 10, message= "must be less than or equal to 10")
	private Integer freePasses;

	@Pattern(regexp = "^[1-9]{5}", message= "only 5 digits")
	private String postalCode;

	@CourseCode(value = { "LUV", "TOPS" }, message= "must start with TOPS or LUV")
	private String courseCode;
}