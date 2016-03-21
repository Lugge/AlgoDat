package AlgoDat.actionsPackage;

/**
 * Created by Lugge on 18.03.2016.
 */
public class StringCoding implements IActionAtInsert{
    public StringCoding(int i) {

    }

    @Override
    public Object actionAtKeyNotFound() {
        return null;
    }

    @Override
    public Object actionAtKeyFound(Object previous) {
        return null;
    }
}
