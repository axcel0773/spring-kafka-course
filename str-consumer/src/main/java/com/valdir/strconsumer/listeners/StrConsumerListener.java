package com.valdir.strconsumer.listeners;

import com.valdir.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(gorupId = "group-1")
    public void listener(String message) {
        log.info("CREATE ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(gorupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(gorupId = "group-2")
    public void history(String message) {
        log.info("HISTORY ::: Receive message {}", message);
    }


}
