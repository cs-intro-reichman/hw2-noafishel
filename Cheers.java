//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0];
            int num = Integer.parseInt(args[1]);
            String upperCaseStr = str.toUpperCase();
            for (int i = 0; i < str.length(); i++){
                if ("AEFHILMNORSX".indexOf(upperCaseStr.charAt(i)) != -1) {
                        System.out.println("Give me an " + upperCaseStr.charAt(i) +
                                           ": " + upperCaseStr.charAt(i) + "!");
                } else {
                        System.out.println("Give me a  " + upperCaseStr.charAt(i) +
                                           ": " + upperCaseStr.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int y = 0; y < num; y++){
                System.out.println(upperCaseStr + "!!!");
            }
        }
}
