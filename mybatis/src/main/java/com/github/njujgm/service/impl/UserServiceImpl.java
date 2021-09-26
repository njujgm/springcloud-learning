package com.github.njujgm.service.impl;

import com.github.njujgm.entity.User;
import com.github.njujgm.mapper.UserMapper;
import com.github.njujgm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jugaoming
 * @since 2021-06-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
