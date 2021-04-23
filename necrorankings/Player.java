package necrorankings;

public class Player {
	String SteamID;
	boolean isExtra;
	
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
	}
	
	///Description
	public String extraSpeedDescription(){
		String d = name() + "\t" + String.format("%.2f",extraspeed()) + "\t" + String.format("%.2f",hardspeed())
		+ "\t" + String.format("%.2f",nrspeed()) + "\t" + String.format("%.2f",randospeed()) + "\t" + String.format("%.2f",phasingspeed()) + "\t" + String.format("%.2f",mysteryspeed());
		
		return d;
	}
	
	public String extraSpeedDescription2(){
		String d = name() + "\t" + String.format("%.2f",extraspeed());
		
		for(int i=0;i<14;i++){
			d += "\t" + String.format("%.2f",extraSpeedCharPoints(i));
		}
		
		return d;
	}
	
	public String extraScoreDescription(){
		String d = name() + "\t" + String.format("%.2f",extrascore()) + "\t" + String.format("%.2f",hardscore())
		+ "\t" + String.format("%.2f",nrscore()) + "\t" + String.format("%.2f",randoscore()) + "\t" + String.format("%.2f",phasingscore()) + "\t" + String.format("%.2f",mysteryscore());
		
		return d;
	}
	
	public String extraScoreDescription2(){
		String d = name() + "\t" + String.format("%.2f",extrascore());
		
		for(int i=0;i<14;i++){
			d += "\t" + String.format("%.2f",extraScoreCharPoints(i));
		}
		
		return d;
	}
	
	public String contributionDescription(){
		String d = name() + "\t" + String.format("%.2f",contribution());
		
		
		double p = 0;
		
		for(int i=0;i<17;i++){
			if(i == 3){
				p += cadencespeed * points(speed[i]); //Cadence Speed
			}
			else{
				p += otherspeed * points(speed[i]); //Other Speed
			}
		}
		
		d += "\t" + String.format("%.2f",p/50);
		
		
		p = 0;
		
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
		
		d += "\t" + String.format("%.2f",p/50);
		
		p = 0;
		
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
		
		d += "\t" + String.format("%.2f",p/50);
		
		d += "\t" + String.format("%.2f",((codachallenge - extraspeed) * (points(nrspeed[13])+ points(hardspeed[13]) + points(randospeed[13]) + points(mysteryspeed[13])) + extraspeed*extraspeed() + extrascore*extrascore())/50);
		
		return d;
	}
	
	public String speedDescription(){
		String d = name() + "\t" + String.format("%.2f",speedpoints());
		
		for(int i=0;i<17;i++){
			d += "\t" + rankdes(speed[i]);
		}
		
		return d;
	}
	
	public String scoreDescription(){
		String d = name() + "\t" + String.format("%.2f",scorepoints());
		
		for(int i=0;i<17;i++){
			d += "\t" + rankdes(score[i]);
		}
		
		return d;
	}
	
	public String timeSumDescription(int num){
		String d = name();
		
		d += "\t" + csecToString(timeSum(num));
				
		for(int i=0;i<num;i++){
			d += "\t" + csecToString(adjustedTime(i,time[i]));
		}
		return d;
	}
	
	public String timeRatioDescription(int num){
		String d = name();
		
		d += "\t" + String.format("%.3f", averageTimeRatio(num));
		
		for(int i=0;i<num;i++){
			d += "\t" + String.format("%.3f",timeRatio(i));
		}
		return d;
	}
	
	public String scoreRatioDescription(int num){
		String d = name();
		
		d += "\t" + String.format("%.3f", averageScoreRatio(num)) + "%";
		
		for(int i=0;i<num;i++){
			d += "\t" + String.format("%.3f",scoreRatio(i)) + "%";
		}
		return d;
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
		double p = 0;
		
		for(int i=0;i<17;i++){
			if(i == 3){
				p += cadencespeed * points(speed[i]); //Cadence Speed
			}
			else{
				p += otherspeed * points(speed[i]); //Other Speed
			}
		}
		
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
		
		p += (codachallenge - extraspeed) * (points(nrspeed[13])+ points(hardspeed[13]) + points(randospeed[13]) + points(mysteryspeed[13]));
		p += extraspeed * extraspeed();
		p += extrascore * extrascore();
		
		p /= 50;
		
		return p;
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
	
	public int timeBound(int cur){ //upper bound of time for time sum rankings
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
    	Player p = new Player("Mizmy");
    	p.setTime(0, 41335); //Aria
    	p.setTime(1, 20398); //Bard
    	p.setTime(2, 22661); //Bolt
    	p.setTime(3, 35301); //Cadence
    	p.setTime(4, 28065); //Diamond
    	p.setTime(5, 23521); //Dorian
    	p.setTime(6, 17695); //Dove
    	p.setTime(7, 30632); //Eli
    	p.setTime(8, 31607); //Mary
    	p.setTime(9, 32665); //Melody
    	p.setTime(10, 41264); //Monk
    	p.setTime(11, 40680); //Nocturna
    	p.setTime(12, 26472); //Tempo
    	p.setTime(13, 71917); //Coda
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
	
	public void setTime(int cur, int csec){
		if(time[cur] == 0){
			time[cur] = csec;
		}
		else{
			time[cur] = Math.min(time[cur],csec);
		}
	}
	
	public void setGold(int cur, int score){
		gold[cur] = score;
	}
	
	public void setExtra(boolean b){
		isExtra = b;
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
	
	public String name(){
		return necrorankings.Data.name(SteamID);
	}

}
