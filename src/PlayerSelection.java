import java.util.ArrayList;
import java.util.Random;

public class PlayerSelection {
    Random general = new Random();

    PlayerRepo repo = new PlayerRepo();

    public void showAllPlayers() {

        for (Player player: repo.playerArrayList) {
            System.out.println(player);
        }
    }

    public void addRole(int size, Position p, ArrayList<Player> list) {
        int roleSize = 0;
        while (roleSize < size) {
            int rdDefender = general.nextInt(repo.playerArrayList.size());
            if (repo.playerArrayList.get(rdDefender).getPosition().equals(p)
                    && !list.contains(repo.playerArrayList.get(rdDefender))) {//Sử dụng contains để kiểm tra xem cầu thủ đó đã có trong danh sách chưa, nếu chưa thêm vào danh sách
                list.add(repo.playerArrayList.get(rdDefender));
                roleSize++;
            }
        }
    }

    public ArrayList<Player> getTeam(int defenderSize, int midFieldSize, int forwaderSize) {
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        int gateKeeperSize = 0;
        System.out.print("List player: ");
        while (gateKeeperSize < 1) { //Vì GK chỉ có 1 người nên vòng lặp sẽ dừng lại khi tìm được 1 người
            int rdGateKeeper = general.nextInt(repo.playerArrayList.size()); //tìm cầu thủ ngẫu nhiên
            //Nếu cầu thủ ở vị trí ngẫu nhiên có vị trí là GK thì thêm vào danh sach
            if (repo.playerArrayList.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(repo.playerArrayList.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }

//        Them cho ca 3 role
        addRole(defenderSize, Position.DF, selectedTeam);
        addRole(midFieldSize, Position.MF, selectedTeam);
        addRole(forwaderSize, Position.FW, selectedTeam);

        System.out.println(selectedTeam.size());

        return selectedTeam;
    }
}
