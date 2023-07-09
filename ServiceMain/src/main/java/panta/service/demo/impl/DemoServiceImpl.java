package panta.service.demo.impl;

import org.springframework.transaction.annotation.Transactional;
import panta.mapper.demo.DemoMapper;
import panta.mapper.demo.DemoMybatisMapper;
import panta.mapper.demo.DemoMybatisPlusMapper;
import panta.model.demo.DemoModel;
import panta.model.demo.DemoMyBatisModel;
import panta.model.demo.DemoMyBatisPlusModel;
import panta.service.demo.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Resource
    private DemoMybatisMapper demoMybatisMapper;

    @Resource
    private DemoMybatisPlusMapper demoMybatisPlusMapper;

    @Override
    public DemoModel getDemo(DemoModel demoModel) {
        return demoMapper.getDemo(demoModel);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addDemo(DemoModel demoModel){
        demoMapper.addDemo(demoModel);
        new BigDecimal("10").divide(new BigDecimal("3"));
        return 0;
    }

    @Override
    public int addDemoMyBatis(DemoMyBatisModel demoModel) {
        demoMybatisMapper.insert(demoModel);
        return demoModel.getId();
    }

    @Override
    public int addDemoMyBatisPlus(DemoMyBatisPlusModel demoModel) {
        demoMybatisPlusMapper.insert(demoModel);
        return demoModel.getId();
    }

    @Override
    public int addDemoLog(DemoModel demoModel) {
        return demoMapper.addDemo(demoModel);
    }
}
