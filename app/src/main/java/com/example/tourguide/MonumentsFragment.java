package com.example.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;


public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // This inflates our Layout
        View rootView = inflater.inflate(R.layout.general_activities_listview, container, false);

        ArrayList<TourParameters> monumentsArrayList = new ArrayList<>();

        monumentsArrayList.add(new TourParameters(R.drawable.royal_palace_of_the_oba_of_benin, "Royal Palace of The Oba of Benin",
                "Plymouth road, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.second_emotan_statue, "Emotan Statue",
                "Ore Oghene Road, Opp. Oba Market, RingRoad, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.benin_national_museum, "Benin City National Museum",
                "Ring Road Roundabout, Benin City", "0803 356 8183"));
        monumentsArrayList.add(new TourParameters(R.drawable.chief_ogiamen_house, "Chief Ogiamen's House",
                "No. 97 Sokponba Road, Off RingRoad, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.holy_aruosa_cathedral, "Holy Aruosa Cathedral",
                "Akpakpava Road, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.igun_street, "Igun Street",
                "Igen-Eronmwon Quarters, Igun Street, Off Sokponba Road By RingRoad Roundabout, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.benin_moat, "Benin Moat(Iya)",
                "Efehi Street, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.egedege_nokaro, "Egedege N'Okaro",
                "No. 30 Erie Street Off Sokponba Road Off Ring Road, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.asoro_statue, "Statue of Asoro n'Iyokuo",
                "Oba Ovoranmwen Square, Sakponba Road junction, Ring Road, Benin City", ""));
        monumentsArrayList.add(new TourParameters(R.drawable.queen_iden_tomb, "Tomb of Queen Iden",
                "Close to Oba Market, Benin City",""));


        ListView monumentsListView = (ListView) rootView.findViewById(R.id.general_listView);
        TourAdapter adapter = new TourAdapter(getActivity(), 0,  monumentsArrayList);
        monumentsListView.setAdapter(adapter);

        return rootView;
    }

}
