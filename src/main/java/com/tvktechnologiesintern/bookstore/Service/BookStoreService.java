package com.tvktechnologiesintern.bookstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.tvktechnologiesintern.bookstore.Dao.BookStoreDao;
import com.tvktechnologiesintern.bookstore.Entity.BookStore;

@Service
public class BookStoreService 
{
  @Autowired
  private BookStoreDao bookStoreDao;

//Add new book
public BookStore bookregister(BookStore bookStore) { 
	
	return bookStoreDao.registerBook(bookStore);
	
}

//List of all books
public List<BookStore> getAllBooks()
{
	return bookStoreDao.getAllBooks();
}
 
//Search by book name
public List<BookStore> getByName(String name)
{
	return bookStoreDao.findByName(name);
}

//Search by book author
public List<BookStore> getByAuthor(String author)
{
	return bookStoreDao.findByAuthor(author);
}

//Update book
public BookStore updateBook(BookStore bookStore)
{
	return bookStoreDao.updateBook(bookStore);
}

//Delete book

public void deleteBook(int id)
{
	bookStoreDao.deleteBook(id);
}
//Pagination

public Page <BookStore> getBooksByPage(int pageNumber, int pageSize, String sortBy)
{
    return bookStoreDao.getBooksByPage(pageNumber, pageSize, sortBy);
}
}
