package hfuu.gaofei.drug.entity;

/**
 * @Author: gf
 * @Date: 2021/3/8
 * @Description
 *
 * 用户类
 */
public class User {

    private Long id;

    private String account;

    private String password;

    private Integer type;           //  type = 1时表明为 管理员 ； type = 2时表明为 员工

    private String email;

    private String address;         //  用户的默认配送地址

    private String createtime;

    private Integer status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
