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
        System.out.printf("관리자 \'%s\'가 책을 추가합니다:\'%s\',\'%s\'\n",manager.name,title,author);
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

    public void borrowreturnBook(Book book) {
        if(!book.isBorrowed) {
            System.out.printf("이용자 \'%s\' \'%s\'대출합니다.\n ",name,book.title);
            book.isBorrowed = true;
        }
        else
            book.isBorrowed = false;
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

//class Manager extends User {
//    public Manager(String userId, String name) {
//        super(userId, name);
//    }
//
//    public void addBook(Book book, Library library) {
//        library.addBook(book);
//    }
//
//    public void removeBook(Book book, Library library) {
//        library.removeBook(book);
//    }
//}


class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Book writeBook(String isbn, String title, String author, User manager) {
        if(!checkBook(isbn,manager)){
            Book book = new Book(isbn, title, author,manager);
            books.add(book);
            return book;
        }
    }
    public boolean checkBook(String isbn,User manager) {
        boolean found = false;
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                System.out.printf("관리자 \'%s\' 새로운 책 %s - %s 추가합니다.", manager.name,book.title, book.author);
                found = true;
                break;
            }
        }
        return found;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void adduser(User member) {
        users.add(member);
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

        member1.borrowreturnBook(book1);
        System.out.println();

        Book book6 = library.writeBook("0001", "자바의 구름", "제임스밤",manager1);

//        Book book2 = library.writeBook("0002", "Book2", "Author2");

//        User member= new user("U001", "Kim","member");
//        User manager = new user("U002", "Song","manager");
//
//
//        member.borrowreturnBook(book1);
//        System.out.println("책을 빌립니다: " + book1.title);
//        member.borrowreturnBook(book1);
//        System.out.println("책을 반납합니다: " + book1.title);
    }
}
