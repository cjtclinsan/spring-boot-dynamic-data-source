package com.gupaoedu.service.impl;

import com.gupaoedu.datasource.TargetDataSource;
import com.gupaoedu.datasource.DataSourceNames;
import com.gupaoedu.entity.SysUser;
import com.gupaoedu.mapper.SysUserMapper;
import com.gupaoedu.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserByFirstDb(long id) {
        return this.baseMapper.selectById(id);
    }

    @TargetDataSource(name = DataSourceNames.SECOND)
    @Override
    public SysUser findUserBySecondDb(long id) {

        return this.baseMapper.selectById(id);
    }

}
