package createBuildPattern.builderPattern02;

public class Director {
    private DongGuaPaiGuSoupBuilder dongGuaPaiGuSoupBuilder = new DongGuaPaiGuSoupBuilder();
    private BanLiPaiGuSoupBuilder banLiPaiGuSoupBuilder = new BanLiPaiGuSoupBuilder();
    /**
     * 熬制冬瓜排骨汤
     * @return DongGuaPaiGuSoup
     */
    public DongGuaPaiGuSoup buildDongGuaPaiGuSoup() {
        dongGuaPaiGuSoupBuilder.buildSoup();
        return (DongGuaPaiGuSoup) dongGuaPaiGuSoupBuilder.getSoup();
    }

    /**
     * 熬制板栗排骨汤
     * @return BanLiPaiGuSoup
     */
    public BanLiPaiGuSoup buildBanLiPaiGuSoup() {
        banLiPaiGuSoupBuilder.buildSoup();
        return (BanLiPaiGuSoup) banLiPaiGuSoupBuilder.getSoup();
    }
}

