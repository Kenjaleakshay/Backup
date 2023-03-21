package justexplore;

public class ExecutClass extends ChinaPen{
	
	public static void main(String[] args) {
		
		Pen p = new ChinaPen();
		p.reynolds();
	//	p.leadp();
		p.ballpen();
		ChinaPen c = (ChinaPen) p;
		c.reynolds();
		c.leadp();
		c.ballpen();
		p.reynolds();
		
		ExecutClass g = new ExecutClass();
		g.reynolds();
	}

}
