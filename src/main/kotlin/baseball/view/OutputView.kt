package baseball.view

import baseball.constants.ErrorMessage
import baseball.constants.Strings

class OutputView(private val strings: Strings, private val errorMessage: ErrorMessage) {
    fun outputStartGame(gameName: String) = println(strings.STARTGAME.format(gameName))
}