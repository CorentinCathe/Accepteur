package automata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Automata {

    private State initState;
    private Set<State> endState;
    private Set<State> state;
    private HashSet<Symbol> alphabet;

    /**
     * Construcor for Automata
     */
    public Automata() {
        this.state=new HashSet<>();
        this.endState =new HashSet<>();
        this.alphabet = new HashSet<>();
    }

    /**
     *add Alphabet to Automata
     * @param symbol
     */
    public void addAlphabet(Symbol symbol){
        this.alphabet.add(symbol);
    }

    /**
     * add State to Automata
     * @param state
     */
    public void addState(State state){
        this.state.add(state);
    }

    /**
     * set the state of the Autamata
     * @param state
     */
    public void setState(Set<State> state) {
        this.state = state;
    }

    /**
     * TODO
     * @return
     */
    public Set<State> getState() {
        return state;
    }

    /**
     * add a transition between to states
     * @param origin
     * @param dest
     * @param act
     */
    public void addTransition(State origin , State dest , Symbol act){
        origin.addTransition(act,dest);
    }

    /**
     * set the initial state of the automata
     * @param init
     */
    public void setInitState (State init){
        this.initState=init;
    }

    /**
     * get the initial state of the automata
     * @return
     */
    public State getInitState(){
        return this.initState;
    }

    /**
     * set the end au the automata
     * @param fin
     * @return
     */
    public boolean setEnd (State fin){
        return endState.add(fin);
    }

    /**
     * test if the character chain is valid in the Automata
     * @param ch
     * @return
     */
    public boolean test(Symbol[] ch){
        State actualStat=this.initState;

        for (int i =0;i< ch.length ; i++) {
           actualStat=actualStat.getNextState(ch[i]);
            if (actualStat == null) {
                return false;
            }

        }
        if (!this.endState.contains(actualStat)){
            return false;
        }
        return true;
    }



}
