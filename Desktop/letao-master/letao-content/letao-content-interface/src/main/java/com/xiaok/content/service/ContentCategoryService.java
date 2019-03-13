package com.xiaok.content.service;

import top.catalinali.common.pojo.EUTreeNode;
import top.catalinali.common.pojo.TaotaoResult;

import java.util.List;

/**
 * <pre>
 * Description:
 * Copyright:	Copyright (c)2017
 * Author:		lllx
 * Version:		1.0
 * Created at:	2017/10/19
 * </pre>
 */
public interface ContentCategoryService {
    /**
     * 查询内容分类
     * @param parentId
     * @return
     */
    List<EUTreeNode> getContentCatList(long parentId);

    TaotaoResult addContentCategory(long parentId, String name);
}






