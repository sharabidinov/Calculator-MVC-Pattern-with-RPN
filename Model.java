public class Model {
    private Viewer viewer;
    private String temp;
    private char action;
    private String leftValue;
    private String rightValue;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        action = '@';
        leftValue = "";
        rightValue = "";
    }

    public void doAction(String command) {
        if (command.equals("One")) {
            temp = temp + "1";
        } else if (command.equals("Two")) {
            temp = temp + "2";
        } else if (command.equals("Clear")) {
            temp = "0";
            action = '@';
            leftValue = "";
            rightValue = "";
        } else if (command.equals("Plus")) {
            action = '+';
            leftValue = temp;
            temp = "";
            return;
        } else if (command.equals("Minus")) {
            action = '-';
            leftValue = temp;
            temp = "";
        } else if (command.equals("Equal")) {
            rightValue = temp;
            int leftNumber = Integer.parseInt(leftValue);
            int rightNumber = Integer.parseInt(rightValue);
            int answer = 0;
            switch (action) {
                case '+':
                    answer = leftNumber + rightNumber;
                    break;
                case '-':
                    answer = leftNumber - rightNumber;
                    break;
            }
            temp = "" + answer;
        }
        viewer.update(temp);
    }
}