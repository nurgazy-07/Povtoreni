package models;

import java.util.Arrays;

public class MyClass {
 private String name;
 private String lastName;
 private int age;
 private String[] lessons;
 private String favoriteDish;

    public MyClass(String name, String lastName, int age, String[] lessons, String favoriteDish) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lessons;
        this.favoriteDish = favoriteDish;
    }

    public MyClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public String getFavoriteDish() {
        return favoriteDish;
    }

    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", lessons=" + Arrays.toString(lessons) +
                ", favoriteDish='" + favoriteDish + '\'' +
                '}';
    }
}
