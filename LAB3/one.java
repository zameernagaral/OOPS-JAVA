//WAJP to create a class student name and age. display name and age. create an array of objects of size 5. read the values from user and display it. 
import java.util.Scanner;

class Student {
    String name;
    int age;

    public void accept(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}

class one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] s1 = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name and age for student " + (i + 1) + ":");
            s1[i] = new Student();
            s1[i].accept(s.next(), s.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            s1[i].display();
        }
    }
}
