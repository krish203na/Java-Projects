package university;

import java.util.Scanner;

class Admin {
    private String AdminName;
    private String AdminUserName;
    private String AdminPassword;

    Admin(String AdminName, String AdminUserName, String AdminPassword) {
        this.AdminName = AdminName;
        this.AdminUserName = AdminUserName;
        this.AdminPassword = AdminPassword;
    }

    public String getAdminUserName() {
        return AdminUserName;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public String getAdminName() {
        return AdminName;
    }

}

class University_Admin {
    static Scanner sc = new Scanner(System.in);
    static Admin A1;

    University_Admin() {
        A1 = new Admin("KRISHNA", "krish", "krish@123");
    }

    public static void Admin() {
        System.out.println("");
        System.out.println("   Please Enter your Username");
        String Username = sc.next();
        System.out.println("   Please Enter your Password");
        String password = sc.next();
        System.out.println("");

        if (Username.equals(A1.getAdminUserName()) && password.equals(A1.getAdminPassword())) {
            System.out.println(
                    "=========================================================================================================================================================");
            System.out.println("");
            System.out.println(
                    "                                                                *   Login Sucessfull   *");
            System.out.println("                                                                 *   WELCOME "
                    + A1.getAdminName() + "  *");
            System.out.println("");
            System.out.println(
                    "=========================================================================================================================================================");
            Size();
        } else {
            System.out.println("   *   Invalid Credential   *");
            System.out.println("   Please give right input");
            BackToLogin();
        }
    }
    // =======================================================================================================================================
    public static void BackToLogin()
    {
    	System.out.println("   Press 1) to make Admin login");
    	System.out.println("   Press 2) to make Student login");
    	int t = sc.nextInt();
    	switch(t)
    	{
    		case 1 : Admin();
    			break;
    		case 2 : Addmission_Portal.User_end();
				break;
			default : BackToLogin();
    	}

    }

    public static void Size() {
        System.out.println("");
        System.out.println("   do you want to know how many student taken addmission");
        System.out.println("   press 1) for YES");
        System.out.println("   press 2) for NO");
        int y = sc.nextInt();
        System.out.println(
                "=========================================================================================================================================================");
        switch (y) {
            case 1:
                System.out.println("");
                System.out.println("      '" + Addmission_Portal.List.size() + "' Students taken Addmision");
                System.out.println("");
                if(Addmission_Portal.List.size() == 0)
                {
                	;
                }
                else
                {
                	detail_selection();
                }
                break;
            case 2:
                break;
            default:
                System.out.println("   Invalid Input");
                Size();
        }
    }
    // ==============================================================================================================

    public static void detail_selection() {
        System.out.println("   Do you want to display Information of students who taken addmission");
        System.out.println("   If YES press 1");
        System.out.println("   If NO press 2");
        System.out.println("");
        System.out.println(
                "=========================================================================================================================================================");
        System.out.println("");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Detail();
                break;
            case 2:
                break;
        }
        if (n != 1 && n != 2) {
            System.out.println("   Invalid Input");
            detail_selection();
        }
    }

    public static void Detail() {
        for (int z = 0; z < Addmission_Portal.ForPrinting; z++) {
            int k = z + 1;
            System.out.println("   if you want to display " + k + " student's detail press " + z);
        }
        System.out.println("");
        int Sundra = sc.nextInt();
        System.out.println(Addmission_Portal.List.get(Sundra));
        System.out.println("   do you want to see another student details");
        System.out.println("   Press 1) for Yes");
        System.out.println("   Press 2) for No");
        System.out.println("");
        System.out.println(
                "=========================================================================================================================================================");
        int d = sc.nextInt();
        if (d == 2) {
            ;
        } else if (d == 1) {
            Detail();
        } else {
            System.out.println("   Invalid Input");
            Detail();
        }

    }
}
