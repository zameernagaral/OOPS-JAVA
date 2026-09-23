import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Average is " + (float)(this.marks1+this.marks2+this.marks3)/3);
    }
}

class studentMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Roll No, Name, and 3 Marks:");
        Student s1 = new Student(s.nextInt(), s.next(), s.nextInt(), s.nextInt(), s.nextInt());
        s1.display();
    }
}


