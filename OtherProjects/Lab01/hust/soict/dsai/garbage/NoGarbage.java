package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
	public static void main(String[] args) {
	   try {
	            String filename = "test.txt";
	            StringBuilder stringBuilder = new StringBuilder();
	            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                stringBuilder.append(line);
	            }
	            bufferedReader.close();
	            String content = stringBuilder.toString();
	            System.out.println(content);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

