package com.cjy.model;

import java.util.List;

/**
 * 用户VO
 * @author chenjiaying
 * @date 2018年05月07日 下午 04:37
 */
public class UserVO extends User{

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
