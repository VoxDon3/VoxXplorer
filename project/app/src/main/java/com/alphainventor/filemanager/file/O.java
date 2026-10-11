/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.system.ErrnoException;
import android.text.TextUtils;
import ax.N8.B;
import ax.N8.h;
import ax.N8.m;
import ax.Q8.F;
import ax.Q8.g;
import ax.Q8.u;
import ax.R8.f;
import ax.b3.L;
import ax.b3.e;
import ax.b3.i;
import ax.b3.j;
import ax.b3.q;
import ax.b3.s;
import ax.b3.t;
import ax.b3.z;
import ax.c3.H;
import ax.c3.Y;
import ax.c3.d0;
import ax.c3.k0;
import ax.i9.d;
import com.alphainventor.filemanager.file.P;
import com.alphainventor.filemanager.file.Q;
import com.alphainventor.filemanager.file.S;
import com.alphainventor.filemanager.file.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class O {
    private static final Logger i = Logger.getLogger("FileManager.Smb2Client");
    Q a;
    ax.i9.c b;
    ax.r9.b c;
    String d;
    boolean e;
    boolean f;
    boolean g;
    j.ConcurrentHashMap<String, Long> h = new j.ConcurrentHashMap();

    public O(Q q8) {
        this.a = q8;
    }

    private ax.s9.d A(ax.r9.b b8, c c8) throws IOException {
        return ((ax.s9.c)b8.b(c8.a)).e1(c8.b, EnumSet.of(ax.J8.a.z0), null, u.f0, ax.Q8.d.d0, EnumSet.of(ax.Q8.e.e0));
    }

    private ax.s9.b B(ax.r9.b b8, c c8) {
        return ((ax.s9.c)b8.b(c8.a)).c1(c8.b, EnumSet.of(ax.J8.a.m0, ax.J8.a.o0, ax.J8.a.l0, ax.J8.a.n0), null, u.f0, ax.Q8.d.d0, null);
    }

    private ax.s9.d C(ax.r9.b b8, c c8) {
        return ((ax.s9.c)b8.b(c8.a)).e1(c8.b, EnumSet.of(ax.J8.a.y0), null, u.f0, ax.Q8.d.e0, EnumSet.of(ax.Q8.e.e0));
    }

    public static ax.r9.b d(ax.i9.c autoCloseable, boolean bl, String string, int n8, ax.j9.b object) throws ax.k9.d, IOException, L {
        ax.l9.a a8 = O.f((ax.i9.c)autoCloseable, string, n8);
        try {
            autoCloseable = a8.v((ax.j9.b)object);
        }
        catch (ax.T8.b b8) {
            throw new ax.k9.d(b8);
        }
        catch (F f8) {
            if (bl && f8.a() == ax.K8.a.p0) {
                throw new L(f8);
            }
            throw f8;
        }
        string = ((ax.j9.b)object).c();
        object = a8.o0();
        if (((ax.r9.b)autoCloseable).v() && !"GUEST".equalsIgnoreCase(string) && !"SMB2GUESTTESTACCOUNT".equalsIgnoreCase(string) && object != null && ((ax.l9.b)object).l()) {
            ((ax.r9.b)autoCloseable).close();
            i.severe("Bad user mapped to guest!");
            throw new ax.k9.d("Bad user mapped to guest!!");
        }
        return autoCloseable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean e(P object) {
        Object object2;
        block7: {
            block6: {
                if (!this.b.e(((P)object).e, ((P)object).f)) return false;
                long l8 = System.currentTimeMillis();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(((P)object).e);
                ((StringBuilder)object2).append(":");
                ((StringBuilder)object2).append(((P)object).f);
                String string = ((StringBuilder)object2).toString();
                object2 = (Long)this.h.get((Object)string);
                if (object2 != null && l8 - (Long)object2 < 1500L) {
                    return true;
                }
                object2 = null;
                try {
                    object2 = object = O.f(this.b, ((P)object).e, ((P)object).f);
                    object2 = object;
                    f f8 = new f(((ax.l9.a)object).s0().a());
                    object2 = object;
                    f8 = (f)ax.a9.d.a(((ax.l9.a)object).L0(f8), 4000L, TimeUnit.MILLISECONDS, ax.c9.e.q);
                    object2 = object;
                    ((ax.l9.a)object).F(false);
                    object2 = object;
                    if (!((ax.l9.a)object).G0()) break block6;
                    object2 = object;
                    this.h.put((Object)string, (Object)l8);
                }
                catch (ax.k9.d | IOException exception) {
                    break block7;
                }
            }
            object2 = object;
            return ((ax.l9.a)object).G0();
        }
        if (object2 != null) {
            try {
                ((ax.l9.a)object2).F(true);
            }
            catch (Exception exception) {}
        }
        i.severe("SMB2 connection check failed");
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ax.l9.a f(ax.i9.c closeable, String string, int n8) throws ax.k9.d, IOException {
        String var1_3;
        String var2_4;
        if (var2_4 <= 0) return ((ax.i9.c)closeable).a((String)var1_3);
        try {
            return ((ax.i9.c)closeable).b((String)var1_3, (int)var2_4);
        }
        catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
            throw new IOException("SMB connect", nullPointerException);
        }
    }

    public static j g(Exception exception) {
        Object object = exception instanceof F ? (F)exception : (exception instanceof IOException && exception.getCause() instanceof F ? (F)exception.getCause() : null);
        if (object != null) {
            if (O.u((ax.K8.a)(object = ((F)object).a()))) {
                return new t(exception);
            }
            if (O.t((ax.K8.a)object)) {
                return new e(exception);
            }
            if (object == ax.K8.a.H0) {
                return new s(exception);
            }
            if (object == ax.K8.a.U0) {
                return new ax.b3.m(exception);
            }
            if (object == ax.K8.a.R0) {
                return new e(exception);
            }
            if (object == ax.K8.a.y0) {
                return new z(String.format("%s (0x%08x)", ((Enum)object).name(), ((ax.K8.a)object).getValue()), exception);
            }
            if (object != null) {
                if (object != ax.K8.a.y1) {
                    return new i(String.format("%s (0x%08x)", ((Enum)object).name(), ((ax.K8.a)object).getValue()), exception);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("NtStatus : ");
                stringBuilder.append(((ax.K8.a)object).getValue());
                return new j(stringBuilder.toString(), exception);
            }
        }
        if (exception instanceof ConnectException) {
            return new q(exception);
        }
        return new j(exception);
    }

    public static ax.i9.c j(String object, boolean bl, boolean bl2) {
        d.b b8 = ax.i9.d.z();
        b8.k(bl);
        if ("SMB3".equals(object)) {
            b8.i(ax.Q8.g.i0, ax.Q8.g.h0, ax.Q8.g.g0);
            b8.j(true);
        } else if ("SMB2".equals(object)) {
            b8.i(ax.Q8.g.e0, ax.Q8.g.d0);
        } else {
            b8.j(true);
        }
        object = TimeUnit.MILLISECONDS;
        b8.r(35000L, (TimeUnit)((Object)object));
        b8.v(12500L, (TimeUnit)((Object)object));
        b8.n(15000L, (TimeUnit)((Object)object));
        b8.y(15000L, (TimeUnit)((Object)object));
        b8.f(3500L, (TimeUnit)((Object)object));
        b8.m(262144);
        b8.x(262144);
        b8.l().b(bl2);
        return new ax.i9.c(b8.a());
    }

    private static String m(String string) {
        return string.replace('/', '\\');
    }

    public static ax.j9.b n(String string, String string2, String object) {
        object = object == null ? (Object)new char[0] : (Object)((String)object).toCharArray();
        return new ax.j9.b(string2, (char[])object, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.r9.b r() throws ax.k9.d, IOException {
        synchronized (this) {
            P p8;
            block13: {
                Throwable throwable2;
                block12: {
                    boolean bl;
                    AutoCloseable autoCloseable;
                    block11: {
                        try {
                            p8 = this.a.x0();
                            if (!this.g || (autoCloseable = this.b) == null) break block11;
                            ((ax.i9.c)autoCloseable).close();
                            this.b = null;
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                    }
                    if (this.b == null) {
                        this.b = O.j(this.d, this.e, this.f);
                        this.g = false;
                    }
                    if (!this.e(p8)) {
                        this.c = null;
                    }
                    if ((autoCloseable = this.c) != null && !((ax.r9.b)autoCloseable).u() && !this.c.isClosed()) {
                        if (this.v(this.c.g(), p8.b)) return this.c;
                    }
                    if ((autoCloseable = this.c) == null || (bl = ((ax.r9.b)autoCloseable).isClosed())) break block13;
                    try {
                        this.c.close();
                        break block13;
                    }
                    catch (ax.k9.d | IOException exception) {}
                }
                throw throwable2;
            }
            try {
                this.c = O.d(this.b, p8.i, p8.e, p8.f, p8.b);
            }
            catch (L l8) {
                if (l8.getCause() instanceof ax.k9.d) {
                    throw (ax.k9.d)l8.getCause();
                }
                ax.u3.b.f();
                ax.k9.d d8 = new ax.k9.d("not reachable");
                throw d8;
            }
            return this.c;
        }
    }

    private static boolean t(ax.K8.a a8) {
        return a8 == ax.K8.a.s0 || a8 == ax.K8.a.D0;
        {
        }
    }

    private static boolean u(ax.K8.a a8) {
        return a8 == ax.K8.a.o0 || a8 == ax.K8.a.u0 || a8 == ax.K8.a.v0 || a8 == ax.K8.a.x0;
        {
        }
    }

    private boolean v(ax.j9.b b8, ax.j9.b b9) {
        if (b8 == b9) {
            return true;
        }
        if (b8 != null && b9 != null) {
            if (!ax.u3.B.j(b8.c(), b9.c())) {
                return false;
            }
            if (!ax.u3.B.j(b8.b(), b9.b())) {
                return false;
            }
            return ax.u3.B.j(b8.a(), b9.a());
        }
        return false;
    }

    private ax.s9.d y(ax.r9.b b8, c c8) {
        return ((ax.s9.c)b8.b(c8.a)).e1(c8.b, EnumSet.of(ax.J8.a.y0), null, u.f0, ax.Q8.d.h0, EnumSet.of(ax.Q8.e.e0));
    }

    private ax.s9.d z(ax.r9.b object, c c8, int n8) throws IOException, j {
        block5: {
            block8: {
                ax.Q8.d d8;
                EnumSet<ax.J8.a> enumSet;
                block7: {
                    block6: {
                        block3: {
                            block4: {
                                block2: {
                                    if ((0x20000000 & n8) == 0) break block2;
                                    enumSet = EnumSet.of(ax.J8.a.y0);
                                    break block3;
                                }
                                if ((0x10000000 & n8) == 0) break block4;
                                enumSet = EnumSet.of(ax.J8.a.z0);
                                break block3;
                            }
                            if ((0x30000000 & n8) == 0) break block5;
                            enumSet = EnumSet.of(ax.J8.a.z0, ax.J8.a.y0);
                        }
                        if ((0x4000000 & n8) == 0) break block6;
                        d8 = ax.Q8.d.h0;
                        break block7;
                    }
                    if ((0x2000000 & n8) != 0) break block8;
                    d8 = ax.Q8.d.d0;
                }
                return ((ax.s9.c)((ax.r9.b)object).b(c8.a)).e1(c8.b, enumSet, null, u.f0, d8, EnumSet.of(ax.Q8.e.l0));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Not supported mode :");
            ((StringBuilder)object).append(n8);
            throw new t(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Not supported mode :");
        ((StringBuilder)object).append(n8);
        throw new t(((StringBuilder)object).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ax.l3.a D(String object, int n8) throws j {
        F f82;
        block6: {
            Exception var1_5;
            block5: {
                Logger logger = i;
                Object object2 = new StringBuilder();
                ((StringBuilder)object2).append("Open SMB2 proxy file : ");
                ((StringBuilder)object2).append((String)object);
                logger.fine(((StringBuilder)object2).toString());
                try {
                    object2 = this.r();
                    object = com.alphainventor.filemanager.file.O$c.b((String)object);
                    if (((c)object).b != null) {
                        return new d(this.z((ax.r9.b)object2, (c)object, n8));
                    }
                }
                catch (ax.k9.d d8) {
                    break block5;
                }
                catch (IOException iOException) {
                    break block5;
                }
                catch (F f82) {
                    break block6;
                }
                object = new j("SMB Share cannot be target");
                throw object;
            }
            var1_5.printStackTrace();
            throw ax.b3.d.b("smb2 getoutputstream", (Exception)var1_5);
        }
        f82.printStackTrace();
        throw O.g(f82);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void E(n object, long l8) throws j {
        Throwable throwable222;
        Object object2;
        block12: {
            F f8222;
            Object object3;
            block14: {
                Exception var1_4;
                Object object4;
                block13: {
                    Object object5;
                    ax.s9.g g8;
                    ax.s9.g g9;
                    Object object6;
                    Object object7;
                    block11: {
                        object7 = null;
                        object6 = null;
                        g9 = null;
                        g8 = null;
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        ax.r9.b b8 = this.r();
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        object = com.alphainventor.filemanager.file.O$c.a((n)object);
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        if (((c)object).b == null) break block11;
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        object2 = object = this.B(b8, (c)object);
                        object5 = object;
                        object4 = object;
                        object3 = object;
                        object2 = object;
                        object5 = object;
                        object4 = object;
                        object3 = object;
                        object6 = ax.N8.e.f;
                        object2 = object;
                        object5 = object;
                        object4 = object;
                        object3 = object;
                        object7 = new ax.N8.e((ax.J8.b)object6, (ax.J8.b)object6, ax.J8.b.d(l8), (ax.J8.b)object6, 0L);
                        object2 = object;
                        object5 = object;
                        object4 = object;
                        object3 = object;
                        ((ax.s9.b)object).o0(object7);
                        try {
                            ((ax.s9.g)object).close();
                            return;
                        }
                        catch (Exception exception) {
                            return;
                        }
                    }
                    object2 = g8;
                    object5 = object7;
                    object4 = object6;
                    object3 = g9;
                    try {
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        object = new j("SMB Share cannot be target");
                        object2 = g8;
                        object5 = object7;
                        object4 = object6;
                        object3 = g9;
                        throw object;
                    }
                    catch (Throwable throwable222) {
                        break block12;
                    }
                    catch (ax.k9.d d8) {
                        object4 = object5;
                        break block13;
                    }
                    catch (IOException iOException) {
                        break block13;
                    }
                    catch (F f8222) {
                        break block14;
                    }
                }
                object2 = object4;
                var1_4.printStackTrace();
                object2 = object4;
                throw ax.b3.d.b("smb2 setLastModified", (Exception)var1_4);
            }
            object2 = object3;
            f8222.printStackTrace();
            object2 = object3;
            throw O.g(f8222);
        }
        if (object2 == null) throw throwable222;
        try {
            ((ax.s9.g)object2).close();
        }
        catch (Exception exception) {
            throw throwable222;
        }
        throw throwable222;
    }

    public void F(String string, boolean bl, boolean bl2) {
        this.d = string;
        this.e = bl;
        this.f = bl2;
    }

    public boolean h(n object) {
        ax.r9.b b8;
        block3: {
            b8 = this.r();
            object = com.alphainventor.filemanager.file.O$c.b(((n)object).E());
            if (((c)object).b != null) break block3;
            return false;
        }
        try {
            this.C(b8, (c)object).close();
            return true;
        }
        catch (ax.k9.d | IOException exception) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean i(n object) {
        RuntimeException var1_4;
        ax.r9.b b8;
        block4: {
            b8 = this.r();
            object = com.alphainventor.filemanager.file.O$c.b(((n)object).E());
            if (((c)object).b != null) break block4;
            return false;
        }
        try {
            ((ax.s9.c)b8.b(((c)object).a)).b1(((c)object).b);
            return true;
        }
        catch (ax.k9.d d8) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        var1_4.printStackTrace();
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(n object) throws j {
        Throwable var1_5;
        c c8;
        AutoCloseable autoCloseable;
        try {
            autoCloseable = this.r();
            c8 = com.alphainventor.filemanager.file.O$c.a((n)object);
            if (c8.b == null) {
                object = new j("SMB Share cannot be deleted");
                throw object;
            }
            autoCloseable = (ax.s9.c)((ax.r9.b)autoCloseable).b(c8.a);
            if (object.isDirectory()) {
                ((ax.s9.c)autoCloseable).i1(c8.b, false);
                return;
            }
        }
        catch (ax.k9.d d8) {
            throw new j((Throwable)var1_5);
        }
        catch (IOException iOException) {
            throw new j((Throwable)var1_5);
        }
        catch (F f8) {
            throw O.g(f8);
        }
        ((ax.s9.c)autoCloseable).h1(c8.b);
    }

    void l() {
        ax.r9.b b8 = this.c;
        if (b8 != null && !b8.isClosed()) {
            this.c.f();
        }
        this.g = true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public S o(String string) throws j {
        F f82;
        block11: {
            Exception var1_5;
            block10: {
                StringIndexOutOfBoundsException stringIndexOutOfBoundsException2;
                block9: {
                    try {
                        if ("/".equals(string)) {
                            return S.g0(this.a, string);
                        }
                    }
                    catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException2) {
                        break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        break block10;
                    }
                    catch (ax.k9.d d8) {
                        break block10;
                    }
                    catch (IOException iOException) {
                        break block10;
                    }
                    catch (F f82) {
                        break block11;
                    }
                    Object object = this.r();
                    Object object2 = com.alphainventor.filemanager.file.O$c.b(string);
                    if ((object = ((ax.r9.b)object).b(((c)object2).a)) instanceof ax.s9.c) {
                        object = ((ax.s9.c)object).L0(((c)object2).b);
                        return new S(this.a, string, (ax.N8.c)object);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("This type of share is not supported : ");
                    stringBuilder.append(object.getClass().getName());
                    object2 = new j(stringBuilder.toString());
                    throw object2;
                }
                ax.Ha.b b8 = ax.Ha.c.h().f().b("SMB INVALID SHARENAME");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("path:");
                stringBuilder.append(string);
                b8.g(stringBuilder.toString()).h();
                throw ax.b3.d.b("smb2 getfileinfo 2", stringIndexOutOfBoundsException2);
            }
            var1_5.printStackTrace();
            throw ax.b3.d.b("smb2 getfileinfo", (Exception)var1_5);
        }
        if (O.u(f82.a())) {
            return S.f0(this.a, string, false);
        }
        f82.printStackTrace();
        throw O.g(f82);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream p(n object, long l8) throws j {
        F f82;
        block6: {
            Exception var1_3;
            block5: {
                try {
                    c c8 = com.alphainventor.filemanager.file.O$c.a((n)object);
                    if (c8.b != null) {
                        ax.r9.b b8 = this.r();
                        return new a(this, b8, this.A(b8, c8), c8, l8, object.p());
                    }
                }
                catch (ax.k9.d d8) {
                    break block5;
                }
                catch (IOException iOException) {
                    break block5;
                }
                catch (F f82) {
                    break block6;
                }
                ax.Ha.c.h().f().b("Invalid SMB File Path").j().g(((n)object).E()).h();
                object = new j("Invalid File Path!!");
                throw object;
            }
            var1_3.printStackTrace();
            throw O.g((Exception)var1_3);
        }
        f82.printStackTrace();
        throw O.g(f82);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OutputStream q(n object, boolean bl) throws j {
        F f82;
        block7: {
            Exception var1_5;
            block6: {
                ax.r9.b b8;
                try {
                    b8 = this.r();
                    object = com.alphainventor.filemanager.file.O$c.a((n)object);
                    if (((c)object).b == null) {
                        object = new j("SMB Share cannot be target");
                        throw object;
                    }
                    if (bl) {
                        object = this.y(b8, (c)object);
                        return new b(b8, (ax.s9.d)object);
                    }
                }
                catch (ax.k9.d d8) {
                    break block6;
                }
                catch (IOException iOException) {
                    break block6;
                }
                catch (F f82) {
                    break block7;
                }
                object = this.C(b8, (c)object);
                return new b(b8, (ax.s9.d)object);
            }
            var1_5.printStackTrace();
            throw ax.b3.d.b("smb2 getoutputstream", (Exception)var1_5);
        }
        f82.printStackTrace();
        throw O.g(f82);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public k0 s(n object) throws j {
        F f82;
        block10: {
            Throwable var1_8;
            block9: {
                try {
                    ax.r9.b b8 = this.r();
                    object = com.alphainventor.filemanager.file.O$c.a((n)object).a;
                    if (object != null) {
                        object = ((ax.s9.c)b8.b((String)object)).Y0();
                        long l8 = ((B)object).b();
                        return new k0(l8, l8 - ((B)object).a());
                    }
                }
                catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block9;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    break block9;
                }
                catch (ax.k9.d d8) {
                    break block9;
                }
                catch (IOException iOException) {
                    break block9;
                }
                catch (ClassCastException classCastException) {
                    break block9;
                }
                catch (F f82) {
                    break block10;
                }
                object = new j();
                throw object;
            }
            var1_8.printStackTrace();
            throw new j((Throwable)var1_8);
        }
        object = i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SMBApiException:");
        stringBuilder.append(f82.a());
        ((Logger)object).severe(stringBuilder.toString());
        throw O.g(f82);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> w(n object) throws j {
        Object object2;
        ArrayList<n> arrayList;
        Object object32;
        block12: {
            F f82;
            block14: {
                Throwable var1_8;
                block13: {
                    block11: {
                        try {
                            object32 = this.r();
                            arrayList = new ArrayList<n>();
                            object2 = ((n)object).E();
                            if (!"/".equals(object2)) break block11;
                            object = ax.za.c.f0.h((ax.r9.b)object32);
                            object2 = new ax.ta.a((ax.za.a)object);
                            object32 = ((ax.ta.a)object2).g().iterator();
                            break block12;
                        }
                        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                            break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            break block13;
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            break block13;
                        }
                        catch (ax.k9.d d8) {
                            break block13;
                        }
                        catch (IOException iOException) {
                            break block13;
                        }
                        catch (ClassCastException classCastException) {
                            break block13;
                        }
                        catch (F f82) {
                            break block14;
                        }
                    }
                    object = com.alphainventor.filemanager.file.O$c.a(object);
                    for (Object object32 : ((ax.s9.c)((ax.r9.b)object32).b(((c)object).a)).Z0(((c)object).b)) {
                        Object object4 = ((h)object32).a();
                        if (d0.C((String)object4) || TextUtils.isEmpty((CharSequence)object4)) continue;
                        if (((String)object4).endsWith("/")) {
                            ax.Ha.c.h().f().b("INVALID SMB2 FILENAME").g(object4).h();
                            continue;
                        }
                        String string = d0.Q((String)object2, (String)object4);
                        object4 = new S(this.a, string, (m)object32);
                        arrayList.add((n)object4);
                    }
                    return arrayList;
                }
                var1_8.printStackTrace();
                throw new j((Throwable)var1_8);
            }
            Logger logger = i;
            object = new StringBuilder();
            ((StringBuilder)object).append("SMBApiException:");
            ((StringBuilder)object).append(f82.a());
            logger.severe(((StringBuilder)object).toString());
            throw O.g(f82);
        }
        while (object32.hasNext()) {
            object2 = (ax.ua.b)object32.next();
            if (((ax.ua.b)object2).d() != 0 && ((ax.ua.b)object2).d() != Integer.MIN_VALUE) continue;
            object = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/");
            stringBuilder.append(((ax.ua.c)object2).b());
            arrayList.add(S.g0((Q)object, stringBuilder.toString()));
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void x(n object, n object2) throws j {
        block9: {
            Throwable var1_3;
            Throwable throwable2;
            block12: {
                block10: {
                    block11: {
                        ax.r9.b b8 = this.r();
                        c c8 = com.alphainventor.filemanager.file.O$c.a((n)object);
                        if (c8.b == null) break block9;
                        object = ((ax.s9.c)b8.b(c8.a)).c1(c8.b, EnumSet.of(ax.J8.a.l0, ax.J8.a.p0, ax.J8.a.t0), null, u.f0, ax.Q8.d.d0, null);
                        try {
                            object2 = com.alphainventor.filemanager.file.O$c.a((n)object2);
                            if (((c)object2).b == null) break block10;
                            if (!c8.a.equals(((c)object2).a)) break block11;
                            ((ax.s9.b)object).A(((c)object2).b, false);
                        }
                        catch (Throwable throwable2) {}
                        ((ax.s9.g)object).close();
                        return;
                    }
                    object2 = new j("SMB cannot move to different share!");
                    throw object2;
                    break block12;
                }
                object2 = new j("SMB Share cannot be target");
                throw object2;
            }
            try {
                ((ax.s9.g)object).close();
                throw throwable2;
            }
            catch (ax.k9.d d8) {
                throw new j((Throwable)var1_3);
            }
            catch (IOException iOException) {
                throw new j((Throwable)var1_3);
            }
            catch (F f8) {
                throw O.g(f8);
            }
        }
        object = new j("SMB Share cannot be moved");
        throw object;
    }

    static class a
    extends H {
        O c0;
        ax.r9.b d0;
        ax.s9.d e0;
        c f0;
        long g0;
        long h0;
        long i0;

        a(O o8, ax.r9.b b8, ax.s9.d d8, c c8, long l8, long l9) {
            super(d8.u0(l8, null, l9));
            this.d0 = b8;
            this.e0 = d8;
            this.f0 = c8;
            this.c0 = o8;
            this.g0 = l8;
            this.i0 = l9;
        }

        private void b() throws IOException {
            try {
                ax.r9.b b8 = this.c0.r();
                ax.s9.d d8 = this.c0.A(b8, this.f0);
                InputStream inputStream = d8.u0(this.g0, null, this.i0);
                inputStream.skip(this.h0);
                this.a(inputStream);
                this.e0 = d8;
                this.d0 = b8;
                return;
            }
            catch (ax.k9.d d9) {
                throw new IOException(d9);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public void close() throws IOException {
            try {
                super.close();
                this.e0.close();
                return;
            }
            catch (ax.k9.d d8) {}
            finally {
                Throwable throwable;
                throw throwable;
            }
        }

        @Override
        public int read() throws IOException {
            int n8;
            if (this.d0.isClosed() || !this.e0.p().q()) {
                this.b();
            }
            if ((n8 = super.read()) >= 0) {
                ++this.h0;
            }
            return n8;
        }

        @Override
        public int read(byte[] byArray) throws IOException {
            return this.read(byArray, 0, byArray.length);
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            if (this.d0.isClosed() || !this.e0.p().q()) {
                this.b();
            }
            if ((n8 = super.read(byArray, n8, n9)) >= 0) {
                this.h0 += (long)n8;
            }
            return n8;
        }

        @Override
        public long skip(long l8) throws IOException {
            l8 = super.skip(l8);
            this.h0 += l8;
            return l8;
        }
    }

    static class b
    extends Y {
        ax.s9.d c0;
        ax.r9.b d0;

        b(ax.r9.b b8, ax.s9.d d8) {
            super(d8.F0(false));
            this.d0 = b8;
            this.c0 = d8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void close() throws IOException {
            try {
                super.close();
            }
            catch (ax.k9.d d8) {
                d8.printStackTrace();
                throw new IOException(d8);
            }
            try {
                this.c0.close();
                return;
            }
            catch (ax.k9.d d9) {}
            finally {
                Throwable throwable;
                throw throwable;
            }
        }

        @Override
        public void flush() throws IOException {
            try {
                super.flush();
                return;
            }
            catch (ax.k9.d d8) {
                throw new IOException(d8);
            }
        }

        @Override
        public void write(int n8) throws IOException {
            try {
                super.write(n8);
                return;
            }
            catch (ax.k9.d d8) {
                throw new IOException(d8);
            }
        }

        @Override
        public void write(byte[] byArray) throws IOException {
            try {
                super.write(byArray);
                return;
            }
            catch (ax.k9.d d8) {
                throw new IOException(d8);
            }
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) throws IOException {
            try {
                super.write(byArray, n8, n9);
                return;
            }
            catch (ax.k9.d d8) {
                throw new IOException(d8);
            }
        }
    }

    private static class c {
        String a;
        String b;

        c(String string, String string2) {
            this.a = string;
            this.b = string2;
        }

        static c a(n n8) {
            return com.alphainventor.filemanager.file.O$c.b(n8.E());
        }

        static c b(String string) {
            if ("/".equals(string)) {
                return new c(null, null);
            }
            int n8 = string.indexOf("/", 1);
            if (n8 < 0) {
                return new c(string.substring(1), null);
            }
            return new c(string.substring(1, n8), O.m(string.substring(n8 + 1)));
        }
    }

    static class d
    extends ax.l3.a {
        private final boolean a;
        private final byte[] b = new byte[4096];
        private int c = -1;
        private long d = -1L;
        private final ax.s9.d e;

        d(ax.s9.d d8) {
            this.a = true;
            this.e = d8;
        }

        private int f(long l8, byte[] byArray, int n8, int n9) {
            int n10 = (int)(l8 - this.d);
            int n11 = this.c - n10;
            int n12 = n9;
            if (n9 > n11) {
                n12 = n11;
            }
            System.arraycopy(this.b, n10, byArray, n8, n12);
            return n12;
        }

        private boolean g(long l8, int n8) {
            long l9 = this.d;
            return l8 >= l9 && l8 + (long)n8 <= l9 + (long)this.c;
        }

        private boolean h(int n8) {
            return n8 <= 2048;
        }

        @Override
        public void a() throws ErrnoException {
        }

        @Override
        public long b() throws ErrnoException {
            return this.e.q().b().a();
        }

        /*
         * Exception decompiling
         */
        @Override
        public int c(long var1_1, byte[] var3_2, int var4_6, int var5_7) throws ErrnoException {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 105->136)] ax.k9.d
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        public void d() {
            try {
                this.e.close();
                return;
            }
            catch (ax.k9.d d8) {
                d8.printStackTrace();
                return;
            }
        }

        @Override
        public long e(long l8, byte[] byArray, int n8, int n9) throws ErrnoException {
            try {
                l8 = this.e.T0(byArray, l8, n8, n9);
                return l8;
            }
            catch (ax.k9.d d8) {
                throw com.alphainventor.filemanager.provider.a.a(O.g(d8), "onWrite");
            }
        }
    }
}

