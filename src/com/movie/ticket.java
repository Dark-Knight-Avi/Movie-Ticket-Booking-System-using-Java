package com.movie;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class ticket {

    screen s = new screen();

    void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be printed on the ticket:");
        String name = sc.nextLine();
        String ticketDir = "C:\\Users\\aritr\\IdeaProjects\\Spring\\Movie ticket booking\\out\\Tickets";
        UUID uuid = UUID.randomUUID();
        String fileName = ticketDir + "\\" + uuid + ".txt";
        File file = new File(fileName);
        try {
            Date date = new Date();
            int cost = s.getcost(cat);
            System.out.println("========================AK Movies=======================");
            System.out.println("\t\t      ----Ticket----");
            System.out.println("\tMovie: " + movie + "\t");
            System.out.print("\tTime: " + showtime);
            System.out.println("\t\t\tSeat: " + rowch + colch);
            System.out.print("\tCategory: " + cat);
            System.out.println("\t\t\tScreen: " + screen);
            System.out.println("\tDate: " + date);
            System.out.println("\tPrice: ₹" + cost);
            System.out.println("\tThank You! Hope to see you again soon!\n\n");
            boolean fd = file.createNewFile();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("========================AK Movies=======================\n");
            fileWriter.write("\t\t      ----Ticket----\n");
            fileWriter.write("Name: " + name);
            fileWriter.write("\tMovie: "+movie+"\t\n");
            fileWriter.write("\tTime: "+showtime + "\n");
            fileWriter.write("\t\t\tSeat: "+rowch+colch + "\n");
            fileWriter.write("\tCategory: "+cat + "\n");
            fileWriter.write("\t\t\tScreen: "+screen + "\n");
            fileWriter.write("\tDate: "+date + "\n");
            fileWriter.write("\tPrice: ₹"+cost + "\n");
            fileWriter.write("\tThank You! Hope to see you again soon!\n\n");
            fileWriter.close();
            System.out.println("Ticket Saved Successfully... Thank you!");
            System.out.println("Ticket directory: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}