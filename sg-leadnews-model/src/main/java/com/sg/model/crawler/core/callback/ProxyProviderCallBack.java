package com.sg.model.crawler.core.callback;


import com.sg.model.crawler.core.proxy.CrawlerProxy;

import java.util.List;

/**
 * IP池更新回调
 */
public interface ProxyProviderCallBack {
    List<CrawlerProxy> getProxyList();
}