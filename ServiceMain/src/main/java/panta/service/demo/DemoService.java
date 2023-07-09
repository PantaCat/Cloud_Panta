package panta.service.demo;

import panta.model.demo.DemoModel;
import panta.model.demo.DemoMyBatisModel;
import panta.model.demo.DemoMyBatisPlusModel;

public interface DemoService {

    public DemoModel getDemo(DemoModel demoModel);
    public int addDemo(DemoModel demoModel);
    public int addDemoMyBatis(DemoMyBatisModel demoModel);
    public int addDemoMyBatisPlus(DemoMyBatisPlusModel demoModel);
    public int addDemoLog(DemoModel demoModel);

}
