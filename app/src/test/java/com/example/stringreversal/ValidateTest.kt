package com.example.stringreversal

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Test

@RunWith(JUnit4::class)
class ValidateTest {
    @Test
    fun whenInputIsValid() {
        val userInput = "Foxminded cool 24/7"
        val exclusion = "1,2,3,4,5,6,7,8,9"
        val result = Validate.validateUserInput(userInput, exclusion)
        // assertThat(reuslt)

    }
}
