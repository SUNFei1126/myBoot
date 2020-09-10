package com.yufei.demo.netty.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: sunyufei
 * @Date: 2020/9/8 10:33 上午
 * @Desc: 移动设备信息
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfoBo {

    /**
     * 设备类型(Android/IOS)
     */
//    @JsonProperty("device_type")
    private String deviceType;

    /**
     * 	IOS为必传项
     */
    private String idfa;

    /**
     * 安卓为必传项
     */
    private String imei;

    /**
     * 	oaid 安卓使用
     */
    private String oaid;

    /**
     * 移动客户端 Webview UA
     */
//    @JsonProperty("user_agent")
    private String userAgent;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 软件版本code
     */
//    @JsonProperty("app_version_code")
    private String appVersionCode;

    /**
     * 软件版本name
     */
//    @JsonProperty("app_version_name")
    private String appVersionName;

    /**
     * 手机品牌
     */
//    @JsonProperty("system_brand")
    private String systemBrand;

    /**
     * 手机型号
     */
//    @JsonProperty("system_model")
    private String systemModel;

    /**
     * 手机系统版本
     */
//    @JsonProperty("system_phone")
    private String systemPhone;
    

}
