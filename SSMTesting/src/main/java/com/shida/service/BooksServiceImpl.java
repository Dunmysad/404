package com.shida.service;

import com.shida.dao.BooksMapper;
import com.shida.entity.Books;

import java.util.List;


public class BooksServiceImpl implements BooksService{


    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    /**
     * 查询所有书籍
     * @return
     */
    public List<Books> queryAllBooks(){
        return booksMapper.queryAllBooks();
    }

    @Override
    public int addBook(Books book) {
        return booksMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }
}
