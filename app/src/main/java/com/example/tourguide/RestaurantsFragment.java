package com.example.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;


public class RestaurantsFragment extends Fragment {


   public RestaurantsFragment() {
   }


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {


      // This inflates our Layout
      View rootView = inflater.inflate(R.layout.general_activities_listview, container, false);

      ArrayList<TourParameters> restaurantsArrayList = new ArrayList<>();


      restaurantsArrayList.add(new TourParameters(R.drawable.mat_ice, "Mat-Ice",
              "No. 110 Ekehuan Road, Ogoguobo, Benin City","0817 162 2210"));
      restaurantsArrayList.add(new TourParameters(R.drawable.soundbar_cafe_and_kitchen, "SoundBar Cafe & Kitchen",
              "No. 32 Aideyan Street, off Ihama Beside Uyi grand Hotel, Benin City", "0805 242 8408"));
      restaurantsArrayList.add(new TourParameters(R.drawable.royal_china_restaurant,"Royal China Restaurant",
              "No. 72 Ihama Road, Oka Benin City", "0906 685 0363"));
      restaurantsArrayList.add(new TourParameters(R.drawable.kateris_bamboo_house, "Kateri's Bamboo House(Restaurant)",
              "No. 34 Boundary Road, GRA, Benin City", "0806 232 1888"));
      restaurantsArrayList.add(new TourParameters(R.drawable.kadis_pizza, "Kadis Pizza",
              "No. 80 Ihama Road, Oka, Benin City", "0806 870 0987"));
      restaurantsArrayList.add(new TourParameters(R.drawable.gt_food_plus, "GT food plus",
              "No. 107 Ugbor Road, Oka 300251, Benin City", "0803 443 9358"));
      restaurantsArrayList.add(new TourParameters(R.drawable.chicken_republic, "Chicken Republic",
              "Ugbowo-Lagos Road, Uselu 300271, Benin City", "0706 466 3566"));
      restaurantsArrayList.add(new TourParameters(R.drawable.cream_town, "Cream Town",
              "No. 9 Aideyan Street, Off Ihama Road, beside Firm Foundation Benin City", "0806 690 5882"));
      restaurantsArrayList.add(new TourParameters(R.drawable.kada_fried_chicken,"Kada Fried Chicken",
              "Benin Sapele Road, Oka, Benin City", "0811 660 0110"));
      restaurantsArrayList.add(new TourParameters(R.drawable.imperial_bizzo, "Imperial Bizzo",
              "No. 3 Ugbor Village Road By Country Home Junction, Benin City", "0706 398 7537"));



      ListView restaurantsListView = (ListView) rootView.findViewById(R.id.general_listView);
      TourAdapter adapter = new TourAdapter(getActivity(), 0, restaurantsArrayList);
      restaurantsListView.setAdapter(adapter);


      return rootView;

   }


}
