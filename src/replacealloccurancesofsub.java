

public class replacealloccurancesofsub {
    static String extractSecretMessage(String Str, String Sub) {
        Str=Str.replaceAll(Sub, " ");
        Str=Str.trim();

        return Str;
    }

    static void main(String[] args) {
        String Str = "helloxyzworldxyz";
        String Sub = "xyz";

        System.out.println(extractSecretMessage(Str,Sub)); // Output: hello world
    }


}
