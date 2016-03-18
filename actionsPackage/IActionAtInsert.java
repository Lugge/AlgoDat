package AlgoDat.actionsPackage;

/**
 * Created by Lugge on 18.03.2016.
 */
public interface IActionAtInsert {
    public Object actionAtKeyNotFound();
    public Object actionAtKeyFound(Object previous);
}
