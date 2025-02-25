/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author glaba
 */
public interface BookInterface {
    public String getTitle();
    
    public String getAuthor();
    
    public boolean borrowBook();
    
    public boolean returnBook();
    
    @Override
    public String toString();
    
    
    
    
}
