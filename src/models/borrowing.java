package models;

public class borrowing {
    int bookId;
    int studentId;
    int extradays;
    int fineRate;


    public int getbookId() {
        return bookId;
    }

    public void setbookId(int bookId) {

        this.bookId = bookId;
    }

    public int getstudentId() {
        return studentId;
    }

    public void setstudentId(int studentId) {

        this.studentId = studentId;
    }

    public int getextradays() {
        return extradays;
    }

    public void setextradays(int extradays) {

        this.extradays = extradays;
    }
    public int getfineRate() {
        return fineRate;
    }

    public void setfineRate(int fineRate) {

        this.fineRate = fineRate;
    }
    public borrowing(int bookId, int studentId, int extradays, int fineRate) {
        this.bookId= bookId;
        this.studentId= studentId;
        this.extradays = extradays;
        this.fineRate = fineRate;
    }

    public void fineRate(){
        double fineRate = (this.fineRate*this.extradays);

        System.out.println("The total fine for bookId "+ this.bookId+ " for " +this.extradays+  " extra days is "+ this.fineRate);
    }

}
