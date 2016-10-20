package Challenges;

public class Movie {
	
	//Fields
	private String title;
	private String genre;
	private String director;
	private String year;
	private String cast;
	private String runtime;
	
	//constructor
	public Movie(String title, String genre, String director, String year, String cast, String runtime) {
		
		this.title = '"' + title + '"';
		
		this.genre = genre;
		
		this.director = "Director: " + director;
		
		this.year = year;
		
		this.cast = "Cast: " + cast;
		
		this.runtime = "Duration: " + runtime + " minutes";
		
	}
	
	//other methods
	public void displayMovie() {
		
		System.out.println(title + ", " + year);
		System.out.println(director);
		System.out.println(cast);
		System.out.println(runtime);
		System.out.println(genre);
		
	}
	
	
	//Getters and setters
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	

}

