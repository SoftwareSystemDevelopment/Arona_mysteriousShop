package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName shop
 */
@TableName(value ="shop")
@Data
public class Shop implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Integer id;

    /**
     * 商铺名称
     */
    private String name;

    /**
     * 商铺描述
     */
    private String description;

    /**
     * 商铺所属用户ID
     */
    private Integer shopUserId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}