package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;



public class HotelsFragment extends Fragment {

   public HotelsFragment() {
   }


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {

      // This inflates our Layout
      View rootView = inflater.inflate(R.layout.general_activities_listview, container, false);


      ArrayList<TourParameters> hotelsArrayList = new ArrayList<>();

      hotelsArrayList.add(new TourParameters (R.drawable.royal_marble, "Royal Marble Hotel",
              "G.R.A, 22 Ihama Road, Oka, Benin City", "052 941 461"));
      hotelsArrayList.add(new TourParameters(R.drawable.randekhi_royal, "Randekhi Royal Hotel",
              "6 Uhenuyi Street, Oka 300251, Benin City", "0809 172 9914" ));
      hotelsArrayList.add(new TourParameters(R.drawable.protea_hotel, "Protea Hotel",
              "4 Central Road, Off Sapele Road, 300251, Benin City", "0813 987 7770"));
      hotelsArrayList.add(new TourParameters(R.drawable.best_western_homeville_hotel, "Best Western Homeville Hotel",
              "Evbuomwan Street, beside conoil filling station, off Benin sapele Road", "052 290 830"));
      hotelsArrayList.add(new TourParameters(R.drawable.prestige_hotel_and_suites, "Prestige Hotel and Suites",
              "No 1 Ihama Road, by Airport Road junction, G.R.A, Benin City", "0815 197 4044"));
      hotelsArrayList.add(new TourParameters(R.drawable.morzi_hotel_and_suites, "Morzi Hotels & Suites",
              "Plot 290, Etete Layout Ugbor, G.R.A, Benin City", "0815 900 2022" ));
      hotelsArrayList.add(new TourParameters(R.drawable.de_brit_hotel, "De Brit Hotel",
              "70 Ihama Road, G.R.A, Benin City", "0903 880 0080"));
      hotelsArrayList.add(new TourParameters(R.drawable.brentwood_hotel, "Brentwood hotel and bar",
              "No 8 Idehen Street, Irhirhi Quarters, Off Airport Road, Benin City,", "0803 568 4727"));
      hotelsArrayList.add(new TourParameters(R.drawable.limoh_suites, "Limoh Suites",
              "2 Blessed People Avenue, Off Boundary Road, Benin City", "0907 249 9533"));
      hotelsArrayList.add(new TourParameters(R.drawable.eterno_hotels, "Eterno Hotels",
              "103B Aiguobasimwin Cresent Off Ikpokpan Road, G.R.A, Benin City", "0809 898 2533"));


      ListView hotelsListView = (ListView) rootView.findViewById(R.id.general_listView);
      TourAdapter adapter = new TourAdapter(getActivity(),0 , hotelsArrayList);
      hotelsListView.setAdapter(adapter);

      return  rootView;

   }



}
