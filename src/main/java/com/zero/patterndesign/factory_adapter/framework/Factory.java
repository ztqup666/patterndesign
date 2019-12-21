package com.zero.patterndesign.factory_adapter.framework;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/15 14:59
 */
public abstract class Factory {
    public final Product create(String owner, String number) {
        Product product = createProduct(owner, number);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner, String number);

    /*
    第二种实现制造产品类的方法，这样，如果没有在子类中实现该方法，程序就会运行时出错
    public Product createProduct(String owner){
        throw new Exception("")
    }*/

    protected abstract void registerProduct(Product product);
}
