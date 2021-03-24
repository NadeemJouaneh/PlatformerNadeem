

public class Levels {
	int state = 3;
	public int[][][] testBench(){
		int[][][] map = new int[100][100][state];
		for(int x = 0; x < 100;x++) {
			for(int y = 0; y < 20;y++) {
				map[x][y][0] = 1;
				map[x][y][1] = 1;
			}
		}
		
		for(int x = 0; x < 100;x++) {
			for(int y = 0; y < 20;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}
		for(int x = 0; x < 100;x++) {
			for(int y = 80; y < 100;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}

		for(int x = 0; x < 34;x++) {
			for(int y = 35; y < 37;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}

		for(int x = 0; x < 100;x++) {
			for(int y = 35; y < 37;y++) {
				map[x][y][0] = 1;
				map[x][y][1] = 1;
			}
		}
		for(int i=25; i <= 29;i++ ) {
			map[i][32][0]=1;
			map[i][32][1]=1;
		}
		
		map[33][33][0] = 1;
		map[33][33][1] = 0;
		return map;
	}
	public int[][][] emptyLevel(){
	 int[][][] map = new int[100][100][state];
	 return map;
	}
	public int[][][] firstLevel(){
		//						 y 	   x
		 int[][][] map = new int[100][100][state];
		 for(int x = 0; x < 100;x++) {
				for(int y = 0; y < 20;y++) {
					map[x][y][0] = 1;
					map[x][y][1] = 1;
				}
			}
			
			for(int x = 0; x < 100;x++) {
				for(int y = 0; y < 20;y++) {
					map[y][x][0] = 1;
					map[y][x][1] = 1;
				}
			}
			for(int x = 0; x < 100;x++) {
				for(int y = 80; y < 100;y++) {
					map[y][x][0] = 1;
					map[y][x][1] = 1;
				}
			}

			for(int x = 0; x < 28;x++) {// height of the divider
				for(int y = 35; y < 36;y++) {// thickness of the wall divider
					map[y][x][0] = 1;
					map[y][x][1] = 1;
				}
			}
			for(int x = 33; x < 38 ;x++) {// height of the divider
				for(int y = 35; y < 36;y++) {// thickness of the wall divider
					map[y][x][0] = 1;
					map[y][x][1] = 1;
				}
			}

			for(int x = 0; x < 100;x++) {
				for(int y = 37; y < 40;y++) {// runway block depth
					map[x][y][0] = 1;
					map[x][y][1] = 1;
				}
			}
			for(int i=25; i <= 28;i++ ) {// platform
				map[i][32][0]=1;
				map[i][32][1]=1;
			}
		
			for(int i=32; i <= 34;i++ ) {// platform
//			     	x	y  type     position of block
				map[i][30][0]=1; // =0 means not visible  & =1 means visible
				map[i][30][1]=1; // =0 means go through & =1 means not go through
			}
				for(int i=45; i <= 47;i++ ) {// platform
//			     	x	y  type     position of block
				map[i][28][0]=1; // =0 means not visible  & =1 means visible
				map[i][28][1]=1; // =0 means go through & =1 means not go through
			
			}
				for(int i=56; i <= 57;i++ ) {// platform
//			     	x	y  type     position of block
				map[i][24][0]=1; // =0 means not visible  & =1 means visible
				map[i][24][1]=1; // =0 means go through & =1 means not go through
			
			}
				for(int i=65; i <= 67;i++ ) {// platform
//			     	x	y  type     position of block
				map[i][30][0]=1; // =0 means not visible  & =1 means visible
				map[i][30][1]=1; // =0 means go through & =1 means not go through
			
			}
				for(int i=75; i <= 80;i++ ) {// platform
//			     	x	y  type     position of block
				map[i][27][0]=1; // =0 means not visible  & =1 means visible
				map[i][27][1]=1; // =0 means go through & =1 means not go through
			
			}
		 return map;
		}

	
}
