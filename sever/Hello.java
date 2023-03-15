import java.util.Scanner;

class Hello {
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

        switch (n) {
            case 1:           
                break;
            case 2:
                break;
            case 3: 
                break;
            case 4:
                break;
            case 5: 
                break;
            default:
                break;
        }
    }
}


