package com.bridgelab.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidation {

	public String email;
	public boolean expectedResult;

	public EmailValidation(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc-100@abc.net", true }, { "abc.100@abc.com.au", true },
				{ "abc@1.com", true }, { "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
	}

	@Test
	public void whenGivenEmailListShouldReturnResultAccordingToTheCondition() {
		UserValidation validator = new UserValidation();
		Boolean result = validator.emailValidator(this.email);
		assertEquals(this.expectedResult, result);
	}
}
