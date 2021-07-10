/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TestCode{
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<Person>();

        for(int i = 0; i < 10; i++){
            System.out.println("enter info: ");
            String name = input.next();
            String age = input.next();
            String phone = input.next();
            String location = input.next();
            peopleList.add(new Person(name, Integer.parseInt(age), Integer.parseInt(phone), location));

            for(Person p: peopleList)
                 System.out.println(p.toString());
        }
    }
}

class Person{
    String name;
    int age;
    int phoneNumber;
    String location;

    Person(String n, int a, int p, String l){
        this.name = n;
        this.age = a;
        this.phoneNumber = p;
        this.location = l;
    }

    public String toString(){
        return(name + " " + age + " " + phoneNumber + " " + location);
    }
}
