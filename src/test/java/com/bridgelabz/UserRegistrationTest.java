package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    /**
     * Unit test for validating first name
     */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Vanna");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("vanna");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating last name
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Singh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("singh");
        Assert.assertEquals(false, result);

    }
    /**
     * Unit test for validating email address
     */
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc@gmail.com.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating format of mobile number
     */
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 7844999888");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 7844999888");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating password with minimum 8 character
     */
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("password");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("psw@");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating password with atleast one upper case
     */
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("passWord");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("psw@");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating password with atleast one numeric number
     */
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("123Aab123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("123456789");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating password with exactly one special character
     */
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule4("1234@Abc");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule4("akdj@ds@A");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating email sequence
     */
    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating mood of the User
     */
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }
    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}