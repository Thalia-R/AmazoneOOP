package no.thaliar;

public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    public ChildrensBook(String title, String author, int price, String recommendedAgeInfo, long productId) {
        super(title, author, price, productId);

    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
}
