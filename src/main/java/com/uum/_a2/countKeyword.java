/*
Semester: #A171
Course: #STIW3054
Group: #A
Task: #Assignment2
Matrik: #238417
Name: #NUR AMIRAH SYAFIQAH BT ABDUL RONI
 */
package com.uum._a2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class countKeyword {

    public static int countKeyword() throws FileNotFoundException, IOException {
        final String folderPath = "C:\\Users\\User\\Documents\\238417\\Git-Command\\Assignment 2\\src\\TestFiles";
        long totalKeyword = 0;
        long total = 0;
         int kAssert=0,kBoolean=0, kBreak=0, kByte=0, kAbstract=0, kCase=0, kCatch=0, kChar=0, 
        kContinue=0, kDefault=0, kDo=0, kDouble=0,kElse=0,kEnum=0, kFinal=0, kFinally=0, 
        kFloat=0, kFor=0, kIf=0,kImplements=0, kImport=0,kInstanceof=0, kInt=0, 
        kInterface=0, kLong=0, kNative=0, kPrivate=0,kProtected=0, kReturn=0, kThrow=0, 
        kShort=0, kStrictfp=0, kSuper=0, kSwitch=0, kSynchronized=0,kThis=0, kThrows=0, 
        kVolatile=0, kTry=0, kTransient=0, kWhile=0, kTrue=0, kNull=0, kFalse=0, 
        kConst=0, kGoto=0;     
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

                        final Scanner scanner3 = new Scanner(file);
                         try {
                        while (scanner3.hasNextLine()) {
                            scanner3.nextLine();
                            String data = scanner3.next();
                             if (data.contains("abstract")) 
                                 kAbstract++;
                        if (data.contains("assert")) 
                            kAssert ++;
                        if (data.contains("boolean")) 
                            kBoolean ++;
                        if (data.contains("break")) 
                            kBreak ++;
                        if (data.contains("byte"))
                            kByte ++;
                        if (data.contains("case"))
                            kCase++;
                        if (data.contains("catch")) 
                            kCatch++;
                        if (data.contains("char")) 
                            kChar++;
                        if (data.contains("continue")) 
                            kContinue++;
                        if (data.contains("default")) 
                            kDefault ++;
                        if (data.contains("do")) 
                            kDo++;
                        if (data.contains("double")) 
                            kDouble++;
                        if (data.contains("else")) 
                            kElse++;
                        if (data.contains("enum"))
                            kEnum++;
                        if (data.contains("final"))
                            kFinal++;
                        if (data.contains("finally")) 
                            kFinally++;
                        if (data.contains("float")) 
                            kFloat++;
                        if (data.contains("for")) 
                            kFor ++;
                        if (data.contains("if")) 
                            kIf++;
                        if (data.contains("implements")) 
                            kImplements++;
                        if (data.contains("import"))
                            kImport++;
                        if (data.contains("instanceof")) 
                            kInstanceof ++;
                        if (data.contains(" int ")) 
                            kInt++;          
                        if (data.contains("interface")) 
                            kInterface ++;
                        if (data.contains("long")) 
                            kLong++;
                        if (data.contains("native")) 
                            kNative ++;
                        if (data.contains("private")) 
                            kPrivate++;
                        if (data.contains("protected")) 
                            kProtected++;
                        if (data.contains("return")) 
                            kReturn++;
                        if (data.contains("short")) 
                            kShort++;
                        if (data.contains("strictfp")) 
                            kStrictfp++;
                        if (data.contains("super")) 
                            kSuper++;
                        if (data.contains("switch")) 
                            kSwitch++;
                        if (data.contains("synchronized")) 
                            kSynchronized++;
                        if (data.contains("this")) 
                            kThis++;
                        if (data.contains("throw")) 
                            kThrow++;
                        if (data.contains("throws")) 
                            kThrows++;
                        if (data.contains("transient"))
                            kTransient++;
                        if (data.contains("try")) 
                            kTry++;
                        if (data.contains("volatile")) 
                            kVolatile++;
                        if (data.contains("while")) 
                            kWhile++;
                        if (data.contains("true")) 
                            kTrue++;
                        if (data.contains("null")) 
                            kNull++;
                        if (data.contains("false")) 
                                kFalse++;
                        if (data.contains("const")) 
                            kConst++;
                        if (data.contains("goto")) 
                            kGoto++;
                           
                            total++;
                            
                            } 
                  
                         } finally {
                                scanner3.close();
                            }
                         }
                        final String totalCount;
                         totalKeyword += total; 
                        if (total > 9999) {
                            totalCount= "" + total;
                        } else {
                            final String temp = ("     " + total);
                            totalCount = temp.substring(temp.length() - 5);
                        }
                        System.out.println(file.getName() + " has " + totalCount + " keywords");

                    }
                }
            }
        
            System.out.println("Total keywords: " + totalKeyword);
                  return (int) totalKeyword;
                  }

              }
