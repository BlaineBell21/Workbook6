package com.pluralsight.streams;

import com.pluralsight.People;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        ArrayList<People> people = new ArrayList<>();
        List<People> matchedName = new ArrayList<>();
        People p1 = new People("Tyrell", "Mason", 15);
        People p2 = new People("Vaughn", "Velasquez", 60);
        People p3 = new People("Ruth", "Vance", 35);
        People p4 = new People("Angie", "Gomez", 26);
        People p5 = new People("Alta", "Galloway", 19);
        People p6 = new People("Moshe", "English", 42);
        People p7 = new People("Danielle", "Hall", 51);
        People p8 = new People("Lelia", "Sims", 23);
        People p9 = new People("Beulah", "Rosario", 29);
        People p10 = new People("Maria", "Olson", 37);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

//        int totalAge = 0;
//
//        for (People person : people){
//            totalAge += person.getAge();
//        }
//        int amountOfPeople = people.size();
//        double averageAge = (double) totalAge / amountOfPeople;
//
//        System.out.println(averageAge);

        Scanner input = new Scanner(System.in);

        System.out.println("would you like to search by first name or last name");
        System.out.println("enter in \"first\" or \"last\"");
        String choice = input.nextLine();

        System.out.println("enter in the first name of the person youd like to find");
        String name = input.nextLine();
        switch (choice){
            case "first":
                people.stream()
                        .filter(person -> person.getFirstName().equals(name)) //finds each name = to target
                        .forEach(person -> System.out.println(person.getFirstName())); //prints every name that = target
                break;
            case "last":
                people.stream()
                        .filter(person -> person.getLastName().equals(name))
                        .forEach(person -> System.out.println(person.getLastName()));
                break;
        }
    }
}
