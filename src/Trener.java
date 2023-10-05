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

    public int getPokemonNumber() {
        return this.pokemonNumber;
    }
    public int getPokeballNumber(){
        return this.pokeballNumber;
    }

    public void addPokeballNumber(int pokeballNumber) {
        this.pokeballNumber += pokeballNumber;
    }

    public void checkPokeballs(){
        System.out.println("Dostępne pokeballe:");
    }
}
