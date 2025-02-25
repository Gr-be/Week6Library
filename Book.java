/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public class Book implements BookInterface{
    String title;
    String author;
    boolean isBorrowed;
    
    public Book(String bookTitle, String bookAuthor){
        this.title=bookTitle;
        this.author=bookAuthor;
        this.isBorrowed=false;
                
    }

    public Book() {
this.title="";
this.author="";

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean borrowBook(){
        
    if(isBorrowed==false){
        isBorrowed=true;
        return isBorrowed;
}
//        System.out.println(title+" is already borrowed.");
    return false ;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean returnBook(){
        
        if(isBorrowed==true){
            isBorrowed=false;
            return true;
        }
//        System.out.println("You don't have this book.");
        return false;
        
    }
    
    @Override
    public String toString(){
        return "Title: "+title+", Author: "+author+", Borrowed: "+isBorrowed;
        
        
    }
    
    

    
}
