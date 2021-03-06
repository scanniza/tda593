package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import HotelManagementClassDiagram.*;
import HotelManagementClassDiagram.impl.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * @generated NOT
 */
public class Main {
	
	static final String CLI_EXIT_COMMAND = "exit";
	static final String CLI_HELP_COMMAND = "help";
	static final String CLI_CHECKIN_COMMAND = "checkin";
	static final String CLI_CHECKOUT_COMMAND = "checkout";
	static final String CLI_BOOK_A_ROOM_COMMAND = "book";
	static final String CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND = "browse";
	static final String CLI_LIST_BOOKINGS_COMMAND = "listbookings";
	static final String CLI_LIST_CUSTOMERS_COMMAND = "listcustomers";
	static final String CLI_ADD_ROOM_COMMAND = "addroom";
	static final String CLI_ADD_ADDON_COMMAND = "addaddon";
	static final String CLI_ADD_EXTRA_COMMAND = "addextra";
	static final String CLI_ADD_DISCOUNT_COMMAND = "adddiscount";

    private static Employee user;
	
	public static void main(String[] args) {
        // Generate the fake data for testing
		generateFakeData();
		Hotel myHotel = new HotelImpl("C-R-A-P hotel");
		Scanner reader = new Scanner(System.in);
		
		String command ="";
		System.out.println("Welcome to " + myHotel.getName() + ".");

        while (user == null)
        {
            user = login(reader, myHotel);
            if (user == null)
                System.out.println("Login failed");
        }

        System.out.println("###############################");
        System.out.println("Logged in as " + user.getName());
        System.out.println("###############################");
        System.out.println();

        // Retrieve all controllers
        BookingController bookingController = myHotel.getBookingController();
        ManagementController managementController = myHotel.getManagementController();

		do{
			switch(command){
				case CLI_HELP_COMMAND:
					printHelp();
					break;
					
				case CLI_CHECKIN_COMMAND:
					checkIn(reader, bookingController);
					break;
					
				case CLI_CHECKOUT_COMMAND:
					checkOut(reader, bookingController);
					break;
					
				case CLI_BOOK_A_ROOM_COMMAND:
					bookARoom(reader, bookingController);
					break;
				case CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND:
					searchAvailableRoomTypes(reader, bookingController);
					break;
					
				case CLI_LIST_BOOKINGS_COMMAND:
					listBookings(bookingController);
					break;
					
				case CLI_LIST_CUSTOMERS_COMMAND:
					listCustomers(reader, bookingController);
					break;
					
				case CLI_ADD_ROOM_COMMAND:
					addRoom(reader, managementController);
					break;
					
				case CLI_ADD_ADDON_COMMAND:
					addAddon(reader, managementController);
					break;
					
				case CLI_ADD_EXTRA_COMMAND:
					addExtra(reader, managementController);
					break;
					
				case CLI_ADD_DISCOUNT_COMMAND:
					addDiscount(reader, managementController);
					break;
				
				default:
					System.out.println("Enter " + CLI_HELP_COMMAND + " for a list of commands.");
					System.out.println("Enter " + CLI_EXIT_COMMAND + " to exit.");
					System.out.println("Choose an option: ");
					break;
			}
			command = reader.nextLine();
		}while(!command.equalsIgnoreCase(CLI_EXIT_COMMAND));

	}

    public static Employee login(Scanner reader, Hotel hotel){
        try{
            System.out.println("####### Login #######");
            System.out.print("Social Security Number: ");
            String ssn = reader.nextLine();
            System.out.print("Password: ");
            String pw = reader.nextLine();
            return hotel.logIn(ssn, pw);
        }catch(Exception ex) {
            System.out.println("Login process exited: " + 405);
        }
        return null;
    }

	private static void addDiscount(Scanner reader, ManagementController managementController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 9) {
            System.out.println("Unallowed access");
            return;
        }
		try{
            System.out.println("###### Create discount #######");
            System.out.print("Name: ");
            String name = reader.nextLine();
            System.out.print("Percentage? Y/N: ");
            String yesno = reader.nextLine();
            boolean isPercentage = false;
            if (yesno.equals("Y"))
                isPercentage = true;
            if (isPercentage)
                System.out.print("Percentage (0-100): ");
            else
                System.out.print("Value: ");
            double value = reader.nextDouble();
            reader.nextLine();
            Discount d = new DiscountImpl(name, isPercentage, value);
            managementController.updateOrAddDiscount(d);
            System.out.println("###############################");
        }catch(Exception ex) {
            System.out.println("Add discount process exited: " + 410);
        }
        System.out.println();
	}

	private static void addExtra(Scanner reader, ManagementController managementController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 9) {
            System.out.println("Unallowed access");
            return;
        }
        try{
	        System.out.println("Whats the name of the extra?");
	        String name = reader.nextLine();
	        System.out.println("Type the description of the extra:");
	        String desc = reader.nextLine();
	        managementController.updateOrAddExtra(new ExtraImpl(name, desc));
        }catch(Exception ex) {
            System.out.println("Add extra process exited: " + 409);
        }
	}

	private static void addAddon(Scanner reader, ManagementController managementController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 9) {
            System.out.println("Unallowed access");
            return;
        }
        try{
			System.out.println("What the name of the addon?");
	        String name = reader.nextLine();
	        System.out.println("What the description of the addon?");
	        String desc = reader.nextLine();
	        System.out.println("What should the price be?");
	        double price = reader.nextDouble();
            reader.nextLine();
	        managementController.updateOrAddAddon(new AddonImpl(name, desc, price));
        }catch(Exception ex) {
            System.out.println("Add addon process exited: " + 408);
        }
	}

	private static void addRoom(Scanner reader, ManagementController managementController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 9) {
            System.out.println("Unallowed access");
            return;
        }
        try{
        	System.out.println("Please enter max number of people: ");
        	int maxNbrPeople = reader.nextInt();
            reader.nextLine();
        	System.out.println("Please enter room number: ");
        	int roomNumber = reader.nextInt();
            reader.nextLine();
        	System.out.println("Please enter size (m2): ");
        	int size = reader.nextInt();
            reader.nextLine();
        	System.out.println("Please enter room type: ");
        	RoomType type = RoomType.valueOf(reader.nextLine());
        	Room newRoom = new RoomImpl(maxNbrPeople, roomNumber, size, type);
        	managementController.updateOrAddRoom(newRoom);
        	System.out.println("Room created.");
        }catch(Exception ex) {
            System.out.println("Add room process exited: " + 407);
        }
	}

	private static void listCustomers(Scanner reader, BookingController bookingController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
	        for(Customer c : bookingController.getAllCustomers() ) {
		        System.out.println(c.toString());
	        }
        }catch(Exception ex) {
            System.out.println("List customer process exited: " + 406);
        }
	}

	private static void listBookings(BookingController bookingController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
            System.out.println("######### List of bookings #######");
            for (Booking b : bookingController.getAllBookings()) {
                System.out.println(b);
            }
            System.out.println("##################################");
        }catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("List bookings process exited: " + 411);
        }
	}

	public static void printHelp() {
		System.out.println();
		System.out.println("HELP - List of commands.");
		System.out.println("##########################");
        if (user != null && user.getEmployeeType().getAcessLevel() >= 4) {
            System.out.println(CLI_BOOK_A_ROOM_COMMAND + " - book a room");
            System.out.println(CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND + " - browse available room types");
            System.out.println(CLI_CHECKIN_COMMAND + " - check in a booking");
            System.out.println(CLI_CHECKOUT_COMMAND + " - check out a booking");
            System.out.println(CLI_LIST_BOOKINGS_COMMAND + " - exit the program");
            System.out.println(CLI_LIST_CUSTOMERS_COMMAND + " - exit the program");
        }
        if (user != null && user.getEmployeeType().getAcessLevel() >= 9) {
            System.out.println(CLI_ADD_ROOM_COMMAND + " - exit the program");
            System.out.println(CLI_ADD_ADDON_COMMAND + " - exit the program");
            System.out.println(CLI_ADD_EXTRA_COMMAND + " - exit the program");
            System.out.println(CLI_ADD_DISCOUNT_COMMAND + " - exit the program");
        }
        System.out.println(CLI_HELP_COMMAND + " - show list of commands");
		System.out.println(CLI_EXIT_COMMAND + " - exit the program");
		System.out.println();
		System.out.print("Choose an option: ");
	}

	public static void bookARoom(Scanner reader, BookingController bookingController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
            System.out.print("Please enter start date (YYYY-MM-DD): ");
            String startDateString = reader.nextLine();

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = null, endDate = null;
            try {
                startDate = formatter.parse(startDateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.print("Please enter end date (YYYY-MM-DD): ");
            String endDateString = reader.nextLine();
            try {
                endDate = formatter.parse(endDateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Please enter number of adults: ");
            int nbrOfAdults = reader.nextInt();
            reader.nextLine();
            System.out.println("Please enter number of children: ");
            int nbrOfChildren = reader.nextInt();
            reader.nextLine();

            EList<RoomType> avaliableRoomTypes = bookingController.searchAvailableRoomTypes(startDate, endDate, nbrOfAdults, nbrOfChildren);
            System.out.println();
            System.out.println("Avaliable room types in the selected interval:");
            for (RoomType type : avaliableRoomTypes) {
                System.out.println(type.toString());
            }

            System.out.println("");
            System.out.println("How many rooms? ");
            int nbrOfRooms = reader.nextInt();
            reader.nextLine();
            BasicEList<RoomType> types = new BasicEList<RoomType>();
            for (int i = 0; i < nbrOfRooms; i++) {
                System.out.println("Please select type for room " + (i+1) + ": ");
                String typeString = reader.nextLine();
                try{
                    types.add(RoomType.valueOf(typeString.toUpperCase()));
                }catch (IllegalArgumentException ignored){}
            }

            System.out.println("Please enter customer social security number: ");
            String SSN = reader.nextLine();

            Customer customer = bookingController.getCustomer(SSN);
            if (customer == null) {
                System.out.println("Customer does not exist in DB. \nPlease enter name: ");
                String name = reader.nextLine();
                System.out.println("Please enter phone number: ");
                String phoneNumber = reader.nextLine();
                System.out.println("Please enter street: ");
                String street = reader.nextLine();
                System.out.println("Please enter city: ");
                String city = reader.nextLine();
                System.out.println("Please enter postal code: ");
                String postalCode = reader.nextLine();
                System.out.println("Please enter country: ");
                String country = reader.nextLine();
                System.out.println("Please enter gender: ");
                String gender = reader.nextLine();
                System.out.println("Please enter title: ");
                String title = reader.nextLine();

                customer = new CustomerImpl(name, city, country, gender, phoneNumber, postalCode, SSN, street, title);
                bookingController.updateOrAddCustomer(customer);
            }

            Booking booking = new BookingImpl(customer, startDate, endDate, types);
            bookingController.updateOrAddBooking(booking);
            System.out.println("Booking created.");
        }catch(Exception ex){
            System.out.println("Booking process exited: " + 404);
        }
        System.out.println();
	}

	public static void checkIn(Scanner reader, BookingController bookingController){
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
            System.out.println();
            System.out.println("CHECK IN");
            System.out.println("##################");
            int bookingId = -1;
            do{
                System.out.print("Please enter booking number: ");
                bookingId = reader.nextInt();
                reader.nextLine();
                Booking b = bookingController.getBooking(bookingId);
                if(b!=null){
                    System.out.println("Booking found.");
                    System.out.print("Please enter credit card number: ");
                    long number = reader.nextLong();
                    reader.nextLine();
                    System.out.print("Please enter cvc code: ");
                    int cvc = reader.nextInt();
                    reader.nextLine();
                    System.out.print("Please enter expiration month: ");
                    int month = reader.nextInt();
                    reader.nextLine();
                    System.out.print("Please enter expiration year: ");
                    int year = reader.nextInt();
                    reader.nextLine();
                    System.out.print("Please cardholder's name: ");
                    String owner = reader.nextLine();
                    Creditcard card = new CreditcardImpl(number,cvc,month,year,owner);
                    b.setCreditCard(card);
                    bookingController.updateOrAddBooking(b);
                    bookingController.checkIn(b);
                    System.out.print("Booking successfully checked in: ");

                }else{
                    System.out.println("No booking with bookingId: "+bookingId+" found.");
                    bookingId =-1;
                }

            }while(bookingId!=-1);
        }catch(Exception e){
            System.out.println("Check In process exited: " + 403);
        }
	}

	public static void searchAvailableRoomTypes(Scanner reader, BookingController bookingController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
            System.out.print("Please enter start date (YYYY-MM-DD): ");
            String startDateString = reader.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = null;
            Date endDate = null;
            try {
                startDate = formatter.parse(startDateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.print("Please enter end date (YYYY-MM-DD): ");
            String endDateString = reader.nextLine();
            try {
                endDate = formatter.parse(endDateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Please enter number of adults: ");
            int nbrOfAdults = reader.nextInt();
            reader.nextLine();
            System.out.println("Please enter number of children: ");
            int nbrOfChildren = reader.nextInt();
            reader.nextLine();

            EList<RoomType> avaliableRoomTypes = bookingController.searchAvailableRoomTypes(startDate, endDate, nbrOfAdults, nbrOfChildren);
            System.out.println();
            System.out.println("Avaliable room types in the selected interval:");
            for (RoomType type2 : avaliableRoomTypes) {
                System.out.println(type2.toString());
            }
            System.out.println();
        }catch(Exception ex) {
            System.out.println("Searching process exited: " + 402);
        }
	}

	public static void checkOut(Scanner reader, BookingController bookingController) {
        if (user == null || user.getEmployeeType().getAcessLevel() < 4) {
            System.out.println("Unallowed access");
            return;
        }
        try{
            System.out.println();
            System.out.println("CHECK OUT");
            System.out.println("##################");
            int bookingId = -1;
            do{
                System.out.print("Please enter booking number: ");
                bookingId = reader.nextInt();
                reader.nextLine();
                Booking b = bookingController.getBooking(bookingId);
                if(b != null){
                    System.out.println("Booking found. Checking out.");
                    Bill finalBill = b.checkOut();
                    System.out.println("######## Final Bil ########");
                    System.out.println(finalBill.toString());
                    System.out.println("###########################");
                    System.out.print("Booking successfully checked out: ");
                }else{
                    System.out.println("No booking with bookingId: " + bookingId + " found.");
                    bookingId =-1;
                }

            }while(bookingId != -1);
        }catch(Exception ex) {
            System.out.println("Check Out process exited: " + 401);
        }
	}

	public static void generateFakeData(){
		List<Booking> bookings = FakeDB.bookings;
        List<Customer> customers = FakeDB.customers;
        List<Discount> discounts = FakeDB.discounts;
        List<Employee> employees = FakeDB.employees;
        List<Room> rooms = FakeDB.rooms;
        List<Addon> addons = FakeDB.addons;

        // Create 20 rooms
        RoomType[] roomTypes = {RoomType.DOUBLE, RoomType.SINGLE, RoomType.SUITE};
        for (int i = 0; i < 20; i++)
        {
            int size = i%2 == 0 ? 2 : 4;
            int maxNbrPeople = size + 2;
            Room room = new RoomImpl(maxNbrPeople, i, size, roomTypes[i % 3]);
            rooms.add(room);
        }

        // Create 5 employees
        String[] names = {"Arnold Schwarzeneger", "Erland Holmstr�m", "G�ran Andersson", "Dick Hjalmarsson", "Isabella Klarason"};
        String[] ssnumbers = {"851124-3111", "770401-2512", "810312-8181", "891212-9999", "671111-1111"};
        EType[] types = {EType.CLEANER, EType.RECEPTIONIST, EType.MANAGER};
        for (int i = 0; i < 5; i++)
        {
            EmployeeType type = new EmployeeTypeImpl(types[i%3], (i%3+1)*(i%3+1));
            double salary = 20000.0 * (i+1)/4,
                workrate = 0.2;
            String name = names[i],
                city = "Trollh�ttan",
                country = "Sweden",
                gender = "Male",
                phoneNumber = "0761-239913",
                postalCode = "711 32",
                ssnumber = ssnumbers[i],
                street = "Kungsgatan 11B",
                title = "Mr.",
                password = "admin";
            Employee employee = new EmployeeImpl(type, salary, workrate, name, city, country, gender, phoneNumber,
                    postalCode, ssnumber, password, street, title);
            employees.add(employee);
        }

        // Create 4 addons
        String[] addonNames = {"Cheese Burger", "Calzone", "Staropramen", "Fanta Can"};
        for (int i = 0; i < 4; i++)
        {
            String name = addonNames[i],
                    description = "A good piece of costable";
            double price = 20*i;
            Addon addon = new AddonImpl(name, description, price);
            addons.add(addon);
        }

        // Create 3 discounts
        for (int i = 1; i < 4; i++)
        {
            boolean isPercentage = i == 1;
            double price = isPercentage ? 0.1 : 100*i;
            Discount discount = new DiscountImpl("Test-" + i, isPercentage, price);
            discounts.add(discount);
        }

        // Create 3 customers
        String[] customerNames = {"Axel Niklasson", "Tim Kerschbaumer", "Simon Takman"};
        for (int i = 0; i < 3; i++)
        {
            String name = customerNames[i],
                    city = "Trollh�ttan",
                    country = "Sweden",
                    gender = "Male",
                    phoneNumber = "0761-239913",
                    postalCode = "711 32",
                    ssnumber = ssnumbers[i],
                    street = "Kungsgatan 11B",
                    title = "Mr.";
            Customer customer = new CustomerImpl(name, city, country, gender, phoneNumber, postalCode, ssnumber, street, title);
            customers.add(customer);
        }

        // Create 3 bookings
        for (int i = 0; i < 3; i++)
        {
            Room bookedRoom = rooms.get(i);
            Booking booking = new BookingImpl(customers.get(i), getDate("25/12/2015"), getDate("29/12/2015"), bookedRoom);
            bookings.add(booking);
        }

    }

    public static Date getDate(String date){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

}
