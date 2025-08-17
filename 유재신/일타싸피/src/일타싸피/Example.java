package 일타싸피;

public class Example {

	    public static void main(String[] args) {
	        // 공 좌표 (단위: cm 가정)
	        double cueX = 50, cueY = 50;       // 내공
	        double objX = 200, objY = 100;     // 목적구
	        double pocketX = 300, pocketY = 0; // 포켓

	        double radius = 5; // 공 반지름 (5cm 가정)

	        // 목적구 -> 포켓 벡터
	        double vx = pocketX - objX;
	        double vy = pocketY - objY;
	        double vLen = Math.sqrt(vx*vx + vy*vy);

	        // 단위 벡터
	        double ux = vx / vLen;
	        double uy = vy / vLen;

	        // 목적구 뒤쪽 contact point
	        double contactX = objX - ux * (2 * radius);
	        double contactY = objY - uy * (2 * radius);

	        // 내공 -> contact point 벡터
	        double tx = contactX - cueX;
	        double ty = contactY - cueY;

	        // 각도 (라디안 -> 도)
	        double angleRad = Math.atan2(ty, tx);
	        double angleDeg = Math.toDegrees(angleRad);

	        System.out.printf("내공은 (%.1f, %.1f) 방향으로 쳐야 합니다.%n", tx, ty);
	        System.out.printf("각도: %.2f 라디안 (%.2f 도)%n", angleRad, angleDeg);
	    }
	}
