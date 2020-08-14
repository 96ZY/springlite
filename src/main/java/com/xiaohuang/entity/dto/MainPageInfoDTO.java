package com.xiaohuang.entity.dto;

import com.xiaohuang.entity.bo.HeadLine;
import com.xiaohuang.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
