package com.boonya.pattern.application.responsibility;

import java.util.List;

/**
 * @ClassName: ResponsibilityChain
 * @Description: TODO(功能描述:实现Chain的真正的包装Request和转发功能  )
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class ResponsibilityChain  implements Chain {
    public Request request;
    public List<Ratify> ratifyList;
    public int index;

    /**
     * 构造方法
     *
     * @param ratifyList
     *            Ratify接口的实现类集合
     * @param request
     *            具体的请求Request实例
     * @param index
     *            已经处理过该request的责任人数量
     */
    public ResponsibilityChain(List<Ratify> ratifyList, Request request, int index) {
        this.ratifyList = ratifyList;
        this.request = request;
        this.index = index;
    }

    /**
     * 方法描述：具体转发功能
     */
    @Override
    public Result proceed(Request request) {
        Result proceed = null;
        if (ratifyList.size() > index) {
            ResponsibilityChain realChain = new ResponsibilityChain(ratifyList, request, index + 1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.deal(realChain);
        }

        return proceed;
    }

    /**
     * 方法描述：返回当前Request对象或者返回当前进行包装后的Request对象
     */
    @Override
    public Request request() {
        return request;
    }

}
