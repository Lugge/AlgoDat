package AlgoDat.triePackage;

import AlgoDat.actionsPackage.IActionAtInsert;

import java.util.Iterator;

/**
 * Created by Lugge on 18.03.2016.
 */
public interface ITrie {
    public ITrieReference insert(Iterator k, IActionAtInsert a);
    public ITrieReference insert(String s, IActionAtInsert a);
}
