public class Main {
    public static void main(String[] args) {

     /*   Bus bus = new Bus();
        Bus bus2 = new Bus();
        //승객 2명 탑승
        bus.boarding(2);
        // 주유량 & 상태
        bus.oliCheck(-50);
        // 주유량 & 상태
        bus.oliCheck(10);
        // 승객 초과
        bus.boarding(45);
        // 승객 5명 탑승
        bus.boarding(5);
        // 주유량 & 상태
        bus.oliCheck(-55);
*/
        Taxi taxi = new Taxi();
        Taxi taxi2 = new Taxi();
        // 승객 탑승
        taxi.boarding(2, "서울역", 2);
        // 요금 결제
        taxi.checkCost(-80);
        // 승객 탑승
        taxi.boardingMax(5);
        // 승객 탑승
        taxi.boarding(3, "구로디지털단지역", 12);
        // 요금 결제
        taxi.checkCost(-20);
    }
}