package hfuu.gaofei.drug.entity;

import java.util.List;

/**
 * @Author: gf
 * @Date: 2021/3/8
 * @Description
 *
 * 订单类
 */
public class Order {

    private Long id;

    private Long userId;            // 生成该订单的用户

    private String drugStr;       //购买的药品集和 json 格式

    private List<Drug> drugs;     //购买的药品集合 List<> 格式

    private Float amount;           //该订单的总金额

    private String address;         //该订单的配送地址

    private String createtime;

    private String remarks;         //订单的备注（管理员对于订单的处理意见）

    private Integer status;             // status = 1时表明订单 已经付款成功； status = 2 表明订单 待付款； status = 3 表明订单被管理员拒绝；status = 9表明订单 已经取消；

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

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
