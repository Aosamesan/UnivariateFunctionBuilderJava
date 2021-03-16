package asn.aosamesan.functionbuilder.domain;

import asn.aosamesan.functionbuilder.functions.UnivariateFunction;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
public interface Domain {
    Domain RealNumber = Interval.createInterval(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, false, false);
    Domain PositiveRealNumber = Interval.createInterval(0, Double.POSITIVE_INFINITY, false, false);
    Domain NegativeOneToOne = Interval.createInterval(-1, 1, true, true);
    Domain NotNegativeOneToOne = union(
            Interval.createInterval(Double.NEGATIVE_INFINITY, -1, false, false),
            Interval.createInterval(1, Double.POSITIVE_INFINITY, false, false)
    );
    Domain NotZero = new ExclusiveDomain(0.0);
    Domain GreaterThanOrEqualToOne = Interval.createInterval(1, Double.POSITIVE_INFINITY, true, false);
    boolean include(double x);

    static Domain union(Domain... domains) {
        return new DomainUnion(domains);
    }

    static Domain intersect(Domain... domains) {
        return new DomainIntersection(domains);
    }

    enum IrrationalFunctionDomain implements Domain {
        SQRT(Interval.createInterval(0, Double.POSITIVE_INFINITY, true, false))
        ;
        Domain domain;

        IrrationalFunctionDomain(Domain domain) {
            this.domain = domain;
        }

        @Override
        public boolean include(double x) {
            return domain.include(x);
        }

        public static Domain getDomain(UnivariateFunction.IrrationalFunctions function) {
            return switch (function) {
                case SQRT -> SQRT;
            };
        }
    }

    enum TranscendentalFunctionDomain implements Domain {
        // logarithmic
        LOG10(PositiveRealNumber),
        LOG(PositiveRealNumber),
        // trigonometric
        SIN(RealNumber),
        COS(RealNumber),
        TAN(RealNumber),
        CSC(new ExclusivePeriodicDomain(0, Math.PI)),
        SEC(new ExclusivePeriodicDomain(Math.PI / 2, Math.PI)),
        COT(new ExclusivePeriodicDomain(0, Math.PI)),
        ASIN(NegativeOneToOne),
        ACOS(NegativeOneToOne),
        ATAN(RealNumber),
        ACSC(NotNegativeOneToOne),
        ASEC(NotNegativeOneToOne),
        ACOT(NotZero),
        // hyperbolic
        SINH(RealNumber),
        COSH(RealNumber),
        TANH(RealNumber),
        CSCH(NotZero),
        SECH(RealNumber),
        COTH(NotZero),
        ASINH(RealNumber),
        ACOSH(GreaterThanOrEqualToOne),
        ATANH(RealNumber),
        ACSCH(NotZero),
        ASECH(Interval.createInterval(0, 1, false, true)),
        ACOTH(NotNegativeOneToOne),
        // exponent
        EXP(RealNumber),
        // gamma
        GAMMA(new GammaFunctionDomain()),
        FACTORIAL(new FactorialDomain())
        ;
        Domain domain;

        TranscendentalFunctionDomain(Domain domain) {
            this.domain = domain;
        }

        @Override
        public boolean include(double x) {
            return domain.include(x);
        }

        public static Domain getDomain(UnivariateFunction.TranscendentalFunctions function) {
            return switch (function) {
                case LOG10 -> LOG10;
                case LOG -> LOG;
                case SIN -> SIN;
                case COS -> COS;
                case TAN -> TAN;
                case CSC -> CSC;
                case SEC -> SEC;
                case COT -> COT;
                case ASIN -> ASIN;
                case ACOS -> ACOS;
                case ATAN -> ATAN;
                case ACSC -> ACSC;
                case ASEC -> ASEC;
                case ACOT -> ACOT;
                case SINH -> SINH;
                case COSH -> COSH;
                case TANH -> TANH;
                case CSCH -> CSCH;
                case SECH -> SECH;
                case COTH -> COTH;
                case ASINH -> ASINH;
                case ACOSH -> ACOSH;
                case ATANH -> ATANH;
                case ACSCH -> ACSCH;
                case ASECH -> ASECH;
                case ACOTH -> ACOTH;
                case EXP -> EXP;
                case GAMMA -> GAMMA;
                case FACTORIAL -> FACTORIAL;
            };
        }
    }
}

class DomainUnion implements Domain {
    private final Stream<Domain> domainStream;

    DomainUnion(Domain... domains) {
        this.domainStream = Stream.of(domains);
    }

    @Override
    public boolean include(double x) {
        return domainStream.map(domain -> domain.include(x)).reduce((a, b) -> a || b).orElse(false);
    }

    @Override
    public String toString() {
        return domainStream.map(Domain::toString).collect(Collectors.joining("∩"));
    }
}

class DomainIntersection implements Domain {
    private final Stream<Domain> domainStream;

    DomainIntersection(Domain... domains) {
        this.domainStream = Stream.of(domains);
    }

    @Override
    public boolean include(double x) {
        return domainStream.map(domain -> domain.include(x)).reduce((a, b) -> a && b).orElse(false);
    }

    @Override
    public String toString() {
        return domainStream.map(Domain::toString).collect(Collectors.joining("∪"));
    }
}

class ExclusiveDomain implements Domain {
    private final Stream<Double> exclusionStream;

    ExclusiveDomain(Double... exclusion) {
        this.exclusionStream = Stream.of(exclusion);
    }

    @Override
    public boolean include(double x) {
        return exclusionStream.map(d -> d != x).reduce((a, b) -> a && b).orElse(true);
    }

    @Override
    public String toString() {
        return String.format("{x: x is not in {%s}}", exclusionStream.map(Object::toString).collect(Collectors.joining(", ")));
    }

}

class ExclusivePeriodicDomain implements Domain {
    private final double start;
    private final double period;

    ExclusivePeriodicDomain(double start, double period) {
        this.start = start;
        this.period = period;
    }

    @Override
    public boolean include(double x) {
        return ((x - start) / period) % 1 != 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{x: x is not ");
        builder.append(period).append("n");
        if (start != 0) {
            builder.append("+").append(start);
        }
        builder.append("}");
        return builder.toString();
    }
}

class GammaFunctionDomain implements Domain {
    @Override
    public boolean include(double x) {
        if (x == 0) {
            return false;
        } else if (x < 0 && x % 1 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "{x: x is not zero or negative integers}";
    }
}

class FactorialDomain implements Domain {
    @Override
    public boolean include(double x) {
        return !(x < 0) || x % 1 != 0;
    }

    @Override
    public String toString() {
        return "{x: x is not negative integers}";
    }

}