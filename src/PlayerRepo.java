import java.util.ArrayList;
import java.util.Random;

public class PlayerRepo {
    public ArrayList<Player> playerArrayList;

    Random random = new Random();

    public PlayerRepo() {
        playerArrayList = new ArrayList<>();
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản A",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản B",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản C",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản D",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản E",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản F",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản G",Position.DF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản H",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản I",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản K",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản L",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản M",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản N",Position.FW));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản O",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản V",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản T",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản S",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản X",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản W",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản U",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản Y",Position.MF));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản Z",Position.GK));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản YY",Position.GK));
        playerArrayList.add(new Player(random.nextInt(100 - 1 + 1) + 1,"Nguyễn Văn Toản ZZ",Position.GK));
    }
}
