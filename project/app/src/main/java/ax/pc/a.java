/*
 * Decompiled with CFR 0.152.
 */
package ax.pc;

import ax.pc.b;
import ax.pc.c;
import ax.rc.f;
import ax.rc.h;
import ax.rc.i;
import ax.sc.d;
import ax.tc.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    private final ax.tc.d a = new ax.tc.d();
    private final byte[] b = new byte[4];

    private List<ax.rc.d> a(byte[] byArray, int n8) {
        int n9;
        ArrayList<ax.rc.d> arrayList = new ArrayList<ax.rc.d>();
        for (int i8 = 0; i8 < n8; i8 += n9) {
            ax.rc.d d8 = new ax.rc.d();
            d8.f(this.a.i(byArray, i8));
            n9 = this.a.i(byArray, i8 + 2);
            d8.g(n9);
            i8 += 4;
            if (n9 > 0) {
                byte[] byArray2 = new byte[n9];
                System.arraycopy(byArray, i8, byArray2, 0, n9);
                d8.e(byArray2);
            }
            arrayList.add(d8);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private ax.rc.a b(List<ax.rc.d> object, ax.tc.d d8) throws ax.oc.a {
        if (object == null) {
            return null;
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object object2;
            long l8;
            Object object3 = (ax.rc.d)object.next();
            if (object3 == null || (l8 = ((ax.rc.d)object3).c()) != (object2 = ax.pc.b.n0).d()) continue;
            object = ((ax.rc.d)object3).b();
            if (object != null && ((Object)object).length == 7) {
                object = new ax.rc.a();
                ((i)object).a((b)((Object)object2));
                ((ax.rc.a)object).h(((ax.rc.d)object3).d());
                object2 = ((ax.rc.d)object3).b();
                ((ax.rc.a)object).f(ax.sc.b.d(d8.i((byte[])object2, 0)));
                object3 = new byte[2];
                System.arraycopy(object2, 2, object3, 0, 2);
                ((ax.rc.a)object).i(new String((byte[])object3));
                ((ax.rc.a)object).e(ax.sc.a.d(object2[4] & 0xFF));
                ((ax.rc.a)object).g(ax.sc.c.h(d8.i((byte[])object2, 5)));
                return object;
            }
            throw new ax.oc.a("corrupt AES extra data records");
        }
        return null;
    }

    private void c(ax.rc.b b8, ax.tc.d object) throws ax.oc.a {
        if (b8.g() != null && b8.g().size() > 0 && (object = this.b(b8.g(), (ax.tc.d)object)) != null) {
            b8.r((ax.rc.a)object);
            b8.y(d.e0);
        }
    }

    private List<ax.rc.d> e(InputStream object, int n8) throws IOException {
        if (n8 < 4) {
            if (n8 > 0) {
                ((InputStream)object).skip(n8);
            }
            return null;
        }
        byte[] byArray = new byte[n8];
        e.e((InputStream)object, byArray);
        try {
            object = this.a(byArray, n8);
            return object;
        }
        catch (Exception exception) {
            return Collections.EMPTY_LIST;
        }
    }

    private void f(InputStream inputStream, f f8) throws IOException {
        int n8 = f8.h();
        if (n8 <= 0) {
            return;
        }
        f8.z(this.e(inputStream, n8));
    }

    private h h(List<ax.rc.d> object, ax.tc.d d8, long l8, long l9, long l10, int n8) {
        Object object2 = object.iterator();
        while (object2.hasNext()) {
            int n9;
            object = object2.next();
            if (object == null || ax.pc.b.m0.d() != ((ax.rc.d)object).c()) continue;
            object2 = new h();
            byte[] byArray = ((ax.rc.d)object).b();
            if (((ax.rc.d)object).d() <= 0) {
                return null;
            }
            int n10 = ((ax.rc.d)object).d();
            int n11 = n9 = 0;
            if (n10 > 0) {
                n11 = n9;
                if (l8 == 0xFFFFFFFFL) {
                    ((h)object2).h(d8.g(byArray, 0));
                    n11 = 8;
                }
            }
            n9 = n11;
            if (n11 < ((ax.rc.d)object).d()) {
                n9 = n11;
                if (l9 == 0xFFFFFFFFL) {
                    ((h)object2).e(d8.g(byArray, n11));
                    n9 = n11 + 8;
                }
            }
            n11 = n9;
            if (n9 < ((ax.rc.d)object).d()) {
                n11 = n9;
                if (l10 == 0xFFFFFFFFL) {
                    ((h)object2).g(d8.g(byArray, n9));
                    n11 = n9 + 8;
                }
            }
            if (n11 < ((ax.rc.d)object).d() && n8 == 65535) {
                ((h)object2).f(d8.d(byArray, n11));
            }
            return object2;
        }
        return null;
    }

    private void i(f f8, ax.tc.d object) throws ax.oc.a {
        if (f8 != null) {
            if (f8.g() != null && f8.g().size() > 0 && (object = this.h(f8.g(), (ax.tc.d)object, f8.l(), f8.c(), 0L, 0)) != null) {
                f8.I((h)object);
                if (((h)object).d() != -1L) {
                    f8.G(((h)object).d());
                }
                if (((h)object).b() != -1L) {
                    f8.s(((h)object).b());
                }
            }
            return;
        }
        throw new ax.oc.a("file header is null in reading Zip64 Extended Info");
    }

    public ax.rc.c d(InputStream inputStream, boolean bl) throws IOException {
        ax.rc.c c8 = new ax.rc.c();
        byte[] byArray = new byte[4];
        e.e(inputStream, byArray);
        long l8 = this.a.g(byArray, 0);
        b b8 = ax.pc.b.d0;
        if (l8 == b8.d()) {
            c8.a(b8);
            e.e(inputStream, byArray);
            c8.f(this.a.g(byArray, 0));
        } else {
            c8.f(l8);
        }
        if (bl) {
            c8.e(this.a.e(inputStream));
            c8.g(this.a.e(inputStream));
            return c8;
        }
        c8.e(this.a.b(inputStream));
        c8.g(this.a.b(inputStream));
        return c8;
    }

    public f g(InputStream inputStream, Charset object) throws IOException {
        Object object2;
        long l8;
        int n8;
        f f8 = new f();
        byte[] byArray = new byte[4];
        int n9 = n8 = this.a.b(inputStream);
        if ((long)n8 == ax.pc.b.g0.d()) {
            n9 = this.a.b(inputStream);
        }
        if ((l8 = (long)n9) != (object2 = ax.pc.b.c0).d()) {
            return null;
        }
        f8.a((b)((Object)object2));
        f8.H(this.a.h(inputStream));
        object2 = new byte[2];
        if (e.e(inputStream, (byte[])object2) == 2) {
            f8.x(ax.tc.a.a((byte)object2[0], 0));
            f8.v(ax.tc.a.a((byte)object2[0], 3));
            boolean bl = true;
            f8.D(ax.tc.a.a((byte)object2[1], 3));
            f8.E((byte[])object2.clone());
            f8.t(ax.sc.c.h(this.a.h(inputStream)));
            f8.F(this.a.b(inputStream));
            e.e(inputStream, byArray);
            f8.u(this.a.g(byArray, 0));
            f8.s(this.a.f(inputStream, 4));
            f8.G(this.a.f(inputStream, 4));
            n9 = this.a.h(inputStream);
            f8.C(n9);
            f8.A(this.a.h(inputStream));
            if (n9 > 0) {
                byArray = new byte[n9];
                e.e(inputStream, byArray);
                object = c.a(byArray, f8.q(), (Charset)object);
                f8.B((String)object);
                boolean bl2 = bl;
                if (!((String)object).endsWith("/")) {
                    bl2 = ((String)object).endsWith("\\") ? bl : false;
                }
                f8.w(bl2);
                this.f(inputStream, f8);
                this.i(f8, this.a);
                this.c(f8, this.a);
                if (f8.p() && f8.f() != d.e0) {
                    if (ax.tc.a.a(f8.j()[0], 6)) {
                        f8.y(d.d0);
                        return f8;
                    }
                    f8.y(d.c0);
                }
                return f8;
            }
            throw new ax.oc.a("Invalid entry name in local file header");
        }
        throw new ax.oc.a("Could not read enough bytes for generalPurposeFlags");
    }
}

