package com.xiaok.search.service;


import top.catalinali.common.pojo.SearchResult;

/**
 * <pre>
 * Description: 搜索服务层
 * Author:		xiaok
 * Version:		1.0
 * </pre>
 */
public interface SearchService {
    SearchResult search(String keyword, int page, int rows)  throws Exception;
}
