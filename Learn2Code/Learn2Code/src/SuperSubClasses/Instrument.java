package SuperSubClasses;

public class Instrument {

	final String MUSICIAN;
	final String INSTRUMENT;
	final String MANUFACTURER;
	
	boolean broken;
	boolean portable;
	
	String note;
	int volume;
	
	public Instrument(String instrument, String musican, String manufacturer, boolean broken, boolean portable, String note, int volume) {
		
		INSTRUMENT = instrument;
		MANUFACTURER = manufacturer;
		MUSICIAN = musican;
		
		this.broken = broken;
		this.portable = portable;
		
		this.note = note;
		this.volume = volume;
		
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}


	public void setPortable(boolean portable) {
		this.portable = portable;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public String getINSTRUMENT() {
		return INSTRUMENT;
	}


	public String getMANUFACTURER() {
		return MANUFACTURER;
	}


	public boolean isBroken() {
		return broken;
	}


	public boolean isPortable() {
		return portable;
	}


	public String getNote() {
		return note;
	}


	public int getVolume() {
		return volume;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
