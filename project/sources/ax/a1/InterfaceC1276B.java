package ax.a1;

import android.media.AudioDeviceInfo;
import ax.P0.C0894c;
import ax.P0.C0898g;
import ax.P0.C0912v;
import ax.S0.InterfaceC0975h;
import ax.Z0.I1;
import java.nio.ByteBuffer;

/* renamed from: ax.a1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1276B {

    /* renamed from: ax.a1.B$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public a(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
            this.f = i4;
        }
    }

    /* renamed from: ax.a1.B$d */
    public interface d {
        void a(long j);

        void b(a aVar);

        void c(int i);

        void d();

        void e(boolean z);

        void f(Exception exc);

        void g(a aVar);

        void h();

        void i(int i, long j, long j2);

        void j();

        void k();

        void l();
    }

    /* renamed from: ax.a1.B$e */
    public static final class e extends Exception {
        public final long c0;
        public final long q;

        public e(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.q = j;
            this.c0 = j2;
        }
    }

    /* renamed from: ax.a1.B$f */
    public static final class f extends Exception {
        public final boolean c0;
        public final C0912v d0;
        public final int q;

        public f(int i, C0912v c0912v, boolean z) {
            super("AudioTrack write failed: " + i);
            this.c0 = z;
            this.q = i;
            this.d0 = c0912v;
        }
    }

    void A(C0894c c0894c);

    void B(InterfaceC0975h interfaceC0975h);

    void C(C0898g c0898g);

    boolean D(ByteBuffer byteBuffer, long j, int i) throws c, f;

    void E(boolean z);

    void a();

    boolean b(C0912v c0912v);

    boolean c();

    void d();

    void e(ax.P0.G g);

    void f();

    void flush();

    void g(AudioDeviceInfo audioDeviceInfo);

    ax.P0.G h();

    void i() throws f;

    void j(C0912v c0912v, int i, int[] iArr) throws b;

    boolean k();

    void l(float f2);

    void m();

    int n(C0912v c0912v);

    void o(int i);

    long p();

    void q(int i, int i2);

    void r(int i);

    long s(boolean z);

    void t();

    void u(long j);

    void v();

    void w(I1 i1);

    void x(d dVar);

    void y();

    C1296l z(C0912v c0912v);

    /* renamed from: ax.a1.B$b */
    public static final class b extends Exception {
        public final C0912v q;

        public b(Throwable th, C0912v c0912v) {
            super(th);
            this.q = c0912v;
        }

        public b(String str, C0912v c0912v) {
            super(str);
            this.q = c0912v;
        }
    }

    /* renamed from: ax.a1.B$c */
    public static final class c extends Exception {
        public final boolean c0;
        public final C0912v d0;
        public final int q;

        public c(String str, int i, C0912v c0912v, boolean z, Throwable th) {
            super(str, th);
            this.q = i;
            this.c0 = z;
            this.d0 = c0912v;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(int r4, int r5, int r6, int r7, int r8, ax.P0.C0912v r9, boolean r10, java.lang.Exception r11) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                r0.append(r5)
                r0.append(r8)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r9)
                if (r10 == 0) goto L3e
                java.lang.String r5 = " (recoverable)"
                goto L40
            L3e:
                java.lang.String r5 = ""
            L40:
                r0.append(r5)
                java.lang.String r7 = r0.toString()
                r6 = r3
                r8 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.a1.InterfaceC1276B.c.<init>(int, int, int, int, int, ax.P0.v, boolean, java.lang.Exception):void");
        }
    }
}
