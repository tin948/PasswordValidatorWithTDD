package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * 
     * @param ใส่พาสเวิร์ดและตรวจสอบความแข็งแกร่งของพาสเวิร์ด
     * @return อธิบายความแข็งแกร่งของพาสเวิร์ดและจะแจ้งเตือนเมื่อผิดพลาด
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง

    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        if(password.length()<8){
            return PasswordStrength.INVALID;
        } 
        //สร้างตัวแปร 
        boolean LowerCase = false;//ตัวอักษรเล็ก
        boolean UpperCase = false;//ตัวอักษรใหญ่
        boolean Digit = false;//ตัวเลข
        boolean SpecialChar = false;//ตัวอักษรพิเศษ
        //ตรวจสอบ
        for(char c : password.toCharArray()){
            if (Character.isLowerCase(c)) {
                LowerCase = true;
                
            } else if (Character.isUpperCase(c)) {
                UpperCase = true;
                  
            } else if (Character.isDigit(c)) {
                Digit = true;
            
            } else if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                // ตรวจสอบว่าเป็นอักขระพิเศษ (ไม่ใช่อักขระว่างเปล่า และไม่ใช่ตัวอักษร/ตัวเลข)
                SpecialChar = true;

            }
        }
        if(!SpecialChar&&LowerCase)
            return PasswordStrength.WEAK;
        else if (!SpecialChar&&Digit)
            return PasswordStrength.WEAK;
        else if (!LowerCase&&UpperCase)
            return PasswordStrength.MEDIUM;
        else if (LowerCase&&Digit&&SpecialChar)
            return PasswordStrength.STRONG;
        else if (LowerCase&&UpperCase&&Digit&&SpecialChar)
            return PasswordStrength.STRONG;
        else 
            return PasswordStrength.INVALID;
        
    }
}