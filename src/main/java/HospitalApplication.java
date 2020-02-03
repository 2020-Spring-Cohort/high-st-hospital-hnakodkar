import java.util.Scanner;

public class HospitalApplication {

   // private static Hospital highStHospital = new Hospital();
    private static Scanner input = new Scanner(System.in);
    private static Doctor doctor = new Doctor("Mike", 111, 90000, false);
    private static Nurse nurse = new Nurse("Mary", 125, 50000, false);
    private static Receptionist receptionist = new Receptionist("Jane", 180, 45000, false);
    private static Janitor janitor = new Janitor("Bob",200,40000,false);
    private static Patient patient = new Patient("Joe", 20, 20);


    public static void main(String[] args) {
        printWelcomeMessage();
        System.out.println("Press 1 to begin, or 0 to exit.");
        int menuInput = userInput(input);

        while (menuInput != 0) {
            System.out.println("Main Menu (press 9 for options)");
            int menu = userInput(input);
            input.nextLine();

            if (menu == 0) {
                System.out.println("Thank you for visiting our Hospital. Goodbye!");
                menuInput = 0;
            }
            while (menu != 0) {
                switch (menu) {

                    case 1:
                        printAllEmployees();
                        menu = 0;
                        break;
                    case 2:
                        System.out.println();
                        showPatientStatus();
                        menu = 0;
                        break;
                    case 3:
                        printEmployeeStatusAfterPay();
                        menu = 0;
                        break;
                    case 4:
                        showReceptionistStatus();
                        menu = 0;
                        break;

                    case 5:
                        showNurseStatus();
                        menu = 0;
                        break;
                    case 6:
                        showDoctorStatus();
                        menu = 0;
                        break;

                    case 7:
                        showJanitorStatus();
                        menu = 0;
                        break;

                    case 9:
                        printMenuOptions();
                        menu = 0;
                        break;
                    default:
                        menu = 0;
                        break;
                    }
                }
            }

        }


    private static int userInput(Scanner input) {

        return input.nextInt();
    }
    private static void printMenuOptions() {
        System.out.println("Press 1 to Print all Employees status.");
        System.out.println("Press 2 to Show patient status before any treatment by doctor or nurse");
        System.out.println("Press 3 to print status of Employees after they got paid.");
        System.out.println("Press 4 to find out what receptionist is doing.");
        System.out.println("Press 5 to find out what nurse is doing.");
        System.out.println("Press 6 to find out what Doctor is doing.");
        System.out.println("Press 7 to find out what Janitor is doing.");
        System.out.println("Press 0 to EXIT.");
    }
    public static void printWelcomeMessage() {
            System.out.println("Welcome to the High Street Hospital");
        }

    public static void printAllEmployees() {
        System.out.println("Here is the information of all hospital employees");
        System.out.println(doctor);
        System.out.println(nurse);
        System.out.println(receptionist);
        System.out.println(janitor);
    }

    private static void showPatientStatus() {
        System.out.println("current Blood level of " + patient.patientName + " is " + patient.getBloodLevel());
        System.out.println("current Health level of " + patient.patientName + " is " + patient.getHealthLevel());

    }

    public static void printEmployeeStatusAfterPay() {
        System.out.println("\nHere is the status of all employees after they got paid");
        doctor.receivePay();
        System.out.println(doctor);
        nurse.receivePay();
        System.out.println(nurse);
        receptionist.receivePay();
        System.out.println(receptionist);
        janitor.receivePay();
        System.out.println(janitor);
    }
    private static void showReceptionistStatus() {
        System.out.println(receptionist.getName() + " is answering phone ");
        receptionist.answeringPhone();
        System.out.println("phone status: " + receptionist.isOnThePhone());
    }
    private static void showNurseStatus() {
        System.out.println(nurse.getName() + " is drawing Blood on patient " + patient.patientName + " so");
        nurse.drawBlood(patient);
        nurse.treatPatient(patient);
        System.out.println(patient.patientName + "'s  blood level went down  to " + patient.getBloodLevel());
        System.out.println(patient.patientName + "'s health level increased to " + patient.getHealthLevel());
    }
    private static void showDoctorStatus() {
        System.out.println("Dr " + doctor.getName() + " is treating a patient " + patient.patientName + " so ");
        doctor.treatPatient(patient);
        System.out.println(patient.patientName + "'s Health level " +   " went up to "  + patient.getHealthLevel());
    }
    private static void showJanitorStatus() {
        System.out.println("were floors clean? " + janitor.isMoppingFloors());
        janitor.moppingFloors();
        System.out.println("so " + janitor.getName() + " is  mopping floors.");
        System.out.println("are floors clean now? " + janitor.isMoppingFloors());

    }

}


