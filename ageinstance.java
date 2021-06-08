import java.io.*;
import java.util.*;

public class ageinstance {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld()
    {
        if (age < 13)
        {
            System.out.println("You are young...");   
        }
        else if (age >= 13 && age < 18)
        {
            System.out.println("You are a teenager...");
	    }
        else 
        {
            System.out.println("You are old...");
        }
	public void yearPasses() {
  		// Increment this person's age.
	}

	public static void main(String[] args) {