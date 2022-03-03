package Lesson2_TextPanel;

//https://www.youtube.com/watch?v=cQ0Em2BxCz0
//https://github.com/biblelamp/JavaExercises/blob/master/Java%202/bot/SimpleBot.java
// Окончание 26-00


import javax.swing.*;
import java.awt.*;

public class SimpleChatBot extends JFrame {
    final String TITLE_OF_PROGRAMM = "Chatter : SIMPLE CHAT-BOT";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 500;
    JTextArea dialogue;
    JCheckBox ai;
    JTextField message;
//    SimpleBot sBot;


    public static void main(String[] args) {
        SimpleChatBot simpleChatBot = new SimpleChatBot();
        Frame frame = new JFrame();
    }

    public SimpleChatBot() throws HeadlessException {
        setTitle(TITLE_OF_PROGRAMM);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);

        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(dialogue);

        add(BorderLayout.CENTER,scrollPane);
        setVisible(true);
    }
}
