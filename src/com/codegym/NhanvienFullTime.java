package com.codegym;

public class NhanvienFullTime extends Nhanvien{
    int Bonus;
    int UnBonus;
    int Salary;
    public NhanvienFullTime(){

    }
    public NhanvienFullTime(int bonus, int unBonus, int salary) {
        this.Bonus = bonus;
        this.UnBonus = unBonus;
        this.Salary = salary;
    }

    public NhanvienFullTime(int maNV, String name, int age, int phone, String email,int salary) {
        super(maNV, name, age, phone, email);
        this.Salary = salary;
    }

    public int getBonus() {
        return this.Bonus;
    }

    public void setBonus(int bonus) {
        this.Bonus = bonus;
    }

    public int getUnBonus() {
        return UnBonus;
    }

    public void setUnBonus(int unBonus) {
        this.UnBonus = unBonus;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }
    public int SumBonus(){
        return this.Salary*(this.Bonus-this.UnBonus);
    }

    @Override
    public String toString() {
        return "NhanvienFullTime{" +super.toString()+
                "MaNV=" + MaNV +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", SDT=" + Phone +
                ", Email='" + Email + '\'' +
                ", Bonus=" + Bonus +
                ", UnBonus=" + UnBonus +
                ", Salary=" + Salary +
                '}';
    }


}
