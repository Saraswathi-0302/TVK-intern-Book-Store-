package com.tvktechnologiesintern.bookstore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tvktechnologiesintern.bookstore.Entity.BookStore;
import com.tvktechnologiesintern.bookstore.Service.BookStoreService;

@RestController
@RequestMapping("/book")
public class BookStoreController
{
	@Autowired
	private BookStoreService bookStoreService;
   
	//Add Book
	@PostMapping ("/bookregister")
	public BookStore bookregister(@RequestBody BookStore bookStore)
	{
	return bookStoreService.bookregister(bookStore);
	}
	
	//List Of all books
	@GetMapping ("/getallbooks")
	public List<BookStore> getAllBooks()
	{
		return bookStoreService.getAllBooks();
	}
	
	//Search by book name
        @GetMapping ("/getbyname")	
        public List<BookStore> getByName(@RequestParam("name") String name)
        {
        	return bookStoreService.getByName(name);
        }
	  
    //Search by book author
        
         @GetMapping ("/getbyauthor")
         public List<BookStore> getByAuthor(@RequestParam("author") String author)
         {
         	return bookStoreService.getByAuthor(author);
         }
    
   //Update Book
         @PutMapping ("/updatebook")
         public BookStore updateBook(@RequestBody BookStore bookStore)
         {
         	return bookStoreService.updateBook(bookStore);
         }
         
   //Delete Book
         @DeleteMapping ("/deletebook")
         public void deleteBook(@RequestParam("id") int id)
         {
         	bookStoreService.deleteBook(id);
         }
       
   //PAgination and Sorting
         @GetMapping("/pagination")
         public Page<BookStore> getBooksByPage(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize, @RequestParam("sortBy") String sortBy) 
         {
             return bookStoreService.getBooksByPage(pageNumber, pageSize, sortBy);
         }
}
