package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    public String name;
    private int age;
    private String gender;

    //Constructor

    public Friend(String name, int age, String gender) {
        boolean nameInput = true;
        boolean ageInput = true;

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Getters

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Display the name not location
    public String toString(){
        return name;
    }

    //Write to a file
    public void writeToFile() throws IOException{
        FileWriter fw = new FileWriter("Friend.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name +",\r");
        bw.write(Integer.toString(getAge())+ ",\r");
        bw.write(getGender()+"\r");
        bw.write(";\r");
        bw.close();

    }
    public void writeToMaleFile() throws IOException{
        FileWriter fw = new FileWriter("Male.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write(Integer.toString(getAge())+",\r");
        bw.write(getGender()+"\r");
        bw.write(";\r");
        bw.close();
    }
    public void writeToFemaleFile() throws IOException{
        FileWriter fw = new FileWriter("Female.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write(Integer.toString(getAge())+",\r");
        bw.write(getGender()+"\r");
        bw.write(";\r");
        bw.close();
    }


}
