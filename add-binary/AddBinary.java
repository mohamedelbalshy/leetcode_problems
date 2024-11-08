
public class AddBinary {

    public static void main(String[] args) {
        
       
    }


    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            result.append(sum % 2);  // Append the binary digit
            carry = sum / 2;         // Update carry
        }
        
        return result.reverse().toString();  // Reverse and convert to string 
    }
    
}
