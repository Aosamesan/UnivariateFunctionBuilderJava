package asn.aosamesan.functionbuilder;

import asn.aosamesan.functionbuilder.builder.FunctionBuilder;
import org.junit.jupiter.api.Test;

public class FunctionBuilderTests {
    @Test
    public void shouldGet() {
        String expression = "sin(xpi/3)+cos(xpi/3)";
        var function = FunctionBuilder.build(expression);

        for (int i = 0; i < 5; i++) {
            System.out.printf("f(%d)=%f\n", i, function.calculate(i));
        }
    }
}
