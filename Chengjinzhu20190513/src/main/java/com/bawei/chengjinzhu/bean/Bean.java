package com.bawei.chengjinzhu.bean;

import java.util.List;

/*作者:程金柱
 *时间:2019年5月13日09:20:27
 * 功能:Bean包
 */
public class Bean {
    private String title;
    private String desc;
    private List<String> image;

    public Bean(String title, String desc, List<String> image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public Bean() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}
