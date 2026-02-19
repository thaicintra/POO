public class SwitchCase {

     public static void main(String[] args){
        String s;
        int i = 1;

        switch (i){
            case 1:
                s = "Um";
                break;
            default:
                s = "Outro";
        }

        System.out.println(s);
    }
}