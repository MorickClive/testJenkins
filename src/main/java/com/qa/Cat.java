package com.qa;

// This cat class is designed to be verified by Sonarqube analysis
public class Cat {
    protected String name, colourFur;
    protected int age;

    Cat(String name, int age, String colourFur){
        this.name = name;
        this.age = age;
        this.colourFur = colourFur;
    }

    // This method will have coverage due to being validated by Junit testing.
    public String getDescription(){
        return "My name is " +
                name + ", I'm a " +
                age + " year old cat and my fur is best described as: " +
                colourFur;
    }

    //============
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColourFur() {
        return colourFur;
    }

    public void setColourFur(String colourFur) {
        this.colourFur = colourFur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
