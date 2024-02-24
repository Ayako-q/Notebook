import java.time.LocalDateTime;

public class Note
{
    public LocalDateTime dateChanged, date;
    public String content, title;

    // Constructor
    public Note(LocalDateTime date, String content, String title, LocalDateTime dateChanged)
    {
        this.title = title;
        this.content = content;
        this.date = date;
        this.dateChanged = dateChanged;
    }

    // Setters:
    public void setTitle(String title) {this.title = title;}
    public void setContent(String content) {this.content = content;}
    public void setDate(String time) {this.date = date;}
    public void setDateChanged(LocalDateTime dateChanged){this.dateChanged = dateChanged;}

    // Getters:
    public LocalDateTime getDate() {return date;}
    public LocalDateTime getDateChanged() {return dateChanged;}
    public String getContent() {return content;}
    public String getTitle() {return title;}
}
