package sg.edu.rp.c346.id18015871.demotodolist;

        import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        String d=date.get(Calendar.DAY_OF_MONTH)
                +"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR);
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
    private String getDay(int d) {
        return title;
    }
}
