package com.linus.api.common;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl(){}
    public static UtilService getInstance(){
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gapBetweenStartAnd) {
       return start + (int)(Math.random()*gapBetweenStartAnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        double v = Double.parseDouble(
                String.format("%.1f",
                        start + (Math.random() * gapBetweenStartAndEnd)));
        return v;
    }

    public String createRandomName(){
        String[] names ={"이정재", "마동석", "송강호", "윤여정", "황정민", "정우성", "이병헌", "현 빈", "유해진", "손석구", "전도연", "손예진", "하지원", "김하늘", "송중기", "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return names[createRandomInteger(0,20)];
    }

    @Override
    public String createRandomTitle() {
        String[] titles ={"국민경제의 성장",
                "경제의 민주화",
                "연소자의 근로",
                "국민의 자유와 복리의 증진",
                "정부위원은 출석·답변",
                "공무원의 임기 또는 중임제한",
                "선출 또는 임명",
                "교육을 받을 권리"};
                return titles[createRandomInteger(0,7)];
    }

    @Override
    public String createRandomContent() {
        String[] contents ={"국가는 균형있는 국민경제의 성장 및 안정과 적정한 소득의 분배를 유지하고, 시장의 지배와 경제력의 남용을 방지하며, 경제주체간의 조화를 통한 경제의 민주화를 위하여 경제에 관한 규제와 조정을 할 수 있다." ,
                "연소자의 근로는 특별한 보호를 받는다. 국회는 선전포고, 국군의 외국에의 파견 또는 외국군대의 대한민국 영역안에서의 주류에 대한 동의권을 가진다." ,
                "명령·규칙 또는 처분이 헌법이나 법률에 위반되는 여부가 재판의 전제가 된 경우에는 대법원은 이를 최종적으로 심사할 권한을 가진다." ,
                "나는 헌법을 준수하고 국가를 보위하며 조국의 평화적 통일과 국민의 자유와 복리의 증진 및 민족문화의 창달에 노력하여 대통령으로서의 직책을 성실히 수행할 것을 국민 앞에 엄숙히 선서합니다." ,
                "국회나 그 위원회의 요구가 있을 때에는 국무총리·국무위원 또는 정부위원은 출석·답변하여야 하며, 국무총리 또는 국무위원이 출석요구를 받은 때에는 국무위원 또는 정부위원으로 하여금 출석·답변하게 할 수 있다." ,
                "공무원의 신분과 정치적 중립성은 법률이 정하는 바에 의하여 보장된다." ,
                "이 헌법중 공무원의 임기 또는 중임제한에 관한 규정은 이 헌법에 의하여 그 공무원이 최초로 선출 또는 임명된 때로부터 적용한다." ,
                "모든 국민은 능력에 따라 균등하게 교육을 받을 권리를 가진다."};
        return contents[createRandomInteger(0,7)];
    }
    public String createRandomCompany(){
        String[] companies = {"구글","엔비디아","메타","삼성","LG","애플"};
        return null;
    }
    public String createRandomUsername() {
        String username = "";
        for(; username.length() < 5; username += String.valueOf((char)('a' + this.createRandomInteger(0, 26))));
        return username;
    }

//    public String createRandomUsername(){
//        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        String username = "";
//        for (int i = 0 ; i < 5 ; i++){
//            username += String.valueOf(alphabet[createRandomInteger(0,26)]);
//        }
//        return username;
//    }0
}
