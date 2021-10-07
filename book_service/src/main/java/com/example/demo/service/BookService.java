package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {

	@Autowired
	private Book book;
	
	public Book getBookById(int id) {
		book.setBookId(202);
		book.setBookName("Whose Book");
		book.setAuthor("Myself");
		
		if(id==1){
			book.setBookId(203);
			book.setBookName("My Book");
			book.setAuthor("Myself");
		}
		return this.book;
	}
}
