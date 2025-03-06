package com.example.qtdl;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Position {
    private  SimpleStringProperty idChucVu;
    private  SimpleStringProperty tenChucVu;
    private SimpleLongProperty luongCoBan;

    public Position(){
        this.idChucVu = new SimpleStringProperty("");
        this.tenChucVu = new SimpleStringProperty("");
        this.luongCoBan = new SimpleLongProperty(0);
    }

    public Position(String idChucVu, String tenChucVu, long luongCoBan){
        this.idChucVu = new SimpleStringProperty(idChucVu);
        this.tenChucVu = new SimpleStringProperty(tenChucVu);
        this.luongCoBan = new SimpleLongProperty(luongCoBan);
    }

    public String getIdChucVu() {
        return idChucVu.get();
    }

    public SimpleStringProperty idChucVuProperty() {
        return idChucVu;
    }

    public void setIdChucVu(String idChucVu) {
        this.idChucVu.set(idChucVu);
    }

    public String getTenChucVu() {
        return tenChucVu.get();
    }

    public SimpleStringProperty tenChucVuProperty() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu.set(tenChucVu);
    }

    public long getLuongCoBan() {
        return luongCoBan.get();
    }

    public SimpleLongProperty luongCoBanProperty() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan.set(luongCoBan);
    }
}
