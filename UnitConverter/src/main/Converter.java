package main;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        int submenu;
        boolean on = true;
        Scanner scan = new Scanner(System.in);
        String menu = "Please select an option:"
                + "\n" + "1. Cups/Teaspoons"
                + "\n" + "2. Miles/Kilometers"
                + "\n" + "3. US Gallons/Imperial Gallons"
                + "\n" + "4. Quit";
        while (on) {
        	
            System.out.println(menu);
            System.out.print(">> ");
            
            int menuSelection = scan.nextInt();

            switch(menuSelection) {
                case 1:
                    subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    convertCupsAndTeaspoons(submenu);
                    break;
                case 2:
                	subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    convertMilesAndKilometers(submenu);
                    break;
                case 3:
                	subMenu(menuSelection);
                    System.out.print("    >> ");
                    submenu = scan.nextInt();
                    convertUSAndImperialGals(submenu);
                    
                    break;
                case 4:
                	scan.close();
                    System.exit(0);
                    on = false;
                    break;
                default:
                    System.out.println("The value you entered is not valid" + "\n");
            }
        }
    }
    
    public static void subMenu(int choice) {
    	   
           String cupTea = "*********************************************************" + "\n*" + "\n*" + "    Please select the from the following conversions:"
                   + "\n*" + "    1. Cups to Teaspoons"
                   + "\n*" + "    2. Teaspoons to Cups" + "\n*" 
          			+ "\n" + "*********************************************************";

           String milesKilo = "*********************************************************" + "\n*" + "\n*" + "    Please select the from the following conversions:"
                   + "\n*" + "    1. KM to Miles"
                   + "\n*" + "    2. Miles to KM" + "\n*" 
          			+ "\n" + "*********************************************************";

           String usImp = "*********************************************************" + "\n*" + "\n*" + "    Please select the from the following conversions:"
                   + "\n*" + "    1. US Gallons to Imperial Gallons"
                   + "\n*" + "    2. Imperial Gallons to US Gallons" + "\n*" 
           			+ "\n" + "*********************************************************";
           
           if(choice == 1) {
        	   System.out.println(cupTea);
           }else if(choice == 2) {
        	   System.out.println(milesKilo);
           }else {
        	   System.out.println(usImp);
           }	
    }
    
    public static void convertCupsAndTeaspoons(int choice) {
    	Scanner scan = new Scanner(System.in);
    	double value;
    	double result;
    	switch (choice) {
        case 1:
            System.out.print("Please enter your Cup value:  ");
            value = scan.nextDouble();
            result = cupsToTeaspoons(value);
            System.out.println("Your measurement in Teaspoons is: " + result);
            break;
        case 2:
            System.out.print("Please enter your Teaspoon value:  ");
            value = scan.nextDouble();
            result = teaspoonsToCups(value);
            System.out.println("Your measurement in Cups is: " + result + "\n");
    	}
    }
    
    public static void convertMilesAndKilometers(int choice) {
    	Scanner scan = new Scanner(System.in);
    	double value;
    	double result;
    	switch (choice) {
        case 1:
            System.out.print("Please enter your KM value:  ");
            value = scan.nextDouble();
            result = kmToMiles(value);
            System.out.println("Your distance in Miles is: " + result);
            break;
        case 2:
            System.out.print("Please enter your Miles value:  ");
            value = scan.nextDouble();
            result = milesToKm(value);
            System.out.println("Your distance in KM is: " + result + "\n");
            break;
    	}
    }
    
    public static void convertUSAndImperialGals(int choice) {
    	
    	Scanner scan = new Scanner(System.in);
    	double value;
    	double result;
    	
    	switch (choice) {
        case 1:
            System.out.print("Please enter your US Gallon value:  ");
            value = scan.nextDouble();
            result = usToImp(value);
            System.out.println("That is: " + result + " Imperial Gallons." + "\n");

            break;
        case 2:
            System.out.print("Please enter your Imperial Gallon value:  ");
            value = scan.nextDouble();
            result = impToUS(value);
            System.out.println("That is: " + result + " US Gallons." + "\n");
    	}
    }

    public static double usToImp(double value) {
        double fraction = .832674;
        return value * fraction ;
    }

    public static double impToUS(double value){
        double fraction = .832674;
        return  (value / fraction);
    }
    
    public static double cupsToTeaspoons(double value) {
    	return value * 48;
    }
    
    public static double teaspoonsToCups(double value) {
    	return value / 48;
    }
    
    public static double milesToKm(double value){
        double fraction = 0.62137;
        return value / fraction;
    }

    public static double kmToMiles(double value) {
        double fraction = 0.62137;
        return value * fraction;
    }
}