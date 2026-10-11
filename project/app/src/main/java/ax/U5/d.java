/*
 * Decompiled with CFR 0.152.
 */
package ax.U5;

import android.os.Looper;
import android.util.Log;
import ax.U5.c;

public final class d {
    private static ClassLoader a;
    private static Thread b;

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ClassLoader a() {
        synchronized (d.class) {
            block34: {
                block35: {
                    if (d.a != null) return d.a;
                    var4 = d.b;
                    var8_5 = null;
                    var7_6 = null;
                    var5_7 = var4;
                    if (var4 != null) ** GOTO lbl82
                    var5_7 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (var5_7 != null) break block35;
                    var4 = null;
                    ** GOTO lbl77
                }
                ** synchronized (Void.class)
lbl-1000:
                // 1 sources

                {
                    try {
                        block29: {
                            var2_10 = var5_7.activeGroupCount();
                            var6_11 = new ThreadGroup[var2_10];
                            var5_7.enumerate((ThreadGroup[])var6_11);
                            var1_13 = 0;
                            for (var0_14 = 0; var0_14 < var2_10; ++var0_14) {
                                var4 = var6_11[var0_14];
                                if (!"dynamiteLoader".equals(var4.getName())) {
                                    continue;
                                }
                                break block29;
                            }
                            var4 = null;
                        }
                        var6_11 = var4;
                        if (var4 == null) {
                            var6_11 = new ThreadGroup((ThreadGroup)var5_7, "dynamiteLoader");
                        }
                        var2_10 = var6_11.activeCount();
                        var5_7 = new Thread[var2_10];
                        var6_11.enumerate((Thread[])var5_7);
                        ** GOTO lbl42
                    }
                    catch (Throwable var4_1) {}
                }
                throw var4_1;
                {
                    block33: {
                        catch (SecurityException var5_8) {}
                        {
                            block31: {
                                block32: {
                                    block30: {
                                        var4 = null;
                                        break block32;
lbl42:
                                        // 2 sources

                                        for (var0_14 = var1_13; var0_14 < var2_10; ++var0_14) {
                                            var4 = var5_7[var0_14];
                                            var3_15 = "GmsDynamite".equals(var4.getName());
                                            if (!var3_15) {
                                                continue;
                                            }
                                            break block30;
                                        }
                                        var4 = null;
                                    }
                                    var5_7 = var4;
                                    if (var4 != null) break block31;
                                    try {
                                        var5_7 = new c((ThreadGroup)var6_11, "GmsDynamite");
                                    }
                                    catch (SecurityException var5_9) {}
                                    try {
                                        var5_7.setContextClassLoader(null);
                                        var5_7.start();
                                        break block31;
                                    }
                                    catch (SecurityException var6_12) {
                                        var4 = var5_7;
                                        var5_7 = var6_12;
                                    }
                                }
                                var5_7 = var5_7.getMessage();
                                var6_11 = new StringBuilder();
                                var6_11.append("Failed to enumerate thread/threadgroup ");
                                var6_11.append((String)var5_7);
                                Log.w((String)"DynamiteLoaderV2CL", (String)var6_11.toString());
                                var5_7 = var4;
                            }
                            // MONITOREXIT @DISABLED, blocks:[3, 8, 13, 15] lbl70 : MonitorExitStatement: MONITOREXIT : java.lang.Void.class
                            var4 = var5_7;
                        }
lbl77:
                        // 3 sources

                        d.b = var4;
                        var5_7 = var4;
                        if (var4 != null) break block33;
                        var4 = var8_5;
                        break block34;
                    }
                    ** synchronized (var5_7)
                }
lbl-1000:
                // 1 sources

                {
                    try {
                        try {
                            var4 = d.b.getContextClassLoader();
                        }
                        catch (SecurityException var4_4) {
                            var4 = var4_4.getMessage();
                            var6_11 = new StringBuilder();
                            var6_11.append("Failed to get thread context classloader ");
                            var6_11.append((String)var4);
                            Log.w((String)"DynamiteLoaderV2CL", (String)var6_11.toString());
                            var4 = var7_6;
                        }
                    }
                    catch (Throwable var4_3) {
                        ** GOTO lbl-1000
                    }
                }
            }
            try {
                block36: {
                    break block36;
lbl-1000:
                    // 1 sources

                    {
                        throw var4_3;
                    }
                }
                d.a = var4;
                return d.a;
            }
            catch (Throwable var4_2) {}
            throw var4_2;
        }
    }
}

