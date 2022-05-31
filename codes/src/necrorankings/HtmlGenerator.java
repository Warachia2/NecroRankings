package necrorankings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HtmlGenerator extends DefaultHandler{
	static String rankingsoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\rankings\\";
	static String lbsoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\lbs\\";
	static String pbsoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\pbs\\";
	static String chartsoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\charts\\";
	static String hiddenoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\hidden\\";
	static String dataoutput = "C:\\Users\\Warachia\\Documents\\Files\\Codes\\NecroRankings\\data\\";
	
	static String category = "";
	static int cur = 0; //category id, 0~16
    static boolean WRflag = false;
	static HashMap<String, Player> list = new HashMap<>();
	static ArrayList<Player> array = new ArrayList<>();
	String nowid = "";
	int nowscore = 0;
	int nowrank = 0;
	
	static String fdate1 = "";
	
    boolean isSteamid = false;
    boolean isScore = false;
    boolean isRank = false;
    
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        
        //Switch Players
        list.put("76561198115768228", Player.mizmy());
        list.put("76561198846415602", Player.Priw8());
        list.put("76561199043981220", Player.GPA());
        list.put("Miles", Player.Miles());
        list.put("oriane", Player.oriane());
        
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
        list.put("Hard Warachia",Player.HardWarachia());
        
        array = new ArrayList<>(list.values());
        
        //Unsubmitted
        list.get("76561198087367133").setTime(2, 27345); //Shortcake Sweets, Bolt Speed, 4:33.45
        list.get("76561198087367133").setTime(8, 33267); //Shortcake Sweets, Bolt Speed, 4:33.45
        list.get("76561198057683647").setTime(2, 23458); //Sivcria, Bolt Speed, 3:54.58
        list.get("76561198061963965").setTime(11, 54123); //kath, Nocturna Speed, 9:01.23
        list.get("76561197999948240").setGold(11, 30086); //Ancalagor, Nocturna Score 30086
        list.get("76561198056452044").setTime(0, 28347); //Bgm, Aria Speed, 4:43.47
        list.get("76561198136201511").setTime(16, 487546); //Ravio, 13char Speed 1:21:15.636
        Player.speedWR[16] = Math.min(Player.speedWR[16], 487564);
        
        list.get("76561198398758840").setGold(0, 26566); //Hokuho, Aria Score 26566
        Player.scoreWR[0] = Math.max(Player.scoreWR[0], 26566);
        
        list.get("76561198994219732").setTime(12, 29863); //NBtelethia, Tempo 4:58.63
        list.get("76561198994219732").setClear(6, 401); //NBtelethia, Dove Deathless 4-1-2
        
        list.get("76561198317639601").setExtraTime(0, 2, 35101); //Monsterracer, Bolt Hard Speed, 5:51.01
        list.get("76561198056452044").setExtraTime(0, 11, 57396); //Bgm, Nocturna Hard Speed, 9:33.96
        
        list.get("76561198121399825").setExtraGold(0, 1, 116598); //Warachia, Bard Hard Score 116598
        list.get("76561198317639601").setExtraGold(0, 2, 1933); //Monsterracer, Bolt Hard Score, 1933
        
        list.get("76561198075137353").setClear(6, 14902); //marc, Dove Deathless 149-1-3
        list.get("76561198058867434").setClear(0, 1621); //Tuf, Aria Deathless 16-3-2
        
        //Alt Account
        list.get("76561198058867434").setExtraTime(0, 11, 59723); //Tufwfo, Nocturna Hard Speed, 9:57.23
        
        //Switch
        list.get("76561198136082567").setTime(3, 71757); //Partydroid, Cad, 11:57.57
        
        //Android
        list.get("76561198844450515").setExtraTime(2, 9, 79256); //lakehope, Mel Rando, 13:12.56
        list.get("76561198844450515").setGold(12, 10571); //lakehope, Tempo, 10571
        list.get("76561198844450515").setGold(11, 16881); //lakehope, Noc, 16881
        
        //Bar Text
        LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		fdate1 = dtformat1.format(date1);
		
		//More Info
		moreInfo();
		
		System.out.println("Making LBs");
		regularLBsMaker();
		extraLBsMaker();
		System.out.println("Making Rankings...");
        sumratioMaker();
        extraRankingMaker();
        labMaker();
        influenceMaker();
        System.out.println("Making PB Lists...");
        playerListMaker();
        pblistMaker();
        System.out.println("Making Charts...");
        top10ChartMaker("Speed");
        top10ChartMaker("Score");
        extraChartMaker();
        densityMaker();
        System.out.println("Making Data...");
		maincsvMaker(5000, 20.0);
		allcsvMaker(5000, 20.0);
		wrscsvMaker();
        
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
            	if(!necrorankings.Data.isCheater(nowid)){
            		int csec = rawToCsec(rawscore);
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
        	else if(category == "deathless"){
        		if(!necrorankings.Data.isCheater(nowid)){
                	if(list.containsKey(nowid)){
                		list.get(nowid).setClear(cur, score);
                	}
                	else{
                		Player p = new Player(nowid);
                		p.setClear(cur, score);
                		list.put(nowid, p);
                	}
        		}
        	}
        	else if(category == "hardspeed" || category == "nrspeed" || category == "randospeed" || category == "phasingspeed" || category == "mysteryspeed"){
            	if(!necrorankings.Data.isCheater(nowid)){
            		int csec = rawToCsec(rawscore);
            		int ord = categoryToOrd(category);
                	if(list.containsKey(nowid)){
                		list.get(nowid).setExtraTime(ord, cur, csec);
                	}
                	else{
                		Player p = new Player(nowid);
                		p.setExtraTime(ord, cur, csec);
                		list.put(nowid, p);
                	}
            	}
        	}
        	else{
            	if(canPass(category, score) && !necrorankings.Data.isCheater(nowid)){
            		int ord = categoryToOrd(category);
                	if(list.containsKey(nowid)){
                		list.get(nowid).setExtraGold(ord, cur, score);
                	}
                	else{
                		Player p = new Player(nowid);
                		p.setExtraGold(ord, cur, score);
                		list.put(nowid, p);
                	}
            	}
        	}
        	
        	if(nowid.equals("76561198398758840")){
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
        		else if(category == "hardspeed"){
        			Player.HardWarachia[cur] = rawToCsec(rawscore);
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

    //More Info
    public static void moreInfo(){
    	//Abu
    	list.get("76561197993247154").addInfo(worldsfirst("Every Character Sub6"));
    	list.get("76561197993247154").addInfo(worldsfirst("Cadence Sub5","https://youtu.be/-RuMZpJQF_o"));
    	list.get("76561197993247154").addInfo(worldsfirst("Nocturna Sub6"));
    	list.get("76561197993247154").addInfo("Winner of CoNDOR S7");
    	list.get("76561197993247154").addInfo(youtube("https://www.youtube.com/channel/UC-2RuaSxOc8Jt7BKJoM_TMQ"));
    	//AlexisYj
    	list.get("76561198040558429").addInfo(conduitWinner(5));
    	//Ancalagor
    	list.get("76561197999948240").addInfo("Also known as: feartheducky");
    	list.get("76561197999948240").addInfo(conduitWinner(30));
    	//ashastral
    	list.get("76561198012546822").addInfo("Also known as: Fraxtil");
    	list.get("76561198012546822").addInfo(linkText("Developer of Delta Mod", "https://steamcommunity.com/sharedfiles/filedetails/?id=1866616675"));
    	//bacing
    	list.get("76561198028146044").addInfo("Also known as: BigBlue");
    	//Bgm
    	list.get("76561198056452044").addInfo(worldsfirst("Melody Sub5"));
    	//biggiemac42
    	list.get("76561197998799529").addInfo(conduitWinner(23));
    	list.get("76561197998799529").addInfo("Found gold duping");
    	//BronxTaco
    	list.get("76561198018411976").addInfo(linkText("Developer of Awareness","https://github.com/bronxtaco/Awareness"));
    	//Bunnykins
    	list.get("76561198142306066").addInfo("Also known as: Laurie D. Bunnykins");
    	//Captpiplup
    	list.get("76561198329442425").addInfo("Also known as: EricDaWolf, RealDASlup");
    	//Crispy Fried Potatoes
    	list.get("76561198071175501").addInfo("Also known as: Crispy Fried Potatoes");
    	//Cyber
    	list.get("76561198194866686").addInfo(conduitWinner(11));
    	//Dix
    	list.get("76561198095129892").addInfo("Also known as: French numbers");
    	//DJC
    	list.get("76561197970186393").addInfo("Winner of ConDOR S1");
    	//DLKurosh
    	list.get("76561198072087224").addInfo(worldsfirst("Coda Extra Completion"));
    	list.get("76561198072087224").addInfo(youtube("https://www.youtube.com/channel/UCQqf8wGcxNz1NuLSAZQskyg"));
    	//DNH
    	list.get("76561198096014598").addInfo("Also known as: definitely not HIM");
    	//Doopliss
    	list.get("76561197993823027").addInfo(conduitWinner(7));
    	//d_tea
    	list.get("76561198042191965").addInfo(conduitWinner(33));
    	//encryptid
    	list.get("76561198041011456").addInfo("Also known as: Blaire, Maya, ρψ");
    	list.get("76561198041011456").addInfo(worldsfirst("Mary NR Low% Clear","https://www.youtube.com/watch?v=QVgyOGfhBGY"));
    	//EladDifficult
    	list.get("76561197968400814").addInfo(linkText("Hosts CoNDOR", "https://www.twitch.tv/eladdifficult"));
    	//Espeon
    	list.get("76561198853968591").addInfo(conduitWinner(43));
    	//flamehaze
    	list.get("76561198093336562").addInfo(worldsfirst("Tempo Score 30k"));
    	//FocusingFace
    	list.get("76561198236991654").addInfo("Also known as: ShinobiHende");
    	//Frosty Mentos
    	list.get("76561198168248850").addInfo("Also known as: MantasMBL");
    	list.get("76561198168248850").addInfo(conduitWinner(27));
    	//Gekke
    	list.get("76561198048082238").addInfo("Also known as: Sphinx Morio");
    	//GPA
    	list.get("76561199043981220").addInfo("Also known as: Gaming Pro's Adventure");
    	//Grimmy
    	list.get("76561198052453103").addInfo(conduitWinner(16));
    	list.get("76561198052453103").addInfo(linkText("Developer of ChoregraphAI", "https://github.com/Grimy/ChoregraphAI"));
    	list.get("76561198052453103").addInfo(worldsfirst("Aria Rando Low% Clear", "https://www.youtube.com/watch?v=2DB1RW6AvVs"));
    	list.get("76561198052453103").addInfo(worldsfirst("Aria Hard Low% Clear", "https://youtu.be/5WkQI_ut2tY"));
    	//Hokuho
    	list.get("76561198398758840").addInfo(worldsfirst("13char Low% Clear","https://youtu.be/9ZFyF3VS_nc"));
    	list.get("76561198398758840").addInfo(worldsfirst("Dorian 30k","https://www.youtube.com/watch?v=iNE3wN0y0L4"));
    	list.get("76561198398758840").addInfo(worldsfirst("Story 100k"));
    	list.get("76561198398758840").addInfo(worldsfirst("9char 400k","https://youtu.be/_GI63eOPlEM"));
    	list.get("76561198398758840").addInfo(youtube("https://www.youtube.com/channel/UC4C2RyyKRNWmM9nXqWsY3qQ"));
    	//HummingBee
    	list.get("76561198101480527").addInfo("Also known as: ZgH");
    	list.get("76561198101480527").addInfo(conduitWinner(47));
    	list.get("76561198101480527").addInfo(worldsfirst("Coda Rando Clear","https://youtu.be/qBgw6bKzPQE"));
    	//iFood
    	list.get("76561198171820914").addInfo("Also known as: iFood");
    	//incnoce
    	list.get("76561198000263514").addInfo("Winner of CoNDOR S5/S9");
    	//Jack
    	list.get("76561197998362244").addInfo("Winner of CoNDOR S2");
    	list.get("76561197998362244").addInfo(linkText("Developer of TUNE Mod", "https://steamcommunity.com/sharedfiles/filedetails/?id=860039892"));
    	//JPed
    	list.get("76561198091352147").addInfo(conduitWinner(41));
    	//Katheryn Miles
    	list.get("76561198042911025").addInfo("Also known as: Saguara");
    	//KayOh
    	list.get("76561198210364576").addInfo("Also known as: Krex");
    	//King Torture
    	list.get("76561197989223079").addInfo("Also known as: KT");
    	//Kupioala
    	list.get("76561198079454638").addInfo("Also known as: Zarushi");
    	list.get("76561198079454638").addInfo(conduitWinner(49));
    	//levs57
    	list.get("76561198087840095").addInfo("Also known as: AT");
    	list.get("76561198087840095").addInfo(conduitWinner(42));
    	//LVS
    	list.get("76561198082463591").addInfo("Also known as: らびしゅ");
    	//marc
    	list.get("76561198075137353").addInfo("Frequently changes his/her Steam name");
    	list.get("76561198075137353").addInfo(youtube("https://www.youtube.com/channel/UCZty0cjqrVKnBGMnuVk9enQ"));
    	//Marcy
    	list.get("76561198306352835").addInfo(conduitWinner(40));
    	//Marukyu
    	list.get("76561198034177100").addInfo("Winner of CoNDOR S3");
    	list.get("76561198034177100").addInfo(linkText("Developer of Synchrony", "https://necro.marukyu.de/"));
    	//meyes
    	list.get("76561198456260566").addInfo("Also known as: ._.");
    	//Minhs2
    	list.get("76561198040828497").addInfo(conduitWinner(37));
    	//Mizmy
    	list.get("76561198115768228").addInfo(youtube("https://www.youtube.com/channel/UCowvRn1WHf-WE4B9pzYAGBw"));
    	//Monster
    	list.get("76561198317639601").addInfo(linkText("Organizer of WtW2", "https://discord.gg/4PgxpXW"));
    	list.get("76561198317639601").addInfo(conduitWinner(31));
    	list.get("76561198317639601").addInfo(linkText("Low% Records", "https://www.speedrun.com/user/Monsterracer"));
    	list.get("76561198317639601").addInfo(youtube("https://www.youtube.com/channel/UCtW_1PyLrDTJQzJCw_wg6hw"));
    	//Moyuma
    	list.get("76561198195540037").addInfo(linkText("Organizer of WtW1", "https://discord.gg/4PgxpXW"));
    	//mpr
    	list.get("76561198002760663").addInfo("Also known as: cohomerlogist");
    	list.get("76561198002760663").addInfo(conduitWinner(28));
    	//mudjoe
    	list.get("76561197996690770").addInfo("Winner of CoNDOR S4");
    	//Nick
    	list.get("76561198049600266").addInfo(worldsfirst("Aria NR Low% Clear", "https://www.youtube.com/watch?v=-5SXUFxYruY"));
    	//nomkey
    	list.get("76561198045736705").addInfo(worldsfirst("Coda Deathless 10 Wins","https://www.twitch.tv/videos/569516365"));
    	//nvsdy
    	list.get("76561198330876853").addInfo("Also known as: univusday");
    	//Ocre
    	list.get("76561198207378484").addInfo("Also known as: Mewtoes");
    	list.get("76561198207378484").addInfo(conduitWinner(38));
    	list.get("76561198207378484").addInfo(worldsfirst("Bard Score 300k"));
    	list.get("76561198207378484").addInfo(worldsfirst("Diamond Score 40k", "https://www.twitch.tv/videos/740002662"));
    	list.get("76561198207378484").addInfo(worldsfirst("Nocturna Score 40k"));
    	list.get("76561198207378484").addInfo(worldsfirst("Cadence Score 40k", "https://youtu.be/jrrBKN9leOw"));
    	//Oblivion
    	list.get("76561198006220424").addInfo(conduitWinner(4));
    	list.get("76561198006220424").addInfo(linkText("Known for Oblivion Strat", "https://sites.google.com/view/warachiasouko/%E3%83%9B%E3%83%BC%E3%83%A0/necrodancer-english/dead-ringer-strategies#h.p_kjBFD5UewiDQ"));
    	//omnijectivity
    	list.get("76561198293152614").addInfo(conduitWinner(13));
    	//Oracle
    	list.get("76561199018238169").addInfo("Also known as: Dragran, Gleeokenspiel");
    	list.get("76561199018238169").addInfo(conduitWinner(48));
    	//oriane
    	list.get("oriane").addInfo(linkText("oriane's PBs","https://oriane.ink/critique/oeuvre/crypt-of-the-necrodancer"));
    	//Pancelor
    	list.get("76561198034369998").addInfo(linkText("Pancelor's DR Strats Collection", "https://www.youtube.com/playlist?list=PLDeU_mCoStZmaV9e1CYKJrw6DTDxbaUsh"));
    	//ParkerPNG
    	list.get("76561198080860867").addInfo(linkText("ParkerPNG's Pokemon Mystery Dungeon Modpack", "https://steamcommunity.com/sharedfiles/filedetails/?id=2478132725"));
    	//Period Period
    	list.get("76561198108165418").addInfo("Also known as: . .");
    	//Pibonacci
    	list.get("76561198031063446").addInfo(worldsfirst("Diamond Sub4"));
    	//Plasmatize
    	list.get("76561198323795107").addInfo(worldsfirst("Mary Hard Low% Clear","https://youtu.be/6X29Kkhck9Y"));
    	//Plectro
    	list.get("76561198044207658").addInfo(conduitWinner(32));
    	list.get("76561198044207658").addInfo(linkText("Plectro's Tactics Videos", "https://www.youtube.com/playlist?list=PLHBvPtZEl_bkixIflKS3M-w8RXWSPR3es"));
    	//Priw8
    	list.get("76561198846415602").addInfo(conduitWinner(44));
    	//ptar124
    	list.get("76561198253324593").addInfo(conduitWinner(36));
    	//Ptrevor
    	list.get("76561198089956676").addInfo(conduitWinner(22));
    	list.get("76561198089956676").addInfo(worldsfirst("Mary Sub5"));
    	//roncli
    	list.get("76561197996696153").addInfo(conduitWinner(8));
    	//Ranch
    	list.get("76561198453991513").addInfo("Also known as: theb, TheBigRanch, sranch");
    	//RavioLinguini
    	list.get("76561198136201511").addInfo(conduitWinner(18));
    	//RoyalGoof
    	list.get("76561198118733148").addInfo(conduitWinner(12));
    	list.get("76561198118733148").addInfo(worldsfirst("Bard Sub3"));
    	list.get("76561198118733148").addInfo(worldsfirst("Bolt Sub3", "https://youtu.be/wSIIwp_SynU"));
    	//RPGG
    	list.get("76561198247123198").addInfo(conduitWinner(35));
    	//RUNES
    	list.get("76561198128414899").addInfo("Also known as: I wanna power. Therefore, RUNES!");
    	//Sailo
    	list.get("76561198143370429").addInfo(youtube("https://www.youtube.com/channel/UCU7t5UX31nY8CXuXQZFxNmA"));
    	//SailorMint
    	list.get("76561197967734490").addInfo(conduitWinner(29));
    	//Sanga
    	list.get("76561198062929160").addInfo("Also known as: Liquid Nitrogen, 박상아");
    	//sc2
    	list.get("76561198272994316").addInfo("Also known as: scc127");
    	//seanpwolf
    	list.get("76561198052787418").addInfo(conduitWinner(25));
    	//Shinwa
    	list.get("76561198119774420").addInfo("Also known as: しんわ, OTOGI_ZRZR");
    	//Shortcake
    	list.get("76561198087367133").addInfo("Also known as: Shortcake Sweets");
    	//Siegfried
    	list.get("76561198048209119").addInfo("Also known as: ジークフリート");
    	//Sivcria
    	list.get("76561198057683647").addInfo(conduitWinner(39));
    	//Siveure
    	list.get("76561198028008855").addInfo(worldsfirst("Monk Sub6"));
    	list.get("76561198028008855").addInfo(worldsfirst("Story Sub30"));
    	list.get("76561198028008855").addInfo(conduitWinner(20));
    	//Slimo
    	list.get("76561198047144954").addInfo(conduitWinner(34));
    	//Smokepipe
    	list.get("76561198044935308").addInfo("Also known as: The Kataclysmic Kollision Krab, the prince of pickles");
    	//super bae
    	list.get("76561198076831862").addInfo("Also known as: badmetaphors");
    	//Sponska
    	list.get("76561198097522980").addInfo(conduitWinner(17));
    	//Spooty
    	list.get("76561198002854407").addInfo("Also known as: Spootaloo");
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Clear"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Sub5","https://youtu.be/Y1a6ISxi9BI"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Score 10k"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Low% Clear","https://youtu.be/aBOEDwNKCUY"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Low% Sub10","https://youtu.be/FTacfI6ikxM"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Mystery Clear","https://youtu.be/8aQ473WFiRs"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda NR Clear","https://youtu.be/bnigp0V7U-M"));
    	list.get("76561198002854407").addInfo(worldsfirst("Coda Hard Clear","https://youtu.be/R_02QKWL7Vc"));
    	list.get("76561198002854407").addInfo(worldsfirst("9char Sub Hour","https://youtu.be/YmSn4X4iMnk"));
    	list.get("76561198002854407").addInfo(conduitWinner(1));
    	list.get("76561198002854407").addInfo("Winner of CoNDOR S6/S8/X/X2");
    	list.get("76561198002854407").addInfo(youtube("https://www.youtube.com/channel/UCLCqsFZw6ZglWzKjjQA4koA"));
    	list.get("76561198002854407").addInfo(linkText("Hosts CRoW","http://race.condor.live/"));
    	//Squega
    	list.get("76561197987716503").addInfo("Developer of NecroLab");
    	//Supervillain Joe
    	list.get("76561198836504795").addInfo(conduitWinner(26));
    	//Switchaxe
    	list.get("76561198101072470").addInfo(worldsfirst("Eli Sub5"));
    	//Szprycha
    	list.get("76561198259285620").addInfo(conduitWinner(45));
    	//Tama
    	list.get("76561198137933363").addInfo(linkText("Composer of Suizin Remix", "https://steamcommunity.com/sharedfiles/filedetails/?id=2102278534"));
    	//tang
    	list.get("76561198055098680").addInfo("Also known as: Revalize");
    	list.get("76561198055098680").addInfo(conduitWinner(14));
    	//TattarsTheBat
    	list.get("76561198323018845").addInfo("Also known as: Spunky Queer Tatters");
    	//TNF
    	list.get("76561198021587175").addInfo("Also known as: TheNitromeFan");
    	list.get("76561198021587175").addInfo(conduitWinner(46));
    	//t0xicrunner
    	list.get("76561198045337079").addInfo("Also known as: Flashed & Banged");
    	//Uniowen
    	list.get("76561198149556207").addInfo(conduitWinner(24));
    	//Warachia
        list.get("76561198121399825").addInfo("Developer of this site");
        list.get("76561198121399825").addInfo(worldsfirst("Tempo Sub4", "https://youtu.be/pwUUTypRdjM"));
        list.get("76561198121399825").addInfo(worldsfirst("Aria Sub5","https://youtu.be/WcNgUxDgJ_I"));
        list.get("76561198121399825").addInfo(linkText("Warachia's warehouse", "https://sites.google.com/view/warachiasouko/%E3%83%9B%E3%83%BC%E3%83%A0/necrodancer-english"));
        list.get("76561198121399825").addInfo(youtube("https://www.youtube.com/channel/UC0HOUDmhQdFsWZYRQJhqsgQ"));
        //Waski
        list.get("76561198094733262").addInfo(youtube("https://www.youtube.com/channel/UCD8O0AksMFaVNUD4nIihcbw"));
        //3Face
        list.get("76561198056434055").addInfo("Also known as: :3");
    }
    
    public static String conduitWinner(int n){
    	return linkText("Winner of CoNDUIT " + n, "https://warachia2.github.io/NecroRankings/hidden/conduitwinners.html");
    }
        
    public static String worldsfirst(String s){
    	return "World's First " + s;
    }
    
    public static String worldsfirst(String s, String url){
    	return linkText(worldsfirst(s), url);
    }
    
    public static String linkText(String s, String url){
    	return "<a href= \"" + url + "\">" + s + "</a>";
    }
    
    public static String youtube(String url){
    	return linkText("Youtube Channel", url);
    }
    
    ///html makers
    public static void rankid(PrintWriter p, int rank){
        p.println("<td><a class=\"jump\" id=\"r" + rank + "\"></a>" + rank + "</td>");
    }
    
    public static void regularLBsMaker(){
		for(int i=0;i<17;i++){
	        try {
	            FileWriter f = new FileWriter(lbsoutput + curToName(i) + "speedlbs.html", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));

	            htmlStart(p, curToName(i) +  " Speed LBs", "rankings");
	            
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
	            if(i<14){
	            	p.println(headertag(i,-1, "speed"));
	            }
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
						
						if(rank<=150 || !player.name().startsWith("ID")){
							if(Data.isBanned(player.SteamID)){rank++; continue;}
				            p.println("<tr>");
				            rankid(p,rank);
				            if(player.name().startsWith("ID")){
				            	p.println("<td>" + player.name() + "</td>");
				            	System.out.println(curToName(i) + "Speed: " + player.name() + " rank:" + rank);
				            }
				            else{
				            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
				            }
				            p.println("<td>" + Player.csecToString(player.time[num]) + "</td>");
				            p.println("</tr>");	
						}
			            
						rank++;
					}
				}

	            rankingCloser(p);
	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
		
		for(int i=0;i<17;i++){
	        try {
	            FileWriter f = new FileWriter(lbsoutput + curToName(i) + "scorelbs.html", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));
	            
	            htmlStart(p, curToName(i) +  " Score LBs", "rankings");
	            
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
	            if(i<14){
	            	p.println(headertag(i,-1, "score"));
	            }
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
							if(Data.isBanned(player.SteamID)){rank++; continue;}
				            p.println("<tr>");
				            rankid(p,rank);
				            if(player.name().startsWith("ID")){
				            	p.println("<td>" + player.name() + "</td>");
				            	System.out.println(curToName(i) + "Score:" + player.name() + " rank:" + rank);
				            }
				            else{
				            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
				            }
				            p.println("<td>" + player.gold[num] + "</td>");
				            p.println("</tr>");	
						}
			            
						rank++;
					}
				}

	            rankingCloser(p);
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
		
		for(int i=0;i<14;i++){
	        try {
	            FileWriter f = new FileWriter(lbsoutput + curToName(i) + "deathlesslbs.html", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));
	            
	            htmlStart(p, curToName(i) +  " Deathless LBs", "rankings");
	            
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
	            p.println("<table border=\"5\">");
	            p.println("<tr>");
	            p.println("<th class=\"fixed01\">Rank</th>");
	            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
	            p.println("<th class=\"fixed01\">Count</th>");
	            p.println("</tr>");
	            
				int num = i;
				array.sort((a,b) -> (b.clear[num] - a.clear[num]));
				int rank = 1;
				for(Player player:array){
					if(player.clear[num] == 0 || player.isExtra){
						continue;
					}
					else{
						player.deathless[num] = rank;
						
						if(!player.name().startsWith("ID")){
							if(Data.isBanned(player.SteamID)){rank++; continue;}
				            p.println("<tr>");
				            rankid(p,rank);
				            p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
				            p.println("<td>" + player.clearcount(num) + "</td>");
				            p.println("</tr>");	
						}
						else{
							if(rank <=10){
								System.out.println(curToName(i) + " Deathless" + player.name() + " rank:" + rank);
							}
						}
			            
						rank++;
					}
				}

	            rankingCloser(p);
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
    }
    
    public static void extraLBsMaker(){
		for(int h=0;h<5;h++){
			for(int i=0;i<14;i++){
		        try {
		            FileWriter f = new FileWriter(lbsoutput + curToName(i) + ordToCategory(h) + "speedlbs.html", false);
		            PrintWriter p = new PrintWriter(new BufferedWriter(f));
		            
		            htmlStart(p, curToName(i) + " " + ordToCategory(h) + " Speed LBs", "rankings");
		            
	                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
		            p.println(headertag(i, h, "speed"));
		            p.println("<table border=\"5\">");
		            p.println("<tr>");
		            p.println("<th class=\"fixed01\">Rank</th>");
		            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
		            p.println("<th class=\"fixed01\">Time</th>");
		            p.println("</tr>");
		            
		            int ord = h;
					int num = i;
					array.sort((a,b) -> (a.extratime[ord][num] - b.extratime[ord][num]));
					int rank = 1;
					for(Player player:array){
						if(player.extratime[ord][num] == 0 || player.isExtra){
							continue;
						}
						else{
							player.setRank(ord, num, true, rank);
							
							if(!player.name().startsWith("ID")){
								if(Data.isBanned(player.SteamID)){continue;}
					            p.println("<tr>");
					            rankid(p,rank);
					            p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
					            p.println("<td>" + Player.csecToString(player.extratime[ord][num]) + "</td>");
					            p.println("</tr>");	
							}
							else{
								if(rank <=10){
									System.out.println(curToName(i) + " " + ordToCategory(h) + " Speed: " + player.name() + " rank:" + rank);
								}
							}
				            
							rank++;
						}
					}

		            rankingCloser(p);
		 
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
			}
		}
		
		for(int h=0;h<5;h++){
			for(int i=0;i<14;i++){
		        try {
		            FileWriter f = new FileWriter(lbsoutput + curToName(i) + ordToCategory(h) + "scorelbs.html", false);
		            PrintWriter p = new PrintWriter(new BufferedWriter(f));
		            
		            htmlStart(p, curToName(i) + " " + ordToCategory(h) + " Score LBs", "rankings");
		            
	                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
		            p.println(headertag(i, h, "score"));
		            p.println("<table border=\"5\">");
		            p.println("<tr>");
		            p.println("<th class=\"fixed01\">Rank</th>");
		            p.println("<th class=\"fixed01\">" + fdate1 + "</th>");
		            p.println("<th class=\"fixed01\">Score</th>");
		            p.println("</tr>");
		            
		            int ord = h;
					int num = i;
					array.sort((a,b) -> (b.extragold[ord][num] - a.extragold[ord][num]));
					int rank = 1;
					for(Player player:array){
						if(player.extragold[ord][num] == 0 || player.isExtra){
							continue;
						}
						else{
							player.setRank(ord, num, false, rank);
							
							if(!player.name().startsWith("ID")){
								if(Data.isBanned(player.SteamID)){continue;}
					            p.println("<tr>");
					            rankid(p,rank);
					            p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
					            p.println("<td>" + player.extragold[ord][num] + "</td>");
					            p.println("</tr>");	
							}
							else{
								if(rank <=5){
									System.out.println(curToName(i) + " " + ordToCategory(h) + " Score: " + player.name() + " rank:" + rank);
								}
							}
				            
							rank++;
						}
					}

		            rankingCloser(p);
		 
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
			}
		}
    }
    
    public static void sumratioMaker(){
        array.sort((a,b) -> (a.timeSum(13) - b.timeSum(13)));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "13speedsum.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
   
            htmlStart(p, "NecroDancer 13char Speed PB Sum Rankings", "13speedsumstyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 13, "Sum");
            
            int extra = 0;
            
            for(int i=0;i<157;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
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
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
                	if(player.name().startsWith("ID")){
                		System.out.println("13 Speed Sum: " + player.name() + " rank:" + (i+1-extra));
                	}
            	}
            	p.println("<td>" + Player.csecToString(player.timeSum(13)) + "</td>");
            	
            	for(int j=0;j<13;j++){
                	p.println(speedtimetag(player, j));
            	}
            	
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(1000000*(a.averageTimeRatio(13) - b.averageTimeRatio(13))));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "13speedratio.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "NecroDancer 13char Speed PB Ratio to WRs Rankings", "13speedratiostyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 13, "Average");
            
            int extra = 0;
            
            for(int i=0;i<157;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
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
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
                	if(player.name().startsWith("ID")){
                		System.out.println("13 Speed Ratio: " + player.name() + " rank:" + (i+1-extra));
                	}
            	}
            	p.println("<td>" + String.format("%.3f", player.averageTimeRatio(13)) + "</td>");
            	
            	for(int j=0;j<13;j++){
            		p.println(speedratiotag(player, j));
            	}
            	
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        array.sort((a,b) -> (a.timeSum(14) - b.timeSum(14)));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "14speedsum.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart(p, "NecroDancer 14char Speed PB Sum Rankings", "14speedsumstyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 14, "Sum");
            
            int extra = 0;
            
            for(int i=0;i<31;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
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
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
                	if(player.name().startsWith("ID")){
                		System.out.println("14 Speed Sum: " + player.name() + " rank:" + (i+1-extra));
                	}
            	}
            	p.println("<td>" + Player.csecToString(player.timeSum(14)) + "</td>");
            	
            	for(int j=0;j<14;j++){
                	p.println(speedtimetag(player, j));
            	}
            	
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(1000000*(b.averageScoreRatio(14) - a.averageScoreRatio(14))));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "14scoreratio.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart(p, "NecroDancer 14char Score PB Ratio to WRs Rankings", "rankings");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 14, "Average(%)");
            
            int extra = 0;
            
            for(int i=0;i<50;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
            	
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
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
                	if(player.name().startsWith("ID")){
                		System.out.println("14 Score Ratio:" + player.name() + " rank:" + (i+1-extra));
                	}
            	}
            	p.println("<td>" + String.format("%.2f", player.averageScoreRatio(14)) + "</td>");
            	
            	for(int j=0;j<14;j++){
                	p.println(scoreratiotag(player, j));
            	}
            	
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void extraRankingMaker(){
        array.sort((a,b) -> (int)(10000*(b.extraspeed() - a.extraspeed()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extraspeeda.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart_sort(p, "NecroDancer Extra Speed Rankings", "extraastyle","a");
            p.println("<h2 class=\"center\">" + "(By Mode)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/extraspeedb.html\">" + "By Character" + "</a>\r\n" + "</h4>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"60%\">");
            p.println("<thead><tr>");
            p.println("<th class=\"fixed01 rank\">Rank</th>");
            p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01 total\">Total</th>");
            p.println("<th class=\"fixed01 char\">Hard</th>");
            p.println("<th class=\"fixed01 char\">NR</th>");
            p.println("<th class=\"fixed01 char\">Rando</th>");
            p.println("<th class=\"fixed01 char\">Phasing</th>");
            p.println("<th class=\"fixed01 char\">Mystery</th>");
            p.println("</tr></thead><tbody>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("Extra Speed Rankings: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f",player.extraspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.hardspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.randospeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.phasingspeed()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.mysteryspeed()) + "</td>");
                
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extraspeedb.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart_sort(p, "NecroDancer Extra Speed Rankings", "extrabstyle", "b");
            p.println("<h2 class=\"center\">" + "(By Character)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/extraspeeda.html\">" + "By Mode" + "</a>\r\n" + "</h4>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"90%\">");
            p.println("<thead>");
            categoryHeader(p, 14, "Total");
            p.println("</thead><tbody>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extraspeed()) + "</td>");

        		for(int j=0;j<14;j++){
                	p.println("<td>" + String.format("%.2f",player.extraSpeedCharPoints(j)) + "</td>");
        		}
                
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(10000*(b.extrascore() - a.extrascore()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extrascorea.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart_sort(p, "NecroDancer Extra Score Rankings", "extraastyle", "a");
            p.println("<h2 class=\"center\">" + "(By Mode)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/extrascoreb.html\">" + "By Character" + "</a>\r\n" + "</h4>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"60%\">");
            p.println("<thead><tr>");
            p.println("<th class=\"fixed01 rank\">Rank</th>");
            p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01 total\">Total</th>");
            p.println("<th class=\"fixed01 char\">Hard</th>");
            p.println("<th class=\"fixed01 char\">NR</th>");
            p.println("<th class=\"fixed01 char\">Rando</th>");
            p.println("<th class=\"fixed01 char\">Phasing</th>");
            p.println("<th class=\"fixed01 char\">Mystery</th>");
            p.println("</tr></thead><tbody>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("Extra Score Rankings: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f",player.extrascore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.hardscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.nrscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.randoscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.phasingscore()) + "</td>");
            	p.println("<td>" + String.format("%.2f",player.mysteryscore()) + "</td>");
                
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "extrascoreb.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart_sort(p, "NecroDancer Extra Score Rankings", "extrabstyle", "b");
            p.println("<h2 class=\"center\">" + "(By Character)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/extrascorea.html\">" + "By Mode" + "</a>\r\n" + "</h4>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"90%\">");
            p.println("<thead>");
            categoryHeader(p, 14, "Total");
            p.println("</thead><tbody>");
            
            for(int i=0;i<100;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.2f",player.extrascore()) + "</td>");

        		for(int j=0;j<14;j++){
                	p.println("<td>" + String.format("%.2f",player.extraScoreCharPoints(j)) + "</td>");
        		}
                
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void labMaker(){
        array.sort((a,b) -> (int)(10000*(b.speedpoints() - a.speedpoints()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "necrolabspeedimitator.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "NecroLab Speed Rankings Imitator", "labstyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 17, "Points");
            
            for(int i=0;i<300;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("NecroLab Speed: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f",player.speedpoints()) + "</td>");

        		for(int j=0;j<17;j++){
                	p.println(ranktag(player.speed[j], -1, j, "speed", Player.csecToString(player.time[j]) + ", " + String.format("%.2f",Player.points(player.speed[j])) + "pt"));
        		}
                
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        array.sort((a,b) -> (int)(10000*(b.scorepoints() - a.scorepoints()))); 
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "necrolabscoreimitator.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "NecroLab Score Rankings Imitator", "labstyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            categoryHeader(p, 17, "Points");
            
            for(int i=0;i<200;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("NecroLab Score: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f",player.scorepoints()) + "</td>");

        		for(int j=0;j<17;j++){
                	p.println(ranktag(player.score[j], -1, j, "score", zeroout(player.gold[j]) + ", " + String.format("%.2f",Player.points(player.score[j])) + "pt"));
        		}
                
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void influenceMaker(){
        array.sort((a,b) -> (int)(100000*(b.contribution() - a.contribution())));
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "influence.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart_sort(p, "NecroDancer LBs Influence Rankings", "influencestyle", "i");
            p.println("<h2 class=\"center\">" + "(By Category)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/influencechar.html\">" + "By Character" + "</a>\r\n" + "</h4>");
            
            p.println("<details class=\"center\">");
            p.println("<summary>Details</summary>");
            p.println("<p>Points are based on old necrolab formula: 1.7 / (log($rank / 100 + 1.03) / log(10))</p>");
            p.println("<p>ex. You gain 99.8 points from 1st place, 80.2 points from 2nd place, 67.2 points from 3rd place...</p>");
            p.println("<h3>[Weights]</h3>");
            p.println("<p>Speed: Cadence x2, Other x1</p>");
            p.println("<p>Score: Cadence x1, 9/13char x0.2, Other x0.5</p>");
            p.println("<p>DLess: Coda x0.5, Aria/Monk/Mary x0.2, Other x0.1</p>");
            p.println("<p>Extra: Coda NR/Rando/Mystery/Hard Speed x0.5, Other Extra Speed x0.06, Extra Score x0.02</p>");
            p.println("</details><p></p>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"50%\">");
            p.println("<thead><tr>");
            p.println("<th class=\"fixed01 rank\">Rank</th>");
            p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01 total\">Total</th>");
            p.println("<th class=\"fixed01 char\">Speed</th>");
            p.println("<th class=\"fixed01 char\">Score</th>");
            p.println("<th class=\"fixed01 char\">DLess</th>");
            p.println("<th class=\"fixed01 char\">Extra</th>");
            p.println("</tr></thead><tbody>");

            for(int i=0;i<400;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("LBs Influence: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f", player.contribution()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_speed()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_score()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_deathless()) + "</td>");
            	p.println("<td>" + String.format("%.2f", player.contribution_extra()) + "</td>");
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(rankingsoutput + "influencechar.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart_sort(p, "NecroDancer LBs Influence Rankings", "extrabstyle", "lbc");
            p.println("<h2 class=\"center\">" + "(By Character)" +"</h2>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<h4>" + "<a class=\"by\" href=\"https://warachia2.github.io/NecroRankings/rankings/influence.html\">" + "By Category" + "</a>\r\n" + "</h4>");
            
            p.println("<details class=\"center\">");
            p.println("<summary>Details</summary>");
            p.println("<p>Points are based on old necrolab formula: 1.7 / (log($rank / 100 + 1.03) / log(10))</p>");
            p.println("<p>ex. You gain 99.8 points from 1st place, 80.2 points from 2nd place, 67.2 points from 3rd place...</p>");
            p.println("<h3>[Weights]</h3>");
            p.println("<p>Speed: Cadence x2, Other x1</p>");
            p.println("<p>Score: Cadence x1, 9/13char x0.2, Other x0.5</p>");
            p.println("<p>DLess: Coda x0.5, Aria/Monk/Mary x0.2, Other x0.1</p>");
            p.println("<p>Extra: Coda NR/Rando/Mystery/Hard Speed x0.5, Other Extra Speed x0.06, Extra Score x0.02</p>");
            p.println("</details><p></p>");
            
            p.println("<table id=\"sort\" class=\"display\" border=\"5\" width=\"50%\">");
            p.println("<thead><tr>");
            p.println("<th class=\"fixed01 rank\">Rank</th>");
            p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01 total\">Total</th>");
            for(int i=0;i<14;i++){
                p.println("<th class=\"fixed01 char\">" + curToShortName(i) + "</th>");
            }
            p.println("<th class=\"fixed01 char\">Multi</th>");
            p.println("</tr></thead><tbody>");

            for(int i=0;i<400;i++){
            	Player player = array.get(i);
				if(Data.isBanned(player.SteamID)){continue;}
            	
                p.println("<tr>");
            	p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	if(player.name().startsWith("ID")){
            		System.out.println("LBs Influence: " + player.name() + " rank:" + (i+1));
            	}
            	p.println("<td>" + String.format("%.2f", player.contribution()) + "</td>");
            	double[] c = player.contribution_char();
            	for(int j=0; j<15;j++){
                	p.println("<td>" + String.format("%.2f", c[j]/50) + "</td>");
            	}
                p.println("</tr>");
            }
            
            p.println("</tbody>");
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void rankingCloser(PrintWriter p){
        p.println("</table>");
        p.println("</body>");
        p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
        p.println("</html>");
        
        p.close();
    }
    
    public static void categoryHeader(PrintWriter p, int max, String representative){
        p.println("<tr>");
        p.println("<th class=\"fixed01 rank\">Rank</th>");
        p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
        p.println("<th class=\"fixed01 total\">" + representative + "</th>");
        
        for(int i=0;i<max;i++){
            p.println("<th class=\"fixed01 char\">" + curToShortName(i) + "</th>");
        }
        
        p.println("</tr>");
    }
    
    public static void pblistMaker_old(){
        for(Player player: array){
        	if(player.name().startsWith("ID") || player.isExtra){
        		continue;
        	}
            try {
                FileWriter f = new FileWriter(pbsoutput + player.name_url() + ".html", false);
                PrintWriter p = new PrintWriter(new BufferedWriter(f));
                
                htmlStart(p, player.name(), "pbstyle");

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
                	//p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "speedlbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                    p.println("<td class=\"frame\"><img src=\"icons/" + i + ".jpg\">" + "</td>");
                    p.println("<td>" + curToName(i) + "</td>");
                	p.println(speedpbtag(player, i));
                	p.println(ranktag(player.speed[i], i, "speed"));
                	//p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "scorelbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                    p.println("<td class=\"frame\"><img src=\"icons/" + i + ".jpg\">" + "</td>");
                	p.println(scorepbtag(player, i, scorethreshold(i)));
                	p.println(scoreranktag(player, i, scorethreshold(i)));
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
                	p.println("<td class=\"frame\">" + "<img src=\"icons/" + i + ".jpg\">" + "</td>");
                	p.println("<td>" + curToName(i) + "</td>");
                	p.println(ranktag(player.hardspeed[i], 0, i, "speed", Player.csecToString(player.extratime[0][i])));
                	p.println(ranktag(player.nrspeed[i], 1, i, "speed", Player.csecToString(player.extratime[1][i])));
                	p.println(ranktag(player.randospeed[i], 2, i, "speed", Player.csecToString(player.extratime[2][i])));
                	p.println(ranktag(player.phasingspeed[i], 3, i, "speed", Player.csecToString(player.extratime[3][i])));
                	p.println(ranktag(player.mysteryspeed[i], 4, i, "speed", Player.csecToString(player.extratime[4][i])));
                	p.println("<td class=\"frame\">" + "<img src=\"icons/" + i + ".jpg\">" + "</td>");
                	p.println(exscoreranktag(player, 0, i, scorethreshold(i)));
                	p.println(exscoreranktag(player, 1, i, (int) (scorethreshold(i)*0.8)));
                	p.println(exscoreranktag(player, 2, i, scorethreshold(i)));
                	p.println(exscoreranktag(player, 3, i, (int) (scorethreshold(i)*0.8)));
                	p.println(exscoreranktag(player, 4, i, (int) (scorethreshold(i)*0.8)));
                	p.println(ranktag(player, -1, i, "deathless", player.clearcount(i)));
                    p.println("</tr>");
                }
                
                p.println("</table>");
                
                if(!player.moreinfo.isEmpty()){
                    p.println("<p></p>");
                    p.println("<details class=\"center\">");
                    p.println("<summary>More Info</summary>");
                    for(int i=0;i<player.moreinfo.size();i++){
                    	p.print(player.moreinfo.get(i));
                    	if(i+1 != player.moreinfo.size() && !player.moreinfo.get(i).startsWith("<a")){
                    		p.println("<br>");
                    	}
                    	else{
                    		p.println();
                    	}
                    }
                    p.println("</details>");
                }
                
                p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
                
                p.println("</body>");
                p.println("</html>");
                
                p.close();
     
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void pblistMaker(){
        for(Player player: array){
        	if(player.name().startsWith("ID") || player.isExtra){
        		continue;
        	}
			if(Data.isBanned(player.SteamID)){continue;}
            try {
                FileWriter f = new FileWriter(pbsoutput + player.name_url() + ".html", false);
                PrintWriter p = new PrintWriter(new BufferedWriter(f));
                
                htmlStart(p, player.name(), "pbstyle");

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
                	//p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "speedlbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                    p.println("<td class=\"frame\"><img src=\"ticons/" + i + "_transparent.png\">" + "</td>");
                    p.println("<td>" + curToName(i) + "</td>");
                	p.println(speedpbtag(player, i));
                	p.println(ranktag(player.speed[i], i, "speed"));
                	//p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(i) + "scorelbs.html\"><img src=\"icons/" + i + ".jpg\">" + "</a></td>");
                    p.println("<td class=\"frame\"><img src=\"ticons/" + i + "_transparent.png\">" + "</td>");
                	p.println(scorepbtag(player, i, scorethreshold(i)));
                	p.println(scoreranktag(player, i, scorethreshold(i)));
                    p.println("</tr>");
                }

                p.println("</table>");

                p.println("<p></p>");
                
                p.println("<table border=\"5\">");
                p.println("<tr>");
                p.println("<th class=\"header\">Speed</th>");
                for(int i=0;i<14;i++){
                	p.println("<th class=\"header\">" + curToShortName(i) + "</th>");
                }
                p.println("</tr>");
                
                for(int h=0;h<5;h++){
                    p.println("<tr>");
                    p.println("<td class=\"catframe\">" + ordToCategory(h) + "</td>");
                    for(int i=0;i<14;i++){
                    	p.println(ranktag(player.getRank(h, i, "speed"), h, i, "speed", Player.csecToString(player.extratime[h][i])));
                    }
                    p.println("</tr>");
                }
                
                p.println("<tr>");
                p.println("<td class=\"catframe\">Score</td>");
                for(int i=0;i<14;i++){
                	p.println("<td class=\"charheader\">" + "<img src=\"ticons/" + i + "_transparent.png\">" + "</td>");
                }
                p.println("</tr>");
                
                for(int h=0;h<5;h++){
                    p.println("<tr>");
                    p.println("<td class=\"catframe\">" + ordToCategory(h) + "</td>");
                    for(int i=0;i<14;i++){
                    	p.println(exscoreranktag(player, h, i, scorethreshold(i,h)));
                    }
                    p.println("</tr>");
                }
                
                p.println("<tr>");
                p.println("<td class=\"catframe\">" + "Deathless" + "</td>");
                for(int i=0;i<14;i++){
                	p.println(ranktag(player, -1, i, "deathless", player.clearcount(i)));
                }
                p.println("</tr>");
                
                p.println("</table>");
                
                if(!player.moreinfo.isEmpty()){
                    p.println("<p></p>");
                    p.println("<details class=\"center\">");
                    p.println("<summary>More Info</summary>");
                    for(int i=0;i<player.moreinfo.size();i++){
                    	p.print(player.moreinfo.get(i));
                    	if(i+1 != player.moreinfo.size() && !player.moreinfo.get(i).startsWith("<a")){
                    		p.println("<br>");
                    	}
                    	else{
                    		p.println();
                    	}
                    }
                    p.println("</details>");
                }
                
                p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
                p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
                
                p.println("</body>");
                p.println("</html>");
                
                p.close();
     
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
      
    public static int scorethreshold(int cur){
    	switch(cur){
    	case 0: return 10000;	//Aria
    	case 1: return 10000; //Bard
    	case 2: return 7500; //Bolt
    	case 3: return 10000; //Cadence
    	case 4: return 10000; //Diamond
    	case 5: return 7500; //Dorian
    	case 6: return 1000; //Dove
    	case 7: return 7500; //Eli
    	case 8: return 7500; //Mary
    	case 9: return 10000; //Melody
    	case 10: return 7500; //Monk
    	case 11: return 10000; //Nocturna
    	case 12: return 7500; //Tempo
    	case 13: return 1; //Coda
    	case 14: return 50000; //Story
    	case 15: return 50000; //9char
    	default: return 50000; //13char
    	}
    }
    
    public static int scorethreshold(int cur, int ord){
    	switch(ord){
    	case 1:
    	case 3:
    	case 4:
    		return (int) (scorethreshold(cur)*0.8);
    	default: return scorethreshold(cur);
    	}
    }

    public static void densityMaker(){
        try {
            FileWriter f = new FileWriter(chartsoutput + "density.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            densityStart(p);

            for(int i=0;i<13;i++){
				int num = i;
				array.sort((a,b) -> (a.speed[num] - b.speed[num]));
				p.println("{type:\"line\", axisYType: \"secondary\", name: \""+ curToName(i) + "\", showInLegend: true, markerSize: 0, dataPoints: [");
				
				for(Player player:array){
					if(player.speed[i] == 0){
						continue;
					}
					else if(player.speed[i] > 100){
						break;
					}
					
					p.print("{x: " + player.speed[i] + ", y: " + String.format("%.3f",player.timeRatio_nobound(i)) + "}");

					if(player.speed[i] != 100){
						p.println(",");
					}
					else{
						p.println("");
					}
				}
				if(i!=12){
					p.println("]},");
				}
				else{
					p.println("]}");
				}
            }

            densityEnd(p);
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void densityStart(PrintWriter p){
    	htmlStart(p, "Top100 Speed Density", "recordchart");
    	
    	p.println("<script>");
    	p.println("window.onload = function(){");
    	p.println("var chart = new CanvasJS.Chart(\"chartContainer\", {");
    	p.println("title: {},");
    	p.println("axisX: {title: \"Rank\"},");
    	p.println("axisY2: {title: \"Ratio to WR\", minimum: 1.0},");
    	p.println("toolTip: {shared: false,content: \"{name} {x}: {y}\"},");
    	p.println("legend: {cursor: \"pointer\", verticalAlign: \"top\", horizontalAlign: \"center\", dockInsidePlotArea: true, itemclick: toogleDataSeries},");
    	p.println("data: [");
    }
    
    public static void densityEnd(PrintWriter p){
    	p.println("]});");
    	p.println("chart.render();");
    	p.println("function toogleDataSeries(e){");
    	p.println("if (typeof(e.dataSeries.visible) === \"undefined\" || e.dataSeries.visible) {");
    	p.println("e.dataSeries.visible = false;");
    	p.println("} else{");
    	p.println("e.dataSeries.visible = true;");
    	p.println("}");
    	p.println("chart.render();");
    	p.println("}}");
    	p.println("</script>");
    	p.println("<div id=\"chartContainer\" style=\"height: 800px; max-width: 1200px; margin: 0px auto;\"></div>");
    	p.println("<script src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"></script>");
        p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
        p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
    	p.println("</body></html>");
    }
    
    public static void top10ChartMaker(String Category){
    	try {
            FileWriter f = new FileWriter(chartsoutput + Category + "top10s.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, Category + " Top10s", "recordchart");
            
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">"+ Category +"</th>");
            for(int i=0;i<17;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");

            for(int r=1;r<11;r++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + rankStr(r) + "</th>");
            	for(int i=0;i<17;i++){
            		for(Player player: array){
            			if(player.getRank(-1 , i, Category) == r){
            				if(Category == "Speed"){
                				printPlayerLinkedIcon(p, player, player.name() + ", " + Player.csecToString(player.time[i]));
            				}
            				else{
                				printPlayerLinkedIcon(p, player, player.name() + ", " + String.valueOf(player.gold[i]));
            				}
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            
            p.println("</table>");
            
            //Page 2
            if(Category == "Speed"){
                p.println("<h1 class=\"center\">" + "Page 2" +"</h1>");
                p.println("<table border=\"5\">");
                p.println("<tr>");
                p.println("<th class=\"frame\">"+ Category +"</th>");
                for(int i=0;i<17;i++){
                	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
                }
                p.println("</tr>");

                for(int r=11;r<21;r++){
                    p.println("<tr>");
                    p.println("<th class=\"frame\">" + rankStr(r) + "</th>");
                	for(int i=0;i<17;i++){
                		for(Player player: array){
                			if(player.getRank(-1 , i, Category) == r){
                				if(Category == "Speed"){
                    				printPlayerLinkedIcon(p, player, player.name() + ", " + Player.csecToString(player.time[i]));
                				}
                				else{
                    				printPlayerLinkedIcon(p, player, player.name() + ", " + String.valueOf(player.gold[i]));
                				}
                    			break;	
                			}
                		}
                	}
                	p.println("</tr>");
                }
                
                p.println("</table>");
            }
            
            p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>"); 
            p.println("</body></html>");
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void extraChartMaker_old(){
        try {
            FileWriter f = new FileWriter(chartsoutput + "extrawrs.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "Extra World Records", "recordchart");
            
            ///Extra Speed
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">WRs</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Speed" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.hasWR(h, i, "speed")){
            				printPlayerLinkedIcon(p, player, player.name() + ", " + Player.csecToString(player.extratime[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("</table>");
            p.println("<p></p>");
            
            ///Extra Score & Deathless
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">WRs</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Score" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.hasWR(h, i, "score")){
            				printPlayerLinkedIcon(p, player, player.name() + ", " + String.valueOf(player.extragold[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("<tr>");
            p.println("<th class=\"frame\">" + "Deathless" + "</th>");
            for(int i=0;i<14;i++){
        		for(Player player: array){
        			if(player.hasWR(-1, i, "deathless")){
        				printPlayerLinkedIcon(p, player, player.name() + ", " + player.clearcount(i));
            			break;	
        			}
        		}
            }
            p.println("</tr>");
            p.println("</table>");
            
            //2nd
            
            p.println("<h1 class=\"center\">" + "Extra 2nd Places" +"</h1>");
            
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">2nd Places</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Speed" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.getRank(h, i, "speed")==2){
            				printPlayerLinkedIcon(p, player, player.name() + ", " + Player.csecToString(player.extratime[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("</table>");
            p.println("<p></p>");
            
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">2nd Places</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Score" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.getRank(h, i, "score")==2){
            				printPlayerLinkedIcon(p, player, player.name() + ", " + String.valueOf(player.extragold[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("<tr>");
            p.println("<th class=\"frame\">" + "Deathless" + "</th>");
            for(int i=0;i<14;i++){
        		for(Player player: array){
        			if(player.getRank(-1, i, "deathless")==2){
        				printPlayerLinkedIcon(p, player, player.name() + ", " + player.clearcount(i));
            			break;	
        			}
        		}
            }
            p.println("</tr>");
            p.println("</table>");
            
            p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>"); 
            p.println("</body></html>");
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void extraChartMaker(){
        try {
            FileWriter f = new FileWriter(chartsoutput + "extrawrs.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "Extra World Records", "recordchart");
            
            ///Extra Speed
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">WRs</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Speed" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.hasWR(h, i, "speed")){
            				printLBsLinkedIcon(p, player, "speed", i, h, player.name() + ", " + Player.csecToString(player.extratime[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("</table>");
            p.println("<p></p>");
            
            ///Extra Score & Deathless
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">WRs</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Score" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.hasWR(h, i, "score")){
            				printLBsLinkedIcon(p, player, "score", i, h, player.name() + ", " + String.valueOf(player.extragold[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("<tr>");
            p.println("<th class=\"frame\">" + "Deathless" + "</th>");
            for(int i=0;i<14;i++){
        		for(Player player: array){
        			if(player.hasWR(-1, i, "deathless")){
        				printLBsLinkedIcon(p, player, "deathless", i, -1, player.name() + ", " + player.clearcount(i));
            			break;	
        			}
        		}
            }
            p.println("</tr>");
            p.println("</table>");
            
            //2nd
            
            p.println("<h1 class=\"center\">" + "Extra 2nd Places" +"</h1>");
            
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">2nd Places</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Speed" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.getRank(h, i, "speed")==2){
            				printLBsLinkedIcon(p, player, "speed", i, h, player.name() + ", " + Player.csecToString(player.extratime[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("</table>");
            p.println("<p></p>");
            
            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"frame\">2nd Places</th>");
            for(int i=0;i<14;i++){
            	p.println("<th class=\"frame\"><img src=\"icons/" + i + ".jpg\"></th>");
            }
            p.println("</tr>");
            
            for(int h=0;h<5;h++){
                p.println("<tr>");
                p.println("<th class=\"frame\">" + ordToCategory(h) + " Score" + "</th>");
            	for(int i=0;i<14;i++){
            		for(Player player: array){
            			if(player.getRank(h, i, "score")==2){
            				printLBsLinkedIcon(p, player, "score", i, h, player.name() + ", " + String.valueOf(player.extragold[h][i]));
                			break;	
            			}
            		}
            	}
            	p.println("</tr>");
            }
            p.println("<tr>");
            p.println("<th class=\"frame\">" + "Deathless" + "</th>");
            for(int i=0;i<14;i++){
        		for(Player player: array){
        			if(player.getRank(-1, i, "deathless")==2){
        				printLBsLinkedIcon(p, player, "deathless", i, -1, player.name() + ", " + player.clearcount(i));
            			break;	
        			}
        		}
            }
            p.println("</tr>");
            p.println("</table>");
            
            p.println("<p>" + "Last Updated:" + fdate1 +"</p>");
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>"); 
            p.println("</body></html>");
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void printPlayerLinkedIcon(PrintWriter p, Player player){
    	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/"+ player.name_url() + ".html\"><img src=\"players/" + player.name() + ".jpg\"></a></td>");
    }
    
    public static void printPlayerLinkedIcon(PrintWriter p, Player player, String tooltip){
    	p.println("<td class=\"tooltip\"><a href=\"https://warachia2.github.io/NecroRankings/pbs/"+ player.name_url() + ".html\"><span class=\"tooltip-text\">" + tooltip + "</span><img src=\"players/" + player.name() + ".jpg\"></a></td>");
    }
    
    public static void printLBsLinkedIcon(PrintWriter p, Player player, String category, int cur, int ord, String tooltip){
    	String lbsname = "";
    	if(category == "speed"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "speedlbs";
    	}
    	else if(category == "score"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "scorelbs";
    	}
    	else{
    		lbsname = curToName(cur) + "deathlesslbs";
    	}
    	p.println("<td class=\"tooltip\"><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html\"><span class=\"tooltip-text\">" + tooltip + "</span><img src=\"players/" + player.name() + ".jpg\"></a></td>");
    }
        
    public static void playerListMaker(){
		array.sort((a,b) -> a.name().compareTo(b.name()));
    	
    	try {
            FileWriter f = new FileWriter(hiddenoutput + "playerlist.html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));

            htmlStart(p, "List of Registered Players", "playerliststyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");

            p.println("<table border=\"5\">");
            p.println("<tr>");
            p.println("<th class=\"fixed01 id\">Steam ID</th>");
            p.println("<th class=\"fixed01 name\">Name</th>");
            p.println("<th class=\"fixed01 remark\">Also known as:</th>");
            p.println("</tr>");
            
            for(Player player:array){
            	if(!player.name().startsWith("ID") && !player.isExtra){
                    p.println("<tr>");
                    p.println("<td>" + player.SteamID + "</td>");
                	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
                    
                    boolean hasAnother = false;
                    for(String s:player.moreinfo){
                    	if(s.startsWith("Also known")){
                    		p.println("<td>" + s.substring(15) + "</td>");
                    		hasAnother = true;
                    	}
                    }
                    
                    if(!hasAnother){
                        p.println("<td></td>");
                    }
                    
                    p.println("</tr>");
            	}
            }

            rankingCloser(p);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     
    public static void dataMaker(int playernum, double upperbound){
    	array.sort((a,b) -> (int)(100000*(b.contribution() - a.contribution())));
        
        try {
            FileWriter f = new FileWriter(dataoutput + "data" + playernum + ".html", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            htmlStart(p, "Data", "labstyle");
            
            p.println("<p><a href=\"https://warachia2.github.io/NecroRankings/\">" + "Top" + "</a></p>");
            p.println("<table border=\"5\">");
            
            //header
            p.println("<tr>");
            //p.println("<th class=\"fixed01 rank\">Rank</th>");
            p.println("<th class=\"fixed01 name\">" + fdate1 + "</th>");
            p.println("<th class=\"fixed01 total\">" + "infl" + "</th>");
            
            
            //speed
            for(int i=0;i<17;i++){
                p.println("<th class=\"fixed01 char\">" + ordToCategory(-1) + curToShortName(i) + " Speed</th>");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.println("<th class=\"fixed01 char\">" + ordToCategory(h) + curToShortName(i) + " Speed</th>");
                }
            }
            
            //score
            for(int i=0;i<17;i++){
                p.println("<th class=\"fixed01 char\">" + ordToCategory(-1) + curToShortName(i) + " Score</th>");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.println("<th class=\"fixed01 char\">" + ordToCategory(h) + curToShortName(i) + " Score</th>");
                }
            }
            
            
            //deathless
            for(int i=0;i<14;i++){
                p.println("<th class=\"fixed01 char\">" + curToShortName(i) + " DL</th>");
            }
            
            p.println("</tr>");
            
            for(int i=0;i<playernum;i++){
            	Player player = array.get(i);
            	
                p.println("<tr>");
            	
            	//p.println("<td>" + (i+1) + "</td>");
            	p.println("<td><a href=\"https://warachia2.github.io/NecroRankings/pbs/" + player.name_url() + ".html\">" + player.name() + "</a></td>");
            	p.println("<td>" + String.format("%.3f",player.contribution()) + "</td>");

        		for(int j=0;j<17;j++){
        			p.println("<td>" + String.format("%.3f", player.timeRatio_general(-1,j,upperbound)) +"</td>");
        		}
            	for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.println("<td>" + String.format("%.3f", player.timeRatio_general(h,j,upperbound)) +"</td>");
            		}
            	}

        		for(int j=0;j<17;j++){
        			p.println("<td>" + player.gold[j] +"</td>");
        		}
        		for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.println("<td>" + player.extragold[h][j] +"</td>");
            		}
        		}
        		
        		for(int j=0;j<14;j++){
        			p.println("<td>" + String.format("%.2f",Player.points(player.deathless[j])) +"</td>");
        		}
                
                p.println("</tr>");
            }
            
            rankingCloser(p);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void allcsvMaker(int playernum, double upperbound){
    	array.sort((a,b) -> (int)(100000*(b.contribution() - a.contribution())));
        
        try {
            FileWriter f = new FileWriter(dataoutput + "all" + playernum + ".csv", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));


            p.print("Name,");
            
            //speed
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Speed,");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.print(curToShortName(i) + " " + ordToCategory(h) + " Speed,");
                }
            }
            
            //score
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Score,");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.print(curToShortName(i) + " " + ordToCategory(h) + " Score,");
                }
            }
            
            
            //deathless
            for(int i=0;i<14;i++){
                p.print(curToShortName(i) + " DL,");
            }
            
            p.println("Influence");
            
            for(int i=0;i<playernum;i++){
            	Player player = array.get(i);

            	p.print(player.name() + ",");

        		for(int j=0;j<17;j++){
        			p.print(String.format("%.5f", player.timeRatio_general(-1,j,upperbound)) + ",");
        		}
            	for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.print(String.format("%.5f", player.timeRatio_general(h,j,upperbound)) + ",");
            		}
            	}

        		for(int j=0;j<17;j++){
        			p.print(player.gold[j] + ",");
        		}
        		for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.print(player.extragold[h][j] + ",");
            		}
        		}
        		
        		for(int j=0;j<14;j++){
        			p.print(player.clear[j] + ",");
        		}
                
            	p.println(String.format("%.5f",player.contribution()));
            }
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            FileWriter f = new FileWriter(dataoutput + "all" + playernum + "place.csv", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));


            p.print("Name,");
            
            //speed
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Speed,");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.print(curToShortName(i) + " " + ordToCategory(h) + " Speed,");
                }
            }
            
            //score
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Score,");
            }
            for(int h=0;h<5;h++){
                for(int i=0;i<14;i++){
                    p.print(curToShortName(i) + " " + ordToCategory(h) + " Score,");
                }
            }
            
            
            //deathless
            for(int i=0;i<13;i++){
                p.print(curToShortName(i) + " DL" + ",");
            }
            p.println(curToShortName(13) + " DL");

            for(int i=0;i<playernum;i++){
            	Player player = array.get(i);

            	p.print(player.name() + ",");

        		for(int j=0;j<17;j++){
        			p.print(player.getRank(-1,j,"speed") + ",");
        		}
            	for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.print(player.getRank(h,j,"speed") + ",");
            		}
            	}

        		for(int j=0;j<17;j++){
        			p.print(player.getRank(-1,j,"score") + ",");
        		}
        		for(int h=0;h<5;h++){
            		for(int j=0;j<14;j++){
            			p.print(player.getRank(h,j,"score") + ",");
            		}
        		}
        		
        		for(int j=0;j<13;j++){
        			p.print(player.getRank(-1,j,"deathless") + ",");
        		}
        		p.println(player.getRank(-1,13,"deathless"));
            }
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void maincsvMaker(int playernum, double upperbound){
    	array.sort((a,b) -> (int)(100000*(b.contribution() - a.contribution())));
        
        try {
            FileWriter f = new FileWriter(dataoutput + "main" + playernum + ".csv", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));


            p.print("Name,");
            
            //speed
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Speed,");
            }
            
            //score
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Score,");
            }

            p.println("Influence");
            
            for(int i=0;i<playernum;i++){
            	Player player = array.get(i);

            	p.print(player.name() + ",");

        		for(int j=0;j<17;j++){
        			p.print(String.format("%.5f", player.timeRatio_general(-1,j,upperbound)) + ",");
        		}

        		for(int j=0;j<17;j++){
        			p.print(player.gold[j] + ",");
        		}
                
            	p.println(String.format("%.5f",player.contribution()));
            }
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void wrscsvMaker(){
        try {
            FileWriter f = new FileWriter(dataoutput + "mainwrs.csv", false);
            PrintWriter p = new PrintWriter(new BufferedWriter(f));
            
            //speed
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Speed,");
                p.println(Player.speedWR[i]);
            }
            
            //score
            for(int i=0;i<17;i++){
                p.print(ordToCategory(-1) + curToShortName(i) + " Score,");
                p.println(Player.scoreWR[i]);
            }
            
            p.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void htmlStart(PrintWriter p, String title, String css){
    	p.println("<!DOCTYPE html>");
        p.println("<html lang=\"en\">");
        p.println("<head>");
        
        //analytics
        p.println("<script async src=\"https://www.googletagmanager.com/gtag/js?id=G-9G9DGMLX02\"></script>");
        p.println("<script>");
        p.println("window.dataLayer = window.dataLayer || [];");
        p.println("function gtag(){dataLayer.push(arguments);}");
        p.println("gtag('js', new Date());");
        p.println("gtag('config', 'G-9G9DGMLX02')");
        p.println("</script>");
        
        p.println("<meta charset=\"UTF-8\">");
        p.println("<link rel=\"stylesheet\" href=\"" + css + ".css\">");
        p.println("<script>console.log(\"\");</script>"); //for earlier css reading
        p.println("<title>" + title + "</title>");
        p.println("</head>");
        p.println("<body>");
        p.println("<h1 class=\"center\">" + title +"</h1>");
    }
    
    public static void htmlStart_sort(PrintWriter p, String title, String css, String type){
    	p.println("<!DOCTYPE html>");
        p.println("<html lang=\"en\">");
        p.println("<head>");
        
        //analytics
        p.println("<script async src=\"https://www.googletagmanager.com/gtag/js?id=G-9G9DGMLX02\"></script>");
        p.println("<script>");
        p.println("window.dataLayer = window.dataLayer || [];");
        p.println("function gtag(){dataLayer.push(arguments);}");
        p.println("gtag('js', new Date());");
        p.println("gtag('config', 'G-9G9DGMLX02')");
        p.println("</script>");
        
        p.println("<meta charset=\"UTF-8\">");
        p.println("<link rel=\"stylesheet\" href=\"" + css + ".css\">");
        p.println("<script>console.log(\"\");</script>"); //for earlier css reading
        p.println("<title>" + title + "</title>");
        
        //datatable
        p.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/dt/dt-1.10.24/datatables.min.css\"/>");
        p.println("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>");
        p.println("<script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/dt/dt-1.10.24/datatables.min.js\"></script>");
        
        p.println("<script type=\"text/javascript\" charset=\"utf-8\">");
        p.println("$(document).ready(function() {");
        p.println("var t =  $('#sort').DataTable({");
        p.println("\"paging\":   false,");
        p.println("\"info\":   false,");
        p.println("\"searching\":     false,");
        p.println("\"columnDefs\": [ {\"searchable\": false,\"orderable\": false,\"targets\": 0} ],");
        p.println("\"order\": [[ 2, 'desc' ]],");
        if(type == "a"){
            p.println("\"columnDefs\": [{ \"orderSequence\": [ \"desc\" ], \"targets\": [ 2,3,4,5,6,7]}]});");
        }
        else if(type == "i"){
        	p.println("\"columnDefs\": [{ \"orderSequence\": [ \"desc\" ], \"targets\": [ 2,3,4,5,6]}]});");
        }
        else if(type == "lbc"){
            p.println("\"columnDefs\": [{ \"orderSequence\": [ \"desc\" ], \"targets\": [ 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]}]});");	
        }
        else{
            p.println("\"columnDefs\": [{ \"orderSequence\": [ \"desc\" ], \"targets\": [ 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]}]});");	
        }
        
        p.println("t.on( 'order.dt search.dt', function () {");
        p.println("t.column(0, {search:'applied', order:'applied'}).nodes().each( function (cell, i) {");
        p.println("cell.innerHTML = i+1;");
        p.println("});");
        p.println("} ).draw();});");
        
        p.println("</script>");
        
        p.println("</head>");
        p.println("<body>");
        p.println("<h1 class=\"center\">" + title +"</h1>");
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
    
    public static String curToShortName(int cur){
    	switch(cur){
    	case 0: return "Aria";
    	case 1: return "Bard";
    	case 2: return "Bolt";
    	case 3: return "Cad";
    	case 4: return "Dia";
    	case 5: return "Dor";
    	case 6: return "Dove";
    	case 7: return "Eli";
    	case 8: return "Mary";
    	case 9: return "Mel";
    	case 10: return "Monk";
    	case 11: return "Noc";
    	case 12: return "Tempo";
    	case 13: return "Coda";
    	case 14: return "Story";
    	case 15: return "9char";
    	default: return "13char";
    	}
    }
    
    ///category - order
    public static int categoryToOrd(String category){
    	if(category == "hardspeed" || category == "hardscore"){
    		return 0;
    	}
    	else if(category == "nrspeed" || category == "nrscore"){
    		return 1;
    	}
    	else if(category == "randospeed" || category == "randoscore"){
    		return 2;
    	}
    	else if(category == "phasingspeed" || category == "phasingscore"){
    		return 3;
    	}
    	else{
    		return 4;
    	}
    }
    
    public static String ordToCategory(int ord){
    	switch(ord){
    	case 0: return "Hard";
    	case 1: return "NR";
    	case 2: return "Rando";
    	case 3: return "Phasing";
    	case 4: return "Mystery";
    	default: return "";
    	}
    }
    
    public static String ordToCategoryDisplay(int ord){
    	switch(ord){
    	case 0: return "Hard";
    	case 1: return "NR";
    	case 2: return "Rando";
    	case 3: return "Phasing";
    	case 4: return "Mystery";
    	default: return "Standard";
    	}
    }
    
    public static String rankStr(int rank){
    	if(rank == 0){
    		return "";
    	}
    	else if(rank == 1){
    		return "WR";
    	}
    	else if(rank%100 == 11 || rank%100 == 12 || rank%100 == 13){
    		return rank + "th";
    	}
    	
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
    public static String ranktag(int rank, int cur, String category){
    	int boldthreshold = 1;
    	if(category == "speed" || category == "score"){
    		boldthreshold = 10;
    	}
    	if(0<rank && rank <= boldthreshold){
        	return "<td class=\"wr\"><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + category + "lbs.html#r" + rank + "\">" + rankStr(rank) + "</a></td>";
    	}
    	else if(rank != 0){
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + category + "lbs.html#r" + rank + "\">" + rankStr(rank) + "</a></td>";	
    	}
    	else{ //no entry
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + category + "lbs.html#r" + rank + "\">" + "-" + "</a></td>";
    	}
    }
    
    public static String scoreranktag(Player p, int cur, int scorethreshold){
    	if(0 < p.score[cur] && p.score[cur] <= 10){
        	return "<td class=\"wr\"><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + p.score[cur] + "\">" + rankStr(p.score[cur]) + "</a></td>";
    	}
    	else if(p.score[cur] != 0 && p.gold[cur] >= scorethreshold){
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + p.score[cur] + "\">" + rankStr(p.score[cur]) + "</a></td>";	
    	}
    	else if(p.score[cur] != 0 && p.gold[cur] < scorethreshold){
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + p.score[cur] + "\">" + rankStr(p.score[cur]) + "</a></td>";
    	}
    	else{ //no entry
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + p.score[cur] + "\">" + "-" + "</a></td>";
    	}
    }
    
    public static String ranktag(int rank, int ord, int cur, String category, String tooltip){
    	String lbsname = "";
    	if(category == "speed"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "speedlbs";
    	}
    	else if(category == "score"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "scorelbs";
    	}
    	else{
    		lbsname = curToName(cur) + "deathlesslbs";
    	}
    	
    	int boldthreshold = 1;
    	if(ord == -1 && (category == "speed" || category == "score")){
    		boldthreshold = 10;
    	}
    	
    	String tda = "";
    	if(0< rank && rank <= boldthreshold){
    		tda = "<td class=\"wr tooltip\"><a ";
    	}
    	else if(2 <= rank){
    		tda = "<td class=\"tooltip\"><a ";
    	}
    	else{ //0
    		tda = "<td class=\"tooltip out\"><a class = \"out\"";
    	}
    	
    	if(rank != 0){
        	return tda + "href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" 
    				+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + rankStr(rank) + "</a></td>";	
    	}
    	else{
        	return tda + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" + "-" + "</a></td>";
    	}

    }
    
    public static String ranktag(Player player, int ord, int cur, String category, String tooltip){
    	String lbsname = "";
    	int rank = 0;
    	int boldthreshold = 1;
    	
    	if(category == "speed"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "speedlbs";
    		rank = player.getRank(ord, cur, "speed");
    		if(ord == -1){
    			boldthreshold = 10;
    		}
    	}
    	else if(category == "score"){
    		lbsname = curToName(cur) + ordToCategory(ord) + "scorelbs";
    		rank = player.getRank(ord, cur, "score");
    		if(ord == -1){
    			boldthreshold = 10;
    		}
    	}
    	else{
    		lbsname = curToName(cur) + "deathlesslbs";
    		rank = player.deathless[cur];
    	}
    	
    	String tda = "";
    	if(0< rank && rank <= boldthreshold){
    		tda = "<td class=\"wr tooltip\"><a ";
    	}
    	else if(2 <= rank){
    		tda = "<td class=\"tooltip\"><a ";
    	}
    	else{ //0
    		tda = "<td class=\"tooltip out\"><a class = \"out\"";
    	}
    	
    	//hides Cad deathless<11, non-Coda deathless<2
    	if(category == "deathless" && cur == 3 && player.clear[cur] < 1100){
    		tda = "<td class=\"tooltip out\"><a class = \"out\"";
    	}
    	else if(category == "deathless" && cur != 13 && player.clear[cur] < 200){
    		tda = "<td class=\"tooltip out\"><a class = \"out\"";
    	}
    	
    	if(rank != 0){
        	return tda + "href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" 
    				+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + rankStr(rank) + "</a></td>";	
    	}
    	else{
        	return tda + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" + "-" + "</a></td>";
    	}

    }
        
    public static String exscoreranktag(Player player, int ord, int cur, int threshold){
    	String lbsname = curToName(cur) + ordToCategory(ord) + "scorelbs";
    	
    	int rank = player.getRank(ord, cur, "score");
    	int gold = player.extragold[ord][cur];
    	String tooltip = zeroout(gold);
    	
    	String tda = "";
    	if(rank == 1){
    		tda = "<td class=\"wr tooltip\"><a ";
    	}
    	else if(2 <= rank && (gold >= threshold || rank <= 10)){
    		tda = "<td class=\"tooltip\"><a ";
    	}
    	else{ //worse than threshold
    		tda = "<td class=\"tooltip out\"><a class = \"out\"";
    	}
    	
    	if(rank != 0){
        	return tda + "href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" 
    				+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + rankStr(rank) + "</a></td>";	
    	}
    	else{
        	return tda + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + lbsname + ".html#r" + rank + "\">" + "-" + "</a></td>";
    	}
    }
    
    //pb tags
    public static String speedpbtag(Player player, int cur){
    	if(player.time[cur] == 0){
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "speedlbs.html#r" + player.speed[cur] + "\">" + "-" + "</a></td>";
    	}
    	else{
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "speedlbs.html#r" + player.speed[cur] + "\">" + Player.csecToString(player.time[cur]) + "</a></td>";
    	}
    }
    
    public static String scorepbtag(Player player, int cur){
    	if(player.gold[cur] == 0){
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">" + "-" + "</a></td>";
    	}
    	else{
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">" + String.valueOf(player.gold[cur]) + "</a></td>";
    	}
    }
    
    public static String scorepbtag(Player player, int cur, int scorethreshold){
    	if(player.gold[cur] == 0){
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">" + "-" + "</a></td>";
    	}
    	else if(player.gold[cur] < scorethreshold){
    		return "<td><a class=\"out\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">" + String.valueOf(player.gold[cur]) + "</a></td>";
    	}
    	else{
    		return "<td><a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">" + String.valueOf(player.gold[cur]) + "</a></td>";
    	}
    }
    
    //ranking tags
    public static String speedratiotag(Player player, int cur){
    	String tooltip = Player.csecToString(player.time[cur]) + ", " + rankStr(player.speed[cur]);
    	if(player.time[cur] == 0){
    		tooltip = "No Entry";
    	}
    	else if(player.isExtra){
    		tooltip = Player.csecToString(player.time[cur]) + ", Extra Record";
    	}
    	
    	String td = "<td class=\"tooltip\">";
    	if(player.speed[cur] == 1){
    		td = "<td class=\"tooltip wr\">";
    	}
    	
    	return td + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "speedlbs.html#r" + player.speed[cur] + "\">"
    			+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + String.format("%.3f",player.timeRatio(cur)) + "</a></td>";
    }
    
    public static String scoreratiotag(Player player, int cur){

    	String tooltip = String.valueOf(player.gold[cur]) + ", " + rankStr(player.score[cur]);
    	if(player.gold[cur] == 0){
    		tooltip = "No entry or below 5000th";
    	}
    	else if(player.isExtra){
    		tooltip = String.valueOf(player.gold[cur]) + ", Extra Record";
    	}
    	
    	String td = "<td class=\"tooltip\">";
    	if(player.score[cur] == 1){
    		td = "<td class=\"tooltip wr\">";
    	}
    	
    	return td + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "scorelbs.html#r" + player.score[cur] + "\">"
    			+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + String.format("%.2f",player.scoreRatio(cur)) + "</a></td>";
    }
    
    public static String speedtimetag(Player player, int cur){
    	String tooltip = "";
    	
    	if(player.isExtra){
    		tooltip = "Extra Record";
    	}
    	else if(player.time[cur] == 0){
    		tooltip = "No Entry";
    	}
    	else if(player.time[cur] > Player.timeBound(cur)){
    		tooltip = "Raw time: " + Player.csecToString(player.time[cur]) + ", " + rankStr(player.speed[cur]);
    	}
    	else{
    		tooltip = rankStr(player.speed[cur]);
    	}
    	
    	String td = "<td class=\"tooltip\">";
    	if(player.speed[cur] == 1){
    		td = "<td class=\"tooltip wr\">";
    	}
    	
    	return td + "<a href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + "speedlbs.html#r" + player.speed[cur] + "\">"
    			+ "<span class=\"tooltip-text\">" + tooltip + "</span>" + Player.csecToString(player.adjustedTime(cur ,player.time[cur])) + "</a></td>";
    }
    
    ///lbs header tag
    public static String headertag(int cur, int ord, String cat){
    	String s = "<h4>";
    	for(int i=-1;i<5;i++){
    		if(ord == i){
    			//s += "<a>" + ordToCategoryDisplay(i) + "</a>\r\n";
    		}
    		else{
    			s += "<a class=\"header\" href=\"https://warachia2.github.io/NecroRankings/lbs/" + curToName(cur) + ordToCategory(i) + cat + "lbs.html\">" + ordToCategoryDisplay(i) + "</a>\r\n";
    		}
    	}
    	s += "</h4>";
    	return s;
    }
    }