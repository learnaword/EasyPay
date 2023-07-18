package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.PayConfigDO;
import generator.service.PayConfigService;
import generator.mapper.PayConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author majunliang
* @description 针对表【pay_config】的数据库操作Service实现
* @createDate 2023-07-18 05:41:35
*/
@Service
public class PayConfigServiceImpl extends ServiceImpl<PayConfigMapper, PayConfigDO>
    implements PayConfigService{

}




