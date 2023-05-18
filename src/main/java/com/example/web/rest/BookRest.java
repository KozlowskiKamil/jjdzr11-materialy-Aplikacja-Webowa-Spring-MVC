package com.example.web.rest;

import com.example.web.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products/books")
public class BookRest {

    @GetMapping("novels/{id}")
    public BookDto getBook(@PathVariable int id){
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(id);
        bookDto.setTitle("cool novel");
        return bookDto;
    }

    @GetMapping("novels/{id}/")
    public BookDto getBook(@PathVariable String name){
        BookDto bookDto = new BookDto();
        bookDto.setTitle("name");
        return bookDto;
    }
}
