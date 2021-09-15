import java.util.Scanner;

public class PoisedProgram
{
    public static void main(String [] args)
    {
        /*
        The following objects are created:
        'Person_arc_obj' for Architect
        'Person_cli_object' for Client
        'Person_con_object' for Contractor
        'Project_obj' for Project
         */
        PersonClass Person_arc_obj = new PersonClass("", "", "", "");
        PersonClass Person_cli_obj = new PersonClass("", "", "", "");
        PersonClass Person_con_obj = new PersonClass("", "", "", "");
        ProjectClass Project_obj = new ProjectClass("", "", "",
                "", "", 0, 0, "");

        Scanner input = new Scanner(System.in);

        // Persons information to be recorded
        // Architect Input
        System.out.println("\nArchitect Information");

        System.out.println("\nWhat is your name?");
        String arc_name = input.nextLine();

        System.out.println("What is your telephone number?");
        String arc_teleNum = input.nextLine();

        System.out.println("What is your email address?");
        String arc_email = input.nextLine();

        System.out.println("What is your company address?");
        String arc_compAddress = input.nextLine();

        // PersonClass is called to print Architect's info
        Person_arc_obj = new PersonClass(arc_name, arc_teleNum, arc_email, arc_compAddress);

        // Client Input
        System.out.println("\nClient Information");

        System.out.println("\nWhat is your name?");
        String cli_name = input.nextLine();

        System.out.println("What is your telephone number?");
        String cli_teleNum = input.nextLine();

        System.out.println("What is your email address?");
        String cli_email = input.nextLine();

        System.out.println("What is your company address?");
        String cli_compAddress = input.nextLine();

        // PersonClass is called to print Client's info
        Person_cli_obj = new PersonClass(cli_name, cli_teleNum, cli_email, cli_compAddress);

        // Contractor Input
        System.out.println("\nContractor's Information");

        System.out.println("\nWhat is your name?");
        String con_name = input.nextLine();

        System.out.println("What is your telephone number?");
        String con_teleNum = input.nextLine();

        System.out.println("What is your email address?");
        String con_email = input.nextLine();

        System.out.println("What is your company address?");
        String con_compAddress = input.nextLine();

        // PersonClass is called to print Contractor's info
        Person_con_obj = new PersonClass(con_name, con_teleNum, con_email, con_compAddress);

        // All user input variables are printed
        System.out.println("\nArchitect Information");
        System.out.println(Person_arc_obj);

        System.out.println("\nClient Information");
        System.out.println(Person_cli_obj);

        System.out.println("\nContractor Information");
        System.out.println(Person_con_obj);

        // Project information to be recorded
        System.out.println("\nProject information");

        System.out.println("\nWhat is the project number?");
        String projNum = input.nextLine();

        System.out.println("What is the project name?");
        String projName = input.nextLine();

        System.out.println("What is the project type?");
        String projType = input.nextLine();

        System.out.println("What is the project address?");
        String projAddress = input.nextLine();

        System.out.println("What is the ERF number?");
        String erfNum = input.nextLine();

        // 'ProjValue' is of type float, to be used in calculations below
        System.out.println("What is the project value?");
        float projValue = input.nextFloat();
        input.nextLine();

        // 'paidToDate' is of type float, to be used in calculations below
        System.out.println("What is the total amount paid to date?");
        float paidToDate = input.nextFloat();
        input.nextLine();

        System.out.println("What is the project deadline? (dd/mm/yyyy)");
        String deadline = input.nextLine();

        // ProjectClass is called to print Project's info
        Project_obj = new ProjectClass(projNum, projName, projType, projAddress, erfNum,
                projValue, paidToDate, deadline);

        System.out.println("\nProject Information");
        System.out.println(Project_obj);

        // User menu is created to edit information of the project and contractor
        System.out.println("""
                       
                       Please select one of the following by number:
                       1 - Change due date
                       2 - Change total amount paid
                       3 - Change contractor's details
                       4 - Finalise project""");

        int menu_update = input.nextInt();

        // An if statement is used for the user to select options in the menu
        // Option one is used to change the due date of the project
        if (menu_update == 1)
        {
            input = new Scanner(System.in); // Reset scanner

            System.out.println("\nWhat is the new due date?");
            String deadline_new = input.nextLine();

            // User method 'proj_deadline' is called to update the due date
            Project_obj.proj_deadline(deadline_new);
            System.out.println(Project_obj);
        }

        // Option 2 is used to change the amount paid for the project
        else if (menu_update == 2)
        {
            input = new Scanner(System.in); // Reset scanner

            System.out.println("\nWhat is the new amount paid?");
            float paidToDate_new = input.nextFloat();
            input.nextLine();

            // User method 'proj_new_amount' is called to update the amount paid
            Project_obj.proj_new_amount_paid(paidToDate_new);
            System.out.println(Project_obj);
        }

        // Option 3 is used to change the contractor's info
        else if (menu_update == 3)
        {
            input = new Scanner(System.in); // Reset Scanner

            // A second menu is created to update the contact details of the contractor
            System.out.println("""
                       
                       Please select one of the following by number:
                       1 - Update telephone number
                       2 - Update email address
                       """);

            int contractor_info_update = input.nextInt();

            // A nested if statement is used to change the telephone number and email address
            // Option 1 is used to change the telephone number
            if (contractor_info_update == 1)
            {
                input = new Scanner(System.in); // Reset Scanner

                System.out.println("\nWhat is the new telephone number?");
                String teleNum_new = input.nextLine();

                // User method 'phone_num' is called to update the telephone number
                Person_con_obj.phone_num(teleNum_new);
                System.out.println(Person_con_obj);
            }

            // Option 2 is used to change the email address
            if (contractor_info_update == 2)
            {
                input = new Scanner(System.in); // Reset Scanner

                System.out.println("\nWhat is the new email address?\n");
                String email_new = input.nextLine();

                // User method 'email_address' is called to update the email address
                Person_con_obj.email_address(email_new);
                System.out.println(Person_con_obj);
            }
        }

        // Option 4 is used to generate an invoice
        else if (menu_update == 4)
        {
            float amountDue = (projValue - paidToDate);

            // If the project is paid off, no invoice will be generated
            if (amountDue == 0)
            {
                System.out.println("\nNo invoice needed. The project is paid off.");
            }

            // If there is an outstanding balance on the project, an invoice will be generated
            else if(amountDue > 0)
            {
                System.out.println("\nInvoice"
                        + "\nClient name:\t" + cli_name
                        + "\nClient number: \t" + cli_teleNum
                        + "\nClient email:\t"+ cli_email
                        + "\nProject name:\t" + projName
                        + "\nProject number:\t" + projNum
                        + "\nDue date:\t" + deadline
                        + "\nAmount due: \t" + "R" + amountDue);
            }
        }
    }
}
/*
References:
https://beginnersbook.com/2013/04/oops-concepts/
https://beginnersbook.com/2013/03/constructors-in-java/
https://codescracker.com/java/java-objects-classes.htm
https://www.javatpoint.com/java-oops-concepts
https://www.w3schools.com/java/java_methods.asp
https://www.w3schools.com/java/java_classes.asp
 */