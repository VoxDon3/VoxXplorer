/*
 * Decompiled with CFR 0.152.
 */
package ax.J3;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.J3.a;
import ax.J3.d;
import ax.J3.e;
import ax.J3.f;
import ax.J3.h;
import ax.J3.j;
import ax.J3.k;
import ax.N3.i;
import ax.P3.i;
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
import ax.X3.b;
import ax.X3.g;
import ax.X3.m;
import ax.X3.o;
import ax.Y3.a;
import ax.d4.l;
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

@TargetApi(value=14)
public class c
implements ComponentCallbacks2 {
    private static volatile c l;
    private static volatile boolean m;
    private final i a;
    private final ax.Q3.d b;
    private final ax.R3.h c;
    private final ax.T3.a d;
    private final e e;
    private final h f;
    private final ax.Q3.b g;
    private final l h;
    private final ax.d4.d i;
    private final List<j> j = new ArrayList<j>();
    private f k = ax.J3.f.d0;

    @TargetApi(value=14)
    c(Context context, i i8, ax.R3.h object, ax.Q3.d d8, ax.Q3.b object2, l l8, ax.d4.d object3, int n8, ax.g4.f f8, Map<Class<?>, k<?, ?>> map) {
        this.a = i8;
        this.b = d8;
        this.g = object2;
        this.c = object;
        this.h = l8;
        this.i = object3;
        this.d = new ax.T3.a((ax.R3.h)object, d8, f8.s().c(ax.X3.i.f));
        l8 = context.getResources();
        this.f = object = new h();
        ((h)object).m(new g());
        object3 = new ax.X3.i(((h)object).d(), l8.getDisplayMetrics(), d8, (ax.Q3.b)object2);
        Object object4 = new ax.b4.a(context, ((h)object).d(), d8, (ax.Q3.b)object2);
        object2 = ((h)object).o(ByteBuffer.class, new ax.U3.c()).o(InputStream.class, new s((ax.Q3.b)object2)).a(ByteBuffer.class, Bitmap.class, new ax.X3.f((ax.X3.i)object3)).a(InputStream.class, Bitmap.class, new m((ax.X3.i)object3, (ax.Q3.b)object2)).a(ParcelFileDescriptor.class, Bitmap.class, new o(d8)).p(Bitmap.class, new ax.X3.d()).a(ByteBuffer.class, BitmapDrawable.class, new ax.X3.a<ByteBuffer>((Resources)l8, d8, new ax.X3.f((ax.X3.i)object3))).a(InputStream.class, BitmapDrawable.class, new ax.X3.a<InputStream>((Resources)l8, d8, new m((ax.X3.i)object3, (ax.Q3.b)object2))).a(ParcelFileDescriptor.class, BitmapDrawable.class, new ax.X3.a<ParcelFileDescriptor>((Resources)l8, d8, new o(d8))).p(BitmapDrawable.class, new b(d8, new ax.X3.d())).l(InputStream.class, ax.b4.c.class, new ax.b4.i(((h)object).d(), (ax.M3.k<ByteBuffer, ax.b4.c>)object4, (ax.Q3.b)object2)).l(ByteBuffer.class, ax.b4.c.class, object4).p(ax.b4.c.class, new ax.b4.d()).b(ax.L3.a.class, ax.L3.a.class, new u.a()).a(ax.L3.a.class, Bitmap.class, new ax.b4.h(d8)).n(new a.a()).b(File.class, ByteBuffer.class, new d.b()).b(File.class, InputStream.class, new f.e()).a(File.class, File.class, new ax.a4.a()).b(File.class, ParcelFileDescriptor.class, new f.b()).b(File.class, File.class, new u.a()).n(new i.a((ax.Q3.b)object2));
        object3 = new r.b((Resources)l8);
        object4 = Integer.TYPE;
        ((h)object2).b(object4, InputStream.class, object3).b(object4, ParcelFileDescriptor.class, new r.a((Resources)l8)).b(Integer.class, InputStream.class, new r.b((Resources)l8)).b(Integer.class, ParcelFileDescriptor.class, new r.a((Resources)l8)).b(String.class, InputStream.class, new e.c()).b(String.class, InputStream.class, new t.b()).b(String.class, ParcelFileDescriptor.class, new t.a()).b(Uri.class, InputStream.class, new b.a()).b(Uri.class, InputStream.class, new a.c(context.getAssets())).b(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).b(Uri.class, InputStream.class, new c.a(context)).b(Uri.class, InputStream.class, new d.a(context)).b(Uri.class, InputStream.class, new v.c(context.getContentResolver())).b(Uri.class, ParcelFileDescriptor.class, new v.a(context.getContentResolver())).b(Uri.class, InputStream.class, new w.a()).b(URL.class, InputStream.class, new e.a()).b(Uri.class, File.class, new k.a(context)).b(ax.U3.g.class, InputStream.class, new a.a()).b(byte[].class, ByteBuffer.class, new b.a()).b(byte[].class, InputStream.class, new b.d()).q(Bitmap.class, BitmapDrawable.class, new ax.c4.b((Resources)l8, d8)).q(Bitmap.class, byte[].class, new ax.c4.a()).q(ax.b4.c.class, byte[].class, new ax.c4.c());
        this.e = new e(context, (h)object, new ax.h4.b(), f8, map, i8, n8);
    }

    private static void a(Context context) {
        if (!m) {
            m = true;
            ax.J3.c.m(context);
            m = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c c(Context context) {
        if (l != null) return l;
        synchronized (c.class) {
            try {
                if (l != null) return l;
                ax.J3.c.a(context);
                return l;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static a d() {
        block6: {
            InstantiationException instantiationException2;
            block5: {
                try {
                    a a8 = (a)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").newInstance();
                    return a8;
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block5;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    break block6;
                }
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", illegalAccessException);
            }
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", instantiationException2);
        }
        if (Log.isLoggable((String)"Glide", (int)5)) {
            Log.w((String)"Glide", (String)"Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
        }
        return null;
    }

    private static l l(Context context) {
        ax.k4.h.e(context, "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return ax.J3.c.c(context).k();
    }

    private static void m(Context context) {
        Object object;
        Object object2;
        Object object3;
        Context context2 = context.getApplicationContext();
        a a8 = ax.J3.c.d();
        Object object4 = Collections.EMPTY_LIST;
        if (a8 == null || a8.c()) {
            object4 = new ax.e4.d(context2).a();
        }
        if (a8 != null && !a8.d().isEmpty()) {
            Set<Class<?>> set = a8.d();
            object3 = object4.iterator();
            while (object3.hasNext()) {
                object2 = object3.next();
                if (!set.contains(object2.getClass())) continue;
                if (Log.isLoggable((String)"Glide", (int)3)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("AppGlideModule excludes manifest GlideModule: ");
                    ((StringBuilder)object).append(object2);
                    Log.d((String)"Glide", (String)((StringBuilder)object).toString());
                }
                object3.remove();
            }
        }
        if (Log.isLoggable((String)"Glide", (int)3)) {
            object2 = object4.iterator();
            while (object2.hasNext()) {
                object3 = object2.next();
                object = new StringBuilder();
                ((StringBuilder)object).append("Discovered GlideModule from manifest: ");
                ((StringBuilder)object).append(object3.getClass());
                Log.d((String)"Glide", (String)((StringBuilder)object).toString());
            }
        }
        object = a8 != null ? a8.e() : null;
        object3 = new d().b((l.b)object);
        object = object4.iterator();
        while (object.hasNext()) {
            ((ax.e4.b)object.next()).a(context2, (d)object3);
        }
        if (a8 != null) {
            a8.b(context2, (d)object3);
        }
        object = ((d)object3).a(context2);
        object4 = object4.iterator();
        while (object4.hasNext()) {
            ((ax.e4.b)object4.next()).b(context2, (c)object, ((c)object).f);
        }
        if (a8 != null) {
            a8.a(context2, (c)object, ((c)object).f);
        }
        context.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)object);
        l = object;
    }

    public static j r(Context context) {
        return ax.J3.c.l(context).d(context);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void n(j object) {
        List<j> list = this.j;
        synchronized (list) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.j.contains(object)) {
                        this.j.add((j)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalStateException("Cannot register already registered manager");
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void o(ax.h4.e<?> e8) {
        List<j> list = this.j;
        synchronized (list) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<j> iterator = this.j.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().v(e8)) continue;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                throw new IllegalStateException("Failed to remove target from managers");
            }
            throw throwable2;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        this.b();
    }

    public void onTrimMemory(int n8) {
        this.p(n8);
    }

    public void p(int n8) {
        ax.k4.i.b();
        this.c.a(n8);
        this.b.a(n8);
        this.g.a(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void q(j object) {
        List<j> list = this.j;
        synchronized (list) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.j.contains(object)) {
                        this.j.remove(object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalStateException("Cannot register not yet registered manager");
                throw object;
            }
            throw throwable2;
        }
    }
}

