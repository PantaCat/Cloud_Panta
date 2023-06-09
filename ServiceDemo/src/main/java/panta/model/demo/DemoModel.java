package panta.model.demo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class DemoModel implements Serializable {
    private Integer id;
    private String name;
    private BigDecimal number;
}
