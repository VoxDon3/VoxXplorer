package ax.Sb;

import ax.Fb.p;
import ax.Qb.InterfaceC0945l;
import ax.Vb.F;
import ax.Vb.I;
import ax.sb.t;

/* loaded from: classes3.dex */
public final class c {
    private static final h<Object> a = new h<>(-1, null, null, 0);
    public static final int b;
    private static final int c;
    public static final F d;
    private static final F e;
    private static final F f;
    private static final F g;
    private static final F h;
    private static final F i;
    private static final F j;
    private static final F k;
    private static final F l;
    private static final F m;
    private static final F n;
    private static final F o;
    private static final F p;
    private static final F q;
    private static final F r;
    private static final F s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* synthetic */ class a<E> extends ax.Gb.j implements p<Long, h<E>, h<E>> {
        public static final a k0 = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // ax.Fb.p
        public /* bridge */ /* synthetic */ Object j(Long l, Object obj) {
            return l(l.longValue(), (h) obj);
        }

        public final h<E> l(long j, h<E> hVar) {
            return c.w(j, hVar);
        }
    }

    static {
        int e2;
        int e3;
        e2 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        b = e2;
        e3 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        c = e3;
        d = new F("BUFFERED");
        e = new F("SHOULD_BUFFER");
        f = new F("S_RESUMING_BY_RCV");
        g = new F("RESUMING_BY_EB");
        h = new F("POISONED");
        i = new F("DONE_RCV");
        j = new F("INTERRUPTED_SEND");
        k = new F("INTERRUPTED_RCV");
        l = new F("CHANNEL_CLOSED");
        m = new F("SUSPEND");
        n = new F("SUSPEND_NO_WAITER");
        o = new F("FAILED");
        p = new F("NO_RECEIVE_RESULT");
        q = new F("CLOSE_HANDLER_CLOSED");
        r = new F("CLOSE_HANDLER_INVOKED");
        s = new F("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean A(InterfaceC0945l<? super T> interfaceC0945l, T t, ax.Fb.l<? super Throwable, t> lVar) {
        Object l2 = interfaceC0945l.l(t, null, lVar);
        if (l2 == null) {
            return false;
        }
        interfaceC0945l.s(l2);
        return true;
    }

    static /* synthetic */ boolean B(InterfaceC0945l interfaceC0945l, Object obj, ax.Fb.l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        return A(interfaceC0945l, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> h<E> w(long j2, h<E> hVar) {
        return new h<>(j2, hVar, hVar.u(), 0);
    }

    public static final <E> ax.Mb.d<h<E>> x() {
        return a.k0;
    }

    public static final F y() {
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }
}
