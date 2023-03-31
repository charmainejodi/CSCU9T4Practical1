// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry(int d, int m, int y) {
    List<Entry> entriesOnDate = new ArrayList<>();
    for (Entry entry : tr) {
        if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
            entriesOnDate.add(entry);
        }
    }
    if (entriesOnDate.isEmpty()) {
        return "No entries found for " + d + "/" + m + "/" + y;
    } else {
        StringBuilder result = new StringBuilder();
        for (Entry entry : entriesOnDate) {
            result.append(entry.getEntry()).append("\n\n");
        }
        // Remove the last "\n\n" added in the loop
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }
}
   
   //Task 3
 public String FindAllByDate (int d, int m, int y) {
     ListIterator<Entry> iter = tr.listIterator();
     String result = "";
     while (iter.hasNext()){
         Entry current = iter.next();
         if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) {
             result += current.getEntry();
         }
     }
         if (result.isEmpty()) {
       result = "No entries found.";
   }
         return result;
 }
   
 
 //Task 11
 public void remove(String name, int d, int m, int y) {
        for (Entry entry : tr) {
            if (entry.getName().equals(name) &&
                    entry.getMonth() == m &&
                    entry.getDay() == d &&
                    entry.getYear() == y) {
                tr.remove(entry);
                return;
            }
        }

        // If we get here, no matching entry was found
        System.out.println("No entry found matching those values");
    }
    
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
   
   
   //public String FindAllByDate (int d, int m, int y) {
       
   //}
   
} // TrainingRecord