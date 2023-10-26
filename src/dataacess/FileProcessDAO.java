package dataacess;

import common.Library;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class FileProcessDAO {  
    private static FileProcessDAO instance = null;
    Library l;

    public FileProcessDAO() {
        l = new Library();
    }

    public static FileProcessDAO Instance() {
        if (instance == null) {
            synchronized (FileProcessDAO.class) {
                if (instance == null) {
                    instance = new FileProcessDAO();
                }
            }
        }
        return instance;
    }
    
    public void checkPath() {
        String path = l.inputString("Enter path: ");
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Path to File.");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("Path to Directory");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void getAllFileNameJavaInDirectory() {
        ArrayList<String> listFileName = new ArrayList<>();
        String path = l.inputString("Enter path: ");
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].getName().endsWith(".java")) {
                    listFileName.add(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
        System.out.println("Result " + listFileName.size() + " file!");
        for (int i = 0; i < listFileName.size(); i++) {
            System.out.println(listFileName.get(i));
        }
    }

    public void getFileWithSizeGreaterThanInput() {
        int size = l.getIntNoLimit("Enter size: ");
        size *= 1024;
        String path = l.inputString("Enter path: ");
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].length() > size) {
                    System.out.println(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    public void appendContentToFile() {
        String content = l.inputString("Enter content: ");
        String path = l.inputString("Enter path: ");
        try {
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.append(content);
                writer.close();
                System.out.println("Write done");
            } else {
                System.out.println("Path doesn't exist");
            }
        } catch(IOException e) {
            
        }
    }

    public void countCharacter() {
        String path = l.inputString("Enter path: ");
        try {
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = reader.readLine();
                int count = 0;
                while (line != null) {
                    String[] parts = line.split(" ");
                    for (String w : parts) {
                        count++;
                    }
                    line = reader.readLine();
                }
                System.out.println("Total: " + count);
            } else {
                System.out.println("Path doesn't exist");
            }
        } catch (IOException e) {
            
        }
     
    }

}