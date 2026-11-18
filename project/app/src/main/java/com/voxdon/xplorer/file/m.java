/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import ax.X2.Q;
import ax.Z2.t;
import ax.b3.a;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.f0;
import ax.c3.k0;
import ax.c3.v;
import ax.c3.z;
import ax.g3.h;
import ax.g3.i;
import ax.u3.b;
import ax.u3.q;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

public abstract class m
implements c {
    private static boolean g = false;
    private Context a;
    private K b;
    private Set<String> c = java.util.DesugarCollections.synchronizedSet(new HashSet());
    private Set<String> d = java.util.DesugarCollections.synchronizedSet(new HashSet());
    private final Object e = new Object();
    private ReentrantLock f = new ReentrantLock();

    protected m() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream R(String string) {
        Exception exception2;
        block7: {
            File file;
            ax.u3.c c8;
            try {
                c8 = this.z(string);
                file = ((n)((Object)c8)).Z();
                if (B.G(file, (n)((Object)c8))) {
                    t.b().e(file);
                    return new FileInputStream(file);
                }
                this.d.add(string);
            }
            catch (Exception exception2) {
                break block7;
            }
            try {
                InputStream inputStream = this.J((n)((Object)c8), 0L);
                long l8 = c8.p();
                c8 = new ax.u3.c(){
                    final String a;
                    final m b;
                    {
                        this.b = m8;
                        this.a = string;
                    }

                    @Override
                    public boolean isCancelled() {
                        return this.b.d.contains(this.a) ^ true;
                    }
                };
                F.f(inputStream, file, l8, c8);
                t.b().c(file);
                t.b().a();
                return new FileInputStream(file);
            }
            finally {
                this.d.remove(string);
            }
        }
        exception2.printStackTrace();
        return null;
    }

    public static String S(n n8) {
        return B.Y(n8);
    }

    private InputStream T(MediaDataSource mediaDataSource) {
        if ((mediaDataSource = ax.u3.B.h(mediaDataSource, 512)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
        mediaDataSource.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream U(String string) throws a {
        Throwable throwable2222;
        block4: {
            AutoCloseable autoCloseable;
            try {
                n n8 = this.z(string);
                this.d.add(string);
                ax.u3.c c8 = new ax.u3.c(){
                    final String a;
                    final m b;
                    {
                        this.b = m8;
                        this.a = string;
                    }

                    @Override
                    public boolean isCancelled() {
                        return this.b.d.contains(this.a) ^ true;
                    }
                };
                Q.t1();
                autoCloseable = new f0(this, n8, c8);
                autoCloseable = this.T((MediaDataSource)autoCloseable);
                if (autoCloseable == null && c8.isCancelled()) {
                    c8 = new a();
                    throw c8;
                }
            }
            catch (Throwable throwable2222) {
                break block4;
            }
            catch (j j8) {
                this.d.remove(string);
                return null;
            }
            this.d.remove(string);
            return autoCloseable;
        }
        this.d.remove(string);
        throw throwable2222;
    }

    public static void X(Context context) {
        if (!g && context != null && ax.u3.B.g0(context)) {
            g = true;
        }
    }

    public static boolean k(Collection<n> object, n n8) {
        object = object.iterator();
        while (object.hasNext()) {
            n n9 = (n)object.next();
            if (!n8.E().equals(n9.E())) continue;
            return true;
        }
        return false;
    }

    public boolean V() {
        return false;
    }

    public void W(Context context, K k8) {
        this.a = context;
        this.b = k8;
    }

    public boolean Y() {
        return false;
    }

    protected boolean Z(n object) {
        Object object2 = ((n)object).G();
        if (z.f0 == object2) {
            object2 = ((n)object).A();
            if (A.O((String)object2)) {
                if ("dng".equals(object2)) {
                    return true;
                }
                object = B.Y((n)object);
                return ax.r3.d.l(this.p(), (String)object) != null;
            }
            return true;
        }
        return z.e0 == object2 && Q.r0();
    }

    public boolean a0(n n8) {
        return true;
    }

    public List<n> b0(n n8) throws j {
        return this.C(n8, com.voxdon.xplorer.file.m$f.q);
    }

    public boolean c0() {
        return false;
    }

    protected void d0(c.a a8, boolean bl, Object object) {
        if (a8 == null) {
            return;
        }
        this.f0(new Runnable(){
            final boolean c0;
            final Object d0;
            final m e0;
            final c.a q;
            {
                this.e0 = m8;
                this.q = a8;
                this.c0 = bl;
                this.d0 = object;
            }

            @Override
            public void run() {
                this.q.T(this.c0, this.d0);
            }
        });
    }

    public ax.l3.a e0(String string, int n8) throws j {
        ax.u3.b.g("Proxy file is not supported");
        throw new ax.b3.t("Proxy file is not supported");
    }

    public void f(String string) {
        this.d.remove(string);
    }

    protected void f0(Runnable runnable2) {
        ax.u3.B.a0(runnable2);
    }

    public void g() {
        this.c.clear();
    }

    public boolean g0() {
        return false;
    }

    public void h(c.a a8) {
        this.K(null, null, a8);
    }

    public boolean h0() {
        return false;
    }

    protected void i() {
        this.f.lock();
    }

    public boolean i0() {
        return true;
    }

    protected void j() {
        this.f.unlock();
    }

    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, a {
        ax.u3.b.f();
        throw new j("Not supported");
    }

    /*
     * WARNING - void declaration
     */
    protected boolean l(n n8) {
        RuntimeException var1_3;
        if (n8.n()) {
            return false;
        }
        try {
            this.D(n8, F.e(new byte[0]), n8.s(), 0L, null, null, true, null, null);
            return true;
        }
        catch (a a8) {
        }
        catch (j j8) {}
        var1_3.printStackTrace();
        return false;
    }

    abstract void m(n var1, String var2, boolean var3, boolean var4, h var5, ax.u3.c var6) throws j;

    public void n(n n8) throws j {
        ax.Ha.b b8 = ax.Ha.c.h().f().b("FILL FILE SIZE");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Loation:");
        stringBuilder.append(n8.P().I());
        b8.g(stringBuilder.toString()).h();
        throw new j("Not supported");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void o(n list, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) {
        Stack<Object> stack = new Stack<Object>();
        stack.push(list);
        while (!((AbstractCollection)stack).isEmpty()) {
            j j82;
            block10: {
                Object object2;
                n n8;
                block9: {
                    block8: {
                        n8 = (n)stack.pop();
                        if (c8 != null && c8.isCancelled()) {
                            return;
                        }
                        try {
                            if (!ax.Q2.f.E0(n8.P(), n8)) break block8;
                            object2 = ax.Z2.b.k().g(n8);
                            list = object2;
                            if (object2 == null) {
                                list = this.b0(n8);
                                ax.Z2.b.k().m(n8, list);
                            }
                            break block9;
                        }
                        catch (j j82) {
                            break block10;
                        }
                    }
                    list = this.b0(n8);
                }
                if (list == null) {
                    return;
                }
                object2 = ax.c3.q.g(list, ax.c3.q.c("Search"));
                boolean bl3 = B.P(n8);
                list = B.h(object2, string, bl, bl3);
                if (bl2) {
                    for (Object object2 : B.h(object2, null, bl, bl3)) {
                        if (!object2.isDirectory() || J.j2(n8)) continue;
                        stack.push(object2);
                    }
                }
                bl3 = ((AbstractCollection)stack).isEmpty();
                if ((list == null || list.isEmpty()) && !bl3) continue;
                h8.Y(list, bl3);
                continue;
            }
            j82.printStackTrace();
        }
    }

    public Context p() {
        return this.a;
    }

    public long q() throws j {
        long l8;
        k0 k02;
        if (this.Y() && (k02 = this.y()) != null && k02.b != 0L && (l8 = k02.d) >= 0L) {
            return l8;
        }
        return -1L;
    }

    public String r() {
        return this.b.e();
    }

    public G s(n n8) {
        return new e(this, n8);
    }

    public int t() {
        return this.b.b();
    }

    public ax.Q2.f u() {
        return this.b.d();
    }

    public K v() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected InputStream w(String object, String string) {
        String var2_12;
        if (!this.a()) {
            return null;
        }
        if (this.c.contains(var2_12)) {
            return null;
        }
        Object object2 = d0.k((String)var2_12);
        z z8 = A.g((String)object2);
        try {
            Object var1_10;
            block10: {
                block12: {
                    block11: {
                        block9: {
                            if (z8 != z.f0) break block9;
                            if (A.S((String)object2)) {
                                int n8 = (int)(ax.u3.B.s(this.p()) * 128.0f);
                                Object object3 = object2 = ax.r3.c.e(this.R((String)var2_12), n8);
                                if (object2 == null) {
                                    InputStream inputStream = ax.r3.b.n();
                                }
                                break block10;
                            } else {
                                InputStream inputStream = this.R((String)var2_12);
                            }
                            break block10;
                        }
                        if (z8 != z.e0) break block11;
                        if (!Q.r0()) break block12;
                        InputStream inputStream = this.U((String)var2_12);
                        break block10;
                    }
                    String string2 = v.g((String)object2, "");
                    if (!A.I(string2) && !A.U(string2)) {
                        ax.u3.b.f();
                    }
                }
                Object var1_8 = null;
            }
            if (var1_10 == null) {
                this.c.add((String)var2_12);
            }
            return var1_10;
        }
        catch (a a8) {
            return null;
        }
    }

    public String x() {
        return this.b.e();
    }

    public k0 y() throws j {
        return null;
    }

    protected static class d
    extends q<Long, Long, Long> {
        m h;

        public d(m m8) {
            super(q.e.e0);
            this.h = m8;
        }

        protected Long w(Long ... longArray) {
            if (this.h.a()) {
                this.h.b();
            }
            return null;
        }
    }

    protected class e
    extends G {
        n a;
        final m b;

        e(m m8, n n8) {
            this.b = m8;
            this.a = n8;
        }

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public InputStream c(long l8) throws j {
            return this.b.J(this.a, l8);
        }

        @Override
        public long d() {
            return this.a.p();
        }

        public K e() {
            return this.b.v();
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        private static final f[] d0;
        public static final /* enum */ f q;

        static {
            q = new f();
            c0 = new f();
            d0 = com.voxdon.xplorer.file.m$f.d();
        }

        private static /* synthetic */ f[] d() {
            return new f[]{q, c0};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])d0.clone();
        }
    }
}

