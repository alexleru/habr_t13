import java.util.ArrayList;

public class habr_t13 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int num = 3;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        number(array, num);
        numberOut(array, num);
    }

    private static void number(int[] array, int num){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int item : array) {
            if(!String.valueOf(item).contains(String.valueOf(num))){
                newArray.add(item);
            }
        }
        System.out.println(newArray);
    }

    private static void numberOut(int[] array, int num){
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int item : array) {
            int tempInt = item;
            boolean isContain = false;
            while ((tempInt - num) >= 0) {
                if((tempInt- num)%10 == 0){
                    isContain = true;
                    break;
                } else {
                    tempInt /= 10;
                }
            }
            if(!isContain) newArray.add(item);
        }
        System.out.println(newArray);
    }
}
