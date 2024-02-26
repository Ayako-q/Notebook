import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame{

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JButton newNoteBtn, editNoteBtn, deleteNoteBtn;
    private JList<String> noteList;

    public Interface()
    {
        super("NoteBook");
        Notes notes = new Notes();
        notes.createNewNote("Zameta 1", "Zameta 1", "OPfw");
        notes.createNewNote("Zameta 334", "ouwgrb OUHF iofweh", "OPfw");
        notes.createNewNote("Zameta 2141", "ouwgrb OUHF iofweh", "OPfw");
        notes.createNewNote("Zameta 1421", "ouwgrb OUHF iofweh", "OPfw");

        // Window parameters
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
        JScrollPane scrollPane = new JScrollPane(noteList);
        noteList.setListData(titlesToList(notes));
        noteList.setBackground(Color.WHITE);

        // Height should be AT LEAST 50px less than window size!
        scrollPane.setPreferredSize(new Dimension(250, 550));

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
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public String[] titlesToList(Notes notes)
    {
        String[] arrayTitles = new String[notes.notesCount];
        if (notes.notesCount != 0)
        {
            for(int i = 0; i < notes.notesList.size(); i++)
            {arrayTitles[i] = notes.notesList.get(i).getTitle();}
        }
        return arrayTitles;
    }
}
