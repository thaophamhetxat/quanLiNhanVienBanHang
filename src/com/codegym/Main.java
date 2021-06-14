package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nhanvien[] nhanviens = new Nhanvien[0];
        int choise;
        while (true) {
            System.out.println("QUAN LI NHAN VIEN BAN HANG");
            System.out.println("1. Nhan vien ");
            System.out.println("2. Nhan vien full times ");
            System.out.println("3. Nhan vien park times ");
            System.out.println("4. Edit ");
            System.out.println("Enter choise: ");
            choise = scanner.nextInt();
            switch (choise) {
                case 2: {
                    System.out.println("1. Add Nhan vien ");
                    System.out.println("2. Edit ");
                    System.out.println("3. Delete ");
                    System.out.println("4. Show ");
                    int select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            Manager.createFull(nhanviens);
                            break;
                        case 2:
                            Manager.editNV(nhanviens);
                            break;
                        case 3:
                            Manager.delNV(nhanviens);
                            break;
                        case 4:
                            for (Nhanvien i : nhanviens) {
                                System.out.println(i);
                            }

                    }
                    break;
                }
                case 3: {
                    System.out.println("1. Add Nhan vien");
                    System.out.println("2. Edit ");
                    System.out.println("3. Delete ");
                    System.out.println("4. Show ");
                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                           nhanviens= Manager.createPark(nhanviens);
                            break;
                        case 2:
                            Manager.editNV(nhanviens);
                            break;
                        case 3:
                            Manager.delNV(nhanviens);
                            break;
                        case 4:
                            for (Nhanvien i : nhanviens) {
                                System.out.println(i);
                            }

                    }break;

                }
                case 4:


            }

        }


    }
}
