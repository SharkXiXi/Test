package org.IT.service.serviceImp;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.IT.mapper.bcMapper;
import org.IT.Entity.bc;
import org.IT.service.bcService;
import org.springframework.stereotype.Service;

@Service("bcService")
public class bcServiceImpl extends ServiceImpl<bcMapper,bc> implements bcService {}
