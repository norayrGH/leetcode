package com.company.immutability;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args)  {
    HashMap<String, Person> h1 = new HashMap<>();
    var h1Person = new Person("Azat", 15);
    h1.put("1", h1Person);
    var h2Person = new Person("Tolik", 56);
    h1.put("2", h2Person);
    var person = new Person("Norayr", 25);

    int i = 10;

    ImmutableClasses ce = new ImmutableClasses(i, person, h1);

    //Lets see whether its copy by field or reference
    System.out.println(person == ce.getPerson());
    System.out.println(h1 == ce.getTestMap());
    //print the ce values
    System.out.println("ce person name:" + ce.getPerson().getName());
    System.out.println("ce testMap:" + ce.getTestMap());
    //change the local variable values
    i = 20;
    person.setName("Valod");
    person.setAge(10);
    h1.put("3", new Person("Karen", 6));
    h1.get("1").setName("Armen");
    System.out.println(ce.getTestMap().get("1").getName());
    //print the values again
    Map<String, Person> clonedMap = ce.getTestMap();
    clonedMap.get("1").setName("Armen");
    System.out.println(ce.getTestMap().get("1").getName());

  }
}
