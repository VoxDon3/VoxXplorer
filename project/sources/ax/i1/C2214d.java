package ax.i1;

import ax.S0.C0968a;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2863x;
import java.io.IOException;

/* renamed from: ax.i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2214d implements T {
    private final InterfaceC2863x a;
    private ax.q1.r b;
    private InterfaceC2858s c;

    public C2214d(InterfaceC2863x interfaceC2863x) {
        this.a = interfaceC2863x;
    }

    @Override // ax.i1.T
    public void b(long j, long j2) {
        ((ax.q1.r) C0968a.e(this.b)).b(j, j2);
    }

    @Override // ax.i1.T
    public int c(ax.q1.M m) throws IOException {
        return ((ax.q1.r) C0968a.e(this.b)).f((InterfaceC2858s) C0968a.e(this.c), m);
    }

    @Override // ax.i1.T
    public void d() {
        ax.q1.r rVar = this.b;
        if (rVar != null) {
            rVar.d();
            this.b = null;
        }
        this.c = null;
    }

    @Override // ax.i1.T
    public long e() {
        InterfaceC2858s interfaceC2858s = this.c;
        if (interfaceC2858s != null) {
            return interfaceC2858s.getPosition();
        }
        return -1L;
    }

    @Override // ax.i1.T
    public void f() {
        ax.q1.r rVar = this.b;
        if (rVar == null) {
            return;
        }
        ax.q1.r e = rVar.e();
        if (e instanceof ax.J1.f) {
            ((ax.J1.f) e).m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r1.getPosition() != r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r1.getPosition() != r11) goto L24;
     */
    @Override // ax.i1.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(ax.P0.InterfaceC0902k r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, ax.q1.InterfaceC2859t r15) throws java.io.IOException {
        /*
            r7 = this;
            ax.q1.k r1 = new ax.q1.k
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.c = r1
            ax.q1.r r8 = r7.b
            if (r8 == 0) goto Lf
            return
        Lf:
            ax.q1.x r8 = r7.a
            ax.q1.r[] r8 = r8.e(r9, r10)
            int r10 = r8.length
            ax.r7.z$a r10 = ax.r7.AbstractC2991z.s(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L24
            r8 = r8[r12]
            r7.b = r8
            goto L84
        L24:
            int r11 = r8.length
            r14 = 0
        L26:
            if (r14 >= r11) goto L80
            r0 = r8[r14]
            boolean r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L3c
            if (r2 == 0) goto L3e
            r7.b = r0     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L3c
            ax.S0.C0968a.g(r13)
            r1.m()
            goto L80
        L39:
            r0 = move-exception
            r8 = r0
            goto L5c
        L3c:
            goto L70
        L3e:
            java.util.List r0 = r0.k()     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L3c
            r10.j(r0)     // Catch: java.lang.Throwable -> L39 java.io.EOFException -> L3c
            ax.q1.r r0 = r7.b
            if (r0 != 0) goto L54
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        L52:
            r0 = 0
            goto L55
        L54:
            r0 = 1
        L55:
            ax.S0.C0968a.g(r0)
            r1.m()
            goto L7d
        L5c:
            ax.q1.r r9 = r7.b
            if (r9 != 0) goto L68
            long r9 = r1.getPosition()
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L69
        L68:
            r12 = 1
        L69:
            ax.S0.C0968a.g(r12)
            r1.m()
            throw r8
        L70:
            ax.q1.r r0 = r7.b
            if (r0 != 0) goto L54
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            goto L54
        L7d:
            int r14 = r14 + 1
            goto L26
        L80:
            ax.q1.r r11 = r7.b
            if (r11 == 0) goto L8a
        L84:
            ax.q1.r r8 = r7.b
            r8.a(r15)
            return
        L8a:
            ax.i1.r0 r11 = new ax.i1.r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            ax.q7.g r13 = ax.q7.C2880g.g(r13)
            ax.r7.z r8 = ax.r7.AbstractC2991z.w(r8)
            ax.i1.c r14 = new ax.i1.c
            r14.<init>()
            java.util.List r8 = ax.r7.I.i(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = ax.S0.C0968a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            ax.r7.z r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i1.C2214d.g(ax.P0.k, android.net.Uri, java.util.Map, long, long, ax.q1.t):void");
    }
}
