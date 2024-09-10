import java.util.Arrays;

public class foxarray {
    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}






//public class arraypractice {
//    public static void main(String[] args) {
//        int[] integerArray = {1, 1, 2, 3, 5, 8};
//        for (int i = 0; i < integerArray.length; i++) {
//            if (integerArray[i] % 2 != 0) {
//                System.out.println(integerArray[i]);
//            }
//        }
//    }
//}