/*    */ package com.wanniu.game.request.guild;
/*    */ 
/*    */ import com.wanniu.core.game.entity.GClientEvent;
/*    */ import com.wanniu.core.game.protocol.PomeloRequest;
/*    */ import com.wanniu.core.game.protocol.PomeloResponse;
/*    */ import com.wanniu.game.player.WNPlayer;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import pomelo.area.GuildHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GClientEvent("area.guildHandler.getGuildRecordRequest")
/*    */ public class GetGuildRecordHandler
/*    */   extends PomeloRequest
/*    */ {
/*    */   public PomeloResponse request() throws Exception {
/* 19 */     final WNPlayer player = (WNPlayer)this.pak.getPlayer();
/* 20 */     GuildHandler.GetGuildRecordRequest req = GuildHandler.GetGuildRecordRequest.parseFrom(this.pak.getRemaingBytes());
/* 21 */     final int page = req.getPage();
/* 22 */     return new PomeloResponse()
/*    */       {
/*    */         protected void write() throws IOException {
/* 25 */           GuildHandler.GetGuildRecordResponse.Builder res = GuildHandler.GetGuildRecordResponse.newBuilder();
/* 26 */           List<GuildHandler.RecordInfo> recordList = player.guildManager.getGuildRecordList(page);
/* 27 */           res.setS2CCode(200);
/* 28 */           res.setS2CPage(page);
/* 29 */           res.addAllS2CRecordList(recordList);
/* 30 */           this.body.writeBytes(res.build().toByteArray());
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\request\guild\GetGuildRecordHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */