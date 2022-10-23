package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> itemArrayList = new ArrayList<>();
	for (int i = 0; i < 5; i++){
        System.out.println("Please enter B for Book or P for Periodical");
        String inputPB = scan.next();
        int inputIsbn;
        int inputIssueNumber;
        if(inputPB.equals("B")){
            System.out.println("Please enter the name of the Book");
            String inputTitle = scan.next();
            System.out.println("Please enter the author of the Book");
            String inputAuthor = scan.next();
            System.out.println("Please enter the ISBN of the Book");
            inputIsbn = scan.nextInt();
            itemArrayList.add(new Book(inputIsbn,inputAuthor,inputTitle));
        }else if(inputPB.equals("P")) {
            System.out.println("Please enter the name of Periodical");
            String inputTitle = scan.next();
            System.out.println("Please enter the issue number");
            inputIssueNumber = scan.nextInt();
            itemArrayList.add(new Periodical(inputIssueNumber,inputTitle));
        }
    }
    for (int i = 0; i < itemArrayList.size(); i++){
        System.out.println(itemArrayList.get(i).getListing());
        System.out.println();
    }
    }
}
