//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main1 {
    public Main1() {

    }


    public static void main(String[] args) {

        Genre pop  = new Genre("POP");
        Genre best  = new Genre("best");
        Genre classic  = new Genre("Classic");
        Author kodaline = new Author("Kodaline ","Sigma");
        Author tame_impala = new Author("Tame", "Impala");
        Author sidewalks_and_sceletons = new Author("Sidewalks_and","_Sceletons");
        Author college_and_electric_youth = new Author("College &"," ellectric youth");
        Author indilla = new Author("Ind", "illa");




        Music everything_works_out_in_the_end = new Music("everything_works_out_in_the_end", kodaline, classic, "https://youtu.be/FUBKGZ2XaRQ?si=T8WjGXgZCqECZ-z4", 246, 40.0);
        Music Love_Story = new Music("Love_Story", indilla, pop, "https://youtu.be/uH08H02VTiE?si=269nOxw3wlNm_vuS", 208, 20.0);
        new Music("Goth", sidewalks_and_sceletons, pop, "https://youtu.be/KJoYBw5tJOc?si=KBSaOrCef8f_J8h8", 256, 55.0);
        new Music("SOWN", college_and_electric_youth, pop, "https://youtu.be/-x-lpdzb9jc?si=w5ydOag0xXh-x6lo", 267, 60.0);
        Music let_itHappen = new Music("Let it Happen", tame_impala, best, "https://youtu.be/s26KnwMIMLY?si=Xp-Yq18Bukh7y0fA", 416, 500.0);
        User Asta = new User("Asta 152", "POP", 500.0);
        User Aktan = new User("Aktan Urmambetoff", "Rap", 120.0);
        Asta.getInfo();
        Aktan.getInfo();
        Asta.getBalance();
        Asta.buyMusic(everything_works_out_in_the_end, 0);
        Asta.buyMusic(let_itHappen, 5);
        Asta.buyMusic(Love_Story, 1);
        Asta.getBalance();
        Asta.buyMusic(everything_works_out_in_the_end, 3);
        Asta.getBalance();
        Asta.getPlayList();
        Asta.listenMusic(Love_Story);
        Asta.listenMusic(let_itHappen);
        Love_Story.getDownloads();
        let_itHappen.getViews();
        let_itHappen.openVideo();
    }
}
