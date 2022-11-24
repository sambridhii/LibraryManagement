package models;

public class books {
    String Name;
    String Author;
    int ISBN;
    int Published_Year;

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {

        this.Author = Author;
    }
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {

        this.ISBN = ISBN;
    }

    public int getPublished_Year() {
        return Published_Year;
    }

    public void setPublished_Year(int Published_Year) {

        this.Published_Year = Published_Year;
    }

    public books (String Name, String Author, int ISBN, int Published_Year) {
        this.Name= Name;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Published_Year = Published_Year;
    }
    public void printFormat(){
        System.out.println("Name");
        System.out.println(this.Name);
        System.out.println("Author");
        System.out.println(this.Author);
        System.out.println("ISBN");
        System.out.println(this.ISBN);
        System.out.println("Published_Year");
        System.out.println(this.Published_Year);

    }

}

