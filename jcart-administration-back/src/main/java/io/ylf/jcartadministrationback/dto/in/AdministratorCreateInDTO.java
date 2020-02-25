package io.ylf.jcartadministrationback.dto.in;

public class AdministratorCreateInDTO {

    private String username;
    private String realNum;
    private String email;
    private String avatarUrl;
    private Byte status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealNum() {
        return realNum;
    }

    public void setRealNum(String realNum) {
        this.realNum = realNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
