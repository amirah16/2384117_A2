/*
 *
 */
package com.uum._a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class countLine {

    public static int countLine() throws FileNotFoundException, IOException {
        final String folderPath = "C:\\Users\\User\\Documents\\238417\\Git-Command\\Assignment 2\\src\\TestFiles";
        long totalLineCount = 0;
       
        long lineCount = 0;

        final List<File> folderList = new LinkedList<>();
        folderList.add(new File(folderPath));

        while (!folderList.isEmpty()) {
            final File folder = folderList.remove(0);
            if (folder.isDirectory() && folder.exists()) {
                //Scan folder
                final File[] fileList = folder.listFiles();

                for (final File file : fileList) {
                    if (file.isDirectory()) {
                        folderList.add(file);
                    } else if (file.getName().endsWith(".java")
                            || file.getName().endsWith(".sql")) {

                        final Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            scanner.nextLine();
                            lineCount++;

                        }
                        totalLineCount += lineCount;

                        final String noLines;

                        if (lineCount > 100) {
                            noLines = "" + lineCount;
                        } else {
                            final String temp = ("     " + lineCount);
                            noLines = temp.substring(temp.length() - 5);
                        }
                        System.out.println(file.getName() + " has " + noLines + " lines ");

                    }
                }
            }
        }
        System.out.println("Total LOC: " + totalLineCount);
        return (int) totalLineCount;
    }
     public static int totalLine() throws FileNotFoundException, IOException {
        final String folderPath = "C:\\Users\\User\\Documents\\238417\\Git-Command\\Assignment 2\\src\\TestFiles";
        long totalC = 0;
        long total = 0;
        int commentsCount = 0, blankSpaces = 0, countPackage = 0, countClass = 0, countExtends = 0,
                countPublic = 0, countVoid = 0, countStatic = 0, countNew = 0;
        final List<File> folderList = new LinkedList<>();
        folderList.add(new File(folderPath));

        while (!folderList.isEmpty()) {
            final File folder = folderList.remove(0);
            if (folder.isDirectory() && folder.exists()) {
                //Scan folder
                final File[] fileList = folder.listFiles();

                for (final File file : fileList) {
                    if (file.isDirectory()) {
                        folderList.add(file);
                    } else if (file.getName().endsWith(".java")
                            || file.getName().endsWith(".sql")) {

                        final Scanner scanner2 = new Scanner(file);
                         try {
                        while (scanner2.hasNextLine()) {
                            scanner2.nextLine();
                            String data = scanner2.next();
                            if (data.startsWith("//")) 
                                commentsCount++; 
                            if (data.isEmpty())
                                blankSpaces++;
                            if (data.contains("package")) 
                                countPackage++;
                            if (data.contains("class")) 
                                countClass++;
                            if (data.contains("extends")) 
                                countExtends++;
                            if (data.contains("public")) 
                                countPublic++;
                            if (data.contains("void")) 
                                countVoid++;
                            if (data.contains("static")) 
                                countStatic++;
                            if (data.contains("new")) 
                                countNew++;
                            total++;
                            
                            } int totalCount = countPackage + countClass + countExtends + countPublic + countVoid + countStatic + countNew;
                        totalC+=totalCount;  
                         } finally {
                                scanner2.close();
                            }
                         
                         }
                       
                         /*totalC+= total; 
                        if (total > 9999) {
                            totalCount= "" + total;
                        } else {
                            final String temp = ("     " + total);
                            totalCount = temp.substring(temp.length() - 5);
                        }*/
                         
                       
                        int plusCommentBlank = commentsCount+ blankSpaces;   
                    
                    }
                }
            }
        System.out.println("ActualLOC"+totalC);
        return  (int) totalC;
        
                  }
    
              }


