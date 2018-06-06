package com.boonya.pattern.application.responsibility;

/**
 * @ClassName: Chain
 * @Description: TODO(功能描述:对request和Result封装，用来转发)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public interface Chain {

    // 获取当前request
    Request request();

    // 转发request
    Result proceed(Request request);
}
