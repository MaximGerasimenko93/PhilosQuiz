package Quiz;

import java.util.Scanner;

public class UserEnter {

    private final Scanner scanner;

    public UserEnter(Scanner scanner) {

        this.scanner = scanner;
    }

    public long getUserAnswer() {
        return scanner.nextLong();
    }
}
