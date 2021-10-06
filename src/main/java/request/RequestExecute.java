package request;

import imdb.Address;
import menu.MenuItems;

import java.time.LocalDate;
import java.util.Scanner;

public class RequestExecute {

    public static void execute(Request request) {
        switch (request.getRequestType()) {
            case CHOOSE_MENU_ITEM: {
                MenuItems.showMenu();
                int menuChoice = RequestExecute.inputInt("Input menu choice (1...9)", 9, 1, 9);
                request.setRequestData(MenuItems.getMenuByValue(menuChoice));
                break;
            }
            case INPUT_USER_NAME: {
                String name = RequestExecute.inputStr("Input user name:");
                request.setRequestData(name);
                break;
            }
            case INPUT_USER_SURNAME: {
                String surname = RequestExecute.inputStr("Input user surname:");
                request.setRequestData(surname);
                break;
            }
            case INPUT_USER_BIRTHDAY: {
                System.out.println("Enter user birthdate");
                int year = inputInt("Year (1900...2021):", 2021, 1900, 5000);
                int month = inputInt("Month(1...12):", 12, 1, 1);
                int day = inputInt("Day(1...31):", 30, 1, 1);
                request.setRequestData(LocalDate.of(year, month, day));
                break;
            }
            case INPUT_USER_ADDRESS: {
                System.out.println("Enter user address");
                String city = inputStr("City:");
                String street = inputStr("Street:");
                int app = inputInt("App:", 10000000, 1, 1);
                request.setRequestData(new Address(city, street, app));
                break;
            }
            case UNKNOWN: {

            }
        }
    }

    public static int inputInt(String prompt, int maxVal, int minVal, int emptyInputVal) {
        System.out.println(prompt);
        String str = new Scanner(System.in).nextLine();
        int returnVal = emptyInputVal;
        try {
            returnVal = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        if (minVal > returnVal) {
            System.out.println("Input out of bounds. Value " + minVal + " is used");
            returnVal = minVal;
        }
        if (maxVal < returnVal) {
            System.out.println("Input out of bounds. Value " + maxVal + " is used");
            returnVal = maxVal;
        }
        return returnVal;
    }

    private static String inputStr(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in).nextLine();
    }
}
