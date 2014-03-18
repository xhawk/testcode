package fi.siili

import spock.lang.Specification

/**
 * Created by siili on 18/03/14.
 */
class CalculatorTest extends Specification {

    def "Sum"() {
        expect:
        Calculator.sum((Integer) first, (Integer) second) == sum

        where:
        first   | second    | sum
        1       | 2         | 3
        1       | 5         | 6
    }
}
