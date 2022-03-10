package com.shida.service;

import com.shida.entity.Books;

import java.util.List;


public interface BooksService {


    /**
     * 查询所有书籍
     * @return
     */
    List<Books> queryAllBooks();

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);
}
