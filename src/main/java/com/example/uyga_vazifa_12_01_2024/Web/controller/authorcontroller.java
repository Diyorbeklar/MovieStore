package com.example.uyga_vazifa_12_01_2024.Web.controller;

import com.example.uyga_vazifa_12_01_2024.Web.model.Author;
import com.example.uyga_vazifa_12_01_2024.Web.server.authorserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class authorcontroller {
    @Autowired
    authorserverimpl authorserverimpl;
   @GetMapping
   public List<Author> getauthors(){
       return authorserverimpl.getListAuthor();
   }

   @GetMapping("/{id}")
   public Author getAuthorById(@PathVariable("id") Integer id){
       return authorserverimpl.getAuthorById(id);
   }
   @PostMapping()
   public void insertAuthor(@RequestBody Author author){
       authorserverimpl.createAuthor(author);
   }
   @DeleteMapping()
    public void deleteAuthor(@RequestBody Author author){

       authorserverimpl.deleteAuthor(author.getId());
   }
   @PutMapping("/{id}")
    public void updateAuthor(@PathVariable("id") Integer id,@RequestBody Author author){
       authorserverimpl.updateAuthor(id,author);
   }

}
