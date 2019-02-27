package com.google.designpattern.structural.facade.demoone.service;

import com.google.designpattern.structural.facade.demoone.entity.PointsGift;
import lombok.extern.slf4j.Slf4j;

/******************************
 * @author : liuyang
 * <p>ProjectName:design_pattern  </p>
 * @ClassName :  QualifyService
 * @date : 2019/2/27 0027
 * @time : 17:18
 * @createTime 2019-02-27 17:18
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Slf4j
public class QualifyService {

    /**
     * 效验积分是否足够
     *
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift) {
        log.info("效验:" + pointsGift.getName() + " 积分资格通过,库存通过");

        return true;
    }

}
