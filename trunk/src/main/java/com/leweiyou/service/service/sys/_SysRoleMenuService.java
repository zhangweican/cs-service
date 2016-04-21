package com.leweiyou.service.service.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import com.leweiyou.service.mybatis.dao.sys.*;
import com.leweiyou.service.mybatis.entry.sys.*;
import com.leweiyou.service.util.Commons;

import java.util.List;
import java.util.Set;

/**
 * 凡是以_开头的Service类，都属于自动生成的类，不提倡在这里添加service方法，请在XXXXService类里加自定义方法。
 * @author Zhangweican
 *
 */
public abstract class _SysRoleMenuService{

	@Autowired
	protected SysRoleMenuMapper sysRoleMenuMapper;


	//================方法自动生成区================
    /**
     * 支持分页查询
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public PageInfo<SysRoleMenu> selectByExample(SysRoleMenuExample e,int offer, int limit) throws RuntimeException{
		PageHelper.startPage(offer, limit);
		PageInfo<SysRoleMenu> page = new PageInfo<SysRoleMenu>(sysRoleMenuMapper.selectByExample(e));
		return page;
	}
	
    /**
     * 查询唯一对象，如果没有记录返回Null
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
 	public SysRoleMenu selectOne(SysRoleMenuExample example) throws RuntimeException{
	 	List<SysRoleMenu> list = sysRoleMenuMapper.selectByExample(example);
     	return (list == null || list.size() == 0) ? null : list.get(0);
 	}


    /**
     * 查询记录条数
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public int countByExample(SysRoleMenuExample example) throws RuntimeException{
        return sysRoleMenuMapper.countByExample(example);
    }

    /**
     * 删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByExample(SysRoleMenuExample example) throws RuntimeException{
        return sysRoleMenuMapper.deleteByExample(example);
    }

    /**
     * 通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByPrimaryKey(String id) throws RuntimeException{
        return sysRoleMenuMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByExample(Set<SysRoleMenuExample> examples) throws RuntimeException{
		for(SysRoleMenuExample example : examples){
			sysRoleMenuMapper.deleteByExample(example);
		}
    }

    /**
     * 批量通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByPrimaryKey(Set<String> ids) throws RuntimeException{
		for(String id : ids){
			sysRoleMenuMapper.deleteByPrimaryKey(id);
		}
    }

    /**
     * 插入记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insert(SysRoleMenu record) throws RuntimeException{
        return sysRoleMenuMapper.insert(record);
    }

    /**
     * 可选择性插入记录信息，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insertSelective(SysRoleMenu record) throws RuntimeException{
        return sysRoleMenuMapper.insertSelective(record);
    }
    
	/**
	 * 批量插入记录
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsert(Set<SysRoleMenu> records) throws RuntimeException{
		for(SysRoleMenu record : records){
			sysRoleMenuMapper.insert(record);
		}
	}
	
	/**
	 * 批量可选择性插入记录信息，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsertSelective(Set<SysRoleMenu> records) throws RuntimeException{
		for(SysRoleMenu record : records){
			sysRoleMenuMapper.insertSelective(record);
		}
	}

	/**
	 * 批量根据主键更新记录，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKeySelective(Set<SysRoleMenu> records) throws RuntimeException{
		for(SysRoleMenu record : records){
			sysRoleMenuMapper.updateByPrimaryKeySelective(record);
		}
	}
    /**
     * 批量通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKey(Set<SysRoleMenu> records) throws RuntimeException{
		for(SysRoleMenu record : records){
			sysRoleMenuMapper.updateByPrimaryKey(record);
		}
    }

    /**
     * 查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public List<SysRoleMenu> selectByExample(SysRoleMenuExample example) throws RuntimeException{
        return sysRoleMenuMapper.selectByExample(example);
    }

    /**
     * 通过主键查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public SysRoleMenu selectByPrimaryKey(String id) throws RuntimeException{
        return sysRoleMenuMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据条件更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExampleSelective(SysRoleMenu record, SysRoleMenuExample example) throws RuntimeException{
         return sysRoleMenuMapper.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExample(SysRoleMenu record, SysRoleMenuExample example) throws RuntimeException{
         return sysRoleMenuMapper.updateByExample(record, example);
    }

    /**
     * 根据主键更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKeySelective(SysRoleMenu record) throws RuntimeException{
        return sysRoleMenuMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKey(SysRoleMenu record) throws RuntimeException{
        return sysRoleMenuMapper.updateByPrimaryKey(record);
    }
    
}
