class MyMath {

    fun largestCommonDivider(firstNum: Int, secondNum: Int): Int {
        val dividers = mutableListOf<Int>()
        for (i in 1..firstNum) {
            if (firstNum % i == 0) dividers.add(i)
        }
        for (i in 1..secondNum) {
            if (firstNum % i == 0) dividers.add(i)
        }
        val filtered = dividers.toSet().toList()
        return filtered[filtered.lastIndex]
    }

    fun lastCommonMultiple(firstNum: Int, secondNum: Int): Int {
        var firstMultiple = firstNum
        var secondMultiple = secondNum

        if (firstMultiple == secondMultiple) return firstMultiple

        val firstMultiples = mutableListOf<Int>(firstNum)
        val secondMultiples = mutableListOf<Int>(secondNum)

        while (true) {
            firstMultiple += firstNum
            secondMultiple += secondNum

            firstMultiples.add(firstMultiple)
            secondMultiples.add(secondMultiple)

            if (firstMultiples.contains(secondMultiple)) {
                return secondMultiple
            }
            if (secondMultiples.contains(firstMultiple)) {
                return firstMultiple
            }
        }
    }

    fun isDollarInString(string: String): Boolean {
        string.forEach {
            if (it.toString() == "$") return true
        }
        return false
    }

    fun sumOfHundredEvens(): Int {
        val evens = mutableListOf<Int>()
        for (i in 2..99) {
            if (i % 2 == 0) {
                evens.add(i)
            }
        }
        return evens.sum()
    }

    fun reverseNum(number: Int): Int {
        val num = 420
        val reversedArray = num.toString().split("").reversed().toMutableList()

        reversedArray.removeAt(0)
        reversedArray.removeAt(reversedArray.lastIndex)

        var isNotZero = false
        val resultList = mutableListOf<String>()

        for (i in reversedArray) {
            if (i != "0") isNotZero = true
            if (isNotZero) {
                resultList.add(i)
            }
        }
        val result = ""
        return resultList.joinToString(result).toInt()
    }

    fun isPalindrome(string: String): Boolean {
        return string == string.reversed()
    }

}