public class Main {
    public static void main(String[] args) {

        int[] weights = new int[]{90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};// массив каждое значение занимает ячейку, количество ячеек ограничивает програмист в начале
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        int janyary = 0;
        System.out.println(weights[janyary]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }




    // задание 1

    int[] one = new int[] {1, 2, 3};

    double[] two = new double[] {1.57, 7.654, 9.986};

    int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};



    // задание 2

        System.out.println(one[0] + "," + one[1] + "," + one[2] );

        System.out.println(two[0] + " , " + two[1] + " , " + two[2] );// очень нужные пробелы между значениями =)

        System.out.println(one[0] + "," + three[1] + "," + three[2]
                                  + "," + three[3] + "," + three[4]
                                  + "," + three[5] + "," + three[6]
                                  + "," + three[7] + "," + three[8]
                                    + "," + three[9] );


    }
}