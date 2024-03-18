//Requirements:​
//
//        Read Data: Read the book data from the file and store it in suitable data structures (e.g., ArrayList).​
//
//        Average Rating: Calculate and display the average rating of all the books.​
//
//        Highest-Rated Book: Identify and print the details of the book with the highest rating.​
//
//        Books by Author: Allow the user to input an author's name and display all books written by that author.​
//


public class Book {
    public String title;
    public String raiting;
    public String genre;
    public String author ;
    public int age;
    public Book (String title, String author, String raiting) {
        this.title = title;
        this.author = author;
        this.raiting = raiting;
//        f()
//        f()
//        f()
//        f()
        this.age = 34;
    }


    public void reg() {
        getOldPass();
        System.out.println(this.title);
    }
    protected static void getOldPass() {

    }
    protected static void readData(){

    }


}
