import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Hello {

    //Scanner Input = new Scanner(System.in);
    public static void main(String[] e) {
        System.out.println("1. Create a new Employee");
        System.out.println("2. Edit an Existing Employee");
        System.out.println("3. Delete an Employee");
        System.out.println("4. View a list of all employees");
        System.out.println("5. View individual employee");

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter option: ");
        int Choice = Input.nextInt();

        EnterChoice(Choice);

    }
    public static void EnterChoice(int n)
    {
        Collection<Employee> emp = new ArrayList<>();

        Scanner input2 = new Scanner(System.in);
        switch (n) {
            case 1:  System.out.println("Enter Employee");
                    System.out.print("Name: ");
                    String sName = input2.nextLine();

                    System.out.print("Surname: ");
                    String sSurname = input2.nextLine();

                    System.out.print("Email: ");
                    String sEmail = input2.nextLine();

                    emp.add(new Employee(sName, sSurname, sEmail));
                break;
            case 2: 
            System.out.println("Search for employee:");
            System.out.print("Enter Email: ");
            String sFind = input2.nextLine();
            Iterator<Employee> it = emp.iterator();{
                while(it.hasNext()){
                    if(emp.contains("sFind"))
                    {
                        System.out.println("Employee exist.");
                    }
                    else{
                        System.out.println("Employee does not exist.");
                    }
                }
            };

                break;
            case 3: 
            System.out.println("Search for employee:");
            System.out.print("Enter Email: ");
            String de3lFind = input2.nextLine();
            Iterator<Employee> it2 = emp.iterator();{
                while(it2.hasNext()){
                    if(emp.contains("sFind"))
                    {
                        emp.remove(de3lFind);
                        System.out.println("Employee deleted.");
                    }
                    else{
                        System.out.println("Employee does not exist.");
                    }
                }
            };
                break;
            case 4:
                Iterator<Employee> it3 = emp.iterator();
                while(it3.hasNext())
                {
                    System.out.println(it3.next());
                }

                break;
            case 5: 
                break;
            default: System.out.println("Invalid option.");
                break;
        }
    }
}


