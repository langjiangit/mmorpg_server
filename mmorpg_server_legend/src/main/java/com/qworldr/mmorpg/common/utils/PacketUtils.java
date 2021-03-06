package com.qworldr.mmorpg.common.utils;

import com.qworldr.mmorpg.logic.map.Region;
import com.qworldr.mmorpg.logic.map.object.MapObject;
import com.qworldr.mmorpg.logic.player.Player;
import com.qworldr.mmorpg.session.TcpSession;

import java.util.Map;

/**
 * @author wujiazhen
 */
public class PacketUtils {

    public static void sendPacket(TcpSession session, Object packet) {
        session.getChannel().writeAndFlush(packet);
    }

    public static void sendPacket(Player player, Object packet) {
        sendPacket(player.getSession(), packet);
    }

    /**
     * 发送广播给九宫格区域中除了自己的所有玩家。
     * @param mapObject  触发广播的对象，可能时是玩家，也可能是怪物等。
     * @param packet
     */
    public static void sendRegionPacket(MapObject mapObject, Object packet) {
        Map<Long, Player> players = mapObject.getRegion().getPlayers();
        players.forEach((k, p) -> {
            if (p.equals(mapObject)) {
                return;
            }
            sendPacket(p, packet);
        });
    }
}
