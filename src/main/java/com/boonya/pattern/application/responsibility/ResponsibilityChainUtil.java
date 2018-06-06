package com.boonya.pattern.application.responsibility;

import java.util.ArrayList;

/**
 * @ClassName: ResponsibilityChainUtil
 * @Description: TODO(功能描述：责任链模模式工具类)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class ResponsibilityChainUtil {

    private ArrayList<Ratify> ratifies;

    public ResponsibilityChainUtil() {
        ratifies = new ArrayList<Ratify>();
    }

    /**
     * 方法描述：为了展示“责任链模式”的真正的迷人之处（可扩展性），在这里构造该方法以便添加自定义的“责任人”
     *
     * @param ratify
     */
    public void addRatifys(Ratify ratify) {
        ratifies.add(ratify);
    }

    /**
     * 方法描述：执行请求
     *
     * @param request
     * @return
     */
    public Result execute(Request request) {
        ArrayList<Ratify> arrayList = new ArrayList<Ratify>();
        arrayList.addAll(ratifies);
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());

        ResponsibilityChain realChain = new ResponsibilityChain(arrayList, request, 0);
        return realChain.proceed(request);
    }
}
