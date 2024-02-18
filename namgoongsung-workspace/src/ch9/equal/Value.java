package ch9.equal;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object obj){
//        return this==obj;   //Value의 참조 값과 들어온 참조 값이 같으면 true로 반환
        //Object에는 value가 없으므로 형변환을 해야함.
        if(!(obj instanceof Value)) return false;
        Value v=(Value)obj;
        return value==v.value;
    }

}
