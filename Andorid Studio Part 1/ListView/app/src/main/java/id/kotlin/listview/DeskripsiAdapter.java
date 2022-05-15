package id.kotlin.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import id.kotlin.listview.Deskripsi;
import id.kotlin.listview.R;

public class DeskripsiAdapter extends ArrayAdapter<Deskripsi> {

    public DeskripsiAdapter(@NonNull Context context, @NonNull ArrayList<Deskripsi> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return super.getFilter();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        Deskripsi deskripsi = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false);
        }
        // Lookup view for data population
        TextView mainTitleTV = (TextView) convertView.findViewById(R.id.mainTitleTV);
        TextView subTitleTV = (TextView) convertView.findViewById(R.id.subTitleTV);
        // Populate the data into the template view using the data object
        mainTitleTV.setText(deskripsi.getMainTitle());
        subTitleTV.setText(deskripsi.getSubTitle());
        // Return the completed view to render on screen
        return convertView;
    }
}
