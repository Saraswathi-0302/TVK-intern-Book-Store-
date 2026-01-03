package com.tvktechnologiesintern.bookstore.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.tvktechnologiesintern.bookstore.Entity.BookStore;
import com.tvktechnologiesintern.bookstore.Repository.BookStoreRepository;

@Repository
public class BookStoreDao
{

	@Autowired
	private BookStoreRepository bookStoreRepository;
	
	public BookStore registerBook(BookStore bookstore)
	{
		BookStore store = bookStoreRepository.save(bookstore);
		return  store;
	}
	
	
	public List<BookStore> getAllBooks()
	{
		return bookStoreRepository.findAll();
	}
	
	public List<BookStore> findByName(String name)
    {
        return bookStoreRepository.findByNameContainingIgnoreCase(name);
    }
	
	
	public List<BookStore> findByAuthor(String author)
    {
        return bookStoreRepository.findByAuthorContainingIgnoreCase(author);
    }
	
	public BookStore updateBook(BookStore bookStore)
	{
		BookStore store = bookStoreRepository.save(bookStore);
        return store;
	}
	public void deleteBook(int id)
    {
        bookStoreRepository.deleteById(id);
    }
	
	//Pagination and Sorting
	public Page<BookStore> getBooksByPage(int pageNumber, int pageSize, String sortBy)
	{
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
		 return bookStoreRepository.findAll(pageable);
	}
       
   
	
}