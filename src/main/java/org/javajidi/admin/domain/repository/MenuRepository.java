package org.javajidi.admin.domain.repository;

import org.javajidi.admin.domain.modle.Menu;

import java.util.List;

/**
 * Created by xieqiang on 2016/9/17.
 */
public interface MenuRepository {

    void add(Menu menu);

    void update(Menu menu);

    Menu get(String code);

    boolean contains(String code);

    List<Menu> list();

    void remove(String code);

    void switchStatus(String code,boolean disabled);

    void addItem(String parentCode, Menu menu);
}
