package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        String pw = "123";
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 :"+pw+": Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 :"+pw+": FAILED: Expected INVALID but got " + result1);
        }
        // Test Case /: รหัสผ่านที่มีแค่ตัวอักษรตัวเล็ก WEAK
        pw = "tinnines";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 :"+pw+": Passed: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 :"+pw+": FAILED: Expected WEAK but got " + result2);
        }
        // Test Case /: รหัสผ่านที่มีแค่ตัวเลข WEAK
        pw = "99999999";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 :"+pw+": Passed: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 3 :"+pw+": FAILED: Expected WEAK but got " + result3);
        }
        // Test Case /:  ตัวอักษรใหญ่ควรจะ MEDIUM
        pw = "TINNINES";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 :"+pw+": Small letter and digit is MEDIUM.");
        } else {
            System.out.println("Test Case 4 :"+pw+": FAILED: Expected MEDIUM but got " + result4);
        }
        // Test Case /: รหัสผ่านทั้งหมดเป็นตัวอักษรเล็ก,ตัวเลขและตัวอักษรพิเศษ STRONG
        pw = "tin1234!";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 :"+pw+": small letter , digit and special letter is STRONG.");
        } else {
            System.out.println("Test Case 5 :"+pw+": FAILED: Expected STRONG but got " + result5);
        }
        // Test Case /: รหัสผ่านทั้งหมดเป็นตัวอักษรใหญ่,ตัวอักษรเล็ก,ตัวเลขและตัวอักษรพิเศษ STRONG
        pw = "Tin1234@";
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.STRONG) {
            System.out.println("Test Case 6 :"+pw+": big letter,  small letter , digit and special letter is STRONG.");
        } else {
            System.out.println("Test Case 6 :"+pw+": FAILED: Expected STRONG but got " + result6);
        }
        System.out.println("--------------------------------");
    }
}
