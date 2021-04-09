package book;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("1", "book1", 10, "s1", "java", "");
        books[1] = new ProgrammingBook("2", "book2", 11, "s1", "java2", "");
        books[2] = new ProgrammingBook("3", "book3", 12, "s1", "java", "");
        books[3] = new ProgrammingBook("4", "book4", 13, "s1", "java2", "");
        books[4] = new ProgrammingBook("5", "book5", 14, "s1", "java", "");
        books[5] = new FictionBook("6","book6",15,"s2","code");
        books[6] = new FictionBook("7","book7",16,"s2","code");
        books[7] = new FictionBook("8","book8",17,"s2","code");
        books[8] = new FictionBook("9","book9",18,"s2","code");
        books[9] = new FictionBook("10","book10",19,"s2","code");
        ManagerBook huy = new ManagerBook(books);
        System.out.println(huy.isPrice());
        System.out.println(huy.coutnlanguage("java"));
    }
}