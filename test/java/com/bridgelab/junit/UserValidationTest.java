package com.bridgelab.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserValidationTest {

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("Amit");

		assertTrue(result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("AMit");

		assertTrue(result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest3() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("amit");
		assertFalse(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("Sisodiya");
		assertTrue(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest2() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("SIsodiya");
		assertTrue(result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest3() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.firstNameValidator("sisodiya");
		assertFalse(result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.mobileNumberValidator("91 8097177781");
		assertTrue(result);
	}

	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest1() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("amitsisodiya@gmail.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.passwordValidation("Amit5@sisodiya");
		assertTrue(result);
	}

	@Test
	public void whenEnteredFirstValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@yahoo.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredSecondValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc-100@yahoo.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredThirdValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc.100@yahoo.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredFourthValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc-100@abc.net");
		assertTrue(result);
	}

	@Test
	public void whenEnteredFifthValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc.100@abc.com.au");
		assertTrue(result);
	}

	@Test
	public void whenEnteredSixthValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@1.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredEighthValidEmailShouldPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc+100@gmail.com");
		assertTrue(result);
	}

	@Test
	public void whenEnteredFirstInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc");
		assertFalse(result);
	}

	@Test
	public void whenEnteredSecondInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@.com.my");
		assertFalse(result);
	}

	@Test
	public void whenEnteredFouthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc123@.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredFifthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc123@.com.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredSixthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator(".abc@abc.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredSeventhInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc()*@gmail.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredEighthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@%*.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredEleventhInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@abc@gmail.com");
		assertFalse(result);
	}

	@Test
	public void whenEnteredTwelvethInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@gmail.com.1a");
		assertFalse(result);
	}

	@Test
	public void whenEnteredThirteenthInValidEmailShouldReturnFalseAndPassTheEmailTest() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator("abc@gmail.com.aa.au");
		assertFalse(result);
	}
}
