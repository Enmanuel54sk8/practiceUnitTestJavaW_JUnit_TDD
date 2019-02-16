package Mathemator;

import interfaces.Adder;
import interfaces.Substractor;

public class Mathemator implements Substractor, Adder {

    public long substract(long... operands) {
        long ret = operands[0];
        ret = getRet(ret, operands);
        return ret;
    }

    public long add(long... operands) {
        long ret = 0;
        ret = getRetAdd(ret, operands);
        return ret;
    }

    private long getRetAdd(long ret, long... operands) {
        for(long operand: operands){
            ret += operand;
        }
        return ret;
    }

    private long getRet(long ret, long[] operands) {
        for(int i = 1; i < operands.length; i++){
            ret -= operands[i];
        }
        return ret;
    }

}
