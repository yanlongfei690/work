package io.ylf.jcartadministrationback.dto.out;

public class AdministratorListOutDTO {

    private Integer administrator;
    private String username;
    private Byte status;
    private Long createTimetamp;

    public Integer getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Integer administrator) {
        this.administrator = administrator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimetamp() {
        return createTimetamp;
    }

    public void setCreateTimetamp(Long createTimetamp) {
        this.createTimetamp = createTimetamp;
    }
}
