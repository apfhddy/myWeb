package main.tables.library.redis;

import java.time.Duration;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class RedisService {
    private final RedisTemplate<String, String> redisTemplate;
 
    public String getRedisTemplateValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }
 
    public void deleteRedisTemplateValue(String key) {
        redisTemplate.delete(key);
    }
 
    public void setRedisTemplate(String key, String value, long time) {
        if (getRedisTemplateValue(key) != null) {
            deleteRedisTemplateValue(key);
        }
 
        Duration expiredDuration = Duration.ofMillis(time);
        redisTemplate.opsForValue().set(key, value, expiredDuration);
    }
}