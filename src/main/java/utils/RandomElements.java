package utils;

import dto.User;

import java.util.Random;

public class RandomElements {
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(randomName());
        System.out.println(randomEmail(10));
        System.out.println(randomUser(12, 10));
    }

    public static User randomUser(int emailSize, int phoneSize){
        String[] roles = {"user"};
        return new User(randomEmail(emailSize),
                randomName(),
                "Password123!",
                "https://www.gravatar.com/avatar/",
                randomPhone(phoneSize),
                roles);
    }

    public static String randomName(){
        String[] arrayName = {"Alice", "Bob", "Charlie", "David", "Emma",
                "Frank", "Grace", "Henry", "Ivy", "Jack",
                "Katherine", "Liam", "Mia", "Nathan", "Olivia"};
        return arrayName[random.nextInt(arrayName.length)];
    }

   private static String hostName(){
        String[] hostName = {"@mail.com", "@gmail.com", "@hotmail.com",
                "@yandex.com", "@yahoo.com"};
        return hostName[random.nextInt(hostName.length)];
    }
    public static String randomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] randomString = new char[length];
        int index = 0;
        int charLength = characters.length();
        for (int i = 0; i < length; i++) {
            index = random.nextInt(charLength);
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }
    public static String randomEmail(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] randomString = new char[length];
        int index = 0;
        int charLength = characters.length();
        for (int i = 0; i < length; i++) {
            index = random.nextInt(charLength);
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString)+hostName();
    }
    public static String randomPhone(int length) {      //0+randomPhone(9)
        String characters = "0123456789";
        char[] randomString = new char[length];
        int index = 0;
        int charLength = characters.length();
        for (int i = 0; i < length; i++) {
            index = random.nextInt(charLength);
            randomString[i] = characters.charAt(index);
        }
        return new String(randomString);
    }

}
