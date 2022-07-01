
public class test {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3,3, 4, 5};
        int waterKingValue = waterKing(arr);
        System.out.print(waterKingValue);
    }

    /**
     * There is a principle of this function begin traverse this arr from index 0,
     * compare values of two closer element ,the result is not equal then delete those two element,
     * if not no nothing.The finally be left element maybe is the water King number
     * @param arr
     * @return if this arr has the water king return it , or not return -1
     */
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

        //for check if the left number is ture water king
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


