package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


        public class UserRegistration {
            public static final Scanner scanner = new Scanner(System.in);
            /*
            Created a method to validate first name
             */
            public static void validFirstName(){
                System.out.print("Enter the First Name : ");
                String name = scanner.next();
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(name);
                boolean r = m.matches();
                if (r)
                    System.out.println("First name is valid");
                else
                    System.out.println("First name is !Invalid");
            }
            /*
            Created a method to validate last name
             */
            public static void validLastName(){
                System.out.print("Enter the Last Name : ");
                String lname = scanner.next();

                String regex1 = "^[A-Z]{1}[a-z]{2,}$";

                Pattern p1 = Pattern.compile(regex1);
                Matcher m1 = p1.matcher(lname);
                boolean r1 = m1.matches();
                if (r1)
                    System.out.println("Last name is Valid");
                else
                    System.out.println("Last name is Invalid");
            }
            /*
            Created a method to validate Email Address
             */
            public static void validEmailId(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the Email Address : ");
                String email = scanner.next();
                String regex2 = "^[a-zA-Z]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
                Pattern p2 = Pattern.compile(regex2);
                Matcher m2 = p2.matcher(email);
                boolean r2 = m2.matches();
                if (r2)
                    System.out.println("Email Address is Valid");
                else
                    System.out.println("Email Address is Invalid");
            }
            /*
             Created a method to enter a valid mobile number
             */
            public static void validMobileNumber(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your mobile number : ");
                String phoneNo = scanner.nextLine();
                String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
                Pattern p3 = Pattern.compile(regex3);
                Matcher m3 = p3.matcher(phoneNo);
                boolean r3 = m3.matches();
                if (r3)
                    System.out.println("Phone number is Valid");
                else
                    System.out.println("Phone number is Invalid");
            }
            /*
             Created a method to enter valid Password according to rule 1
             It should have minimum 8 characters
             */
            public static void validPassRule1(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the Password according to rule 1 : ");
                String passWord = scanner.nextLine();
                String regex4 = "^[A-Z a-z 0-9]{8,}$";
                Pattern p4 = Pattern.compile(regex4);
                Matcher m4 = p4.matcher(passWord);
                boolean r4 = m4.matches();
                if (r4)
                    System.out.println("Password is Valid");
                else
                    System.out.println("Password is Invalid");
            }
            /*
            Created a method to enter valid Password according to rule 2
            It should have atleast one Upper Case
            */
            public static void validPassRule2(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the Password according to rule 2 : ");
                String passWord1 = scanner.nextLine();
                String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{8,}$";
                Pattern p5 = Pattern.compile(regex5);
                Matcher m5 = p5.matcher(passWord1);
                boolean r5 = m5.matches();
                if (r5)
                    System.out.println("Password is Valid");
                else
                    System.out.println("Password is Invalid");
            }
            /*
             Created a method to enter valid Password according to rule 3
             It should have atleast one number in the password
             */
            public static void validPassRule3(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the PassWord");
                String passWord2 = scanner.nextLine();
                String regex6 = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
                Pattern p6 = Pattern.compile(regex6);
                Matcher m6 = p6.matcher(passWord2);
                boolean r6 = m6.matches();
                if (r6)
                    System.out.println("Password is Valid");
                else
                    System.out.println("Password is Invalid");
            }
            /*
             Created a method to enter valid Password according to rule 4
             It should have atleast one special character
             */
            public static void validPassRule4(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the PassWord : ");
                String passWord2 = scanner.next();
                String regex6 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z](?=.*[*.@#$%&!~<>_.+\|].{10,}$";
                Pattern p6 = Pattern.compile(regex6);
                Matcher m6 = p6.matcher(passWord2);
                boolean r6 = m6.matches();
                if (r6)
                    System.out.println("Password is Valid");
                else
                    System.out.println("Password is Invalid");
            }
        }

