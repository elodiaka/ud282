// https://classroom.udacity.com/courses/ud282/


public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");
//
//            L1_10();
//            L1_12_13();
//            L1_16();
//            L1_18();
//            L1_19();
//            L1_21();
//            Q6();
//            Q7();
//        // +++++
//            L2_3();
//            L2_5_9();
//            L2_11();
//            L2_16_17();
//            L2_21();
//            L2_22();
//            L2_23();
//            L2_24();
        // +++++

        // +++++
            L4_3();
      //  beep();
      //  checkAlarm();

    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Lesson 1 */

    /**/
    public static void L1_10() {
        // einfache Operationen mit Variablen
        int stops;
        stops = 0;
        stops = stops + 3;
        // Variablen berechnen und anzeigen
        int fare = 10;
        fare -= 3;
        System.out.println(stops + " " + fare); //3 7
    }
    /**/
    public static void L1_12_13(){
        String driver;
        driver = "Hamish";
        // String Länge ausgeben
        int letters = driver.length();
        System.out.println(letters);  // 6

        // String in Grossbuchstaben
        driver = driver.toUpperCase();
        System.out.println(driver); // HAMISH

        // String in Kleinbuchstaben
        driver = driver.toLowerCase();
        System.out.println(driver); // hamish

        // Strings zusammenfuegen Concatenation
        String driverLastName = "Blake";
        String driverFullName = "The Busdriver's name is " + driver + " " + driverLastName;
        System.out.println(driverFullName); // hamish Blake
    }

    /**/
    public static void L1_16() {
        int maxInteger = 2147483647;
        long maxLong = 2147483647 * 10000000;
        double fraction = 99.275;
        String fullText = "(b) WWII ended 1945";
        char answer = 'b';
        boolean fact = true;
        boolean condition = false;
    }

    /**/
    public static void L1_18() {
        // einfache Arithmetik
        int x = 4;
        int simple = (2 + 3 - x) * -5; //-5

        //Division mit Doubles
        double divInt = 5 / 2; //2
        double divDou = 5 / 2.0; //2.5
    }

    /**/
    public static void L1_19() {
        //Truncation
        double divTrunc = 5 / 2; // 2.5 -> 2
        System.out.println(2.0 * (5 / 2)); // 4.0

        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);

        // Casting
        int approx = (int) future;
        System.out.println(approx);

        // In calculation casting
        int xCast = 5;
        int yCast = 2;
        double divCasting = xCast / yCast; // 2
        double accurate = (double) xCast / yCast; //2.5
        System.out.println(accurate);
    }

    /**/
    public static void L1_21() {
            /* Your friend seems to be really good at music,
            he managed to score 96% on his final exam!
            Now that you know all 5 subject grades,
            update the average calculation below to calculate the
            total average of all subjects. */

        double maths = 97.5;
        double english = 98;
        double science = 83.5;
        double drama = 75;
        double music = 96;
        double sum = maths + english + science + drama + music;
        double average = sum / 5;
        System.out.println(average);

        System.out.println(2.0 * (5 / 2));
    }

    /**/
    public static void Q6() {
        String firstName = "Josefine";
        String lastName = "Keller";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my Name is " + fullName + ".");
        System.out.println("There are " + (firstName.length() + lastName.length()) + " letters in my Name.");
        //besser in Variable berechnen:
        int lettersInName = (firstName.length() + lastName.length());
        System.out.println("There are " + lettersInName + " letters in my Name.");
    }

    /**/
    public static void Q7() {
        double fahrenheit = 70.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println((int) celsius); // 21
        System.out.println(celsius); //21.1111
    }

    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Lesson 2 */

    /**/
    public static void L2_3(){
        boolean isCold = true; //true or false
        if (isCold) {
            //executes only if isCold is true
            System.out.println("It's cold, wear a coat!");
        }

    }

    /**/
    public static void L2_5_9(){
        boolean isLightGreen = false;
        boolean isLightYellow = true;
        if(isLightGreen){
            //traffic light is green
            System.out.println("Drive!");
        } else if (isLightYellow){
            //light is NOT green but yellow
            System.out.println("Slow down.");
        } else {
            //light is NOT green
            System.out.println("Stop.");
        }
    }

    public static void L2_11(){
        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicense = true;

        if (passport){
            System.out.println("A passport is a valid ID.");
        } else if (birthCertificate){
            System.out.println("A birth certificate is a valid ID.");
        } else if (driversLicense){
            System.out.println("A driver's license is a valid ID.");
        } else {
            System.out.println("Invalid ID. Your Application is denied.");
        }
    }

    public static void L2_16_17(){
        int ticketPrice = 10;
        int age = 17;
        boolean isStudent = true;

        if(age <= 15){
            //age is less than or equal to 15
            ticketPrice = 5;
        } else if (age > 60){
            // age is greater than 60
            ticketPrice = 5;
        } else if (isStudent){
            //Student
            ticketPrice = 5;
        }
//            if(age <= 15 || age > 60 || isStudent){
//                ticketPrice = 5; }
        System.out.println(ticketPrice);
    }

    public static void L2_21(){
        boolean action = true;
        boolean romance = true;
        boolean horror = true;
        boolean comedy = true;

        if(action && romance){
            //includes action and romance
            System.out.println("This movie includes action and romance.");
            if (comedy || horror) {
                //everyone's prefs have been met
                System.out.println("This also includes comedy or horror!");
            }
        }
    }
    public static void L2_22(){
        int rating = 4;
        if (rating >= 0 && rating <= 5) {
            //rating ist 0-5
            if (rating <= 2) {
                //rating less than or equal to 2
                System.out.println("What's the reason for your low rating?");
            }
            System.out.println("Thank you for your feedback.");
        }
    }
    public static void L2_23(){
        int passcode = 555;
        String coffeeType;
        switch(passcode) {
            case 555:
                coffeeType = "Espresso";
                break;
            case 312:
                coffeeType = "Vanilla latte";
                break;
            case 629:
                coffeeType = "Drip coffee";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);
    }
    public static void L2_24(){
        //Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
        // and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

        int month = 1; // should be a number 1-12
        String monthString;

        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            // write case 12 and a default case below
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
        }
                System.out.println(monthString);
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ //
    /* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Lesson 4 */

    public static void beep(){
        System.out.println("beep");
    }

    public static boolean checkAlarm(){
        int i = 1;
        while (i < 11) {
            System.out.println("Count is: " + i);
            i++;
        }

    public static void L4_3(){
        boolean on = checkAlarm();
        while(on){
            beep();
            on = checkAlarm();
        }
    }








}
//EOF