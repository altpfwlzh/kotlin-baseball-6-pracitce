package baseball.model

class BaseballGame() : Game {
    override val gameName: String
        get() = BASEBALL_GAME

    override fun run() {

    }

    companion object {
        const val BASEBALL_GAME = "숫자 야구"
    }
}