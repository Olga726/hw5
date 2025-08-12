package pc3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName1, int currentPlayers1){
        this.gameName=gameName1;
        this.currentPlayers=currentPlayers1;
    }

    static void setMaxPlayers(int maxPlayers1){
        maxPlayers=maxPlayers1;
    }

    void addPlayer(){
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus(){
        System.out.println("Название: " + gameName + ", Текущее кол-во игроков: " + currentPlayers + ", Max кол-во игроков: " + maxPlayers);
    }

}
