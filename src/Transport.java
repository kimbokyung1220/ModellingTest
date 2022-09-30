public class Transport {

    /**
     * 번호
     */
    int no;
//    int no2 = (int) (Math.random() * 100) + 1;
    /**
     * 주유량
     */
    int oil = 100;
    /**
     * 현재속도
     */
    int currentSpeed = 0;
    /**
     * 변경된 속도
     */
    int speedChange;
    /**
     * 현재 승객수
     */
    int currentPass = 0;
    /**
     * 상태
     * 버스) 0: 종료 / 1: 운행 / 2:차고지행
     * 택시) 0: 운행불가 / 1: 일반 / 2) 운행중
     */
    int status = 0;
    
    public void statusCheck(int status, int type) {

        if(type == 1) { //버스(type:1)
            if(status == 0) {
                System.out.println("버스상태 = 종료");
            } else if(status == 1) {
                System.out.println("버스상태 = 운행");
            } else {
                System.out.println("버스상태 = 차고지행");
            }
        } else {  // 택시(type:2)
            if(status == 0) {
                System.out.println("택시상태 = 운행불가");
            } else if(status == 1) {
                System.out.println("택시상태 = 일반");
            } else {
                System.out.println("택시상태 = 운행중");
            }
        }

    }


}
