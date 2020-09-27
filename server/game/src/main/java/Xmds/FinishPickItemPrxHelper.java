/*    */ package Xmds;
/*    */ 
/*    */ import Ice.ObjectPrx;
/*    */ import Ice.ObjectPrxHelperBase;
/*    */ import IceInternal.BasicStream;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FinishPickItemPrxHelper
/*    */   extends ObjectPrxHelperBase
/*    */   implements FinishPickItemPrx
/*    */ {
/*    */   public static FinishPickItemPrx checkedCast(ObjectPrx __obj) {
/* 30 */     return (FinishPickItemPrx)checkedCastImpl(__obj, ice_staticId(), FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx checkedCast(ObjectPrx __obj, Map<String, String> __ctx) {
/* 35 */     return (FinishPickItemPrx)checkedCastImpl(__obj, __ctx, ice_staticId(), FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx checkedCast(ObjectPrx __obj, String __facet) {
/* 40 */     return (FinishPickItemPrx)checkedCastImpl(__obj, __facet, ice_staticId(), FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx checkedCast(ObjectPrx __obj, String __facet, Map<String, String> __ctx) {
/* 45 */     return (FinishPickItemPrx)checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx uncheckedCast(ObjectPrx __obj) {
/* 50 */     return (FinishPickItemPrx)uncheckedCastImpl(__obj, FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx uncheckedCast(ObjectPrx __obj, String __facet) {
/* 55 */     return (FinishPickItemPrx)uncheckedCastImpl(__obj, __facet, FinishPickItemPrx.class, FinishPickItemPrxHelper.class);
/*    */   }
/*    */   
/* 58 */   public static final String[] __ids = new String[] { "::Ice::Object", "::Xmds::FinishPickItem" };
/*    */ 
/*    */   
/*    */   public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */   
/*    */   public static String ice_staticId() {
/* 66 */     return __ids[1];
/*    */   }
/*    */ 
/*    */   
/*    */   public static void __write(BasicStream __os, FinishPickItemPrx v) {
/* 71 */     __os.writeProxy(v);
/*    */   }
/*    */ 
/*    */   
/*    */   public static FinishPickItemPrx __read(BasicStream __is) {
/* 76 */     ObjectPrx proxy = __is.readProxy();
/* 77 */     if (proxy != null) {
/*    */       
/* 79 */       FinishPickItemPrxHelper result = new FinishPickItemPrxHelper();
/* 80 */       result.__copyFrom(proxy);
/* 81 */       return result;
/*    */     } 
/* 83 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\Xmds\FinishPickItemPrxHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */