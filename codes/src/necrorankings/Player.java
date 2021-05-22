package necrorankings;

import java.util.ArrayList;

public class Player {
	String SteamID;
	boolean isExtra;
	ArrayList<String> moreinfo;
	
	///ranks
	int[] speed;
	int[] score;
	int[] deathless;
	int[] hardspeed;
	int[] nrspeed;
	int[] randospeed;
	int[] phasingspeed;
	int[] mysteryspeed;
	int[] hardscore;
	int[] nrscore;
	int[] randoscore;
	int[] phasingscore;
	int[] mysteryscore;
	
	///records
	int[] time;
	int[] gold;
	int[] clear;
	int[][] extratime;
	int[][] extragold;
	
	///weights for LBs
	final int cadencespeed = 100;
	final int otherspeed = 50;
	final int cadencescore = 50;
	final int bardplusscore = 10;
	final int otherscore = 25;
	final int codadeathless = 25;
	final int difficultdeathless = 10;
	final int easydeathless = 5;
	final int codachallenge = 25;
	final int extraspeed = 3;
	final int extrascore = 1;
	
	///WRs
	static int speedWR[] = new int[17];
	static int scoreWR[] = new int[17];
	
	//Extra Players
	static int HardHokuho[] = new int[14];
	static int NRHokuho[] = new int[14];
	static int NRWarachia[] = new int[14];
	static int RandoWarachia[] = new int[14];
	static int MysteryWarachia[] = new int[14];
	
	///Constructer
	public Player(String id){
		SteamID = id;
		isExtra = false;
		
		///ranks
		speed = new int[17];
		score = new int[17];
		deathless = new int[14];
		hardspeed  = new int[14];
		nrspeed = new int[14];
		randospeed = new int[14];
		mysteryspeed = new int[14];
		phasingspeed = new int[14];
		hardscore  = new int[14];
		nrscore = new int[14];
		randoscore = new int[14];
		mysteryscore = new int[14];
		phasingscore = new int[14];
		
		///records
		time = new int[17];
		gold = new int[17];
		clear = new int[14];
		extratime = new int[5][14];
		extragold = new int[5][14];
		
		moreinfo = new ArrayList<>();
	}
	
	///Points
	public double speedpoints(){
		double p = 0;
		for(int i=0;i<17;i++){
			p += points(speed[i]);
		}
		return p;
	}
	
	public double scorepoints(){
		double p = 0;
		for(int i=0;i<17;i++){
			p += points(score[i]);
		}
		return p;
	}
	
	public double deathlesspoints(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(deathless[i]);
		}
		return p;
	}
	
	public double bipoints(){
		return speedpoints() + scorepoints();
	}
	
	public double powerpoints(){
		return speedpoints() + scorepoints() + deathlesspoints();
	}
	
	public double hardspeed(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(hardspeed[i]);
		}
		return p;
	}
	
	public double nrspeed(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(nrspeed[i]);
		}
		return p;
	}
	
	public double randospeed(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(randospeed[i]);
		}
		return p;
	}
	
	public double phasingspeed(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(phasingspeed[i]);
		}
		return p;
	}
	
	public double mysteryspeed(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(mysteryspeed[i]);
		}
		return p;
	}
	
	public double hardscore(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(hardscore[i]);
		}
		return p;
	}
	
	public double nrscore(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(nrscore[i]);
		}
		return p;
	}
	
	public double randoscore(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(randoscore[i]);
		}
		return p;
	}
	
	public double phasingscore(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(phasingscore[i]);
		}
		return p;
	}
	
	public double mysteryscore(){
		double p = 0;
		for(int i=0;i<14;i++){
			p += points(mysteryscore[i]);
		}
		return p;
	}
	
	public double extraspeed(){
		return hardspeed() + nrspeed() + randospeed() + phasingspeed() + mysteryspeed();
	}
	
	public double extrascore(){
		return hardscore() + nrscore() + randoscore() + phasingscore() + mysteryscore();
	}
	
	public double extraSpeedCharPoints(int cur){
		return points(hardspeed[cur]) + points(nrspeed[cur]) + points(randospeed[cur]) + points(phasingspeed[cur]) + points(mysteryspeed[cur]);
	}
	
	public double extraScoreCharPoints(int cur){
		return points(hardscore[cur]) + points(nrscore[cur]) + points(randoscore[cur]) + points(phasingscore[cur]) + points(mysteryscore[cur]);
	}
	
	public double contribution(){
		return contribution_speed() + contribution_score() + contribution_deathless() + contribution_extra();
	}
	
	public double contribution_speed(){
		double p = 0;
		
		for(int i=0;i<17;i++){
			if(i == 3){
				p += cadencespeed * points(speed[i]); //Cadence Speed
			}
			else{
				p += otherspeed * points(speed[i]); //Other Speed
			}
		}
		
		return p/50;
	}
	
	public double contribution_score(){
		double p = 0;
		for(int i=0;i<17;i++){
			if(i == 3){
				p += cadencescore * points(score[i]); //Cadence Score
			}
			else if (i == 15 || i == 16){
				p += bardplusscore * points(score[i]); //9/13 Score
			}
			else{
				p += otherscore * points(score[i]); //Other Score
			}
		}
		return p/50;
	}
	
	public double contribution_deathless(){
		double p = 0;
		for(int i=0;i<14;i++){
			if(i == 13){
				p += codadeathless * points(deathless[i]); //Coda Dearthless
			}
			else if (i == 0 || i == 8 || i == 10){
				p += difficultdeathless * points(deathless[i]); //Aria/Monk/Mary Deathless
			}
			else{
				p += easydeathless * points(deathless[i]); //Other Deathless
			}
		}
		return p/50;
	}
	
	public double contribution_extra(){
		double p = 0;
		
		p += (codachallenge - extraspeed) * (points(nrspeed[13])+ points(hardspeed[13]) + points(randospeed[13]) + points(mysteryspeed[13]));
		p += extraspeed * extraspeed();
		p += extrascore * extrascore();
		
		return p/50;
	}
	
	///Sums, Ratios
	public int adjustedTime(int cur, int csec){
		if(time[cur] == 0){
			return timeBound(cur);
		}
		else{
			return Math.min(time[cur], timeBound(cur));
		}
	}
	
	public static int timeBound(int cur){ //upper bound of time for time sum rankings
		switch(cur){
		case 0:
			return 72000; //Aria
		case 1:
			return 30000; //Bard
		case 2:
			return 48000; //Bolt
		case 3:
			return 60000; //Cadence
		case 4:
			return 48000; //Diamond
		case 5:
			return 48000; //Dorian
		case 6:
			return 30000; //Dove
		case 7:
			return 72000; //Eli
		case 8:
			return 60000; //Mary
		case 9:
			return 60000; //Melody
		case 10:
			return 72000; //Monk
		case 11:
			return 72000; //Noc
		case 12:
			return 48000; //Tempo
		default:
			return 99999999; //Coda
		}
	}
	
	public int timeSum(int num){
		int s = 0;
		for(int i=0;i<num;i++){
			s += adjustedTime(i, time[i]);
		}
		return s;
	}
	
	public double timeRatio(int cur){
		if(time[cur]==0){
			return 2.0;
		}
		else{
			return Math.min(2.0, (double) time[cur]/speedWR[cur]);
		}
	}
	
	public double timeRatio_nobound(int cur){
		if(time[cur]==0){
			return 100000.0;
		}
		else{
			return (double) time[cur]/speedWR[cur];
		}
	}
	
	public double averageTimeRatio(int num){
		double s = 0;
		for(int i=0;i<num;i++){
			s += timeRatio(i);
		}
		return s/num;
	}
	
	public double scoreRatio(int cur){
		return (double)100*gold[cur]/scoreWR[cur];
	}
	
	public double averageScoreRatio(int num){
		double r = 0;
		for(int i=0;i<num;i++){
			r += scoreRatio(i);
		}
		return r/num;
	}
		
	///Switch Players
    public static Player mizmy(){
    	Player p = new Player("76561198115768228");
    	p.setTime(0, 41335); //Aria 6:53.35
    	p.setTime(3, 35301); //Cadence 5:53.01
    	p.setTime(5, 23521); //Dorian 3:55.21
    	p.setTime(7, 30632); //Eli 5:06.32
    	p.setTime(8, 31607); //Mary 5:16.07
    	p.setTime(9, 32665); //Melody 5:26.65
    	p.setTime(10, 41264); //Monk 6:52.64
    	p.setTime(11, 40680); //Nocturna 6:46.80
    	p.setTime(12, 26472); //Tempo 4:24.72
    	p.setTime(13, 71917); //Coda 11:18.57
    	p.setTime(14, 182225); //Story 30:22.25
    	
    	p.setGold(0, 15742); //Aria 15742
    	p.setGold(1, 140691); //Bard 140691
    	p.setGold(2, 19359); //Bolt 19359
    	p.setGold(6, 4258); //Dove 4258
    	p.setGold(16, 264346); //13char 264346
    	
    	p.setExtraTime(0, 0, 99642); //Aria Hard 16:36
    	p.setExtraTime(2, 0, 94525); //Aria Rando 15:45
    	p.setExtraTime(4, 0, 106939); //Aria Mystery 17:49
    	p.setExtraTime(2, 2, 33064); //Bolt Rando 5:30
    	p.setExtraTime(0, 3, 77552); //Cad Hard 12:55
    	p.setExtraTime(1, 4, 39345); //Dia NR 6:33
    	p.setExtraTime(3, 4, 36801); //Dia Phasing 6:08
    	p.setExtraTime(2, 5, 44435); //Dorian Rando 7:24
    	p.setExtraTime(4, 10, 88378); //Monk Mystery 14:43
    	p.setExtraTime(2, 10, 88961); //Monk Rando 14:49
    	p.setExtraTime(0, 7, 89026); //Eli Hard 14:50
    	p.setExtraTime(2, 7, 56229); //Eli Rando 9:22
    	p.setExtraTime(4, 7, 37853); //Eli Mystery 6:18
    	p.setExtraTime(0, 8, 89367); //Mary Hard 14:53
    	p.setExtraTime(1, 8, 59601); //Mary NR 9:56
    	p.setExtraTime(2, 8, 73220); //Mary Rando 12:32
    	p.setExtraTime(3, 8, 45942); //Mary Phasing 7:39
    	p.setExtraTime(4, 8, 61326); //Mary Mystery 10:13
    	p.setExtraTime(0, 9, 61978); //Mel Hard 10:19
    	p.setExtraTime(3, 9, 39325); //Mel Phasing 6:33
    	p.setExtraTime(4, 11, 103858); //Noc Mystery 17:18
    	p.setExtraTime(0, 12, 35389); //Tempo Hard 5:53
    	p.setExtraTime(2, 12, 52366); //Tempo Rando 8:43
    	
    	p.setExtraGold(2, 3, 31975); //Cadence Rando 31975
    	
    	p.setClear(0, 610); //Aria deathless 6-4-1
    	p.setClear(2, 1801); //Bolt deathless 18-1-2
    	p.setClear(4, 1542); //Diamond deathless 15-5-3
    	p.setClear(6, 1740); //Dove deathless 17-5-1
    	p.setClear(7, 6103); //Eli deathless 61-1-4
    	p.setClear(10, 2); //Monk deathless 0-3-3
    	p.setClear(12, 303); //Tempo deathless 3-1-4
    	
    	return p;
    }
    
    public static Player Priw8(){
    	Player p = new Player("76561198846415602");
    	p.setTime(3, 40339); //Cadence 6:43.39
    	p.setTime(6, 25259); //Dove 4:12.59 (Not PB)
    	p.setTime(9, 36235); //Mel 6:02.35
    	p.setTime(11, 51764); //Noc 8:37.64
    	p.setTime(12, 29471); //Tempo 4:54.71
    	return p;
    }

    public static Player GPA(){
    	Player p = new Player("76561199043981220");
    	p.setGold(0, 12095); //Aria
    	p.setGold(1, 144378); //Bard
    	p.setGold(12, 9815); //Tempo
    	return p;
    }
    
    ///PSN Players
    
    public static Player Miles(){
    	Player p = new Player("Miles");
    	p.setExtraTime(3, 13, 63049);
    	p.setExtraGold(3, 13, 3331);
    	return p;
    }
    
    ///Unsubmitted Players
    
    public static Player oriane(){ //https://oriane.ink/critique/oeuvre/crypt-of-the-necrodancer
    	Player p = new Player("oriane");
    	p.setTime(0, 59357); //Aria 9:53.57
    	p.setTime(3, 55877); //Cadence 9:18.77
    	p.setTime(5, 28101); //Dorian 4:41.01
    	p.setTime(6, 26197); //Dove 4:21.97
    	p.setTime(8, 46406); //Mary 7:44.06
    	p.setTime(9, 38183); //Melody 6:21.83
    	return p;
    }
    
    ///Extra Players
    public static Player LowMonster(){
    	Player p = new Player("Low% Monster");
    	p.setTime(0, 58017); //Aria
    	p.setTime(1, 32541); //Bard
    	p.setTime(2, 32271); //Bolt
    	p.setTime(3, 59368); //Cadence
    	p.setTime(4, 40829); //Diamond
    	p.setTime(5, 35248); //Dorian
    	p.setTime(6, 27133); //Dove
    	p.setTime(7, 48909); //Eli
    	p.setTime(8, 64778); //Mary
    	p.setTime(9, 36019); //Melody
    	p.setTime(10, 75520); //Monk
    	p.setTime(11, 48074); //Nocturna
    	p.setTime(12, 36167); //Tempo
    	p.setTime(13, 999999); //Coda
    	p.setExtra(true);
    	return p;
    }
    
    public static Player NRHokuho(){
    	Player p = new Player("NR Hokuho");
    	for(int i=0;i<14;i++){
    		p.setTime(i, NRHokuho[i]);
    	}
    	p.setExtra(true);
    	return p;
    }
    
    public static Player HardHokuho(){
    	Player p = new Player("Hard Hokuho");
    	for(int i=0;i<14;i++){
    		p.setTime(i, HardHokuho[i]);
    	}
    	p.setExtra(true);
    	return p;
    }
    
    public static Player RandoWarachia(){
    	Player p = new Player("Rando Warachia");
    	for(int i=0;i<14;i++){
    		p.setTime(i, RandoWarachia[i]);
    	}
    	p.setExtra(true);
    	return p;
    }
    
    public static Player MysteryWarachia(){
    	Player p = new Player("Mystery Warachia");
    	for(int i=0;i<14;i++){
    		p.setTime(i, MysteryWarachia[i]);
    	}
    	p.setExtra(true);
    	return p;
    }
    
    public static Player NRWarachia(){
    	Player p = new Player("NR Warachia");
    	for(int i=0;i<14;i++){
    		p.setTime(i, NRWarachia[i]);
    	}
    	p.setExtra(true);
    	return p;
    }
    
	///Setters
	public void setRank(String category, int cur, int rank){
		switch(category){
		case "speed":
			speed[cur] = rank;
			break;
		case "score":
			score[cur] = rank;
			break;
		case "hardspeed":
			hardspeed[cur] = rank;
			break;
		case "nrspeed":
			nrspeed[cur] = rank;
			break;
		case "randospeed":
			randospeed[cur] = rank;
			break;
		case "phasingspeed":
			phasingspeed[cur] = rank;
			break;
		case "mysteryspeed":
			mysteryspeed[cur] = rank;
			break;
		case "hardscore":
			hardscore[cur] = rank;
			break;
		case "nrscore":
			nrscore[cur] = rank;
			break;
		case "randoscore":
			randoscore[cur] = rank;
			break;
		case "phasingscore":
			phasingscore[cur] = rank;
			break;
		case "mysteryscore":
			mysteryscore[cur] = rank;
			break;
		default:
			deathless[cur] = rank;
			break;
		}
	}
	
	public void setRank(int ord, int cur, boolean isSpeed, int rank){
		switch(ord){
		case 0:
			if(isSpeed){
				hardspeed[cur] = rank; 
			}
			else{
				hardscore[cur] = rank;
			}
			break;
		case 1:
			if(isSpeed){
				nrspeed[cur] = rank; 
			}
			else{
				nrscore[cur] = rank;
			}
			break;
		case 2:
			if(isSpeed){
				randospeed[cur] = rank; 
			}
			else{
				randoscore[cur] = rank;
			}
			break;
		case 3:
			if(isSpeed){
				phasingspeed[cur] = rank; 
			}
			else{
				phasingscore[cur] = rank;
			}
			break;
		default:
			if(isSpeed){
				mysteryspeed[cur] = rank; 
			}
			else{
				mysteryscore[cur] = rank;
			}
			break;
		}
	}
	
	public void setTime(int cur, int csec){
		if(time[cur] == 0){
			time[cur] = csec;
		}
		else{
			time[cur] = Math.min(time[cur],csec);
		}
	}
	
	public void setGold(int cur, int score){
		gold[cur] = Math.max(score, gold[cur]);
	}
	
	public void setClear(int cur, int rawcount){
		clear[cur] = Math.max(clear[cur], rawcount);
	}
	
	public void setExtraTime(int ord, int cur, int csec){
		if(extratime[ord][cur] == 0){
			extratime[ord][cur] = csec;
		}
		else{
			extratime[ord][cur] = Math.min(extratime[ord][cur],csec);
		}
	}
	
	public void setExtraGold(int ord, int cur, int score){
		extragold[ord][cur] = Math.max(score, extragold[ord][cur]);
	}
	
	public void setExtra(boolean b){
		isExtra = b;
	}
	
	public void addInfo(String s){
		moreinfo.add(s);
	}
	
	///Getters
	public boolean hasWR(int ord, int cur, String category){
		if(category == "speed" || category == "Speed"){
			switch(ord){
			case 0: return hardspeed[cur] == 1;
			case 1: return nrspeed[cur] == 1;
			case 2: return randospeed[cur] == 1;
			case 3: return phasingspeed[cur] == 1;
			case 4: return mysteryspeed[cur] == 1;
			default: return speed[cur] == 1;
			}
		}
		else if(category == "score" || category == "Score"){
			switch(ord){
			case 0: return hardscore[cur] == 1;
			case 1: return nrscore[cur] == 1;
			case 2: return randoscore[cur] == 1;
			case 3: return phasingscore[cur] == 1;
			case 4: return mysteryscore[cur] == 1;
			default: return score[cur] == 1;
			}
		}
		else{
			return deathless[cur] == 1;
		}
	}
	
	public int getRank(int ord, int cur, String category){
		if(category == "speed" || category == "Speed"){
			switch(ord){
			case 0: return hardspeed[cur];
			case 1: return nrspeed[cur];
			case 2: return randospeed[cur];
			case 3: return phasingspeed[cur];
			case 4: return mysteryspeed[cur];
			default: return speed[cur];
			}
		}
		else if(category == "score" || category == "Score"){
			switch(ord){
			case 0: return hardscore[cur];
			case 1: return nrscore[cur];
			case 2: return randoscore[cur];
			case 3: return phasingscore[cur];
			case 4: return mysteryscore[cur];
			default: return score[cur];
			}
		}
		else{
			return deathless[cur];
		}
	}
	
	///Core Methods
	static double points(int rank){
		if(rank == 0){
			return 0;
		}
		else{
			return 1.7 /(Math.log((double)rank/100 + 1.03) / Math.log(10));
		}
	}
	
    public static String csecToString(int csec){
    	if(csec == 0){
    		return "";
    	}
    	
    	int minutes = csec/6000;
    	
    	String H = String.valueOf(minutes/60);
    	
    	String M = String.valueOf(minutes%60);
    	
    	String S = String.valueOf((csec%6000 - csec%100)/100);
    	if(S.length() == 1){
    		S = 0 + S;
    	}
    	String P = String.valueOf(csec%100);
    	if(P.length() == 1){
    		P = 0 + P;
    	}
    	
    	if(H.equals("0")){
        	return M + ":" + S + "." + P;
    	}
    	else{
        	if(M.length() == 1){
        		M = 0 + M;
        	}
        	return H + ":" + M + ":" + S + "." + P;
    	}
    }
	
	static String rankdes(int rank){
		if(rank >= 1){
			return String.valueOf(rank);
		}
		else{
			return "-";
		}
	}
	
	public String clearcount(int cur){
		if(cur == 0){ //Aria
			return ((clear[cur] - clear[cur]%100)/100) + "-" + (6-((clear[cur]%100 - clear[cur]%10)/10 + 1)) + "-" + (clear[cur]%10 + 1);
		}
		else{
			return (clear[cur] - clear[cur]%100)/100 + "-" + ((clear[cur]%100 - clear[cur]%10)/10 + 1) + "-" + (clear[cur]%10 + 1);	
		}
	}
	
	public String name(){
		return necrorankings.Data.name(SteamID);
	}

}
