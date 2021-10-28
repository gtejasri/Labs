package Lab1.q2;

import java.util.*;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "y";
		while (ss.equals("y")) {
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			String choice = sc.next();
			switch (choice) {
			case "RED":
				System.out.println("Stop");
				break;
			case "GREEN":
				System.out.println("go");
				break;
			case "YELLOW":
				System.out.println("Ready");
				break;
			default:
				System.out.println("Wrong choice");
			}

			System.out.println("do you want to continue press y/n");
			ss = sc.next();
		}
	}

}
