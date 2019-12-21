package com.zero.patterndesign.adapter_design.objectadapter;

import com.zero.patterndesign.adapter_design.classadapter.Banner;

/**
 * @Description
 * @Author ztqup666
 * @Since 2019/12/1 15:10
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
