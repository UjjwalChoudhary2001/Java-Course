package advjava.others;

enum Status {
    Running, Failed, Pending, Success
}

public class Enum2 {
    public static void main(String[] args) {
        Status s = Status.Success;

        if (s == Status.Success) {
            System.out.println("Done");
        } else if (s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Failed) {
            System.out.println("Try Again");
        } else if (s == Status.Pending) {
            System.out.println("Pls Wait");
        }

        s = Status.Pending;

        switch (s) {
            case Status.Pending:
                System.out.println("Pls Wait");

                break;

            case Status.Failed:
                System.out.println("Try Again");

                break;

            case Status.Success:
                System.out.println("Done");

                break;

            default:
                System.out.println("Running");

                break;
        }
    }
}
