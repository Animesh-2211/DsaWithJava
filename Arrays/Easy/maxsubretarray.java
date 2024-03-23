
public static int maxsubretarray(int []a, long k) {
    // Write your code here
    long currSum=0;
    int start=0;
    int end=-1;
    HashMap<Integer,Integer>=new HashMap<>();
    for(int i=0;i<n;i++){
        currSum +=a[i];
        if(currSum-k==0){
            start=0;
            end=i;
            break;
        }
        if(map.containsKey(currSum-k)){
            start=map.get(currSum-sum)+!;
            end=i;
            break;
        }
        map.put(currSum,i);
    }
    if(end==-1){
        System.out.println("Not found");    
    }
    else
      System.out.println(start+" , "+end );
}
