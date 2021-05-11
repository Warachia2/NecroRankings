package necrorankings;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.net.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.*;

public class HtmlGenerator extends DefaultHandler{
	static String rankingsoutput = "C:\\Users\\Warachia\\Documents\\GitHub\\NecroRankings\\rankings\\";
	static String lbsoutput = "C:\\Users\\Warachia\\Documents\\GitHub\\NecroRankings\\lbs\\";
	static String pbsoutput = "C:\\Users\\Warachia\\Documents\\GitHub\\NecroRankings\\pbs\\";
	
	static String category = "";
	static int cur = 0; //category id, 0~16
    static boolean WRflag = false;
	static HashMap<String, Player> list = new HashMap<>();
	String nowid = "";
	int nowscore = 0;
	int nowrank = 0;
	
    boolean isSteamid = false;
    boolean isScore = false;
    boolean isRank = false;
    
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        
        //Switch Players
        list.put("76561198115768228",Player.mizmy());
        
        System.out.println("Getting Regular Entries...");
        
        //0:Aria 1:Bard 2:Bolt 3:Cadence 4:Diamond 5:Dorian 6:Dove 7:Eli 8:Mary 9:Mel 10:Monk 11:Noc 12:Tempo 13:Coda 14:Story 15:9char 16:13char
        category = "speed";
        cur = 0; WRflag = true; //Aria 0
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047597/?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Bard 1
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047596?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Bolt 2
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047619?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Cadence 3
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047626/?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Diamond 4
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047607?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Dorian 5
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047783?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Dove 6
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048040?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Eli 7
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047703?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Mary 8
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2002224?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Melody 9
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047682?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Monk 10
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047702?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Nocturna 11
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047762?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Tempo 12
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047724/?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Coda 13
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047820?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Story 14
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047666?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //9char 15
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049484?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //13char 16
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047440?xml=1").openStream(), new HtmlGenerator());
        
        
        
        category = "score";
        cur = 0; WRflag = true; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047493?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047522?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047555?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047569?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047515?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047587?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047599?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047651?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047749?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047565?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047642?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047540?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047718?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047645?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //Story
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047568?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //9char
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047616?xml=1").openStream(), new HtmlGenerator());
        cur++; WRflag = true; //13char
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047387?xml=1").openStream(), new HtmlGenerator());
        
        category = "deathless";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049087?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047487?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049475?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047527?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2051069?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049479?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049476?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049478?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048880?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048097?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048193?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047756?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048482?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049481?xml=1").openStream(), new HtmlGenerator());
        
        System.out.println("Getting Extra Speed Entries...");
        
        //0:Aria 1:Bard 2:Bolt 3:Cadence 4:Diamond 5:Dorian 6:Dove 7:Eli 8:Mary 9:Mel 10:Monk 11:Noc 12:Tempo 13:Coda 14:Story 15:9char 16:13char
        category = "hardspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2050640/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048188/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048159/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047849/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047787/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052471/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049702/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052105/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048457/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048154/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052468/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047528/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049537/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048847/?xml=1").openStream(), new HtmlGenerator());
        
        category = "nrspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047969/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048459/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2054023/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047692/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047859/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049727/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/1811409/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052104/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049426/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2053043/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2054022/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047755/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049535/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/1795160/?xml=1").openStream(), new HtmlGenerator());
        
        category = "randospeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049406/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041610/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042275/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047461/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047664/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049135/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049359/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049486/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048624/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039748/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049111/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045853/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047971/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048519/?xml=1").openStream(), new HtmlGenerator());
        
        category = "phasingspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049437/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041663/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041622/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047434/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041705/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048572/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041652/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039279/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048619/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041694/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2043822/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041693/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044754/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047448/?xml=1").openStream(), new HtmlGenerator());
        
        category = "mysteryspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049408/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045621/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042279/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047409/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041196/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049678/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045553/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048518/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049505/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047653/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2051364/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047608/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047864/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048845/?xml=1").openStream(), new HtmlGenerator());
        
        System.out.println("Getting Extra Score Entries...");
        
        category = "hardscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048147/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047380/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047595/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047413/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047728/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048576/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048730/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052001/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047975/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047925/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052467/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2038424/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047746/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048522/?xml=1").openStream(), new HtmlGenerator());
        
        category = "nrscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047968/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047639/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047498/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047548/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047521/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048925/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049413/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049468/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047759/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047584/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048136/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047556/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048085/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048520/?xml=1").openStream(), new HtmlGenerator());
        
        category = "randoscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040656/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041617/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042240/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040588/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041184/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048484/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047745/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047560/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047847/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039747/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047617/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044879/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047732/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048001/?xml=1").openStream(), new HtmlGenerator());
        
        category = "phasingscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2019483/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040612/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041620/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047388/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041182/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047422/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041655/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039281/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047846/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041701/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2043902/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041674/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047722/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039297/?xml=1").openStream(), new HtmlGenerator());
        
        category = "mysteryscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045741/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045589/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042281/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2038541/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041193/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047424/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048468/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047880/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047750/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044975/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047615/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045542/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047799/?xml=1").openStream(), new HtmlGenerator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041286/?xml=1").openStream(), new HtmlGenerator());

        System.out.println("Modifying Player Data...");
        
        //Extra Players
        list.put("Low% Monster",Player.LowMonster());
        list.put("NR Hokuho",Player.NRHokuho());
        list.put("Hard Hokuho",Player.HardHokuho());
        list.put("Rando Warachia",Player.RandoWarachia());
        list.put("Mystery Warachia",Player.MysteryWarachia());
        list.put("NR Warachia",Player.NRWarachia());
        
        ArrayList<Player> array = new ArrayList<>(list.values());
        
        //Unsubmitted
        list.get("76561198087367133").setTime(2, 27345); //Shortcake Sweets, Bolt Speed, 4:33.45
        list.get("76561197999948240").setGold(11, 30086); //Ancalagor, Nocturna Score 30086
        list.get("76561198398758840").setGold(0, 26566); //Hokuho, Aria Score 26566
        Player.scoreWR[0] = Math.max(Player.scoreWR[0], 26566);
        list.get("76561198136201511").setTime(16, 487546); //Ravio, 13char Speed 1:21:15.636
        Player.speedWR[16] = Math.min(Player.speedWR[16], 487564);
        
        //Bar Text
        LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		String fdate1 = dtformat1.format(date1);
		
		System.out.println("Making Speed LBs");
		
		//LBs
		for(int i=0;i<17;i++){
	        try {
	            FileWriter f = new FileWriter(lbsoutput + curToName(i) + "speedlbs.html", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));
	            
	            p.println("<!DOCTYPE html>");
	            p.println("<html>");
	            p.println("<head>");
	            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
	            p.println("<title>" + curToName(i) +  " Speed LBs" + "</title>");
	            p.println("</head>");
	            p.println("<body>");
	            p.println("<h1>" + curToName(i) +  " Speed LBs" + "</h1>");
	            p.println("<table border=\"5\">");
	            p.println("<tr>");
	            p.println("<th class=\"fixed01\">Rank</th>");
	            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
	            p.println("<th class=\"fixed01\">Time</th>");
	            p.println("</tr>");
	            
				int num = i;
				array.sort((a,b) -> (a.time[num] - b.time[num]));
				int rank = 1;
				for(Player player:array){
					if(player.time[num] == 0 || player.isExtra){
						continue;
					}
					else{
						player.speed[num] = rank;
						
						if(rank<=100 || !player.name().startsWith("ID")){
				            p.println("<tr>");
				            p.println("<td>" + rank + "</td>");
				            if(player.name().startsWith("ID")){
				            	p.println("<td>" + player.name() + "</td>");
				            	System.out.println("New player:" + player.name());
				            }
				            else{
				            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
				            }
				            p.println("<td>" + Player.csecToString(player.time[num]) + "</td>");
				            p.println("</tr>");	
						}
			            
						rank++;
					}
				}

	            p.println("</table>");
	            p.println("</body>");
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
	            p.println("</html>");
	            
	            p.close();
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
		
		System.out.println("Making Score LBs");
		
		for(int i=0;i<17;i++){
	        try {
	            FileWriter f = new FileWriter(lbsoutput + curToName(i) + "scorelbs.html", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));
	            
	            p.println("<!DOCTYPE html>");
	            p.println("<html>");
	            p.println("<head>");
	            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
	            p.println("<title>" + curToName(i) +  " Score LBs" + "</title>");
	            p.println("</head>");
	            p.println("<body>");
	            p.println("<h1>" + curToName(i) +  " Score LBs" + "</h1>");
	            p.println("<table border=\"5\">");
	            p.println("<tr>");
	            p.println("<th class=\"fixed01\">Rank</th>");
	            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
	            p.println("<th class=\"fixed01\">Score</th>");
	            p.println("</tr>");
	            
				int num = i;
				array.sort((a,b) -> (b.gold[num] - a.gold[num]));
				int rank = 1;
				for(Player player:array){
					if(player.score[num] == 0 || player.isExtra){
						continue;
					}
					else{
						player.score[num] = rank;
						
						if(rank<=50 || !player.name().startsWith("ID")){
				            p.println("<tr>");
				            p.println("<td>" + rank + "</td>");
				            if(player.name().startsWith("ID")){
				            	p.println("<td>" + player.name() + "</td>");
				            	System.out.println("New player:" + player.name());
				            }
				            else{
				            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
				            }
				            p.println("<td>" + player.gold[num] + "</td>");
				            p.println("</tr>");	
						}
			            
						rank++;
					}
				}

	            p.println("</table>");
	            p.println("</body>");
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
	            p.println("</html>");
	            
	            p.close();
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
        
        //Rankings
        System.out.println("Making Sum/Ratio Rankings...");
        
        array.sort((a,b) -> (a.timeSum(13) - b.timeSum(13)));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "13speedsum.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer 13char Speed PB Sum Rankings</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer 13char Speed PB Sum Rankings</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Sum</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("</tr>");
            
            int extra = 0;
            
            for(int i=0;i<156;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	if(player.isExtra){
            		extra++;
                	p.println("<td>" + (i+1-extra) + ".5" +  "</td>");
            	}
            	else{
                	p.println("<td>" + (i+1-extra) + "</td>");
            	}
            	
            	if(player.isExtra){
                	p.println("<td>" + player.name() + "</td>");
            	}
            	else{
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	}
            	p.println("<td>" + Player.csecToString(player.timeSum(13)) + "</td>");
            	
            	for(int j=0;j<13;j++){
                	p.println("<td>" + Player.csecToString(player.adjustedTime(j ,player.time[j])) + "</td>");
            	}
            	
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(1000000*(a.averageTimeRatio(13) - b.averageTimeRatio(13))));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "13speedratio.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer 13char Speed PB Ratio to WRs Rankings</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer 13char Speed PB Ratio to WRs Rankings</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Average</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("</tr>");
            
            int extra = 0;
            
            for(int i=0;i<156;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	if(player.isExtra){
            		extra++;
                	p.println("<td>" + (i+1-extra) + ".5" +  "</td>");
            	}
            	else{
                	p.println("<td>" + (i+1-extra) + "</td>");
            	}
            	
            	if(player.isExtra){
                	p.println("<td>" + player.name() + "</td>");
            	}
            	else{
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	}
            	p.println("<td>" + String.format("%.3f", player.averageTimeRatio(13)) + "</td>");
            	
            	for(int j=0;j<13;j++){
                	p.println("<td>" + String.format("%.3f",player.timeRatio(j)) + "</td>");
            	}
            	
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        array.sort((a,b) -> (a.timeSum(14) - b.timeSum(14)));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "14speedsum.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer 14char PB Sum Rankings</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer 14char PB Sum Rankings</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Sum</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("</tr>");
            
            int extra = 0;
            
            for(int i=0;i<50;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	if(player.isExtra){
            		extra++;
                	p.println("<td>" + (i+1-extra) + ".5" +  "</td>");
            	}
            	else{
                	p.println("<td>" + (i+1-extra) + "</td>");
            	}
            	
            	if(player.isExtra){
                	p.println("<td>" + player.name() + "</td>");
            	}
            	else{
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	}
            	p.println("<td>" + Player.csecToString(player.timeSum(14)) + "</td>");
            	
            	for(int j=0;j<14;j++){
                	p.println("<td>" + Player.csecToString(player.adjustedTime(j ,player.time[j])) + "</td>");
            	}
            	
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(1000000*(b.averageScoreRatio(14) - a.averageScoreRatio(14))));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "14scoreratio.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer 14char Score PB Ratio to WRs Rankings</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer 14char Score PB Ratio to WRs Rankings</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Average</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("</tr>");
            
            int extra = 0;
            
            for(int i=0;i<50;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	if(player.isExtra){
            		extra++;
                	p.println("<td>" + (i+1-extra) + ".5" +  "</td>");
            	}
            	else{
                	p.println("<td>" + (i+1-extra) + "</td>");
            	}
            	
            	if(player.isExtra){
                	p.println("<td>" + player.name() + "</td>");
            	}
            	else{
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	}
            	p.println("<td>" + String.format("%.2f", player.averageScoreRatio(14)) + "%" + "</td>");
            	
            	for(int j=0;j<14;j++){
                	p.println("<td>" + String.format("%.2f",player.scoreRatio(j)) + "%" + "</td>");
            	}
            	
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Making Extra Rankings...");
        
        array.sort((a,b) -> (int)(10000*(b.extraspeed() - a.extraspeed()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extraspeeda.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer Extra Speed Rankings A</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer Extra Speed Rankings A</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Total</th>");
            p.println("<th class=\"fixed01\">Hard</th>");
            p.println("<th class=\"fixed01\">NR</th>");
            p.println("<th class=\"fixed01\">Rando</th>");
            p.println("<th class=\"fixed01\">Phasing</th>");
            p.println("<th class=\"fixed01\">Mystery</th>");
            p.println("</tr>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extraspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.hardspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.randospeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.phasingspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrspeed()) + "</td>");
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extraspeedb.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer Extra Speed Rankings B</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer Extra Speed Rankings B</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Total</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("</tr>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extraspeed()) + "</td>");

        		for(int j=0;j<14;j++){
                	p.println("<td>" + String.format("%.2f",player.extraSpeedCharPoints(j)) + "</td>");
        		}
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(10000*(b.extrascore() - a.extrascore()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extrascorea.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer Extra Score Rankings A</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer Extra Score Rankings A</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Total</th>");
            p.println("<th class=\"fixed01\">Hard</th>");
            p.println("<th class=\"fixed01\">NR</th>");
            p.println("<th class=\"fixed01\">Rando</th>");
            p.println("<th class=\"fixed01\">Phasing</th>");
            p.println("<th class=\"fixed01\">Mystery</th>");
            p.println("</tr>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extrascore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.hardscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.randoscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.phasingscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrscore()) + "</td>");
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extrascoreb.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer Extra Score Rankings B</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer Extra Score Rankings B</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Total</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("</tr>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extrascore()) + "</td>");

        		for(int j=0;j<14;j++){
                	p.println("<td>" + String.format("%.2f",player.extraScoreCharPoints(j)) + "</td>");
        		}
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Making NecroLab Imitators...");
        
        array.sort((a,b) -> (int)(10000*(b.speedpoints() - a.speedpoints()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "necrolabspeedimitator.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroLab Speed Rankings Imitator</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroLab Speed Rankings Imitator</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Points</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("<th class=\"fixed01\">Story</th>");
            p.println("<th class=\"fixed01\">9char</th>");
            p.println("<th class=\"fixed01\">13char</th>");
            p.println("</tr>");
            
            for(int i=0;i<200;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.speedpoints()) + "</td>");

        		for(int j=0;j<17;j++){
                	p.println(ranktag(player.speed[j]));
        		}
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(10000*(b.scorepoints() - a.scorepoints()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "necrolabscoreimitator.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroLab Score Rankings Imitator</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroLab Score Rankings Imitator</h1>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Points</th>");
            p.println("<th class=\"fixed01\">Aria</th>");
            p.println("<th class=\"fixed01\">Bard</th>");
            p.println("<th class=\"fixed01\">Bolt</th>");
            p.println("<th class=\"fixed01\">Cad</th>");
            p.println("<th class=\"fixed01\">Dia</th>");
            p.println("<th class=\"fixed01\">Dor</th>");
            p.println("<th class=\"fixed01\">Dove</th>");
            p.println("<th class=\"fixed01\">Eli</th>");
            p.println("<th class=\"fixed01\">Mary</th>");
            p.println("<th class=\"fixed01\">Mel</th>");
            p.println("<th class=\"fixed01\">Monk</th>");
            p.println("<th class=\"fixed01\">Noc</th>");
            p.println("<th class=\"fixed01\">Tempo</th>");
            p.println("<th class=\"fixed01\">Coda</th>");
            p.println("<th class=\"fixed01\">Story</th>");
            p.println("<th class=\"fixed01\">9char</th>");
            p.println("<th class=\"fixed01\">13char</th>");
            p.println("</tr>");
            
            for(int i=0;i<200;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.scorepoints()) + "</td>");

        		for(int j=0;j<17;j++){
                	p.println(ranktag(player.score[j]));
        		}
                
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("</body>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Making Influence Rankings...");
        array.sort((a,b) -> (int)(100000*(b.contribution() - a.contribution())));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "influence.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            p.println("<!DOCTYPE html>");
            p.println("<html>");
            p.println("<head>");
            p.println("<link rel=\"stylesheet\" href=\"rankings.css\">");
            p.println("<title>NecroDancer LBs Influence Rankings</title>");
            p.println("</head>");
            p.println("<body>");
            p.println("<h1>NecroDancer LBs Influence Rankings</h1>");
            p.println("<p>Points are based on old necrolab formula: 1.7 / (log($rank / 100 + 1.03) / log(10))</p>");
            p.println("<p>ex. You gain 99.8 points from 1st place, 80.2 points from 2nd place, 67.2 points from 3rd place...</p>");
            p.println("<h3>[Weights]</h3>");
            p.println("<p>Speed: Cadence x2, Other x1</p>");
            p.println("<p>Score: Cadence x1, 9/13char x0.2, Other x0.5</p>");
            p.println("<p>DLess: Coda x0.5, Aria/Monk/Mary x0.2, Other x0.1</p>");
            p.println("<p>Extra: Coda NR/Rando/Mystery/Hard Speed x0.5, Other Extra Speed x0.06, Extra Score x0.02</p>");
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01\">Rank</th>");
            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01\">Total</th>");
            p.println("<th class=\"fixed01\">Speed</th>");
            p.println("<th class=\"fixed01\">Score</th>");
            p.println("<th class=\"fixed01\">DLess</th>");
            p.println("<th class=\"fixed01\">Extra</th>");
            p.println("</tr>");

            for(int i=0;i<200;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f", player.contribution()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_speed()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_score()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_deathless()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_extra()) + "</td>");
                p.println("</tr>");
            }
            
            p.println("</table>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("</body>");
            p.println("</html>");
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Making PB Lists...");
        
        for(Player player: array){
        	if(player.name().startsWith("ID") || player.isExtra){
        		continue;
        	}
            try {
                FileWriter f = new FileWriter(pbsoutput + player.name() + ".html", false);
                PrintWriter p = new PrintWriter(new BufferedWriter(f));
                
                p.println("<!DOCTYPE html>");
                p.println("<html>");
                p.println("<head>");
                p.println("<link rel=\"stylesheet\" href=\"pbstyle.css\">");
                p.println("<title>" + player.name() + "</title>");
                p.println("</head>");
                p.println("<body>");
                p.println("<h1>" + player.name() +"</h1>");

                p.println("<table border=\"5\">");
                p.println("<tr>");
                p.println("<th class=\"header\">-</th>");
                p.println("<th class=\"header\">Character</th>");
                p.println("<th class=\"header score\">Speed</th>");
                p.println("<th class=\"header rank\">-</th>");
                p.println("<th class=\"header\">-</th>");
                p.println("<th class=\"header score\">Score</th>");
                p.println("<th class=\"header rank\">-</th>");
                p.println("</tr>");
                
                for(int i=0;i<17;i++){
                    p.println("<tr>");
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "speedlbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                	p.println("<td>" + curToName(i) + "</td>");
                	p.println("<td>" + Player.csecToString(player.time[i]) + "</td>");
                	p.println(ranktag(player.speed[i]));
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "scorelbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                	p.println("<td>" + zeroout(player.gold[i]) + "</td>");
                	p.println(ranktag(player.score[i]));
                    p.println("</tr>");
                }

                p.println("</table>");

                p.println("<p></p>");
                
                p.println("<table border=\"5\">");
                p.println("<tr>");
                p.println("<th class=\"header\">-</th>");
                p.println("<th class=\"header\">Character</th>");
                p.println("<th class=\"header extra\">HrdSp</th>");
                p.println("<th class=\"header extra\">NRSp</th>");
                p.println("<th class=\"header extra\">RndSp</th>");
                p.println("<th class=\"header extra\">PhsSp</th>");
                p.println("<th class=\"header extra\">MysSp</th>");
                p.println("<th class=\"header\">-</th>");
                p.println("<th class=\"header extra\">HrdSc</th>");
                p.println("<th class=\"header extra\">NRSc</th>");
                p.println("<th class=\"header extra\">RndSc</th>");
                p.println("<th class=\"header extra\">PhsSc</th>");
                p.println("<th class=\"header extra\">MysSc</th>");
                p.println("<th class=\"header extra\">DLess</th>");
                p.println("</tr>");
                
                for(int i=0;i<14;i++){
                    p.println("<tr>");
                	p.println("<td>" + "<img src=\"icons/" + i + ".jpg\">" + "</td>");
                	p.println("<td>" + curToName(i) + "</td>");
                	p.println(t20tag(player.hardspeed[i]));
                	p.println(t20tag(player.nrspeed[i]));
                	p.println(t20tag(player.randospeed[i]));
                	p.println(t20tag(player.phasingspeed[i]));
                	p.println(t20tag(player.mysteryspeed[i]));
                	p.println("<td>" + "<img src=\"icons/" + i + ".jpg\">" + "</td>");
                	p.println(t9tag(player.hardscore[i]));
                	p.println(t9tag(player.nrscore[i]));
                	p.println(t9tag(player.randoscore[i]));
                	p.println(t9tag(player.phasingscore[i]));
                	p.println(t9tag(player.mysteryscore[i]));
                	p.println(t20tag(player.deathless[i]));
                    p.println("</tr>");
                }
                
                p.println("</table>");
                
                p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
                
                p.println("</body>");
                p.println("</html>");
                
                p.close();
     
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("Done");
    }

    public void startDocument() {
    }
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("steamid")) {
            isSteamid = true;
            return;
        }
        if (qName.equals("score")) {
            isScore = true;
            return;
        }
        if (qName.equals("rank")) {
            isRank = true;
            return;
        }
    }
    public void characters(char[] ch, int offset, int length) {
        if(isSteamid){
        	String steamid = new String(ch, offset, length);
        	nowid = steamid;
        }
        if(isScore){
        	String rawscore = new String(ch, offset, length);
        	int score = Integer.parseInt(rawscore);
        	nowscore = score;
        	
        	if(category == "speed"){
            	int csec = rawToCsec(rawscore);
            	
            	if(!necrorankings.Data.isCheater(nowid)){
                	if(WRflag){
                		Player.speedWR[cur] = csec;
                		WRflag = false;
                	}
            		
                	if(list.containsKey(nowid)){
                		list.get(nowid).setTime(cur, csec);
                	}
                	else{
                		Player p = new Player(nowid);
                		p.setTime(cur, csec);
                		list.put(nowid, p);
                	}
            	}
        	}
        	else if(category == "score"){
            	if(canPass(category, score) && !necrorankings.Data.isCheater(nowid)){
                	if(WRflag){
                		Player.scoreWR[cur] = score;
                		WRflag = false;
                	}
            		
                	if(list.containsKey(nowid)){
                		list.get(nowid).setGold(cur, score);
                	}
                	else{
                		Player p = new Player(nowid);
                		p.setGold(cur, score);
                		list.put(nowid, p);
                	}
            	}
        	}
        	else if(nowid.equals("76561198398758840")){
        		if(category == "hardspeed"){
        			Player.HardHokuho[cur] = rawToCsec(rawscore);
        		}
        		else if(category == "nrspeed"){
        			Player.NRHokuho[cur] = rawToCsec(rawscore);
        		}
        	}
        	else if(nowid.equals("76561198121399825")){
        		if(category == "randospeed"){
        			Player.RandoWarachia[cur] = rawToCsec(rawscore);
        		}
        		else if(category == "mysteryspeed"){
        			Player.MysteryWarachia[cur] = rawToCsec(rawscore);
        		}
        		else if(category == "nrspeed"){
        			Player.NRWarachia[cur] = rawToCsec(rawscore);
        		}
        	}
        }
        if(isRank){
        	if(canPass(category, nowscore) && !necrorankings.Data.isCheater(nowid)){
        		nowrank++;
            	if(list.containsKey(nowid)){
            		list.get(nowid).setRank(category, cur, nowrank);
            	}
            	else{
            		Player p = new Player(nowid);
            		p.setRank(category, cur, nowrank);
            		list.put(nowid, p);
            	}
        	}
        }
    }
    public void endElement(String uri, String localName, String qName) {
        isSteamid = false;
        isScore = false;
        isRank = false;
    }
    public void endDocument(){
    }

    ///exclude obvious chaters
    public boolean canPass(String category, int score){
    	switch(category){
    	case "score":
    	case "hardscore":
    	case "mysteryscore":
    	case "nrscore":
    	case "randoscore":
    	case "phasingscore":
    		if(cur == 1){
    			if(score >= 500000){
    				return false;
    			}
    			else{
    				return true;
    			}
    		}
    		else if(cur == 14){
    			if(score >= 200000){
    				return false;
    			}
    			else{
    				return true;
    			}
    		}
    		else if(cur >= 15){
    			if(score >= 1000000){
    				return false;
    			}
    			else{
    				return true;
    			}
    		}
    		else{
    			if(score >= 70000){
    				return false;
    			}
    			else{
    				return true;
    			}
    		}
    		
    	default: return true;
    	}
    }
    
    ///convert raw score of speed LBs to centi-seconds
    public int rawToCsec(String raw){
    	int score = Integer.parseInt(raw);
    	int csec = (100000000 - score)/10;
    	return csec;
    }

    ///cur to charname
    public static String curToName(int cur){
    	switch(cur){
    	case 0: return "Aria";
    	case 1: return "Bard";
    	case 2: return "Bolt";
    	case 3: return "Cadence";
    	case 4: return "Diamond";
    	case 5: return "Dorian";
    	case 6: return "Dove";
    	case 7: return "Eli";
    	case 8: return "Mary";
    	case 9: return "Melody";
    	case 10: return "Monk";
    	case 11: return "Nocturna";
    	case 12: return "Tempo";
    	case 13: return "Coda";
    	case 14: return "Story";
    	case 15: return "9char";
    	default: return "13char";
    	}
    }
    
    ///top20rank
    public static String t9(int rank){
    	switch(rank){
    	case 1: return "WR";
    	case 2: return "2nd";
    	case 3: return "3rd";
    	case 4: return "4th";
    	case 5: return "5th";
    	case 6: return "6th";
    	case 7: return "7th";
    	case 8: return "8th";
    	case 9: return "9th";
    	case 10: return "10th";
    	default: return "";
    	}
    }
    
    ///top20rank
    public static String t20(int rank){
    	switch(rank){
    	case 1: return "WR";
    	case 2: return "2nd";
    	case 3: return "3rd";
    	case 4: return "4th";
    	case 5: return "5th";
    	case 6: return "6th";
    	case 7: return "7th";
    	case 8: return "8th";
    	case 9: return "9th";
    	case 10: return "10th";
    	case 11: return "11th";
    	case 12: return "12th";
    	case 13: return "13th";
    	case 14: return "14th";
    	case 15: return "15th";
    	case 16: return "16th";
    	case 17: return "17th";
    	case 18: return "18th";
    	case 19: return "19th";
    	case 20: return "20th";
    	default: return "";
    	}
    }
    
    public static String rankStr(int rank){
    	switch(rank){
    	case 0: return "";
    	case 1: return "WR";
    	case 11: return "11th";
    	case 12: return "12th";
    	case 13: return "13th";
    	default: return defRankStr(rank);
    	}
    }
    
    public static String defRankStr(int rank){
    	switch(rank%10){
    	case 1: return rank + "st";
    	case 2: return rank + "nd";
    	case 3: return rank + "rd";
    	default: return rank + "th";
    	}
    }
    
    public static String zeroout(int num){
    	if(num == 0){
    		return "";
    	}
    	else{
    		return String.valueOf(num);
    	}
    }

    ///rank to tag
    public static String ranktag(int rank){
    	if(rank == 1){
        	return "<td class=\"wr\">" + rankStr(rank) + "</td>";
    	}
    	else{
        	return "<td>" + rankStr(rank) + "</td>";	
    	}
    }
    
    public static String ranktag(int rank, int cur, String category){    	
    	if(rank == 1){
        	return "<td class=\"wr\"><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + category + "lbs.html\">" + rankStr(rank) + "</a></td>";
    	}
    	else{
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + category + "lbs.html\">" + rankStr(rank) + "</a></td>";	
    	}
    }
    
    public static String t9tag(int rank){
    	if(rank == 1){
        	return "<td class=\"wr\">" + t9(rank) + "</td>";
    	}
    	else{
        	return "<td>" + t9(rank) + "</td>";	
    	}
    }
    
    public static String t20tag(int rank){
    	if(rank == 1){
        	return "<td class=\"wr\">" + t20(rank) + "</td>";
    	}
    	else{
        	return "<td>" + t20(rank) + "</td>";	
    	}
    }
}