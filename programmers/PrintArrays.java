package programmers;

public class PrintArrays {
	public String printArray(int[] args) {
		String result = "[";
		for(int i=0; i<args.length-1; i++) {
			result+= (args[i] + ", ");
		}
		return result + args[args.length-1]+"]";
	}
	
	public String printArray(String[] args) {
		String result = "[";
		for(int i=0; i<args.length-1; i++) {
			result+= (args[i] + ", ");
		}
		return result + args[args.length-1]+"]";
	}
	
	public String printArray(char[] args) {
		String result = "[";
		for(int i=0; i<args.length-1; i++) {
			result+= (args[i] + ", ");
		}
		return result + args[args.length-1]+"]";
	}
	
}
