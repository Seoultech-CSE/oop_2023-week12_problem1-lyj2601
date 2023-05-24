import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

    
        int number;
        double number1;
        for(int i=0;i<10;i++){
            if(i<5){
                number=input.nextInt();
                list.add(number);
            }
            else{
                number1=input.nextDouble();
                list.add(number1);
            }
            
        }
        sort(list);

        for(int i=0;i<10;i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(ArrayList<Number> list ) {
        int n=list.size();

        for(int i=0; i<n-1;i++){
            for (int j = 0; j < n - i - 1; j++) {
                Number num1 = list.get(j);
                Number num2 = list.get(j + 1);
                if (num1.doubleValue() > num2.doubleValue()) {
                    // Swap elements
                    list.set(j, num2);
                    list.set(j + 1, num1);
                }
            }

        }
    }

}
