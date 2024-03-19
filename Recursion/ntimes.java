
public static List<String> fillList(List<String>names,int n){
        if(n==0)
        return names;

        names.add("Coding Ninjas");
         return fillList(List<String>names,int n-1);
    }

public static List<String> printNtimes(int n) {
    List<string> names = new ArrayList<>();
    return fillList(names, n);

}