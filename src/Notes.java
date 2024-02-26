import java.util.ArrayList;
import java.time.LocalDateTime;

public class Notes
{
    protected int notesCount = 0; // total number of notes
    protected ArrayList<Note> notesList;

    public Notes() {
        notesList = new ArrayList<Note>();}

    // function to add a new user
    public void addUser(Note user) {
        notesList.add(user);
    }

    // Function to create a new note
    public void createNewNote(String title, String body, String category)
    {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Note newNote = new Note(time, title, body, category, time);
        notesCount++;
        notesList.add(newNote);

    }

    public void editNote(Note note, String newTitle, String newBody, String newCategory)
    {
        note.title = newTitle;
        note.content = newBody;
        note.category = newCategory;
        note.dateChanged = LocalDateTime.now();
    }

    // 02/26 - add selectNote, deleteNote, sortNotes by category, date edited etc.
}
