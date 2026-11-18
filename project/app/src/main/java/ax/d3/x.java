/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import ax.Q2.a;
import ax.Q2.e;
import ax.Q2.f;
import ax.Q2.i;
import ax.U2.d;
import ax.X2.Q;
import ax.Z2.j;
import ax.a3.n;
import ax.c3.B;
import ax.c3.K;
import ax.c3.k0;
import ax.g3.c;
import ax.t3.k;
import ax.u3.b;
import ax.u3.g;
import ax.u3.l;
import ax.u3.q;
import ax.x3.v;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.w;
import com.voxdon.xplorer.service.CommandService;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

public abstract class x
extends ax.d3.n {
    private static final Logger O0 = Logger.getLogger("FileManager.DesktopParentFragment");
    private BroadcastReceiver C0;
    private Snackbar D0;
    private Snackbar E0;
    private Snackbar F0;
    private ax.g3.e G0;
    private boolean H0;
    private i I0;
    private boolean J0 = true;
    private boolean K0 = false;
    private boolean L0 = false;
    private boolean M0 = false;
    BroadcastReceiver N0 = new BroadcastReceiver(this){
        final x a;
        {
            this.a = x8;
        }

        public void onReceive(Context context, Intent intent) {
            this.a.u5();
            this.a.v5();
        }
    };

    static /* synthetic */ BroadcastReceiver W4(x x8, BroadcastReceiver broadcastReceiver) {
        x8.C0 = broadcastReceiver;
        return broadcastReceiver;
    }

    private void Z4() {
        block7: {
            block6: {
                if (this.f0() == null) break block6;
                if (ax.u3.o.e((Context)this.f0())) {
                    this.L0 = true;
                    return;
                }
                if (!((MainActivity)this.f0()).X1()) break block7;
                if (!this.K0) {
                    this.f5();
                }
            }
            return;
        }
        this.L0 = false;
        if (this.J0) {
            ((MainActivity)this.f0()).F2(k.v());
            this.f5();
            a.i().p("show_permission_screen").c();
            this.J0 = false;
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable(this){
            final x q;
            {
                this.q = x8;
            }

            @Override
            public void run() {
                if (this.q.f0() == null) {
                    return;
                }
                if (Q.z0()) {
                    this.q.r5();
                    return;
                }
                this.q.t5();
            }
        });
    }

    private void f5() {
        g.a().d("local.intent.action.STORAGE_GRANTED", this.N0);
        this.K0 = true;
    }

    private void m5() {
        this.I0.h();
    }

    private void r5() {
        if (!Q.z0()) {
            b.f();
            return;
        }
        if (this.s0() == null) {
            return;
        }
        ax.a3.n n8 = ax.a3.n.l3(2131952653, 2131952543, 17039370, 0, false, false);
        n8.n3(new n.c(this){
            final x a;
            {
                this.a = x8;
            }

            @Override
            public void G(ax.a3.n n8) {
            }

            @Override
            public void P(ax.a3.n n8) {
                if (this.a.f0() == null) {
                    return;
                }
                this.a.h5();
            }

            @Override
            public void Z(ax.a3.n n8) {
            }
        });
        ax.u3.B.d0(this.A0(), n8, "allfilesaccess", true);
    }

    private void t5() {
        this.I0.i();
    }

    private void u5() {
        this.L0 = true;
        B.f();
        e.Q();
        j.F().x();
        j.F().K0();
        Object object = K.e.e();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            if (!(!((File)(object = new File((String)object))).exists() || ((File)object).canRead() && ((File)object).canWrite())) {
                if (this.f0() != null) {
                    ax.u3.B.Y((Context)this.f0());
                    return;
                }
            } else {
                if (this.f0() != null && ((MainActivity)this.f0()).V1()) {
                    this.f0().finish();
                    return;
                }
                this.g5(true);
            }
        }
    }

    private void v5() {
        g.a().h(this.N0);
        this.K0 = false;
    }

    @Override
    public String C3() {
        return null;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override
    public void M4() {
    }

    @Override
    public boolean N3() {
        return false;
    }

    @Override
    public boolean V2() {
        return false;
    }

    @Override
    protected boolean W2() {
        return true;
    }

    protected void X4(v v8, K object) {
        f f8 = ((K)object).d();
        this.f0().getMenuInflater().inflate(2131689483, (Menu)v8);
        v8.g0(((K)object).f((Context)this.f0()));
        object = new MenuItem.OnMenuItemClickListener(){
            final K a;
            final f b;
            final x c;
            {
                this.c = x8;
                this.a = k8;
                this.b = f8;
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                if (this.c.f0() == null) {
                    return true;
                }
                int n8 = menuItem.getItemId();
                if (n8 != 2131362509) {
                    if (n8 != 2131362544) {
                        if (n8 == 2131362546) {
                            this.c.S2(this.a, null, false);
                        }
                    } else {
                        ((com.voxdon.xplorer.activity.a)this.c.f0()).N(this.a);
                    }
                } else if (CommandService.x(this.b)) {
                    this.c.E4(2131951932, 1);
                } else {
                    j.F().y();
                }
                return true;
            }
        };
        if (!f.w0(f8)) {
            if (f8 == f.b1) {
                v8 = v8.findItem(2131362509);
                v8.setVisible(true);
                v8.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object);
                return;
            }
            if (ax.t3.j.x(this.o3())) {
                v8 = v8.findItem(2131362546);
                v8.setVisible(true);
                v8.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object);
            }
            return;
        }
        v8 = v8.findItem(2131362544);
        v8.setVisible(true);
        v8.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)object);
    }

    protected boolean Y4(K k8) {
        UsbDevice usbDevice = ax.Q2.o.i().f((Context)this.f0());
        if (usbDevice != null && !ax.Q2.o.i().l((Context)this.f0(), usbDevice)) {
            this.i5(usbDevice, k8, this.G0);
            return true;
        }
        return false;
    }

    @Override
    public void Z3(String string) {
    }

    protected void a5() {
        O0.fine("desktop info load finished");
        ax.h3.c.d(this, 3600000L);
    }

    protected void b5() {
        Snackbar snackbar = this.D0;
        if (snackbar != null) {
            snackbar.x();
            this.D0 = null;
        }
        if ((snackbar = this.E0) != null) {
            snackbar.x();
            this.E0 = null;
        }
        if ((snackbar = this.F0) != null) {
            snackbar.x();
            this.F0 = null;
        }
    }

    public boolean c5() {
        return this.H0;
    }

    void d5(K k8) {
        this.G0.g(k8);
    }

    protected void e5() {
        new o(this).i(new Void[0]);
    }

    protected abstract void g5(boolean var1);

    @Override
    public void h1(Bundle bundle) {
        super.h1(bundle);
        this.Z4();
    }

    public void h5() {
        if (this.b() == null) {
            return;
        }
        this.I0.g();
    }

    @Override
    public void i1(int n8, int n9, Intent intent) {
        if (this.b() == null) {
            return;
        }
        this.I0.b(this.b(), n8, n9, intent, new i.a(this){
            final x a;
            {
                this.a = x8;
            }

            @Override
            public void a(boolean bl) {
                b.f();
            }

            @Override
            public void b() {
                this.a.u5();
            }

            @Override
            public void c() {
                this.a.n5(2);
            }
        }, new i.a(this){
            final x a;
            {
                this.a = x8;
            }

            @Override
            public void a(boolean bl) {
                b.f();
            }

            @Override
            public void b() {
                this.a.u5();
                this.a.l5();
            }

            @Override
            public void c() {
                this.a.r5();
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    protected void i5(UsbDevice usbDevice, K k8, ax.g3.e e8) {
        if (this.f0() != null) {
            Throwable var1_4;
            if (this.C0 != null) {
                this.f0().unregisterReceiver(this.C0);
                this.C0 = null;
            }
            this.C0 = new BroadcastReceiver(this, e8, k8){
                final ax.g3.e a;
                final K b;
                final x c;
                {
                    this.c = x8;
                    this.a = e8;
                    this.b = k8;
                }

                public void onReceive(Context context, Intent intent) {
                    if ("com.filemanager.action.USB_PERMISSION".equals(intent.getAction())) {
                        if (intent.getBooleanExtra("permission", false) && this.c.X0()) {
                            this.a.g(this.b);
                        }
                        if (this.c.C0 != null && this.c.f0() != null) {
                            this.c.f0().unregisterReceiver(this.c.C0);
                            x.W4(this.c, null);
                        }
                    }
                }
            };
            k8 = new IntentFilter();
            k8.addAction("com.filemanager.action.USB_PERMISSION");
            ax.Q.b.i((Context)this.f0(), this.C0, (IntentFilter)k8, 2);
            k8 = (UsbManager)this.f0().getSystemService("usb");
            e8 = new Intent("com.filemanager.action.USB_PERMISSION");
            e8.setPackage(this.f0().getPackageName());
            e8 = l.b((Context)this.f0(), 0, (Intent)e8, 0);
            try {
                k8.requestPermission(usbDevice, (PendingIntent)e8);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
            ax.Ha.c.h().d("USB permission error").l((Throwable)var1_4).h();
            this.E4(2131951927, 1);
        }
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.G0 = (ax.g3.e)activity;
    }

    public void j5(boolean bl) {
        this.H0 = bl;
    }

    protected void k5(K object, float f8) {
        Object object2;
        if (this.b() == null || (object2 = this.F0) != null && ((BaseTransientBottomBar)object2).M()) {
            return;
        }
        object2 = ((K)object).f(this.b());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<font color='red'>");
        stringBuilder.append(ax.u3.B.P(f8));
        stringBuilder.append("</font>");
        object2 = Html.fromHtml((String)this.N0(2131952632, object2, stringBuilder.toString()));
        this.D0 = object = ax.u3.B.O(this.R0().findViewById(2131362848), (CharSequence)object2, -2, 2131951663, true, new c(this, (K)object){
            final K c;
            final x d;
            {
                this.d = x8;
                this.c = k8;
            }

            @Override
            public void a(View view) {
                a.i().m("menu_desktop", "analyze").c("by", "disk_full_snackbar").e();
                this.d.s5(this.c, true, "disk_full_snackbar");
            }
        });
        this.D4((Snackbar)object);
    }

    protected void l5() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
            final x q;
            {
                this.q = x8;
            }

            @Override
            public void run() {
            }
        }, 500L);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.I0 = new i(this);
    }

    protected void n5(int n8) {
        this.F0 = ax.u3.o.n(this.f0().findViewById(0x1020002), 2131952546, new c(this, n8){
            final int c;
            final x d;
            {
                this.d = x8;
                this.c = n8;
            }

            @Override
            public void a(View view) {
                if (this.d.f0() != null) {
                    int n8 = this.c;
                    if (n8 == 1) {
                        this.d.t5();
                        return;
                    }
                    if (n8 == 2) {
                        this.d.m5();
                        return;
                    }
                    if (n8 == 3) {
                        this.d.h5();
                    }
                }
            }
        });
    }

    protected void o5(long l8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<font color='red'>");
        stringBuilder.append(B.k(this.b(), l8));
        stringBuilder.append("</font>");
        this.q5((CharSequence)Html.fromHtml((String)this.N0(2131952355, stringBuilder.toString())), 0);
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        this.I0.c(n8, stringArray, nArray, new i.a(this){
            final x a;
            {
                this.a = x8;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    this.a.m5();
                    return;
                }
                this.a.n5(2);
            }

            @Override
            public void b() {
                this.a.u5();
                this.a.l5();
            }

            @Override
            public void c() {
                this.a.n5(1);
            }
        }, null);
    }

    protected void p5(long l8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<font color='red'>");
        stringBuilder.append(B.k(this.b(), l8));
        stringBuilder.append("</font>");
        this.q5((CharSequence)Html.fromHtml((String)this.N0(2131952356, stringBuilder.toString())), -2);
    }

    protected void q5(CharSequence object, int n8) {
        Snackbar snackbar;
        if (this.b() == null || (snackbar = this.F0) != null && snackbar.M()) {
            return;
        }
        this.E0 = object = ax.u3.B.O(this.R0().findViewById(2131362848), (CharSequence)object, n8, 2131952279, true, new c(this){
            final x c;
            {
                this.c = x8;
            }

            @Override
            public void a(View view) {
                a.i().m("menu_desktop", "open_recycle_bin").c("by", "recycle_bin_full_snackbar").e();
                ((MainActivity)this.c.f0()).G2("recycle_bin_full_snackbar");
            }
        });
        this.D4((Snackbar)object);
    }

    @Override
    public void s1() {
        super.s1();
        if (this.K0) {
            this.v5();
        }
    }

    public void s5(K k8, boolean bl, String string) {
        ((MainActivity)this.f0()).K2(k8, bl, string);
    }

    @Override
    public void v1() {
        super.v1();
        if (this.C0 != null) {
            this.b().unregisterReceiver(this.C0);
            this.C0 = null;
        }
    }

    protected void w5(Context context, ax.x3.n n8, ax.Z2.d d8, HashMap<f, w.f> hashMap) {
        for (int i8 = 0; i8 < n8.getCount(); ++i8) {
            CharSequence charSequence;
            K k8 = n8.a(i8);
            f f8 = k8.d();
            if (!f.g0(f8)) continue;
            w.f f9 = hashMap.get((Object)f8);
            if (f9 != null) {
                charSequence = B.j(context, f9.b);
                String string = B.k(context, f9.b);
                int n9 = f9.c;
                long l8 = f9.b;
                d8.x(k8, n9, l8, 0.0f, (String)charSequence, string);
                d8.y(f8, f9.d, f9.e);
                continue;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("null scaninfo location:");
            ((StringBuilder)charSequence).append((Object)f8);
            ax.Q2.d.c("updatelibaryadapter", new Exception(((StringBuilder)charSequence).toString()));
        }
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (bl) {
            this.b5();
            return;
        }
        this.Z4();
    }

    @Override
    public int x3() {
        return 0;
    }

    @Override
    public f z3() {
        return f.l0;
    }

    public static class n
    extends ax.K0.a<Void> {
        private int o;
        private String p;
        private String q;
        private ax.Z2.d r;
        private K s;
        private boolean t;
        private float u;
        private long v;
        private long w;
        Set<Integer> x;

        public n(Context context, ax.Z2.d d8, K k8, Set<Integer> set) {
            super(context);
            this.r = d8;
            this.s = k8;
            this.x = set;
        }

        void L(Context context, k0 k02) {
            long l8;
            this.o = k02.c;
            this.w = l8 = k02.a;
            this.p = B.j(context, l8);
            this.q = B.k(context, k02.a);
        }

        void M(Context context, k0 k02) {
            long l8;
            this.o = 0;
            this.w = l8 = k02.a;
            long l9 = k02.b;
            if (l9 != 0L) {
                this.p = B.m(context, l9, l8, B.a.c0);
                this.q = B.m(context, k02.b, k02.a, B.a.d0);
            }
        }

        public int N() {
            return this.o;
        }

        public long O() {
            return this.v;
        }

        public String P() {
            return this.p;
        }

        public f Q() {
            return this.s.d();
        }

        public K R() {
            return this.s;
        }

        public String S() {
            return this.q;
        }

        public long T() {
            return this.w;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        k0 U(K object, boolean bl) {
            block8: {
                Throwable throwable2;
                block7: {
                    block6: {
                        object = ax.c3.x.e((K)object);
                        ((com.voxdon.xplorer.file.o)object).n0();
                        if (bl) {
                            try {
                                if (((com.voxdon.xplorer.file.o)object).a()) break block6;
                                ((com.voxdon.xplorer.file.o)object).h(null);
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                    }
                    if (bl = ((com.voxdon.xplorer.file.o)object).a()) {
                        try {
                            k0 k02 = ((com.voxdon.xplorer.file.o)object).W();
                            ((com.voxdon.xplorer.file.o)object).k0(false);
                            return k02;
                        }
                        catch (ax.b3.j j8) {}
                    }
                    break block8;
                }
                ((com.voxdon.xplorer.file.o)object).k0(false);
                throw throwable2;
            }
            ((com.voxdon.xplorer.file.o)object).k0(false);
            return null;
        }

        public float V() {
            return this.u;
        }

        public boolean W() {
            return this.t;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Void X() {
            float f9;
            if (this.j() == null) {
                return null;
            }
            Object object = this.j().getApplicationContext();
            this.o = 0;
            this.p = null;
            this.q = null;
            boolean bl = ax.t3.e.h(this.j(), f.V0, 0, null, false);
            if (!f.r0(this.s, true)) {
                if (this.s == K.f && j.F().v0()) {
                    object = this.j().getString(2131952302);
                    this.q = object;
                    this.p = object;
                    return null;
                }
                object = this.j().getString(2131952633);
                this.q = object;
                this.p = object;
                return null;
            }
            switch (d.a[this.s.d().ordinal()]) {
                default: {
                    return null;
                }
                case 23: {
                    float f8;
                    k0 k02 = this.U(K.e, true);
                    if (k02 == null) return null;
                    this.o = 0;
                    long l8 = k02.b;
                    if (l8 == 0L) return null;
                    this.u = f8 = (float)((double)k02.a * 100.0 / (double)l8);
                    if (f8 >= (float)e.l(object)) {
                        this.t = true;
                    }
                    object = object.getString(2131952686, new Object[]{ax.u3.B.P(this.u)});
                    this.p = object;
                    this.q = object;
                    return null;
                }
                case 22: {
                    this.w = j.F().o(null);
                    this.v = new File(K.e.e()).getUsableSpace();
                    this.o = 0;
                    this.p = String.format("%s", B.j(object, this.w));
                    this.q = String.format("%s", B.k(object, this.w));
                    return null;
                }
                case 21: {
                    this.o = T.e(object).size();
                    return null;
                }
                case 20: {
                    this.o = T.c(object).size();
                    return null;
                }
                case 19: {
                    long l9;
                    this.o = ax.U2.d.F(object).G(bl);
                    this.w = l9 = ax.U2.d.F(object).I(bl);
                    this.p = B.j(object, l9);
                    this.q = B.k(object, this.w);
                    if (!ax.U2.d.F(this.j()).W()) return null;
                    new d.d(this.j()).i(new Void[0]);
                    return null;
                }
                case 17: 
                case 18: {
                    this.q = "";
                    this.p = "";
                    return null;
                }
                case 14: 
                case 15: 
                case 16: {
                    k0 k03 = this.U(this.s, true);
                    if (k03 == null) return null;
                    this.L((Context)object, k03);
                    return null;
                }
                case 13: {
                    Object object2 = ax.c3.x.e(this.s);
                    try {
                        object2 = ((com.voxdon.xplorer.file.o)object2).W();
                        if (object2 == null) return null;
                        this.M((Context)object, (k0)object2);
                        return null;
                    }
                    catch (ax.b3.j j8) {
                        return null;
                    }
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: {
                    k0 k04 = this.U(this.s, true);
                    if (k04 == null) return null;
                    this.M((Context)object, k04);
                    return null;
                }
                case 1: 
                case 2: 
            }
            k0 k05 = this.U(this.s, true);
            if (k05 == null) return null;
            this.M((Context)object, k05);
            long l10 = k05.b;
            if (l10 == 0L) return null;
            this.u = f9 = (float)((double)k05.a * 100.0 / (double)l10);
            if (!(f9 >= (float)e.l(object))) return null;
            this.t = true;
            return null;
        }

        @Override
        protected void t() {
            this.x.add(this.k());
            this.a();
        }
    }

    private class o
    extends q<Void, Void, Void> {
        final x h;

        o(x x8) {
            this.h = x8;
            super(q.e.e0);
        }

        protected Void w(Void ... voidArray) {
            j.F().K0();
            return null;
        }

        protected void x(Void void_) {
            if (!this.h.X0() || this.h.c5()) {
                return;
            }
            this.h.g5(false);
        }
    }
}

