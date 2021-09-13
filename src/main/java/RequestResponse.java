import java.util.Scanner;



public class RequestResponse {
    Scanner scanner = new Scanner(System.in);

    public  <T> RequestMenu (String prompt) {
        System.out.println("1 - Add entry");
        System.out.println("2 - Delete entry");
        System.out.println("3 - Search by name");
        System.out.println("4 - Search by surname");
        System.out.println("5 - Search by age");
        System.out.println("6 - Show db on the screen");
        System.out.println("7 - Import from file");
        System.out.println("8 - Export to file");
        System.out.println("9 - Quit");
        Scanner scanner;
        int i = scanner.nextInt();
        String s = scanner.nextLine();
        return i;
       
        return
    }

    public Integer Response() {

        return menuItem;
    }


}
