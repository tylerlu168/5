import java.util.Scanner;

public class Driver
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                Item libraryItems[] = new Item[5];

                for (int i = 0; i < libraryItems.length; i++)
                {
                        System.out.println("Please enter B for Book or P for Periodical");
                        String choice = input.nextLine();

                        if(choice.equals("B"))
                        {
                                System.out.println("Please enter the name of the Book");
                                String choice2 = input.nextLine();
                                System.out.println("Please enter the author of the Book");
                                String choice3 = input.nextLine();
                                System.out.println("Please enter the ISBN of the Book");
                                long choice4 = input.nextInt();
                                libraryItems[i] = new Book(choice2, choice4, choice3);
                        }
                        else if (choice.equals("P"))
                        {
                                System.out.println("Please enter the name of Periodical");
                                String choice2 = input.nextLine();
                                System.out.println("Please enter the issue number");
                                int choice4 = input.nextInt();
                                libraryItems[i] = new Periodical(choice2, choice4);
                        }
                        input.nextLine();
                }
                System.out.println("Your Items: ");
                for (int i = 0; i < libraryItems.length; i++)
                {

                        System.out.println(libraryItems[i].getListing());
                        System.out.println();
                }
        }

}

