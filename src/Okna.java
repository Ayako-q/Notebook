import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Okna extends JFrame {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JButton newNoteBtn, editNoteBtn, deleteNoteBtn;
    private JList<String> noteList;

    public Okna() {
        super("NoteBook");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);

        // Create and add menu bar
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        fileMenu.setBackground(Color.black);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Add menu items
        fileMenu.add(new JMenuItem("New Note"));
        fileMenu.add(new JMenuItem("Edit Note"));
        fileMenu.add(new JMenuItem("Delete Note"));
        fileMenu.add(new JMenuItem("Open Note"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("Exit"));

        // Create note list with scroll pane
        noteList = new JList<>();
        noteList.setListData(new String[]{"Note 1", "Note 2", "Note 3"});
        JScrollPane scrollPane = new JScrollPane(noteList);
        noteList.setBackground(Color.WHITE);
        scrollPane.setPreferredSize(new Dimension(100, 550));

        // Create button panel
        // Functionality for edit and delete note should be here

        // Create main layout using GridBagLayout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.WEST;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        getContentPane().add(scrollPane, c);
        getContentPane().setBackground(Color.decode("#ffe7d4"));
        setVisible(true);
    }
}
