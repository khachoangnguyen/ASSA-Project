/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assa;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ASSA {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Inserting inputs
        System.out.print("Number of inputs:");
        int numofinput = Integer.parseInt(reader.nextLine());
        int[] input = new int[numofinput];
        for (int i=0; i<(numofinput); i++){
        System.out.print("Input:");
        input[i] = Integer.parseInt(reader.nextLine());
        }
        //Inserting outputs
        System.out.print("Number of outputs:");
        int numofoutput = Integer.parseInt(reader.nextLine());
        int[] output = new int[numofoutput];
        for (int i=0; i<(numofoutput); i++){
        System.out.print("Output:");
        output[i] = Integer.parseInt(reader.nextLine());
        }
        //Concatenate inputs and outputs
        int[] array = new int[input.length + output.length];
        System.arraycopy(input, 0, array, 0, input.length);
        System.arraycopy(output, 0, array, input.length, output.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        //Read file
        String file_name = "D:/Aalto/Summer Project/TwoCylinders2016/FreeInputPlant1Cyl5Pos_loop.pth";
        String[] aryLines = null;
        try {
            ReadFile file = new ReadFile( file_name );
            aryLines = file.OpenFile( );
            
            for (int i=2; i < aryLines.length; i+=3) {
            //System.out.println( aryLines[i] ) ; 
            }
        }  
        catch ( IOException e ) {
        System.out.println( e.getMessage() );
        }
         //Finding indexes of inputs and outputs    
        
        }   
   
              
    }
