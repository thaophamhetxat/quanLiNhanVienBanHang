package com.codegym;

public class NhanVienParkTime extends Nhanvien {
    int WorkTime;
    public NhanVienParkTime(){

    }

    public NhanVienParkTime(int workTime) {
        WorkTime = workTime;
    }

    public NhanVienParkTime(int maNV, String name, int age, int phone, String email,int WorkTime) {
        super(maNV, name, age, phone, email);
        this.WorkTime = WorkTime;
    }


    public int getWorkTime() {
        return WorkTime;
    }

    public void setWorkTime(int workTime) {
        WorkTime = workTime;
    }

    public int SumSalary(){
        return this.WorkTime*100000;
    }
    @Override
    public String toString() {
        return "NhanVienParkTime{" +
                "WorkTime=" + WorkTime +
                ", MaNV=" + MaNV +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", SDT=" + Phone +
                ", Email='" + Email + '\'' +
                '}'+" ={"+" luong thuc linh = "+SumSalary()+'}';
    }
}
