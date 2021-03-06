package com.wanniu.game.request.xianyuan;

import com.wanniu.core.game.LangService;
import com.wanniu.core.game.entity.GClientEvent;
import com.wanniu.core.game.protocol.PomeloRequest;
import com.wanniu.core.game.protocol.PomeloResponse;
import com.wanniu.game.common.Const;
import com.wanniu.game.common.msg.ErrorResponse;
import com.wanniu.game.player.WNPlayer;
import com.wanniu.game.xianyuan.XianYuanService;

import java.io.IOException;

import pomelo.xianyuan.XianYuanHandler;


@GClientEvent("xianyuan.xianYuanHandler.applyXianYuanRequest")
public class ApplyXianYuanHandler
        extends PomeloRequest {
    public PomeloResponse request() throws Exception {
        final WNPlayer player = (WNPlayer) this.pak.getPlayer();
        if (!player.functionOpenManager.isOpen(Const.FunctionType.XIAN_YUAN.getValue())) {
            return (PomeloResponse) new ErrorResponse(LangService.getValue("XIAN_YUAN_NOT_OPEN"));
        }

        return new PomeloResponse() {
            protected void write() throws IOException {
                XianYuanHandler.XianYuanResponse.Builder res = XianYuanHandler.XianYuanResponse.newBuilder();

                XianYuanService.getInstance().applyXianYuanGetInfo(player, res);
                this.body.writeBytes(res.build().toByteArray());
            }
        };
    }
}


