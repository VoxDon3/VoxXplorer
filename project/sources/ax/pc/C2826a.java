package ax.pc;

import ax.oc.C2743a;
import ax.rc.AbstractC3027b;
import ax.rc.C3026a;
import ax.rc.C3028c;
import ax.rc.C3029d;
import ax.rc.f;
import ax.rc.h;
import ax.sc.EnumC3084a;
import ax.sc.EnumC3085b;
import ax.sc.EnumC3086c;
import ax.sc.EnumC3087d;
import ax.tc.C3142a;
import ax.tc.C3145d;
import ax.tc.C3146e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.pc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2826a {
    private final C3145d a = new C3145d();
    private final byte[] b = new byte[4];

    private List<C3029d> a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            C3029d c3029d = new C3029d();
            c3029d.f(this.a.i(bArr, i2));
            int i3 = this.a.i(bArr, i2 + 2);
            c3029d.g(i3);
            int i4 = i2 + 4;
            if (i3 > 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i4, bArr2, 0, i3);
                c3029d.e(bArr2);
            }
            i2 = i4 + i3;
            arrayList.add(c3029d);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private C3026a b(List<C3029d> list, C3145d c3145d) throws C2743a {
        if (list == null) {
            return null;
        }
        for (C3029d c3029d : list) {
            if (c3029d != null) {
                long c = c3029d.c();
                b bVar = b.AES_EXTRA_DATA_RECORD;
                if (c == bVar.d()) {
                    byte[] b = c3029d.b();
                    if (b == null || b.length != 7) {
                        throw new C2743a("corrupt AES extra data records");
                    }
                    C3026a c3026a = new C3026a();
                    c3026a.a(bVar);
                    c3026a.h(c3029d.d());
                    byte[] b2 = c3029d.b();
                    c3026a.f(EnumC3085b.d(c3145d.i(b2, 0)));
                    byte[] bArr = new byte[2];
                    System.arraycopy(b2, 2, bArr, 0, 2);
                    c3026a.i(new String(bArr));
                    c3026a.e(EnumC3084a.d(b2[4] & 255));
                    c3026a.g(EnumC3086c.h(c3145d.i(b2, 5)));
                    return c3026a;
                }
            }
        }
        return null;
    }

    private void c(AbstractC3027b abstractC3027b, C3145d c3145d) throws C2743a {
        C3026a b;
        if (abstractC3027b.g() == null || abstractC3027b.g().size() <= 0 || (b = b(abstractC3027b.g(), c3145d)) == null) {
            return;
        }
        abstractC3027b.r(b);
        abstractC3027b.y(EnumC3087d.AES);
    }

    private List<C3029d> e(InputStream inputStream, int i) throws IOException {
        if (i < 4) {
            if (i <= 0) {
                return null;
            }
            inputStream.skip(i);
            return null;
        }
        byte[] bArr = new byte[i];
        C3146e.e(inputStream, bArr);
        try {
            return a(bArr, i);
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private void f(InputStream inputStream, f fVar) throws IOException {
        int h = fVar.h();
        if (h <= 0) {
            return;
        }
        fVar.z(e(inputStream, h));
    }

    private h h(List<C3029d> list, C3145d c3145d, long j, long j2, long j3, int i) {
        for (C3029d c3029d : list) {
            if (c3029d != null && b.ZIP64_EXTRA_FIELD_SIGNATURE.d() == c3029d.c()) {
                h hVar = new h();
                byte[] b = c3029d.b();
                if (c3029d.d() <= 0) {
                    return null;
                }
                int i2 = 0;
                if (c3029d.d() > 0 && j == 4294967295L) {
                    hVar.h(c3145d.g(b, 0));
                    i2 = 8;
                }
                if (i2 < c3029d.d() && j2 == 4294967295L) {
                    hVar.e(c3145d.g(b, i2));
                    i2 += 8;
                }
                if (i2 < c3029d.d() && j3 == 4294967295L) {
                    hVar.g(c3145d.g(b, i2));
                    i2 += 8;
                }
                if (i2 < c3029d.d() && i == 65535) {
                    hVar.f(c3145d.d(b, i2));
                }
                return hVar;
            }
        }
        return null;
    }

    private void i(f fVar, C3145d c3145d) throws C2743a {
        h h;
        if (fVar == null) {
            throw new C2743a("file header is null in reading Zip64 Extended Info");
        }
        if (fVar.g() == null || fVar.g().size() <= 0 || (h = h(fVar.g(), c3145d, fVar.l(), fVar.c(), 0L, 0)) == null) {
            return;
        }
        fVar.I(h);
        if (h.d() != -1) {
            fVar.G(h.d());
        }
        if (h.b() != -1) {
            fVar.s(h.b());
        }
    }

    public C3028c d(InputStream inputStream, boolean z) throws IOException {
        C3028c c3028c = new C3028c();
        byte[] bArr = new byte[4];
        C3146e.e(inputStream, bArr);
        long g = this.a.g(bArr, 0);
        b bVar = b.EXTRA_DATA_RECORD;
        if (g == bVar.d()) {
            c3028c.a(bVar);
            C3146e.e(inputStream, bArr);
            c3028c.f(this.a.g(bArr, 0));
        } else {
            c3028c.f(g);
        }
        if (z) {
            c3028c.e(this.a.e(inputStream));
            c3028c.g(this.a.e(inputStream));
            return c3028c;
        }
        c3028c.e(this.a.b(inputStream));
        c3028c.g(this.a.b(inputStream));
        return c3028c;
    }

    public f g(InputStream inputStream, Charset charset) throws IOException {
        f fVar = new f();
        byte[] bArr = new byte[4];
        int b = this.a.b(inputStream);
        if (b == b.TEMPORARY_SPANNING_MARKER.d()) {
            b = this.a.b(inputStream);
        }
        long j = b;
        b bVar = b.LOCAL_FILE_HEADER;
        if (j != bVar.d()) {
            return null;
        }
        fVar.a(bVar);
        fVar.H(this.a.h(inputStream));
        byte[] bArr2 = new byte[2];
        if (C3146e.e(inputStream, bArr2) != 2) {
            throw new C2743a("Could not read enough bytes for generalPurposeFlags");
        }
        fVar.x(C3142a.a(bArr2[0], 0));
        fVar.v(C3142a.a(bArr2[0], 3));
        boolean z = true;
        fVar.D(C3142a.a(bArr2[1], 3));
        fVar.E((byte[]) bArr2.clone());
        fVar.t(EnumC3086c.h(this.a.h(inputStream)));
        fVar.F(this.a.b(inputStream));
        C3146e.e(inputStream, bArr);
        fVar.u(this.a.g(bArr, 0));
        fVar.s(this.a.f(inputStream, 4));
        fVar.G(this.a.f(inputStream, 4));
        int h = this.a.h(inputStream);
        fVar.C(h);
        fVar.A(this.a.h(inputStream));
        if (h <= 0) {
            throw new C2743a("Invalid entry name in local file header");
        }
        byte[] bArr3 = new byte[h];
        C3146e.e(inputStream, bArr3);
        String a = c.a(bArr3, fVar.q(), charset);
        fVar.B(a);
        if (!a.endsWith("/") && !a.endsWith("\\")) {
            z = false;
        }
        fVar.w(z);
        f(inputStream, fVar);
        i(fVar, this.a);
        c(fVar, this.a);
        if (fVar.p() && fVar.f() != EnumC3087d.AES) {
            if (C3142a.a(fVar.j()[0], 6)) {
                fVar.y(EnumC3087d.ZIP_STANDARD_VARIANT_STRONG);
                return fVar;
            }
            fVar.y(EnumC3087d.ZIP_STANDARD);
        }
        return fVar;
    }
}
