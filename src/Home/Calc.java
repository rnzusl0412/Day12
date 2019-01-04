package Home;

// 두 수를 4칙 연산하는 클래스
public class Calc {

    private int a;
    private int b;

    // java beans

    public Calc() {
        super();
    }

    public Calc(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // a+b, a-b, a*b, a/b

    public int getHap() {
        return a + b;
    }

    public int getSub() {
        return a - b;
    }

    public int getMul() {
        return a * b;
    }

    public int getDiv() {
        return a / b;
    }

    public String toString() {
        String str01 = String.format("%5d + %5d = %5d\n", a, b, this.getHap());
        String str02 = String.format("%5d - %5d = %5d\n", a, b, this.getSub());
        String str03 = String.format("%5d * %5d = %5d\n", a, b, this.getMul());
        String str04 = String.format("%5d / %5d = %5d\n", a, b, this.getDiv());
        return str01 + str02 + str03 + str04;
    }
}