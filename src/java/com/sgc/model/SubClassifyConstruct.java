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
public class SubClassifyConstruct {
    
    String subId;
    String subName;
    String mainId;
    
    public SubClassifyConstruct(String id,String name){
        subId = id;
        subId = name;
    }
    public SubClassifyConstruct(String id, String name, String mId){
        subId = id;
        subName = name;
        mainId = mId;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }
    
}
