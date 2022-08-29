package com.macro.mall.tiny.nosql.mongodb.repository;

import com.macro.mall.tiny.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @class: MemberReadHistoryRepository
 * @description: 会员商品浏览历史Repository
 * @author: cyy
 * @create: 2022-08-11 22:26
 **/
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, Long> {

    /**
     * 根据会员ID时间倒序获取浏览记录
     * @param memberId 会员id
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
