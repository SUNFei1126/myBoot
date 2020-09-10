package com.yufei.demo.netty;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yufei.demo.netty.entity.DeviceInfoBo;
import lombok.Data;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class NettyDemoApplicationTests {

    @Test
    void contextLoads() {
        String s = "00000000-0000-0000-0000-000000000000";

        System.out.println(s.length());

        Info info = new Info();
        info.setName("aaa");
        String jsonString = JSON.toJSONString(info);
        Info info1 = JSONObject.parseObject(jsonString, Info.class);
        System.out.println(info1);

        DeviceInfoBo infoBo = DeviceInfoBo.builder()
                .deviceType("IOS")
                .idfa("AAAAAAAAA")
                .imei("1111111111")
                .oaid("OOOOOOOOO")
                .userAgent("s")
                .ip("1.1.1.1")
                .appVersionCode("1.0")
                .appVersionName("YXH")
                .systemBrand("xiaomi")
                .systemModel("mi10")
                .systemPhone("10.1")
                .build();
        String string = JSON.toJSONString(infoBo);
        System.out.println(string);

        String ss= "{\"app_version_code\":\"1.0\",\"app_version_name\":\"YXH\",\"device_type\":\"IOS\",\"idfa\":\"AAAAAAAAA\",\"imei\":\"1111111111\",\"ip\":\"1.1.1.1\",\"oaid\":\"OOOOOOOOO\",\"system_brand\":\"xiaomi\",\"system_model\":\"mi10\",\"system_phone\":\"10.1\",\"user_agent\":\"s\"}";
        DeviceInfoBo deviceInfoBo = JSONObject.parseObject(ss, DeviceInfoBo.class);
        System.out.println(deviceInfoBo);

        String deviceInfo = "{\n" +
                "    \"app_version_code\":\"1.0\",\n" +
                "    \"app_version_name\":\"YXH\",\n" +
                "    \"device_type\":\"IOS\",\n" +
                "    \"idfa\":\"AAAAAAAAA\",\n" +
                "    \"imei\":\"1111111111\",\n" +
                "    \"ip\":\"1.1.1.1\",\n" +
                "    \"oaid\":\"OOOOOOOOO\",\n" +
                "    \"system_brand\":\"xiaomi\",\n" +
                "    \"system_model\":\"mi10\",\n" +
                "    \"system_phone\":\"10.1\",\n" +
                "    \"user_agent\":\"s\"\n" +
                "}";
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", "");
        map.put("opType", "1");
        map.put("param", "");
        map.put("deviceInfo", deviceInfo);
        String jsonString1 = JSON.toJSONString(map);
        System.out.println(jsonString1);
    }



    @Data
    public static class Info{
        private String name;
        private String book;
    }

}
