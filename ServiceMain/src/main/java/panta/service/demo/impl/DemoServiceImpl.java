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
        return demoMapper.getDemo(demoModel);
    }

    @Override
    public DemoModel addDemo(DemoModel demoModel) {
        return demoMapper.addDemo(demoModel);
    }
}
