/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task3goljasevitsarseni;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task3GoljasevitsArseni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        System.out.println(name + " " + surname + " родился "+ day + " " + month + " " + year + " года ");
    }
    
}
