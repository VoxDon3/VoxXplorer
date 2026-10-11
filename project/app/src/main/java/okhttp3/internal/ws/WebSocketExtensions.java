/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.internal.Util;

public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean bl, Integer n8, boolean bl2, Integer n9, boolean bl3, boolean bl4) {
        this.perMessageDeflate = bl;
        this.clientMaxWindowBits = n8;
        this.clientNoContextTakeover = bl2;
        this.serverMaxWindowBits = n9;
        this.serverNoContextTakeover = bl3;
        this.unknownValues = bl4;
    }

    public /* synthetic */ WebSocketExtensions(boolean bl, Integer n8, boolean bl2, Integer n9, boolean bl3, boolean bl4, int n10, g g8) {
        if ((n10 & 1) != 0) {
            bl = false;
        }
        if ((n10 & 2) != 0) {
            n8 = null;
        }
        if ((n10 & 4) != 0) {
            bl2 = false;
        }
        if ((n10 & 8) != 0) {
            n9 = null;
        }
        if ((n10 & 0x10) != 0) {
            bl3 = false;
        }
        if ((n10 & 0x20) != 0) {
            bl4 = false;
        }
        this(bl, n8, bl2, n9, bl3, bl4);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean bl, Integer n8, boolean bl2, Integer n9, boolean bl3, boolean bl4, int n10, Object object) {
        if ((n10 & 1) != 0) {
            bl = webSocketExtensions.perMessageDeflate;
        }
        if ((n10 & 2) != 0) {
            n8 = webSocketExtensions.clientMaxWindowBits;
        }
        if ((n10 & 4) != 0) {
            bl2 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((n10 & 8) != 0) {
            n9 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((n10 & 0x10) != 0) {
            bl3 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((n10 & 0x20) != 0) {
            bl4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(bl, n8, bl2, n9, bl3, bl4);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean bl, Integer n8, boolean bl2, Integer n9, boolean bl3, boolean bl4) {
        return new WebSocketExtensions(bl, n8, bl2, n9, bl3, bl4);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof WebSocketExtensions)) {
            return false;
        }
        object = (WebSocketExtensions)object;
        if (this.perMessageDeflate != ((WebSocketExtensions)object).perMessageDeflate) {
            return false;
        }
        if (!l.a(this.clientMaxWindowBits, ((WebSocketExtensions)object).clientMaxWindowBits)) {
            return false;
        }
        if (this.clientNoContextTakeover != ((WebSocketExtensions)object).clientNoContextTakeover) {
            return false;
        }
        if (!l.a(this.serverMaxWindowBits, ((WebSocketExtensions)object).serverMaxWindowBits)) {
            return false;
        }
        if (this.serverNoContextTakeover != ((WebSocketExtensions)object).serverNoContextTakeover) {
            return false;
        }
        return this.unknownValues == ((WebSocketExtensions)object).unknownValues;
    }

    public int hashCode() {
        int n8;
        int n9;
        int n10 = this.perMessageDeflate;
        int n11 = 1;
        int n12 = n10;
        if (n10 != 0) {
            n12 = 1;
        }
        Integer n13 = this.clientMaxWindowBits;
        int n14 = 0;
        n10 = n13 == null ? 0 : ((Object)n13).hashCode();
        int n15 = n9 = this.clientNoContextTakeover;
        if (n9 != 0) {
            n15 = 1;
        }
        if ((n13 = this.serverMaxWindowBits) != null) {
            n14 = ((Object)n13).hashCode();
        }
        n9 = n8 = this.serverNoContextTakeover;
        if (n8 != 0) {
            n9 = 1;
        }
        if ((n8 = this.unknownValues) == 0) {
            n11 = n8;
        }
        return ((((n12 * 31 + n10) * 31 + n15) * 31 + n14) * 31 + n9) * 31 + n11;
    }

    public final boolean noContextTakeover(boolean bl) {
        if (bl) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WebSocketExtensions(perMessageDeflate=");
        stringBuilder.append(this.perMessageDeflate);
        stringBuilder.append(", clientMaxWindowBits=");
        stringBuilder.append(this.clientMaxWindowBits);
        stringBuilder.append(", clientNoContextTakeover=");
        stringBuilder.append(this.clientNoContextTakeover);
        stringBuilder.append(", serverMaxWindowBits=");
        stringBuilder.append(this.serverMaxWindowBits);
        stringBuilder.append(", serverNoContextTakeover=");
        stringBuilder.append(this.serverNoContextTakeover);
        stringBuilder.append(", unknownValues=");
        stringBuilder.append(this.unknownValues);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Unable to fully structure code
         */
        public final WebSocketExtensions parse(Headers var1_1) throws IOException {
            l.f(var1_1, "responseHeaders");
            var6_2 = var1_1.size();
            var3_3 = 0;
            var13_4 = false;
            var19_5 = null;
            var10_6 = false;
            var18_7 = null;
            var9_8 = false;
            var8_9 = false;
            while (var3_3 < var6_2) {
                block16: {
                    block15: {
                        if (h.v(var1_1.name(var3_3), "Sec-WebSocket-Extensions", true)) break block15;
                        var4_11 = var3_3;
                        var12_15 = var13_4;
                        var17_19 = var19_5;
                        var14_16 = var10_6;
                        var16_18 = var18_7;
                        var15_17 = var9_8;
                        var11_14 = var8_9;
                        break block16;
                    }
                    var21_21 = var1_1.value(var3_3);
                    var2_10 = 0;
                    while (true) {
                        block17: {
                            block18: {
                                var4_11 = var3_3;
                                var12_15 = var13_4;
                                var17_19 = var19_5;
                                var14_16 = var10_6;
                                var16_18 = var18_7;
                                var15_17 = var9_8;
                                var11_14 = var8_9;
                                if (var2_10 >= var21_21.length()) break;
                                var7_13 = Util.delimiterOffset$default(var21_21, ',', var2_10, 0, 4, null);
                                var4_11 = Util.delimiterOffset(var21_21, ';', var2_10, var7_13);
                                var16_18 = Util.trimSubstring(var21_21, var2_10, var4_11);
                                ++var4_11;
                                if (!h.v((String)var16_18, "permessage-deflate", true)) break block17;
                                var2_10 = var4_11;
                                var5_12 = var3_3;
                                var16_18 = var19_5;
                                var11_14 = var10_6;
                                var17_19 = var18_7;
                                var12_15 = var9_8;
                                if (!var13_4) break block18;
                                var2_10 = var4_11;
                                var16_18 = var19_5;
                                var17_19 = var18_7;
                                ** GOTO lbl70
                            }
                            block2: while (var2_10 < var7_13) {
                                block21: {
                                    block19: {
                                        block20: {
                                            var3_3 = Util.delimiterOffset(var21_21, ';', var2_10, var7_13);
                                            var4_11 = Util.delimiterOffset(var21_21, '=', var2_10, var3_3);
                                            var22_22 = Util.trimSubstring(var21_21, var2_10, var4_11);
                                            var20_20 = var4_11 < var3_3 ? h.l0(Util.trimSubstring(var21_21, var4_11 + 1, var3_3), "\"") : null;
                                            var2_10 = var3_3 + 1;
                                            if (!h.v(var22_22, "client_max_window_bits", true)) break block19;
                                            if (var16_18 != null) {
                                                var8_9 = true;
                                            }
                                            var16_18 = var20_20 != null ? h.m(var20_20) : null;
                                            var18_7 = var16_18;
                                            var19_5 = var17_19;
                                            if (var16_18 != null) break block20;
                                            var19_5 = var17_19;
                                            var18_7 = var16_18;
lbl64:
                                            // 3 sources

                                            while (true) {
                                                var9_8 = var12_15;
                                                var17_19 = var19_5;
                                                var10_6 = var11_14;
                                                var16_18 = var18_7;
                                                var3_3 = var5_12;
lbl70:
                                                // 2 sources

                                                var8_9 = true;
                                                var5_12 = var3_3;
                                                var11_14 = var10_6;
                                                var12_15 = var9_8;
                                                continue block2;
                                                break;
                                            }
                                        }
                                        while (true) {
                                            var16_18 = var18_7;
                                            var17_19 = var19_5;
                                            continue block2;
                                            break;
                                        }
                                    }
                                    if (h.v(var22_22, "client_no_context_takeover", true)) {
                                        if (var11_14) {
                                            var8_9 = true;
                                        }
                                        if (var20_20 != null) {
                                            var8_9 = true;
                                        }
                                        var11_14 = true;
                                        continue;
                                    }
                                    if (!h.v(var22_22, "server_max_window_bits", true)) break block21;
                                    if (var17_19 != null) {
                                        var8_9 = true;
                                    }
                                    var17_19 = var20_20 != null ? h.m(var20_20) : null;
                                    var18_7 = var16_18;
                                    var19_5 = var17_19;
                                    if (var17_19 != null) ** continue;
                                    var18_7 = var16_18;
                                    var19_5 = var17_19;
                                    ** GOTO lbl64
                                }
                                var18_7 = var16_18;
                                var19_5 = var17_19;
                                if (h.v(var22_22, "server_no_context_takeover", true)) ** break;
                                ** continue;
                                if (var12_15) {
                                    var8_9 = true;
                                }
                                if (var20_20 != null) {
                                    var8_9 = true;
                                }
                                var12_15 = true;
                            }
                            var13_4 = true;
                            var3_3 = var5_12;
                            var19_5 = var16_18;
                            var10_6 = var11_14;
                            var18_7 = var17_19;
                            var9_8 = var12_15;
                            continue;
                        }
                        var2_10 = var4_11;
                        var8_9 = true;
                    }
                }
                var3_3 = var4_11 + 1;
                var13_4 = var12_15;
                var19_5 = var17_19;
                var10_6 = var14_16;
                var18_7 = var16_18;
                var9_8 = var15_17;
                var8_9 = var11_14;
            }
            return new WebSocketExtensions(var13_4, (Integer)var19_5, var10_6, (Integer)var18_7, var9_8, var8_9);
        }
    }
}

