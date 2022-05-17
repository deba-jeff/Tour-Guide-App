package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TourAdapter extends ArrayAdapter<TourParameters> {


   public TourAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TourParameters> objects) {
      super(context, 0, objects);
   }


   @NonNull
   @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      View listView = convertView;

      if (listView == null){
         listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
      }

      TourParameters currentTourParameters = getItem(position);
      TextView contactTextView = (TextView) listView.findViewById(R.id.contact);
      ImageView callImageView = (ImageView) listView.findViewById(R.id.call_image);


      // Checks if contact String is empty
      if (currentTourParameters.checkForContact()) {
         contactTextView.setText(currentTourParameters.getContact());
         contactTextView.setVisibility(View.VISIBLE);
         callImageView.setVisibility(View.VISIBLE);
      }

      else {
         contactTextView.setVisibility(View.GONE);
         callImageView.setVisibility(View.GONE);
      }


      ImageView image = (ImageView) listView.findViewById(R.id.image);
      image.setImageResource(currentTourParameters.getImage());

      TextView nameTextView = (TextView) listView.findViewById(R.id.name);
      nameTextView.setText(currentTourParameters.getName());

      TextView locationTextView = (TextView) listView.findViewById(R.id.location);
      locationTextView.setText(currentTourParameters.getLocation());


      return listView;
   }


}
