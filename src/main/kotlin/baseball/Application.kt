package baseball

import baseball.constants.ErrorMessage
import baseball.constants.Strings
import baseball.controller.GameController
import baseball.misc.ExceptionHandler
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    runCatching {
        val gameController = GameController(InputView(), OutputView(Strings, ErrorMessage), ExceptionHandler())
        gameController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}