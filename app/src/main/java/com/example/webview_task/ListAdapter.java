package com.example.webview_task;

/** This class will serve as the adapter for the list_item.xml that will fill the list view. */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<User> {

    /** Constructor for ListAdapter class */
    public ListAdapter(Context context, ArrayList<User> userArrayList){
        super(context,R.layout.list_item,userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        /** This will inflate the view */
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.version_pic);
        TextView versionName = convertView.findViewById(R.id.versionName);
        TextView versionDescription = convertView.findViewById(R.id.versionDescription);

        imageView.setImageResource(user.imageId);
        versionName.setText(user.version_name);
        versionDescription.setText(user.version_description);

        return convertView;
    }
}
