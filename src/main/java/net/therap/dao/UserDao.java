package net.therap.dao;

import net.therap.domain.User;

/**
 * @author Mushfekur Rahman
 * @since 09/02/2013
 */

public interface UserDao {
    User getUser(String name, String password);
}
