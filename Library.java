/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public class Library {

    Book[] libaryBooks;

    public Library() {
        libaryBooks = new Book[10];

    }

    public Library(Book[] books) {
        libaryBooks = books;

    }

    public boolean borrowBook(String title) {
        for (int i = 0; i < libaryBooks.length - 1; i++) {
            if (libaryBooks[i] != null && title.equals(libaryBooks[i].getTitle())) {
                return libaryBooks[i].borrowBook();

            }

        }
        return false;
    }

    public boolean returnBook(String title) {
        for (int i = 0; i < libaryBooks.length - 1; i++) {
            if (libaryBooks[i] != null && title.equals(libaryBooks[i].getTitle())) {
                return libaryBooks[i].returnBook();
            }
        }
        return false;
    }

    public String listBooks() {
        String books = "";
        for (int book = 0; book < libaryBooks.length - 1; book++) {
            if (libaryBooks[book] != null) {

                books += (libaryBooks[book]) + "\n";
            }
        }
        return books;
    }

    public void addBooks(Book newBook) {

        for (int n = 0; n <= libaryBooks.length - 1; n++) {

            if (libaryBooks[n] == null) {
                libaryBooks[n] = newBook;
                break;

            }

            if (libaryBooks.length - 1 == n) {
                Book[] expandLibrary = new Book[libaryBooks.length * 2];

                for (int counter = 0; counter <= libaryBooks.length - 1; counter++) {
                    expandLibrary[counter] = libaryBooks[counter];

                }
                libaryBooks = expandLibrary;

            }

        }

    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < libaryBooks.length - 1; i++) {
            if (libaryBooks[i] != null && title.equalsIgnoreCase(libaryBooks[i].getTitle())) {
                return libaryBooks[i];//.toString();

            }
        }
        return null; //"Could not find the book you are looking for.";
    }

    Book searchByAuthor(String title) {

        for (int i = 0; i < libaryBooks.length - 1; i++) {
            if (libaryBooks[i] != null && title.equalsIgnoreCase(libaryBooks[i].getAuthor())) {
                return libaryBooks[i];//.toString();

            }
        }
        return null; //"Could not find the book you are looking for.";
    }

    public int countAvailableBooks() {
        int total = 0;
        for (int i = 0; i <= libaryBooks.length - 1; i++) {
            if (libaryBooks[i] != null) {
                total += 1;
            }
        }

        return total;
    }

}
