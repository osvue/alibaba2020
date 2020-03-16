package com.qiangzi.springcloud.payment.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiangzi.springcloud.payment.mapper.OauthClientDetailsMapper;
import com.qiangzi.springcloud.commons.domain.OauthClientDetails;
/**
 * @author THE GIFTED
 */
@Service
public class OauthClientDetailsService extends ServiceImpl<OauthClientDetailsMapper, OauthClientDetails> implements IOauthClientDetailsService {

}
