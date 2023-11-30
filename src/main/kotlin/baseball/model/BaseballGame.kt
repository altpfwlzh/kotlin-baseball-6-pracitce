package baseball.model

import baseball.util.RandNumsGenerator

class BaseballGame : Game {
    override val gameName: String
        get() = BASEBALL_GAME

    override fun run() {
        generateNumbers()
    }

    private fun generateNumbers() {
        val questionNumbers: List<Int> = RandNumsGenerator().generate(START_NUM, END_NUM, SIZE)
    }

    companion object {
        const val BASEBALL_GAME = "숫자 야구"

        const val START_NUM = 1
        const val END_NUM = 9
        const val SIZE = 3
    }
}