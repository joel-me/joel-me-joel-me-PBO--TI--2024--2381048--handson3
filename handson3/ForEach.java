package handson3;

public class ForEach {
    public static void main(String[] args) {
        int [] numbers = new int[20];
        for (int i = 0;i< numbers.length;i++){
            numbers[i] = i + 1;
        }
        for (int number : numbers){
            if(number % 3 == 0){
                continue;
            }
            if (number > 15){
                break;
            }
            System.out.println(number);
        }
    }
}
