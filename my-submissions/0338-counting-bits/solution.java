class Solution {
    public int[] countBits(int n) {

        int[] arr = new int [n+1] ;

        for(int i = 0 ; i <= n ; i++ ){
            
            if( i == 0){
                arr[0] = 0;
            
            }
            else if (i%2 != 0){
                arr[i] = arr[i/2]+1;
            }else {
                arr[i] = arr[i/2];
            }
        }
        return arr ;
        
    }
}
