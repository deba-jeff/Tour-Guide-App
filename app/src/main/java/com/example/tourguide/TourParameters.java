package com.example.tourguide;

import java.util.Objects;

public class TourParameters {

   private static final String NO_LOCATION_PROVIDED = "";
   private String mLocation = NO_LOCATION_PROVIDED;

   private int mImage;
   private String mName;
   private String mContact;


   public TourParameters( int image, String name, String location, String contact){
      mName = name;
      mLocation = location;
      mContact = contact;
      mImage = image;

   }



   public String getName(){
      return mName;
   }

   public String getLocation(){
      return mLocation;
   }

   public String getContact(){
      return mContact;
   }

   public int getImage(){
      return mImage;
   }


   /**
    * Checks for empty Contact details
    */
   public boolean checkForContact(){
      return (!Objects.equals(mContact, NO_LOCATION_PROVIDED));
   }




}
