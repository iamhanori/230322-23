package kr.hs.study.beans;

// 6. 세 변의 길이를 입력 받아 삼각형이 가능한지 여부를 판단하는 프로그램을 작성하자
public class Triangle {
    int x;
    int y;
    int z;
    int max;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void pr() {
        max = x;
        if (max > y && max > z) {
            if(max < (y + z)){
                System.out.println("삼각형이 될 수 있습니다.");
            } else {
                System.out.println("삼각형이 될 수 없습니다.");
                max = y;
                if (max > z && max > x) {
                    if(max < (x + z)){
                        System.out.println("삼각형이 될 수 있습니다.");
                    } else {
                        System.out.println("삼각형이 될 수 없습니다.");
                        max = z;
                        if (max > x && max > y) {
                            if (max < (x + y)) {
                                System.out.println("삼각형이 될 수 있습니다.");
                            } else {
                                System.out.println("삼각형이 될 수 없습니다.");
                            }
                        }
                    }
                }
            }
        }

    }
}