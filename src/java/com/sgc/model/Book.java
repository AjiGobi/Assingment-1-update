/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.model;

/**
 *
 * @author Gobishanth
 */
public class Book {
    String bookid;
    String title;
    String author;
    String mainClassification;
    String subClassification;
    String yearOfPublishing;
    String lastPrintedYear;
    String isbnNo;
    String noOfPages;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMainClassification() {
        return mainClassification;
    }

    public void setMainClassification(String mainClassification) {
        this.mainClassification = mainClassification;
    }

    public String getSubClassification() {
        return subClassification;
    }

    public void setSubClassification(String subClassification) {
        this.subClassification = subClassification;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getLastPrintedYear() {
        return lastPrintedYear;
    }

    public void setLastPrintedYear(String lastPrintedYear) {
        this.lastPrintedYear = lastPrintedYear;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }
    
    
    
    
}
