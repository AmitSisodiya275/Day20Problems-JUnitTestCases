package com.bridgelab.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserValidationTest {

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("Amit");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("Sisodiya");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.mobileNumberValidator("91 8097177781");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("amitsisodiya@gmail.com");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.passwordValidation("Amit5@sisodiya");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("amit");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("sisodiya");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.mobileNumberValidator("91-8097177781");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("amitsisodiya@.gmail.com");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.passwordValidation("amit.");
		assertEquals("Sad Test Case", true, result);
	}
}
