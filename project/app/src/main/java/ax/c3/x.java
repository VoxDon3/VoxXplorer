/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import android.net.Uri;
import ax.Ha.c;
import ax.Q2.b;
import ax.Q2.f;
import ax.Z2.j;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class x {
    private static Map<K, o> a = new HashMap<K, o>();
    private static Context b;

    public static o a(K object, Uri uri, y y8, int n8) {
        object = x.e((K)object);
        ((com.voxdon.xplorer.file.b)((o)object).u()).l1(uri, y8, n8);
        return object;
    }

    public static o b(K object, Uri uri, String string, int n8, int n9) {
        object = x.e((K)object);
        ((com.voxdon.xplorer.file.b)((o)object).u()).m1(uri, string, n8, n9);
        return object;
    }

    public static Context c() {
        if (b == null) {
            b = ax.Q2.b.h().g();
        }
        return b;
    }

    public static o d(f f8, int n8) {
        return x.e(K.a(f8, n8));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o e(K k8) {
        synchronized (x.class) {
            Throwable throwable2;
            block15: {
                Object object;
                Object object2;
                block11: {
                    block14: {
                        block13: {
                            block12: {
                                Object var4_10;
                                Object var3_9;
                                try {
                                    object2 = a.get(k8);
                                    f f8 = k8.d();
                                    object = object2;
                                    if (object2 != null) return object;
                                    object2 = f8.x();
                                    var3_9 = null;
                                    object = null;
                                    var4_10 = null;
                                    if (object2 == null) break block11;
                                    object = f8.x().newInstance();
                                    break block12;
                                }
                                catch (Throwable throwable2) {
                                    break block15;
                                }
                                catch (InstantiationException instantiationException) {
                                    object = var4_10;
                                    break block13;
                                }
                                catch (IllegalAccessException illegalAccessException) {
                                    object = var3_9;
                                    break block14;
                                }
                            }
                            try {
                                ((m)object).W(x.c(), k8);
                                break block11;
                            }
                            catch (InstantiationException instantiationException) {
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                break block14;
                            }
                        }
                        ((Throwable)object2).printStackTrace();
                        break block11;
                    }
                    ((Throwable)object2).printStackTrace();
                }
                if (object == null) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Not reachable : Not supported location (");
                    ((StringBuilder)object2).append((Object)k8.d());
                    ((StringBuilder)object2).append(")");
                    object = new RuntimeException(((StringBuilder)object2).toString());
                    throw object;
                }
                object2 = new o(x.c(), (m)object);
                a.put(k8, (o)object2);
                return object2;
            }
            throw throwable2;
        }
    }

    public static o f(File file) {
        return x.g(file.getAbsolutePath());
    }

    public static o g(String string) {
        if (!d0.B(string)) {
            c.h().d("GLFONNP").j().g(string).h();
            return x.e(K.e);
        }
        return x.e(j.F().J(string, null));
    }

    public static void h(f object, int n8) {
        boolean bl = object == f.X0;
        ax.u3.b.c(bl);
        object = K.a(object, n8);
        a.remove(object);
    }
}

