import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Box {
    private List<Integer> list;
    Box(int a_, int b_, int c_){
        list = new ArrayList<>();
        list.add(a_);
        list.add(b_);
        list.add(c_);
        Collections.sort(list);
    }
    public boolean fitIn(Box obj){
        return  this.list.get(0) <= obj.list.get(0) &&
                this.list.get(1) <= obj.list.get(1) &&
                this.list.get(2) <= obj.list.get(2);
    }
}
