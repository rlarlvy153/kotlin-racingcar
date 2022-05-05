package calculator

class StringCalculator(private val inputString: String) {
    companion object {
        const val BLANK_ERROR_MSG = "input string cannot be blank or empty"
        const val WIERD_OPERATOR_ERROR_MSG = "operator should be one of [+, -, /, *]"
        const val WRONG_OPERATOR_ERROR_MSG = "wrong operator conversion"
    }

    val result: Double by lazy { calculateExpression(inputString) }

    init {
        checkValidExpression(inputString)
    }

    private fun checkValidExpression(input: String) {
        require(input.isNotBlank()) { BLANK_ERROR_MSG }

        val splitedInput = input.split(" ")
        val isCorrectInput = splitedInput.all {
            it.toIntOrNull() != null || Operator.isValidOperator(it)
        }

        require(isCorrectInput) { WIERD_OPERATOR_ERROR_MSG }
    }

    private fun calculateExpression(input: String): Double {
        val splitedInput = input.split(" ")

        var result = splitedInput.first().toDouble()
        var operator = ""
        for (i in 1 until (splitedInput.size)) {
            if (Operator.isValidOperator(splitedInput[i])) {
                operator = splitedInput[i]
            } else {
                result = calculateExpression(result, operator, splitedInput[i].toDouble())
            }
        }
        return result
    }

    private fun calculateExpression(a: Double, operator: String, b: Double): Double {
        return when (Operator.getOperatorByStringValue(operator)) {
            Operator.PLUS -> a + b
            Operator.MINUS -> a - b
            Operator.DIVIDE -> a / b
            Operator.MULTIPLY -> a * b
        }
    }
}