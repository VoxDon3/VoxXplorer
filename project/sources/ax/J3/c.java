package ax.J3;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.N3.i;
import ax.U3.a;
import ax.U3.b;
import ax.U3.d;
import ax.U3.e;
import ax.U3.f;
import ax.U3.k;
import ax.U3.r;
import ax.U3.s;
import ax.U3.t;
import ax.U3.u;
import ax.U3.v;
import ax.U3.w;
import ax.V3.a;
import ax.V3.b;
import ax.V3.c;
import ax.V3.d;
import ax.V3.e;
import ax.X3.m;
import ax.X3.o;
import ax.Y3.a;
import ax.a4.C1368a;
import ax.b4.C1499a;
import ax.c4.C1838a;
import ax.c4.C1839b;
import ax.c4.C1840c;
import ax.d4.l;
import ax.e4.C1978d;
import ax.e4.InterfaceC1976b;
import ax.g4.C2117f;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@TargetApi(14)
/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {
    private static volatile c l;
    private static volatile boolean m;
    private final ax.P3.i a;
    private final ax.Q3.d b;
    private final ax.R3.h c;
    private final ax.T3.a d;
    private final e e;
    private final h f;
    private final ax.Q3.b g;
    private final l h;
    private final ax.d4.d i;
    private final List<j> j = new ArrayList();
    private f k = f.NORMAL;

    @TargetApi(14)
    c(Context context, ax.P3.i iVar, ax.R3.h hVar, ax.Q3.d dVar, ax.Q3.b bVar, l lVar, ax.d4.d dVar2, int i, C2117f c2117f, Map<Class<?>, k<?, ?>> map) {
        this.a = iVar;
        this.b = dVar;
        this.g = bVar;
        this.c = hVar;
        this.h = lVar;
        this.i = dVar2;
        this.d = new ax.T3.a(hVar, dVar, (ax.M3.b) c2117f.s().c(ax.X3.i.f));
        Resources resources = context.getResources();
        h hVar2 = new h();
        this.f = hVar2;
        hVar2.m(new ax.X3.g());
        ax.X3.i iVar2 = new ax.X3.i(hVar2.d(), resources.getDisplayMetrics(), dVar, bVar);
        C1499a c1499a = new C1499a(context, hVar2.d(), dVar, bVar);
        h n = hVar2.o(ByteBuffer.class, new ax.U3.c()).o(InputStream.class, new s(bVar)).a(ByteBuffer.class, Bitmap.class, new ax.X3.f(iVar2)).a(InputStream.class, Bitmap.class, new m(iVar2, bVar)).a(ParcelFileDescriptor.class, Bitmap.class, new o(dVar)).p(Bitmap.class, new ax.X3.d()).a(ByteBuffer.class, BitmapDrawable.class, new ax.X3.a(resources, dVar, new ax.X3.f(iVar2))).a(InputStream.class, BitmapDrawable.class, new ax.X3.a(resources, dVar, new m(iVar2, bVar))).a(ParcelFileDescriptor.class, BitmapDrawable.class, new ax.X3.a(resources, dVar, new o(dVar))).p(BitmapDrawable.class, new ax.X3.b(dVar, new ax.X3.d())).l(InputStream.class, ax.b4.c.class, new ax.b4.i(hVar2.d(), c1499a, bVar)).l(ByteBuffer.class, ax.b4.c.class, c1499a).p(ax.b4.c.class, new ax.b4.d()).b(ax.L3.a.class, ax.L3.a.class, new u.a()).a(ax.L3.a.class, Bitmap.class, new ax.b4.h(dVar)).n(new a.C0224a()).b(File.class, ByteBuffer.class, new d.b()).b(File.class, InputStream.class, new f.e()).a(File.class, File.class, new C1368a()).b(File.class, ParcelFileDescriptor.class, new f.b()).b(File.class, File.class, new u.a()).n(new i.a(bVar));
        r.b bVar2 = new r.b(resources);
        Class cls = Integer.TYPE;
        n.b(cls, InputStream.class, bVar2).b(cls, ParcelFileDescriptor.class, new r.a(resources)).b(Integer.class, InputStream.class, new r.b(resources)).b(Integer.class, ParcelFileDescriptor.class, new r.a(resources)).b(String.class, InputStream.class, new e.c()).b(String.class, InputStream.class, new t.b()).b(String.class, ParcelFileDescriptor.class, new t.a()).b(Uri.class, InputStream.class, new b.a()).b(Uri.class, InputStream.class, new a.c(context.getAssets())).b(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).b(Uri.class, InputStream.class, new c.a(context)).b(Uri.class, InputStream.class, new d.a(context)).b(Uri.class, InputStream.class, new v.c(context.getContentResolver())).b(Uri.class, ParcelFileDescriptor.class, new v.a(context.getContentResolver())).b(Uri.class, InputStream.class, new w.a()).b(URL.class, InputStream.class, new e.a()).b(Uri.class, File.class, new k.a(context)).b(ax.U3.g.class, InputStream.class, new a.C0214a()).b(byte[].class, ByteBuffer.class, new b.a()).b(byte[].class, InputStream.class, new b.d()).q(Bitmap.class, BitmapDrawable.class, new C1839b(resources, dVar)).q(Bitmap.class, byte[].class, new C1838a()).q(ax.b4.c.class, byte[].class, new C1840c());
        this.e = new e(context, hVar2, new ax.h4.b(), c2117f, map, iVar, i);
    }

    private static void a(Context context) {
        if (m) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        m = true;
        m(context);
        m = false;
    }

    public static c c(Context context) {
        if (l == null) {
            synchronized (c.class) {
                try {
                    if (l == null) {
                        a(context);
                    }
                } finally {
                }
            }
        }
        return l;
    }

    private static a d() {
        try {
            return (a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").newInstance();
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        }
    }

    private static l l(Context context) {
        ax.k4.h.e(context, "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context) {
        Context applicationContext = context.getApplicationContext();
        a d = d();
        List<InterfaceC1976b> list = Collections.EMPTY_LIST;
        if (d == null || d.c()) {
            list = new C1978d(applicationContext).a();
        }
        if (d != null && !d.d().isEmpty()) {
            Set<Class<?>> d2 = d.d();
            Iterator<InterfaceC1976b> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC1976b next = it.next();
                if (d2.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC1976b> it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        d b = new d().b(d != null ? d.e() : null);
        Iterator<InterfaceC1976b> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, b);
        }
        if (d != null) {
            d.b(applicationContext, b);
        }
        c a = b.a(applicationContext);
        Iterator<InterfaceC1976b> it4 = list.iterator();
        while (it4.hasNext()) {
            it4.next().b(applicationContext, a, a.f);
        }
        if (d != null) {
            d.a(applicationContext, a, a.f);
        }
        context.getApplicationContext().registerComponentCallbacks(a);
        l = a;
    }

    public static j r(Context context) {
        return l(context).d(context);
    }

    public void b() {
        ax.k4.i.b();
        this.c.b();
        this.b.b();
        this.g.b();
    }

    public ax.Q3.b e() {
        return this.g;
    }

    public ax.Q3.d f() {
        return this.b;
    }

    ax.d4.d g() {
        return this.i;
    }

    public Context h() {
        return this.e.getBaseContext();
    }

    e i() {
        return this.e;
    }

    public h j() {
        return this.f;
    }

    public l k() {
        return this.h;
    }

    void n(j jVar) {
        synchronized (this.j) {
            try {
                if (this.j.contains(jVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.j.add(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o(ax.h4.e<?> eVar) {
        synchronized (this.j) {
            try {
                Iterator<j> it = this.j.iterator();
                while (it.hasNext()) {
                    if (it.next().v(eVar)) {
                        return;
                    }
                }
                throw new IllegalStateException("Failed to remove target from managers");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        p(i);
    }

    public void p(int i) {
        ax.k4.i.b();
        this.c.a(i);
        this.b.a(i);
        this.g.a(i);
    }

    void q(j jVar) {
        synchronized (this.j) {
            try {
                if (!this.j.contains(jVar)) {
                    throw new IllegalStateException("Cannot register not yet registered manager");
                }
                this.j.remove(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
