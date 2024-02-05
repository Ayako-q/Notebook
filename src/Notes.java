import java.util.ArrayList;

public class Notes
{
    private int i = 0; // number of users
    private ArrayList<Note> noteList;

    public Notes() {noteList = new ArrayList<Note>();}

    // function to add a new user
    public void addUser(Note user) {
        noteList.add(user);
    }

    // Function to create a new note
    public void createNewNote()
    {

        //Note newNote = new Note();
    }
}
