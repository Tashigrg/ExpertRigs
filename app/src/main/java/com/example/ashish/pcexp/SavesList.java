package com.example.ashish.pcexp;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SavesList extends ArrayAdapter<RigSaves>{

    private Activity context;
    private List<RigSaves> savesList;

    public SavesList(Activity context, List<RigSaves> savesList){
        super(context, R.layout.list_layout, savesList);
        this.context = context;
        this.savesList = savesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewType = (TextView) listViewItem.findViewById(R.id.textViewType);
        TextView textViewPrice = (TextView) listViewItem.findViewById(R.id.textViewPrice);

        RigSaves rigSaves = savesList.get(position);

        textViewName.setText(rigSaves.getRigName());
        textViewType.setText(rigSaves.getRigType());
        textViewPrice.setText(rigSaves.getRigPrice());

        return listViewItem;

    }
}
