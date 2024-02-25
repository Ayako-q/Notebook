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
        GridBagLayout layout = new GridBagLayout();

        // Buttons
        JButton newNote = new JButton("NewN ote");
        JButton editNote = new JButton("Edit Note");
        JButton deleteNote = new JButton("Delete Note");

        // Buttons functionality

        mainFrame.setLayout(layout);
        mainFrame.add(newNote);
        mainFrame.add(editNote);
        mainFrame.add(deleteNote);
        mainFrame.setVisible(true);

    }

    public String createTitle()
    {
        return "Jopa";
    }
}
