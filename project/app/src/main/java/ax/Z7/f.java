/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import android.content.Context;
import android.util.Base64OutputStream;
import ax.C7.a;
import ax.D7.F;
import ax.D7.r;
import ax.Y.v;
import ax.Z7.b;
import ax.Z7.c;
import ax.Z7.d;
import ax.Z7.e;
import ax.Z7.g;
import ax.Z7.i;
import ax.Z7.j;
import ax.Z7.k;
import ax.Z7.l;
import ax.j6.m;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class f
implements i,
j {
    private final ax.a8.b<k> a;
    private final Context b;
    private final ax.a8.b<ax.h8.i> c;
    private final Set<g> d;
    private final Executor e;

    private f(Context context, String string, Set<g> set, ax.a8.b<ax.h8.i> b8, Executor executor) {
        this(new e(context, string), set, executor, b8, context);
    }

    f(ax.a8.b<k> b8, Set<g> set, Executor executor, ax.a8.b<ax.h8.i> b9, Context context) {
        this.a = b8;
        this.d = set;
        this.e = executor;
        this.c = b9;
        this.b = context;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ String b(f f8) {
        synchronized (f8) {
            Throwable throwable522222;
            Throwable throwable22222;
            Object object;
            Object object2;
            Object object3 = f8.a.get();
            Object object4 = ((k)object3).c();
            ((k)object3).b();
            object3 = new JSONArray();
            for (int i8 = 0; i8 < object4.size(); ++i8) {
                object2 = object4.get(i8);
                object = new JSONObject();
                object.put("agent", (Object)((l)object2).c());
                JSONArray jSONArray = new JSONArray(((l)object2).b());
                object.put("dates", (Object)jSONArray);
                object3.put(object);
            }
            object2 = new JSONObject();
            object2.put("heartbeats", object3);
            object2.put("version", (Object)"2");
            object = new ByteArrayOutputStream();
            object3 = new Base64OutputStream((OutputStream)object, 11);
            {
                catch (Throwable throwable22222) {}
            }
            object4 = new GZIPOutputStream((OutputStream)object3);
            ((OutputStream)object4).write(object2.toString().getBytes("UTF-8"));
            ((OutputStream)object4).close();
            object3.close();
            return ((ByteArrayOutputStream)object).toString("UTF-8");
            catch (Throwable throwable3) {
                try {
                    ((OutputStream)object4).close();
                    throw throwable3;
                }
                catch (Throwable throwable4) {
                    try {
                        throwable3.addSuppressed(throwable4);
                        throw throwable3;
                    }
                    catch (Throwable throwable522222) {}
                }
            }
            try {
                object3.close();
                throw throwable522222;
            }
            catch (Throwable throwable6) {
                throwable522222.addSuppressed(throwable6);
                throw throwable522222;
            }
            throw throwable22222;
        }
    }

    public static /* synthetic */ k c(Context context, String string) {
        return new k(context, string);
    }

    public static /* synthetic */ f d(F f8, ax.D7.e e8) {
        return new f(e8.a(Context.class), e8.a(ax.x7.f.class).o(), e8.f(g.class), e8.d(ax.h8.i.class), (Executor)e8.c(f8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ Void e(f f8) {
        synchronized (f8) {
            f8.a.get().g(System.currentTimeMillis(), f8.c.get().a());
            return null;
        }
    }

    public static ax.D7.c<f> f() {
        F<Executor> f8 = F.a(a.class, Executor.class);
        return ax.D7.c.f(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(ax.x7.f.class)).b(r.m(g.class)).b(r.l(ax.h8.i.class)).b(r.i(f8)).e(new d(f8)).c();
    }

    @Override
    public ax.j6.j<String> a() {
        if (!v.a(this.b)) {
            return m.e("");
        }
        return m.c(this.e, new c(this));
    }

    public ax.j6.j<Void> g() {
        if (this.d.size() <= 0) {
            return m.e(null);
        }
        if (!v.a(this.b)) {
            return m.e(null);
        }
        return m.c(this.e, new b(this));
    }
}

