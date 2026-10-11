/*
 * Decompiled with CFR 0.152.
 */
package ax.f7;

import ax.f7.c;
import ax.f7.d;
import ax.i7.B;
import ax.i7.e;
import ax.i7.f;
import ax.i7.g;
import ax.i7.i;
import ax.i7.m;
import ax.i7.p;
import ax.i7.q;
import ax.i7.r;
import ax.i7.s;
import ax.i7.w;
import ax.i7.y;
import ax.m7.k;
import ax.m7.v;
import ax.m7.x;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class b {
    private b a = ax.f7.b$b.q;
    private final ax.i7.b b;
    private final q c;
    private final w d;
    private i e;
    private long f;
    private boolean g;
    private String h = "POST";
    private m i = new m();
    private p j;
    private InputStream k;
    private boolean l;
    private c m;
    String n = "*";
    private long o;
    private int p = 0xA00000;
    private Byte q;
    private long r;
    private int s;
    private byte[] t;
    private boolean u;
    x v = x.a;

    public b(ax.i7.b object, w w8, r r8) {
        this.b = ax.m7.v.d(object);
        this.d = ax.m7.v.d(w8);
        object = r8 == null ? w8.c() : w8.d(r8);
        this.c = object;
    }

    private a a() throws IOException {
        Object object;
        Object object2;
        int n8 = this.j() ? (int)Math.min((long)this.p, this.f() - this.o) : this.p;
        if (this.j()) {
            this.k.mark(n8);
            object2 = this.k;
            long l8 = n8;
            object2 = ax.m7.d.b((InputStream)object2, l8);
            object2 = new y(this.b.a(), (InputStream)object2).j(true).i(l8).h(false);
            this.n = String.valueOf(this.f());
        } else {
            int n9;
            int n10;
            int n11;
            object2 = this.t;
            if (object2 == null) {
                object = this.q;
                n11 = object == null ? n8 + 1 : n8;
                object2 = new byte[n8 + 1];
                this.t = object2;
                if (object != null) {
                    object2[0] = (Byte)object;
                }
                n10 = 0;
                n9 = n11;
                n11 = n10;
            } else {
                n11 = (int)(this.r - this.o);
                System.arraycopy(object2, this.s - n11, object2, 0, n11);
                object2 = this.q;
                if (object2 != null) {
                    this.t[n11] = object2.byteValue();
                }
                n9 = n8 - n11;
            }
            n10 = ax.m7.d.c(this.k, this.t, n8 + 1 - n9, n9);
            if (n10 < n9) {
                n8 = n11 += Math.max(0, n10);
                if (this.q != null) {
                    n8 = n11 + 1;
                    this.q = null;
                }
                n8 = n11 = n8;
                if (this.n.equals("*")) {
                    this.n = String.valueOf(this.o + (long)n11);
                    n8 = n11;
                }
            } else {
                this.q = this.t[n8];
            }
            object2 = new ax.i7.c(this.b.a(), this.t, 0, n8);
            this.r = this.o + (long)n8;
        }
        this.s = n8;
        if (n8 == 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("bytes */");
            ((StringBuilder)object).append(this.n);
            object = ((StringBuilder)object).toString();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("bytes ");
            ((StringBuilder)object).append(this.o);
            ((StringBuilder)object).append("-");
            ((StringBuilder)object).append(this.o + (long)n8 - 1L);
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(this.n);
            object = ((StringBuilder)object).toString();
        }
        return new a((ax.i7.b)object2, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private s b(g object) throws IOException {
        Throwable throwable2;
        block5: {
            block4: {
                this.t(ax.f7.b$b.e0);
                i i8 = this.b;
                if (this.e != null) {
                    i8 = new B().j(Arrays.asList(this.e, this.b));
                    ((k)object).d("uploadType", "multipart");
                } else {
                    ((k)object).d("uploadType", "media");
                }
                object = this.c.c(this.h, (g)object, i8);
                ((p)object).f().putAll(this.i);
                object = this.c((p)object);
                try {
                    if (!this.j()) break block4;
                    this.o = this.f();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            this.t(ax.f7.b$b.f0);
            return object;
        }
        ((s)object).a();
        throw throwable2;
    }

    private s c(p p8) throws IOException {
        if (!this.u && !(p8.c() instanceof e)) {
            p8.u(new f());
        }
        return this.d(p8);
    }

    private s d(p p8) throws IOException {
        new ax.b7.a().a(p8);
        p8.C(false);
        return p8.b();
    }

    private s e(g object) throws IOException {
        i i8;
        this.t(ax.f7.b$b.c0);
        ((k)object).d("uploadType", "resumable");
        i i9 = i8 = this.e;
        if (i8 == null) {
            i9 = new e();
        }
        object = this.c.c(this.h, (g)object, i9);
        this.i.B("X-Upload-Content-Type", this.b.a());
        if (this.j()) {
            this.i.B("X-Upload-Content-Length", this.f());
        }
        ((p)object).f().putAll(this.i);
        object = this.c((p)object);
        try {
            this.t(ax.f7.b$b.d0);
            return object;
        }
        catch (Throwable throwable) {
            ((s)object).a();
            throw throwable;
        }
    }

    private long f() throws IOException {
        if (!this.g) {
            this.f = this.b.getLength();
            this.g = true;
        }
        return this.f;
    }

    private long g(String string) {
        if (string == null) {
            return 0L;
        }
        return Long.parseLong(string.substring(string.indexOf(45) + 1)) + 1L;
    }

    private boolean j() throws IOException {
        return this.f() >= 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private s k(g object) throws IOException {
        Throwable throwable2;
        Object object2;
        Object object3;
        block16: {
            if (!((s)(object = this.e((g)object))).l()) {
                return object;
            }
            try {
                object3 = new g(((s)object).f().r());
                object2 = this.b.e();
                this.k = object2;
                object = object3;
                if (((InputStream)object2).markSupported()) break block16;
                object = object3;
                if (this.j()) {
                    this.k = new BufferedInputStream(this.k);
                    object = object3;
                }
            }
            finally {
                ((s)object).a();
            }
        }
        while (true) {
            block17: {
                block18: {
                    object3 = this.a();
                    this.j = object2 = this.c.b((g)object, null);
                    ((p)object2).t(((a)object3).a());
                    this.j.f().H(((a)object3).b());
                    new d(this, this.j);
                    object3 = this.j() ? this.d(this.j) : this.c(this.j);
                    try {
                        if (!((s)object3).l()) break block17;
                        this.o = this.f();
                        if (!this.b.d()) break block18;
                        this.k.close();
                    }
                    catch (Throwable throwable2) {
                        break;
                    }
                }
                this.t(ax.f7.b$b.f0);
                return object3;
            }
            if (((s)object3).h() != 308) {
                if (this.b.d()) {
                    this.k.close();
                }
                return object3;
            }
            object2 = ((s)object3).f().r();
            if (object2 != null) {
                object = new g((String)object2);
            }
            long l8 = this.g(((s)object3).f().s());
            long l9 = l8 - this.o;
            boolean bl = false;
            boolean bl2 = l9 >= 0L && l9 <= (long)this.s;
            ax.m7.v.g(bl2);
            long l10 = (long)this.s - l9;
            if (this.j()) {
                if (l10 > 0L) {
                    this.k.reset();
                    bl2 = bl;
                    if (l9 == this.k.skip(l9)) {
                        bl2 = true;
                    }
                    ax.m7.v.g(bl2);
                }
            } else if (l10 == 0L) {
                this.t = null;
            }
            this.o = l8;
            this.t(ax.f7.b$b.e0);
            ((s)object3).a();
        }
        ((s)object3).a();
        throw throwable2;
    }

    private void t(b object) throws IOException {
        this.a = object;
        object = this.m;
        if (object != null) {
            object.a(this);
        }
    }

    public long h() {
        return this.o;
    }

    public b i() {
        return this.a;
    }

    void l() throws IOException {
        ax.m7.v.e(this.j, "The current request should not be null");
        this.j.t(new e());
        m m8 = this.j.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bytes */");
        stringBuilder.append(this.n);
        m8.H(stringBuilder.toString());
    }

    public b m(int n8) {
        boolean bl = n8 > 0 && n8 % 262144 == 0;
        ax.m7.v.b(bl, "chunkSize must be a positive multiple of 262144.");
        this.p = n8;
        return this;
    }

    public b n(boolean bl) {
        this.l = bl;
        return this;
    }

    public b o(boolean bl) {
        this.u = bl;
        return this;
    }

    public b p(m m8) {
        this.i = m8;
        return this;
    }

    public b q(String string) {
        boolean bl = string.equals("POST") || string.equals("PUT") || string.equals("PATCH");
        ax.m7.v.a(bl);
        this.h = string;
        return this;
    }

    public b r(i i8) {
        this.e = i8;
        return this;
    }

    public b s(c c8) {
        this.m = c8;
        return this;
    }

    public s u(g g8) throws IOException {
        boolean bl = this.a == ax.f7.b$b.q;
        ax.m7.v.a(bl);
        if (this.l) {
            return this.b(g8);
        }
        return this.k(g8);
    }

    private static class a {
        private final ax.i7.b a;
        private final String b;

        a(ax.i7.b b8, String string) {
            this.a = b8;
            this.b = string;
        }

        ax.i7.b a() {
            return this.a;
        }

        String b() {
            return this.b;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        private static final b[] g0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            q = b12 = new b();
            c0 = b11 = new b();
            d0 = b10 = new b();
            e0 = b9 = new b();
            f0 = b8 = new b();
            g0 = new b[]{b12, b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])g0.clone();
        }
    }
}

