/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ax.Q2.g;
import ax.W2.h;
import ax.W2.v;
import ax.X2.Q;
import ax.b3.A;
import ax.b3.B;
import ax.b3.D;
import ax.b3.F;
import ax.b3.H;
import ax.b3.I;
import ax.b3.l;
import ax.b3.n;
import ax.b3.o;
import ax.b3.s;
import ax.b3.t;
import ax.b3.w;
import ax.b3.x;
import ax.b3.z;
import ax.c3.K;
import ax.c3.d0;
import ax.g3.i;
import ax.u3.b;
import ax.u3.q;
import com.voxdon.xplorer.service.CommandService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class j {
    private static final Logger v = ax.Q2.g.b("FileManager.CommandOperator");
    final v a;
    final h.a b;
    private CommandService c;
    private h.b d = h.b.q;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private ArrayList<K> m = new ArrayList();
    private d n = ax.W2.j$d.q;
    private int o;
    private String p;
    private String q;
    private Thread r;
    private final Object s = new Object();
    private long t;
    i u = new i(this){
        final j a;
        {
            this.a = j8;
        }

        @Override
        public void a(long l8, long l9) {
            this.a.w().Y((int)l8, (int)l9);
            if (l8 != 0L && l8 != l9) {
                this.a.l0(false);
                return;
            }
            this.a.l0(true);
        }
    };

    public j(h.a a8) {
        this.a = new v(this);
        this.b = a8;
    }

    private int N(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 160: {
                return 2131951971;
            }
            case 155: {
                return 2131952047;
            }
            case 150: {
                return 2131951965;
            }
            case 140: {
                return 2131952331;
            }
            case 130: {
                return 2131952335;
            }
            case 120: {
                return 2131951947;
            }
            case 110: {
                return 2131951933;
            }
            case 100: {
                return 2131951964;
            }
            case 90: {
                return 2131951963;
            }
            case 80: {
                return 2131951969;
            }
            case 70: {
                return 2131951938;
            }
            case 60: {
                return 2131951970;
            }
            case 50: {
                return 2131951948;
            }
            case 40: {
                return 2131951941;
            }
            case 30: {
                return 2131951929;
            }
            case 20: {
                return 2131951935;
            }
            case 10: 
        }
        return 2131951952;
    }

    private int O(int n8, boolean bl) {
        int n9 = this.N(n8);
        if (Q.P() && bl && (n8 == 30 || n8 == 100 || n8 == 90 || n9 == 0)) {
            return 2131951944;
        }
        return n9;
    }

    private int l(ax.b3.j j8) {
        if (j8 instanceof s) {
            return 10;
        }
        if (j8 instanceof ax.b3.e) {
            return 30;
        }
        if (j8 instanceof t) {
            return 20;
        }
        if (j8 instanceof n) {
            return 40;
        }
        if (j8 instanceof o) {
            return 120;
        }
        if (j8 instanceof ax.b3.q) {
            return 50;
        }
        if (j8 instanceof H) {
            return 60;
        }
        if (j8 instanceof D) {
            return 70;
        }
        if (j8 instanceof F) {
            return 80;
        }
        if (j8 instanceof I) {
            return 160;
        }
        if (j8 instanceof w) {
            return 90;
        }
        if (j8 instanceof x) {
            return 100;
        }
        if (j8 instanceof l) {
            return 110;
        }
        if (j8 instanceof B) {
            return 150;
        }
        if (j8 instanceof z) {
            return 170;
        }
        if (j8 instanceof ax.b3.g) {
            return 155;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m() {
        if (this.w().R()) {
            return;
        }
        Object object = this.s;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.w().R()) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.w().X(true);
                this.Y();
                return;
            }
            throw throwable2;
        }
    }

    private void n() {
        this.Z();
        this.i0();
        this.e0();
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
        if (!TextUtils.isEmpty((CharSequence)this.J())) {
            return d0.h(this.J());
        }
        return "";
    }

    public abstract String J();

    public abstract K K();

    public String L() {
        if (!TextUtils.isEmpty((CharSequence)this.M())) {
            return d0.h(this.M());
        }
        return "";
    }

    public abstract String M();

    protected abstract boolean P();

    public boolean Q() {
        return this.g || this.f || this.h;
        {
        }
    }

    public boolean R() {
        return this.g;
    }

    protected boolean S(q q8) {
        return q8 != null && !q8.isCancelled() && q8.m() == q.f.c0;
    }

    public boolean T() {
        return this.e;
    }

    public c U(int n8) {
        return new c(this, n8);
    }

    public i V() {
        return new c(this, 1L);
    }

    protected abstract void W();

    protected abstract boolean X();

    protected abstract void Y();

    protected abstract void Z();

    protected void a0() {
    }

    protected void b0() {
    }

    public abstract void c0();

    public final void d0() {
        if (this.Q() || this.l) {
            return;
        }
        this.n = ax.W2.j$d.e0;
        this.l = true;
        this.a0();
    }

    protected void e0() {
        boolean bl = this.d != h.b.q;
        ax.u3.b.c(bl);
        if (this.k) {
            ax.Ha.c.h().d("COMOP CALL AGAIN").j().h();
            return;
        }
        this.n0();
        if (this.b != null) {
            ArrayList<String> arrayList = this.D() == h.b.c0 ? this.w().I() : this.w().m();
            this.b.a(this.D(), this.F(), this.G(), arrayList, this.E());
        }
        this.k();
        this.j();
        this.k = true;
    }

    public final void f0(boolean bl) {
        if (!this.i) {
            this.i = true;
            this.W();
            this.h0();
        }
        if (!bl && !this.j) {
            this.j = true;
            if (Q.X1() && this.P()) {
                new e(this, false, true).i(new Void[0]);
                return;
            }
            this.e0();
        }
    }

    public final void g0() {
        this.f0(false);
    }

    public void h(K k8) {
        this.m.add(k8);
    }

    public void h0() {
        this.n = ax.W2.j$d.g0;
        this.c.A(this);
    }

    @SuppressLint(value={"WrongThread"})
    public final void i() {
        if (this.Q()) {
            return;
        }
        this.h = true;
        boolean bl = this.X();
        this.t0(h.b.e0);
        if (this.r != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(new Runnable(){
                final j c0;
                final boolean q;
                {
                    this.c0 = j8;
                    this.q = bl;
                }

                @Override
                public void run() {
                    this.c0.f0(this.q);
                }
            });
            return;
        }
        this.f0(bl);
    }

    public void i0() {
        this.n = ax.W2.j$d.f0;
        this.c.B(this);
    }

    public void j() {
        this.c.h();
    }

    public void j0() {
        this.n = ax.W2.j$d.c0;
        this.c.C(this);
    }

    public abstract void k();

    public void k0() {
        this.a.b0();
        this.n = ax.W2.j$d.d0;
        this.c.D(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l0(boolean bl) {
        synchronized (this) {
            boolean bl2 = this.R();
            if (bl2) {
                return;
            }
            this.c.E(this, bl);
            return;
        }
    }

    public final void m0() {
        if (this.Q() || !this.l) {
            return;
        }
        this.n = ax.W2.j$d.d0;
        this.l = false;
        this.b0();
    }

    public abstract void n0();

    public final void o() {
        if (this.Q()) {
            return;
        }
        this.f = true;
        if (Q.X1() && this.P()) {
            new e(this, true, false).i(new Void[0]);
            return;
        }
        this.n();
    }

    public void o0(long l8) {
        this.t = l8;
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

    protected int q0(ax.b3.j serializable) {
        int n8 = this.l((ax.b3.j)serializable);
        if (n8 != 0) {
            this.r0(n8);
        }
        if (serializable instanceof A) {
            this.s0(((A)((Object)serializable)).e());
        }
        CharSequence charSequence = new StringBuilder();
        charSequence.append(serializable.getClass().getSimpleName());
        charSequence.append(":");
        charSequence.append(((Throwable)serializable).getMessage());
        this.q = charSequence.toString();
        if (((Throwable)serializable).getCause() != null) {
            charSequence = ((Throwable)serializable).getCause().getMessage();
            if (((Throwable)serializable).getMessage() != null && charSequence != null && !((Throwable)serializable).getMessage().contains(charSequence)) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(this.q);
                ((StringBuilder)serializable).append(":");
                ((StringBuilder)serializable).append((String)charSequence);
                this.q = ((StringBuilder)serializable).toString();
            }
        }
        return n8;
    }

    public Context r() {
        return this.c;
    }

    protected void r0(int n8) {
        this.o = n8;
    }

    protected void s0(String string) {
        this.p = string;
    }

    protected int t() {
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t0(h.b b8) {
        synchronized (this) {
            this.d = b8;
            this.g = true;
            return;
        }
    }

    protected String u() {
        return this.p;
    }

    public void u0(Thread thread) {
        this.e = true;
        h.a a8 = this.b;
        if (a8 != null) {
            a8.b();
        }
        this.c0();
        this.r = thread;
    }

    protected String v(boolean bl) {
        int n8 = bl ? this.O(this.t(), bl) : this.N(this.t());
        String string = n8 != 0 ? this.r().getResources().getString(n8) : (!TextUtils.isEmpty((CharSequence)this.u()) ? this.u() : "");
        CharSequence charSequence = string;
        if (this.s() != null) {
            charSequence = string;
            if (ax.t3.j.o(this.r())) {
                if (TextUtils.isEmpty((CharSequence)string)) {
                    return this.s();
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("\n");
                ((StringBuilder)charSequence).append(this.s());
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    protected void v0() {
        while (this.z() == ax.W2.j$d.e0) {
            try {
                Thread.sleep(100L);
            }
            catch (Exception exception) {}
        }
    }

    public v w() {
        return this.a;
    }

    protected i x() {
        return this.u;
    }

    public List<K> y() {
        return this.m;
    }

    public d z() {
        return this.n;
    }

    public class c
    implements ax.g3.j {
        long a;
        long b;
        long c;
        long d;
        final j e;

        c(j j8, long l8) {
            this.e = j8;
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
            this.d = l8;
            if (l8 <= 0L) {
                ax.u3.b.f();
                this.d = 1L;
            }
        }

        @Override
        public void a(long l8, long l9) {
            long l10 = l8 / this.d;
            long l11 = this.b;
            this.b = l10;
            this.e.w().d(l10 - l11);
            l11 = l10 - this.a;
            if (l11 < 262144L && l11 >= 0L && l8 != l9) {
                return;
            }
            this.a = l10;
            if (l8 == l9) {
                this.e.l0(true);
                return;
            }
            this.e.l0(false);
        }

        @Override
        public void b() {
            this.a = 0L;
            this.b = 0L;
            this.c = 0L;
        }

        public void c(long l8) {
            this.d = l8;
            if (l8 <= 0L) {
                ax.u3.b.f();
                this.d = 1L;
            }
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        public static final /* enum */ d e0;
        public static final /* enum */ d f0;
        public static final /* enum */ d g0;
        private static final d[] h0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = new d();
            e0 = new d();
            f0 = new d();
            g0 = new d();
            h0 = ax.W2.j$d.d();
        }

        private static /* synthetic */ d[] d() {
            return new d[]{q, c0, d0, e0, f0, g0};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])h0.clone();
        }
    }

    private static class e
    extends q<Void, Integer, Void> {
        j h;
        private boolean i;
        private boolean j;

        e(j j8, boolean bl, boolean bl2) {
            super(q.e.d0);
            this.h = j8;
            this.i = bl;
            this.j = bl2;
        }

        protected Void w(Void ... object) {
            int n8;
            if (Q.a0() && (n8 = ax.u3.B.r(this.h.r())) > 200) {
                Object object2 = CommandService.q();
                if (object2 != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("foreground=");
                    ((StringBuilder)object).append(object2.t());
                    ((StringBuilder)object).append(",started=");
                    ((StringBuilder)object).append(object2.w());
                    object = ((StringBuilder)object).toString();
                } else {
                    object = "no service";
                }
                ax.Ha.b b8 = ax.Ha.c.i(this.h.r()).f().b("DO FINALIZE TASK NOT FOREGROUND");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Command:");
                ((StringBuilder)object2).append(this.h.getClass().getName());
                ((StringBuilder)object2).append(",importance:");
                ((StringBuilder)object2).append(n8);
                ((StringBuilder)object2).append(",service:");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append((Object)this.h.d);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append((Object)this.h.n);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(this.h.g);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(this.h.f);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(this.h.h);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(this.i);
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(this.j);
                b8.g(((StringBuilder)object2).toString()).h();
            }
            this.h.m();
            return null;
        }

        protected void x(Void void_) {
            if (this.i) {
                this.h.n();
                return;
            }
            if (this.j) {
                this.h.e0();
            }
        }
    }

    public static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        public static final /* enum */ f d0;
        public static final /* enum */ f e0;
        public static final /* enum */ f f0;
        public static final /* enum */ f g0;
        private static final f[] h0;
        public static final /* enum */ f q;

        static {
            q = new f();
            c0 = new f();
            d0 = new f();
            e0 = new f();
            f0 = new f();
            g0 = new f();
            h0 = ax.W2.j$f.d();
        }

        private static /* synthetic */ f[] d() {
            return new f[]{q, c0, d0, e0, f0, g0};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])h0.clone();
        }
    }
}

