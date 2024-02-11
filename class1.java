public class class1 {
    
    public void displayMenu(){
        System.out.println("Select one of the following operations");
        System.out.println("1- Find the min. and max. of the array");
        System.out.println("2- Find the average of the array and deviations");
        System.out.println("3- Find the sum of elements with odd and even indexes");
        System.out.println("4- Exit");
    }

    public int findMaxOfArray (int [] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int findMinOfArray (int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public double [] findAverageAndDeviations(int [] array){
        int total = 0;
        double [] arr = new double [array.length];
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        double average = (double) total / array.length;
        System.out.println("Average: " + average);
        for (int i = 0; i < arr.length; i++){
            arr[i] = array[i] - average;
        }
        return arr;
    }

    public int sumOfIndexes(int [] array, boolean oddOrEvenIndexes){
        int sum = 0;
        if (oddOrEvenIndexes){ //if oddOrEvenIndexes is true calculate the sum of odd indexes
            for (int i = 0; i < array.length; i++){
                if (i % 2 != 0){
                    sum += array[i];
                }
            }
        }
        else { //if oddOrEvenIndexes is true calculate the sum of even indexes
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    sum += array[i];
                }
            }
        }
        return sum;
    }










}
