/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.l;
import ax.Fb.p;
import ax.Qb.Z;
import ax.Qb.r;
import ax.Qb.t;
import ax.wb.i;
import java.util.concurrent.CancellationException;

public interface s0
extends i.b {
    public static final b c = b.q;

    public Z A0(boolean var1, boolean var2, l<? super Throwable, ax.sb.t> var3);

    public Z F(l<? super Throwable, ax.sb.t> var1);

    public void L0(CancellationException var1);

    public boolean e();

    public s0 getParent();

    public boolean isCancelled();

    public CancellationException o();

    public r q(t var1);

    public boolean start();

    public static final class a {
        public static /* synthetic */ void a(s0 s02, CancellationException cancellationException, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    cancellationException = null;
                }
                s02.L0(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(s0 s02, R r8, p<? super R, ? super i.b, ? extends R> p8) {
            return i.b.a.a(s02, r8, p8);
        }

        public static <E extends i.b> E c(s0 s02, i.c<E> c8) {
            return i.b.a.b(s02, c8);
        }

        public static /* synthetic */ Z d(s0 s02, boolean bl, boolean bl2, l l8, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    bl = false;
                }
                if ((n8 & 2) != 0) {
                    bl2 = true;
                }
                return s02.A0(bl, bl2, l8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static i e(s0 s02, i.c<?> c8) {
            return i.b.a.c(s02, c8);
        }

        public static i f(s0 s02, i i8) {
            return i.b.a.d(s02, i8);
        }
    }

    public static final class b
    implements i.c<s0> {
        static final b q = new b();

        private b() {
        }
    }
}

