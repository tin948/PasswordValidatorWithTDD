package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw ="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่าน8ขึ้นไปควรจะตัวอักษรตัวพิ้มเล็ก WEAK
        pw ="abcdefgh";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3: รหัสผ่าน8ขึ้นไปควรจะตัวเลข WEAK
        pw ="12345678";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: รหัสผ่านควรจะตัวเลขกับตัวอักษรตัวพิ้มเล็ก MEDIUM
        pw ="tin12345";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }
        // Test Case 5: รหัสผ่านควรจะตัวเลขกับตัวอักษรตัวพิ้มเล็กและอักษรตัวพิ้มใหญ่ STRONG
        pw ="Tin12345";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result5);
        }
        System.out.println("--------------------------------");
    }
}
