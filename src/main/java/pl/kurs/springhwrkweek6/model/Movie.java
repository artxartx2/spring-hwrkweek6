package pl.kurs.week6.model;

public class Movie {
    private String title;
    private Integer productionYear;


    public Movie(String title, Integer productionYear) {
        this.title = title;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }
}
