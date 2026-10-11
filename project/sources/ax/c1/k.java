package ax.c1;

import android.text.TextUtils;
import ax.N1.t;
import ax.N1.u;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.M;
import ax.q1.C2857q;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.N;
import ax.q1.U;
import ax.q1.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements r {
    private static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String a;
    private final M b;
    private final t.a d;
    private final boolean e;
    private InterfaceC2859t f;
    private int h;
    private final G c = new G();
    private byte[] g = new byte[1024];

    public k(String str, M m, t.a aVar, boolean z) {
        this.a = str;
        this.b = m;
        this.d = aVar;
        this.e = z;
    }

    private U g(long j2) {
        U u = this.f.u(0, 3);
        u.e(new C0912v.b().y0("text/vtt").n0(this.a).C0(j2).P());
        this.f.o();
        return u;
    }

    private void h() throws E {
        G g = new G(this.g);
        ax.W1.h.e(g);
        long j2 = 0;
        long j3 = 0;
        for (String x = g.x(); !TextUtils.isEmpty(x); x = g.x()) {
            if (x.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = i.matcher(x);
                if (!matcher.find()) {
                    throw E.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + x, null);
                }
                Matcher matcher2 = j.matcher(x);
                if (!matcher2.find()) {
                    throw E.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + x, null);
                }
                j3 = ax.W1.h.d((String) C0968a.e(matcher.group(1)));
                j2 = M.h(Long.parseLong((String) C0968a.e(matcher2.group(1))));
            }
        }
        Matcher a = ax.W1.h.a(g);
        if (a == null) {
            g(0L);
            return;
        }
        long d = ax.W1.h.d((String) C0968a.e(a.group(1)));
        long b = this.b.b(M.l((j2 + d) - j3));
        U g2 = g(b - d);
        this.c.Z(this.g, this.h);
        g2.g(this.c, this.h);
        g2.f(b, 1, this.h, 0, null);
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        if (this.e) {
            interfaceC2859t = new u(interfaceC2859t, this.d);
        }
        this.f = interfaceC2859t;
        interfaceC2859t.h(new N.b(-9223372036854775807L));
    }

    @Override // ax.q1.r
    public void b(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.h(this.g, 0, 6, false);
        this.c.Z(this.g, 6);
        if (ax.W1.h.b(this.c)) {
            return true;
        }
        interfaceC2858s.h(this.g, 6, 3, false);
        this.c.Z(this.g, 9);
        return ax.W1.h.b(this.c);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        C0968a.e(this.f);
        int length = (int) interfaceC2858s.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int c = interfaceC2858s.c(bArr2, i3, bArr2.length - i3);
        if (c != -1) {
            int i4 = this.h + c;
            this.h = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        h();
        return -1;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
