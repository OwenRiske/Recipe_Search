public class recipe {
    String name;
    String ingredients;
    String instructions;
    int rating;
    String[] genre;

    recipe(String name, String ingredients,String instructions, String[] genre){
        this.name=name;
        this.ingredients=ingredients;
        this.instructions=instructions;
    }

    void setRating(int ratingOutOfTen){
        rating=ratingOutOfTen;
    }

    void setGenre(String[] newGenre){
        genre=newGenre;
    }
}
