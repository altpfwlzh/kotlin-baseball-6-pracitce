package baseball.util

import camp.nextstep.edu.missionutils.Randoms

class RandNumsGenerator(private val startNum: Int, private val endNum: Int) {

    fun generate(): MutableList<Int> {
        val result: MutableList<Int> = mutableListOf()

        while(result.size < 3){
            val randomNumber = Randoms.pickNumberInRange(startNum, endNum)
            if (!result.contains(randomNumber)) {
                result.add(randomNumber)
            }
        }

        return result
    }
}