package baseball.controller

import baseball.misc.ExceptionHandler
import baseball.model.BaseballGame
import baseball.model.Game
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val exceptionHandler: ExceptionHandler,
) {
    private val game: Game = BaseballGame()

    fun run() {
        val game: Game = game

        printGameStart(game)
        runGame(game)

    }

    private fun printGameStart(game: Game) {
        outputView.outputStartGame(game.gameName)
    }

    private fun runGame(game: Game) {

    }





}