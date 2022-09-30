public class Bus extends Transport {
    int seatsLeft = 0; //남은좌석
    int cost = 0; //요금
    int maxPass = 30; //최대 승객수

    public Bus() {
        no = (int) (Math.random() * 100) + 1;
        status = 1;
        System.out.println("버스번호 : " + no);
        System.out.println("------------------------------------------");
    }

    public void boarding(int pass) {
        currentPass = currentPass + pass;
        seatsLeft = maxPass - currentPass;
        cost = 1000 * pass;
        status = 1;

        if (currentPass >= 30 || status != 1) {
            currentPass = 0;
            System.out.println("최대 승객 수 초과");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("탑승 승객 수 = " + pass);
            System.out.println("잔여 좌석 수 = " + seatsLeft);
            System.out.println("요금 확인 = " + cost);
            System.out.println("------------------------------------------");
        }
    }

    public void oliCheck(int runOil) {
        oil += runOil;
        currentPass = 0;
        cost = 0;

        if (status != 3) {
            if (oil >= 100) {
                status = 1;
            } else if (oil < 10 && oil > 100) {
                status = 2;
            } else if(oil < 10) {
                System.out.println("주유량 = " + oil);
                statusCheck(status, 1);
                System.out.println("주유가 필요합니다.");
                System.out.println("------------------------------------------");

            } else {
                System.out.println("주유량 = " + oil);
                statusCheck(status, 1);
                System.out.println("------------------------------------------");
            }
        }
    }
    public int speed(int change) {
        currentSpeed += change;
        return currentSpeed;
    }
}
