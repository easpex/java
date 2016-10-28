import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.PrintWriter;

/**
 * Write a description of class CSV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrunchifyCSVtoArrayList {

    public static void main(String[] args) {
        BufferedReader crunchifyBuffer = null;
        
        //create an array for the file
        String[][] csv = new String[720879][3];
                try {
            //temp String holder
            String crunchifyLine;
            
            crunchifyBuffer = new BufferedReader(new FileReader("C:\\Users\\yossi.spektor\\Documents\\Reports\\ADULT BLACKLIST\\adult1col.csv"));
            
            
            int count = 0;
            // How to read file in java line by line?
            while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
                //System.out.println("Raw CSV data: " + crunchifyLine);
                //System.out.println("Converted ArrayList data: " + Crunchify.crunchifyCSVtoArrayList(crunchifyLine) + "\n");
                
                //fill the array with strings
                csv[count][0] = new String(crunchifyLine);
                count++;
            }
                    } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (crunchifyBuffer != null) crunchifyBuffer.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }

        //---------------------------------------------------
        //second csv
        String[] keywordsCSV = new String[101];
                try {
            String crunchifyLine;
            crunchifyBuffer = new BufferedReader(new FileReader("C:\\Users\\yossi.spektor\\Documents\\Reports\\ADULT BLACKLIST\\adultKeywords.csv"));
            
            
            int count = 0;
            // How to read file in java line by line?
            while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
                //System.out.println("Raw CSV data: " + crunchifyLine);
                //System.out.println("Converted ArrayList data: " + Crunchify.crunchifyCSVtoArrayList(crunchifyLine) + "\n");
                
                keywordsCSV[count] = new String(crunchifyLine);
                count++;
            }
                    } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (crunchifyBuffer != null) crunchifyBuffer.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        
        
        //System.out.println(keywordsCSV[0]);
        
        //----------the loop below check of a string of the csv contains a string from keywordsCSV
        
        for(int i = 0; i < csv.length; i++) {
            
            for(int k = 0; k < keywordsCSV.length; k++) {
                //if there's a match then write true to the second column of the csv array
                if(csv[i][0].contains(keywordsCSV[k])) {
                   csv[i][1] = "true"; 
                   csv[i][2] = keywordsCSV[k];

                   System.out.println(csv[i][0] + " | " + csv[i][1] + " | " + keywordsCSV[k]); 
                   k = keywordsCSV.length; //we increase k to the max once there was a match because
                   //we don't need to check against other k's anymore
                } 
                
                
            }
        }
        //System.out.println("done");
        //for(int i = 0; i < csv.length; i++) {
          // System.out.println(csv[i][0] + " | " + csv[i][1]);
        //}
        
        
                try {
            PrintWriter writer = new PrintWriter("C:\\Users\\yossi.spektor\\Documents\\Reports\\ADULT BLACKLIST\\resultJava.csv", "UTF-8");
        
            // How       to write file in java line by line?
            for(int i = 0; i < csv.length; i++) {
                writer.println(csv[i][0] + "," + csv[i][1] + "," + csv[i][2]);
                
            }
            writer.close();
                    } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            //need to overwrite the code it's irrelevant
            try {
                if (crunchifyBuffer != null) crunchifyBuffer.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }
}


