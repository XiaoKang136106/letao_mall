package com.xiaok.sso.service;

import com.xiaok.common.pojo.TaotaoResult;
import com.xiaok.pojo.TbUser;

public interface RegisterService {

    TaotaoResult checkData(String param, int type);
    TaotaoResult register(TbUser user);
}
