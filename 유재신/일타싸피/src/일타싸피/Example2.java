package 일타싸피;

public class Example2 {

    public static void main(String[] args) {
        // 공 좌표 (단위: cm 가정)
        double cueX = 50, cueY = 50;          // 내공
        double obj1X = 200, obj1Y = 100;      // 목적구1
        double obj2X = 250, obj2Y = 150;      // 목적구2
        double pocketX = 300, pocketY = 0;    // 포켓

        double radius = 5; // 공 반지름 (5cm 가정)

        // ---------------- 목적구1 처리 ----------------
        System.out.println("=== 목적구1 처리 ===");
        double[] result1 = calculateShot(cueX, cueY, obj1X, obj1Y, pocketX, pocketY, radius);

        // 목적구1을 친 뒤, 내공의 새 좌표(근사치) → contact point 근처
        cueX = result1[0];
        cueY = result1[1];

        // ---------------- 목적구2 처리 ----------------
        System.out.println("\n=== 목적구2 처리 ===");
        double[] result2 = calculateShot(cueX, cueY, obj2X, obj2Y, pocketX, pocketY, radius);
    }

    // 목적구-포켓 라인 맞추는 contact point 및 각도 계산 함수
    static double[] calculateShot(double cueX, double cueY,
                                  double objX, double objY,
                                  double pocketX, double pocketY,
                                  double radius) {

        // 목적구 -> 포켓 벡터
        double vx = pocketX - objX;
        double vy = pocketY - objY;
        double vLen = Math.sqrt(vx * vx + vy * vy);

        // 단위 벡터
        double ux = vx / vLen;
        double uy = vy / vLen;

        // 목적구 뒤쪽 contact point
        double contactX = objX - ux * (2 * radius);
        double contactY = objY - uy * (2 * radius);

        // 내공 -> contact point 벡터
        double tx = contactX - cueX;
        double ty = contactY - cueY;
        
        //거리계산
        double distance = Math.sqrt(tx*tx + ty*ty);
        
        // 각도 계산
        double angleRad = Math.atan2(ty, tx);
        double angleDeg = Math.toDegrees(angleRad);
        
        //힘 결정
        double force = distance * 0.5;

        System.out.printf("내공은 (%.1f, %.1f) 방향으로 쳐야 합니다.%n", tx, ty);
        System.out.printf("각도: %.2f 라디안 (%.2f 도)%n", angleRad, angleDeg);
        System.out.printf("권장 힘: %.2f%n", force);
        // contact point를 반환 (내공의 새 목표지점 근사치)
        return new double[]{contactX, contactY};
    }
}
