/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

/**
 *
 * @author dxdjf
 */
public class Chapter {

    private String bookCode;
    private String ChapterCode;
    private String ChapterName;
    private int noOfPages;
    private String materialCode;

    /**
     * @return the materialCode
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * @param materialCode the materialCode to set
     */
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
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
     * @return the ChapterCode
     */
    public String getChapterCode() {
        return ChapterCode;
    }

    /**
     * @param ChapterCode the ChapterCode to set
     */
    public void setChapterCode(String ChapterCode) {
        this.ChapterCode = ChapterCode;
    }

    /**
     * @return the ChapterName
     */
    public String getChapterName() {
        return ChapterName;
    }

    /**
     * @param ChapterName the ChapterName to set
     */
    public void setChapterName(String ChapterName) {
        this.ChapterName = ChapterName;
    }

    /**
     * @return the noOfPages
     */
    public int getNoOfPages() {
        return noOfPages;
    }

    /**
     * @param noOfPages the noOfPages to set
     */
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
