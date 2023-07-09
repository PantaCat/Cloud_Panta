package panta.model.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("demo")
public class DemoMyBatisPlusModel implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private BigDecimal number;
}
