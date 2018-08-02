package com.boonya.pattern.runoob.visitor;

/**
 * @ClassName: ComputerPart
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
