package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import java.lang.String;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName ProductCategory
 * @Description: 数据
 * 把数据库映射成对象 需要添加注解
 * @DynamicUpdate 更新数据库的时间
 * @Data 自动生成Get Set tostring方法
 * @Auther: squareface
 * @Date: 2019-03-27 10:02
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

//    商品ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

//    商品名字

    private String categoryName;

//    商品编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
