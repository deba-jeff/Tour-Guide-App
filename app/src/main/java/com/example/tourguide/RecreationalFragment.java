package com.example.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;


public class RecreationalFragment extends Fragment {


   public RecreationalFragment() {
   }


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      // This inflates our Layout
      View rootView = inflater.inflate(R.layout.general_activities_listview, container, false);



      ArrayList<TourParameters> recreationalArrayList = new ArrayList<>();

      recreationalArrayList.add(new TourParameters(R.drawable.kada_cinemas, "Kada Cinemas and Entertainment Center",
              "111 Sapele Road, Benin City", "0805 501 0676"));
      recreationalArrayList.add(new TourParameters(R.drawable.deepend_cinemas, "Deepend Cinemas",
              "Nosayaba Street Off T.V Road, Use, Benin City", "" ));
      recreationalArrayList.add(new TourParameters(R.drawable.ogba_zoo, "Ogba Zoo",
              "Km 5 along Airport road, Benin City", "0803 302 6283"));
      recreationalArrayList.add(new TourParameters(R.drawable.filmhouse_cinemas, "FilmHouse Cinemas",
              "Uselu, Benin City", ""));
      recreationalArrayList.add(new TourParameters(R.drawable.okomu_national_park, "Okomu National Park",
              "Arakhuan via Udo, Ovia SoutWest Local Government", "052 450 241"));
      recreationalArrayList.add(new TourParameters(R.drawable.ososo_tourist_centre, "Ososo Tourist Centre",
              "Ososo, Akoko-Edo Local government", ""));
      recreationalArrayList.add(new TourParameters(R.drawable.vice_city, "Vice City",
              "No. 20 Ihama Road, G.R.A, Benin City", "0803 810 7874"));
      recreationalArrayList.add(new TourParameters(R.drawable.metro_cafe, "Metro Cafe ",
              "No. 36 1st Ugbor Road, G.R.A, Benin City", "0802 892 3908"));
      recreationalArrayList.add(new TourParameters(R.drawable.st_regis_hotels_and_resorts, "St. Regis Hotels & Resorts",
              "12 Upper Adesuwa Grammer School Road, Benin City", "0906 000 1732"));
      recreationalArrayList.add(new TourParameters(R.drawable.surprise_pub_and_cafe, "Surprise pub and Cafe",
              "4a Federal Avenue, G.R.A, Benin City", "0805 555 4297"));



      ListView recreationalListView = (ListView) rootView.findViewById(R.id.general_listView);
      TourAdapter adapter = new TourAdapter(getActivity(), 0, recreationalArrayList);
      recreationalListView.setAdapter(adapter);

      return rootView;

   }


}

