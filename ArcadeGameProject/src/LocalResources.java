public class LocalResources {

    public static String SongPath = "./src/Youtube-Arcade Classics 2_ Millipede_Centipede Music - Game Select Screen.wav";
    public static String ImgPoisonedMushroom = "./src/PoisonedMushroom1.png";
    public static String ImgRegularMushroom = "./src/RegularMushroom1.png";
    public static String ImgFlea = "./src/Flea.png";
    public static String ImgPistol = "./src/Pistol.png";
    public static String ImgShotgun = "./src/Shotgun.png";
    public static String ImgBoomerang = "./src/Boomerang.png";
    public static String ImgSpider = "./src/Spider.png";
    public static String ImgScorpion = "./src/Scorpion.png";
    public static String ImgPlayer1 = "./src/Player1.png";
    public static String ImgPlayer2 = "./src/Player2.png";
    public static String ImgCentipedeHead = "./src/CentipedeHead.png";
    public static String ImgCentipedeBody = "./src/CentipedeBody.png";

    static{
        String RunPath = System.getProperty("user.dir");
        String[] segments = RunPath.split("/");
        String lastIndex = segments[segments.length-1];
        if(lastIndex.equals("src")) {
            SongPath = SongPath.substring(6);
            ImgPoisonedMushroom = ImgPoisonedMushroom.substring(6);
            ImgRegularMushroom = ImgRegularMushroom.substring(6);
            ImgFlea = ImgFlea.substring(6);
            ImgPistol = ImgPistol.substring(6);
            ImgShotgun = ImgShotgun.substring(6);
            ImgBoomerang = ImgBoomerang.substring(6);
            ImgSpider = ImgSpider.substring(6);
            ImgScorpion = ImgScorpion.substring(6);
            ImgPlayer1 = ImgPlayer1.substring(6);
            ImgPlayer2 = ImgPlayer2.substring(6);
            ImgCentipedeHead = ImgCentipedeHead.substring(6);
            ImgCentipedeBody = ImgCentipedeBody.substring(6);
        }
    }
}
