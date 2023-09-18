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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    /**
     * This sets the users name, it cannot be blank
     * @param userName - whatever the user wants it to be
     * */
    public void setUserName(String userName) {
        userName=userName.trim();//remove leading and trailing white spaces
        if(userName.matches("[A-z1-9]+"))
            this.userName = userName;
        else
            throw new IlleagalArgumentException("username must have at least 1 character and/or number");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}