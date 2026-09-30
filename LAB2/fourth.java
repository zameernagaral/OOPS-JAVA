//Create a class rectangle with members length and breadth. write methods to calculate and display area and perimeter. create multiple rectangle objects. 

class Rectangle{
    double length;
    double breadth;
    public void accept(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void display(){
        System.out.println("Length: "+this.length+" Breadth: "+this.breadth+" Area: "+this.length*this.breadth+" Perimeter: "+2*(this.length+this.breadth));
    }
}

class fourth{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.accept(10, 20);
        Rectangle r2=new Rectangle();
        r2.accept(30, 40);
        Rectangle r3=new Rectangle();
        r3.accept(50, 60);
        Rectangle r4=new Rectangle();
        r4.accept(70, 80);
        Rectangle r5=new Rectangle();
        r5.accept(90, 100);
        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
    }
}