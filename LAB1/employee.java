class Employee {
    int id;
    String name;

    public void display(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.display(10, "John");
        System.out.println(E1.id);
        System.out.println(E1.name);
    }
}
