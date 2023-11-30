package baseball.util

import camp.nextstep.edu.missionutils.Randoms

class RandNumsGenerator() {

    fun generate(startNum: Int, endNum: Int, count: Int): List<Int> {
        val result: MutableList<Int> = mutableListOf()

        while(result.size < count){
            val randomNumber = Randoms.pickNumberInRange(startNum, endNum)
            if (!result.contains(randomNumber)) {
                result.add(randomNumber)
            }
        }

        return result
    }
}