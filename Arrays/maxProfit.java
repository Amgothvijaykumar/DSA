package Arrays;

public class maxProfit {
    static int maxP(int[] prices){
        int low=prices[0];
        int profit=0;
        for(int i=1; i<prices.length; i++){
            if(low>prices[i]){
                low=prices[i];
            }
            else{
                profit=Math.max(profit,prices[i]-low);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println("Max Profit: "+maxP(prices));
    }
    
}
