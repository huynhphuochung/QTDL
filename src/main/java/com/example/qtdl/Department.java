package com.example.qtdl;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Department
{
    private SimpleStringProperty idPhongBan;
    private  SimpleStringProperty tenPhongBan;

    public  Department(){
        this.idPhongBan = new SimpleStringProperty("");
        this.tenPhongBan = new SimpleStringProperty("");

    }
    public Department(String idPhongBan, String tenPhongBan) {
        this.idPhongBan = new SimpleStringProperty(idPhongBan);
        this.tenPhongBan = new SimpleStringProperty(tenPhongBan);
    }

    public String getIdPhongBan() {
        return idPhongBan.get();
    }

    public SimpleStringProperty idPhongBanProperty() {
        return idPhongBan;
    }

    public void setIdPhongBan(String idPhongBan) {
        this.idPhongBan.set(idPhongBan);
    }

    public String getTenPhongBan() {
        return tenPhongBan.get();
    }

    public SimpleStringProperty tenPhongBanProperty() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan.set(tenPhongBan);
    }


}
