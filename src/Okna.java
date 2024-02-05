import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Okna
{
    public void main_window() {
        JFrame mainFrame = new JFrame("NoteBook");

        JMenuBar menu1 = new JMenuBar();
        JMenu men1 = new JMenu("Option1");
        menu1.add(men1);
        // window properties
        mainFrame.setSize(1440, 900);
        mainFrame.setJMenuBar(menu1);
        mainFrame.setResizable(false);

        // Layout
        GridLayout brd = new GridLayout(4, 4);

        // Buttons
        JButton newNote = new JButton("newNote");
        JButton editNote = new JButton("editNote");
        JButton deleteNote = new JButton("deleteNote");

        // Buttons actions


        Color bezeviy = new Color(255, 255, 156);

        mainFrame.setBackground(bezeviy);

        mainFrame.setLayout(brd);
        mainFrame.add(newNote);
        mainFrame.add(editNote);
        mainFrame.add(deleteNote);
        mainFrame.setBackground(bezeviy);
        mainFrame.setVisible(true);

    }

    public String createTitle()
    {
        return "Jopa";
    }
}
