package com.company.immutability;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public final class ImmutableClasses {

  private final int id;
  private final Person person;
  private final Map<String, Person> testMap;

  public ImmutableClasses(int i, Person n, Map<String, Person> hm) {
    System.out.println("Performing Deep Copy for Object initialization");
    this.id = i;
    this.person = n.clone();
    this.testMap = hm.entrySet().stream().collect(Collectors
        .toUnmodifiableMap(Entry::getKey, entry -> entry.getValue().clone()));
  }

  private int getId() {return id;}

  public Person getPerson() {
    return person.clone();
  }

  public Map<String, Person> getTestMap() {
    return this.testMap.entrySet().stream()
        .collect(Collectors.toUnmodifiableMap(Entry::getKey, entry -> entry.getValue().clone()));
  }

}
