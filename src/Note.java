import java.time.LocalDateTime;

public class Note
{
    public LocalDateTime dateChanged, date; // change time format
    public String content, title, category;

    // Constructor
    public Note(LocalDateTime date, String title, String content, String category, LocalDateTime dateChanged)
    {
        this.title = title;
        this.content = content;
        this.date = date;
        this.dateChanged = dateChanged;
        this.category = category;
    }

    // Setters:
    public void setTitle(String title) {this.title = title;}
    public void setCategory(String category) {this.category = category;}
    public void setContent(String content) {this.content = content;}
    public void setDate(String time) {this.date = date;}
    public void setDateChanged(LocalDateTime dateChanged){this.dateChanged = dateChanged;}

    // Getters:
    public LocalDateTime getDate() {return date;}
    public LocalDateTime getDateChanged() {return dateChanged;}
    public String getContent() {return content;}
    public String getCategory() {return category;}
    public String getTitle() {return title;}
}
