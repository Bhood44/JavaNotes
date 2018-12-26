package pdmotors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {

		/******* START of Data for vehicles on the lot  ******/
		// creates car object
		Vehicle c1 = new Car("Lampadati", "Felon GT", 35000, false);
		Vehicle c2 = new Car("Obey", "9F", 72000, false);
		
		// create Vehicle object of type truck
		Vehicle t1 = new Truck("Vapid", "Contender", 50000, false);
		Vehicle t2 = new Truck("Benefactor", "Dubsta 6x6", 2500000, false);
		
		// create Vehicle object of type van
		Vehicle v1 = new Van("Vapid", "Minivan", 12000, false);
		Vehicle v2 = new Van("vapid", "Speedo", 18000, false);
		
		// create Vehicle object of type special import
		Vehicle s1 = new SpecialImport("Coil", "Rocket Voltic", 1500000, false);
		Vehicle s2 = new SpecialImport("Imponte", "Deluxo", 2500000, false);

		// create list of vehicles
		List<Vehicle> carListing = new ArrayList<Vehicle>();
		
		carListing.add(c1);
		carListing.add(c2);	// add cars
		
		carListing.add(t1);
		carListing.add(t2);	//add trucks
		
		carListing.add(v1);
		carListing.add(v2);	// add vans
		
		carListing.add(s1);
		carListing.add(s2);	// add special imports
		
		//System.out.println(carListing);
		
		/******* END of Data for vehicles on the lot  ******/
		
		/******* START of Data for sales people  ******/
		// String name, String id, Double sellQuality, int carsSold, boolean onRoster
		
		SalesPerson p1 = new SalesPerson("Michael Da Santa", "23572", 0.72, 0, true);
		SalesPerson p2 = new SalesPerson("Franklin Clinton","34696", 0.90, 0, true);
		SalesPerson p3 = new SalesPerson("Trevor Philips", "45798", 0.55, 0, true);
		
		List<SalesPerson> roster = new ArrayList<SalesPerson>();
		
		roster.add(p1);
		roster.add(p2);
		roster.add(p3);	// add sales people to set
		
		/******* END of Data for sales people  ******/
		
		/******* program functioning  ******/
		

		boolean inSession = true;	// boolean value for do while loop
		String temp = "";			// string to hold user input
//		String selectedIndex = "";		// holds index value of selected sales person
		
		System.out.println("Welcome to the Premium Deluxe Motors, what can I help with today?\n");
		Scanner sc = new Scanner(System.in);
		
		do {
		    displayMenu();
			System.out.print("Select an option: ");
		    temp = sc.next();//gets input as a String
		    System.out.print("\n\n");
		    //System.out.println(System.in.available());
		    
		    /**** MAIN CONTROL FLOW ****/
		    if(temp.equals("1")) { //checks is "1" was put in
		    	showListing(carListing);
		    	
		    	
		    } else if(temp.equals("2")) {
		    	showRoster(roster);
		    	
		    } else if(temp.equals("3")) {
		    	readReport();
		    	System.out.println("\n\n");
		    	
		    } else if(temp.equals("4")) {
		    	buyCar(roster, carListing);
		    	
		    } else if(temp.equals("5")) {
		    	System.out.println("Sorry ladies and gents I can't condone this behavior in a work place!\n");
		    	
		    } else if(temp.equals("6")) {	
		    	pdmotors.stealCar player = new pdmotors.stealCar();
		    	player.commitGTA();
		    	
		    } else if(temp.equals("q") || temp.equals("Q")) { //checks is "q" was put in
		
		    	System.out.println("Thanks for coming in to Premium Deluxe Motors today!");
		    	inSession = false;
		    	break;//ends program
		    } else {
		    	System.out.println("Please cooperate for your best interests...\n\n");
		    }
		    /**** END MAIN CONTROL FLOW ****/
			
		} while (inSession);
		sc.close();
		
		/******* program functioning  ******/

	}	/************* 		END OF MAIN		************/
	
	/*
	 * FUNCTION:   function prototype statement
	 * 
	 * ARGUMENTS:  a list of argument names and a short description
	 * 
	 * RETURNS:    VOID
	 * 
	 * NOTES:      a short paragraph stating what the function does
	 */
	public static void displayMenu() {
		
		System.out.println("Main Menu:");
        System.out.println("[1] Show current inventory.");
        System.out.println("[2] See salesperson.");
        System.out.println("[3] Print the report.");
        System.out.println("[4] Buy a car.");
        System.out.println("[5] Steal a car.");
        System.out.println("[Q] Exit program.");
        
	}	/*** END OF displayMenu METHOD ***/ 
	
	
	/*
	 * FUNCTION:   function prototype statement
	 * 
	 * ARGUMENTS:  a list of argument names and a short description
	 * 
	 * RETURNS:    VOID
	 * 
	 * NOTES:      a short paragraph stating what the function does
	 */
	public static void showListing(List<Vehicle> carList) {
		
//		String formatter = "| %-2d | %-15s | %-15s | $%.2f | %-15s |%n";
        System.out.format("+----+-----------------+-----------------+----------+------------+%n");
        System.out.printf("| #  | Make            | Model           | Price    | Status     |%n");
        System.out.format("+----+-----------------+-----------------+----------+------------+%n");
        int x = 1;
	
        
		for(Vehicle i : carList) { 	// for each instance of car in list 
			//System.out.println(i);
		
			String soldFlag = "";
			//String price = Double.toString(i.getBasePrice());
			double price = i.getBasePrice();
			
			DecimalFormat decFormatter = new DecimalFormat("$##,###,###.00");
			
			if(i.isSoldFlag() == false) {
				soldFlag = "Availiable";
			} else {
				soldFlag = "SOLD";
			}
			
//			System.out.format(formatter, i.getMake(), i.getModel(), i.getBasePrice(), soldFlag);
			System.out.println(x + "  "+ i.getMake() + " " + i.getModel() + " " + decFormatter.format(price) + " " + soldFlag);
			x++;
		}
		System.out.print("\n\n");
	}	/*** END OF showListing METHOD ***/ 
	
	/*
	 * FUNCTION:   function prototype statement
	 * 
	 * ARGUMENTS:  a list of argument names and a short description
	 * 
	 * RETURNS:    VOID
	 * 
	 * NOTES:      a short paragraph stating what the function does
	 */
	public static void showRoster(List<SalesPerson> roster) {
		
		int x = 1;
		
		System.out.println("Dealers working today: ");
		System.out.println("-------------------------------------");
		for(SalesPerson i : roster) { 	// for each instance of car in list 
		
			System.out.println("[" + x + "] " + i.getName());
			x++;
		}
		System.out.print("\n\n");
	}	/*** END OF showRoster METHOD ***/ 
		
	/*
	 * FUNCTION:   public static void buyCar(List<SalesPerson> roster, List<Vehicle> carList)
	 * 
	 * ARGUMENTS:  takes in a two collection objects; one for the list of salespeople 
	 * 			   the other for the list of vehicles
	 * 
	 * RETURNS:    VOID
	 * 
	 * NOTES:      Provides the functionality and incorporates methods to buy a car,
	 * 			   update the listing of a car be sold and then send the output file
	 */
	/***********************************************************************************************************/
	public static void buyCar(List<SalesPerson> roster, List<Vehicle> carList) {
		
		String seller = "";							// holds name of seller
		String temp1 = null, tempVar = "";			// temp strings to hold user input
		String priceVar, checkVar = "";				// fields hold needed values
		String soldPriceStr = "";					// holds price as a string 
		String totalProfitStr = "";                 // holds the days total in a string
		String filterVar = "";
		
		Integer selectedSPIndex = 0;				// holds index value of selected sales person
		Integer selectedCarIndex = 0;				// holds index value of selected of car
		Scanner sc = new Scanner(System.in);		// scanner to read input given
		
		double lPrice = 0;							// holds the lowest range price
		double enteredPrice = 0;					// holds converted input price 


		boolean inSession = true;               	// boolean value for do while loop
		boolean sold = false;						// boolean value for changing setter

		String soldMake ="";
		String soldModel ="";
		String soldMarker ="";
		int totalProfit = 0;						// fields for the output file
		
		DecimalFormat decFormatter = new DecimalFormat("$##,###,###.00");
		
		showRoster(roster);	// display the list of dealers
		
		try {	/*********************** START OF first try/catch **********************************/
			
			System.out.print("Select dealer option [1-3]: ");
			
			temp1 = sc.next();								// get input from user
			selectedSPIndex = (Integer.valueOf(temp1) - 1);	// convert input to correct index of selected dealer
			
			// with selected index have dealer show car listing
			System.out.println("\n" + roster.get(selectedSPIndex).getName()+": Here's what in our inventory.");
			showListing(carList);
			
		} catch(IndexOutOfBoundsException ie) { // find if user had wrong input
			System.out.println("Don't think that's an option pal.\n");
			buyCar(roster, carList);	
			
		} catch(NumberFormatException ne) { // find if user had wrong input
			System.out.println("Don't think that's an option pal.\n");
			buyCar(roster, carList);
			
		} /*********************** END OF first try/catch **********************************/
			
			
		try {	/*********************** START OF Second try/catch **********************************/
			
			do { /******* START of do/while loop ********/
				
				// conversion to get selected index
				selectedCarIndex = (Integer.valueOf(temp1) - 1); 
	
				try { /******* START of third try/catch  ********/
					
					System.out.print("Select a car option [1-" + carList.size() + "]: ");	// dynamically get size list
					tempVar = sc.next();													// wait for user input
					
					selectedCarIndex = (Integer.valueOf(tempVar) - 1);						// get new index
					
					// if the car is sold
					if(carList.get(selectedCarIndex).isSoldFlag() == true) {
						System.out.print(roster.get(selectedSPIndex).getName() + ": Sorry in inform you, but that vehicle has already been sold.");
						break;
					}
					
					// Ask user if they want to proceed/if right car
					System.out.print(roster.get(selectedSPIndex).getName() + ": Is the " + carList.get(selectedCarIndex).getMake() + " " + 
						  	carList.get(selectedCarIndex).getModel() + " the right car you want? (Y/N): ");
		
					tempVar = sc.next(); 													// wait for input
					
				} catch(IndexOutOfBoundsException ce) { // find if user had wrong input
					System.out.println("\n-- Select a correct option! --\n\n");
					//System.out.println(roster.get(selectedSPIndex).getName() + ": Hold on here computer's messin up here.");
					//buyCar(roster, carList);
					//break;
					
				} catch(NumberFormatException ne) { // find if user had wrong input
					System.out.println(roster.get(selectedSPIndex).getName() + ": Don't think that's an option pal.\n");
					buyCar(roster, carList);	
					
				}	/******* END of third try catch ********/
				
				if(tempVar.equalsIgnoreCase("Y")) { /****************************** START of YES option ***********************************/
					
					boolean inSale = true;
					
					/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
					System.out.println("you want to buy the car.");
					
//					do {
			
					System.out.println(roster.get(selectedSPIndex).getName() + ": Nice choice! Let's proceed to the price");
					
					// Calculate and display the price range for car
					lPrice = CalcCarRange(roster.get(selectedSPIndex).getSellQuality(), carList.get(selectedCarIndex).getBasePrice());
					
					// prompt user and wait for user input
					System.out.println("Enter a price between " + decFormatter.format(lPrice) + " - " + decFormatter.format(carList.get(selectedCarIndex).getBasePrice()) + ": ");
					System.out.println("Correct format -- [#,###,###.00]");
					System.out.print("-- $");
					priceVar = sc.next();
					
					filterVar = priceVar.replaceAll("[-+^:,]","");
					
					//System.out.println(filterVar);
					
					// convert user input to a double for calculations
					enteredPrice = Double.parseDouble(filterVar);

				
					while(enteredPrice < lPrice || enteredPrice > carList.get(selectedCarIndex).getBasePrice()) { // if the entered value is out of range
						try {
							System.out.println("\n\n" + roster.get(selectedSPIndex).getName() + ": Sorry I can't take no more or no less give me a valid offer.");
							System.out.println("Enter a price between " + decFormatter.format(lPrice) + " - " + decFormatter.format(carList.get(selectedCarIndex).getBasePrice()) + ": ");
							System.out.println("Correct format -- [#,###,###.00]");
							System.out.print("-- $");
							//priceVar = sc.next();
							
							checkVar = sc.next();//gets input as a String
							
							filterVar = checkVar.replaceAll("[-+^:,]","");
							
							enteredPrice = Double.parseDouble(filterVar);
						} catch(IllegalArgumentException ee) {
							System.out.println(roster.get(selectedSPIndex).getName() + ": Please give a offer in the valid format2.\n");
							showListing(carList);
						}
							
							// the given price range is valid the prompt user the car is sold and send it the fileIo for sales of the day
							// and move on to the paper work
						if(enteredPrice > lPrice && enteredPrice < carList.get(selectedCarIndex).getBasePrice()) {
							break;
					
						}	
					} // end of the while loop
					
					System.out.println("Need to finalize deal!");
					
//					} while(inSale);	
						
					if(enteredPrice > lPrice && enteredPrice < carList.get(selectedCarIndex).getBasePrice()) {
						
							System.out.println("IT WORKS THUS FAR!!!!");
							
							int m = 0;
							int f = 0;
							int t = 0;
							
							if(selectedSPIndex == 0) { // michael sold a car
								m += 1;
							}
							
							if(selectedSPIndex == 1) { // franklin sold a car
								f += 1;
							}
							
							if(selectedSPIndex == 2) { // trevor sold car
								t += 1;
							}
							
							carList.get(selectedCarIndex).setSoldFlag(true);
							carList.get(selectedCarIndex).setBasePrice(enteredPrice);
							
							
							soldMake = carList.get(selectedCarIndex).getMake();
							soldModel = carList.get(selectedCarIndex).getModel();
							
							if(carList.get(selectedCarIndex).isSoldFlag() == true) {
								soldMarker =" SOLD ";
							}
							
							soldPriceStr = Double.toString(enteredPrice);
							seller = roster.get(selectedSPIndex).getName();
							
							totalProfit += enteredPrice;
							
							totalProfitStr = Double.toString(totalProfit);
							
							// then get and send fields to file for write
							System.out.println(seller + " has sold the " + soldMake + " " + soldModel + " for " + "$" + soldPriceStr);	
							System.out.println("\n\n\nToday's total profit: " + totalProfitStr);
					
							/************************************** CREATE file *******************************************/
							
							
							
							/************************************** CREATE file *******************************************/
							
							/************************************** WRITE to file *******************************************/
							
							try {
								BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Benjamin\\Desktop\\projectOut.txt"));
								writer.write(seller + " has sold the " + soldMake + " " + soldModel + " for " + "$" + soldPriceStr);
								
								writer.write("\n\nTotal Sold: " + totalProfitStr);
								
								writer.write("\n\nTotal Car(s) Sold per Dealer");
								writer.write("\n------------------------------\n");
								writer.write("\n" + roster.get(0).getName() + ": " + m );
								writer.write("\n" +roster.get(1).getName() + ": " + f );
								writer.write("\n" +roster.get(2).getName() + ": " + t );
								
								writer.close();
								
							} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
								System.out.println(seller + ": Print it again the printer is out of ink!");
							} catch (IOException e) {
							// TODO Auto-generated catch block
								System.out.println(seller + ": where's that IT guy we just hired!");
							}
							
							/************************************** WRITE to file *******************************************/
							
							/************************************** READ from file *******************************************/
							
							readReport();
							
							/************************************** READ from file *******************************************/
							
					}
					
					break;
					
					/****************************** END of YES option ***********************************/	
				} else if (tempVar.equalsIgnoreCase("N")) { /****************************** START of NO option ***********************************/
					System.out.println(roster.get(selectedSPIndex).getName() + ": Oh.. well take your time and come find me.");
					showListing(carList);
					//break;
				}
				 
				else { /****************************** START of wrong option ***********************************/
//					System.out.println(roster.get(selectedSPIndex).getName() + ": Look do you want a car or not?\n");
					System.out.println(roster.get(selectedSPIndex).getName() + ": Take your time and have a look around.\n");
//					buyCar(roster, carList);
					showListing(carList);
					//break;
				}
				
				
			} while(inSession); /******* END of do/while loop ********/
			
		} catch (IndexOutOfBoundsException e){
			System.out.println("\n-- Select a correct option! --\n\n");
		
		} catch(NumberFormatException ne) { // find if user had wrong input
			System.out.println("\n-- Select a correct option! --\n\n");
			//buyCar(roster, carList);	
			
		} /*********************** END OF Second try/catch **********************************/
		System.out.print("\n\n");
		 
	}	/*** END OF buyCar METHOD ***/ 
	
	/***********************************************************************************************************/

	
	
	/*
	 * FUNCTION:   public static double CalcCarRange(double sellQuality, double carPrice)
	 * 
	 * ARGUMENTS:  takes in two doubles; one is the salesperson salesQuality
	 * 			   and the other is the price of the car
	 * 
	 * RETURNS:    a double with the calculated price for the lowest value of the range
	 * 
	 * NOTES:      a method that is able to calculate the lowest value for the price range
	 * 			   of a car depending on which dealer or seller it is.
	 */
	public static double CalcCarRange(double sellQuality, double carPrice) {


		double sq = sellQuality;
		double cp = carPrice;
		
		double x = 0;
		
		x = (sq * cp);
		
		return x;
	}	/*** END OF CalcCarRange METHOD ***/ 	

	
	/*
	 * FUNCTION:   readReport()
	 * 
	 * ARGUMENTS:  None.
	 * 
	 * RETURNS:    VOID
	 * 
	 * NOTES:      method displays what's sold from the day with the total
	 */
	public static void readReport() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Benjamin\\Desktop\\projectOut.txt"));
			
			while(true) {
				
				String s = reader.readLine();
				
				if(s == null) {
					break;
				}
				
				System.out.println(s);
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}