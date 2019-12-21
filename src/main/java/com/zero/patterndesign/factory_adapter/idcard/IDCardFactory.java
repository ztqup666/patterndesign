package com.zero.patterndesign.factory_adapter.idcard;

import com.zero.patterndesign.factory_adapter.framework.Factory;
import com.zero.patterndesign.factory_adapter.framework.Product;
import lombok.Getter;

import java.util.*;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 15:05
 */
public class IDCardFactory extends Factory {
    @Getter
    private List owners = new ArrayList();

    private Map<String,String> map = new HashMap<String, String>();

    @Override
    public Product createProduct(String owner, String number) {
        IDCard idCard = new IDCard(owner, number);
        map.putIfAbsent(owner, number);
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
