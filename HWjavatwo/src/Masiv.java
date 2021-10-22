public class Masiv {
    public static void main(String[] args) {
        int [][] nums = new int[5][8];
        for(int i =0;i<nums.length;i++){
            for(int h=0;h<nums[i].length;h++){
                nums[i][h]=(int)((Math.random()*199)-99);
                System.out.print(nums[i][h]+" ");
            }
            System.out.println();
        }
        int min=nums[0][0];
        for(int i =0;i<nums.length;i++){
            for(int h=0;h<nums[i].length;h++){
                if(nums[i][h]>min)min=nums[i][h];
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное значение в масиве = "+min);
    }
}
