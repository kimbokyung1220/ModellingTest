public class Taxi extends Transport {
    String destination = ""; //목적지
    int distance = 0; //목적지까지 거리
    int cost = 3000; //기본요금
    int defaultDt = 1; //기본거리
    int Surcharge = 1000; //추가요금
    int maxPass = 4; // 최대승객 수
    int seatsLeft = 0; //남은좌석
    int totalCost = 0; // 누적요금
    int pay = 0; //지불할 요금

    public Taxi() {
        no = (int) (Math.random() * 100) + 1;
        status = 1;

        System.out.println("택시번호 : " + no);
        System.out.println("주유량 : " + oil);
        statusCheck(status, 2);
        System.out.println("--------------------------");

    }

    public void boarding(int pass, String destination, int distance) {
        if(oil > 10 && status == 1) {
            status = 2;
            seatsLeft = maxPass - pass;
            pay = + cost + (distance - defaultDt) * Surcharge;
            totalCost += pay;

            System.out.println("탑승 승객 수 = " + pass);
            System.out.println("잔여 승객 수 = " + seatsLeft);
            System.out.println("기본요금 확인 = " + cost);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지 거리 = " + distance + "km");
            System.out.println("지불할 요금 = " + pay);
            statusCheck(2, 2);
            System.out.println("-----------------------");
        }
    }
    public void boardingMax(int pass) {
        if(oil > 10 && status == 1) {
            System.out.println("최대 승객 수 초과");
            System.out.println("-----------------------");
        }
    }
    public void checkCost(int runOil) {
        oil += runOil;
        if (oil == 0) {
            status = 0;
            System.out.println("주유량 = " + oil);
            statusCheck(status, 2);;
            System.out.println("주유가 필요합니다");
            System.out.println("누적 요금 = " + totalCost);
            System.out.println("-----------------------");

        } else {
            status = 1;
            System.out.println("주유량 = " + oil);
            System.out.println("누적 요금 = " + totalCost);
            System.out.println("-----------------------");
        }
    }
    public int speed(int change) {
        currentSpeed += change;
        return currentSpeed;
    }


}

