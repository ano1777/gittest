import acm.program.ConsoleProgram;

public class IMDBtest extends ConsoleProgram {
	private finalIMDB imdb;

	public void run() {
		imdb = new finalIMDB();
		imdb.addMovie("barbie");
		imdb.addMovie("oppenheimer");
		imdb.addMovie("godfather");
		
		
		imdb.addActor("barbie", "margo");
		imdb.addActor("barbie", "ryan");
		imdb.addActor("barbie", "alex");
		imdb.addActor("oppenheimer", "cillian");
		imdb.addActor("oppenheimer", "florence");
		imdb.addActor("oppenheimer", "margo");
		imdb.addActor("godFather", "alex" );
		imdb.addActor("godFather", "jack");
		
		println(imdb.getMovies("margo"));
		println(imdb.getMovies("cillian"));
		println(imdb.getMovies("alex"));
		
		
	println(imdb.getCommonMovies("margo", "ryan"));
	println(imdb.getCommonMovies("cillian", "margo"));
		
	
	println(imdb.getCast("godFather", 2));
	}
	
	
	
}
