package lib;

public class PasswordValidator {
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        if(password.length()<8){
            return PasswordStrength.INVALID;
        }
        //สร้างตัวแปร
        boolean LowerCase = false;//ตัวอักษรเล็ก
        boolean Digit = false;//ตัวเลข
        boolean  UpperCase = false;//ตัวอักษรใหญ๋
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                LowerCase = true;  
            }
            if(Character.isDigit(c)){
                Digit = true;  
            }
            if(Character.isUpperCase(c)){
                UpperCase = true;  
            }
        }
        if (LowerCase&&!Digit) {
            return PasswordStrength.WEAK; 
        }else if(!LowerCase&&Digit) {
            return PasswordStrength.WEAK; 
        }else if(LowerCase&&Digit&&!UpperCase) {
            return PasswordStrength.MEDIUM; 
        }else if(LowerCase&&Digit&&UpperCase) {
            return PasswordStrength.STRONG; 
        }else 
            return PasswordStrength.INVALID;
        
      
    }
}