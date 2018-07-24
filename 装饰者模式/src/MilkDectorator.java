/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/20
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
public class MilkDectorator extends Decorator {
    public MilkDectorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
