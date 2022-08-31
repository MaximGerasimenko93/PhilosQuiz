package Quiz;

public class QuizRunner {
    static QuizConfigurator quizConfigurator;

    public static void main(String[] args) {
        Quiz quiz = quizConfigurator.execute();
        quiz.run();
    }
}

