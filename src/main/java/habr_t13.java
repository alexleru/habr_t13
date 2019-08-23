import java.util.ArrayList;

public class habr_t13 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int num = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        number(array, num);
    }

    private static void number(int[] array, int num){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(!String.valueOf(array[i]).contains(String.valueOf(num))){
                newArray.add(array[i]);
            }
        }
        System.out.println(newArray);
    }
}
