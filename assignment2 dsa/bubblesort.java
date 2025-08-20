public class bubblesort {
    public static void main(String[] args) {
        int array[]={13,46,24,52,20,9};
        int n=6;
        int temp;
        int didSwap=0;
        //n-1 steps to sort in this case
        for(int j=1;j<=n-1;j++){
          for(int i=0;i<=n-1-j;i++){
            if(array[i+1]<array[i]){
              temp=array[i];
              array[i]=array[i+1];
              array[i+1]=temp;
              didSwap=1;
            }
          }
          if(didSwap==0){
            break;
          }
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
