package com.LibraryManagementSystem.LibraryManagementSystem.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.LibraryManagementSystem.Entity.User;
import com.LibraryManagementSystem.LibraryManagementSystem.Service.LibraryService;

import org.springframework.web.bind.annotation.RequestBody;

//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin")
//@RequiredArgsConstructor
//@Tag(name = "Admin Controller", description = "Admin API for managing library records")
public class AdminController {
    @Autowired
	private final LibraryService libraryService;
    
    public AdminController(LibraryService libraryService) {
    	this.libraryService = libraryService; 
    }
    
    @PostMapping("/createUser")
    public ResponseEntity<Map<String,Object>> createUser(@RequestBody User user) {
    	return libraryService.createUser(user);	
    }
    
    @PostMapping("/createBook")
    public ResponseEntity<Map<String,Object>> createBook(@RequestBody Book book) {
    	return libraryService.createBook(book);	
    }
    
    
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(libraryService.getAllBooks());
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(libraryService.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(libraryService.getUserById(id));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(libraryService.getBookById(id));
    }
}
