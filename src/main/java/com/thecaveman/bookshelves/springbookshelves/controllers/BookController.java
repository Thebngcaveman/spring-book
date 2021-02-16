package com.thecaveman.bookshelves.springbookshelves.controllers;

import com.thecaveman.bookshelves.springbookshelves.model.Book;
import com.thecaveman.bookshelves.springbookshelves.service.BookService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listOfBooks",bookService.getAllBooks());
        return "home";
    }

    @RequestMapping("/newBookForm")
    public String showNewBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book",book);
        return "new_book";
    }

    @RequestMapping(value = "/saveBook",method = RequestMethod.POST)
    public String saveBook(@ModelAttribute Book book){
        bookService.saveBook(book);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView EditBookFromId(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("edit_book");
        Book book = bookService.getBookById(id);
        modelAndView.addObject("book",book);
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteHeroById(@PathVariable(name="id") Long id){
        bookService.deleteBookById(id);
        return "redirect:/";
    }

}
