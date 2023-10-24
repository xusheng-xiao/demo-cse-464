import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> container = new ArrayList<>();

    public void push(int i){
        container.add(i);
    }

    public int size(){
        return container.size();
    }
}
