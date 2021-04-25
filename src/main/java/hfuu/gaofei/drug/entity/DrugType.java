package hfuu.gaofei.drug.entity;

/**
 * @Author: kxr
 * @Date: 2021/3/8
 * @Description
 *
 * 药品种类 类
 */
public class DrugType {

    private Long id;

    private String name;

    private String createtime;

    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
