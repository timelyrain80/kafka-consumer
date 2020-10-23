package pub.timelyrain.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @KafkaListener(topics = "cdctest")
    public void onMessage(String message) {
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(message);
    }

}