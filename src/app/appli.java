package app;
import automata.*;

import java.util.Scanner;


public class appli {

    public static void main(String[] args) {
        //create automata
        Automata automate = new Automata();
        //create state
        State state1 = new State("1");
        State state2 = new State("2");
        State state3 = new State("3");
        State state4 = new State("4");
        State state5 = new State("5");
        //add state to automata
        automate.addState(state1);
        automate.addState(state2);
        automate.addState(state3);
        automate.addState(state4);
        automate.addState(state5);
        //create char for the alphabet
        Symbol point = new Symbol(":");
        Symbol pointV = new Symbol(";");
        Symbol tiret = new Symbol("-");
        Symbol egual = new Symbol("=");
        Symbol parOuv = new Symbol("(");
        Symbol parFerm= new Symbol(")");
        //add char to automata
        automate.addAlphabet(point);
        automate.addAlphabet(pointV);
        automate.addAlphabet(tiret);
        automate.addAlphabet(egual);
        automate.addAlphabet(parOuv);
        automate.addAlphabet(parFerm);

        //add transition on the automata
        automate.addTransition(state1,state2,point);
        automate.addTransition(state1,state3,pointV);
        automate.addTransition(state3,state4,tiret);
        automate.addTransition(state2,state4,egual);
        automate.addTransition(state2,state4,tiret);
        automate.addTransition(state4,state5,parFerm);
        automate.addTransition(state4,state5,parOuv);
        //create an initial state
        automate.setInitState(state1);
        //create a final state
        automate.setEnd(state5);
        //enable the possibility to right my smiley in the console directly
        Scanner txt = new Scanner(System.in);
        String textString = txt.nextLine();
        Symbol[] charact = new Symbol[textString.length()];
        for (int i = 0; i < charact.length ; i++){
            charact[i]=new Symbol(String.valueOf(textString.charAt(i)));
        }
        //print the result
        System.out.println(automate.test(charact));

    }




}
