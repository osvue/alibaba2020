package com.qiangzi.springcloud.payment.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiangzi.springcloud.commons.domain.User;
import com.qiangzi.springcloud.payment.mapper.UserMapper;
import org.springframework.stereotype.Service;
/**
 * @author THE GIFTED
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {


}
