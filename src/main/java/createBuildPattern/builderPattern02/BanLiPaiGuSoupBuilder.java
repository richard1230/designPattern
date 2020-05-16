package createBuildPattern.builderPattern02;



/**
 * 板栗排骨汤建造者
 */
class BanLiPaiGuSoupBuilder implements SoupBuilder {

    BanLiPaiGuSoup banLiPaiGuSoup = new BanLiPaiGuSoup();
    @Override
    public void buildSoup() {
        // 加排骨
        banLiPaiGuSoup.addMeat();
        // 加板栗
        banLiPaiGuSoup.addVegetables();
        // 熬制 40 分钟
        banLiPaiGuSoup.waitMinute(40);
        // 加盐
        banLiPaiGuSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return banLiPaiGuSoup;
    }
}


