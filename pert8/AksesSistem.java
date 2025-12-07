public interface AksesSistem {
    
    // METHOD ABSTRAK
    void login(String pin);
    void logout();

    // DEFAULT METHOD
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
