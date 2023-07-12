package ss8.exercise.exercise1;

public class TennisGame {
    public static final char MINUS = '-';
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(int scoreOfPlay1, int scoreOfPlay2) {
        String result = "";
        int tempScore = 0;
        if (scoreOfPlay1 == scoreOfPlay2) {
            result = getString(scoreOfPlay1);
        } else {
            boolean a = scoreOfPlay1 >= 4 || scoreOfPlay2 >= 4;
            if (a) {
                int minusResult = scoreOfPlay1 - scoreOfPlay2;
                if (minusResult == 1) result = "Advantage player1";
                else if (minusResult == -1) result = "Advantage player2";
                else if (minusResult >= 2) result = "Win for player1";
                else result = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = scoreOfPlay1;
                    else {
                        result += MINUS;
                        tempScore = scoreOfPlay2;
                    }
                    result = getResult(result, tempScore);
                }
            }
        }
        return result;
    }

    private static String getResult(String result, int tempScore) {
        switch (tempScore) {
            case ZERO:
                result += "Love";
                break;
            case ONE:
                result += "Fifteen";
                break;
            case TWO:
                result += "Thirty";
                break;
            case THREE:
                result += "Forty";
                break;
        }
        return result;
    }

    private static String getString(int scoreOfPlay1) {
        String result;
        switch (scoreOfPlay1) {
            case ZERO:
                result = "Love-All";
                break;
            case ONE:
                result = "Fifteen-All";
                break;
            case TWO:
                result = "Thirty-All";
                break;
            case THREE:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }
}
