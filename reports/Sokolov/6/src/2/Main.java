public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount(new BasicLevel());
        user.applyPrivileges();

        user.setLevel(new PremiumLevel());
        user.applyPrivileges();
    }
}
