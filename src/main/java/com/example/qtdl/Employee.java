package com.example.qtdl;

import eu.hansolo.toolbox.properties.DoubleProperty;
import eu.hansolo.toolbox.properties.FloatProperty;
import eu.hansolo.toolbox.properties.IntegerProperty;
import eu.hansolo.toolbox.properties.StringProperty;
// hàm xây dựng
public class Employee {
    private StringProperty idnhanvien;
    private StringProperty hotennv;
    private IntegerProperty sdt;
    private StringProperty gioitinh;
    private StringProperty trangthai;
    public Employee(String idnhanvien,String hotennv,int sdt ,String gioitinh,String trangthai   )
    {
        this.idnhanvien= new StringProperty(idnhanvien);
        this.hotennv= new StringProperty(hotennv);
        this.sdt= new IntegerProperty(sdt);
        this.gioitinh=new StringProperty(gioitinh);
        this.trangthai=new StringProperty(trangthai);
    }
    //idnhan vien
    public StringProperty idnvProperty() {
        return idnhanvien;
    }
    public StringProperty getidnv()
    {
        return idnhanvien;
    }
    public void setidnhanvien(String idnhanvien)
    {
        this.idnhanvien.set(idnhanvien);
    }
    //
     // họ tên nhan vien
    public StringProperty hotennvProperty()
    {
        return this.hotennv;
    }
    public String gethotennv()
    {
        return hotennv.get();
    }
    public void sethotennv(String hotennv)
    {
        this.hotennv.set(hotennv);
    }
    //sdt nhan vien
    public IntegerProperty sdtProperty() {
        return sdt;
    }
    public IntegerProperty getsdt()
    {
        return sdt;
    }
    public void setsdt(int sdt)
    {
        this.sdt.set(sdt);
    }
   //gioitinhnhân viên
   public StringProperty gioitinhnvProperty()
   {
       return this.gioitinh;
   }
    public String getgioitinhnnv()
    {
        return gioitinh.get();
    }
    public void setgioitinhnv(String gioitinh)
    {
        this.gioitinh.set(gioitinh);
    }
    //trạng thái nhân viên
    public StringProperty trangthaiProperty()
    {
        return this.trangthai;
    }
    public String gettrangthainhnnv()
    {
        return trangthai.get();
    }
    public void settrangthainv(String trangthai)
    {
        this.trangthai.set(trangthai);
    }


}
