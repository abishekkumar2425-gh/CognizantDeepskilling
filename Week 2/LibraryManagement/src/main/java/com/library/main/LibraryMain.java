package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class LibraryMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookservice = context.getBean(BookService.class);
        BookRepository bookrepository = context.getBean(BookRepository.class);

        bookservice.addBook();
        bookservice.findBook();

        bookrepository.saveBook();
        bookrepository.searchBook();
    }
}
