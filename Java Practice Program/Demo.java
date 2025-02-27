class Demo{
    public static void main(String args[]){
        int nums = new int[3][4]; 

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                nums[i][j]=(int)(math.random() * 10);
            }
            System.out.println();
        }

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

       
    }

}