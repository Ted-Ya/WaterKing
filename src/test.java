
public class test {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3,3, 4, 5};
        int waterKingValue = waterKing(arr);
        System.out.print(waterKingValue);
    }

    public static int waterKing(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int candidate = 0;
        int resultHP = 0;
        for (int cur : arr) {
            if (resultHP == 0) {
                candidate = cur;
                resultHP = 1;
            } else if (cur == candidate) {
                resultHP++;
            } else {
                resultHP--;
            }

        }

        if (resultHP == 0) {
            return -1;
        }

        int count = 0;
        for (int cur : arr) {
            if (cur == candidate) {
                count++;
            }
        }

        if ((count + 1) > arr.length / 2) {
            return candidate;
        }
        return -1;
    }

}


