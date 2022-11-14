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
    }
}