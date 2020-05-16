package createBuildPattern.builderPattern02;


/**
 * 冬瓜排骨汤建造者
 */
class DongGuaPaiGuSoupBuilder implements SoupBuilder {

    private DongGuaPaiGuSoup dongGuaPaiGuSoup = new DongGuaPaiGuSoup();
    @Override
    public void buildSoup() {
        // 加排骨
        dongGuaPaiGuSoup.addMeat();
        // 熬制 30 分钟
        dongGuaPaiGuSoup.waitMinute(30);
        // 加冬瓜
        dongGuaPaiGuSoup.addVegetables();
        // 熬制 10 分钟
        dongGuaPaiGuSoup.waitMinute(10);
        // 加盐加香菜
        dongGuaPaiGuSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return dongGuaPaiGuSoup;
    }
}
