package com.tvktechnologiesintern.bookstore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="book_store")
@Data
public class BookStore 
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private String author;
 private String publisher; 
 private String category;
 private double price;
 
}
  