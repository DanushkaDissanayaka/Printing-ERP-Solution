/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dxdjf
 */
public class Book {

    private String bookCode;
    private String bookName;
    private String bookType;
    private String language;
    private String subjectName;
    private String author;
    private List<Chapter> chapters;

    public Book() {
        chapters = new ArrayList<Chapter>();
    }

    /**
     * @return the bookCode
     */
    public String getBookCode() {
        return bookCode;
    }

    /**
     * @param bookCode the bookCode to set
     */
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the bookType
     */
    public String getBookType() {
        return bookType;
    }

    /**
     * @param bookType the bookType to set
     */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the chapters
     */
    public List<Chapter> getChapters() {
        return chapters;
    }

    /**
     * @param chapter the chapters to set
     */
    public void setChapters(Chapter chapter) {
        this.chapters.add(chapter);
    }
}
