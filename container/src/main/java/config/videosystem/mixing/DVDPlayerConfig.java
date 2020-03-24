package config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


/*

     Explicit Configuration : java Configuration 
     
     JavaConfig<-------------{javaConfig1, javaConfig2,......}
     			  import
     			  
     			  

*/
@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	
	
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar")DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
