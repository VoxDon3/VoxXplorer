package ax.W2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ax.W2.h;
import ax.X2.Q;
import ax.b3.C1490e;
import ax.b3.C1492g;
import ax.b3.C1495j;
import ax.b3.C1497l;
import ax.b3.D;
import ax.b3.F;
import ax.b3.H;
import ax.b3.I;
import ax.b3.InterfaceC1485A;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class j {
    private static final Logger v = ax.Q2.g.b("FileManager.CommandOperator");
    final h.a b;
    private CommandService c;
    private int o;
    private String p;
    private String q;
    private Thread r;
    private long t;
    private h.b d = h.b.UNDEFINED;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private ArrayList<K> m = new ArrayList<>();
    private d n = d.NONE;
    private final Object s = new Object();
    ax.g3.i u = new b();
    final v a = new v(this);

    class a implements Runnable {
        final /* synthetic */ boolean q;

        a(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f0(this.q);
        }
    }

    class b implements ax.g3.i {
        b() {
        }

        @Override // ax.g3.i
        public void a(long j, long j2) {
            j.this.w().Y((int) j, (int) j2);
            if (j == 0 || j == j2) {
                j.this.l0(true);
            } else {
                j.this.l0(false);
            }
        }
    }

    public class c implements ax.g3.j {
        long a = 0;
        long b = 0;
        long c = 0;
        long d;

        c(long j) {
            this.d = j;
            if (j <= 0) {
                C3184b.f();
                this.d = 1L;
            }
        }

        @Override // ax.g3.i
        public void a(long j, long j2) {
            long j3 = j / this.d;
            long j4 = j3 - this.b;
            this.b = j3;
            j.this.w().d(j4);
            long j5 = j3 - this.a;
            if (j5 >= 262144 || j5 < 0 || j == j2) {
                this.a = j3;
                if (j == j2) {
                    j.this.l0(true);
                } else {
                    j.this.l0(false);
                }
            }
        }

        @Override // ax.g3.j
        public void b() {
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
        }

        public void c(long j) {
            this.d = j;
            if (j <= 0) {
                C3184b.f();
                this.d = 1L;
            }
        }
    }

    public enum d {
        NONE,
        PREPARED,
        STARTED,
        PAUSED,
        FINISHED,
        CANCELLED
    }

    private static class e extends AbstractC3199q<Void, Integer, Void> {
        j h;
        private boolean i;
        private boolean j;

        e(j jVar, boolean z, boolean z2) {
            super(AbstractC3199q.e.HIGHER);
            this.h = jVar;
            this.i = z;
            this.j = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            int r;
            String str;
            if (Q.a0() && (r = C3180B.r(this.h.r())) > 200) {
                CommandService q = CommandService.q();
                if (q != null) {
                    str = "foreground=" + q.t() + ",started=" + q.w();
                } else {
                    str = "no service";
                }
                ax.Ha.c.i(this.h.r()).f().b("DO FINALIZE TASK NOT FOREGROUND").g("Command:" + this.h.getClass().getName() + ",importance:" + r + ",service:" + str + "," + this.h.d + "," + this.h.n + "," + this.h.g + "," + this.h.f + "," + this.h.h + "," + this.i + "," + this.j).h();
            }
            this.h.m();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r1) {
            if (this.i) {
                this.h.n();
            } else if (this.j) {
                this.h.e0();
            }
        }
    }

    public enum f {
        NORMAL,
        SKIP,
        RENAME,
        OVERWRITE,
        OVERWRITE_NEWER,
        CANCEL
    }

    public j(h.a aVar) {
        this.b = aVar;
    }

    private int N(int i) {
        switch (i) {
            case 10:
                return R.string.error_not_enough_storage;
            case 20:
                return R.string.error_file_not_found;
            case 30:
                return R.string.error_access_denied;
            case 40:
                return R.string.error_illegal_filename;
            case 50:
                return R.string.error_network;
            case 60:
                return R.string.error_usb_removed;
            case 70:
                return R.string.error_file_too_large;
            case 80:
                return R.string.error_unsupported_encryption;
            case 90:
                return R.string.error_read_only_delete;
            case 100:
                return R.string.error_read_only_file_system;
            case ax.L.c.d3 /* 110 */:
                return R.string.error_file_is_in_use;
            case 120:
                return R.string.error_name_not_allowed;
            case 130:
                return R.string.msg_delete_failed;
            case 140:
                return R.string.msg_create_folder_failure;
            case 150:
                return R.string.error_storage_corruption_detected;
            case 155:
                return R.string.file_corrupted;
            case 160:
                return R.string.error_wrong_password;
            default:
                return 0;
        }
    }

    private int O(int i, boolean z) {
        int N = N(i);
        return (Q.P() && z && (i == 30 || i == 100 || i == 90 || N == 0)) ? R.string.error_kitkat_sdcard : N;
    }

    private int l(C1495j c1495j) {
        if (c1495j instanceof ax.b3.s) {
            return 10;
        }
        if (c1495j instanceof C1490e) {
            return 30;
        }
        if (c1495j instanceof ax.b3.t) {
            return 20;
        }
        if (c1495j instanceof ax.b3.n) {
            return 40;
        }
        if (c1495j instanceof ax.b3.o) {
            return 120;
        }
        if (c1495j instanceof ax.b3.q) {
            return 50;
        }
        if (c1495j instanceof H) {
            return 60;
        }
        if (c1495j instanceof D) {
            return 70;
        }
        if (c1495j instanceof F) {
            return 80;
        }
        if (c1495j instanceof I) {
            return 160;
        }
        if (c1495j instanceof ax.b3.w) {
            return 90;
        }
        if (c1495j instanceof ax.b3.x) {
            return 100;
        }
        if (c1495j instanceof C1497l) {
            return ax.L.c.d3;
        }
        if (c1495j instanceof ax.b3.B) {
            return 150;
        }
        if (c1495j instanceof ax.b3.z) {
            return 170;
        }
        return c1495j instanceof C1492g ? 155 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (w().R()) {
            return;
        }
        synchronized (this.s) {
            try {
                if (w().R()) {
                    return;
                }
                w().X(true);
                Y();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Z();
        i0();
        e0();
    }

    private String s() {
        return this.q;
    }

    public abstract String A();

    public abstract int B();

    public abstract String C();

    public h.b D() {
        return this.d;
    }

    protected Object E() {
        return null;
    }

    protected abstract String F();

    protected abstract String G();

    public abstract K H();

    public String I() {
        return !TextUtils.isEmpty(J()) ? d0.h(J()) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public abstract String J();

    public abstract K K();

    public String L() {
        return !TextUtils.isEmpty(M()) ? d0.h(M()) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public abstract String M();

    protected abstract boolean P();

    public boolean Q() {
        return this.g || this.f || this.h;
    }

    public boolean R() {
        return this.g;
    }

    protected boolean S(AbstractC3199q abstractC3199q) {
        return (abstractC3199q == null || abstractC3199q.isCancelled() || abstractC3199q.m() != AbstractC3199q.f.RUNNING) ? false : true;
    }

    public boolean T() {
        return this.e;
    }

    public c U(int i) {
        return new c(i);
    }

    public ax.g3.i V() {
        return new c(1L);
    }

    protected abstract void W();

    protected abstract boolean X();

    protected abstract void Y();

    protected abstract void Z();

    public abstract void c0();

    public final void d0() {
        if (Q() || this.l) {
            return;
        }
        this.n = d.PAUSED;
        this.l = true;
        a0();
    }

    protected void e0() {
        C3184b.c(this.d != h.b.UNDEFINED);
        if (this.k) {
            ax.Ha.c.h().d("COMOP CALL AGAIN").j().h();
            return;
        }
        n0();
        if (this.b != null) {
            this.b.a(D(), F(), G(), D() == h.b.SUCCESS ? w().I() : w().m(), E());
        }
        k();
        j();
        this.k = true;
    }

    public final void f0(boolean z) {
        if (!this.i) {
            this.i = true;
            W();
            h0();
        }
        if (z || this.j) {
            return;
        }
        this.j = true;
        if (Q.X1() && P()) {
            new e(this, false, true).i(new Void[0]);
        } else {
            e0();
        }
    }

    public final void g0() {
        f0(false);
    }

    public void h(K k) {
        this.m.add(k);
    }

    public void h0() {
        this.n = d.CANCELLED;
        this.c.A(this);
    }

    @SuppressLint({"WrongThread"})
    public final void i() {
        if (Q()) {
            return;
        }
        this.h = true;
        boolean X = X();
        t0(h.b.CANCELLED);
        if (this.r != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(new a(X));
        } else {
            f0(X);
        }
    }

    public void i0() {
        this.n = d.FINISHED;
        this.c.B(this);
    }

    public void j() {
        this.c.h();
    }

    public void j0() {
        this.n = d.PREPARED;
        this.c.C(this);
    }

    public abstract void k();

    public void k0() {
        this.a.b0();
        this.n = d.STARTED;
        this.c.D(this);
    }

    public synchronized void l0(boolean z) {
        if (R()) {
            return;
        }
        this.c.E(this, z);
    }

    public final void m0() {
        if (!Q() && this.l) {
            this.n = d.STARTED;
            this.l = false;
            b0();
        }
    }

    public abstract void n0();

    public final void o() {
        if (Q()) {
            return;
        }
        this.f = true;
        if (Q.X1() && P()) {
            new e(this, true, false).i(new Void[0]);
        } else {
            n();
        }
    }

    public void o0(long j) {
        this.t = j;
    }

    public long p() {
        return this.t;
    }

    public void p0(CommandService commandService) {
        this.c = commandService;
    }

    public CommandService q() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int q0(C1495j c1495j) {
        int l = l(c1495j);
        if (l != 0) {
            r0(l);
        }
        if (c1495j instanceof InterfaceC1485A) {
            s0(((InterfaceC1485A) c1495j).e());
        }
        this.q = c1495j.getClass().getSimpleName() + ":" + c1495j.getMessage();
        if (c1495j.getCause() != null) {
            String message = c1495j.getCause().getMessage();
            if (c1495j.getMessage() != null && message != null && !c1495j.getMessage().contains(message)) {
                this.q += ":" + message;
            }
        }
        return l;
    }

    public Context r() {
        return this.c;
    }

    protected void r0(int i) {
        this.o = i;
    }

    protected void s0(String str) {
        this.p = str;
    }

    protected int t() {
        return this.o;
    }

    public synchronized void t0(h.b bVar) {
        this.d = bVar;
        this.g = true;
    }

    protected String u() {
        return this.p;
    }

    public void u0(Thread thread) {
        this.e = true;
        h.a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        }
        c0();
        this.r = thread;
    }

    protected String v(boolean z) {
        int O = z ? O(t(), z) : N(t());
        String string = O != 0 ? r().getResources().getString(O) : !TextUtils.isEmpty(u()) ? u() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (s() == null || !ax.t3.j.o(r())) {
            return string;
        }
        if (TextUtils.isEmpty(string)) {
            return s();
        }
        return string + "\n" + s();
    }

    protected void v0() {
        while (z() == d.PAUSED) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    public v w() {
        return this.a;
    }

    protected ax.g3.i x() {
        return this.u;
    }

    public List<K> y() {
        return this.m;
    }

    public d z() {
        return this.n;
    }

    protected void a0() {
    }

    protected void b0() {
    }
}
