package com.longtao.docekrdemo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName:User
 * @Description:代码即注释
 * @Author:taoLong
 * @Date:2022/6/18:21:38 星期六
 */
@Accessors(chain = true)
@Builder
@Data
public class User {

    private String name;

    private Integer age;

    private String desc;
}
