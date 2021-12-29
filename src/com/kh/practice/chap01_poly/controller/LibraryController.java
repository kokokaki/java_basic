package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

    private Member mem;
    private Book[] bList;

    public LibraryController() {
        this.mem = null;
        this.bList = new Book[5];
    }
}
