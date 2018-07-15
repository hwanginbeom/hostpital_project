package model.domain;

public class Hospital_PeopleDTO {
	private String loc;
	private int full_Time;
	private int part_Time;
	private int dent;
	private int kr_Med;
	private int phar;
	private int midWife;
	private int nurese;
	private int nur_Aid;
	private int med_Tech;
	private int med_Roc;
	
	public Hospital_PeopleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital_PeopleDTO(String loc, int full_Time, int part_Time, int dent, int kr_Med, int phar, int midWife,
			int nurese, int nur_Aid, int med_Tech, int med_Roc) {
		super();
		this.loc = loc;
		this.full_Time = full_Time;
		this.part_Time = part_Time;
		this.dent = dent;
		this.kr_Med = kr_Med;
		this.phar = phar;
		this.midWife = midWife;
		this.nurese = nurese;
		this.nur_Aid = nur_Aid;
		this.med_Tech = med_Tech;
		this.med_Roc = med_Roc;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getFull_Time() {
		return full_Time;
	}

	public void setFull_Time(int full_Time) {
		this.full_Time = full_Time;
	}

	public int getPart_Time() {
		return part_Time;
	}

	public void setPart_Time(int part_Time) {
		this.part_Time = part_Time;
	}

	public int getDent() {
		return dent;
	}

	public void setDent(int dent) {
		this.dent = dent;
	}

	public int getKr_Med() {
		return kr_Med;
	}

	public void setKr_Med(int kr_Med) {
		this.kr_Med = kr_Med;
	}

	public int getPhar() {
		return phar;
	}

	public void setPhar(int phar) {
		this.phar = phar;
	}

	public int getMidWife() {
		return midWife;
	}

	public void setMidWife(int midWife) {
		this.midWife = midWife;
	}

	public int getNurese() {
		return nurese;
	}

	public void setNurese(int nurese) {
		this.nurese = nurese;
	}

	public int getNur_Aid() {
		return nur_Aid;
	}

	public void setNur_Aid(int nur_Aid) {
		this.nur_Aid = nur_Aid;
	}

	public int getMed_Tech() {
		return med_Tech;
	}

	public void setMed_Tech(int med_Tech) {
		this.med_Tech = med_Tech;
	}

	public int getMed_Roc() {
		return med_Roc;
	}

	public void setMed_Roc(int med_Roc) {
		this.med_Roc = med_Roc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hospital_PeopleDTO [loc=");
		builder.append(loc);
		builder.append(", full_Time=");
		builder.append(full_Time);
		builder.append(", part_Time=");
		builder.append(part_Time);
		builder.append(", dent=");
		builder.append(dent);
		builder.append(", kr_Med=");
		builder.append(kr_Med);
		builder.append(", phar=");
		builder.append(phar);
		builder.append(", midWife=");
		builder.append(midWife);
		builder.append(", nurese=");
		builder.append(nurese);
		builder.append(", nur_Aid=");
		builder.append(nur_Aid);
		builder.append(", med_Tech=");
		builder.append(med_Tech);
		builder.append(", med_Roc=");
		builder.append(med_Roc);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
