package cs2110;

public class Practice {

    /**
     * Returns the median of the three given integers, `a`, `b`, and `c`. A number `m` is the
     * "median of 3" if there is at least one other number that is <= `m` and at least one other
     * number that is >= `m`.
     */
    static int med3(int a, int b, int c) {
        // TODO 1: Use `if`-`else` statements to complete the definition of this method.
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        int med = a + b + c - min - max;

        return med;
    }

    /**
     * Returns the greatest common divisor of `m` and `n`. Requires that `0 < m <= n`.
     */
    static int gcdLoop(int m, int n) {
        assert 0 < m && m <= n;

        // TODO 2: Compute the gcd using a `for`-loop to iterate over the values of
        //  {1,...,m}, checking which are divisors of both m and n.

        for(int i = n; i > 1; i--){
            if(m % i == 0 && n % i == 0){
                return i;
            }
        }
        return 1;
    }

    /**
     * Returns the greatest common divisor of `m` and `n`. Requires that `0 < m <= n`.
     */
    static int gcdEuclideanIterative(int m, int n) {
        assert 0 < m && m <= n;

        // TODO 3: Compute the gcd using a `while`-loop to instantiate the Euclidean algorithm:
        //  If m divides n, then gcd{m,n} = m. Otherwise, gcd{m,n} = gcd{m,n % m}.

        int a = n;
        int b = m;

        while(a % b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    /**
     * Returns the greatest common divisor of `m` and `n`. Requires that `0 < m <= n`.
     */
    static int gcdEuclideanRecursive(int m, int n) {
        assert 0 < m && m <= n;

        // TODO 4: Compute the gcd recursively using the Euclidean algorithm:
        //  If m divides n, then gcd{m,n} = m. Otherwise, gcd{m,n} = gcd{m,n % m}.

        if(n % m == 0){
            return m;
        } else{
            return gcdEuclideanRecursive(n % m, m);
        }
    }

    /**
     * Prints the outputs of a game of FizzBuzz on inputs 1,...,n (inclusive). A number is a "Fizz"
     * number if it is divisible by 3. A number is a "Buzz" number if it is divisible by 5. If a
     * number is a "Fizz" number and a "Buzz" number, "FizzBuzz" is printed. If a number is only a
     * "Fizz" number, "Fizz" is printed. If a number is only a "Buzz" number, "Buzz" is printed.
     * Otherwise, the number itself is printed. Each of the n outputs should be printed on a
     * separate line (use `System.out.println()`). Requires `n >= 1`.
     */
    static void fizzBuzz(int n) {
        assert n >= 1;

        // TODO 5: Complete this method according to its specification.
        throw new UnsupportedOperationException();
    }

    /**
     * Prints the outputs of a game of FizzBuzz on inputs 1,...,n (inclusive) in the same manner as
     * the `fizzBuzz()` method, except now: A number is a "Fizz" number if it is divisible by 3 *or*
     * has a 3 in its base-10 representation. A number is a "Buzz" number if it is divisible by 5
     * *or* has a 5 in its base-10 representation.
     */
    static void fizzBuzzHard(int n) {
        assert n >= 1;

        // TODO 6: Complete this method according to its specification.
        //  It may be helpful to write some *helper methods* to separate out some computation
        //  and make your logic easier to follow.
        throw new UnsupportedOperationException();
    }
}
