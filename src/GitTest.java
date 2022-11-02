public class GitTest {
    public static void main(String[] args) {
        String[] names = {
                "Pavel",
                "Sergey",
                "Svetlana",
                "Artur",
                "Valentina"
        };
        int randomNum = (int) (Math.random() * names.length + 1);
        for (int i = 0; i < names.length; i++) {
            if (i == randomNum - 1) {
                System.out.println(names[i]);
            }
        }
    }
}
