package com.example.tourguide;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

   public CategoryAdapter(FragmentManager fm) {
      super(fm);
   }


   /**
    * Returns the Fragment associated with a specified position.
    */
   @Override
   public Fragment getItem(int position) {

      if (position == 0){
         return new HotelsFragment();
      }
      else if (position == 1){
         return new RestaurantsFragment();
      }
      else if(position == 2){
         return new MonumentsFragment();
      }
      else {
         return new RecreationalFragment();
      }

   }



   /**
    * Returns the number of views available.
    */
   @Override
   public int getCount() {
      return 4;
   }




   /**
    * Returns the Title of the fragment depending on the position
    */
   @Nullable
   @Override
   public CharSequence getPageTitle(int position) {

      if (position == 0) {
         return "Hotels";

      } else if (position == 1) {
         return "Restaurants";

      } else if (position == 2) {
         return "Monuments";

      } else {
         return "Recreations";
      }


   }



}
