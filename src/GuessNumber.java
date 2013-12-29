public class GuessNumber {
    private String answer;
    public GuessNumber(String s) {
        answer = s;
    }
    public String guess(String guess) {
        if(guess == answer){
            return "You Win";
        }
        int position = 0;
        int numberAndPosition = 0;
        for (char c : guess.toCharArray()){
            if (isSameNumberInSamePosition(guess, c)) numberAndPosition ++;
            else if(isSameNumber(c)) position++;
        }
        return numberAndPosition + "A" + position +"B";
    }

    private boolean isSameNumber(char c) {
        return answer.contains(String.valueOf(c));
    }

    private boolean isSameNumberInSamePosition(String guess, char c) {
        return answer.charAt(guess.indexOf(String.valueOf(c))) == c;
    }
}
