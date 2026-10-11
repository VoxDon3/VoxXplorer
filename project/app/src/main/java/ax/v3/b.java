/*
 * Decompiled with CFR 0.152.
 */
package ax.v3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.Ha.c;
import ax.Q2.g;
import ax.j6.e;
import ax.j6.j;
import ax.u3.B;
import ax.x7.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

public class b {
    private static final Logger d = g.a(b.class);
    private com.google.firebase.remoteconfig.a a;
    HashMap<String, Object> b;
    private boolean c;

    public boolean b(String string) {
        Object object;
        if (this.c && (object = this.a) != null) {
            if ((object = ((com.google.firebase.remoteconfig.a)object).k(string)).a() != 0 && object.a() != 1) {
                try {
                    boolean bl = object.c();
                    return bl;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return (Boolean)this.b.get(string);
                }
            }
            return (Boolean)this.b.get(string);
        }
        return (Boolean)this.b.get(string);
    }

    public int c(String string) {
        Object object;
        if (this.c && (object = this.a) != null) {
            if ((object = ((com.google.firebase.remoteconfig.a)object).k(string)).a() != 0 && object.a() != 1) {
                long l8;
                try {
                    l8 = object.b();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return ((Long)this.b.get(string)).intValue();
                }
                return (int)l8;
            }
            return ((Long)this.b.get(string)).intValue();
        }
        return ((Long)this.b.get(string)).intValue();
    }

    public long d(String string) {
        Object object;
        if (this.c && (object = this.a) != null) {
            if ((object = ((com.google.firebase.remoteconfig.a)object).k(string)).a() != 0 && object.a() != 1) {
                try {
                    long l8 = object.b();
                    return l8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return (Long)this.b.get(string);
                }
            }
            return (Long)this.b.get(string);
        }
        return (Long)this.b.get(string);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(Context object, HashMap<String, Object> object2, boolean bl) {
        block7: {
            Object object3;
            Throwable var4_8;
            block10: {
                block8: {
                    block9: {
                        this.b = object2;
                        try {
                            if (this.a != null) break block7;
                            if (!bl || !this.f()) break block8;
                            f.q((Context)object);
                            this.a = object2 = com.google.firebase.remoteconfig.a.h();
                            object2 = ((com.google.firebase.remoteconfig.a)object2).g();
                            e<Boolean> e8 = new e<Boolean>(this){
                                final b a;
                                {
                                    this.a = b8;
                                }

                                @Override
                                public void a(j<Boolean> j8) {
                                    if (j8.m()) {
                                        d.fine("Dynamic config fetch succeeded");
                                    } else {
                                        d.fine("Dynamic config fetch failed");
                                    }
                                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                                        final a q;
                                        {
                                            this.q = a8;
                                        }

                                        @Override
                                        public void run() {
                                            if (B.D("GoogleApiHandler")) {
                                                d.fine("ThreadGuard : GoogleApiHandler Delay");
                                            }
                                        }
                                    }, 2000L);
                                }
                            };
                            ((j)object2).b(e8);
                            if (!B.D("GoogleApiHandler")) break block9;
                            d.fine("ThreadGuard : GoogleApiHandler");
                        }
                        catch (VerifyError verifyError) {
                            break block10;
                        }
                        catch (RuntimeException runtimeException) {
                            break block10;
                        }
                    }
                    this.c = true;
                    return;
                }
                this.c = false;
                return;
            }
            var4_8.printStackTrace();
            object2 = null;
            try {
                object3 = B.p(object.getPackageManager().getPackageInfo((String)object.getPackageName(), (int)64).signatures);
                object2 = object = "sign:";
                Iterator iterator = object3.iterator();
                while (true) {
                    object3 = object;
                    object2 = object;
                    if (iterator.hasNext()) {
                        object2 = object;
                        object3 = (String)iterator.next();
                        object2 = object;
                        object2 = object;
                        StringBuilder stringBuilder = new StringBuilder();
                        object2 = object;
                        stringBuilder.append((String)object);
                        object2 = object;
                        stringBuilder.append((String)object3);
                        object2 = object;
                        stringBuilder.append(":::");
                        object2 = object;
                        object = stringBuilder.toString();
                        continue;
                    }
                    break;
                }
            }
            catch (Exception exception) {
                object3 = object2;
            }
            ax.Ha.c.h().f().d("FIREBASE INIT ERROR").l((Throwable)var4_8).g(object3).h();
        }
    }

    public boolean f() {
        return "LG-E615f".equals(Build.MODEL) ^ true;
    }
}

