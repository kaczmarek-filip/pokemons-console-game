import pokeball.Pokeball;

public class Trener extends Pokeball{
    private int pokemonNumber;
    private int pokeballNumber;

    public Trener(){
        pokemonNumber = 0;
        pokeballNumber = 0;
    }
    public Trener(int pokemonNumber, int pokeballNumber){
        this.pokemonNumber = pokemonNumber;
        this.pokeballNumber = pokeballNumber;
    }
}
