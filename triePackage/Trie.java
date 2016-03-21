package AlgoDat.triePackage;

import AlgoDat.actionsPackage.IActionAtInsert;
import AlgoDat.mapPackage.IMapFactory;

import java.util.Iterator;

/**
 * Created by Lugge on 18.03.2016.
 */
public class Trie implements ITrie{
    public Trie(){
        //TODO: Factory
    }

    public Trie(IMapFactory mapFactory) {

    }

    @Override
    public ITrieReference insert(Iterator k, IActionAtInsert a) {
        //TODO: Implement
        return null;
    }

    @Override
    public ITrieReference insert(String s, IActionAtInsert a) {
        //TODO: Implement
        return null;
    }
}
