package necrorankings;

//////////////////////////////////////
///register player's name/ID to Data.java if it doesn't include players you want yet (hundreds of players are already included)
///edit line30 to set where you generate files
///then copy&paste all to sample.xlsx
//////////////////////////////////////

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

import necrorankings.Player;

public class PBCalculator extends DefaultHandler{
	static String output = "C:\\Users\\Warachia\\Desktop\\Document\\NecroPBs\\PBtexts\\"; //where you generate files
	
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
        
        //0:Aria 1:Bard 2:Bolt 3:Cadence 4:Diamond 5:Dorian 6:Dove 7:Eli 8:Mary 9:Mel 10:Monk 11:Noc 12:Tempo 13:Coda 14:Story 15:9char 16:13char
        category = "speed";
        cur = 0; WRflag = true; //Aria 0
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047597/?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Bard 1
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047596?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Bolt 2
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047619?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Cadence 3
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047626/?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Diamond 4
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047607?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Dorian 5
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047783?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Dove 6
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048040?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Eli 7
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047703?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Mary 8
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2002224?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Melody 9
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047682?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Monk 10
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047702?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Nocturna 11
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047762?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Tempo 12
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047724/?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Coda 13
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047820?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Story 14
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047666?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //9char 15
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049484?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //13char 16
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047440?xml=1").openStream(), new PBCalculator());
        
        category = "score";
        cur = 0; WRflag = true; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047493?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047522?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047555?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047569?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047515?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047587?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047599?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047651?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047749?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047565?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047642?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047540?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047718?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047645?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //Story
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047568?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //9char
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047616?xml=1").openStream(), new PBCalculator());
        cur++; WRflag = true; //13char
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047387?xml=1").openStream(), new PBCalculator());
        
        category = "deathless";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049087?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047487?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049475?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047527?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2051069?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049479?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049476?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049478?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048880?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048097?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048193?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047756?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048482?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049481?xml=1").openStream(), new PBCalculator());
        
        //0:Aria 1:Bard 2:Bolt 3:Cadence 4:Diamond 5:Dorian 6:Dove 7:Eli 8:Mary 9:Mel 10:Monk 11:Noc 12:Tempo 13:Coda 14:Story 15:9char 16:13char
        category = "hardspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2050640/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048188/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048159/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047849/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047787/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052471/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049702/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052105/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048457/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048154/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052468/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047528/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049537/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048847/?xml=1").openStream(), new PBCalculator());
        
        category = "nrspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047969/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048459/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2054023/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047692/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047859/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049727/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/1811409/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052104/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049426/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2053043/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2054022/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047755/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049535/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/1795160/?xml=1").openStream(), new PBCalculator());
        
        category = "randospeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049406/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041610/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042275/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047461/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047664/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049135/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049359/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049486/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048624/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039748/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049111/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045853/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047971/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048519/?xml=1").openStream(), new PBCalculator());
        
        category = "phasingspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049437/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041663/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041622/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047434/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041705/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048572/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041652/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039279/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048619/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041694/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2043822/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041693/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044754/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047448/?xml=1").openStream(), new PBCalculator());
        
        category = "mysteryspeed";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049408/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045621/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042279/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047409/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041196/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049678/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045553/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048518/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049505/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047653/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2051364/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047608/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047864/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048845/?xml=1").openStream(), new PBCalculator());
        
        category = "hardscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048147/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047380/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047595/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047413/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047728/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048576/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048730/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052001/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047975/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047925/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2052467/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2038424/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047746/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048522/?xml=1").openStream(), new PBCalculator());
        
        category = "nrscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047968/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047639/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047498/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047548/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047521/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048925/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049413/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2049468/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047759/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047584/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048136/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047556/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048085/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048520/?xml=1").openStream(), new PBCalculator());
        
        category = "randoscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040656/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041617/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042240/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040588/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041184/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048484/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047745/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047560/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047847/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039747/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047617/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044879/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047732/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048001/?xml=1").openStream(), new PBCalculator());
        
        category = "phasingscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2019483/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2040612/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041620/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047388/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041182/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047422/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041655/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039281/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047846/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041701/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2043902/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041674/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047722/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2039297/?xml=1").openStream(), new PBCalculator());
        
        category = "mysteryscore";
        cur = 0; //Aria
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045741/?xml=1").openStream(), new PBCalculator());
        cur++; //Bard
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045589/?xml=1").openStream(), new PBCalculator());
        cur++; //Bolt
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2042281/?xml=1").openStream(), new PBCalculator());
        cur++; //Cadence
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2038541/?xml=1").openStream(), new PBCalculator());
        cur++; //Diamond
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041193/?xml=1").openStream(), new PBCalculator());
        cur++; //Dorian
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047424/?xml=1").openStream(), new PBCalculator());
        cur++; //Dove
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2048468/?xml=1").openStream(), new PBCalculator());
        cur++; //Eli
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047880/?xml=1").openStream(), new PBCalculator());
        cur++; //Mary
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047750/?xml=1").openStream(), new PBCalculator());
        cur++; //Melody
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2044975/?xml=1").openStream(), new PBCalculator());
        cur++; //Monk
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047615/?xml=1").openStream(), new PBCalculator());
        cur++; //Nocturna
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2045542/?xml=1").openStream(), new PBCalculator());
        cur++; //Tempo
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2047799/?xml=1").openStream(), new PBCalculator());
        cur++; //Coda
        saxParser.parse(new URL("https://steamcommunity.com/stats/247080/leaderboards/2041286/?xml=1").openStream(), new PBCalculator());
        
        //Unsubmitted
        list.get("76561198453991513").setTime(3, 44474); //TheBigRanch, Cadence Speed 7:24.74
        list.get("76561198087367133").setTime(2, 27345); //Shortcake Sweets, Bolt Speed, 4:33.45
        list.get("76561197999948240").setGold(11, 30086); //Ancalagor, Nocturna Score 30086
        list.get("76561198398758840").setGold(0, 26566); //Hokuho, Aria Score 26566
        Player.scoreWR[0] = Math.max(Player.scoreWR[0], 26566);
        
        //Bar Text
        LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		String fdate1 = dtformat1.format(date1);

        //PBs
        
        ArrayList<Player> array = new ArrayList<>(list.values());
        
        for(Player player:array){
        	if(player.name().startsWith("ID")){
        		continue;
        	}
            try {
                FileWriter f = new FileWriter(output + player.name() + ".txt", false);
                PrintWriter p = new PrintWriter(new BufferedWriter(f));

                p.println("\t\t" + "Speed" + "\t\t" + "Score" + "\t\t\t" + "HrdSp\tNRSp\tRndSp\tPhaSp\tMysSp\t\tHrdSc\tNRSc\tRndSc\tPhaSc\tMysSc\tDL");
                
                for(int i=0;i<14;i++){
                	p.println("\t" + curToName(i) + "\t" +  Player.csecToString(player.time[i]) + "\t" + rankStr(player.speed[i])
                			+ "\t" + player.gold[i] + "\t" + rankStr(player.score[i])
                			+ "\t\t" + t9(player.hardspeed[i]) + "\t" + t9(player.nrspeed[i]) + "\t" + t9(player.randospeed[i]) + "\t" + t9(player.phasingspeed[i]) + "\t" + t9(player.mysteryspeed[i])
                			+ "\t\t" + t9(player.hardscore[i]) + "\t" + t9(player.nrscore[i]) + "\t" + t9(player.randoscore[i]) + "\t" + t9(player.phasingscore[i]) + "\t" + t9(player.mysteryscore[i])
                			+ "\t" + t9(player.deathless[i]));
                }
                
                for(int i=14;i<16;i++){
                	p.println("\t" + curToName(i) + "\t" +  Player.csecToString(player.time[i]) + "\t" + rankStr(player.speed[i])
                			+ "\t" + player.gold[i] + "\t" + rankStr(player.score[i]));
                }
                
                for(int i=16;i<17;i++){
                	p.println("\t" + curToName(i) + "\t" +  Player.csecToString(player.time[i]) + "\t" + rankStr(player.speed[i])
                			+ "\t" + player.gold[i] + "\t" + rankStr(player.score[i]) + "\t\t" + fdate1);
                }
                
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
    
    ///top9rank
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
}