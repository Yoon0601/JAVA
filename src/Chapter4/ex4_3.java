package Chapter4;

class Song{
    String title;
    String artist;
    int year;
    String country;
    public Song(){}
    public Song(String title,String artist, int year,String country){
        this.title=title;
        this.artist=artist;
        this.year=year;
        this.country=country;
    }
    public void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }
}
public class ex4_3 {
    public static void main(String[] args) {
        Song song=new Song("Dancing Queen","ABBA",1978,"스웨덴");
        song.show();
    }

}
