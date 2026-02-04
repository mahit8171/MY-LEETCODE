class Solution {
    public int maxArea(int[] height) {
        int lp = 0 ;
        int rp = height.length-1; 
        int max_water =0; 
        while(lp < rp){
            int w = rp -lp ;
            int h = Math.min(height[lp], height[rp]);
            int water = w * h ;
            max_water = Math.max(max_water ,water) ;
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }

  
        }


        return max_water ;
           
               
    }
}
