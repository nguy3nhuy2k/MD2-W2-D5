package book;

public class ManagerBook {
    protected static Book books[];
    public static Book[] getBooks(){
        return books;
    }
    public static void setBooks(Book[] books){
        ManagerBook.books = books;
    }
    public ManagerBook(){

    }
    public ManagerBook(Book books[]){
        this.books=books;

    }
    public int isPrice(){
        int total = 0;
        for (Book o : books
             ) {
            total += o.getPrice();
        }
        return total;
    }
    public int coutnlanguage(String language){
        int count = 0;
        for (int i = 0; i < books.length ; i++) {
            if(books[i] instanceof ProgrammingBook){
                if (((ProgrammingBook)books[i]).getLanguage()=="java"){
                    count++;
                }
            };
        }
        return count;
    }

}
