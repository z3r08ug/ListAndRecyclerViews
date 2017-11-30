package dev.uublabs.listandrecyclerviews;

/**
 * Created by Admin on 11/14/2017.
 */

public class Celebrity
{
    String name;
    int age;
    int weight;

    public Celebrity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Celebrity(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
