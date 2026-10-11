/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import android.text.TextUtils;
import ax.N1.t;
import ax.N1.u;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.W1.h;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k
implements r {
    private static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    private final String a;
    private final ax.S0.M b;
    private final G c;
    private final t.a d;
    private final boolean e;
    private t f;
    private byte[] g;
    private int h;

    public k(String string, ax.S0.M m8, t.a a8, boolean bl) {
        this.a = string;
        this.b = m8;
        this.c = new G();
        this.g = new byte[1024];
        this.d = a8;
        this.e = bl;
    }

    private U g(long l8) {
        U u8 = this.f.u(0, 3);
        u8.e(new v.b().y0("text/vtt").n0(this.a).C0(l8).P());
        this.f.o();
        return u8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void h() throws E {
        Object object = new G(this.g);
        ax.W1.h.e((G)object);
        Object object2 = ((G)object).x();
        long l8 = 0L;
        long l9 = 0L;
        while (!TextUtils.isEmpty((CharSequence)object2)) {
            if (((String)object2).startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = i.matcher((CharSequence)object2);
                if (!matcher.find()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    ((StringBuilder)object).append((String)object2);
                    throw E.a(((StringBuilder)object).toString(), null);
                }
                Matcher matcher2 = j.matcher((CharSequence)object2);
                if (!matcher2.find()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                    ((StringBuilder)object).append((String)object2);
                    throw E.a(((StringBuilder)object).toString(), null);
                }
                l9 = ax.W1.h.d(ax.S0.a.e(matcher.group(1)));
                l8 = ax.S0.M.h(Long.parseLong(ax.S0.a.e(matcher2.group(1))));
            }
            object2 = ((G)object).x();
        }
        object2 = ax.W1.h.a((G)object);
        if (object2 == null) {
            this.g(0L);
            return;
        }
        long l10 = ax.W1.h.d(ax.S0.a.e(((Matcher)object2).group(1)));
        l9 = this.b.b(ax.S0.M.l(l8 + l10 - l9));
        object2 = this.g(l9 - l10);
        this.c.Z(this.g, this.h);
        object2.g(this.c, this.h);
        object2.f(l9, 1, this.h, 0, null);
    }

    @Override
    public void a(t t8) {
        t t9 = t8;
        if (this.e) {
            t9 = new u(t8, this.d);
        }
        this.f = t9;
        t9.h(new N.b(-9223372036854775807L));
    }

    @Override
    public void b(long l8, long l9) {
        throw new IllegalStateException();
    }

    @Override
    public boolean c(s s8) throws IOException {
        s8.h(this.g, 0, 6, false);
        this.c.Z(this.g, 6);
        if (ax.W1.h.b(this.c)) {
            return true;
        }
        s8.h(this.g, 6, 3, false);
        this.c.Z(this.g, 9);
        return ax.W1.h.b(this.c);
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M object) throws IOException {
        ax.S0.a.e(this.f);
        int n8 = (int)s8.getLength();
        int n9 = this.h;
        object = this.g;
        if (n9 == ((Object)object).length) {
            n9 = n8 != -1 ? n8 : ((Object)object).length;
            this.g = Arrays.copyOf((byte[])object, n9 * 3 / 2);
        }
        object = this.g;
        n9 = this.h;
        if ((n9 = s8.c((byte[])object, n9, ((Object)object).length - n9)) != -1) {
            this.h = n9 = this.h + n9;
            if (n8 == -1 || n9 != n8) {
                return 0;
            }
        }
        this.h();
        return -1;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

