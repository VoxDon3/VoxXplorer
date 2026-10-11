package ax.Z7;

import android.content.Context;
import android.util.Base64OutputStream;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.r;
import ax.Y.v;
import ax.j6.AbstractC2327j;
import ax.j6.m;
import ax.x7.C3471f;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements i, j {
    private final ax.a8.b<k> a;
    private final Context b;
    private final ax.a8.b<ax.h8.i> c;
    private final Set<g> d;
    private final Executor e;

    private f(final Context context, final String str, Set<g> set, ax.a8.b<ax.h8.i> bVar, Executor executor) {
        this((ax.a8.b<k>) new ax.a8.b() { // from class: ax.Z7.e
            @Override // ax.a8.b
            public final Object get() {
                return f.c(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static /* synthetic */ String b(f fVar) {
        String byteArrayOutputStream;
        synchronized (fVar) {
            try {
                k kVar = fVar.a.get();
                List<l> c = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < c.size(); i++) {
                    l lVar = c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ k c(Context context, String str) {
        return new k(context, str);
    }

    public static /* synthetic */ f d(F f, InterfaceC0663e interfaceC0663e) {
        return new f((Context) interfaceC0663e.a(Context.class), ((C3471f) interfaceC0663e.a(C3471f.class)).o(), (Set<g>) interfaceC0663e.f(g.class), (ax.a8.b<ax.h8.i>) interfaceC0663e.d(ax.h8.i.class), (Executor) interfaceC0663e.c(f));
    }

    public static /* synthetic */ Void e(f fVar) {
        synchronized (fVar) {
            fVar.a.get().g(System.currentTimeMillis(), fVar.c.get().a());
        }
        return null;
    }

    public static C0661c<f> f() {
        final F a = F.a(ax.C7.a.class, Executor.class);
        return C0661c.f(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(C3471f.class)).b(r.m(g.class)).b(r.l(ax.h8.i.class)).b(r.i(a)).e(new ax.D7.h() { // from class: ax.Z7.d
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return f.d(F.this, interfaceC0663e);
            }
        }).c();
    }

    @Override // ax.Z7.i
    public AbstractC2327j<String> a() {
        return !v.a(this.b) ? m.e(HttpUrl.FRAGMENT_ENCODE_SET) : m.c(this.e, new Callable() { // from class: ax.Z7.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.b(f.this);
            }
        });
    }

    public AbstractC2327j<Void> g() {
        return this.d.size() <= 0 ? m.e(null) : !v.a(this.b) ? m.e(null) : m.c(this.e, new Callable() { // from class: ax.Z7.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.e(f.this);
            }
        });
    }

    f(ax.a8.b<k> bVar, Set<g> set, Executor executor, ax.a8.b<ax.h8.i> bVar2, Context context) {
        this.a = bVar;
        this.d = set;
        this.e = executor;
        this.c = bVar2;
        this.b = context;
    }
}
