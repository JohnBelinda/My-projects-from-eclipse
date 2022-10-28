package RupeekFrame.RueekFramework.repo.api.impl;

import RupeekFrame.RueekFramework.domain.UmsUser;
import RupeekFrame.RueekFramework.repo.api.UmsUserRepository;
import RupeekFrame.RueekFramework.repo.mapper.UmsUserMapper;
import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {
}
