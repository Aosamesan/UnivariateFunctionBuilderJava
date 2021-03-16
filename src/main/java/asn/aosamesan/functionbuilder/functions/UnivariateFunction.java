package asn.aosamesan.functionbuilder.functions;

import asn.aosamesan.functionbuilder.domain.Domain;
import org.apache.commons.math3.special.Gamma;

@FunctionalInterface
public interface UnivariateFunction {
    UnivariateFunction Identity = x -> x;
    UnivariateFunction Reciprocal = x -> 1.0 / x;
    UnivariateFunction Negative = x -> -x;

    double calculate(double x);

    default Domain getDomain() {
        if (this instanceof IrrationalFunctions) {
            return Domain.IrrationalFunctionDomain.getDomain((IrrationalFunctions) this);
        } else if (this instanceof TranscendentalFunctions) {
            return Domain.TranscendentalFunctionDomain.getDomain((TranscendentalFunctions) this);
        } else {
            return Domain.RealNumber;
        }
    }

    default UnivariateFunction compose(UnivariateFunction inner) {
        return x -> calculate(inner.calculate(x));
    }

    default UnivariateFunction composeOutter(UnivariateFunction outer) {
        return x -> outer.calculate(calculate(x));
    }

    static UnivariateFunction reciprocal(UnivariateFunction function) {
        return x -> 1.0 / function.calculate(x);
    }

    enum IrrationalFunctions implements UnivariateFunction {
        SQRT(Math::sqrt)

        ;

        UnivariateFunction function;

        IrrationalFunctions(UnivariateFunction function) {
            this.function = function;
        }

        @Override
        public double calculate(double x) {
            return function.calculate(x);
        }

        public static IrrationalFunctions getFunction(String token) {
            return switch (token.toLowerCase()) {
                case "sqrt", "√" -> IrrationalFunctions.SQRT;
                default -> null;
            };
        }
    }

    enum TranscendentalFunctions implements UnivariateFunction {
        // logarithmic
        LOG10(Math::log10),
        LOG(Math::log),
        // trigonometric
        SIN(Math::sin),
        COS(Math::cos),
        TAN(Math::tan),
        CSC(UnivariateFunction.reciprocal(Math::sin)),
        SEC(UnivariateFunction.reciprocal(Math::cos)),
        COT(UnivariateFunction.reciprocal(Math::tan)),
        ASIN(Math::asin),
        ACOS(Math::acos),
        ATAN(Math::atan),
        ACSC(UnivariateFunction.reciprocal(Math::asin)),
        ASEC(UnivariateFunction.reciprocal(Math::acos)),
        ACOT(UnivariateFunction.reciprocal(Math::atan)),
        // hyperbolic
        SINH(Math::sinh),
        COSH(Math::cosh),
        TANH(Math::tanh),
        CSCH(UnivariateFunction.reciprocal(Math::sinh)),
        SECH(UnivariateFunction.reciprocal(Math::cosh)),
        COTH(UnivariateFunction.reciprocal(Math::tanh)),
        ASINH(x -> TranscendentalFunctions.LOG.calculate(x + IrrationalFunctions.SQRT.calculate(Math.pow(x, 2) + 1))),
        ACOSH(x -> TranscendentalFunctions.LOG.calculate(x + IrrationalFunctions.SQRT.calculate(Math.pow(x, 2) - 1))),
        ATANH(x -> TranscendentalFunctions.LOG.calculate((1 + x) / (1 - x)) / 2),
        ACSCH(TranscendentalFunctions.ASINH.compose(Reciprocal)),
        ASECH(TranscendentalFunctions.ACOSH.compose(Reciprocal)),
        ACOTH(TranscendentalFunctions.ATANH.compose(Reciprocal)),
        // exponent
        EXP(Math::exp),
        // gamma
        GAMMA(Gamma::gamma),
        FACTORIAL(TranscendentalFunctions.GAMMA.compose(x -> x + 1))
        ;
        UnivariateFunction function;

        TranscendentalFunctions(UnivariateFunction function) {
            this.function = function;
        }

        @Override
        public double calculate(double x) {
            return function.calculate(x);
        }

        public static TranscendentalFunctions getFunction(String token) {
            return switch (token.toLowerCase()) {
                case "sin" -> TranscendentalFunctions.SIN;
                case "cos" -> TranscendentalFunctions.COS;
                case "tan" -> TranscendentalFunctions.TAN;
                case "csc", "cosec" -> TranscendentalFunctions.CSC;
                case "sec" -> TranscendentalFunctions.SEC;
                case "cot" -> TranscendentalFunctions.COT;
                case "asin", "arcsin" -> TranscendentalFunctions.ASIN;
                case "acos", "arccos" -> TranscendentalFunctions.ACOS;
                case "atan", "arctan" -> TranscendentalFunctions.ATAN;
                case "acsc", "arccsc", "acosec", "arccosec" -> TranscendentalFunctions.ACSC;
                case "asec", "arcsec" -> TranscendentalFunctions.ASEC;
                case "acot", "arccot" -> TranscendentalFunctions.ACOT;
                case "sinh" -> TranscendentalFunctions.SINH;
                case "cosh" -> TranscendentalFunctions.COSH;
                case "tanh" -> TranscendentalFunctions.TANH;
                case "csch", "cosech" -> TranscendentalFunctions.CSCH;
                case "sech" -> TranscendentalFunctions.SECH;
                case "coth" -> TranscendentalFunctions.COTH;
                case "asinh", "arcsinh" -> TranscendentalFunctions.ASINH;
                case "acosh", "arccosh" -> TranscendentalFunctions.ACOSH;
                case "atanh", "arctanh" -> TranscendentalFunctions.ATANH;
                case "acsch", "acosech", "arccsch", "arccosech" -> TranscendentalFunctions.ACSCH;
                case "asech", "arcsech" -> TranscendentalFunctions.ASECH;
                case "acoth", "arccoth" -> TranscendentalFunctions.ACOTH;
                case "log" -> TranscendentalFunctions.LOG10;
                case "ln" -> TranscendentalFunctions.LOG;
                case "exp" -> TranscendentalFunctions.EXP;
                case "gamma" -> TranscendentalFunctions.GAMMA;
                case "!", "fact", "factorial" -> TranscendentalFunctions.FACTORIAL;
                default -> null;
            };
        }
    }

}
