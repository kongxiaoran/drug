package hfuu.gaofei.drug.entity;

import java.util.List;

/**
 * @Author: gf
 * @Date: 2021/3/8
 * @Description
 *
 * 购物车类
 */
public class Carts {

    private Long id;

    private Long userId;

    private Float amount;         //购物车总金额

    private String drugStr;       //购买的药品集和 json 格式

    private List<Drug> drugs;     //购买的药品集合 List<> 格式

    private String time;

    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDrugStr() {
        return drugStr;
    }

    public void setDrugStr(String drugStr) {
        this.drugStr = drugStr;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
