package university;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner; // Scanner file

class Student {
    String Name;
    String Address;
    int Age;
    String Gender;
    double tenth_percentage;
    int Score;
    double Percentage_12;
    String Username;
    String Password;
    String College;
    String Stream;

    private String Payment_Id;
    private String password;

    Student(String Name, String Address, int Age, String Gender, double tenth_percentage, String Username) {
        this.Gender = Gender;
        this.Name = Name;
        this.Address = Address;
        this.Age = Age;
        this.tenth_percentage = tenth_percentage;
        this.Username = Username;
    }

    public void setPayment_Id(String payment_Id) {
        this.Payment_Id = payment_Id;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "|                                                               *  Student Details  *                                                                  |");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Name : " + Name
                + "                                                                                                            ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Add : " + Address
                + "                                                                                                          ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Gender : " + Gender
                + "                                                                                                         ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student 10th Percentage : " + tenth_percentage
                + "                                                                                        ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student 12th Percentage : " + Percentage_12
                + "                                                                                          ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Entrance exam Score : " + Score
                + "                                                                                              ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student taken addmission in : " + College

                + "                                                                                                            ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         For : " + Stream);
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------|");

        return "";
    }
}
// ============================================================================================================================================================================================================

class University // Generalized Class
{
    static Scanner sc = new Scanner(System.in);
    String University_Type;
    String University_name;
    String State_Name;
    String College;
    int College_est_year;
    String College_loc;
    String College_Fees;
    String Stream;
    int Score;
    String Opening_date;

    public void University_type() {
        System.out.println("   type 1 for Reguler");
        System.out.println("   type 2 for IIT");

        int University_type = sc.nextInt();
        System.out.println("   please give right input");
        switch (University_type) {
            case 1:
                Addmission_Portal.A = new Regular_University();
                Regular_University.Final_University();
                Addmission_Portal.A.University_Type = "Regular University";
                break;
            case 2:
                Addmission_Portal.A = new IIT();
                IIT.Final_University();
                Addmission_Portal.A.University_Type = "IIT";
                break;
            default:
                System.out.println("   please give right input as mentioned above");
                University_type(); // method recursion

                break;
        }
        if (University_type != 1 && University_type != 2) {
            System.out.println("   please give right input as mentioned above");
            University_type(); // method recursion
        }
    }

    @Override
    public String toString() // Overriding toString(); [toSting Metod]
                             // Polymorphism ( Run Time Polymorphism )
    {
        System.out.println(
                "============================================================================================================================================================");
        System.out.println(
                "|                                                               *  Information of COllege  *");
        System.out.println("|      ");
        System.out.println("|         College Name : " + College);
        System.out.println("|      ");
        System.out.println("|         College University Type : " + University_Type);
        System.out.println("|      ");
        System.out.println("|         Affiliated by : " + University_name);
        System.out.println("|      ");
        System.out.println("|         College locataed in " + State_Name + " State");
        System.out.println("|      ");
        System.out.println("|         In " + State_Name + " College located in " + College_loc);
        System.out.println("|      ");
        System.out.println("|         College established in : " + College_est_year);
        System.out.println("|      ");
        System.out.println("|         Your displaying Info about " + Stream + " stream");
        System.out.println("|      ");
        System.out.println("|         Fees : " + College_Fees);
        System.out.println("|      ");
        System.out.println(
                "============================================================================================================================================================");
        return "";
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ============================================================================================================================================================================================================
interface Maharashtra {
    void maharashtra();
}

interface Karnatka {
    void karnatka();
}

interface Delhi {
    void delhi();
}

interface U_P {
    void u_p();
}

class Regular_University extends University implements Maharashtra, Karnatka, Delhi, U_P // HYBRID INHERITANCE
                                                                                         // 100 % ABSTRACTION
{
    // static int University_name;

    public static void Final_University() {
        Regular_University B;

        Addmission_Portal.A.State_Name = Addmission_Portal.State_Name;
        System.out.println("");
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println(" You want to study in " + Addmission_Portal.A.State_Name + " here are some colleges");

        // state filter condition
        if (Addmission_Portal.State_Name == "MAHARASHTRA") {
            B = (Regular_University) Addmission_Portal.A;
            B.maharashtra();
        } else if (Addmission_Portal.State_Name == "KARNATKA") {
            B = (Regular_University) Addmission_Portal.A;
            B.karnatka();
        } else if (Addmission_Portal.State_Name == "DELHI") {
            B = (Regular_University) Addmission_Portal.A;
            B.delhi();
        } else if (Addmission_Portal.State_Name == "UTTAR PRADESH") {
            B = (Regular_University) Addmission_Portal.A;
            B.u_p();
        } else {
            Addmission_Portal.State();
            Final_University();
        }
    }

    public void maharashtra() {
        System.out.println("");
        System.out.println("   1) Shivajirao S Jondhle College of Engineering & Technology");
        System.out.println("   2) Bharat College of Engineering");
        System.out.println("   3) Vidya Pratishthan's Kamalnayan Bajaj Institute of Engineering and Technology");
        System.out.println("   4) Dr. D. Y. Patil College of Engineering");
        System.out.println("   5) Mahatma Gandhi Mission College of Engineering & Tech.");
        System.out.println("   6) Terna College of Engineering.");

        int college = sc.nextInt();
        switch (college) {
            case 1:
                Addmission_Portal.A = new S_S_Jondhale();
                break; // Upcasting
            case 2:
                Addmission_Portal.A = new Bharat();
                break; // Upcasting
            case 3:
                Addmission_Portal.A = new Vidya_Pratishthan();
                break; // Upcasting
            case 4:
                Addmission_Portal.A = new D_Y_PATIL();
                break; // Upcasting
            case 5:
                Addmission_Portal.A = new M_G_M_COLLG();
                break; // Upcasting
            case 6:
                Addmission_Portal.A = new Terna();
                break; // Upcasting
        }
        if (college != 1 && college != 2 && college != 3 && college != 4 && college != 5 && college != 6) {
            System.out.println("   please give right input as mentioned above");
            maharashtra();
        }
    }

    public void karnatka() {
        System.out.println("");
        System.out.println("   1) Visvesvaraya College of Engineering");
        System.out.println("   2) B.M.S. College of Engineering");
        System.out.println("   3) Basaveswara Engineering College");
        System.out.println("   4) B.V. B. College of Engineering and Technology");
        System.out.println("   5) R.V. College of Engineering");
        System.out.println("   6) New Horizon College of Engineering");

        int college = sc.nextInt();
        switch (college) {
            case 1:
                Addmission_Portal.A = new Visvesvaraya();
                break; // Upcasting
            case 2:
                Addmission_Portal.A = new B_M_S();
                break; // Upcasting
            case 3:
                Addmission_Portal.A = new Basaveswara();
                break; // Upcasting
            case 4:
                Addmission_Portal.A = new B_V_B_College();
                break; // Upcasting
            case 5:
                Addmission_Portal.A = new R_V_College();
                break; // Upcasting
            case 6:
                Addmission_Portal.A = new New_Horizon();
                break; // Upcasting
        }
        if (college != 1 && college != 2 && college != 3 && college != 4 && college != 5 && college != 6) {
            System.out.println("   please give right input as mentioned above");
            karnatka();
        }
    }

    public void delhi() {
        System.out.println("");
        System.out.println("   1) Ambedkar Institute of Technology");
        System.out.println("   2) Maharaja Surajmal Institute of Technology");
        System.out.println("   3) Guru Premsukh Memorial College of Engineering");
        System.out.println("   4) Bhagwan Parshuram Institute of Technology");
        System.out.println("   5) G. B. Pant Engineering College");

        int college = sc.nextInt();
        switch (college) {
            case 1:
                Addmission_Portal.A = new Ambedkar_Institute();
                break; // Upcasting
            case 2:
                Addmission_Portal.A = new Maharaja_Surajmal();
                break; // Upcasting
            case 3:
                Addmission_Portal.A = new Guru_Premsukh();
                break; // Upcasting
            case 4:
                Addmission_Portal.A = new JMI();
                break; // Upcasting
            case 5:
                Addmission_Portal.A = new G_B_Pant();
                break; // Upcasting
        }
        if (college != 1 && college != 2 && college != 3 && college != 4 && college != 5) {
            System.out.println("   please give right input as mentioned above");
            delhi();
        }
    }

    public void u_p() {
        System.out.println("");
        System.out.println("   1) Ajay Kumar Garg Engineering College");
        System.out.println("   2) Bundelkhand Institute of Engineering and Technology");
        System.out.println("   3) Rajkiya Engineering College");
        System.out.println("   4) Feroze Gandhi Institute of Engineering & Technology");

        int college = sc.nextInt();
        switch (college) {
            case 1:
                Addmission_Portal.A = new Ajay_Kumar_Garg();
                break; // Upcasting
            case 2:
                Addmission_Portal.A = new Bundelkhand_Institute();
                break; // Upcasting
            case 3:
                Addmission_Portal.A = new Rajkiya_Engineering();
                break; // Upcasting
            case 4:
                Addmission_Portal.A = new Feroze_Gandhi();
                break; // Upcasting
        }
        if (college != 1 && college != 2 && college != 3 && college != 4) {
            System.out.println("   please give right input as mentioned above");
            delhi();
        }
    }

}

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class S_S_Jondhale extends Regular_University {
    S_S_Jondhale() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Shivajirao S Jondhle College of Engineering & Technology (SSJCET).";
        College_est_year = 1994 - 95;
        College_loc = "Asangaon";
        Score = 75;
        Opening_date = "12-JUN-2023";
        University_name = "mumbai University";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.20 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.20 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Bharat extends Regular_University {
    Bharat() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Bharat College of Engineering (BCOE).";
        College_est_year = 2010;
        College_loc = "Badlapur";
        Score = 65;
        Opening_date = "10-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "90k per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "80k per Annum ";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "80k per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "75k per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "85k per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Vidya_Pratishthan extends Regular_University {

    Vidya_Pratishthan() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Vidya Pratishthan's College of Engineering.";
        College_est_year = 1972;
        College_loc = "Baramati";
        Score = 83;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "70 k per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "68 k per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "65 k per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "65 k per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "68 k per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class D_Y_PATIL extends Regular_University {
    D_Y_PATIL() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "D.Y. PATIL COLLEGE OF ENGINEERING .";
        College_est_year = 1984;
        College_loc = "AKURDI";
        Score = 85;
        Opening_date = "10-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class M_G_M_COLLG extends Regular_University {
    M_G_M_COLLG() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Mahatma Gandhi Mission College of Engineering & Tech.";
        College_est_year = 1994;
        College_loc = "Panvel";
        Score = 79;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Terna extends Regular_University {
    Terna() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Terna College of Engineering.";
        College_est_year = 1991;
        College_loc = "Nerul";
        Score = 82;
        Opening_date = "12-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.01 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.11 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Visvesvaraya extends Regular_University {
    Visvesvaraya() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Visvesvaraya National Institute of Technology.";
        College_est_year = 1960;
        College_loc = "Nagpur";
        Score = 81;
        Opening_date = "17-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "95K per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "94 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class B_M_S extends Regular_University {
    B_M_S() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Bhusanayana Mukundadas Sreenivasaiah College of Engineering.";
        College_est_year = 1946;
        College_loc = " Basavanagudi";
        Score = 78;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "95 K per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "94 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Basaveswara extends Regular_University {
    Basaveswara() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Basaveshwara Engineering College (Autonomous).";
        College_est_year = 1963;
        College_loc = " Bagalkot";
        Score = 80;
        Opening_date = "22-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "98 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class B_V_B_College extends Regular_University {
    B_V_B_College() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "B. V. Bhoomaraddi College of Engineering and Technology.";
        College_est_year = 1947;
        College_loc = " Hubli, Dharwad";
        Score = 78;
        Opening_date = "15-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.06 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "99 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.13 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class R_V_College extends Regular_University {
    R_V_College() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "R.V. College of Engineering.";
        College_est_year = 1963;
        College_loc = " Bengaluru";
        Score = 79;
        Opening_date = "17-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "96 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.03 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class New_Horizon extends Regular_University {
    New_Horizon() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "New Horizon College of Engineering (NHCE).";
        College_est_year = 2001;
        College_loc = " Bangalore";
        Score = 82;
        Opening_date = "19-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "96 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.03 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Ambedkar_Institute extends Regular_University {
    Ambedkar_Institute() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Ambedkar Institute of Technology.";
        College_est_year = 2006;
        College_loc = " Geeta Colony";
        Score = 82;
        Opening_date = "15-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.06 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "99 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.14 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Maharaja_Surajmal extends Regular_University {
    Maharaja_Surajmal() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Maharaja Surajmal Institute of Technology.";
        College_est_year = 2001;
        College_loc = " Janakpuri";
        Score = 72;
        Opening_date = "18-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.2 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.08 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Guru_Premsukh extends Regular_University {
    Guru_Premsukh() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Guru Premsukh Memorial College of Engineering.";
        College_est_year = 1999;
        College_loc = " Budhpur village";
        Score = 69;
        Opening_date = "16-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.01 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.05 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class JMI extends Regular_University {
    JMI() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Faculty of Engineering and Technology JMI.";
        College_est_year = 1985;
        College_loc = " Delhi";
        Score = 79;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.07 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.08 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class G_B_Pant extends Regular_University {
    G_B_Pant() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Govind Ballabh Pant Engineering College.";
        College_est_year = 2007;
        College_loc = "Okhla";
        Score = 75;
        Opening_date = "21-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.07 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.08 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Ajay_Kumar_Garg extends Regular_University {
    Ajay_Kumar_Garg() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Ajay Kumar Garg Engineering College.";
        College_est_year = 1998;
        College_loc = " Lucknow";
        Score = 86;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.07 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.08 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Bundelkhand_Institute extends Regular_University {
    Bundelkhand_Institute() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Bundelkhand Institute of Engineering and Technology.";
        College_est_year = 1989;
        College_loc = "Jhansi";
        Score = 76;
        Opening_date = "22-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.03 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.06 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Rajkiya_Engineering extends Regular_University {
    Rajkiya_Engineering() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Rajkiya Engineering College (R.E.C.).";
        College_est_year = 2010;
        College_loc = "Ambedkar Nagar";
        Score = 59;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.0 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.01 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Feroze_Gandhi extends Regular_University {
    Feroze_Gandhi() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Feroze Gandhi Institute of Engineering & Technology.";
        College_est_year = 1974;
        College_loc = "Raebareli";
        Score = 79;
        Opening_date = "18-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "98 K per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "95 K per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "89 K per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "96 K per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "95 K per Annum";
        }
    }
}

// ============================================================================================================================================================================================================
class IIT extends University implements Maharashtra, Karnatka, Delhi {
    static int University_name;

    public static void Final_University() {
        IIT B;

        System.out.println("");
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("   You want to study in " + Addmission_Portal.State_Name + " but");

        if (Addmission_Portal.State_Name == "MAHARASHTRA") {
            B = (IIT) Addmission_Portal.A;
            B.maharashtra();
        } else if (Addmission_Portal.State_Name == "KARNATKA") {
            B = (IIT) Addmission_Portal.A;
            B.karnatka();
        } else if (Addmission_Portal.State_Name == "DELHI") {
            B = (IIT) Addmission_Portal.A;
            B.delhi();
        } else if (Addmission_Portal.State_Name == "UTTAR PRADESH") {
            B = (IIT) Addmission_Portal.A;
            B.u_p();
        } else {
            Addmission_Portal.State();
            Final_University();
        }
    }

    public void maharashtra() {

        System.out.println("   In Maharashtra their is only one institute");
        System.out.println("   IIT Bombay");
        Addmission_Portal.A = new IIT_Bombay();
    }

    public void karnatka() {
        System.out.println("   In Kaharashtra their is only one institute");
        System.out.println("   IIT Dharwad");
        Addmission_Portal.A = new IIT_Dharwad();
    }

    public void delhi() {
        System.out.println("   In Delhi their is only one institute");
        System.out.println("   IIT Delhi");
        Addmission_Portal.A = new IIT_Delhi();
    }

    public void u_p() {
        System.out.println("   In Uttar Pradesh their is only one institute");
        System.out.println("   IIT Delhi");
        Addmission_Portal.A = new IIT_Kanpur();
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class IIT_Bombay extends IIT {
    IIT_Bombay() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Indian Institute of Technology Bombay.";
        College_est_year = 1958;
        College_loc = "Powai";
        Score = 250;
        Opening_date = "18-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "1.15 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.11 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.12 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }

}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class IIT_Dharwad extends IIT {
    IIT_Dharwad() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Indian Institute of Technology Dharwad.";
        College_est_year = 2016;
        College_loc = "Dharwad";
        Score = 220;
        Opening_date = "10-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "10.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.01 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.02 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.00 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class IIT_Delhi extends IIT {
    IIT_Delhi() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Indian Institute of Technology Delhi.";
        College_est_year = 1961;
        College_loc = "New Delhi";
        Score = 260;
        Opening_date = "18-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "10.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.05 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.04 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class IIT_Kanpur extends IIT {
    IIT_Kanpur() {
        this.State_Name = Addmission_Portal.State_Name;
        this.Stream = Addmission_Portal.Stream;

        College = "Indian Institute of Technology Kanpur.";
        College_est_year = 1959;
        College_loc = "Kalyanpur";
        Score = 230;
        Opening_date = "20-JUN-2023";

        if (Addmission_Portal.Stream == "Mechanical Engineering") {
            College_Fees = "10.06 lac per Annum";
        } else if (Addmission_Portal.Stream == "Civil Engineering") {
            College_Fees = "1.1 lac per Annum";
        } else if (Addmission_Portal.Stream == "Elctrical Engineering") {
            College_Fees = "1.04 lac per Annum";
        } else if (Addmission_Portal.Stream == "Computer Engineering") {
            College_Fees = "1.08 lac per Annum";
        } else if (Addmission_Portal.Stream == "Information & Technology") {
            College_Fees = "1.1 lac per Annum";
        }
    }
}
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ============================================================================================================================================================================================================

class Addmission_Portal // Driver class
{
    static Scanner sc = new Scanner(System.in);
    static University A;
    static String State_Name;
    static String Stream;
    static int Addmision_decision;
    static double Percentage_10;
    // static int Score;
    static Student Student_detail;
    static int eligible;
    static String eligibility = "no";
    static String caha_picha;
    static String Gender;
    static int Gender_input;

    public static void State() {
        System.out.println("   Type '1' for MAHARASHTRA");
        System.out.println("   Type '2' for KARNATKA");
        System.out.println("   Type '3' for DELHI");
        System.out.println("   Type '4' for UTTAR PRADESH");
        int State_Name = sc.nextInt();
        switch (State_Name) {
            case 1:
                Addmission_Portal.State_Name = "MAHARASHTRA";
                break;
            case 2:
                Addmission_Portal.State_Name = "KARNATKA";
                break;
            case 3:
                Addmission_Portal.State_Name = "DELHI";
                break;
            case 4:
                Addmission_Portal.State_Name = "UTTAR PRADESH";
                break;
        }
        if (State_Name != 1 && State_Name != 2 && State_Name != 3 && State_Name != 4) {
            System.out.println("   please select proper State listed above");
            State();
        }

    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Stream() {
        System.out.println("   1) Mechanical Engineering");
        System.out.println("   2) Civil Engineering");
        System.out.println("   3) Electronics Engineering");
        System.out.println("   4) Computer Engineering");
        System.out.println("   5) Information & Technology ");

        int Stream = sc.nextInt();
        switch (Stream) {
            case 1:
                Addmission_Portal.Stream = "Mechanical Engineering";
                break;
            case 2:
                Addmission_Portal.Stream = "Civil Engineering";
                break;
            case 3:
                Addmission_Portal.Stream = "Elctrical Engineering";
                break;
            case 4:
                Addmission_Portal.Stream = "Computer Engineering";
                break;
            case 5:
                Addmission_Portal.Stream = "Information & Technology";
                break;
        }
        if (Stream != 1 && Stream != 2 && Stream != 3 && Stream != 4 && Stream != 5) {
            System.out.println("   please give right input as mentioned above");
            Stream();
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Selection_Method() {
        System.out.println(
                "=========================================================================================================================================================");
        System.out.println("");
        System.out.println("   In which state you want to study");
        System.out.println("");
        State();
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("   In Engineering their are multiple streams");
        System.out.println("   In which stream you Want to make career");
        System.out.println("");
        Stream(); // State_Board.State_university();
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("   In which type of University you want to Enroll");
        A = new University();
        System.out.println("");
        A.University_type();
        System.out.println("");
        System.out.println("   " + A);
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Addmission_part_1() {
        System.out.println("");
        Login();
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("   To take addmission in college we have to check either you are eligibal or not");
        System.out.println("   for that please fill some information");
        System.out.println("");
        Twelth_percentage();
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        if (A.University_Type == "Regular University") {
            System.out.println("   To take Addmission in Reguler University we have to attend MHT-CET test ");
            System.out.println("   What is your MHT-CET score out of 100");
        } else if (A.University_Type == "IIT") {
            System.out.println("   To take Addmission in IIT we have to attend JEE test ");
            System.out.println("   What is your JEE score out of 360");
        }
        Student_detail.Score = sc.nextInt();
        System.out.println("");
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    static String input_3;
    static String input_a;

    public static void Payment_2() {
        System.out.println("");
        System.out.println("   You can pay fees in three metods");
        System.out.println("");
        System.out.println("   Feel free to make payment by Netbanking or UPI");
        System.out.println("   Our Server is vary secure & we keep your id's secure");
        System.out.println("");
        System.out.println("   Press 1) to pay by UPI");
        System.out.println("   Press 2) to pay by Netbanking");
        System.out.println("   Press 3) to pay through cash by visiting " + A.College);

        int input = sc.nextInt();
        System.out.println("");
        switch (input) {
            case 1:
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   Please enter you UPI id");
                String input_2 = sc.next();
                Student_detail.setPayment_Id(input_2);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   Please enter you UPI Password");
                input_3 = sc.next();
                Student_detail.setpassword(input_3);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println(
                        "                                                               *     LOGIN SUCESSFUL     *");
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println(
                        "                                                                *     PAYMENT DONE     *");
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   CONGRATULATIONS your Addmission is sucessful in " + A.College);
                System.out.println("   for " + A.Stream);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                Student_detail.College = A.College;
                Student_detail.Stream = A.Stream;
                Bill_Conformation();
                break;

            case 2:
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   Please enter Netbanking Username");
                String input_4 = sc.next();
                Student_detail.setPayment_Id(input_4);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   Please enter Password");
                String input_5 = sc.next();
                Student_detail.setpassword(input_5);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println(
                        "                                                              *     LOGIN SUCESSFUL     *");
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println(
                        "                                                               *     PAYMENT DONE     *");
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   You have paid " + A.College_Fees);
                System.out.println("");
                System.out.println("   CONGRATULATIONS your Addmission is sucessful in " + A.College);
                System.out.println("   for " + A.Stream);
                System.out.println("");
                Student_detail.College = A.College;
                Student_detail.Stream = A.Stream;
                Bill_Conformation();
                break;

            case 3:
                System.out.println("");
                System.out.println("   You want to pay by visiting" + A.College);
                System.out.println("   here is the Address");
                System.out.println(A.College_loc);
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println("   You SHOULD visit " + A.College + " in next 5 Working days ");
                System.out.println("   We are creating a Temporary Request to " + A.College);
                System.out.println("");
                System.out.println(
                        "                              ---------------------------------------------------------" + "");
                System.out.println("                               |  *   YOUR TEMPORARY REQUEST NO IS : "
                        + (A.hashCode()) + "   *   |");
                System.out.println(
                        "                              ---------------------------------------------------------" + "");
                System.out.println("");
                System.out.println(
                        "   If you don't Visit College in next 5 Working days your Temporary Addmission Request will get cancel");
                System.out.println("   Then you can't get addmission in " + A.College);
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                Student_detail.College = A.College;
                Student_detail.Stream = A.Stream;
                break;
        }
        if (input != 1 && input != 2 && input != 3) {
            System.out.println("   please Type proper Board type With proper Spelling");
            Payment_2();
        }

    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Payment_1() {
        System.out.println("");
        System.out.println("   Now you have to pay fees of respective course");
        System.out.println("    Amount you have to pay is " + A.College_Fees);
        System.out.println("");
        System.out.println("    press 1) To pay fees");
        System.out.println("    press 2) To exit");

        int input_2 = sc.nextInt();
        switch (input_2) {
            case 1:
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                Payment_2();
                break;
            case 2:
                Exit();
        }
        if (input_2 != 1 && input_2 != 2) {
            System.out.println("   please Type proper Board type With proper Spelling");
            Payment_1();
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Addmission_part_2() {
        eligibility = "yes";

        System.out.println("");
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("                                                                 *   CONGRATULATIONS   * ");
        System.out.println("");
        System.out.println("   you are eligible to take addmission in " + A.College);
        System.out.println("");
        System.out.println(
                "============================================================================================================================================================");
        System.out.println("");
        System.out.println("   To get Addmission we have to fill some Information  ");
        System.out.println("   you already given some Information ");
        System.out.println("");
        System.out.println("   but you must Upload your Documents to take Addmission");
        System.out.println("");
        System.out.println("    press 1) to upload document");
        System.out.println("    press 2) to take exit");

        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println(
                        "============================================================================================================================================================");
                System.out.println("");
                System.out.println(
                        "                                                        *     DOCUMENT ADDED SUCESSFULLY     *");
                System.out.println("");
                System.out.println(
                        "============================================================================================================================================================");
                Payment_1();
                break;
            case 2:
                break;

        }
        if (input != 1 && input != 2) {
            System.out.println("   please Type proper Board type With proper Spelling");
            Addmission_part_2();
        }

    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Back_before_Add_2() //
    {
        int T = sc.nextInt();
        switch (T) {
            case 1:
                Selection_Method();
                for (int i = 1; Addmision_decision != 1 && Addmision_decision != 2 && Addmision_decision != 3; i++) {
                    Back_before_Add();
                }
                if (Addmision_decision == 3) {
                    Exit();
                }
                break;
            case 2:
                Exit();
                break;
        }
        if (Addmision_decision != 1 && Addmision_decision != 2 && Addmision_decision != 3) {
            System.out.println("   please give right input as mentioned above");
            Back_before_Add_2();
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Back_before_Add() // Addmission Decision
    {
        System.out.println("");
        System.out.println("   Do You want to fill Addmission form for " + A.College);
        System.out.println("   or search for another college");
        System.out.println("");
        System.out.println("   Press 1) To take Addmission in college");
        System.out.println("   Press 2) To search for another college");
        System.out.println("   Press 3) To exit Addmission Portal ");
        Addmision_decision = sc.nextInt();
        switch (Addmision_decision) {
            case 1:
                Addmission_part_1();
                break;
            case 2:
                for (int i = 1; Addmision_decision == 2; i++) {
                    Selection_Method();
                    Back_before_Add();
                }
                if (Addmision_decision == 3) {
                    // Exit();
                }
                break;
            case 3:
                eligibility = "yES";
                break;
        }
        if (Addmision_decision != 1 && Addmision_decision != 2 && Addmision_decision != 3) {
            System.out.println("   please give right input as mentioned above");
            Back_before_Add();
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Exit() // Exit Method
    {
        System.out.println(
                "                                       ==================================================================================");
        System.out.println("");
        System.out.println(
                "                                                           *   Thank you for visiting Addmission Portal  *");
        System.out.println("");

        System.out.println(
                "=========================================================================================================================================================");
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void Gender_Selection() // Gender Selection Method
    {
        System.out.println("   Press 1) Male");
        System.out.println("   Press 2) Female");
        System.out.println("   Press 3) Other");
        Gender_input = sc.nextInt();
        switch (Gender_input) {
            case 1:
                Gender = "Male";
                break;
            case 2:
                Gender = "Female";
                break;
            case 3:
                Gender = "Other";
                break;
        }
        if (Gender_input != 1 && Gender_input != 2 && Gender_input != 3) {
            System.out.println("   please select no value specifies above");
            Gender_Selection();
        }
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void Bill_Conformation() // Bill Confirmation Decision
    {
        System.out.println("   Do you want Payment Recipt");
        System.out.println("   ");
        System.out.println("   press 1) if Yes");
        System.out.println("   press 2) if No");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                Bill();
                break;
            case 2:
                ;
        }
    }

    public static void Bill() // Bill Printing Method
    {
        Student_detail.College = A.College;
        Student_detail.Stream = A.Stream;
        System.out.println(
                "========================================================================================================================================================");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|                                                                    *  Payment Recipt *                                                               |");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "         Payment recipt no : " + A.hashCode()); // Used hashCode() [ hashCode Method ]
        System.out.println(
                "|                                                                                                                                                      |");
        LocalDate Date = LocalDate.now();
        System.out.println(
                "         Date : " + Date); // Used hashCode() [ hashCode Method ]
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "|                                                                    *  College Details  *                                                             |");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         College Name : " + A.College
                + "                                                                                                                        ");
        System.out.println("         Since : " + A.College_est_year
                + "                                                                                                                      ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Located in : " + A.College_loc + ", " + A.State_Name
                + "                                                                                                  ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "|                                                               *  Student Details  *                                                                  |");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Name : " + Student_detail.Name
                + "                                                                                                            ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Add : " + Student_detail.Address
                + "                                                                                                          ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Gender : " + Student_detail.Gender
                + "                                                                                                         ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student 10th Percentage : " + Student_detail.tenth_percentage
                + "                                                                                        ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student 12th Percentage : " + Student_detail.Percentage_12
                + "                                                                                          ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Entrance exam Score : " + Student_detail.Score
                + "                                                                                              ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Student Chosed : " + A.Stream
                + "                                                                                                            ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Fees Paid by Student : " + A.College_Fees
                + " Only /----                                                                                                 ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         " + Student_detail.Name + " Welcome to " + A.College
                + "                                                                                                                                       ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println("         Your Accadamics is Starting from " + A.Opening_date
                + ". Make sure you will be present                                                                                                                                       ");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "|                                                          *  ATTENDENCE IS COMPULSURY  *                                                              |");
        System.out.println(
                "|                                                                                                                                                      |");
        System.out.println(
                "========================================================================================================================================================");

    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void eligiblity() // Eligibility Decision Method
    {
        if (Student_detail.Score > A.Score && Student_detail.Percentage_12 > 55) // Comparing Student Score with College
                                                                                 // Cutoff
        {
            Addmission_part_2();
        } else // If they are not Eligible
        {
            for (int i = 1; eligibility == "no"; i++) {
                System.out.println("   Your are NOT ELIGIBLE ");
                System.out.println("   to take Addmission in " + A.College);
                System.out.println("   ");
                System.out.println("   *   Try for Another College  *");
                System.out.println("   ");
                System.out.println("   Do you want to search for another college or want to exit");
                System.out.println("   press 1) to search for another college");
                System.out.println("   press 2) to exit");
                eligible = sc.nextInt();
                switch (eligible) {
                    case 1:
                        Selection_Method();
                        Back_before_Add();
                        if (Addmision_decision == 3) {
                        }
                        if (Student_detail.Score > A.Score && Student_detail.Percentage_12 > 55) {
                            Addmission_part_2();
                        }
                        for (int i1 = 1; eligible != 1 && eligible != 2; i1++) {
                            eligiblity();
                        }
                        if (eligible == 2) {
                            ;
                        }
                        break;
                    case 2:
                        eligibility = "YES";
                        break;
                }
            }
        }
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void ten_percentage() {
        System.out.print("   Enter Your 10th percentage : ");
        Percentage_10 = sc.nextDouble();
        if (Percentage_10 < 35) {
            System.out.println("   ");
            System.out.println("   35% is the minimum criteria");
            System.out.println("   if you got less than 35% that means you are fail in 10th");
            System.out.println("   please give right input");
            ten_percentage();
            System.out.println("   ");
        } else if (Percentage_10 > 100) {
            System.out.println("   ");
            System.out.println("   Maximum limit of percentage is 100% please give right input");
            ten_percentage();
            System.out.println("   ");
        }
    }

    public static void Twelth_percentage() {
        System.out.println("   > 12 th Percentage ");
        Student_detail.Percentage_12 = sc.nextDouble();
        System.out.println("");
        if (Student_detail.Percentage_12 < 35) {
            System.out.println("   ");
            System.out.println("   35% is the minimum criteria");
            System.out.println("   if you got less than 35% that means you are fail in 10th");
            System.out.println("   please give right input");
            Twelth_percentage();
            System.out.println("   ");
        } else if (Student_detail.Percentage_12 > 100) {
            System.out.println("   ");
            System.out.println("   Maximum limit of percentage is 100% please give right input");
            Twelth_percentage();
            System.out.println("   ");
        }
    }

    public static void Continue() {
        System.out.println("   please click 1 to continue");
        int Continue = sc.nextInt();
        switch (Continue) {
            case 1:
                ;
                break;
            default:
                Continue();
                break;
        }
    }

    public static void Login() {
        System.out.println(" ");
        System.out.println(
                "============================================================================================================================================================");
        System.out.println(" ");
        System.out.print("   Enter your Username: ");
        String username = sc.next();
        System.out.println(" ");
        System.out.print("   Enter your Login Password generated by System: ");
        String password = sc.next();
        System.out.println(" ");
        if (username.equals(Student_detail.Username) && password.equals(Student_detail.Password)) {
            System.out.println(
                    "============================================================================================================================================================");
            System.out.println(" ");
            System.out.println(
                    "                                                                      *   LOGIN SUCESSFUL   * ");
            System.out.println(" ");
        } else {
            System.out.println("          *   Invalid Credential   *");
            System.out.println("   please enter proper Username and Password");
            Login();
        }

    }

    static ArrayList List;
    static int ForPrinting;

    public static void First_LOGIN() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "|                                                                                                                                                       |");
        System.out.println(
                "|                                                                  Press 1 for Student Login                                                            |");
        System.out.println(
                "|                                                                   Press 2 for Admin Login                                                             |");
        System.out.println(
                "|                                                                       Press 3 for exit                                                                |");
        System.out.println(
                "|                                                                                                                                                       |");
        System.out.println(
                "=========================================================================================================================================================");

        int AS = sc.nextInt();
        t: switch (AS) {
            case 1:
                User_end();
                System.out.println("");
                System.out.println("   Press 1 for Admin Login");
                System.out.println("   Press 2 for exit");
                System.out.println("");
                int AS2 = sc.nextInt();
                if (AS2 == 1) {
                    ;
                } else if (AS2 == 2) {
                    Exit();
                    break t;
                } else {
                    First_LOGIN();
                }
            case 2:
                University_Admin Un = new University_Admin();
                System.out.println(
                        "=========================================================================================================================================================");
                System.out.println(
                        "|                                                         ***     Welcome to Admin portal     ***                                                       |");
                Un.Admin();
                First_LOGIN();
                break;
            case 3:
                Exit();
                break;
            default:
                First_LOGIN();
                break;
        }
    }

    public static void User_end() {
        for (caha_picha = "no"; caha_picha == "no"; Addmision_decision = 0) {
            System.out.println(
                    "=========================================================================================================================================================");
            System.out.println(
                    "|                                                                                                                                                       |");
            System.out.println(
                    "|                                                                 <-->  CONGRATULATION  <-->                                                            |");
            System.out.println(
                    "|                                                                                                                                                       |");
            System.out.println(
                    "|                                                        for Completing your Higher Secondry Education                                                  |");
            System.out.println(
                    "|                                                                                                                                                       |");
            System.out.println(
                    "|                                                                   == ** == ** == ** ==                                                                |");
            System.out.println(
                    "|                                                                    *     WELCOME     *                                                                |");
            System.out.println(
                    "|                                                                 to the Engineering Studies                                                            |");
            System.out.println(
                    "|                                                                                                                                                       |");
            System.out.println(
                    "=========================================================================================================================================================");
            System.out.println(
                    "                                            --->      Please fill the Information to apply for cources      <---");
            System.out.println(
                    "                                       ==================================================================================");
            System.out.println("");

            System.out.print("   Enter Your Full Name : ");
            String Name = sc.nextLine();
            System.out.println("");
            System.out.print("   Enter Your Address : ");
            String Address = sc.nextLine();
            System.out.println("");
            System.out.print("   Enter Your Age : ");
            int Age = sc.nextInt();
            System.out.println("");
            System.out.println("   Enter Your Gender : ");
            Gender_Selection();
            System.out.println("   ");
            System.out.println("   You Selected " + Gender);
            System.out.println("");
            ten_percentage();
            System.out.println("");
            System.out.println("   Create username: ");
            String Username = sc.next();
            Student_detail = new Student(Name, Address, Age, Gender, Percentage_10, Username);
            System.out.println("");
            Student_detail.Password = Student_detail.hashCode() + "@" + Age;
            System.out.println("=========================================================");
            System.out.println("|   *     Your login Password is: " + Student_detail.Password + "     *   |");
            System.out.println("=========================================================");
            System.out.println("");
            System.out.println("   Please remember your password ");
            System.out.println("   It is very important while taking Addmission");
            System.out.println("");
            Continue();

            Selection_Method();
            for (int i8 = 1; Addmision_decision != 1 && Addmision_decision != 2 && Addmision_decision != 3; i8++) // For
                                                                                                                  // Loop
            {
                Back_before_Add();
            }
            if (Addmision_decision == 3) {
                eligibility = "YES";
            }

            eligiblity();
            System.out.println("   ");
            System.out.println("   press 1) Do you want make addmission of another student");
            System.out.println("   press 2) You want to exit portal");
            int Le_Maccha = sc.nextInt();
            switch (Le_Maccha) {
                case 1:
                    sc.nextLine();
                    ;
                    break;
                case 2:
                    caha_picha = "yes";
            }
            eligibility = "no";
            List.add(Student_detail);
            ForPrinting++;
        }
    }

    //
}
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// * END OF PROGRAM *
// ============================================================================================================================================================================================================