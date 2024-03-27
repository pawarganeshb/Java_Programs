class Media {
    private String password; // Data hiding

    public void facesbook(String pass) { // Abstraction
        password = pass;

    }

    public String login() {
        return password;
    }
}

public class EncapsulationInJava {
    public static void main(String[] args) {
        Media mda = new Media();
        // mda.password = "Ganesh@123";    Throws an  error due to private variable.
        mda.facesbook("Ganesh@123");
        System.out.println(mda.login());
    }

}
