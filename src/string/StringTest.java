package string;

public class StringTest {
    static void main(String[] args) {
        String username = "prasanna";
        String user1 = "  prasu  ";
        String gamil = "laskhmi@gmail.com";
        //String gender = new char{'m','f'};
        //char[] genders= gender.toCharArray();

       // for( char gender : genders){
            //System.out.println(gender);
        //}

        System.out.println(username.charAt(2));
        System.out.println(username.compareTo(gamil));
        System.out.println(username.equals(gamil));
        System.out.println(gamil.concat(username));
        System.out.println(username.toLowerCase());
        System.out.println(gamil.toLowerCase());
        System.out.println(username.toUpperCase());
        System.out.println(gamil.toUpperCase());
        System.out.println(user1.trim());
        System.out.println(username.length());
        System.out.println(username.isEmpty());
        System.out.println(gamil.isEmpty());
    }
}
