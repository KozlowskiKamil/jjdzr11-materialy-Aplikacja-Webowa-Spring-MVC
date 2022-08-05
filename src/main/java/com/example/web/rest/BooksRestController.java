package com.example.web.rest;

import com.example.web.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
