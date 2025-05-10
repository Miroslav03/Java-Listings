package com.example.chapter14;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        // Можеш да избираш кое приложение да стартираш:
        // Например: "ShowArc", "ShowPolygon", или "DisplayClock"

        String which = "DisplayClock"; // смени стойността за различен пример

        switch (which) {
            case "ShowArc":
                Application.launch(ShowArc.class, args);
                break;
            case "ShowPolygon":
                Application.launch(ShowPolygon.class, args);
                break;
            case "DisplayClock":
                Application.launch(DisplayClock.class, args);
                break;
            default:
                System.out.println("Unknown application: " + which);
        }
    }
}
