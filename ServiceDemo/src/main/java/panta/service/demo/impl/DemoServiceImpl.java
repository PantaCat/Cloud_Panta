package panta.service.demo.impl;

import panta.mapper.demo.DemoMapper;
import panta.model.demo.DemoModel;
import panta.service.demo.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public DemoModel getDemo(DemoModel demoModel) {
       // new BigDecimal("100").divide(new BigDecimal("3"));
        return demoMapper.getDemo(demoModel);
    }

    @Override
    public int addDemoLog(DemoModel demoModel) {
        return demoMapper.addDemo(demoModel);
    }
}
