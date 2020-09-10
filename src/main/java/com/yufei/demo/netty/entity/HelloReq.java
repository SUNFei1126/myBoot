package com.yufei.demo.netty.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HelloReq {
    @JsonProperty(value = "req_id")
    private  String reqId;
    @JsonProperty(value = "callback")
    private  String callBackParams;
}
