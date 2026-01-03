package com.tvktechnologiesintern.bookstore.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tvktechnologiesintern.bookstore.Entity.BookStore;

public interface BookStoreRepository  extends JpaRepository<BookStore, Integer>
{
  List<BookStore> findByNameContainingIgnoreCase(String name);
  List<BookStore> findByAuthorContainingIgnoreCase(String author);
  Page<BookStore> findByCategory(String category, Pageable pageable);
}
