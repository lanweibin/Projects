package com.lwb.reflex;

public class BoteBookMain {

    public static void main(String[] args) {
        NoteBook book = new NoteBook();

        book.run();
        book.useUSB(null);

//       因为有了鼠标，要创建鼠标对象
        book.useUSB(new MouseByUSB());
    }
}
