package com.wanniu.game.request.guild;

import com.wanniu.core.game.LangService;
import com.wanniu.core.game.entity.GClientEvent;
import com.wanniu.core.game.protocol.PomeloRequest;
import com.wanniu.core.game.protocol.PomeloResponse;
import com.wanniu.game.guild.GuildResult;
import com.wanniu.game.player.WNPlayer;

import java.io.IOException;

import pomelo.area.GuildHandler;


@GClientEvent("area.guildHandler.impeachGuildPresidentRequest")
public class ImpeachGuildPresidentHandler
        extends PomeloRequest {
    public PomeloResponse request() throws Exception {
        final WNPlayer player = (WNPlayer) this.pak.getPlayer();
        return new PomeloResponse() {
            protected void write() throws IOException {
                GuildHandler.ImpeachGuildPresidentResponse.Builder res = GuildHandler.ImpeachGuildPresidentResponse.newBuilder();
                GuildResult resData = player.guildManager.impeachGuildPresident();
                int result = resData.result;
                if (result == 0) {
                    res.setS2CCode(200);
                    res.setIsNew(resData.isNew);
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -1) {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("GUILD_NOT_JOIN"));
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -2) {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("GUILD_CANNOT_IMPEACH_SELF"));
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -3) {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("GUILD_PRESIDENT_IS_ONLINE"));
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -4) {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("SOMETHING_ERR"));
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -5) {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("SOMETHING_ERR"));
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -6) {
                    res.setS2CCode(500);
                    res.setS2CMsg(resData.des);
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                if (result == -7) {
                    res.setS2CCode(500);
                    res.setS2CMsg(resData.des);
                    this.body.writeBytes(res.build().toByteArray());
                    return;
                }
                res.setS2CCode(500);
                res.setS2CMsg(LangService.getValue("SOMETHING_ERR"));
                this.body.writeBytes(res.build().toByteArray());
            }
        };
    }
}


