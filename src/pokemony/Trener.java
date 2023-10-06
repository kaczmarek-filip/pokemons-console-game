package pokemony;

import pokeball.Pokeball;

public class Trener extends Pokeball{
    private int pokemonNumber;
    private int pokeballNumber;

    private int wins = 0;
    private int lost = 0;

    public Trener(){
        pokemonNumber = 0;
        pokeballNumber = 0;
    }
    public Trener(int pokemonNumber, int pokeballNumber){
        this.pokemonNumber = pokemonNumber;
        this.pokeballNumber = pokeballNumber;
    }

    public int getWins() {
        return wins;
    }

    public int getLost() {
        return lost;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public void setLost(int lost) {
        this.lost += lost;
    }
}
