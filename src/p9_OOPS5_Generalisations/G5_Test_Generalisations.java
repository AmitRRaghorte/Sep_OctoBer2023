package p9_OOPS5_Generalisations;

public class G5_Test_Generalisations {

	public static void main (String [] args) {
		
		System.out.println ("******Generalisation ******");
		
		G2_RoyalenfielD  g = new G2_RoyalenfielD ();
		g.name();
		g.cc();
		g.price();
		g.colour();
		System.out.println ("**********************************");
		
		G3_ZMR z = new G3_ZMR ();
		z.name();
		z.cc();
		z.price();
		z.colour();
		System.out.println ("**********************************");
		
		G4_Trumph t = new G4_Trumph ();
	    t.name();
		t.cc();
		t.price();
		t.colour();
		System.out.println ("**********************************");
		
	}
}
