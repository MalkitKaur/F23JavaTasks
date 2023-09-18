public class User{
    private String email,userName,phone;
    /**
     * This is the constructor it will be called whenever we create an instance of the user
     * @param email-,ust match valid email syntax
     * @param userName - what ever the user wishes to be called
     * @param phone - must align to the North American dialing plan
     * */
    public User(String email, String userName, String phone) {
        setEmail (email);
        setUserName (userName);
        setPhone (phone);
    }
}