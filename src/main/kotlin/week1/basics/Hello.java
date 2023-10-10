package week1.basics;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String petName = "Piku";


        petName = null;

        Integer petAge = null;

        Integer ageInOneYear = petAge + 1;

        byte petAgeInbyte = 1;

//        petAge = petAgeInbyte;

        petAge = DataTypesKt.getPetAge();


//        String[] petNames = ArraysKt.getPets();
//        System.out.println(petNames[0]);

        int[] nums = ArraysKt.getNums();

        Integer object1 = 1;
        int object2 = 2;
        char object3 = '3';
        Character object4 = '4';

        boolean object5 = true;
        Boolean object6 = false;

        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        int sum = 0;
        while (sum < 10) {
            System.out.println(sum);
            sum++;
        }
    }
}
