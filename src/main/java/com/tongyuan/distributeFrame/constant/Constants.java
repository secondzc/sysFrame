package com.tongyuan.distributeFrame.constant;

import com.tongyuan.distributeFrame.util.InstanceUtil;

import java.util.Map;

/**
 * Created by zhangcy on 2018/2/12
 */
public interface Constants {
     String CURRENT_USER  = "CURRENT_USER";
     String EXCPETION_HEAD = "SOME ERRORS OCCURED! AS FOLLOWS :";
     /* 解决按类型缓存和按名缓存键的问题 */
     Map<Class<?>, String> CACHE_KEY_MAP = InstanceUtil.newHashMap();
     String ALL_USER_NUMBER = "ALL_USER_NUMBER";
     String CACHE_NAMESPACE = "CACHE_NAMESPACE:";
}
