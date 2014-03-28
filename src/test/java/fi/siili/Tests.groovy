package fi.siili

import spock.lang.Specification

/**
 * Created by siili on 18/03/14.
 */
class Tests extends Specification {

    def "WordCounter test"() {
        expect:
        WordCounter.wordsCount(words, length) == count

        where:
        // parameter 1                      | param3    | return value
        words                               | length    | count
        ["a", "bb", "b", "ccc"] as String[] | 1         | 2
        ["a", "bb", "b", "ccc"] as String[] | 3         | 1
        ["a", "bb", "b", "ccc"] as String[] | 4         | 0
    }
}
