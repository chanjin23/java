package ch9.hashcodetostring;

import java.util.Objects;

public class Card {
    String kind;
    int number;

    public Card(){
        this("SPADE",1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    @Override
    public int hashCode(){
        return Objects.hash(kind,number);
    }

    @Override
    public String toString(){
        return "kind:" +kind+", number:"+ number;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Card))
            return false;
        Card c=(Card)obj;
        return kind==c.kind && number==c.number;
    }
}
