package com.shida.dao;

import com.shida.entity.Books;

import java.util.List;

public interface BooksMapper {


    /**
     * 查询所有书籍
     * @return java.util.List<com.shida.entity.Books>
     */
    List<Books> queryAllBooks();

    /**
     * 增加一个book
     * @param book
     * @return
     */
    int addBook(Books book);

    /**
     * 根据id 删除一个book
     * @param id
     * @return
     */
    int deleteBookById(int id);


    /**
     * 更新book
     * @param books
     * @return
     */
    int updateBook(Books books);


    /**
     * 根据一个id返回book
     * @param id
     * @return
     */
    Books queryBookById(int id);

}
