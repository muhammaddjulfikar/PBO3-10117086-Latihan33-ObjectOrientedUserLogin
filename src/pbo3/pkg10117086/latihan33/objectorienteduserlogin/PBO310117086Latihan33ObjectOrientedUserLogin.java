/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan33.objectorienteduserlogin;

import java.util.Scanner;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM : membuat menu Login
 */
public class PBO310117086Latihan33ObjectOrientedUserLogin {

    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);

    }

}
