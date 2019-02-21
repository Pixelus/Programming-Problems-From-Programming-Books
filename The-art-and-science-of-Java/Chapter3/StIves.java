// This programs calculates and displays how many representatives
// of the assembled mutlitude were coming from St Ives nursery rhyme.

import acm.program.*;

public class StIves extends ConsoleProgram {
	public void run() {
		int wives = 7;
		int sacks = 7;
		int cats = 7;
		int kits = 7;
		println("As I was going to St. Ives,");
		println("I met a man with " + wives + " wives,");
		println("Each wife had " + sacks + " sacks,");
		sacks = wives * sacks;
		println("Each sack had " + cats + " cats,");
		cats = sacks * cats;
		println("Each cat had " + kits + " kits,");
		kits = cats * kits;
		println("Kits, cats, sacks, and wives,");
		println("How many were going to St.Ives?");
		int total = kits + cats + sacks + wives + 1;
		println("Response: " + total);
	}
}
