package models;

public class students {
    String Name;
 int grade;
    int borrowed_books;


    public String getName() {

        return Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }


    public int getgrade() {
        return grade;
    }

    public void setgrade(int grade) {

        this.grade =grade;
    }

    public int getborrowed_books() {
        return borrowed_books;
    }

    public void setborrowed_books(int borrowed_books) {

        this.borrowed_books = borrowed_books;
    }

    public students(String Name,  int grade, int borrowed_books) {
        this.Name= Name;
        this.grade= grade;
        this.borrowed_books = borrowed_books;
    }
    public void printFormat(){
        System.out.println("The student is "+ this.Name+" of class " +this.grade+  " has "+ this.borrowed_books+" books borrowed." );
    }

}

