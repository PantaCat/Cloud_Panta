package panta.mapper.demo;


import panta.model.demo.DemoModel;

public interface DemoMapper {
    //如果没有对应的mapper映射xml文件，可以直接用@Select等方式，这2个方式不能同时存在，会引起冲突，无法正常启动项目
    //@Select("SELECT id,`name`,`number` FROM demo a where a.id=#{id} and a.`name` = #{name} and a.`number` = #{number}")
    DemoModel getDemo(DemoModel demoModel);
    DemoModel addDemo(DemoModel demoModel);
}
