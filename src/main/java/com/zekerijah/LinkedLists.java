package com.zekerijah;

// LinkedList is made od multiple nodes, each node has reference to next and prev node, except head and tail node

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<Person> personList = new LinkedList<>();

        personList.add(new Person("Jon", 18));
        personList.add(new Person("Jane", 20));
        personList.addFirst(new Person("Micky", 30));

        ListIterator<Person> personIterator = personList.listIterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }

        while (personIterator.hasPrevious()) {
            System.out.println(personIterator.previous());
        }

        }
    static record Person(String name, int age) {}

};



