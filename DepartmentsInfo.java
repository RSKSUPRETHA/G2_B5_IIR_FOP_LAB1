package b2_g5_iitr_fop_lab_1;

import java.util.Random;
	
			public class DepartmentsInfo {
	
				class Department {
					String Technical;
					String Admin;
					String HumanResource;
					String Legal;

					public Department (String Technical,String Admin,String HumanResource,String Legal)
					{
						this.Technical= Technical;
						this.Admin= Admin;
						this.HumanResource= HumanResource;
						this.Legal= Legal;
					}
					//getter and setter
				}

				public static void main(String[] args)
				{
					// TODO Auto-generated method stub
					System.out.println("Please enter the department from the following:");
					System.out.println("1. Technical:");	
					System.out.println("2. Admin:");
					System.out.println("3. HumanResource:");
					System.out.println("4. Legal:");
					System.out.println("Enter the value: 1");
					String email = "john123@Tech.com";
					System.out.println("The E-mail ID is: " + email);
					System.out.println(generatePassword(8));
					System.out.println("Enter the value: 2");
					String gmail = "neha321@Admin.com";
					System.out.println("The G-mail ID is: " + gmail);
					System.out.println(generatePassword(8));
				}
	 
				private static char[] generatePassword(int length)
				{
					String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
					String specialCharacters = "!@#$";
					String numbers = "1234567890";
					String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
					Random random = new Random();
					char[] password = new char[length];
					password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
					password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
					password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
					password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
					for(int i = 4; i< length ; i++) {
						password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
					}
					return password;
					
				}
			
		}

