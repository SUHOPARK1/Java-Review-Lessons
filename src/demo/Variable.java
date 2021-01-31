package demo;

enum Test{

    KOREA("한국", 3);
    private final int countryCodeNumber;
    private String koreanName;

    Test(String koreanName, int countryCodeNumber){
        this.koreanName = koreanName;
        this.countryCodeNumber=countryCodeNumber;
    }


    public int getCountryCodeNumber(){
        return countryCodeNumber;
    }

    public String getKoreanName(){
        return koreanName;
    }
}




class Variable {
    String name;
    int number;

    Variable(int number){
        this.number = number;
    }
    Variable(String name){
        this.name = name;
    }
    Variable(int number, String name){
        this.number = number;
        this.name = name;
    }

    // 문자열을 입력받아서 문자열의 길이가 3보다 작으면 1 을 리턴, 아니면 0을 리턴
    public int a(String str){
       return (str.length() < 3) ? 1: 0;
    }



    public static void main(String[] args) {
        Variable variable = new Variable(1, "dd");


        System.out.println(variable.getNumber());
        System.out.println(Test.KOREA.getCountryCodeNumber());

    }


    public int getNumber() {
        return number;}

    public String getName() {
        return name;
    }

}