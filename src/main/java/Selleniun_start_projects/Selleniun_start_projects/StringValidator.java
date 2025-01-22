package Selleniun_start_projects.Selleniun_start_projects;

public class StringValidator {

    public static String validateString(String input) {
        if (input == null || input.isEmpty()) {
            return "Invalid Value";
        }
        if (input.matches("^[a-zA-Z0-9]{7}$")) {
            return "Valid Value";
        } else {
            return "Invalid Value";
        }
    }
}
