public class Test {
    public static int secret(int x){
        int i, j;
        i = 3 *x;
        if (i>10) j = x/3;
        else j = x/2;
        return j -1;
    }

    public static int another(int a, int b){
        int i, j;
        j = 1;
        for (i = a; i <= b; i++) {
            j = j+1;
        }
        return j;
    }
   public static void main(String[] args){
        int x = 5;
        int k = secret(x);
        System.out.println(x+""+k+""+another(x,k));
    }
}
