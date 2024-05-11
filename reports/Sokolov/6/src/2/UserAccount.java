public class UserAccount {
    private AccountLevel level;

    public UserAccount(AccountLevel level) {
        this.level = level;
    }

    public void setLevel(AccountLevel level) {
        this.level = level;
    }

    public void applyPrivileges() {
        level.applyPrivileges();
    }
}
