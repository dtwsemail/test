package stock.cache.impl;

import stock.common.constant.EnumLocalCache;
import stock.utils.AssertUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lemon on 9/5/16.
 */
public class LocalCache<E> {

    private static final Map<EnumLocalCache, Object> totalMap = new HashMap<EnumLocalCache, Object>();
    public static final Object lock = new Object();


    public static final <E> ConcurrentHashMap<String, E> getInstance(EnumLocalCache key) {

        AssertUtil.assertNotNull(key, "Key can not be empty for Local Cache");

        ConcurrentHashMap<String, E> result = null;

        if (null == totalMap.get(key)) {
            synchronized (lock) {
                if (totalMap.get(key) == null) {
                    totalMap.put(key, new ConcurrentHashMap<String, E>());
                }
            }
        }

        return (ConcurrentHashMap<String, E>) totalMap.get(key);
    }

    public static final <E> E get(EnumLocalCache cacheKey, String key) {
        ConcurrentHashMap<String, E> map = getInstance(cacheKey);
        return map.get(key);
    }

    public static final <E> void put(EnumLocalCache cacheKey, String key, E value) {
        ConcurrentHashMap<String, E> map = getInstance(cacheKey);
        map.putIfAbsent(key, value);
    }

    public static boolean hitCache(EnumLocalCache cacheKey, String key) {
        ConcurrentHashMap map = getInstance(cacheKey);
        return map.get(key) != null;
    }
}
