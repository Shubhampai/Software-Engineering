package Main;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

      /*  Elevator elevator = new Elevator();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("********************************************");
            System.out.println("Welcome To Vishu ka Elevator!");
            System.out.print("0: Ground Floor"+"\n"+"1: 1st Floor"+"\n" +"2: 2nd Floor"+"\n" + "3: 3rd Floor"+"\n"+"4: 4th Floor"+"\n"+"99: Exit Elevator"+"\n");
            System.out.println("********************************************");
            System.out.print("Enter the Floor No.: "+"\n");
            int number = input.nextInt();

            switch (number) {
                case 0:
                    elevator.goTo(0);
                    break;
                case 1:
                    elevator.goTo(1);
                    break;
                case 2:
                    elevator.goTo(2);
                    break;
                case 3:
                    elevator.goTo(3);
                    break;
                case 4:
                    elevator.goTo(4);
                    break;
                case 99:
                    exit(1);
                    break;
                default:
                    System.out.println("Invalid Floor No.");
            }
        }while(true);
        */
      AdminPanel panel = AdminPanel.getInstance();
      System.out.println("--->" + panel.getVersion());
    }
}
