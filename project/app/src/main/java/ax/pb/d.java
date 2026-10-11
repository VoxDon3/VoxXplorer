/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.b;
import ax.pb.e;
import ax.pb.k0;
import ax.pb.r;
import ax.pb.u;
import java.io.IOException;
import java.util.HashMap;

public class d {
    static ax.qb.e c = ax.qb.e.a();
    static final boolean d = ax.jb.a.a("jcifs.smb.client.dfs.strictView", false);
    static final long e = ax.jb.a.f("jcifs.smb.client.dfs.ttl", 300L);
    static final boolean f = ax.jb.a.a("jcifs.smb.client.dfs.disabled", false);
    protected static a g = new a(0L);
    protected a a = null;
    protected a b = null;

    public k0 a(String object, r serializable) throws u {
        block9: {
            if (f) {
                return null;
            }
            k0 k02 = k0.s(ax.jb.b.e((String)object, true), 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\");
            stringBuilder.append((String)object);
            serializable = k02.q((r)serializable, stringBuilder.toString(), 1);
            if (serializable == null) break block9;
            object = serializable;
            while (true) {
                try {
                    k02 = k0.s(ax.jb.b.d(((e)object).f0), 0);
                    return k02;
                }
                catch (IOException iOException) {
                    object = ((e)object).l0;
                    if (object != serializable) continue;
                    try {
                        throw iOException;
                    }
                    catch (IOException iOException2) {
                        if (ax.qb.e.c0 >= 3) {
                            iOException2.printStackTrace(c);
                        }
                        if (!d || !(iOException2 instanceof u)) break;
                        throw (u)iOException2;
                    }
                }
                break;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e b(k0 object, String charSequence, String string, String string2, r r8) throws u {
        IOException iOException2;
        block5: {
            block4: {
                if (f) {
                    return null;
                }
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("\\");
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append("\\");
                    stringBuilder.append(string);
                    string = stringBuilder.toString();
                    charSequence = string;
                    if (string2 == null) break block4;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append(string2);
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                catch (IOException iOException2) {
                    break block5;
                }
            }
            if ((object = ((k0)object).q(r8, (String)charSequence, 0)) == null) return null;
            return object;
        }
        if (ax.qb.e.c0 >= 4) {
            iOException2.printStackTrace(c);
        }
        if (!d) return null;
        if (iOException2 instanceof u) throw (u)iOException2;
        return null;
    }

    public HashMap c(r object) throws u {
        block9: {
            if (!f && ((r)object).q != "?") {
                Object object2;
                if (this.a != null && System.currentTimeMillis() > this.a.a) {
                    this.a = null;
                }
                if ((object2 = this.a) != null) {
                    return ((a)object2).b;
                }
                object2 = k0.s(ax.jb.b.e(((r)object).q, true), 0);
                a a8 = new a(e * 10L);
                object2 = ((k0)object2).q((r)object, "", 0);
                if (object2 == null) break block9;
                object = object2;
                while (true) {
                    Object object3 = ((e)object).f0.toLowerCase();
                    HashMap hashMap = a8.b;
                    HashMap hashMap2 = new HashMap();
                    hashMap.put(object3, hashMap2);
                    object = object3 = ((e)object).l0;
                    if (object3 != object2) continue;
                    break;
                }
                try {
                    this.a = a8;
                    object = a8.b;
                    return object;
                }
                catch (IOException iOException) {
                    if (ax.qb.e.c0 >= 3) {
                        iOException.printStackTrace(c);
                    }
                    if (!d || !(iOException instanceof u)) break block9;
                    throw (u)iOException;
                }
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d(String string, e e8) {
        synchronized (this) {
            Object object;
            String string2;
            String string3;
            int n8;
            block9: {
                boolean bl = f;
                if (!bl) break block9;
                return;
            }
            try {
                n8 = string.indexOf(92, 1);
                int n9 = n8 + 1;
                int n10 = string.indexOf(92, n9);
                string3 = string.substring(1, n8);
                string2 = string.substring(n9, n10);
                object = string.substring(0, e8.d0).toLowerCase();
                for (n8 = ((String)object).length(); n8 > 1 && ((String)object).charAt(n8 - 1) == '\\'; --n8) {
                }
                string = object;
            }
            catch (Throwable throwable) {}
            if (n8 < ((String)object).length()) {
                string = ((String)object).substring(0, n8);
            }
            e8.d0 -= string3.length() + 2 + string2.length();
            if (this.b != null && System.currentTimeMillis() + 10000L > this.b.a) {
                this.b = null;
            }
            if (this.b == null) {
                this.b = object = new a(0L);
            }
            this.b.b.put(string, e8);
            return;
            throw throwable;
        }
    }

    public boolean e(String string, r serializable) throws u {
        if ((serializable = this.c((r)serializable)) == null) {
            return false;
        }
        return ((HashMap)serializable).get(string.toLowerCase()) != null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e f(String var1_1, String var2_3, String var3_4, r var4_5) throws u {
        synchronized (this) {
            block25: {
                block23: {
                    block24: {
                        try {
                            var8_6 = System.currentTimeMillis();
                            if (ax.pb.d.f || var2_3.equals("IPC$")) break block23;
                            var10_7 = this.c((r)var4_5);
                            if (var10_7 == null) ** GOTO lbl95
                            var12_8 = var1_1.toLowerCase();
                            var16_9 = (HashMap)var10_7.get(var12_8);
                            if (var16_9 != null) {
                                var14_10 = var2_3.toLowerCase();
                                var11_11 = (a)var16_9.get(var14_10);
                                if (var11_11 == null || var8_6 <= var11_11.a) break block24;
                                var16_9.remove(var14_10);
                                var11_11 = null;
                            }
                            ** GOTO lbl94
                        }
                        catch (Throwable var1_2) {
                            break block25;
                        }
                    }
                    if (var11_11 != null) ** GOTO lbl57
                    var15_15 = this.a(var12_8, (r)var4_5);
                    if (var15_15 != null) ** GOTO lbl-1000
                    return null;
lbl-1000:
                    // 1 sources

                    {
                        var13_14 = this.b(var15_15, var12_8, var14_10, (String)var3_4, (r)var4_5);
                        if (var13_14 == null) ** GOTO lbl47
                        var5_12 = var12_8.length();
                        var6_13 = var14_10.length();
                        var2_3 = new a(0L);
                        var1_1 = var13_14;
                        do {
                            if (var3_4 == null) {
                                var1_1.m0 = var2_3.b;
                                var1_1.n0 = "\\";
                            }
                            var1_1.d0 -= var5_12 + 2 + var6_13;
                            var1_1 = var10_7 = var1_1.l0;
                        } while (var10_7 != var13_14);
                    }
                    {
                        block26: {
                            var1_1 = var13_14.n0;
                            if (var1_1 != null) {
                                var2_3.b.put(var1_1, var13_14);
                            }
                            var16_9.put(var14_10, var2_3);
                            var10_7 = var15_15;
                            var1_1 = var13_14;
                            break block26;
lbl47:
                            // 1 sources

                            var10_7 = var15_15;
                            var2_3 = var11_11;
                            var1_1 = var13_14;
                            if (var3_4 == null) {
                                var16_9.put(var14_10, ax.pb.d.g);
                                var10_7 = var15_15;
                                var2_3 = var11_11;
                                var1_1 = var13_14;
                            }
                            break block26;
lbl57:
                            // 1 sources

                            var1_1 = ax.pb.d.g;
                            var10_7 = null;
                            if (var11_11 == var1_1) {
                                var1_1 = var2_3 = null;
                            } else {
                                var1_1 = null;
                                var2_3 = var11_11;
                            }
                        }
                        if (var2_3 == null) ** GOTO lbl91
                    }
                    {
                        var11_11 = (e)var2_3.b.get("\\");
                        if (var11_11 != null && var8_6 > var11_11.k0) {
                            var2_3.b.remove("\\");
                            var11_11 = null;
                        }
                        var1_1 = var11_11;
                        if (var11_11 != null) ** GOTO lbl91
                        var1_1 = var10_7;
                        if (var10_7 != null) ** GOTO lbl-1000
                        var1_1 = var10_7 = this.a(var12_8, (r)var4_5);
                        if (var10_7 != null) ** GOTO lbl-1000
                    }
                    return null;
lbl-1000:
                    // 2 sources

                    {
                        block27: {
                            var11_11 = this.b((k0)var1_1, var12_8, var14_10, (String)var3_4, (r)var4_5);
                            var4_5 = var12_8;
                            var10_7 = var14_10;
                            var1_1 = var11_11;
                            if (var11_11 != null) {
                                var11_11.d0 -= var12_8.length() + 2 + var14_10.length();
                                var11_11.h0 = "\\";
                                var2_3.b.put("\\", var11_11);
                                var4_5 = var12_8;
                                var10_7 = var14_10;
                                var1_1 = var11_11;
                            }
                            break block27;
lbl91:
                            // 2 sources

                            var4_5 = var12_8;
                            var10_7 = var14_10;
                            break block27;
lbl94:
                            // 1 sources

                            var1_1 = var12_8;
lbl95:
                            // 2 sources

                            var11_11 = null;
                            var4_5 = var1_1;
                            var10_7 = var2_3;
                            var1_1 = var11_11;
                        }
                        var2_3 = var1_1;
                        if (var1_1 == null) {
                            var2_3 = var1_1;
                            if (var3_4 != null) {
                                var2_3 = this.b;
                                if (var2_3 != null && var8_6 > var2_3.a) {
                                    this.b = null;
                                }
                                if (this.b == null) {
                                    this.b = var2_3 = new a(0L);
                                }
                                var2_3 = new StringBuilder();
                                var2_3.append("\\");
                                var2_3.append((String)var4_5);
                                var2_3.append("\\");
                                var2_3.append((String)var10_7);
                                var2_3 = var4_5 = var2_3.toString();
                                if (!var3_4.equals("\\")) {
                                    var2_3 = new StringBuilder();
                                    var2_3.append((String)var4_5);
                                    var2_3.append((String)var3_4);
                                    var2_3 = var2_3.toString();
                                }
                                var4_5 = var2_3.toLowerCase();
                                var3_4 = this.b.b.keySet().iterator();
                                while (true) {
                                    var2_3 = var1_1;
                                    if (!var3_4.hasNext()) break;
                                    var2_3 = (String)var3_4.next();
                                    var5_12 = var2_3.length();
                                    var7_16 = var5_12 == var4_5.length() ? var2_3.equals(var4_5) : var5_12 < var4_5.length() && var2_3.regionMatches(0, (String)var4_5, 0, var5_12) != false && var4_5.charAt(var5_12) == '\\';
                                    if (!var7_16) continue;
                                    var1_1 = (e)this.b.b.get(var2_3);
                                }
                            }
                        }
                        return var2_3;
                    }
                }
                return null;
            }
            throw var1_2;
        }
    }

    static class a {
        long a;
        HashMap b;

        a(long l8) {
            long l9 = l8;
            if (l8 == 0L) {
                l9 = e;
            }
            this.a = System.currentTimeMillis() + l9 * 1000L;
            this.b = new HashMap();
        }
    }
}

