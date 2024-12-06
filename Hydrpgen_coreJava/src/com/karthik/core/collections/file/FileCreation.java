package com.karthik.core.collections.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		
		 String filePath = "my_file.txt"; 
	        File file = new File(filePath);
	        
	        FileWriter writer = new FileWriter(file,true);   // append the data 
            writer.write("Hello, world!");
            writer.close();

//	        try {
//	            // Create the file if it doesn't exist
//	            if (file.createNewFile()) {
//	                System.out.println("File created: " + file.getAbsolutePath());
//
//	                // Write text to the file (optional)
//	                FileWriter writer = new FileWriter(file);
//	                writer.write("Hello, world!");
//	                writer.close();
//	            } else {
//	                System.out.println("File already exists.");
//	            }
//	        } catch (IOException e) {
//	            System.out.println("Error creating file: " + e.getMessage());
//	        }
 
		
		
	}
}

