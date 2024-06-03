/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemPerkuliahan;

import com.mycompany.sistemPerkuliahan.UI.TextUI;
import java.util.Scanner;
import sistemlogic.sistemperkuliahan;

/**
 *
 * @author A-27
 */
public class MainClass {
    private static Scanner scanner;
    //private static DataManager dataManager;

    public static void main(String[] args) {
        // Initialize scanner
        scanner = new Scanner(System.in);

        // Create DataManager instance (specify array sizes)
        // dataManager = new DataManager(100, 50, 20, 200);

        TextUI ui = new TextUI();
        ui.run();
        sistemperkuliahan sistemPerkuliahan = new sistemperkuliahan();
    }
}
