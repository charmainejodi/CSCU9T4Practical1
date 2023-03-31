/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jodi_
 */

package com.stir.cscu9t4practical1;
class CycleEntry extends Entry {
    private String Terrain;
    private String Tempo;
     
    
    public CycleEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem){
        super(n, d, m, y, h, min, s, dist);
        Terrain = ter;
        Tempo = tem;
    }
    
    public String getTerrain(){
       if (Terrain.equals("asphalt"))
            return "in a" + Terrain;
        else 
            return Terrain;
    }
    
    public String getTempo() {
        if (Tempo.equals("moderate"))
            return "in" + Tempo;
        else 
            return Tempo;
    }
    
    public String getEntry() {
        String result = getName()+" cycled " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear() +" at "+ getTerrain() + "terrain and at" +getTempo() + "tempo.";
        return result;
    }
    }
    




