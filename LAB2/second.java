//Develop a java program to create a class employee with members employee id, name , and salary. include methods to accept and display employee details. create multiple employee objects and display their information. 

class Employee{
    String employeeId;
    String name;
    double salary;
    public void accept(String employeeId, String name, double salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee ID: "+this.employeeId+" Name: "+this.name+" Salary: "+this.salary);
    }
}

class second{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.accept("101", "Zameer", 10000);
        Employee e2=new Employee();
        e2.accept("102", "Yuvanika", 20000);
        Employee e3=new Employee();
        e3.accept("103", "Aishwarya", 30000);
        Employee e4=new Employee();
        e4.accept("104","Aadi", 40000);
        Employee e5=new Employee();
        e5.accept("105","Yadu", 50000);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}
