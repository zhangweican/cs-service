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
public abstract class _SysUserService{

	@Autowired
	protected SysUserMapper sysUserMapper;


	//================方法自动生成区================
    /**
     * 支持分页查询
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public PageInfo<SysUser> selectByExample(SysUserExample e,int offer, int limit) throws RuntimeException{
		PageHelper.startPage(offer, limit);
		PageInfo<SysUser> page = new PageInfo<SysUser>(sysUserMapper.selectByExample(e));
		return page;
	}
	
    /**
     * 查询唯一对象，如果没有记录返回Null
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
 	public SysUser selectOne(SysUserExample example) throws RuntimeException{
	 	List<SysUser> list = sysUserMapper.selectByExample(example);
     	return (list == null || list.size() == 0) ? null : list.get(0);
 	}


    /**
     * 查询记录条数
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public int countByExample(SysUserExample example) throws RuntimeException{
        return sysUserMapper.countByExample(example);
    }

    /**
     * 删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByExample(SysUserExample example) throws RuntimeException{
        return sysUserMapper.deleteByExample(example);
    }

    /**
     * 通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByPrimaryKey(String id) throws RuntimeException{
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByExample(Set<SysUserExample> examples) throws RuntimeException{
		for(SysUserExample example : examples){
			sysUserMapper.deleteByExample(example);
		}
    }

    /**
     * 批量通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByPrimaryKey(Set<String> ids) throws RuntimeException{
		for(String id : ids){
			sysUserMapper.deleteByPrimaryKey(id);
		}
    }

    /**
     * 插入记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insert(SysUser record) throws RuntimeException{
        return sysUserMapper.insert(record);
    }

    /**
     * 可选择性插入记录信息，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insertSelective(SysUser record) throws RuntimeException{
        return sysUserMapper.insertSelective(record);
    }
    
	/**
	 * 批量插入记录
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsert(Set<SysUser> records) throws RuntimeException{
		for(SysUser record : records){
			sysUserMapper.insert(record);
		}
	}
	
	/**
	 * 批量可选择性插入记录信息，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsertSelective(Set<SysUser> records) throws RuntimeException{
		for(SysUser record : records){
			sysUserMapper.insertSelective(record);
		}
	}

	/**
	 * 批量根据主键更新记录，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKeySelective(Set<SysUser> records) throws RuntimeException{
		for(SysUser record : records){
			sysUserMapper.updateByPrimaryKeySelective(record);
		}
	}
    /**
     * 批量通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKey(Set<SysUser> records) throws RuntimeException{
		for(SysUser record : records){
			sysUserMapper.updateByPrimaryKey(record);
		}
    }

    /**
     * 查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public List<SysUser> selectByExample(SysUserExample example) throws RuntimeException{
        return sysUserMapper.selectByExample(example);
    }

    /**
     * 通过主键查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public SysUser selectByPrimaryKey(String id) throws RuntimeException{
        return sysUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据条件更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExampleSelective(SysUser record, SysUserExample example) throws RuntimeException{
         return sysUserMapper.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExample(SysUser record, SysUserExample example) throws RuntimeException{
         return sysUserMapper.updateByExample(record, example);
    }

    /**
     * 根据主键更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKeySelective(SysUser record) throws RuntimeException{
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKey(SysUser record) throws RuntimeException{
        return sysUserMapper.updateByPrimaryKey(record);
    }
    
}
