package add;

public class Money {
	
	public String div(float x) {
		if(x <= 0) {
			return "输入无意义";
		}
		
		int c[] = {1,2,3,5,6,7,8,10,11,12,13,20,21,22,23,25,26,27,28,30,31,
				32,33,50,51,52,53,55,56,57,58,60,61,62,63,70,71,72,73,75,76,77,78,80,81,82,83};

		for(int i = 0; i < c.length; i++) {
			if(x == c[i]) {
				return "可行";
			}
		}
		return "不行";
	}

}
