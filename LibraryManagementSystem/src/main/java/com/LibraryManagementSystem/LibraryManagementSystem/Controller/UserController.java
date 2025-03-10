package com.LibraryManagementSystem.LibraryManagementSystem.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.LibraryManagementSystem.Service.LibraryService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
//@RequiredArgsConstructor
//@Tag(name = "User Controller", description = "User API for book management")
public class UserController {
    private final LibraryService libraryService;
    
    public UserController(LibraryService libraryService) {
    	this.libraryService = libraryService;
    }
    
    @PostMapping("/{userId}/issue/{bookId}")
    public ResponseEntity<String> issueBook(@PathVariable Long userId, @PathVariable Long bookId) {
        return ResponseEntity.ok(libraryService.issueBook(userId, bookId));
    }

    @PostMapping("/return/{bookId}")
    public ResponseEntity<String> returnBook(@PathVariable Long bookId) {
        return ResponseEntity.ok(libraryService.returnBook(bookId));
    }
}
