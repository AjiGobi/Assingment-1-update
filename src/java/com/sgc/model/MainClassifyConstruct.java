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
public class MainClassifyConstruct {
    String mainId;
    String mainName;
public MainClassifyConstruct(String id, String name) {
        super();
        this.mainId = id;
        this.mainName = name;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }
    
}
