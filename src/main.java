import models.borrowing;
import models.books;
import models.students;
public class main {
    public static void main(String[] args) {
      students student1 = new students("diya",12,5);
        students student2 = new students("diya",11,6);
        students student3 = new students("siya",10,7);
       books book1 = new    books("J.k Rowling","Harry Potter",12345,1990);
        books book2 = new    books("Kunjal","Ikigai",12346,1991);
        books book3 = new    books("Anna Frank","Diary of a young girl",12347,2000);
        borrowing first = new borrowing(1,10,2,10);
        borrowing second = new borrowing(2,15,1,10);
        borrowing third = new borrowing(3,16,5,10);

        book1.printFormat();
        book2.printFormat();
        book3.printFormat();
        student1.printFormat();
        student2.printFormat();
        student3.printFormat();
        first.fineRate();
        second.fineRate();
        third.fineRate();
    }
}

