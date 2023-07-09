package panta.mapper.demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import panta.model.demo.DemoMyBatisModel;

@Mapper
public interface DemoMybatisMapper extends BaseMapper<DemoMyBatisModel> {
}
