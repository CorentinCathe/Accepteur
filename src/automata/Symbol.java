package automata;

import java.util.Objects;

public class Symbol {

    private String string;

    public Symbol(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol = (Symbol) o;
        return Objects.equals(string, symbol.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
