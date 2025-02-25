/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public interface LibraryInterface {
    public void addBooks(BookInterface newBook);
    
    public boolean borrowBook(String title);
    
    public boolean returnBook(String title);
    
    public String listBooks();
    
    public int countAvailableBooks();
    
    
    
    
    
}
