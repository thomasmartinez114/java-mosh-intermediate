package com.martinez;

public class Main {

    public static void main(String[] args) {
      // Create array of control objs and render each to the console
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls) {
            control.render();
        }
    }
}
