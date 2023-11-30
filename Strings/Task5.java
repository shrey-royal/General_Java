public class Task5 {
    public static void main(String[] args) {
        String hashedPasswords[] = new String[5];
        String users[] = {"User1", "User2", "User3", "User4", "User5"};
        String passwords[] = new String[5];
        passwords[0] = "WCT%#Iy~E0£r^815";
        passwords[1] = "4P9EG1Wp`43k^A2e";
        passwords[2] = "0Y6L,`S6+5+gt{zi";
        passwords[3] = "xK2=9q4;xwL2£uWY";
        passwords[4] = "vK}59uCFp:*D&V'3";

        for (int i = 0; i < passwords.length; i++) {
            hashedPasswords[i] = Task4.encryptPassword(passwords[i]);
            // System.out.println(hashedPasswords[i]);
        }

        System.out.println(Task4.verifyPassword(passwords[4], hashedPasswords[4]));
    }
}

/*
5. User Authentication:
   Build a secure authentication system using hashed passwords in Java, where users' passwords are stored as hashes and compared during login verification.
   
   - Input: Username: "user123", Password: "Password@123"
     - Expected Output: Hashed password stored securely; successful login using the correct credentials.
*/