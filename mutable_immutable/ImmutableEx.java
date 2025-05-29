package mutable_immutable;

class ImmutableOb {

    private final int num;

    public ImmutableOb(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

class ImmutableEx {
    public static void main(String[] args) {
        ImmutableOb ob = new ImmutableOb(1);
        System.out.println("mmutableOb의 객체: " + ob);
        // ob.num = 3; // error 접근 불가 필드에 접근 시도
        // ob.setNum(2) //error setNum의 메서드가 없음
    }

}