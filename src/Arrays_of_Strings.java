public class Arrays_of_Strings {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Варко";

        for(int i = 0; i< strings.length; i++){
            System.out.println(strings[i]);
        }

        for(String string:strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null; // int 32 бита, строка может быть любой длины, но сама s ничего не весит пока не иницаизируем
        System.out.println(s);
    }
}
