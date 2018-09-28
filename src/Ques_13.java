// Question 13

// Create a custom exception that do not have any stack trace.

    class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }

    public class Ques_13
    {
        public static void main(String[] args) {
            try {
                throw new CustomException("Something went wrong");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }

}
