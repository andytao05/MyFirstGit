package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private Context context;
    private ArrayList<Module> modules;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        this.context = context;
        this.modules = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        ImageView ivModule = rowView.findViewById(R.id.ivModule);
        // Get the ImageView object
        TextView tvModuleID = rowView.findViewById(R.id.tvModuleID);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentModule = modules.get(position);

        // Set the TextView to show the food
        tvModuleID.setText(currentModule.getId());
        // Set the image to star or nostar accordingly
        if(currentModule.isProg()) {
            ivModule.setImageResource(R.drawable.prog);
        }
        else {
            ivModule.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
