package opt;

import openj9.lang.management.InvalidOptionException;

import java.util.Objects;

public class Opt {
    public double opt(int a, String operation) throws Exception {
        if (operation.equals("rvs")) {
            return reverse(a);
        } else if (operation.equals("sqr")) {
            return root(a);
        } else throw new Exception("operation is not implemented");
    }

    private double root(int a) {
        return Math.sqrt(a);
    }

    private double reverse(int a) {
        return (double) 1 / a;
    }
}
