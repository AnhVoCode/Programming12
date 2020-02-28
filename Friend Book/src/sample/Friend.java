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
        while (nameInput){
            try {
                System.out.println("Input first and last name:");
                nameInput = false;
                String temp = name;
                nameCheck(temp);
            } catch (MyException e) {
                System.out.println(e);
                nameInput =true;
            }
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //Name Check Method
    static void nameCheck(String n) throws MyException{
        int spaceCount = 0;
        if(n.length()<4){
            throw new MyException(n);
        }
        for(int i=0;i<n.length();i++){
            if(i==n.length()-1) break;
            if(n.substring(i,i+1).equals(" ")) spaceCount++;
        }
        if(spaceCount<1){
            throw new MyException(n);
        }
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
