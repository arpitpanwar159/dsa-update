//some steps 
// step 1st calculate the leftmax boundry
// step 2nd calculate the rightmax boundry
// step 3rd calculate the trapping water = 
// water level=min(leftmax boundry ,rightmax boundry)
//trraped water+=waterlevel-height of bar

public class Trapingrainwater {
    public static int trrapedWater(int height[]){
        int leftMax[]=new int [height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int [height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
    int trpwater=0;
    for(int i=0;i<height.length;i++){
        int waterlevel=Math.min(leftMax[i],rightMax[i]);
        trpwater+=waterlevel-height[i];
    }
     return trpwater;
}
    public static void main(String[] args) {
      int height[]={4,2,0,6,3,2,5};
      System.out.print( "Trapped Water is:"+ trrapedWater(height));

    }
}