import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PlayerSelection selection = new PlayerSelection();
//        In thông tin toàn bộ cầu thủ theo theo số áo - tên - Vị trí
        selection.showAllPlayers();

//        Tiến hành lựa chọn 11 cầu thủ ngẫu nhiên theo các mô hình
//
        //        1GK - 4DF - 4MF - 2FW
        for (Player player: selection.getTeam(4, 4, 2)) {
            System.out.println(player);
        }
        //        1GK - 4DF - 3MF - 3FW
        for (Player player: selection.getTeam(4, 3, 3)) {
            System.out.println(player);
        }
        //        1GK - 3DF - 5MF - 2FW
        for (Player player: selection.getTeam(3, 5, 2)) {
            System.out.println(player);
        }
    }
}
