package Pacman;

import java.util.List;

public interface PacmanObserver {
	public void notify(List<PacmanEvent> events);
}
