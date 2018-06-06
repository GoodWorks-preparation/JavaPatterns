package com.boonya.pattern.application.responsibility;

/**
 * @ClassName: Result
 * @Description: TODO(处理结果)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Result {
    public boolean isRatify;
    public String info;

    public Result() {

    }

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean isRatify) {
        this.isRatify = isRatify;
    }

    public String getReason() {
        return info;
    }

    public void setReason(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result [isRatify=" + isRatify + ", info=" + info + "]";
    }
}
