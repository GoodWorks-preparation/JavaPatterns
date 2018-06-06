package com.boonya.pattern.application.responsibility;

/**
 * @ClassName: Ratify
 * @Description: TODO(批准处理)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public interface Ratify {
    // 处理请求
    public Result deal(Chain chain);
}
