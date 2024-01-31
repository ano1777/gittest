import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import acm.program.ConsoleProgram;

public class finalIMDB {
	HashMap<String, HashSet<String>> filmActors;

	HashMap<String, HashSet<String>> actorFilms;

	public finalIMDB() {
		filmActors = new HashMap<String, HashSet<String>>();
	}

	public void addMovie(String title) {
		if (!filmActors.containsKey(title)) {
			filmActors.put(title, new HashSet<String>());
		}
	}

	public void addActor(String title, String actor) {
		if (filmActors.containsKey(title)) {
			filmActors.get(title).add(actor);
			actorFilms.get(actor).add(title);
		
		}
	}

	public Iterator<String> getMovies(String actor) {
		return actorFilms.get(actor).iterator();
	}

	public Iterator<String> getCommonMovies(String actor1, String actor2) {
		HashSet<String> commonMovies = new HashSet<String>();
		if (!filmActors.containsKey(actor1) || !filmActors.containsKey(actor2)) {
			return null;
		}
		for (String film1 : actorFilms.get(actor1)) {
			for (String film2 : actorFilms.get(actor2)) {
				if (film1.equals(film2)) {
					commonMovies.add(film1);
				}
			}
		}
		return commonMovies.iterator();
	}

	public Iterator<String> getCast(String movie, int n) {
		ArrayList<String> populars = new ArrayList<String>();
		if(n < filmActors.get(movie).size()) {
			return filmActors.get(movie).iterator();
		}else {
		for (int i = 0; i < n; i++) {
			int popular = 0;
			for (String actor : filmActors.get(movie)) {
				if (!populars.contains(actor)) {
					if (actorFilms.get(actor).size() > popular) {
						popular = actorFilms.get(actor).size();
						populars.add(actor);

					}
				}
			}
		}
		return populars.iterator();
	}
	}
}
