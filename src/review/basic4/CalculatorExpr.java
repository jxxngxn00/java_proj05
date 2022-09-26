package basic4;

public class CalculatorExpr {


    private int num1;
    private int num2;


    //getter , setter 생성
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }


    // 계산 메소드 생성
    int getAddition(){                  // 덧셈
        return num1+num2;
    }

    int getSubtraction(){               // 뺄셈
        return num1 - num2;
    }

    int getMultiplication() {           // 곱셈
        return num1 * num2;
    }

    double getDivision(){               // 나눗셈
        return (double)num1 / num2;
    }
}
