package com.boonya.pattern.application.responsibility;

/**
 * @ClassName: CustomInterceptor
 * @Description: TODO(功能描述：自定义'责任人')
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class CustomInterceptor implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("CustomInterceptor=>" + request.toString());
        String reason = request.reason();
        if (reason != null && reason.equals("事假")) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setCustomInfo(request.name() + "请的是事假，而且很着急，请领导重视一下")
                    .build();
            System.out.println("CustomInterceptor=>转发请求");
            return chain.proceed(newRequest);
        }
        return new Result(true, "同意请假");
    }

}