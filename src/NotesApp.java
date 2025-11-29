public class NotesApp {
    public static String[][] notes =new String[5][3];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static java.time.LocalDate localDate;

    public static void main(String[] args) {
        // entry point
        testShowNotes();
    }

    /**
     * Logic for showing all notes
     */
    public static void showNotes() {
        for (var i = 0; i < notes.length; i++) {
            Integer number = (i + 1);
            String no = Integer.toString(number);
            String createdAt = localDate.now().toString();
            String title = notes[i][0];
            String body = notes[i][1];
            String category = notes[i][2];

            if (notes[i][0] != null) {
                System.out.println(no + " | " + createdAt + " | " + category + " | " + title + " | " + body);
            }
        }
    }

    /**
     * Test for showNotes Method
     */
    public static void testShowNotes() {
        notes[0][0] = "History of Java";
        notes[0][1] = "Java is a programming language found in java";
        notes[0][2] = "History";

        notes[1][0] = "History of Golang";
        notes[1][1] = "Golang is a programming language built on top of Java";
        notes[1][2] = "History";

        notes[2][0] = "Spring Boot Design Pattern";
        notes[2][1] = "Spring Boot has a design patten";
        notes[2][2] = "Tech";

        notes[3][0] = "Lorem ipsum";
        notes[3][1] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam tellus metus, porta sit amet porttitor sit amet, viverra a libero. Donec blandit tempus faucibus. Nulla placerat urna eu arcu rutrum tincidunt. Aliquam sed mi consequat, commodo tellus eget, gravida turpis. Phasellus quis tristique nibh, in laoreet mauris. Nulla ornare lectus dui, nec ultricies tellus elementum id. Vivamus sed consectetur nibh. Donec accumsan porttitor augue. Duis pretium, massa vel feugiat facilisis, turpis purus accumsan enim, eu euismod mauris tellus at massa. Quisque eu feugiat felis. Mauris dui lectus, facilisis eget massa quis, dictum placerat orci. Sed pellentesque elit sed ante dictum, nec pulvinar diam sagittis. Proin orci arcu, viverra nec enim nec, facilisis lacinia justo. Maecenas interdum, arcu eget cursus commodo, diam velit tincidunt est, sit amet egestas dui turpis a tortor. Quisque nec convallis urna, ac lobortis augue";
        notes[3][2] = "Ipsum";

        showNotes();

    }
}
