package pet;

import java.time.Clock;
import java.time.Duration;

	
public class ClockOlater {
	private int clock;
	
	public ClockOlater(Clock clock){
		   
	       

	      Duration tickDuration = Duration.ofNanos(250000);
	      Clock clock1 = Clock.tick(clock, tickDuration);
	      System.out.println("Clock : " + clock.instant());
	      System.out.println("Clock1 : " + clock1.instant());
	}

	
	
	
	}


