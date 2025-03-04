package net.smileyzone;

public class Person {
    // don’t touch anything here, it's your super
    //instance variables
    private String name;
    private boolean nameTruth;

    //no parameter constructor======================
    public Person(){
        name = "No name Yet";
        nameTruth = false;
    }
    //one parameter constructor======================
    public Person(String initialName){
        name = initialName;
        nameTruth = false;
    }
    //set name method================================
    public void setName(String newName){
        name = newName;
    }
    //to String method================================
    public String toString(){
        return "Name: " + name;
    }
    //set truth of names=============================
    public void setTruth(Person otherPerson){
        nameTruth = this.name.equalsIgnoreCase(otherPerson.name);
    }
    //get methods================================
    public String getName(){
        return name;
    }
    public boolean getTruth(){
        return nameTruth;
    }
}

