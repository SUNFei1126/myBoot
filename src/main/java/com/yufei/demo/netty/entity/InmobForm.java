package com.yufei.demo.netty.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author sunyufei
 * @desc inmobi曝光，点击链接参数
 */
@Data
public class InmobForm {

    @NotBlank(message = "广告信息相关的回调参数不能为空")
    private String callback;

    @NotBlank(message = "广告请求唯一 ID不能为空")
    private String req_id;

    @NotBlank(message = "iOS 设备的 IDFA 值不能为空")
    private String idfa;

    @NotBlank(message = "IMEI 值不能为空")
    private String imei_md5;

    @NotBlank(message = "OAID 值不能为空")
    private String oaid;


    private String os;

    private String ua;

    private String ip;
}
