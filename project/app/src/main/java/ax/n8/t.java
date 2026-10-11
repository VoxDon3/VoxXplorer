/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.b8.e;
import ax.sb.o;
import ax.xb.b;
import ax.yb.d;

public final class t {
    public static final a c = new a(null);
    private final String a;
    private final String b;

    private t(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public /* synthetic */ t(String string, String string2, g g8) {
        this(string, string2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public static final class ax.n8.t$a {
        private ax.n8.t$a() {
        }

        public /* synthetic */ ax.n8.t$a(g g8) {
            this();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Object a(e var1_1, ax.wb.e<? super t> var2_3) {
            block13: {
                block12: {
                    block16: {
                        block15: {
                            block14: {
                                if (!(var2_3 instanceof a)) ** GOTO lbl-1000
                                var4_5 = var2_3;
                                var3_6 = var4_5.h0;
                                if ((var3_6 & -2147483648) != 0) {
                                    var4_5.h0 = var3_6 + -2147483648;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_5 = new d(this, (ax.wb.e<? super a>)var2_3){
                                        Object e0;
                                        Object f0;
                                        final ax.n8.t$a g0;
                                        int h0;
                                        {
                                            this.g0 = a8;
                                            super(e8);
                                        }

                                        @Override
                                        public final Object p(Object object) {
                                            this.f0 = object;
                                            this.h0 |= Integer.MIN_VALUE;
                                            return this.g0.a(null, this);
                                        }
                                    };
                                }
                                var5_7 = var4_5.f0;
                                var8_8 = ax.xb.b.c();
                                var3_6 = var4_5.h0;
                                var6_9 = "";
                                if (var3_6 != 0) {
                                    if (var3_6 != 1) {
                                        if (var3_6 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        var1_1 = var2_3 = (String)var4_5.e0;
                                        try {
                                            o.b(var5_7);
                                            break block12;
                                        }
                                        catch (Exception var2_4) {
                                            break block13;
                                        }
                                    }
                                    var2_3 = var1_1 = (e)var4_5.e0;
                                    try {
                                        o.b(var5_7);
                                        break block14;
                                    }
                                    catch (Exception var1_2) {
                                        break block15;
                                    }
                                }
                                o.b(var5_7);
                                var2_3 = var1_1;
                                {
                                    var5_7 = var1_1.b(false);
                                    var2_3 = var1_1;
                                    l.e(var5_7, "firebaseInstallations.getToken(false)");
                                    var2_3 = var1_1;
                                    var4_5.e0 = var1_1;
                                    var2_3 = var1_1;
                                    var4_5.h0 = 1;
                                    var2_3 = var1_1;
                                    var5_7 = var7_10 = ax.ac.b.a(var5_7, var4_5);
                                    if (var7_10 != var8_8) break block14;
                                    return var8_8;
                                }
                            }
                            var2_3 = var1_1;
                            {
                                var5_7 = ((com.google.firebase.installations.g)var5_7).b();
                                var2_3 = var1_1;
                                l.e(var5_7, "{\n          firebaseInst\u2026).await().token\n        }");
                                var2_3 = var5_7;
                                var5_7 = var1_1;
                                break block16;
                            }
                        }
                        Log.w((String)"InstallationId", (String)"Error getting authentication token.", (Throwable)var1_2);
                        var1_1 = "";
                        var5_7 = var2_3;
                        var2_3 = var1_1;
                    }
                    var1_1 = var2_3;
                    {
                        var5_7 = var5_7.a();
                        var1_1 = var2_3;
                        l.e(var5_7, "firebaseInstallations.id");
                        var1_1 = var2_3;
                        var4_5.e0 = var2_3;
                        var1_1 = var2_3;
                        var4_5.h0 = 2;
                        var1_1 = var2_3;
                        var5_7 = var4_5 = ax.ac.b.a(var5_7, var4_5);
                        if (var4_5 != var8_8) break block12;
                    }
                    return var8_8;
                }
                var1_1 = var2_3;
                {
                    l.e(var5_7, "{\n          firebaseInst\u2026ions.id.await()\n        }");
                    var1_1 = var2_3;
                    var4_5 = (String)var5_7;
                    var1_1 = var2_3;
                    return new t((String)var4_5, (String)var1_1, null);
                }
            }
            Log.w((String)"InstallationId", (String)"Error getting Firebase installation id .", (Throwable)var2_4);
            var4_5 = var6_9;
            return new t((String)var4_5, (String)var1_1, null);
        }
    }
}

