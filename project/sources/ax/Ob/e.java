package ax.Ob;

import ax.sb.C3081m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class e implements ax.Nb.e<ax.Lb.e> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final ax.Fb.p<CharSequence, Integer, C3081m<Integer, Integer>> d;

    public static final class a implements Iterator<ax.Lb.e>, ax.Hb.a {
        private int c0;
        private int d0;
        private ax.Lb.e e0;
        private int f0;
        private int q = -1;

        a() {
            int f = ax.Lb.f.f(e.this.b, 0, e.this.a.length());
            this.c0 = f;
            this.d0 = f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            if (r0 < r6.g0.c) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.d0
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.q = r1
                r0 = 0
                r6.e0 = r0
                return
            Lb:
                ax.Ob.e r0 = ax.Ob.e.this
                int r0 = ax.Ob.e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f0
                int r0 = r0 + r3
                r6.f0 = r0
                ax.Ob.e r4 = ax.Ob.e.this
                int r4 = ax.Ob.e.d(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.d0
                ax.Ob.e r4 = ax.Ob.e.this
                java.lang.CharSequence r4 = ax.Ob.e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                ax.Lb.e r0 = new ax.Lb.e
                int r1 = r6.c0
                ax.Ob.e r4 = ax.Ob.e.this
                java.lang.CharSequence r4 = ax.Ob.e.c(r4)
                int r4 = ax.Ob.u.P(r4)
                r0.<init>(r1, r4)
                r6.e0 = r0
                r6.d0 = r2
                goto L9b
            L46:
                ax.Ob.e r0 = ax.Ob.e.this
                ax.Fb.p r0 = ax.Ob.e.b(r0)
                ax.Ob.e r4 = ax.Ob.e.this
                java.lang.CharSequence r4 = ax.Ob.e.c(r4)
                int r5 = r6.d0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.j(r4, r5)
                ax.sb.m r0 = (ax.sb.C3081m) r0
                if (r0 != 0) goto L76
                ax.Lb.e r0 = new ax.Lb.e
                int r1 = r6.c0
                ax.Ob.e r4 = ax.Ob.e.this
                java.lang.CharSequence r4 = ax.Ob.e.c(r4)
                int r4 = ax.Ob.u.P(r4)
                r0.<init>(r1, r4)
                r6.e0 = r0
                r6.d0 = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.c0
                ax.Lb.e r4 = ax.Lb.f.l(r4, r2)
                r6.e0 = r4
                int r2 = r2 + r0
                r6.c0 = r2
                if (r0 != 0) goto L98
                r1 = 1
            L98:
                int r2 = r2 + r1
                r6.d0 = r2
            L9b:
                r6.q = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Ob.e.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ax.Lb.e next() {
            if (this.q == -1) {
                b();
            }
            if (this.q == 0) {
                throw new NoSuchElementException();
            }
            ax.Lb.e eVar = this.e0;
            ax.Gb.l.d(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.e0 = null;
            this.q = -1;
            return eVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.q == -1) {
                b();
            }
            return this.q == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i, int i2, ax.Fb.p<? super CharSequence, ? super Integer, C3081m<Integer, Integer>> pVar) {
        ax.Gb.l.f(charSequence, "input");
        ax.Gb.l.f(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = pVar;
    }

    @Override // ax.Nb.e
    public Iterator<ax.Lb.e> iterator() {
        return new a();
    }
}
