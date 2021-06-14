package com.codegym;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class Manager {
    public static Nhanvien[] createPark(Nhanvien[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        int MaNV = Integer.parseInt(scanner.nextLine());

        System.out.println("Ho ten: ");
        String Name = scanner.nextLine();

        System.out.println("Age: ");
        int Age = Integer.parseInt(scanner.nextLine());

        System.out.println("Phone: ");
        int Phone = Integer.parseInt(scanner.nextLine());

        System.out.println("Email: ");
        String Email = scanner.nextLine();
        System.out.println("WorkTime: ");
        int WorkTime = Integer.parseInt(scanner.nextLine());


        Nhanvien nhanvien = new NhanVienParkTime(MaNV, Name, Age, Phone, Email,WorkTime);
        Nhanvien[] newPark = new Nhanvien[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newPark[i] = arr[i];
        }
        newPark[newPark.length - 1] = nhanvien;
        return newPark;



    }
    public static Nhanvien[] createFull(Nhanvien[]arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        int MaNV = Integer.parseInt(scanner.nextLine());

        System.out.println("Ho ten: ");
        String Name = scanner.nextLine();
        System.out.println("Age: ");
        int Age = Integer.parseInt(scanner.nextLine());
        System.out.println("Phone: ");
        int Phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Email: ");
        String Email = scanner.nextLine();

        System.out.println("Salary: ");
        int Salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Bonus: ");
        int Bonus = Integer.parseInt(scanner.nextLine());
        System.out.println("UnBonus: ");
        int UnBonus = Integer.parseInt(scanner.nextLine());

        Nhanvien nhanvien = new NhanvienFullTime(MaNV, Name, Age, Phone, Email,Salary,Bonus,UnBonus);
        Nhanvien[] newFull = new Nhanvien[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newFull[i] = arr[i];
        }
        newFull[newFull.length - 1] = nhanvien;
        return newFull;
    }

    public static void editNV(Nhanvien[] arr) {
        Nhanvien count = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MNV: ");
        int index = Integer.parseInt(scanner.nextLine());


        System.out.println("Ma nhan vien: ");
        int MaNV = Integer.parseInt(scanner.nextLine());
        System.out.println("Fix Name: ");
        String Name = scanner.nextLine();
        System.out.println("Fix Age: ");
        int Age = Integer.parseInt(scanner.nextLine());
        System.out.println("Fix Phone: ");
        int Phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Fix Email: ");
        String Email = scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMaNV() == index) {
                count = arr[i];
                break;
            }
        }
        count.setMaNV(MaNV);
        count.setName(Name);
        count.setAge(Age);
        count.setPhone(Phone);
        count.setEmail(Email);

    }

    public static void delNV(Nhanvien[] arr) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID Delete: ");
        Nhanvien[] arrNewNV = new Nhanvien[arr.length - 1];
        int id = Integer.parseInt(scanner.nextLine());

        Nhanvien countDel = null;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMaNV() == id) {
                countDel = arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;
        for (int i = 0; i < arrNewNV.length; i++) {
            arrNewNV[i] = arr[i];
        }

    }



}
