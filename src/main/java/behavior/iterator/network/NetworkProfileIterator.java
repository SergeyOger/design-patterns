package behavior.iterator.network;

import behavior.iterator.profile.Profile;


public interface NetworkProfileIterator {

  Profile getNext();

  boolean hasNext();

}
