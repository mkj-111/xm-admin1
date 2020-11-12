package com.jk.pojo;

import com.alibaba.fastjson.parser.ParserConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration //配置
public class RedisConfiguration {

    /**
     * 自定义RedisTemplate的bean，不使用默认的RedisTemplate
     * redisTemplate 默认序列化使用的jdkSerializeable, 存储二进制字节码, 所以自定义序列化类
     *
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        //使用fastjson序列化
        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        // value值的序列化采用fastJsonRedisSerializer
        template.setValueSerializer(fastJsonRedisSerializer);
        template.setHashValueSerializer(fastJsonRedisSerializer);
        // key的序列化采用StringRedisSerializer
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
<<<<<<< HEAD
        ParserConfig.getGlobalInstance().addAccept("com.jk.entity"); // 指定自己的实体类包
=======
<<<<<<< HEAD
>>>>>>> 00b6fd6394c81560332f51f334c6a3cb9ea1c7ad
        ParserConfig.getGlobalInstance().addAccept("com.jk.mkj.entity"); // 指定自己的实体类包
=======
        ParserConfig.getGlobalInstance().addAccept("com.jk.entity"); // 指定自己的实体类包
>>>>>>> 34f44c2516e6597e387322be1f0791f2002f6cdd
        return template;
    }

}
