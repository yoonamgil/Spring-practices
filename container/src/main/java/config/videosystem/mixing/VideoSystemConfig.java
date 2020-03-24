package config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*

Explicit Configuration : java Configuration 

JavaConfig<-------------{javaConfig1, javaConfig2}
			  import
			  

javaConfig1,javaConfig2

*/

@Configuration
@Import({DVDConfig.class,DVDPlayerConfig.class})
public class VideoSystemConfig {

}
