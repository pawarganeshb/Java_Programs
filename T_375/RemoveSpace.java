public class RemoveSpace {
    public static void main(String[] args) {
        String s1 = """
                            Manoj
                Jarange
                Patil
                """;
        System.out.print(s1);
        System.out.println("========================");
        System.out.println(getSen(s1));
    }

    private static String getSen(String oldString) {
        String newString = oldString.replaceAll("\\s+", " ");
        return newString;
    }
}
