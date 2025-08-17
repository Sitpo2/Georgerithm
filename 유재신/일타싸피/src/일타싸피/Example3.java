package 일타싸피;

public class Example3 {

    public static void main(String[] args) {
        
    	double cuex = 50, cuey = 50;
    	double obj1x = 200, obj1y = 100;
    	double obj2x = 250, obj2y = 150;
    	double pocketx = 300, pockety = 0;
    	
    	double radius = 5; //반지름
    	
    	//목적구 1 처리
    	System.out.println("----목적구1 처리----");
    	double[] result1 = calculateShot(cuex, cuey, obj1x, obj1y, pocketx, pockety, radius);
    	
    	//목적구 1 처리하고, 내 공 위치 옮기기
    	cuex = result1[0];
    	cuey = result1[1];
    	
    	//목적구 2 처리
    	System.out.println();
    	System.out.println("목적구2 처리");
    	double[] result2 = calculateShot(cuex, cuey, obj2x, obj2y, pocketx, pockety, radius);
    }
    	
    	
    	
    	static double[] calculateShot(double cuex, double cuey,
    								double objx, double objy,
    								double pocketx, double pockety,
    								double radius) {
    		
    //목적구 -> 포멧 벡터
    double vx = pocketx - objx;
    double vy = pockety - objy;
    double vLen = Math.sqrt(vx*vx + vy*vy);
    
    //단위 벡터
    double ux = vx / vLen;
    double uy = vy / vLen;
    
    //목적구 뒤쪽 contact point
    double contactx = objx - ux*(2*radius);
    double contacty = objy - uy*(2*radius);
    
    //내공 -> 컨택 포인트
    double tx = contactx - cuex;
    double ty = contacty - cuey;
    double distance = Math.sqrt(tx*tx+ty*ty);
    
    //각도 계싼
    double angleRad = Math.atan2(ty, tx);
    double angleDeg = Math.toDegrees(angleRad);
    
    double force = distance*0.5;
    
    System.out.printf("내 공은 (%.1f, %.1f) 방향으로 쳐야 합니다.%n", tx, ty);
    System.out.printf("각도: %.2f 라디안 (%.2f 도)%n", angleRad, angleDeg);									
    System.out.printf("%.2f힘으로 쳐야합니다.", force);
    //contact point를 반환
    return new double[] {contactx, contacty};
    	}	
    	
    	
    }

