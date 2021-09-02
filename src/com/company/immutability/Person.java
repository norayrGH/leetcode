package com.company.immutability;

public class Person implements Cloneable {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(Person person) {
    this.name = person.getName();
    this.age = person.getAge();
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  protected Person clone() {
    try {
      return (Person) super.clone();
    } catch (CloneNotSupportedException e) {
      return new Person(this);
    }
  }
}
