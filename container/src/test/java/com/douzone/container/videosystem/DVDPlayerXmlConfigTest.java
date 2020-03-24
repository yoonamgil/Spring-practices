package com.douzone.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/videosystem/DVDPlayerConfig.xml")
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	// @Autowired
	// 예외 발생 
	// : XML Bean 설정 시 id는 자동부여 되지 않는다. 
	DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")
	DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	DigitalVideoDisc dvd7;
	

	@Autowired
	@Qualifier("avengersExpansionPack1")
	DigitalVideoDisc dvd8;
	

	@Autowired
	@Qualifier("avengersExpansionPack2")
	DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersExpansionPack3")
	DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("avengersTriplePack")
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	private DVDPlayer player2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	private DVDPlayer player3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	private DVDPlayer player4;
	
	@Autowired
	@Qualifier("dvdPlayer5")
	private DVDPlayer player5;
	
	@Autowired
	@Qualifier("dvdPlayer6")
	private DVDPlayer player6;
	
	@Test
	public void testDVD1() {
		assertNull(dvd1);
	}
	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	
	
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Avengers captain America, studio=MARVEL, actors=null]",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Direcotr's Editor, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack1, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=Avengers Expansion Pack3, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
		
	}
	
	
	@Test
	public void testPlayer2NotNull() {
		assertNotNull(player2);
	}
	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("Playing Movie MARVEL's IronMan",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie MARVEL's IronMan",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie MARVEL's Avengers Direcotr's Editor",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
	

	@Test
	public void testPlay6() {
		player6.play();
		assertEquals("Playing Movie MARVEL's Avengers captain America",systemOutRule.getLog().replace("\r\n", "").replace("\n",""));
	}
}
