package asn.aosamesan.functionbuilder.functions;

public interface BinaryOperator {
    UnivariateFunction operate(UnivariateFunction left, UnivariateFunction right);

    enum BinaryOperators implements BinaryOperator {
        ADD((l, r) -> x -> l.calculate(x) + r.calculate(x)),
        SUB((l, r) -> x -> l.calculate(x) - r.calculate(x)),
        MUL((l, r) -> x -> l.calculate(x) * r.calculate(x)),
        DIV((l, r) -> x -> l.calculate(x) / r.calculate(x)),
        POW((l, r) -> x -> Math.pow(l.calculate(x), r.calculate(x))),
        MOD((l, r) -> x -> l.calculate(x) % r.calculate(x))

        ;
        BinaryOperator operator;

        BinaryOperators(BinaryOperator operator) {
            this.operator = operator;
        }

        @Override
        public UnivariateFunction operate(UnivariateFunction left, UnivariateFunction right) {
            return this.operator.operate(left, right);
        }
    }
}
