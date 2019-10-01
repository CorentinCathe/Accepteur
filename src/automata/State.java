package automata;

import java.util.HashMap;
import java.util.Objects;

public class State {

    private String statName;

    private HashMap<Symbol, State> outTransition;

    /***
     * constructo of State
     * @param statName
     */
    public State(String statName) {
        this.statName = statName;
        this.outTransition = new HashMap<>();
    }

    /**
     * add a Transition to the state
     * @param key
     * @param value
     */
    public void addTransition(Symbol key, State value) {
        this.outTransition.put(key, value);
    }

    /**
     * get the next State of the actual state
     * @param key
     * @return
     */

    public State getNextState(Symbol key){
        return this.outTransition.get(key);
    }

    public boolean isNextState(Symbol key){
        return  this.outTransition.containsKey(key);
    }

    public String getStateName() {
        return statName;
    }

    public void setStateName(String statName) {
        this.statName = statName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(statName, state.statName);
    }

}
