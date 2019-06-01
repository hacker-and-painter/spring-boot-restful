package org.hackerandpainter.springbootrestful;

import lombok.extern.slf4j.Slf4j;
import org.hackerandpainter.springbootrestful.common.EventEnum;
import org.hackerandpainter.springbootrestful.service.ITask;
import org.hackerandpainter.springbootrestful.service.impl.ChatTask;
import org.hackerandpainter.springbootrestful.service.impl.GroupChatTask;
import org.hackerandpainter.springbootrestful.service.impl.HeatBeatTask;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-31 22:09
 **/
@Component
@Slf4j
public class TaskManager {

    private static TaskManager instance;

    public Map<Integer, ITask> taskMap = new HashMap<Integer, ITask>();

    public static TaskManager getInstance() {
        return instance;
    }

    public ITask getTask(int operation) {
        return taskMap.get(operation);
    }

    /**
     * 初始化处理过程
     */
    @PostConstruct
    private void init() {
        log.info("init task manager");
        instance = new TaskManager();
        // 单聊消息任务
        instance.taskMap.put(EventEnum.CHAT_REQ.getValue(), new ChatTask());
        // 群聊消息任务
        instance.taskMap.put(EventEnum.GROUP_CHAT_REQ.getValue(), new GroupChatTask());
        // 心跳任务
        instance.taskMap.put(EventEnum.HEART_BEAT_REQ.getValue(), new HeatBeatTask());
    }
}
