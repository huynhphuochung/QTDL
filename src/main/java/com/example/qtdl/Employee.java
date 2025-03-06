package com.example.qtdl;

import eu.hansolo.toolbox.properties.DoubleProperty;
import eu.hansolo.toolbox.properties.FloatProperty;
import eu.hansolo.toolbox.properties.StringProperty;

public class Employee {
    private StringProperty idnhanvien;
    private StringProperty hotennv;
    private StringProperty chucvu;
    public Employee(String idnhanvien,String hotennv, String chucvu, Float hesoluong  )
    {
        this.idnhanvien= new StringProperty(idnhanvien);
        this.hotennv= new StringProperty(hotennv);
        this.chucvu= new StringProperty(chucvu);
    }
    public StringProperty nameProperty() {
        return hotennv;
    }
    public StringProperty getidnv()
    {
        return idnhanvien;
    }
    public StringProperty getChucvunv()
    {
        return chucvu;
    }
    public String gethotennv()
    {
        return hotennv.get();
    }
    public String getchucvu()
    {
        return chucvu.get();
    }
    public void setIdnhanvien(String idnhanvien)
    {
        this.idnhanvien.set(idnhanvien);
    }
    public void setHotennv(String hotennv)
    {
        this.hotennv.set(hotennv);
    }
    public void setChucvu(String chucvu)
    {
        this.chucvu.set(chucvu);
    }

}
