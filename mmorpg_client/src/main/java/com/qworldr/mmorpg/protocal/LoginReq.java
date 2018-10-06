package com.qworldr.mmorpg.protocal;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.qworldr.mmorpg.annotation.Protocal;

@Protocal(ProtocalId.LoginReq)
@ProtobufClass
public class LoginReq {
    @Protobuf
    private String account;
    @Protobuf
    private String pwd;

    public String getAccount() {
        return account;
    }

    public String getPwd() {
        return pwd;
    }
}
