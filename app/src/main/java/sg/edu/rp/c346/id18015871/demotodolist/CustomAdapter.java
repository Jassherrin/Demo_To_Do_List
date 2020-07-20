package sg.edu.rp.c346.id18015871.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> versionList;

    public CustomAdapter (Context context, int resource,
                          ArrayList<ToDoItem> objetcs) {
        super(context, resource, objetcs);
        parent_context=context;
        layout_id=resource;
        versionList=objetcs;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        // Obtain the Android Version information based on the position
        ToDoItem currentVersion = versionList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getTitle());
        tvVersion.setText(tvVersion.get(Calendar.DAY_OF_MONTH)
                +"/"+tvVersion.get(Calendar.MONTH)
                +"/"+tvVersion.get(Calendar.YEAR));

        return rowView;
    }

}
