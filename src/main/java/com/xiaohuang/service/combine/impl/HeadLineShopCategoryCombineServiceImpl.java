package com.xiaohuang.service.combine.impl;

import com.xiaohuang.entity.bo.HeadLine;
import com.xiaohuang.entity.bo.ShopCategory;
import com.xiaohuang.entity.dto.MainPageInfoDTO;
import com.xiaohuang.entity.dto.Result;
import com.xiaohuang.service.combine.HeadLineShopCategoryCombineService;
import com.xiaohuang.service.solo.HeadLineService;
import com.xiaohuang.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Service;
import org.simpleframework.inject.annotation.Autowired;

import java.util.List;

@Service
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    @Autowired
    private HeadLineService headLineService;
    @Autowired
    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        // get the headline list
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> HeadLineResult = headLineService.queryHeadLine(headLineCondition, 1, 4);

        // get the shop category list
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);

        // return two
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(HeadLineResult, shopCategoryResult);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
