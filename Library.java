/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public class Library implements LibraryInterface {

    Book[] libraryBooks;

    public Library() {
        libraryBooks = new Book[10];

    }

    public Library(Book[] books) {
        libraryBooks = books;

    }

    @Override
    public boolean borrowBook(String title) {
        for (int i = 0; i < libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && title.equals(libraryBooks[i].getTitle())) {
                return libraryBooks[i].borrowBook();

            }

        }
        return false;
    }

    @Override
    public boolean returnBook(String title) {
        for (int i = 0; i < libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && title.equals(libraryBooks[i].getTitle())) {
                return libraryBooks[i].returnBook();
            }
        }
        return false;
    }

    @Override
    public String listBooks() {
        String books = "";
        for (int book = 0; book < libraryBooks.length - 1; book++) {
            if (libraryBooks[book] != null) {

                books += (libraryBooks[book]) + "\n";
            }
        }
        return books;
    }

    @Override
    public void addBooks(BookInterface newBook) {

        for (int n = 0; n <= libraryBooks.length - 1; n++) {

            if (libraryBooks[n] == null) {
                libraryBooks[n] = (Book) newBook;
                break;

            }

            if (libraryBooks.length - 1 == n) {
                Book[] expandLibrary = new Book[libraryBooks.length * 2];

                for (int counter = 0; counter <= libraryBooks.length - 1; counter++) {
                    expandLibrary[counter] = libraryBooks[counter];

                }
                libraryBooks = expandLibrary;

            }

        }

    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && title.equalsIgnoreCase(libraryBooks[i].getTitle())) {
                return libraryBooks[i];//.toString();

            }
        }
        return null; //"Could not find the book you are looking for.";
    }

    Book searchByAuthor(String title) {

        for (int i = 0; i < libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && title.equalsIgnoreCase(libraryBooks[i].getAuthor())) {
                return libraryBooks[i];//.toString();

            }
        }
        return null; //"Could not find the book you are looking for.";
    }

    @Override
    public int countAvailableBooks() {
        int total = 0;
        for (int i = 0; i <= libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && libraryBooks[i].isBorrowed==false) {
                total += 1;
            }
        }

        return total;
    }
    
    public int countBorrowedBooks(){
        int total=0;
        for (int i = 0; i <= libraryBooks.length - 1; i++) {
            if (libraryBooks[i] != null && libraryBooks[i].isBorrowed==true) {
                total += 1;
            }
        }

        return total;
    }
        
    
    

}
