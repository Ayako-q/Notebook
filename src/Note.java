public class Note
{
    public Integer date, dateChanged;
    public String content, title;

    // Constructor
    public Note(Integer date, String content, String title, Integer dateChanged)
    {
        this.title = title;
        this.content = content;
        this.date = date;
        this.dateChanged = dateChanged;
    }

    // Setters:
    public void setTitle(String title) {this.title = title;}
    public void setContent(String content) {this.content = content;}
    public void setDate(Integer date) {this.date = date;}
    public void setDateChanged(Integer dateChanged){this.dateChanged = dateChanged;}

    // Getters:
    public Integer getDate() {return date;}
    public Integer getDateChanged() {return dateChanged;}
    public String getContent() {return content;}
    public String getTitle() {return title;}
}
