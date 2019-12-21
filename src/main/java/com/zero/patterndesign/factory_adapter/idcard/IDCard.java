package com.zero.patterndesign.factory_adapter.idcard;

import com.zero.patterndesign.factory_adapter.framework.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 15:02
 */
@Accessors(chain = true)
public class IDCard extends Product {
    @Getter
    @Setter
    private String owner;

    @Getter
    @Setter
    private String number;

     IDCard(String owner, String number) {
        System.out.println("制作 " + owner + " 的ID" + number +  "卡");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID" + number +  "卡");
    }

}
