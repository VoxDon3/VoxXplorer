/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Mb.d;
import ax.Qb.l;
import ax.Sb.h;
import ax.Vb.F;
import ax.Vb.G;
import ax.sb.t;

public final class c {
    private static final h<Object> a = new h(-1L, null, null, 0);
    public static final int b = G.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    private static final int c = G.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final F d = new F("BUFFERED");
    private static final F e = new F("SHOULD_BUFFER");
    private static final F f = new F("S_RESUMING_BY_RCV");
    private static final F g = new F("RESUMING_BY_EB");
    private static final F h = new F("POISONED");
    private static final F i = new F("DONE_RCV");
    private static final F j = new F("INTERRUPTED_SEND");
    private static final F k = new F("INTERRUPTED_RCV");
    private static final F l = new F("CHANNEL_CLOSED");
    private static final F m = new F("SUSPEND");
    private static final F n = new F("SUSPEND_NO_WAITER");
    private static final F o = new F("FAILED");
    private static final F p = new F("NO_RECEIVE_RESULT");
    private static final F q = new F("CLOSE_HANDLER_CLOSED");
    private static final F r = new F("CLOSE_HANDLER_INVOKED");
    private static final F s = new F("NO_CLOSE_CAUSE");

    private static final <T> boolean A(l<? super T> l8, T object, ax.Fb.l<? super Throwable, t> l9) {
        if ((object = l8.l(object, null, l9)) != null) {
            l8.s(object);
            return true;
        }
        return false;
    }

    static /* synthetic */ boolean B(l l8, Object object, ax.Fb.l l9, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            l9 = null;
        }
        return ax.Sb.c.A(l8, object, l9);
    }

    public static final /* synthetic */ long a(long l8, boolean bl) {
        return ax.Sb.c.u(l8, bl);
    }

    public static final /* synthetic */ long b(long l8, int n8) {
        return ax.Sb.c.v(l8, n8);
    }

    public static final /* synthetic */ F d() {
        return q;
    }

    public static final /* synthetic */ F e() {
        return r;
    }

    public static final /* synthetic */ F f() {
        return i;
    }

    public static final /* synthetic */ int g() {
        return c;
    }

    public static final /* synthetic */ F h() {
        return o;
    }

    public static final /* synthetic */ F i() {
        return k;
    }

    public static final /* synthetic */ F j() {
        return j;
    }

    public static final /* synthetic */ F k() {
        return e;
    }

    public static final /* synthetic */ F l() {
        return s;
    }

    public static final /* synthetic */ h m() {
        return a;
    }

    public static final /* synthetic */ F n() {
        return h;
    }

    public static final /* synthetic */ F o() {
        return g;
    }

    public static final /* synthetic */ F p() {
        return f;
    }

    public static final /* synthetic */ F q() {
        return m;
    }

    public static final /* synthetic */ F r() {
        return n;
    }

    public static final /* synthetic */ long s(int n8) {
        return ax.Sb.c.z(n8);
    }

    public static final /* synthetic */ boolean t(l l8, Object object, ax.Fb.l l9) {
        return ax.Sb.c.A(l8, object, l9);
    }

    private static final long u(long l8, boolean bl) {
        long l9 = bl ? 0x4000000000000000L : 0L;
        return l9 + l8;
    }

    private static final long v(long l8, int n8) {
        return ((long)n8 << 60) + l8;
    }

    private static final <E> h<E> w(long l8, h<E> h8) {
        return new h<E>(l8, h8, h8.u(), 0);
    }

    public static final <E> d<h<E>> x() {
        return ax.Sb.c$a.k0;
    }

    public static final F y() {
        return l;
    }

    private static final long z(int n8) {
        if (n8 != 0) {
            if (n8 != Integer.MAX_VALUE) {
                return n8;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }
}

