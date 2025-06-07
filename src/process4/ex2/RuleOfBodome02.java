package process4.ex2;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;


class Book {
    public String isbn;
    public String title;
    public String author;
    public boolean isBorrowed;
    public Book(String isbn, String title, String author,User manager) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}

abstract class User {
    public String userId;
    public String name;
    public boolean manager;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        if(userId.charAt(0)=='M'){
            this.manager = true;
            System.out.printf("새로운 관리자 \'%s\'를 등록합니다.\n",name);
        }
        else{
            this.manager = false;
            System.out.printf("새로운 이용자 \'%s\'를 등록합니다.\n",name);
        }
    }

    public void borrowBook(Book book) {
        if(!book.isBorrowed) {
            if(manager)
                System.out.printf("관리자 \'%s\' \'%s\'대출합니다.\n ",name,book.title);
            else
                System.out.printf("이용자 \'%s\' \'%s\'대출합니다.\n ",name,book.title);
            book.isBorrowed = true;
        }
        else{
            System.out.printf("\'%s\'은 대출중입니다.\n",book.title);
        }
    }
    public void returnBook(Book book) {
        if(book.isBorrowed) {
            if(manager)
                System.out.printf("관리자 \'%s\' \'%s\'반납합니다.\n ",name,book.title);
            else
                System.out.printf("이용자 \'%s\' \'%s\'반납합니다.\n ",name,book.title);
            book.isBorrowed = false;
        }
    }

    abstract void addBook(String userId,Book book, Library library);
    abstract void removeBook(Book book, Library library);

}

class Users extends User {
    public Users(String userId, String name) {
        super(userId, name);
    }

    public void addBook(String userId,Book book, Library library) {
        System.out.println("Member can't add book");
    }
    public void removeBook(Book book, Library library) {
        System.out.println("Member can't remove book");
    }
}

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Book writeBook(String isbn, String title, String author, User manager) {

        Book book = new Book(isbn, title, author,manager);
        if(!checkBook(isbn,manager)){
            System.out.printf("관리자 \'%s\'가 책을 추가합니다:\'%s\',\'%s\'\n",manager.name,title,author);
            books.add(book);
        }
        return book;
    }
    public boolean checkBook(String isbn,User manager) {
        boolean found = false;
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                System.out.printf("관리자 \'%s\' 새로운 책 %s - %s 추가합니다.\n", manager.name,book.title, book.author);
                found = true;
                break;
            }
        }
        return found;
    }


    public void adduser(User member) {
        users.add(member);
    }
    public void findbook(String namee){
        System.out.printf("저자 \'%s\'의 책 목록:\n",namee);
        for(Book book : books){
            if(book.author.equals(namee)){
                if(book.isBorrowed)
                    System.out.printf("- %s, 대출 불가\n",book.title);
                else
                    System.out.printf("- %s, 대출 가능\n",book.title);
            }
        }
    }
}

public class RuleOfBodome02 {
    public static void main(String[] args) {
        Library library = new Library();
        User manager1= new Users("M001","세이코");
        User member1 = new Users("U001","메리");
        User member2 = new Users("U002","만옥");
        System.out.println();
        library.adduser(manager1);
        library.adduser(member1);
        library.adduser(member2);

        Book book1 = library.writeBook("0001", "자바의 구름", "제임스밤",manager1);
        Book book2 = library.writeBook("0002", "파이썬 마스터", "한송희",manager1);
        Book book3 = library.writeBook("0003", "에너지 플로우", "키네틱스",manager1);
        Book book4 = library.writeBook("0004", "화성에서의 기억", "한송희",manager1);
        Book book5 = library.writeBook("0005", "야채의 비밀", "송은정",manager1);
        System.out.println();

        member1.borrowBook(book1);
        System.out.println();

        Book book6 = library.writeBook("0006", "자료구조의 언덕", "황수",manager1);
        Book book7 = library.writeBook("0007", "그곳에 가면", "한송희",manager1);
        System.out.println();

        Book book8 = library.writeBook("0006", "자료구조의 언덕", "황수",manager1);
        Book book9 = library.writeBook("0007", "그곳에 가면", "한송희",manager1);
        System.out.println();
        member2.borrowBook(book1);
        System.out.println();
        member1.returnBook(book1);
        System.out.println();
        manager1.borrowBook(book4);
        System.out.println();
        library.findbook("한송희");
    }
}
