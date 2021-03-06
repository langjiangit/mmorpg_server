package com.qworldr.mmorpg.logic.player.protocal;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import com.qworldr.mmorpg.annotation.Protocal;
import com.qworldr.mmorpg.common.protocal.ProtocalId;
import com.qworldr.mmorpg.logic.player.protocal.vo.PlayerInfo;

import java.util.List;

/**
 * @author wujiazhen
 */
@Protocal(ProtocalId.RoleListResp)
public class RoleListResp {
    @Protobuf
    private List<PlayerInfo> playerInfos;

    public List<PlayerInfo> getPlayerInfos() {
        return playerInfos;
    }

    public void setPlayerInfos(List<PlayerInfo> playerInfos) {
        this.playerInfos = playerInfos;
    }
}
