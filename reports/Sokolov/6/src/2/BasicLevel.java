public class BasicLevel implements AccountLevel {
    @Override
    public void applyPrivileges() {
        System.out.println("Применены привилегии базового уровня");
    }
}
