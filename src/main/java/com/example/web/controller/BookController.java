package com.example.web.controller;

import com.example.web.dto.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("products/books")
public class BookController {

    @GetMapping("model/{isbn}")
    public String getBookModel(@PathVariable Integer isbn,
                               @RequestParam(required = false, name = "tytul", defaultValue = "cool novel") String title,
                               Model model) {
        BookDto bookDto = createBook(isbn, title);
        model.addAttribute("book", bookDto);
        model.addAttribute("bookTitle", "Model Book Page");
        return "book";
    }

    @GetMapping("model-map/{isbn}")
    public String getBookModelMap(@PathVariable Integer isbn,
                                  @RequestParam(required = false, name = "tytul", defaultValue = "cool novel") String title,
                                  ModelMap map) {
        BookDto bookDto = createBook(isbn, title);
        map.addAttribute("book", bookDto);
        map.addAttribute("bookTitle", "ModelMap Book Page");
        return "book";
    }

    @GetMapping("model-and-view/{isbn}")
    public ModelAndView getBookModelAndView(@PathVariable Integer isbn,
                                            @RequestParam(required = false, name = "tytul", defaultValue = "cool novel") String title) {
        BookDto bookDto = createBook(isbn, title);
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("book", bookDto);
        modelAndView.addObject("bookTitle", "ModelAndView Book Page");
        return modelAndView;
    }

    private BookDto createBook(Integer isbn, String title) {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(isbn);
        bookDto.setTitle(title);
        return bookDto;
    }
}
