public class Arrays {
    public static void main(String[] args) {
        int number = 10;       // [10]
        int[] numbers = new int[5];      //numbers -->(ссылается на этот массив) [массив]
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for(int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }


    }
}










//        int[] numbers = new int[5];      //numbers -->(ссылается на этот массив) [массив]
//        System.out.println(numbers[0]);  // 0 1 2 3 4

//public class Arrays {
//    public static void main(String[] args){
//        int number = 10; //примитивный тип данных
//        char character = 'a'; //примитивный тип данных
//        String s = "Hello"; // ссылочный тип данных (s и s1 указатели, а hello объекты)
//        //String s1 = new String("Hello)
//    }
//}