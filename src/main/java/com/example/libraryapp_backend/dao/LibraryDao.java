package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository <Library,String> {

    @Query(value = "SELECT `id`, `author`, `book_title`, `description`, `distributor`, `image`, `language`, `price`, `publisher`, `released_year` FROM `library` WHERE `book_title` LIKE %:book_title%",nativeQuery = true)
    List<Library>SearchBook(@Param("book_title")String book_title);

    @Modifying
    @Transactional


    @Query (value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void DeleteBook(@Param("id")Integer id);

//    @Query(value = "")
//    void EditBook(@Param("book_title")String book_title);
//
//    @Query(value = "")
//    void IssueBook(@Param("book_title")String book_title);

}
