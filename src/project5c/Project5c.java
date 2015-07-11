//*****************************************************************************
//Name: Brent Miller
//Date: 070715
//Project Name: Project 5c: Forever Loop with Break
//Description: This project will prompt the user for the input of an employee's
//id number, first name, last name, department name, job title and salary level.
//The users inputs whould be concatenated into a string along with a new line 
//character and appended to a data file. Once the user enters the word "quit" 
//the program will terminate.
//*****************************************************************************
package project5c;

//libraries
import java.io.PrintWriter; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//begin class Project5c
public class Project5c 
{
    //begin main
    public static void main(String[] args) throws FileNotFoundException
    {
        //two decimal place format
        DecimalFormat twoDecimal = new DecimalFormat("$###,###,###.00");     
        
        //Opens the file for writeablility
        PrintWriter outFile = new PrintWriter("personelInfo.out"); 
        
        //declarations and initializations
        int idNumber = 0;
        double salary = 0.0;
        String fName = " ", lName = " ", departmentName = " ", jobTitle = " ";
        boolean endLoop = false;
        
        Scanner input = new Scanner(System.in);
        String line;
        String idNumberString = "";  
        String salaryString = "";
    
        //begin do while loop
        do
        {    
            idNumberString = JOptionPane.showInputDialog("Please enter your Employee ID Number: or \"quit\" if you would like to quit");
            idNumber = Integer.parseInt(idNumberString);            
     
            fName = JOptionPane.showInputDialog("Please enter your First Name: ");
            lName = JOptionPane.showInputDialog("Please enter your Last Name: ");
            departmentName = JOptionPane.showInputDialog("Please enter your Department Name: ");
            jobTitle = JOptionPane.showInputDialog("Please enter your Job Title: ");

            salaryString = JOptionPane.showInputDialog("Please enter your Salary: ");
            salary = Double.parseDouble(salaryString);            

            //Actually writes to the opened file
            outFile.println("Employee ID Number: " + idNumber);
            outFile.println("Employee Name: " + fName + " " + lName);        
            outFile.println("Employee Department Name: " + departmentName);       
            outFile.println("Employee Job Title: " + jobTitle);                
            outFile.println("Employee Salary: " + twoDecimal.format(salary));
           
            //close the write file before exiting the program
            outFile.close();
            System.exit(0);
        }while(!endLoop);//end do while loop
    }//end main      
}//end class Project5c