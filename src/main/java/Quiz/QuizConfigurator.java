package Quiz;

import java.util.Scanner;

public class QuizConfigurator {
    QuizConfigurator quizConfigurator;


    public static Quiz execute() {
        QuestionAnswersHolder questionAnswersHolder1 = createQuestionAnswersHolder1();
        QuestionAnswersHolder questionAnswersHolder2 = createQuestionAnswersHolder2();
        QuestionAnswersHolder questionAnswersHolder3 = createQuestionAnswersHolder3();
        QuestionAnswersHolder questionAnswersHolder4 = createQuestionAnswersHolder4();
        QuestionAnswersHolder[] questionAnswersHolders = new QuestionAnswersHolder[]{questionAnswersHolder1,
                questionAnswersHolder2, questionAnswersHolder3, questionAnswersHolder4};
        UserEnter userEnter = new UserEnter(new Scanner(System.in));
        Quiz quiz = new Quiz(questionAnswersHolders, userEnter, new MessageSender(), new CorrectCounter());
        return quiz;
    }

    public static QuestionAnswersHolder createQuestionAnswersHolder1() {
        Answer answer1 = new Answer(1, "1. Стив Джобс", false);
        Answer answer2 = new Answer(2, "2. Фрэнсис Бэкон", false);
        Answer answer3 = new Answer(3, "3. Томас Гоббс", true);
        Answer answer4 = new Answer(4, "4. Оливер Кромвель", false);

        Answer[] answers = new Answer[]{answer1, answer2, answer3, answer4};
        QuestionAnswersHolder questionAnswersHolder = new QuestionAnswersHolder(0, new Question("Какой английский мыслитель написал книгу 'Левиафан'?"),
                new Answers(answers));
        return questionAnswersHolder;
    }

    public static QuestionAnswersHolder createQuestionAnswersHolder2() {
        Answer answer1 = new Answer(1, "1. Рене Магритт", false);
        Answer answer2 = new Answer(2, "2. Аристотель", false);
        Answer answer3 = new Answer(3, "3. Готфрид Лейбниц", false);
        Answer answer4 = new Answer(4, "4. Рене Декарт", true);

        Answer[] answers = new Answer[]{answer1, answer2, answer3, answer4};
        QuestionAnswersHolder questionAnswersHolder = new QuestionAnswersHolder(1, new Question("Кто ввел прямоугольную систему координат?"),
                new Answers(answers));
        return questionAnswersHolder;
    }

    public static QuestionAnswersHolder createQuestionAnswersHolder3() {
        Answer answer1 = new Answer(1, "1. Джейн Остин", false);
        Answer answer2 = new Answer(2, "2. Владимир Набоков", false);
        Answer answer3 = new Answer(3, "3. Виктор Пелевин", false);
        Answer answer4 = new Answer(4, "4. Владимир Сорокин", true);

        Answer[] answers = new Answer[]{answer1, answer2, answer3, answer4};
        QuestionAnswersHolder questionAnswersHolder = new QuestionAnswersHolder(2, new Question("Кто является автором романа 'Норма'"),
                new Answers(answers));
        return questionAnswersHolder;
    }

    public static QuestionAnswersHolder createQuestionAnswersHolder4() {
        Answer answer1 = new Answer(1, "1. Алексей Лосев", false);
        Answer answer2 = new Answer(2, "2. Николай Бердяев", false);
        Answer answer3 = new Answer(3, "3. Лев Гумилев", false);
        Answer answer4 = new Answer(4, "4. Александр Дугин", true);

        Answer[] answers = new Answer[]{answer1, answer2, answer3, answer4};
        QuestionAnswersHolder questionAnswersHolder = new QuestionAnswersHolder(3, new Question("Кто является автором романа 'Норма'"),
                new Answers(answers));
        return questionAnswersHolder;
    }
}
