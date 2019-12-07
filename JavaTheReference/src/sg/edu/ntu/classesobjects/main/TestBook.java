package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Author;
import sg.edu.ntu.classesobjects.classes.Book;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Paul Ronso","jacintopinto@hotmail.com",'t');
        authors[1] = new Author("Bill Gates","marckzuckerbergviado@outlook.com",'m');
        authors[2] = new Author("Picaminha","priquitin@gmail.com",'f');
        Book b1 = new Book("A Saga da PirocaMinha", authors, 50, 20);
        System.out.println(Arrays.toString(b1.getAuthors()));
        System.out.println(b1.getAuthorNames());
        System.out.println(b1.toString());
    }
}
