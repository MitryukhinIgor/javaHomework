import java.util.Objects;


public class UserInner {
    private String login;
    private String password;

    public class Query{
        public void printToLog(){
            System.out.printf("Пользователь с логинном %s и паролем %s отправил запрос\n",
                    login,password);
        }
    }

    public UserInner(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery(){
        Query query=new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInner that = (UserInner) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserInner{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        UserInner user=new UserInner("log1", "pass1");
        user.createQuery();
        UserInner.Query query1=user.new Query();
        UserInner.Query query2=new UserInner("log2", "pass2") .new Query();
        query1.printToLog();
        query2.printToLog();

    }

}