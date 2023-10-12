public class Artwork {

    //property
    private String title;
    private String artist;
    private int price;

    //constructor
    public Artwork(String inputTitle, String inputArtist, int inputPrice){
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;

    }

    //Getters and Setters
    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }
    public int getPrice(){
        return this.price;
    }



}//last curly bracket
