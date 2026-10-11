/*
 * Decompiled with CFR 0.152.
 */
package ax.j9;

import ax.W8.i;
import ax.Xd.d;
import ax.d9.g;
import ax.j9.a;
import ax.j9.b;
import ax.j9.c;
import ax.j9.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class f
implements c {
    private static final d g = ax.Xd.f.k(f.class);
    private static final byte[] h;
    private static final byte[] i;
    private e a;
    private g b;
    private byte[] c;
    private byte[] d;
    private AtomicInteger e = new AtomicInteger(0);
    private List<ax.E8.e> f;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        h = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        i = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public f(e e8) {
        this.a = e8;
    }

    private byte[] d(List<ax.E8.e> object) throws IOException {
        ax.D8.a a8 = new ax.D8.a(new ArrayList<ax.C8.b>((Collection<ax.C8.b>)object));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        object = new ax.y8.b(new ax.B8.b(), byteArrayOutputStream);
        try {
            ((ax.y8.b)object).c(a8);
            return byteArrayOutputStream.toByteArray();
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    private byte[] e(byte[] byArray, Set<ax.W8.e> set, i object) {
        if (set.contains(ax.W8.e.j0)) {
            if (!set.contains(ax.W8.e.e0)) {
                byArray = set.contains(ax.W8.e.c0) ? Arrays.copyOf(byArray, 7) : Arrays.copyOf(byArray, 5);
            }
            return ax.V8.b.c(this.b, byArray, i);
        }
        if (!(set.contains(ax.W8.e.r0) || set.contains(ax.W8.e.s0) && ((i)object).a().getValue() >= i.a.c0.getValue())) {
            return Arrays.copyOf(byArray, byArray.length);
        }
        object = new byte[8];
        if (set.contains(ax.W8.e.c0)) {
            System.arraycopy(byArray, 0, object, 0, 7);
            object[7] = -96;
            return object;
        }
        System.arraycopy(byArray, 0, object, 0, 5);
        object[5] = -27;
        object[6] = 56;
        object[7] = -80;
        return object;
    }

    private byte[] f(byte[] byArray, Set<ax.W8.e> set) {
        if (set.contains(ax.W8.e.j0)) {
            return ax.V8.b.c(this.b, byArray, h);
        }
        return null;
    }

    private byte[] g(byte[] byArray, int n8) throws IOException {
        byte[] byArray2 = this.h(n8);
        byte[] byArray3 = this.d(this.f);
        byArray = ax.V8.b.a(this.b, byArray, byArray2, byArray3);
        byArray3 = new byte[8];
        System.arraycopy(byArray, 0, byArray3, 0, 8);
        return byArray3;
    }

    private byte[] h(int n8) {
        return new byte[]{(byte)(n8 & 0xFF), (byte)(n8 >> 8 & 0xFF), (byte)(n8 >> 16 & 0xFF), (byte)(n8 >> 24 & 0xFF)};
    }

    @Override
    public a a(b object, byte[] object2, ax.l9.b object3) throws IOException {
        if ((object3 = this.a.a((b)object, (byte[])object2, (ax.l9.b)object3)) == null) {
            return null;
        }
        object = ((a)object3).d();
        Set<ax.W8.e> set = ((a)object3).b();
        if (object != null) {
            g.n("Calculating signing and sealing keys for NTLM Extended Session Security");
            this.c = this.f((byte[])object, set);
            this.d = this.e((byte[])object, set, ((a)object3).e());
        }
        if (((a)object3).a() instanceof ax.w9.b) {
            this.f = ((ax.w9.b)((a)object3).a()).h();
        }
        if (this.c != null && ((a)object3).a() instanceof ax.w9.c) {
            ax.w9.c c8 = (ax.w9.c)((a)object3).a();
            g.n("Signing with NTLM Extended Session Security");
            int n8 = this.e.getAndIncrement();
            object2 = this.g(this.c, n8);
            object = object2;
            if (set.contains(ax.W8.e.d0)) {
                object = ax.V8.b.f(this.b, this.d, (byte[])object2);
            }
            object2 = new ax.h9.b();
            ((ax.Z8.a)object2).u(1L);
            ((ax.Z8.a)object2).p((byte[])object, 0, 8);
            ((ax.Z8.a)object2).u(n8);
            c8.l(((ax.Z8.a)object2).f());
        }
        return object3;
    }

    @Override
    public void b(ax.i9.d d8) {
        this.a.b(d8);
        this.b = d8.K();
    }

    @Override
    public boolean c(b b8) {
        return this.a.c(b8);
    }
}

