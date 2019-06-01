package org.hackerandpainter.springbootrestful.common;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-31 22:12
 **/
public enum  EventEnum {

    CHAT_REQ(0), // 单聊消息任务
    GROUP_CHAT_REQ(1), // 群聊消息任务
    HEART_BEAT_REQ(2) // 心跳任务
    ;

    private int value;

    EventEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
