public class StrengthCheck {
    // This method is used to check the strength of the user-inputted password
    public void check(String str) {
        int strengthPoints = 0;
        char[] strArr = str.toCharArray();

        // This block terminates the program if the input contains a space
        for (int i = 0; i < strArr.length; i++) {
            if (Character.isSpaceChar(strArr[i])) {
                System.out.println("[x] Invalid password: contains a space");
                return;
            }
        }

        if (strArr.length >= 8) {
            System.out.println("[✓] Password has at least eight characters");
            strengthPoints++;
        }
        else {
            System.out.println("[x] Password does not have eight characters");
        }

        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (Character.isLowerCase(strArr[i])) {
                lowerCaseCount++;
            }
            if (Character.isUpperCase(strArr[i])) {
                upperCaseCount++;
            }
        }
        if (lowerCaseCount > 0) {
            System.out.println("[✓] Password contains at least one lowercase letter");
            strengthPoints++;
        }
        else {
            System.out.println("[x] Password does not contain a lowercase letter");
        }
        if (upperCaseCount > 0) {
            System.out.println("[✓] Password contains at least one uppercase letter");
            strengthPoints++;
        }
        else {
            System.out.println("[x] Password does not contain a uppercase letter");
        }

        int numCount = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (Character.isDigit(strArr[i])) {
                numCount++;
            }
        }
        if (numCount > 0) {
            System.out.println("[✓] Password has at least one number");
            strengthPoints++;
        }
        else {
            System.out.println("[x] Password does not have a number");
        }


        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        char[] specialCharsArr = specialChars.toCharArray();
        int specialCount = 0;
        for (int i = 0; i < specialCharsArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (specialCharsArr[i] == Character.valueOf(strArr[j])) {
                    specialCount++;
                }
            }
        }
        if (specialCount > 0) {
            System.out.println("[✓] Password has at least one special character");
            strengthPoints++;
        }
        else {
            System.out.println("[x] Password does not have a special character");
        }

        switch (strengthPoints){
            case 1:
                System.out.println("Your password strength is: Very Weak (1/5)");
                break;
            case 2:
                System.out.println("Your password strength is: Weak (2/5)");
                break;
            case 3:
                System.out.println("Your password strength is: Good (3/5)");
                break;
            case 4:
                System.out.println("Your password strength is: Moderately Strong (4/5)");
                break;
            case 5:
                System.out.println("Your password strength is: Strong (5/5)");
                break;
        }
    }

}
