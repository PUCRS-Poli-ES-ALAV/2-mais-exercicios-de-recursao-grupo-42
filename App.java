import java.util.ArrayList;

public class App {
    public App() {
        System.out.println("\n\n" + convBase2(17) + "\n\n");
    }

    public int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 | n == 1)
            return 1;
        return n * fatorial(n - 1);
    }

    public int somatorio(int n) {
        if (n == 0)
            return 0;
        if (n < 0)
            return n + somatorio(n + 1);
        return n + somatorio(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1 | n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int somatorioIntervalo(int j, int k) {
        if (j < k)
            return somatorioIntervalo(k, j);
        if (j == k)
            return k;
        return k + somatorioIntervalo(j, k + 1);
    }

    public boolean isPal(String s) {
        return isPalRec(0, s.length() - 1, s);
    }

    public boolean isPalRec(int z, int n, String s) {
        if (z > (s.length() / 2)) {
            return true;
        }
        if (s.charAt(n) == s.charAt(z)) {
            return isPalRec(z + 1, n - 1, s);
        }
        return false;
    }

    public String convBase2(int n) {
        if(n<0) throw new IllegalArgumentException();
        if(n==0){return "";}
        return convBase2(n/2) + String.valueOf(n%2);
    }

    public int somatorioArrayList(ArrayList<Integer> a){
        return somatorioArrayListRec(a,a.size() - 1);
    }
    public int somatorioArrayListRec(ArrayList<Integer> a, int n){
        if(n == 0) return a.get(0);
        return a.get(n) + somatorioArrayListRec(a, n-1);
    }

}