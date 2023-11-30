package baseball

import baseball.controller.GameController
import baseball.misc.ExceptionHandler
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    runCatching {
        val gameController = GameController(InputView(), OutputView(), ExceptionHandler())
        gameController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}