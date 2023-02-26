
import org.junit.jupiter.api.Test;

import static APISteps1.getCharacter.getCharacter;
import static APISteps1.getLocation.getLastCharacterLocation;
import static APISteps1.getLocation.getMortyLocation;
import static APISteps1.getSpecies.getLastCharacterSpecies;
import static APISteps1.getSpecies.getMortySpecies;
import static APISteps1.lastCharacter.getLastCharacter;
import static APISteps1.lastCharacter.lastChar;
import static APISteps1.lastEpisode.getEpisode;
import static APISteps1.compare.*;

public class TestAPI1 {
String name="Morty Smith";
    @Test
    public void getAll()
    {
        getCharacter(name);
        getEpisode();
        getLastCharacter();
        getMortySpecies();
        getLastCharacterSpecies(lastChar);
        getMortyLocation();
        getLastCharacterLocation(lastChar);
    }
    @Test
    public void compareSpecie()
    {
        getAll();
        compareSpecies();
    }
    @Test
    public void compareLoc()
    {
        getAll();
        compareLocation();
    }


}
