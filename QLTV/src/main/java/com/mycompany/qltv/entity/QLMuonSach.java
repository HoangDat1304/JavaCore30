/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qltv.entity;

/**
 *
 * @author DAT
 */
public class QLMuonSach {
    BanDoc banDoc;
    Sach sach;

    public QLMuonSach(BanDoc banDoc, Sach sach) {
        this.banDoc = banDoc;
        this.sach = sach;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }
    
    
    
}
