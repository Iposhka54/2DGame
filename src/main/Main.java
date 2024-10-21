package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Чтобы закрывалось при нажатии на крестик
        window.setTitle("Crazy Game");
        window.setResizable(false);//нельзя изменять размер окна

        GamePanel gamepanel = new GamePanel();
        window.add(gamepanel);
        window.pack();//Наименьший размер, для отображения всех компонентов

        window.setLocationRelativeTo(null);//по центру экрана окно
        window.setVisible(true);
    }
}
