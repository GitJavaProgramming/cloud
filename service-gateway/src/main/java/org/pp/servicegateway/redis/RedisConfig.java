package org.pp.servicegateway.redis;

/**
 * reids 相关bean的配置
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 * <p>
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 * <p>
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 * <p>
 * 对spring-redis对redis的五种数据类型也有支持
 * <p>
 * HashOperations：对hash类型的数据操作
 * <p>
 * ValueOperations：对redis字符串类型数据操作
 * <p>
 * ListOperations：对链表类型的数据操作
 * <p>
 * SetOperations：对无序集合类型的数据操作
 * <p>
 * ZSetOperations：对有序集合类型的数据操作
 */

/**
 * spring-redis中使用了RedisTemplate来进行redis的操作，通过泛型的K和V设置键值对的对象类型。这里使用了string作为key的对象类型，值为Object。
 *
 * 对于Object，spring-redis默认使用了jdk自带的序列化，不推荐使用默认了。所以使用了json的序列化方式
 *
 * 对spring-redis对redis的五种数据类型也有支持
 *
 * HashOperations：对hash类型的数据操作
 *
 * ValueOperations：对redis字符串类型数据操作
 *
 * ListOperations：对链表类型的数据操作
 *
 * SetOperations：对无序集合类型的数据操作
 *
 * ZSetOperations：对有序集合类型的数据操作
 *
 */

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

/**
 * redis 相关bean的配置
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * 选择redis作为默认缓存工具
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(1)); // 设置缓存有效期一小时
        return RedisCacheManager
                .builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory))
                .cacheDefaults(redisCacheConfiguration).build();
    }

    /**
     * redisTemplate相关配置
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 配置连接工厂
        template.setConnectionFactory(factory);

        //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）
        Jackson2JsonRedisSerializer jacksonSeial = new Jackson2JsonRedisSerializer(Object.class);

        ObjectMapper om = new ObjectMapper();
        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会跑出异常
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jacksonSeial.setObjectMapper(om);

        // 值采用json序列化
        template.setValueSerializer(jacksonSeial);
        //使用StringRedisSerializer来序列化和反序列化redis的key值
        template.setKeySerializer(new StringRedisSerializer());

        // 设置hash key 和value序列化模式
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(jacksonSeial);
        template.afterPropertiesSet();

        return template;
    }

    /**
     * 对hash类型的数据操作
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public HashOperations<String, String, Object> hashOperations(RedisTemplate<String, Object> redisTemplate) {
        return redisTemplate.opsForHash();
    }

    /**
     * 对redis字符串类型数据操作
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public ValueOperations<String, Object> valueOperations(RedisTemplate<String, Object> redisTemplate) {
        return redisTemplate.opsForValue();
    }

    /**
     * 对链表类型的数据操作
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public ListOperations<String, Object> listOperations(RedisTemplate<String, Object> redisTemplate) {
        return redisTemplate.opsForList();
    }

    /**
     * 对无序集合类型的数据操作
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public SetOperations<String, Object> setOperations(RedisTemplate<String, Object> redisTemplate) {
        return redisTemplate.opsForSet();
    }

    /**
     * 对有序集合类型的数据操作
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public ZSetOperations<String, Object> zSetOperations(RedisTemplate<String, Object> redisTemplate) {
        return redisTemplate.opsForZSet();
    }
}