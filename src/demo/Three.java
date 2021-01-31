package demo;

class Three {
    int a = 5;
    int b = 3;


    public int plusB() {
        if (a > b) {
            return 1;
        } else {
            return 2;
        }

    }
    // 문자열을 받아서 길이가 3보다 크면 1을 리턴, 아니면 0 을 리턴
    public int test1(String str) {
        return (str=="a") ? 1 : 0 ;
    }


    public static void main(String[] args){
        Three three = new Three();
        three.plusB();
        System.out.println(three.test1("수호"));

    }



}



