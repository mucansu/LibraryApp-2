package com.example.demo.Repository;

import com.example.demo.Entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BookRepository extends CrudRepository<Book,Long> {

}
