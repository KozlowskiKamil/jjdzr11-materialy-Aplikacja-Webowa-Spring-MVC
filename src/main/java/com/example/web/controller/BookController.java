package com.example.web.controller;

import com.example.web.dto.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("products/books")
public class BookController {

    public String getBookModel(Integer isbn,
                               String title) {
        BookDto bookDto = createBook(isbn, title);
        return null;
    }

    public String getBookModelMap(Integer isbn,
                                  String title) {
        BookDto bookDto = createBook(isbn, title);
        return null;
    }

    public ModelAndView getBookModelAndView(Integer isbn,
                                            String title) {
        BookDto bookDto = createBook(isbn, title);
        return null;
    }

    private BookDto createBook(Integer isbn, String title) {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(isbn);
        bookDto.setTitle(title);
        return bookDto;
    }
}
