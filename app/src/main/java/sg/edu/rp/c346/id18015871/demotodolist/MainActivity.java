package sg.edu.rp.c346.id18015871.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvTodo;
    ArrayList<ToDoItem> TodoList;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo=findViewById(R.id.listViewToDo);

        TodoList=new ArrayList<>();
        Calendar date =Calendar.getInstance();
        date.set(2020,8,1);
        TodoList.add(new ToDoItem("Go for movie",date));

        Calendar date2 =Calendar.getInstance();
        date.set(2020,8,2);
        TodoList.add(new ToDoItem("Go for haircut",date2));

        adapter=new CustomAdapter(this,
                R.layout.row, TodoList);
        lvTodo.setAdapter(adapter);
    }
}
