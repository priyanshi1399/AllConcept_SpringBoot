package com.priyanshi.SpringBootAsync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig implements AsyncConfigurer {

    private ThreadPoolExecutor poolExecutor;

   // @Bean(name="myThreadPoolExecutor")
    @Override
    public synchronized  Executor getAsyncExecutor(){

        int minPoolSize=2;
        int maxPoolSize=4;
        int queueSize=3;

        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(minPoolSize,maxPoolSize,
                1, TimeUnit.HOURS,new ArrayBlockingQueue<>(queueSize),new customThreadFactory());
        return poolExecutor;
    }
/*public class AppConfig {
    @Bean(name="myThreadPoolExecutor")
    public Executor taskPoolExecutor(){

        int minPoolSize=2;
        int maxPoolSize=4;
        int queueSize=3;

            /*
        ThreadPoolTaskExecutor poolTaskExecutor=new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(minPoolSize);
        poolTaskExecutor.setMaxPoolSize(maxPoolSize);
        poolTaskExecutor.setQueueCapacity(queueSize);
        poolTaskExecutor.setThreadNamePrefix("My Thread-");
        poolTaskExecutor.initialize();;
        return poolTaskExecutor;
             */
        /*
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(minPoolSize,maxPoolSize,
                1, TimeUnit.HOURS,new ArrayBlockingQueue<>(queueSize),new customThreadFactory());
        return poolExecutor;
    }*/
    class customThreadFactory implements ThreadFactory{

        private final AtomicInteger threadNo=new AtomicInteger(1);
        @Override
        public Thread newThread(Runnable r){
            Thread thread=new Thread(r);
            thread.setName("MyThread-"+threadNo.getAndIncrement());
            return thread;
        }
    }
}
