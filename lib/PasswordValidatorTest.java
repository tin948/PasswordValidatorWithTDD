package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw ="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed:"+pw+": Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่านเจอ1ประกอบจากพิมพ์ใหญ่,พิมพ์เล็ก,พิเศษ หรือ เลข WEAK
        pw ="123456789";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed:"+pw+": Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3: เจอ2ประกอบจากพิมพ์ใหญ่,พิมพ์เล็ก,พิเศษ หรือ เลข MEDIUM
        pw ="tin12345AAA";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed:"+pw+": Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: เจอทั้งหมดประกอบจากพิมพ์ใหญ่,พิมพ์เล็ก,พิเศษ หรือ เลข STRONG
        pw ="Tin12345AAA!";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed:"+pw+": Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result5);
        }
        System.out.println("--------------------------------");
    }
}
