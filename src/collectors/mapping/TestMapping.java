package collectors.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapping {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
		new Movie("A", Movie.Genre.ACTION),
		new Movie("B", Movie.Genre.DRAMA),		
		new Movie("C", Movie.Genre.THRILLER)		
		);
		// Collectors.mapping(mapper, downstream)
		// Collectors.groupingBy(classifier)
		
		// Correct
		movies.stream().collect(Collectors.groupingBy(s -> s.getGenere())).
		forEach((k,v) -> System.out.println(k + " " + v));
		
		// Bad
		movies.stream().collect(Collectors.partitioningBy(s -> s.getGenere())).
		forEach((k,v) -> System.out.println(k + " " + v));
		
		// Bad
		movies.stream().collect(Collectors.joining(s -> s.getGenere()) ).
		forEach((k,v) -> System.out.println(k + " " + v));
	}
}

class Movie {
	private String title;
	private Genre genere;
	
	public Movie(String title, Genre genre) {
	this.title = title;
	this.genere = genre;
	}
	
	static enum Genre {
		ACTION, DRAMA, THRILLER;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenere() {
		return genere;
	}

	public void setGenere(Genre genere) {
		this.genere = genere;
	}
	
	public String toString() {
		return title;
	}
	
	
}
