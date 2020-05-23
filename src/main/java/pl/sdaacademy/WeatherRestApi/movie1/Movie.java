package pl.sdaacademy.WeatherRestApi.movie;


import org.springframework.lang.NonNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class Movie {


    @NonNull
    private int id;
    @NotEmpty
    private String titile;
    @NotBlank
    private String type;

    public Movie(int id, String titile, String type) {
        this.id = id;
        this.titile = titile;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
