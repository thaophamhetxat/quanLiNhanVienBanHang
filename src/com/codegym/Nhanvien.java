package com.codegym;

public class Nhanvien {
    int MaNV;
    String Name;
    int Age;
    int Phone;
    String Email;
    public Nhanvien(){

    }
    public Nhanvien(int maNV, String name, int age, int phone, String email) {
        MaNV = maNV;
        Name = name;
        Age = age;
        this.Phone = phone;
        Email = email;
    }


    public int getMaNV() {
        return MaNV;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPhone(int phone) {
        this.Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "MaNV=" + MaNV +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", SDT=" + Phone +
                ", Email='" + Email + '\'' +
                '}';
    }
}
