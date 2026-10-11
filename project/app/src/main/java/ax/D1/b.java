/*
 * Decompiled with CFR 0.152.
 */
package ax.D1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.S0.a;
import ax.S0.u;
import java.util.List;
import java.util.Map;

public final class b
implements C.a {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public b(int n8, String string, String string2, String string3, boolean bl, int n9) {
        boolean bl2 = n9 == -1 || n9 > 0;
        ax.S0.a.a(bl2);
        this.a = n8;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = bl;
        this.f = n9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b d(Map<String, List<String>> var0) {
        block20: {
            block22: {
                block21: {
                    block23: {
                        block19: {
                            var7_1 = (List)var0.get("icy-br");
                            var5_2 = 1;
                            var3_3 = -1;
                            if (var7_1 == null) break block23;
                            var7_1 = (String)var7_1.get(0);
                            var1_4 = Integer.parseInt((String)var7_1);
                            var2_5 = var1_4 * 1000;
                            if (var2_5 <= 0) break block19;
                            var1_4 = 1;
lbl11:
                            // 4 sources

                            while (true) {
                                var8_6 = (List)var0.get("icy-genre");
                                var7_1 = null;
                                if (var8_6 != null) {
                                    var7_1 = (String)var8_6.get(0);
                                    var1_4 = 1;
                                }
                                var10_9 = null;
                                var8_6 = (List)var0.get("icy-name");
                                if (var8_6 != null) {
                                    var8_6 = (String)var8_6.get(0);
                                    var1_4 = 1;
                                } else {
                                    var8_6 = null;
                                }
                                var9_10 = (List)var0.get("icy-url");
                                if (var9_10 != null) {
                                    var9_10 = (String)var9_10.get(0);
                                    var1_4 = 1;
                                } else {
                                    var9_10 = null;
                                }
                                var11_11 = (List)var0.get("icy-pub");
                                if (var11_11 != null) {
                                    var6_15 = ((String)var11_11.get(0)).equals("1");
                                    var1_4 = 1;
                                } else {
                                    var6_15 = false;
                                }
                                var0 = (List)var0.get("icy-metaint");
                                if (var0 == null) break block20;
                                var0 = (String)var0.get(0);
                                var4_16 = Integer.parseInt((String)var0);
                                if (var4_16 <= 0) break block21;
                                var1_4 = var4_16;
                                var3_3 = var5_2;
                                break block22;
                                break;
                            }
                        }
                        try {
                            var8_6 = new StringBuilder();
                            var8_6.append("Invalid bitrate: ");
                            var8_6.append((String)var7_1);
                            u.h("IcyHeaders", var8_6.toString());
                            var1_4 = 0;
                            var2_5 = -1;
                        }
                        catch (NumberFormatException var8_8) {
                            var1_4 = var2_5;
                            ** continue;
                        }
                        catch (NumberFormatException var8_7) {
                            var1_4 = -1;
lbl61:
                            // 2 sources

                            while (true) {
                                var8_6 = new StringBuilder();
                                var8_6.append("Invalid bitrate header: ");
                                var8_6.append((String)var7_1);
                                u.h("IcyHeaders", var8_6.toString());
                                var2_5 = var1_4;
                                var1_4 = 0;
                                break;
                            }
                        }
                        ** GOTO lbl11
                    }
                    var1_4 = 0;
                    var2_5 = -1;
                    ** while (true)
                }
                try {
                    var11_11 = new StringBuilder();
                    var11_11.append("Invalid metadata interval: ");
                    var11_11.append((String)var0);
                    u.h("IcyHeaders", var11_11.toString());
                    var4_16 = var1_4;
                    var1_4 = var3_3;
                    var3_3 = var4_16;
                }
                catch (NumberFormatException var11_12) {
                    var3_3 = var4_16;
lbl97:
                    // 2 sources

                    while (true) {
                        var11_13 = new StringBuilder();
                        var11_13.append("Invalid metadata interval: ");
                        var11_13.append((String)var0);
                        u.h("IcyHeaders", var11_13.toString());
                        break;
                    }
                }
            }
            var4_16 = var3_3;
            var3_3 = var1_4;
            var1_4 = var4_16;
lbl91:
            // 3 sources

            while (true) {
                var0 = var10_9;
                if (var1_4 == 0) return var0;
                return new b(var2_5, (String)var7_1, (String)var8_6, (String)var9_10, var6_15, var3_3);
            }
            catch (NumberFormatException var11_14) {
                ** continue;
            }
        }
        var3_3 = -1;
        ** while (true)
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public void b(A.b b8) {
        String string = this.c;
        if (string != null) {
            b8.m0(string);
        }
        if ((string = this.b) != null) {
            b8.c0(string);
        }
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && b.class == object.getClass()) {
            object = (b)object;
            if (this.a == ((b)object).a && j.Objects.equals((Object)this.b, (Object)((b)object).b) && j.Objects.equals((Object)this.c, (Object)((b)object).c) && j.Objects.equals((Object)this.d, (Object)((b)object).d) && this.e == ((b)object).e && this.f == ((b)object).f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a;
        String string = this.b;
        int n9 = 0;
        int n10 = string != null ? string.hashCode() : 0;
        string = this.c;
        int n11 = string != null ? string.hashCode() : 0;
        string = this.d;
        if (string != null) {
            n9 = string.hashCode();
        }
        return (((((527 + n8) * 31 + n10) * 31 + n11) * 31 + n9) * 31 + this.e) * 31 + this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IcyHeaders: name=\"");
        stringBuilder.append(this.c);
        stringBuilder.append("\", genre=\"");
        stringBuilder.append(this.b);
        stringBuilder.append("\", bitrate=");
        stringBuilder.append(this.a);
        stringBuilder.append(", metadataInterval=");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }
}

