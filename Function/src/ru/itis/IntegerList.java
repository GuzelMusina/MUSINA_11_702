package ru.itis;

/**
 * 21.11.2017
 * IntegerList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class IntegerList {

    private static final int MAX_NUMBERS_COUNT = 10;

    private int[] numbers;
    private int count;

    public IntegerList(){
        this.numbers = new int[MAX_NUMBERS_COUNT];
        this.count=0;
    }

    public void add(int number){
        this.numbers[count++] = number;
    }

    public void printNumbers(){
        for(int i=0; i<count;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public IntegerList map(Function function){
        IntegerList result = new IntegerList();
        for(int i = 0; i<count;i++){
            result.add(function.transform(numbers[i]));
        }
        return result;
    }

    public IntegerList filter(Predicate predicate){
        IntegerList result = new IntegerList();
        for(int i = 0; i<count;i++){
            if(predicate.test(numbers[i])){
            result.add(numbers[i]);}
        }
        return result;
    }
}
