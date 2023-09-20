package HashMap;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1){
            n = happyNumber(n);
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
        }
        return true;
    }

    private int happyNumber(int n){
        if(n == 0){
            return 0;
        }
        return (int)Math.pow(n%10, 2) + happyNumber(n/10);
    }
}

/**Best Solution */
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        return isHappyRecursive(n, set);
    }

    private boolean isHappyRecursive(int n, Set<Integer> set) {
        if (n == 1) {
            return true;
        }
        if (set.contains(n)) {
            return false;
        } else {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return isHappyRecursive(sum, set);
        }
    }
}

