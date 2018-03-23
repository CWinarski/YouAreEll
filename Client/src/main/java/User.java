import okhttp3.OkHttpClient;

public class User {

    private String userid;
    private String name;
    private String githubid;

    OkHttpClient client = new OkHttpClient();

    public User(String name, String githubid, String userid) {
        this.name = name;
        this.githubid = githubid;
        this.userid = userid;
    }

    public User(String name, String githubid){
        this.githubid = githubid;
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return githubid;
    }

    public void setGithub(String github) {
        this.githubid = github;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", githubid='" + githubid + '\'' +
                '}';
    }
}
