package com.example.web.rest;

import com.example.web.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/books")
public class BooksRestController {

    @GetMapping("best")
    public BookDto getTheBest() {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(1);
        bookDto.setTitle("best book");
        return bookDto;
    }

    @GetMapping("novels/{isbn}")
    public BookDto getBook(@PathVariable Integer isbn,
                           @RequestParam(required = false, name = "tytul", defaultValue = "cool novel") String title) {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(isbn);
        bookDto.setTitle(title);
        return bookDto;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("novels")
    public BookDto create(@RequestBody BookDto bookDto) {
        // some code to save a book
        return bookDto;
    }
}
