package common;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 *
 * @author agnas
 */
public class Startup {

    public static void main(String[] args) {

        //Lab 2
        List employee = new ArrayList();

        employee.add("Bob Jones");
        employee.add("Sal Smith");
        employee.add("Susan Jackson");

        System.out.println("List of Employees not using generics:");

        for (int i = 0; i < employee.size(); i++) {
            String employeeName = (String) employee.get(i);
            System.out.println(employeeName);
        }

        System.out.println("\nList of Employees not using generics with an enhanced for loop:");

        for (Object employeeName : employee) {
            System.out.println((String) employeeName);
        }

        //Lab 3
        List<String> employeeTwo = new ArrayList<String>();

        employeeTwo.add("Linda Van");
        employeeTwo.add("Carl Johnson");
        employeeTwo.add("Susan Blue");

        System.out.println("\nList of Employees using generics:");

        for (int i = 0; i < employeeTwo.size(); i++) {
            String employeeName = employeeTwo.get(i);
            System.out.println(employeeName);
        }

        System.out.println("\nList of Employees using generics and enhanced for loop:");

        //this is like saying iterate through all of the items in the employeeTwo array and
        //print them out as employeeName strings
        for (String employeeName : employeeTwo) {
            System.out.println(employeeName);
        }

        //Lab 4 (rules of equality based on rabies ID)
        Dog dogOne = new Dog("Sparky", 001);
        Dog dogTwo = new Dog("Rex", 002);
        Dog dogThree = new Dog("Speedy", 001);
        Dog dogFour = new Dog("Champ", 004);

        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dogOne);
        dogList.add(dogTwo);
        dogList.add(dogThree);
        dogList.add(dogFour);

        //to show the duplicate
        System.out.println("\nThis is a list of the dogs with the duplicates: ");
        for (Dog dogInList : dogList) {
            System.out.println(dogInList);
        }

        //use the set to remove the duplicates
        //remember sets aren't used for storing, only transforming, so 
        //clear the list and apply the contents from the set
        Set<Dog> dogSet = new LinkedHashSet<Dog>(dogList);
        dogList.clear();
        dogList.addAll(dogSet);

        System.out.println("\nThe list now doesn't have any duplicates: ");

        //output the list
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
    }

}
