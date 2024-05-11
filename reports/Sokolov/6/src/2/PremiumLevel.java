public class PremiumLevel implements AccountLevel {
    @Override
    public void applyPrivileges() {
        System.out.println("Применены привилегии премиум уровня");
    }
}
