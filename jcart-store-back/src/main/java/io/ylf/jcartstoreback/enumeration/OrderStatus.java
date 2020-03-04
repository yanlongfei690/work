package io.ylf.jcartstoreback.enumeration;

public enum OrderStatus {

    ToProcess,//待处理
    Processing,//处理中
    ToShip,//待发货
    Shipped,//已发货
    ToReceive,//待签收
    Received,//已签收
    ToPay,//待支付
    Paid,//已支付
    Cancel,//取消
    Denied,//拒绝
    Completed,//完成
    ToComment,//待评价
    Commented//已评价
}
