package hfuu.gaofei.drug.entity;

/**
 * @Author: kxr
 * @Date: 2021/3/8
 * @Description
 *
 * 药品类
 */
public class Drug {

    private Long id;

    private String name;

    private Float price;

    private Long drugTypeId;        // 该药品归属的种类

    private String imgUrl;             //该药品图片地址

    private String content;         //该药品简介

    private int number;             //药品数量

    private String createtime;

    private int status;             //status = 1 表明数量足 未下架 ； status = 2 表明数量不足 已经下架 ; status = 9 表明药品删除；


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getDrugTypeId() {
        return drugTypeId;
    }

    public void setDrugTypeId(Long drugTypeId) {
        this.drugTypeId = drugTypeId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
