public class Main {

    public static void main(String[] args) {
        var value1 = 12;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("First number of the operation %s (Binary Representation: %s)\n",value1, binary1);
        var value2 = 2;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Second number of the operation %s (Binary Representation: %s)\n",value2, binary2);
        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s ^ %s = %s (Binary Representation: %s)\n", value1, value2, result, binaryResult);

    }
    /*
    
    0 = false
    1 = true


    << pushes the amount of times you set it too to the right, but verifies if the number is negative. if negative place 1's where there is space else place 0's
    

    >> pushes the amount of times you set it too to the left and place 0's where he made space


    >>> works as a leftshifter(>>)


    <<< Works as a Rightshifter(<<) but always place 0's
    */

}