//Develop a Java program to create a class Book with members Book ID,Title, Author, and Price. Use a constructor to initialize the details. Include methods to display book information, overload search() to search by Book ID and Title, and create a method that accepts another Book object and returns the costlier book. Use a static member to maintain the total number of books created. In the main class, create multiple book objects

class Book {
int bookId;
String title;
String author;
double price;
static int totalBooks = 0;
Book(int bookId, String title, String author, double price) {
this.bookId = bookId;
this.title = title;
this.author = author;
this.price = price;
totalBooks++;
}
void display() {
System.out.println("Book ID : " + bookId);
System.out.println("Title : " + title);
System.out.println("Author : " + author);
System.out.println("Price : " + price);
System.out.println("-------------------------");
}
boolean search(int id) {
return this.bookId == id;
}
boolean search(String title) {
return this.title.equalsIgnoreCase(title);
}
Book costlierBook(Book other) {
if (this.price >= other.price)
return this;
else
return other;
}

static int getTotalBooks() {
return totalBooks;
}
}
public class two {
public static void main(String[] args) {

Book b1 = new Book(101, "Java Programming",
"James Gosling", 550.00);
Book b2 = new Book(102, "Python Basics",
"Guido van Rossum", 450.00);
Book b3 = new Book(103, "Data Structures",
"Mark Allen", 650.00);

System.out.println("BOOK DETAILS");
System.out.println("=========================");
b1.display();
b2.display();
b3.display();

System.out.println("Searching by Book ID 102:");
if (b2.search(102))
System.out.println("Book found: Python Basics");
else
System.out.println("Book not found.");

System.out.println("\nSearching by Title 'Data Structures':");
if (b3.search("Data Structures"))
System.out.println("Book found: Data Structures");
else
System.out.println("Book not found.");

Book costlier = b1.costlierBook(b3);
System.out.println("\nCostlier Book:");
costlier.display();


System.out.println("Total Books Created: "
+ Book.getTotalBooks());
}
}