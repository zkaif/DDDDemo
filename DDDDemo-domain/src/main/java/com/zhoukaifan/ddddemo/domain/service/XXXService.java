package com.zhoukaifan.ddddemo.domain.service;

/**
 * 这个service会在domain层实现，用于处理与两个领域都不想干的业务
 * 比如两个账户间转账，这种放在任何一个中都不太对所以可以抽象一个转账处理器的service
 * 但是应该尽可能把业务写到领域对象中
 */
public interface XXXService {
}
