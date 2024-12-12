class AdminUser extends UserAccount {
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void showDashboard() {
        System.out.println("Admin Dashboard: Manage Users and Data.");
    }

    public void deleteAllSightings() {
        WildWatcher.sightings.clear();
        System.out.println("All sightings deleted by admin.");
    }
}
