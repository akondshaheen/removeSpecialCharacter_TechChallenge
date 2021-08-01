public class RemoveSPCharacter {

    public static void main(String[] args) {
        System.out.println(removeCharacter("...adieohgodk^^!!!!///."));

    }

    public static String removeCharacter(String original){

        String reg = "[^a-zA-Z0-9]";

        return original.replaceAll(reg,"");

    }
}
