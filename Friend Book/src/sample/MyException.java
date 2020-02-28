package sample;

public class MyException extends Throwable {
    int age=0;
    String name = "";
    MyException(int a){
        age = a;
    }
    MyException(String n){
        name = n;
    }

    @Override
    public String toString() {
        if(age!=0){
            return (age + " is an invalid input for age");
        }
        else {
            return (name + " is an invalid input for name");
        }
    }
}
