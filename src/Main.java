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
        System.out.println(" ");



    // задание 1

    int[] one = new int[] {1, 2, 3};

    double[] two = new double[] {1.57, 7.654, 9.986};

    int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(" ");

    // задание 2

        for (int i = 0; i < one.length; i++) {      // пока i меньше чем количество ячеек массива цикл продолжается
            System.out.print(one[i]);               // print вывод на одной строке, я про это не знал...
            if (i != one.length - 1){               //пока i не равно последней ячейке массива
                System.out.print(",");              //ставиться запятая
            }
        }

        System.out.println(" ");

        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1){
                System.out.print(",");
            }
        }

        System.out.println(" ");

        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1){
                System.out.print(",");
            }
        }

        System.out.println(" ");

    // задача 3
        for (int i = one.length - 1; i >= 0; i--) { //i равен количеству ячеек пока i не будет равен нулю цикл продолжается
            System.out.print(one[i]);               //print вывод на одной строке
            if (i != 0){                            // пока ячейка масива не последняя
                System.out.print(",");              //ставится запитая
            }
        }
        System.out.println(" ");

        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println(" ");

        for (int i = three.length - 1; i >= 0; i--) {
            System.out.print(three[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println(" ");

    //задача 4


        for (int i = 0; i< one.length; i++){
            if( one[i]%2 > 0){ // если число в массиве делиться на 2 с остатком больше 0 то
                one[i] = one[i] + 1;// к числу добавляем 1
            }
            System.out.println(one[i]);// вывод в консоль по окончанию одного цикла
        }


    }
}