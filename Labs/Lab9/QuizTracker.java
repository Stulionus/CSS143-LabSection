package Labs.Lab9;
import java.util.ArrayList;

public class QuizTracker implements Cloneable {
    private ArrayList<QuizScore> quizScores;

    public QuizTracker() {
        quizScores = new ArrayList<>();
    }

    public ArrayList<QuizScore> getQuizScores() {
        return quizScores;
    }

    public void setQuizScores(ArrayList<QuizScore> quizScores) {
        this.quizScores = quizScores;
    }

    public void add(QuizScore quizScore) {
        quizScores.add(quizScore.clone());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QuizTracker clonedTracker = (QuizTracker) super.clone();
        clonedTracker.quizScores = new ArrayList<>();

        for (QuizScore score : quizScores) {
            clonedTracker.quizScores.add(score.clone());
        }

        return clonedTracker;
    }
}
