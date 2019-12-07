package sg.edu.ntu.classesobjects.main;

import sg.edu.ntu.classesobjects.classes.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Miguel Cervantes", "@cervantesfoundation@outlook.com,", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a1.getEmail());
        a1.setEmail("@cervantesfundacion@outlook.com");
        System.out.println(a1.toString());
    }
}
