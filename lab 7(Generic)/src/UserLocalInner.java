import java.util.Objects;

public class UserLocalInner {
    private String login;
    private String password;

    void createQuery(){
        class Query{
            public void printToLog(){
                System.out.println("Пользователь с логинном "+login+" и паролем "
                        +password+" отправил запрос");
            }
        }
        Query query=new Query();
        query.printToLog();
    }

    public UserLocalInner(String login, String password) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLocalInner that = (UserLocalInner) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserMethodLocalInnerClass{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        UserLocalInner user=new UserLocalInner("logo1","123321");
        user.createQuery();

    }
}
