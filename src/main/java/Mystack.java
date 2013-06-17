import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/17/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mystack {
    static List<String> list = new ArrayList<String>();
    public int size() {
        if(list == null)
            return 0;  //To change body of created methods use File | Settings | File Templates.
        else
            return list.size();
    }

    public void add(String adb) {

        list.add(adb);
        //To change body of created methods use File | Settings | File Templates.
    }

    public String top() {
        if(list ==null )
            return null;  //To change body of created methods use File | Settings | File Templates.
        else
            return list.get(list.size()-1);
    }

    public String pop() {
        if(list==null)
            throw new IllegalStateException("StackEmptyException");
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
