import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {

	public void generator() throws Exception {
		List<String> warnings = new ArrayList<String>();
		Configuration config = new ConfigurationParser(warnings).parseConfiguration(new File("generatorConfig.xml"));
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, new DefaultShellCallback(true), warnings);
		myBatisGenerator.generate(null);

	}

	public static void main(String[] args) throws Exception {
		try {
			new GeneratorSqlmap().generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
