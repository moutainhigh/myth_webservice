/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.zdmoney.common.service;

import com.google.common.collect.Lists;
import com.zdmoney.common.entity.AbstractEntity;
import com.zdmoney.common.mybatis.mapper.JdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * BaseService
 * <p/>
 * Author: Hao Chen
 * Date: 2016年1月4日 11:53:35
 * Mail: haoc@zendaimoney.com
 */
public abstract class BaseService<T extends AbstractEntity, ID extends Serializable> {

    private Class<T> entityClass;

    public BaseService() {
        Type superclass = getClass().getGenericSuperclass();
        if (superclass instanceof ParameterizedType) {
            entityClass = (Class<T>) ((ParameterizedType) superclass).getActualTypeArguments()[0];
        }
    }

    protected JdMapper<T, ID> baseMapper;

    @Autowired(required = false)
    public void setBaseMapper(JdMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    /**
     * 保存单个实体
     *
     * @param t 实体
     * @return 返回保存的实体
     */
    public T save(T t) {
        int i = baseMapper.insert(t);
        return i > 0 ? t : null;
    }

    /**
     * 更新单个实体
     *
     * @param t 实体
     * @return 返回更新的实体
     */
    public T update(T t) {
        int i = baseMapper.updateByPrimaryKey(t);
        return i > 0 ? t : null;
    }

    /**
     * 更新单个实体(不为空的字段)
     *
     * @param t 实体
     * @return 返回更新的实体
     */
    public T updateNotNull(T t) {
        int i = baseMapper.updateByPrimaryKeySelective(t);
        return i > 0 ? t : null;
    }

    /**
     * 根据主键删除相应实体
     *
     * @param id 主键
     * @return 影响的记录数
     */
    public int delete(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据主键删除相应实体
     *
     * @param t 实体
     * @return 影响的记录数
     */
    public int delete(T t) {
        return baseMapper.deleteByPrimaryKey(t.getId());
    }


    /**
     * 根据主键数组删除相应实体
     *
     * @param ids 主键数组
     * @return 影响的记录数
     */
    public int delete(ID[] ids) {
        Example example = new Example(entityClass);
        example.createCriteria().andIn("id", Lists.newArrayList(ids));
        return baseMapper.deleteByExample(example);
    }

    /**
     * 按照主键查询
     *
     * @param id 主键
     * @return 返回id对应的实体
     */
    public T findOne(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    /**
     * 按照example查询
     *
     * @param example 主键
     * @return
     */
    public List<T> findByExample(Example example) {
        return baseMapper.selectByExample(example);
    }


    /**
     * 按照实体对象查询
     *
     * @param t 对象
     * @return
     */
    public List<T> findByEntity(T t) {
        return baseMapper.select(t);
    }

    /**
     * 实体是否存在
     *
     * @param id 主键
     * @return 存在 返回true，否则false
     */
    public boolean exists(ID id) {
        return findOne(id) != null;
    }

    /**
     * 统计实体总数
     *
     * @return 实体总数
     */
    public long count() {
        return baseMapper.selectCount(null);
    }

    /**
     * 按照查询条件统计实体总数
     *
     * @param example 查询条件
     * @return 实体总数
     */
    public long count(Example example) {
        return baseMapper.selectCountByExample(example);
    }

    /**
     * 查询所有实体
     *
     * @return
     */
    public List<T> findAll() {
        return baseMapper.selectAll();
    }

}
