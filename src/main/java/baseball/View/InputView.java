package baseball.View;

import camp.nextstep.edu.missionutils.Console;

import java.util.Objects;

public class InputView {

    public String inputUserGuess() {
        String userInput = Console.readLine().trim();
        try {
            validateUserGuess(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("유효하지 않은 입력입니다.");
        }

        return userInput;
    }

    public String inputQuitOrRestart() {
        String userInput = Console.readLine().trim();
        try {
            validateQuitOrRestart(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("유효하지 않은 입력입니다.");
        }
        return userInput;
    }

    private void validateUserGuess (String userInput) throws IllegalArgumentException {
        int intUserInput = Integer.parseInt(userInput);
        if(intUserInput < InputValidationConstant.MIN_COMBINATION || intUserInput > InputValidationConstant.MAX_COMBINATION) {
            throw new IllegalArgumentException();
        }
    }

    public void validateQuitOrRestart(String userInput) throws IllegalArgumentException {
        if(!Objects.equals(userInput, InputValidationConstant.RESTART) && !Objects.equals(userInput, InputValidationConstant.QUIT)) {
            throw new IllegalArgumentException();
        }
    }
}
