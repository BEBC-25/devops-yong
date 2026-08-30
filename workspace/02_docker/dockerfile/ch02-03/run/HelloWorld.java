static void main(String[] args){
    System.out.println("Hello");

    // 환경 변수(PORT) 조회. 없으면 null 반환
    String port = System.getenv("PORT");
    System.out.println(port + " 포트로 서버 구동됨.");
}