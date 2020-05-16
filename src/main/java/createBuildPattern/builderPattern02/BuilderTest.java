package createBuildPattern.builderPattern02;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        // 熬制冬瓜排骨汤
        director.buildDongGuaPaiGuSoup();
        // 熬制板栗排骨汤
        director.buildBanLiPaiGuSoup();
    }
}
