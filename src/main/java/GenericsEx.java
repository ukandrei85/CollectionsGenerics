import java.util.ArrayList;
import java.util.List;

public class GenericsEx {
    public static <E> void chagePosition(E[] inputArray, int a, int b) {
        E temp = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = temp;
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static boolean checkPrime(Integer num){
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static <E extends Number> int countPrimeNumbers(ArrayList<E> list) {
        int count = 0;
        for (E element : list) {
            if(checkPrime((Integer) element)&&(Integer)element!=1){
                count++;
            }
        }
        return count;
    }
}

