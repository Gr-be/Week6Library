/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public class InterfaceDriver {
    public static void main(String[] args){
        Book book1= new Book("It", "Stephen King");
        Book book2= new Book("The Hunger Games", "Suzanne Collins");
        Book book3=new Book("Harry Potter", "J.K. Rowling");
        Library booklibrary;
        booklibrary=new Library();
        
        booklibrary.addBooks(book1);
        System.out.println(booklibrary.listBooks());
        
        booklibrary.addBooks(book2);
        booklibrary.addBooks(book3);
        System.out.println("");
        
        booklibrary.borrowBook("It");
        System.out.println(booklibrary.listBooks());
        System.out.println("Number of books: " +booklibrary.countAvailableBooks());
        
    }
}
