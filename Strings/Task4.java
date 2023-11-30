public class Task4 {
    public static String encryptPassword(String password) {
        char chars[] = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 1);
        }
        return new String(chars);
    }

    public static boolean verifyPassword(String input, String encrypted) {
        char chars[] = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 1);
        }
        return new String(chars).equals(encrypted);
    }


    public static void main(String[] args) {
        String pass = "SecretPassword123";
        String encrypted = encryptPassword(pass);
        System.out.println(encrypted);
        System.out.println(verifyPassword(pass, encrypted));
    }
}

/*
4. Encryption and Decryption:
   Implement a Java application that encrypts sensitive user data (like passwords) using a chosen encryption algorithm and allows decryption for authorized users.

   - Input: "SecretPassword123"
     - Expected Output: Encrypted/Hashed password
     - Decryption: Ensure the decrypted password matches the original input.

*/