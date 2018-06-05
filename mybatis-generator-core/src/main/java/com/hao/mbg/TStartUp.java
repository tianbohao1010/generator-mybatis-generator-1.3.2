package com.hao.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tianbohao on 2017/12/21.
 */
public class TStartUp {
    public static void main(String[] args) throws Exception{
        List<String> warnings = new ArrayList<String>();
        File configurationFile = new File(TStartUp.class.getResource("/generatorConfig.xml").toURI());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configurationFile);

        DefaultShellCallback shellCallback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);

        myBatisGenerator.generate(null);
        System.out.println("WARNINGS INFO >>> "+warnings);
    }
}