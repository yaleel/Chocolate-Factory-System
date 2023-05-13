/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfs;

/**
 *
 * @author B
 */
import java.util.*;

public class CFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        //////objects creation
        ArrayList<Managers> managers = new ArrayList<Managers>();
        ArrayList<Employees> employees = new ArrayList<Employees>();
        ArrayList<Customers> customers = new ArrayList<Customers>();
        ArrayList<Products> products = new ArrayList<Products>();
        wareHouse WH = new wareHouse(2947.54, 25);
        Store store = new Store(9, 2);

        managers.add(new Managers("Ahmed ali", 587428, 966776356, 6));
        managers.add(new Managers("Omar mazen", 583429, 966592538, 5));
        managers.add(new Managers("Saad Karem", 630562, 966593591, 4));
        managers.add(new Managers("Saleh Ahmad", 939529, 966599393, 6));

        employees.add(new Employees("Mohammed khan", 865295, "Casher", 3, 9));
        employees.add(new Employees("Ali abdullah", 864045, "Warehouse supervisor", 1, 7));
        employees.add(new Employees("Rayan kareem", 869642, "Warehouse worker", 2, 8));
        employees.add(new Employees("mohamed amen", 56789, "Casher", 4, 2));
        employees.add(new Employees("hasan ahmed", 36789, "Security officer", 5, 7));

        customers.add(new Client("Sara hamad", 966350835, 92, new Date(7, 4, 2022)));
        customers.add(new VIP("Fatima khalid", 966439264, 492, new Date(8, 2, 2012), 3));
        customers.add(new Client("Fahad saleh", 966338278, 70, new Date(7, 10, 2020)));

        products.add(new Dark("Dark chocolate", 19.99, "cocoa , sugar", 178, "medium", 50, 50));
        products.add(new White("White chocolate", 16.00, "cocoa , sugar , milk", 349, "large", 87, "almond milk"));
        products.add(new Nuts("Hazelnut chocolate", 18.99, "hazelnut , cocoa , sugar , milk", 201, "small", 50, "hazelnut"));
        products.add(new coffeeChoco("Coffee chocolate", 10.50, "coffee , cocoa , sugar , milk", 254, "small", 10, "mocha", 65));

        ////////////////////////////////////////
        //a loop to print the tasks menu
        for (int i = 0; i > -1; i++) {//3 for loop

            System.out.println("▴ What do you want to do?\n\n1 - Edit information\n2 - Print information\n3 - Register new information\n4 - Stamp customer card\n5 - generate customer dicount\n");

            try {
                switch (userinput.nextInt()) {//4 1st switch
                    case 1: // 1st switch case 1
                        System.out.println("\n• Choose a process\n\n1 - Edit managers information\n2 - Edit employees information\n3 - Edit customers information\n4 - Edit store information\n5 - Edit warehouse information\n6 - Edit menu\n");

                        try {//try
                            switch (userinput.nextInt()) {//5 2nd switch
                                case 1: // 2nd switch case 1
                                    System.out.println("\n• Choose a manager to edit their information\n");
                                    int n = 1;

                                    //print managers names
                                    for (int j = 0; j < managers.size(); j++, n++) {
                                        System.out.println(n + " - " + managers.get(j).getName());
                                    }
                                    int u = userinput.nextInt() - 1;
                                    if (u > managers.size()) {
                                        System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                        break;
                                    }
                                    System.out.println("\n• What information do you want to edit?\n\n1 - Name\n2 - ID\n3 - Phone number\n4 - Working hours\n");

                                    try {//try
                                        switch (userinput.nextInt()) {//0
                                            case 1:
                                                userinput.nextLine();
                                                System.out.print("Enter new name: ");
                                                managers.get(u).setName(userinput.nextLine());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 2:
                                                System.out.print("Enter new ID: ");
                                                managers.get(u).setID(userinput.nextLong());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 3:
                                                System.out.print("Enter new Phone number: ");
                                                managers.get(u).setPhoneNum(userinput.nextLong());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 4:
                                                System.out.print("Enter working hours: ");
                                                managers.get(u).setWorkingHours(userinput.nextDouble());
                                                managers.get(u).salaryCount();
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        } //0
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;

                                    }

                                case 2:    //2nd switch case 2
                                    System.out.println("\n• Choose an employee to edit their information\n");
                                    int d = 1;

                                    //print employees names
                                    for (int j = 0; j < employees.size(); j++, d++) {
                                        System.out.println(d + " - " + employees.get(j).getName());
                                    }
                                    int r = userinput.nextInt() - 1;
                                    if (r > employees.size()) {
                                        System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                        break;
                                    }
                                    System.out.println("\n• What information do you want to edit?\n\n1 - Name\n2 - ID\n3 - Jop title\n4 - Working hours\n5 - Absence days");

                                    try {//try
                                        switch (userinput.nextInt()) {//1
                                            case 1:
                                                userinput.nextLine();
                                                System.out.print("Enter new name: ");
                                                employees.get(r).setName(userinput.nextLine());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 2:
                                                System.out.print("Enter new ID: ");
                                                employees.get(r).setID(userinput.nextLong());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 3:
                                                userinput.nextLine();
                                                System.out.print("Enter new Jop title: ");
                                                employees.get(r).setJobTitle(userinput.nextLine());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 4:
                                                System.out.print("Enter working hours: ");
                                                employees.get(r).setWorkingHours(userinput.nextDouble());
                                                employees.get(r).salaryCount();
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 5:
                                                System.out.print("Enter absence days: ");
                                                employees.get(r).setAbsenceDays(userinput.nextInt());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        }//1    
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }

                                case 3:    //2nd switch case 3
                                    System.out.println("\n• Choose a customer to edit their information\n");
                                    int o = 1;

                                    //print customers names
                                    for (int j = 0; j < customers.size(); j++, o++) {

                                        System.out.println(o + " - " + customers.get(j).getName());
                                    }
                                    int k = userinput.nextInt() - 1;
                                    if (k > customers.size()) {
                                        System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                        break;
                                    }
                                    System.out.println("\n• What information do you want to edit?\n\n1 - Name\n2 - Phone number\n3 - Points\n4 - Date of register");
                                    if (customers.get(k) instanceof VIP) {
                                        System.out.println("5 - Number of $25 gift cards\n");
                                    }

                                    try {//try
                                        switch (userinput.nextInt()) {//2

                                            case 1:
                                                userinput.nextLine();
                                                System.out.print("Enter new name: ");
                                                customers.get(k).setName(userinput.nextLine());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 2:
                                                System.out.print("Enter new Phone number: ");
                                                customers.get(k).setPhoneNum(userinput.nextLong());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 3:
                                                System.out.print("Enter points: ");
                                                customers.get(k).setPoints(userinput.nextInt());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 4:
                                                System.out.print("Enter new date: ");
                                                customers.get(k).setDate(new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt()));
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 5:
                                                if (customers.get(k) instanceof VIP) {
                                                    System.out.print("Enter new number of $25 gift cards: ");
                                                    ((VIP) customers.get(k)).setGiftCards(userinput.nextInt());
                                                    System.out.println("\nChanges were saved ✓\n");
                                                    break;
                                                }

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        }//2    
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }

                                case 4:
                                    System.out.println("\n• What information do you want to edit?\n\n1 - Customer capacity\n2 - Number of working employeees per day");

                                    try {//try
                                        switch (userinput.nextInt()) {//8
                                            case 1:
                                                System.out.println("Enter new customer capacity: ");
                                                store.setCustomerCapacity(userinput.nextInt());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 2:
                                                System.out.println("Enter new number of working employeees per day: ");
                                                store.setEmployeeesPerDay(userinput.nextInt());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        }//8
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }
                                case 5:
                                    System.out.println("\n• What information do you want to edit?\n\n1 - Warehouse capacity\n2 - Number of working employeees per day");

                                    try {//try
                                        switch (userinput.nextInt()) {//9
                                            case 1:
                                                System.out.println("Enter new capacity (km): ");
                                                WH.setCapacity(userinput.nextDouble());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;

                                            case 2:
                                                System.out.println("Enter new number of working employeees per day: ");
                                                WH.setEmployeeesPerDay(userinput.nextInt());
                                                System.out.println("\nChanges were saved ✓\n");
                                                break;
                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        }//9
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }
                                case 6:
                                    System.out.println("\n• What product do you want to edit?\n\n1 - Dark chocolate\n2 - White chocolate\n3 - Hazelnut chocolate\n4 - Coffee chocolate");
                                    int x = userinput.nextInt() - 1;

                                    try {//try
                                        switch (x + 1) {//10

                                            case 1:
                                                System.out.println("\n• What information do you want to edit?\n\n1 - Product name\n2 - Price\n3 - Ingredents\n4 - Calories\n5 - Size\n6 - Sugar\n7 - Cocoa rate");

                                                try {//try
                                                    switch (userinput.nextInt()) {//11
                                                        case 1:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new name: ");
                                                            products.get(x).setProdName(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 2:
                                                            System.out.println("Enter new price: ");
                                                            products.get(x).setPrice(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 3:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new ingredents: ");
                                                            products.get(x).setIngredents(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 4:
                                                            System.out.println("Enter new calories: ");
                                                            products.get(x).setCalories(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 5:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new size: ");
                                                            products.get(x).setSize(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 6:
                                                            System.out.println("Enter new sugar amount (g): ");
                                                            products.get(x).setSugar(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 7:
                                                            System.out.println("Enter new cocoa rate: ");
                                                            ((Dark) (products.get(x))).setCocoaRate(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;
                                                        default:
                                                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                            break;
                                                    }//11
                                                    break;
                                                }//try
                                                catch (InputMismatchException e) {
                                                    System.out.println("\n✗ Invalid character, please try again\n");
                                                    userinput.next();
                                                    break;
                                                }

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;

                                            case 2:
                                                System.out.println("\n• What information do you want to edit?\n\n1 - Product name\n2 - Price\n3 - Ingredents\n4 - Calories\n5 - Size\n6 - Sugar\n7 - Milk type");

                                                try {//try
                                                    switch (userinput.nextInt()) {//12
                                                        case 1:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new name: ");
                                                            products.get(x).setProdName(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 2:
                                                            System.out.println("Enter new price: ");
                                                            products.get(x).setPrice(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 3:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new ingredents: ");
                                                            products.get(x).setIngredents(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 4:
                                                            System.out.println("Enter new calories: ");
                                                            products.get(x).setCalories(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 5:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new size: ");
                                                            products.get(x).setSize(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 6:
                                                            System.out.println("Enter new sugar amount (g): ");
                                                            products.get(x).setSugar(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 7:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new milk type: ");
                                                            ((White) (products.get(x))).setMilkType(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;
                                                        default:
                                                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                            break;
                                                    }//12
                                                    break;
                                                }//try
                                                catch (InputMismatchException e) {
                                                    System.out.println("\n✗ Invalid character, please try again\n");
                                                    userinput.next();
                                                    break;
                                                }
                                            case 3:
                                                System.out.println("\n• What information do you want to edit?\n\n1 - Product name\n2 - Price\n3 - Ingredents\n4 - Calories\n5 - Size\n6 - Sugar\n7 - Nuts type");

                                                try {//try
                                                    switch (userinput.nextInt()) {//13
                                                        case 1:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new name: ");
                                                            products.get(x).setProdName(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 2:
                                                            System.out.println("Enter new price: ");
                                                            products.get(x).setPrice(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 3:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new ingredents: ");
                                                            products.get(x).setIngredents(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 4:
                                                            System.out.println("Enter new calories: ");
                                                            products.get(x).setCalories(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 5:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new size: ");
                                                            products.get(x).setSize(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 6:
                                                            System.out.println("Enter new sugar amount (g): ");
                                                            products.get(x).setSugar(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 7:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new nuts type: ");
                                                            ((Nuts) (products.get(x))).setType(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;
                                                        default:
                                                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                            break;
                                                    }//13
                                                    break;
                                                }//try
                                                catch (InputMismatchException e) {
                                                    System.out.println("\n✗ Invalid character, please try again\n");
                                                    userinput.next();
                                                    break;
                                                }
                                            case 4:
                                                System.out.println("\n• What information do you want to edit?\n\n1 - Product name\n2 - Price\n3 - Ingredents\n4 - Calories\n5 - Size\n6 - Sugar\n7 - Coffee type\n8 - Coffee rate");

                                                try {//try
                                                    switch (userinput.nextInt()) {//14
                                                        case 1:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new name: ");
                                                            products.get(x).setProdName(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 2:
                                                            System.out.println("Enter new price: ");
                                                            products.get(x).setPrice(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 3:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new ingredents: ");
                                                            products.get(x).setIngredents(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 4:
                                                            System.out.println("Enter new calories: ");
                                                            products.get(x).setCalories(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 5:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new size: ");
                                                            products.get(x).setSize(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 6:
                                                            System.out.println("Enter new sugar amount (g): ");
                                                            products.get(x).setSugar(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 7:
                                                            userinput.nextLine();
                                                            System.out.println("Enter new coffee type: ");
                                                            ((coffeeChoco) (products.get(x))).setType(userinput.nextLine());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        case 8:
                                                            System.out.println("Enter new coffee rate: ");
                                                            ((coffeeChoco) (products.get(x))).setcoffeeRate(userinput.nextDouble());
                                                            System.out.println("\nChanges were saved ✓\n");
                                                            break;

                                                        default:
                                                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                            break;
                                                    }//14
                                                    break;
                                                }//try
                                                catch (InputMismatchException e) {
                                                    System.out.println("\n✗ Invalid character, please try again\n");
                                                    userinput.next();
                                                    break;
                                                }
                                        }//10
                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }
                                default:
                                    System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                    break;
                            } //5 2nd switch 
                            break;
                        }//try
                        catch (InputMismatchException e) {
                            System.out.println("\n✗ Invalid character, please try again\n");
                            userinput.next();
                            break;

                        }
                    case 2: // 1st switch case 2
                        System.out.println("\n• What information do you want to print?\n\n1 - Managers information\n2 - Employees information\n3 - Customers information\n4 - Store information\n5 - Ware house information\n6 - Menu");

                        try {
                            switch (userinput.nextInt()) {//7?
                                case 1:
                                    for (Managers manager : managers) {
                                        System.out.println(manager + "\n");
                                    }
                                    break;

                                case 2:
                                    for (Employees employee : employees) {
                                        System.out.println(employee + "\n");
                                    }
                                    break;

                                case 3:
                                    for (Customers customer : customers) {
                                        System.out.println(customer + "\n");
                                    }
                                    break;

                                case 4:
                                    System.out.println(store + "\n");
                                    break;

                                case 5:
                                    System.out.println(WH + "\n");
                                    break;

                                case 6:
                                    for (Products product : products) {
                                        System.out.println(product + "\n");
                                    }
                                    break;

                                default:
                                    System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                    break;
                            }//7
                            break;
                        }//try
                        catch (InputMismatchException e) {
                            System.out.println("\n✗ Invalid character, please try again\n");
                            userinput.next();
                            break;
                        }

                    case 3:
                        System.out.println("\n• What information do you want to register?\n\n1 - New manager\n2 - New employee\n3 - New customer\n");
                        try {//try
                            switch (userinput.nextInt()) {//a switch2
                                case 1:
                                    userinput.nextLine();
                                    System.out.println("Enter manager name: ");
                                    String mn = userinput.nextLine();

                                    System.out.println("Enter manager ID: ");
                                    long mid = userinput.nextLong();

                                    System.out.println("Enter manager phone number: ");
                                    long mpn = userinput.nextLong();

                                    System.out.println("Enter manager Working hours: ");
                                    double mww = userinput.nextDouble();

                                    managers.add(new Managers(mn, mid, mpn, mww));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 2:
                                    userinput.nextLine();
                                    System.out.print("Enter employee name: ");
                                    String en = userinput.nextLine();

                                    System.out.print("Enter employee ID: ");
                                    long eid = userinput.nextLong();

                                    userinput.nextLine();
                                    System.out.print("Enter employee job title: ");
                                    String ej = userinput.nextLine();

                                    System.out.print("Enter employee absence days: ");
                                    int ad = userinput.nextInt();

                                    System.out.print("Enter employee working hours: ");
                                    double ww = userinput.nextDouble();

                                    employees.add(new Employees(en, eid, ej, ad, ww));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 3:
                                    System.out.println("Choose type of customer:\n\n1 - VIP\n2 - regular client");
                                    try {//try
                                        switch (userinput.nextInt()) {//this switch
                                            case 1:
                                                userinput.nextLine();
                                                System.out.print("Enter customer name: ");
                                                String cn = userinput.nextLine();

                                                System.out.print("Enter customer phone number: ");
                                                long cp = userinput.nextLong();

                                                System.out.print("Enter customer points: ");
                                                int pc = userinput.nextInt();

                                                System.out.print("Enter customer joining date: ");
                                                Date d = new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt());

                                                System.out.print("Enter customer giftcards: ");
                                                int gc = userinput.nextInt();

                                                customers.add(new VIP(cn, cp, pc, d, gc));
                                                System.out.println("\nInformation were added ✓\n");

                                                break;

                                            default:
                                                System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                                break;
                                        }//this switch

                                        break;
                                    }//try
                                    catch (InputMismatchException e) {
                                        System.out.println("\n✗ Invalid character, please try again\n");
                                        userinput.next();
                                        break;
                                    }

                                default:
                                    System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                    break;
                            }// a switch2
                            break;
                        }//try
                        catch (InputMismatchException e) {
                            System.out.println("\n✗ Invalid character, please try again\n");
                            userinput.next();
                            break;
                        }

                    case 4:
                        System.out.println("\n• Choose a customer to stamp their card\n");
                        int hg = 1;
                        //print customers names
                        for (int j = 0; j < customers.size(); j++, hg++) {
                            System.out.println(hg + " - " + customers.get(j).getName());
                        }
                        int tr = userinput.nextInt() - 1;
                        if (tr <= customers.size()) {
                            if (customers.get(tr) instanceof VIP) {
                                ((VIP) customers.get(tr)).stampCount();
                            } else if (customers.get(tr) instanceof Client) {
                                ((Client) customers.get(tr)).stampCount();
                            }
                        } else {
                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");

                        }
                        break;

                    case 5:

                        customers.get(0).Discount();
                        break;
                    default:
                        System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                        break;

                }//4 1st switch

            }//try
            catch (InputMismatchException e) {
                System.out.println("\n✗ Invalid character, please try again\n");
                userinput.next();

            }

        }//3 for loop

    }//main
}
