

//import the header files

import java.io.*;

import java.util.Scanner;

//definition of "LineNumbers" class

public class LineNumber

{

    //definition of main method

    public static void main(String[] args)

    {

        //create an object for "Scanner" class

        Scanner in = new Scanner(System.in);

        //objective 1 if user specify fileneme in command line declare the variable and set the value

        String filename1 = null;

        //check "args" length is 1

        if (args.length == 1)

        {

            //set the value

            filename1 = args[0];

        }

        //objective 2 otherwise prompt the user for name

        else

        {

            //get the input file name from the user

            System.out.print("Please enter the file name for input: ");

            filename1 = in.next();

        }

        //get the output file name

        System.out.print("Please enter the file name for output: ");

        String filename2 = in.next();

        //try block

        try (Scanner inFile = new Scanner(new File(filename1)); PrintWriter out = new PrintWriter(filename2))

        {

            //declare the variable and set the value

            int count = 1;

            //check the condition

            while (inFile.hasNext())

            {

                //add the "/* */" to the line

                out.println("/* " + count + " */ " + inFile.nextLine());

                //increment the value

                count++;

            }

        }

        //catch block

        catch (FileNotFoundException e)

        {

            //display an error message

            System.out.println("File not found!");

        }

    }

}