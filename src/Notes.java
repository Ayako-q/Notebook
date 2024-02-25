import java.util.ArrayList;
import java.time.LocalDateTime;

public class Notes
{
    private int usersCount = 0; // total number of users
    private ArrayList<Note> noteList;

    public Notes() {noteList = new ArrayList<Note>();}

    // function to add a new user
    public void addUser(Note user) {
        noteList.add(user);
    }

    // Function to create a new note
    public void createNewNote(String title, String body)
    {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Note newNote = new Note(time, title, body, time);
        usersCount++;
        noteList.add(newNote);
    }

    public void editNote(Note note, String newTitle, String newBody)
    {
        note.title = newTitle;
        note.content = newBody;
        note.dateChanged = LocalDateTime.now();
    }
}
