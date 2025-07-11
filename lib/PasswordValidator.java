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
        boolean SupperCase = false;//ตัวอักษรพิเศษ
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
            if(!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)){
                SupperCase = true;  
            }
        }
        int count =0 ;
        if(LowerCase) count++;
        if(UpperCase) count++;
        if(Digit) count++;
        if(SupperCase) count++;
 
        if(count<=2) return PasswordStrength.WEAK ;
        if(count==3) return PasswordStrength.MEDIUM ;
        if(count==4) return PasswordStrength.STRONG ;
        return PasswordStrength.INVALID;
        
        
    }
}