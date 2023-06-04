package org.IT.service.serviceImp;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.IT.Entity.bookinfo;
import org.IT.mapper.BookinfoMapper;
import org.IT.service.BookinfoService;
import org.springframework.stereotype.Service;

@Service("BookinfoService")
public class bookinfoServiceImpl extends ServiceImpl<BookinfoMapper, bookinfo> implements BookinfoService {
}
