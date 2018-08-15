package com.dxt.fiction.service.impl;

import com.dxt.fiction.entity.User;
import com.dxt.fiction.mapper.UserMapper;
import com.dxt.fiction.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dingxu
 * @since 2018-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
