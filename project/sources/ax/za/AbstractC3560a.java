package ax.za;

import ax.oa.e;
import ax.pa.d;
import ax.pa.g;
import ax.ra.AbstractC3020d;
import ax.ra.AbstractC3021e;
import ax.ra.C3017a;
import ax.ra.C3018b;
import ax.ra.C3019c;
import ax.ra.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.za.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3560a implements g {
    private final AtomicInteger a = new AtomicInteger();
    private int b = Http2.INITIAL_MAX_FRAME_SIZE;
    private int c = Http2.INITIAL_MAX_FRAME_SIZE;

    public void c(ax.oa.b bVar, ax.oa.b bVar2) throws IOException {
        C3017a c3017a = new C3017a(Http2.INITIAL_MAX_FRAME_SIZE, Http2.INITIAL_MAX_FRAME_SIZE, bVar, bVar2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d dVar = new d(byteArrayOutputStream);
        c3017a.k(e());
        c3017a.q(EnumSet.of(e.FIRST_FRAGMENT, e.LAST_FRAGMENT));
        c3017a.a(dVar);
        byte[] bArr = new byte[f()];
        ax.pa.c cVar = new ax.pa.c(new ByteArrayInputStream(bArr, 0, b(byteArrayOutputStream.toByteArray(), bArr)));
        C3018b c3018b = new C3018b();
        c3018b.r(cVar);
        if (!c3018b.u()) {
            throw new IOException(String.format("BIND %s (%s) failed.", bVar.l(), bVar.n()));
        }
        h(c3018b.t());
        g(c3018b.s());
    }

    public <T extends AbstractC3021e> T d(AbstractC3020d<T> abstractC3020d) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d dVar = new d(byteArrayOutputStream);
        C3019c c3019c = new C3019c();
        c3019c.k(e());
        c3019c.q(EnumSet.of(e.FIRST_FRAGMENT, e.LAST_FRAGMENT));
        c3019c.u(abstractC3020d.b());
        c3019c.v(abstractC3020d.d());
        c3019c.a(dVar);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[f()];
        ax.Qc.a aVar = new ax.Qc.a();
        aVar.j(b(byteArray, bArr));
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        f fVar = new f();
        while (true) {
            fVar.r(new ax.pa.c(new ByteArrayInputStream(bArr, 0, aVar.h().intValue())));
            byteArrayOutputStream2.write(fVar.s());
            if (fVar.i().contains(e.LAST_FRAGMENT)) {
                break;
            }
            aVar.j(a(bArr));
        }
        ax.pa.c cVar = new ax.pa.c(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
        ax.oa.d h = fVar.h();
        ax.oa.d dVar2 = ax.oa.d.RESPONSE;
        if (h == dVar2) {
            T c = abstractC3020d.c();
            c.c(cVar);
            return c;
        }
        if (fVar.h() == ax.oa.d.FAULT || fVar.h() == ax.oa.d.REJECT) {
            throw ax.Aa.a.c(cVar);
        }
        throw new IOException(String.format("Expected PDU %s but got: %s", dVar2, fVar.h()));
    }

    protected int e() {
        return this.a.getAndIncrement();
    }

    protected int f() {
        return this.b;
    }

    protected void g(int i) {
        this.c = i;
    }

    protected void h(int i) {
        this.b = i;
    }
}
