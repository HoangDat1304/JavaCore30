package dao;

import java.util.List;
public interface TaskDao<E> {
    public List<E> getAll();
    public boolean addNew();
}
