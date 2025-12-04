class Count0operations {
    static int countOoperation(int num1, int num2) {
        // int num1=10; 
        // int num2=10;
        int c=0;
        
        while(num1>0 && num2>0){
            if(num2>num1){
                num2=num2-num1;
            }else num1=num1-num2;
            c++;
        }
        
        return c;
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 10;
        int res=countOoperation(num1,num2);
        System.out.println(res);
    }
}