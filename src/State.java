import java.util.HashMap;

public class State {

    private String statName;

    private HashMap<Symbol , State> outTransition;

    public State(String statName) {
        this.statName = statName;

    }

    public void addTransition(Symbol key , State value ){
            this.outTransition.put(key, value);
    }

    public String getStatName() {
        return statName;
    }


    public void setStatName(String statName) {
        this.statName = statName;
    }
}
