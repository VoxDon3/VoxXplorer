package ax.W2;

import android.content.Context;
import android.os.SystemClock;
import ax.c3.C1809B;
import ax.c3.K;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public class v {
    private int a;
    private boolean f;
    private int g;
    private long k;
    private boolean m;
    private boolean o;
    private long p;
    private long q;
    private int s;
    private int t;
    private a u;
    private boolean v;
    private j y;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int h = 0;
    private long i = 0;
    private long j = 0;
    private long l = 0;
    private boolean n = false;
    private ArrayList<String> w = new ArrayList<>();
    private ArrayList<String> x = new ArrayList<>();
    private boolean r = false;

    public enum a {
        NONE,
        SCANNING,
        SYNC,
        COMPRESS,
        RESOURCE_CLEAR
    }

    public enum b {
        SUCCESS,
        FAILURE,
        SKIPPED
    }

    public v(j jVar) {
        this.y = jVar;
    }

    public String A(Context context) {
        return r() ? HttpUrl.FRAGMENT_ENCODE_SET : this.i == -1 ? String.format("%s", C1809B.i(context, z())) : String.format("%1$s / %2$s", C1809B.i(context, z()), C1809B.i(context, O()));
    }

    public long B() {
        if (this.n) {
            long j = this.h - this.b;
            long P = P();
            if (P == 0) {
                return -1L;
            }
            return (j * 1000) / P;
        }
        long j2 = this.i - this.j;
        long P2 = P();
        if (P2 == 0) {
            return -1L;
        }
        return j2 / P2;
    }

    public int C() {
        return this.e;
    }

    public long D() {
        return this.k;
    }

    public K E() {
        return this.y.H();
    }

    public String F() {
        return this.y.I();
    }

    public String G() {
        return this.y.J();
    }

    public int H() {
        return this.c;
    }

    public ArrayList<String> I() {
        return this.x;
    }

    public K J() {
        return this.y.K();
    }

    public String K() {
        return this.y.L();
    }

    public String L() {
        return this.y.M();
    }

    public int M() {
        return this.h;
    }

    public long N() {
        return this.i;
    }

    public long O() {
        return this.i - this.k;
    }

    public long P() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.p;
        if (uptimeMillis <= 0) {
            return 0L;
        }
        return this.n ? (this.b * 1000000) / uptimeMillis : (this.j * 1000) / uptimeMillis;
    }

    public boolean Q() {
        return this.v;
    }

    public boolean R() {
        return this.r;
    }

    public void S(boolean z) {
        this.v = z;
    }

    public void T(a aVar) {
        this.u = aVar;
        this.y.l0(true);
    }

    public void U(long j) {
        this.l = j;
    }

    public void V(int i) {
        this.g = i;
    }

    public void W(int i) {
        this.d = i;
    }

    public void X(boolean z) {
        this.r = z;
    }

    public void Y(int i, int i2) {
        this.s = i;
        this.t = i2;
    }

    public void Z(boolean z) {
        this.m = z;
    }

    public void a(int i) {
        this.a += i;
    }

    public void a0(boolean z) {
        this.n = z;
    }

    public void b(String str) {
        this.w.add(str);
    }

    public void b0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.p = uptimeMillis;
        this.q = uptimeMillis;
    }

    public void c(b bVar, int i) {
        this.b += i;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.c += i;
        } else if (ordinal == 1) {
            this.d += i;
        } else {
            if (ordinal != 2) {
                return;
            }
            this.e += i;
        }
    }

    public void c0(long j) {
        this.j = j;
    }

    public void d(long j) {
        this.j += j;
    }

    public void d0(int i) {
        this.h = i;
    }

    public void e(long j) {
        this.k += j;
    }

    public void e0(long j) {
        this.i = j;
    }

    public void f(String str) {
        this.x.add(str);
    }

    public void f0(boolean z) {
        this.f = z;
    }

    public void g(int i) {
        this.h += i;
    }

    public void h(long j) {
        this.i += j;
    }

    public int i() {
        a aVar = this.u;
        if (aVar == a.SYNC || aVar == a.RESOURCE_CLEAR) {
            return R.string.msg_finishing_operation;
        }
        if (aVar == a.COMPRESS) {
            return R.string.progress_compressing;
        }
        C3184b.d(aVar != null);
        return R.string.scanning_for_files;
    }

    public int j() {
        return this.f ? this.a : this.b;
    }

    public int k() {
        return this.f ? this.g : this.h;
    }

    public long l() {
        return (SystemClock.uptimeMillis() - this.p) / 1000;
    }

    public ArrayList<String> m() {
        return this.w;
    }

    public int n() {
        return this.d;
    }

    public int o() {
        return this.s;
    }

    public String p() {
        return q() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : String.format("%1$d / %2$d", Integer.valueOf(o()), Integer.valueOf(q()));
    }

    public int q() {
        return this.t;
    }

    public boolean r() {
        return this.m;
    }

    public boolean s() {
        return this.n;
    }

    public int t() {
        if (this.n) {
            return x();
        }
        long z = z() + D();
        return this.o ? (int) (z / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) : (int) z;
    }

    public int u() {
        if (this.n) {
            return M();
        }
        long j = this.i;
        if (j > 1048576) {
            this.o = true;
            j /= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        } else {
            this.o = false;
        }
        return (int) j;
    }

    public String v() {
        return this.y.A();
    }

    public String w() {
        return this.n ? ((long) this.h) > 0 ? String.format("%.2f%%", Float.valueOf((x() / M()) * 100.0f)) : String.format("%d%%", 0) : this.i > 0 ? String.format("%.2f%%", Float.valueOf((z() / O()) * 100.0f)) : String.format("%d%%", 0);
    }

    public int x() {
        return this.b;
    }

    public String y() {
        return String.format("%1$d / %2$d", Integer.valueOf(j()), Integer.valueOf(k()));
    }

    public long z() {
        return this.j;
    }
}
