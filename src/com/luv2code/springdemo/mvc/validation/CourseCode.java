package com.luv2code.springdemo.mvc.validation;



import javax.validation.Constraint;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Constraint(validatedBy= CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD, LOCAL_VARIABLE })
public @interface CourseCode {
	public String[] value() default { "LUV" };
	public String message() default "must start with LUV";
	Class<?>[] groups() default {};
	Class<?>[] payload() default {};
}
