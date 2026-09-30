//Develop a java program to create a class student with members usn and name. Include methods to accept and display student details. Create multiple student object and display their information.


class Student{
    String usn;
    String name;
    public void accept(String usn, String name){
        this.usn=usn;
        this.name=name;
    }
    public void display(){
        System.out.println("USN: "+this.usn+" Name: "+this.name);
    }
}

class one{
    public static void main(String[] args){
        Student s1=new Student();
        s1.accept("101", "Zameer");
        Student s2=new Student();
        s2.accept("102", "Yuvanika");
        Student s3=new Student();
        s3.accept("103", "Aishwarya");
        Student s4=new Student();
        s4.accept("104","Aadi");
        Student s5=new Student();
        s5.accept("105","Yadu");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}