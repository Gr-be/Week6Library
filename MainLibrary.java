/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public class MainLibrary {
    public static void main(String[] args){
        Library library;
        Book book1=new Book("The Cat in the Hat", "Dr.Seuss");
        Book book2=new Book("One Piece", "Eiichiro Oda");
        Book book3=new Book("Of Mice and Men", "John Steinbeck");
        Book[] books=new Book[10];
        library=new Library(books);
        library.addBooks(book3);
        library.addBooks(book2);
        library.addBooks(book1);
        
        System.out.println(library.listBooks());
        System.out.println("");
        library.borrowBook("The Cat in the Hat");
        library.borrowBook("The Cat in the Hat");
        System.out.println(library.listBooks());
        System.out.println("");
        library.returnBook("The Cat in the Hat");
        System.out.println("");
        System.out.println(library.listBooks());
        System.out.println("");
        Book book4=new Book("Spider Man", "Stan-Lee");
        library.addBooks(book4);
        
        System.out.println(library.listBooks());
        
        

        
        
        
        
    }
    
    
}
