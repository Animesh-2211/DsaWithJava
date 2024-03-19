public class sum {

    static int sum(int []arr,int idx){
        if(idx==arr.length){
            return 0;

        }

        int small=sum(arr,idx+1)
        return small+arr[idx];
    }

}
