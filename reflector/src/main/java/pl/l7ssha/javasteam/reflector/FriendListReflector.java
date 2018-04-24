package pl.l7ssha.javasteam.reflector;

// pl.l7ssha.javasteam.reflector
//
// Date created: 24 Apr 2018
// Author: Szymon 'l7ssha' Uglis


import pl.l7ssha.javasteam.steamuser.FriendList;
import pl.l7ssha.javasteam.steamuser.FriendListNode;

import java.util.Iterator;
import java.util.stream.Stream;

public class FriendListReflector extends Reflector<FriendList> implements Iterable<FriendListNode> {
    public FriendListReflector(FriendList data) {
        super(data);
    }

    @Override
    public Iterator<FriendListNode> iterator() {
        return data.getFriends().iterator();
    }

    public Stream<FriendListNode> getStream() {
        return data.getFriends().stream();
    }
}
