import java.util.ArrayList;

public class Jonction {

	private ArrayList<Jonction> jonctions;
	private ArrayList<Segment> segments;
	
	/**
	 * 
	 */
	public Jonction(ArrayList<Segment> segments, int nb) {
		try{
			this.segments = new ArrayList<Segment>();
			
			for(int i = 0; i < nb; i++){
				if(segments.get(i).getjA() == null){
					this.segments.add(segments.get(i));
					this.segments.get(i).setjA(this);
				}
				else if(segments.get(i).getjB() == null){
					this.segments.add(segments.get(i));
					this.segments.get(i).setjB(this);
				}
				else{
					segments.remove(i);
					i--;
				}
			}
		} catch(IndexOutOfBoundsException e){
			//System.err.println("Bite");
		}
		
	}

	@Override
	public String toString(){
		String str =  "Cette jonction relie " + segments.size() + " voies.";
		for(int i = 0; i < segments.size(); i++)
			str += " " + segments.get(i).id;
		return str;
	}
}
