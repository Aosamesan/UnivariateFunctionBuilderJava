package asn.aosamesan.functionbuilder.domain;

import lombok.Getter;

public interface Interval extends Domain {
    double getGreatestLowerBound();
    double getLeastUpperBound();
    boolean isLeftClosed();
    boolean isRightClosed();

    default boolean include(double x) {
        boolean result;

        if (isLeftClosed()) {
            result = x >= getGreatestLowerBound();
        } else {
            result = x > getGreatestLowerBound();
        }

        if (isRightClosed()) {
            result &= x <= getLeastUpperBound();
        } else {
            result &= x < getLeastUpperBound();
        }

        return result;
    }


    static Interval createInterval(double greatestLowerBound, double leastUpperBound, boolean leftClosed, boolean rightClosed) {
        if (greatestLowerBound > leastUpperBound) {
            throw new ArithmeticException("the least upper bound must be greater than or equal to the greatest lower bound");
        }
        if (greatestLowerBound == Double.NEGATIVE_INFINITY) {
            leftClosed = false;
        }
        if (leastUpperBound == Double.POSITIVE_INFINITY) {
            rightClosed = false;
        }
        return new IntervalImpl(greatestLowerBound, leastUpperBound, leftClosed, rightClosed);
    }
}

@Getter
class IntervalImpl implements Interval {
    private final double greatestLowerBound;
    private final double leastUpperBound;
    private final boolean leftClosed;
    private final boolean rightClosed;

    IntervalImpl(double greatestLowerBound, double leastUpperBound, boolean leftClosed, boolean rightClosed) {
        this.greatestLowerBound = greatestLowerBound;
        this.leastUpperBound = leastUpperBound;
        this.leftClosed = leftClosed;
        this.rightClosed = rightClosed;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (leftClosed) {
            builder.append("[");
        } else {
            builder.append("(");
        }
        if (greatestLowerBound == Double.NEGATIVE_INFINITY) {
            builder.append("-inf");
        } else {
            builder.append(greatestLowerBound);
        }
        builder.append(", ");
        if (leastUpperBound == Double.POSITIVE_INFINITY) {
            builder.append("inf");
        } else {
            builder.append(leastUpperBound);
        }
        if (rightClosed) {
            builder.append("]");
        } else {
            builder.append(")");
        }
        return builder.toString();
    }
}
