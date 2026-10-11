package ax.d3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.a3.AbstractDialogInterfaceOnClickListenerC1363t;
import ax.a3.L;
import ax.c3.C1832u;
import ax.i3.C2267c;
import ax.i3.EnumC2266b;
import ax.o3.n;
import ax.s3.C3045a;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import ax.x3.C3414J;
import ax.x3.InterfaceC3406B;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.C3598q;
import com.voxdon.xplorer.service.FtpServerService;
import com.voxdon.xplorer.widget.RefreshProgressBar;
import com.voxdon.xplorer.R;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l0 extends AbstractC1927n implements L.c {
    private Context C0;
    private ScrollView D0;
    private TextView E0;
    private CheckBox F0;
    private CheckBox G0;
    private View H0;
    private View I0;
    private View J0;
    private View K0;
    private View L0;
    private View M0;
    private EditText N0;
    private EditText O0;
    private TextView P0;
    private RecyclerView Q0;
    private View R0;
    private TextView S0;
    private View T0;
    private RefreshProgressBar U0;
    private ax.o3.o V0;
    private BroadcastReceiver W0;
    private WifiManager X0;
    private C2267c Y0;
    private EnumC2266b Z0;
    private String a1;
    private String b1;
    private int c1;
    private Handler d1;
    private FtpServerService e1;
    private ServiceConnection f1;
    private boolean g1;
    private boolean h1;
    private ax.o3.n i1;
    private C3414J j1;
    private int k1 = 1;
    private final List<ax.o3.o> l1 = DesugarCollections.synchronizedList(new ArrayList());
    private Runnable m1 = new f();
    n.i n1 = new d();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("wifi_state", -1);
                l0.this.Z0 = C2267c.a(intExtra);
            }
            l0.this.N5();
        }
    }

    class b extends AbstractDialogInterfaceOnClickListenerC1363t {
        b() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            l0.this.i3("ftp_server_dialog");
        }
    }

    class c implements ServiceConnection {

        class a implements FtpServerService.e {

            /* renamed from: ax.d3.l0$c$a$a, reason: collision with other inner class name */
            class RunnableC0282a implements Runnable {
                RunnableC0282a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    l0.this.N5();
                }
            }

            class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    l0.this.N5();
                }
            }

            /* renamed from: ax.d3.l0$c$a$c, reason: collision with other inner class name */
            class RunnableC0283c implements Runnable {
                final /* synthetic */ String q;

                RunnableC0283c(String str) {
                    this.q = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (l0.this.f0() instanceof MainActivity) {
                        ((MainActivity) l0.this.f0()).a(this.q);
                    }
                }
            }

            a() {
            }

            @Override // com.voxdon.xplorer.service.FtpServerService.e
            public void a(String str) {
                if (l0.this.f0() == null) {
                    return;
                }
                l0.this.f0().runOnUiThread(new RunnableC0283c(str));
            }

            @Override // com.voxdon.xplorer.service.FtpServerService.e
            public void b() {
                if (l0.this.f0() == null) {
                    return;
                }
                l0.this.f0().runOnUiThread(new b());
            }

            @Override // com.voxdon.xplorer.service.FtpServerService.e
            public void c() {
                if (l0.this.f0() == null) {
                    return;
                }
                l0.this.f0().runOnUiThread(new RunnableC0282a());
            }
        }

        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l0.this.e1 = ((FtpServerService.c) iBinder).a();
            l0.this.e1.C(l0.this.G0.isChecked());
            l0.this.e1.B(new a());
            l0.this.T5(true);
            l0.this.N5();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (l0.this.g1 && l0.this.f1 == this) {
                l0.this.d6();
            }
        }
    }

    class d implements n.i {
        d() {
        }

        @Override // ax.o3.n.i
        public void a(String str) {
            boolean z;
            if (str == null) {
                return;
            }
            synchronized (l0.this.l1) {
                try {
                    Iterator it = l0.this.l1.iterator();
                    z = false;
                    while (it.hasNext()) {
                        if (((ax.o3.o) it.next()).k(str)) {
                            it.remove();
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                l0.this.K5();
            }
        }

        @Override // ax.o3.n.i
        public void b(ax.o3.o oVar) {
            l0.this.Z5();
            l0.this.x5(oVar);
        }
    }

    class e implements n.j {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!l0.this.X0() || l0.this.b() == null || l0.this.Z0() || l0.this.k1 == 3 || l0.this.k1 == 1) {
                    return;
                }
                l0.this.Y5();
            }
        }

        e() {
        }

        @Override // ax.o3.n.j
        public void a() {
            l0.this.d1.postDelayed(new a(), 1000L);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.Z5();
        }
    }

    class g extends ax.g3.c {
        g() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            l0.this.z5();
        }
    }

    class h implements View.OnLongClickListener {
        h() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            l0.this.z5();
            return true;
        }
    }

    class i implements CompoundButton.OnCheckedChangeListener {
        i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                l0.this.M0.setVisibility(8);
                l0.this.N0.setEnabled(false);
                l0.this.N0.setText((CharSequence) null);
                l0.this.f6();
                try {
                    int parseInt = Integer.parseInt(l0.this.O0.getText().toString());
                    if (l0.this.H5(parseInt)) {
                        l0.this.c1 = parseInt;
                        l0.this.S5();
                    }
                } catch (NumberFormatException unused) {
                }
                l0.this.O0.setEnabled(false);
                l0.this.O0.setText((CharSequence) null);
                return;
            }
            l0.this.M0.setVisibility(0);
            l0.this.N0.setEnabled(true);
            if (l0.this.N0.getText().length() == 0) {
                if (l0.this.b1 == null) {
                    l0.this.b1 = l0.B5();
                }
                l0.this.N0.setText(l0.this.b1);
                l0.this.f6();
            }
            l0.this.O0.setEnabled(true);
            if (l0.this.O0.getText().length() == 0) {
                l0 l0Var = l0.this;
                l0Var.c1 = l0Var.C5(l0Var.O0.getContext());
                l0.this.O0.setText(String.valueOf(l0.this.c1));
            }
        }
    }

    class j implements CompoundButton.OnCheckedChangeListener {
        j() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            l0.this.h6();
        }
    }

    class k extends ax.g3.c {
        k() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            l0.this.A5();
        }
    }

    class l extends ax.g3.c {
        l() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            l0.this.X5();
        }
    }

    class m extends ax.g3.c {
        m() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            l0.this.a6();
        }
    }

    class n implements InterfaceC3406B {
        n() {
        }

        @Override // ax.x3.InterfaceC3406B
        public void a(View view, int i) {
            if (l0.this.b() != null && i >= 0 && i < l0.this.l1.size()) {
                ax.o3.o oVar = (ax.o3.o) l0.this.l1.get(i);
                int q = C3598q.z0(l0.this.b()).q(oVar);
                if (q != 0) {
                    l0.this.L5(q);
                } else {
                    l0.this.W5(oVar);
                }
            }
        }
    }

    public interface o {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        try {
            boolean wifiEnabled = this.X0.setWifiEnabled(true);
            androidx.fragment.app.f f0 = f0();
            if (f0 != null) {
                F4(f0.getString(R.string.dialog_msg_connecting_to, f0.getString(R.string.wifi)), 1);
            }
            if (wifiEnabled) {
                return;
            }
            M5();
        } catch (Exception unused) {
            M5();
        }
    }

    public static String B5() {
        return String.valueOf(new Random().nextInt(899999) + 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C5(Context context) {
        int b2 = ax.o3.h.b(context);
        if (H5(b2)) {
            return b2;
        }
        int u = C3180B.u();
        ax.o3.h.g(f0(), u);
        return u;
    }

    private String D5() {
        return this.Y0.b();
    }

    private void F5() {
        String a2 = ax.o3.h.a(f0());
        this.b1 = a2;
        if (a2 == null) {
            this.F0.setChecked(true);
        } else {
            this.F0.setChecked(false);
            this.N0.setText(this.b1);
            int b2 = ax.o3.h.b(f0());
            if (b2 > 0) {
                this.c1 = b2;
                this.O0.setText(String.valueOf(b2));
            }
        }
        this.G0.setChecked(ax.o3.h.k(f0()));
    }

    private boolean G5() {
        int i2 = this.k1;
        return i2 == 2 || i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H5(int i2) {
        return i2 > 0 && i2 <= 65534 && C3180B.M(i2);
    }

    private boolean I5() {
        try {
            WifiManager wifiManager = this.X0;
            if (wifiManager == null || wifiManager.getWifiState() != 3) {
                return false;
            }
            return this.X0.getConnectionInfo().getIpAddress() != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    private void J5(boolean z) {
        if (f0() == null) {
            return;
        }
        if (z) {
            f0().getWindow().addFlags(128);
        } else {
            f0().getWindow().clearFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K5() {
        this.j1.r();
        g6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L5(int i2) {
        if (f0() instanceof MainActivity) {
            ((MainActivity) f0()).g2(C3598q.z0(b()).f(i2), A3(), "server_fragment");
        }
    }

    private void M5() {
        try {
            C1832u.p0(this, new Intent("android.settings.WIFI_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            E4(R.string.no_application, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N5() {
        /*
            r7 = this;
            boolean r0 = r7.X0()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.View r0 = r7.H0
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r7.I0
            r0.setVisibility(r1)
            android.view.View r0 = r7.J0
            r0.setVisibility(r1)
            boolean r0 = r7.I5()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L38
            java.lang.String r0 = r7.E5()
            r7.a1 = r0
            android.net.wifi.WifiManager r0 = r7.X0
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            java.lang.String r0 = r0.getSSID()
            java.lang.String r0 = R5(r0)
            r1 = 1
        L35:
            r3 = 0
        L36:
            r4 = 0
            goto L6f
        L38:
            ax.i3.b r0 = r7.Z0
            ax.i3.b r3 = ax.i3.EnumC2266b.WIFI_AP_STATE_ENABLED
            java.lang.String r4 = ""
            if (r0 != r3) goto L55
            java.lang.String r0 = r7.D5()
            r7.a1 = r0
            ax.i3.c r0 = r7.Y0
            android.net.wifi.WifiConfiguration r0 = r0.f()
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.SSID
            goto L52
        L51:
            r0 = r4
        L52:
            r3 = 0
            r4 = 1
            goto L6f
        L55:
            android.content.Context r0 = r7.C0
            boolean r0 = ax.i3.C2265a.j(r0)
            if (r0 == 0) goto L6d
            java.lang.String r0 = ax.i3.C2265a.d()
            if (r0 == 0) goto L66
            r7.a1 = r0
            goto L6a
        L66:
            java.lang.String r0 = "x.x.x.x"
            r7.a1 = r0
        L6a:
            r0 = r4
            r3 = 1
            goto L36
        L6d:
            r0 = r4
            goto L35
        L6f:
            r5 = 0
            r6 = 3
            if (r1 != 0) goto L89
            if (r3 != 0) goto L89
            if (r4 == 0) goto L78
            goto L89
        L78:
            int r3 = r7.k1
            if (r3 != r6) goto L83
            boolean r3 = r7.g1
            if (r3 == 0) goto L83
            r7.a6()
        L83:
            r7.k1 = r2
            r7.b6(r5)
            goto L9b
        L89:
            boolean r2 = com.voxdon.xplorer.service.FtpServerService.x()
            if (r2 == 0) goto L95
            r7.k1 = r6
            r7.b6(r5)
            goto L9b
        L95:
            r2 = 2
            r7.k1 = r2
            r7.Y5()
        L9b:
            int r2 = r7.k1
            r7.U5(r2, r1, r4, r0)
            r7.J3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d3.l0.N5():void");
    }

    private void O5() {
        ax.o3.n nVar;
        if (!ax.X2.Q.o1() || (nVar = this.i1) == null) {
            return;
        }
        if (nVar.x()) {
            b6(new e());
        } else {
            Y5();
        }
    }

    private void P5() {
        this.W0 = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
        ax.X2.Q.k(37, 36);
        this.C0.registerReceiver(this.W0, intentFilter);
    }

    private void Q5() {
        ax.o3.n nVar;
        if (TextUtils.isEmpty(this.b1) || !ax.X2.Q.o1() || (nVar = this.i1) == null) {
            return;
        }
        nVar.A(this.a1, this.c1);
    }

    public static String R5(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i2 = length - 1;
        return str.charAt(i2) == '\"' ? str.substring(1, i2) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5() {
        if (ax.o3.h.b(o3()) != this.c1) {
            ax.o3.h.g(o3(), this.c1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T5(boolean z) {
        this.g1 = z;
        if (z) {
            Q5();
        } else {
            e6();
        }
    }

    private void V5() {
        C3190h.a(f0()).p(R.string.dialog_title_confirm).e(R.string.dialog_msg_service_stop).setPositiveButton(android.R.string.ok, new b()).setNegativeButton(android.R.string.cancel, null).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W5(ax.o3.o oVar) {
        if (b() == null) {
            return;
        }
        this.V0 = oVar;
        C3180B.d0(A0(), ax.a3.L.o3(this, oVar.e()), "password", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X5() {
        J5(true);
        if (this.g1) {
            return;
        }
        if (this.F0.isChecked()) {
            this.c1 = C5(o3());
            this.b1 = B5();
        } else {
            try {
                int parseInt = Integer.parseInt(this.O0.getText().toString());
                this.c1 = parseInt;
                if (parseInt > 65534) {
                    this.c1 = 65534;
                    this.O0.setText(String.valueOf(65534));
                }
                if (!C3180B.M(this.c1)) {
                    F4(G0().getString(R.string.port_in_use, Integer.valueOf(this.c1)), 1);
                    this.O0.requestFocus();
                    return;
                }
                String obj = this.N0.getText().toString();
                this.b1 = obj;
                if (TextUtils.isEmpty(obj)) {
                    this.b1 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    try {
                        Integer.parseInt(this.b1);
                    } catch (NumberFormatException unused) {
                        this.b1 = B5();
                    }
                }
            } catch (NumberFormatException unused2) {
                F4(G0().getString(R.string.enter_port_number), 1);
                return;
            }
        }
        this.N0.setText(this.b1);
        this.S0.setText(this.b1);
        f6();
        S5();
        this.k1 = 3;
        y5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y5() {
        ax.o3.n nVar;
        if (!ax.X2.Q.o1() || (nVar = this.i1) == null || nVar.x()) {
            return;
        }
        this.l1.clear();
        K5();
        this.i1.F(this.n1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a6() {
        J5(false);
        if (this.g1) {
            d6();
        }
    }

    private void b6(n.j jVar) {
        if (jVar == null) {
            Z5();
        }
        if (!ax.X2.Q.o1() || this.i1 == null) {
            return;
        }
        this.l1.clear();
        this.i1.H(jVar);
        K5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d6() {
        C3184b.b(this.f1);
        this.C0.unbindService(this.f1);
        this.f1 = null;
        this.e1 = null;
        T5(false);
        N5();
    }

    private void e6() {
        ax.o3.n nVar;
        if (!ax.X2.Q.o1() || (nVar = this.i1) == null) {
            return;
        }
        nVar.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f6() {
        if (this.F0.isChecked()) {
            ax.o3.h.f(f0(), null);
        } else {
            ax.o3.h.f(f0(), this.b1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h6() {
        ax.o3.h.j(f0(), this.G0.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x5(ax.o3.o oVar) {
        boolean z;
        boolean z2;
        if (f0() == null || !X0()) {
            return;
        }
        synchronized (this.l1) {
            boolean z3 = false;
            int i2 = 0;
            while (true) {
                try {
                    z = true;
                    if (i2 >= this.l1.size()) {
                        break;
                    }
                    ax.o3.o oVar2 = this.l1.get(i2);
                    if (!oVar2.k(oVar.j())) {
                        i2++;
                    } else if (oVar2.equals(oVar)) {
                        z3 = true;
                    } else {
                        this.l1.set(i2, oVar);
                        z3 = true;
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = false;
            if (z3) {
                z = z2;
            } else {
                this.l1.add(oVar);
            }
        }
        if (z) {
            K5();
        }
    }

    private void y5() {
        if (this.f1 != null) {
            return;
        }
        Intent intent = new Intent(f0(), (Class<?>) FtpServerService.class);
        intent.putExtra("extra_ip_address", this.a1);
        intent.putExtra("extra_port_number", this.c1);
        intent.putExtra("extra_password", this.b1);
        c cVar = new c();
        this.f1 = cVar;
        this.C0.bindService(intent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5() {
        ClipboardManager clipboardManager;
        String charSequence = this.P0.getText().toString();
        if (TextUtils.isEmpty(charSequence) || b() == null || (clipboardManager = (ClipboardManager) b().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(HttpUrl.FRAGMENT_ENCODE_SET, charSequence));
            E4(R.string.msg_text_copied, 0);
        } catch (Exception unused) {
            E4(R.string.error, 0);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_scan) {
            return super.B1(menuItem);
        }
        c4(false);
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return null;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        b6(null);
    }

    public String E5() {
        int ipAddress = this.X0.getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            return "x.x.x.x";
        }
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            ipAddress = Integer.reverseBytes(ipAddress);
        }
        try {
            return InetAddress.getByAddress(BigInteger.valueOf(ipAddress).toByteArray()).getHostAddress();
        } catch (ArithmeticException | UnknownHostException e2) {
            e2.printStackTrace();
            ax.Ha.c.h().f().d("Invalid IpAddress").l(e2).g("ip : " + ipAddress).h();
            return "x.x.x.x";
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        super.F1(menu);
        MenuItem findItem = menu.findItem(R.id.menu_scan);
        if (findItem != null) {
            if (!ax.X2.Q.o1() || this.i1 == null) {
                findItem.setVisible(false);
            } else if (this.k1 == 2) {
                findItem.setVisible(true);
            } else {
                findItem.setVisible(false);
            }
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (!G5() || Z0()) {
            return;
        }
        Y5();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        x2(true);
        this.D0 = (ScrollView) view.findViewById(R.id.scroll_view);
        this.U0 = (RefreshProgressBar) view.findViewById(R.id.progressbar);
        this.I0 = view.findViewById(R.id.step_port_setting);
        this.J0 = view.findViewById(R.id.step_enter_address);
        this.H0 = view.findViewById(R.id.step_wifi);
        this.K0 = view.findViewById(R.id.turn_on_wifi);
        this.L0 = view.findViewById(R.id.start_service);
        this.T0 = view.findViewById(R.id.server_image);
        this.E0 = (TextView) view.findViewById(R.id.wifi_status);
        this.R0 = view.findViewById(R.id.passcode_container);
        this.S0 = (TextView) view.findViewById(R.id.passcode);
        TextView textView = (TextView) view.findViewById(R.id.ip_address);
        this.P0 = textView;
        textView.setOnClickListener(new g());
        this.P0.setOnLongClickListener(new h());
        this.F0 = (CheckBox) view.findViewById(R.id.random_passcode);
        this.G0 = (CheckBox) view.findViewById(R.id.show_hidden_files);
        this.O0 = (EditText) view.findViewById(R.id.port);
        this.N0 = (EditText) view.findViewById(R.id.passcode_edit);
        this.M0 = view.findViewById(R.id.passcode_layout);
        this.F0.setOnCheckedChangeListener(new i());
        this.G0.setOnCheckedChangeListener(new j());
        this.K0.setOnClickListener(new k());
        this.L0.setOnClickListener(new l());
        view.findViewById(R.id.stop_service).setOnClickListener(new m());
        this.Q0 = (RecyclerView) view.findViewById(R.id.device_list);
        this.Q0.setLayoutManager(new LinearLayoutManager(f0(), 0, false));
        C3414J c3414j = new C3414J(b(), this.l1);
        this.j1 = c3414j;
        c3414j.Q(new n());
        this.Q0.setAdapter(this.j1);
        F5();
        N5();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    public void U5(int i2, boolean z, boolean z2, String str) {
        if (X0()) {
            Context b2 = b();
            if (i2 == 1) {
                this.H0.setVisibility(0);
                this.K0.requestFocus();
                this.E0.setText(R.string.dialog_msg_not_connected);
                this.E0.setCompoundDrawables(null, null, null, null);
                g6();
                return;
            }
            if (i2 == 3 || i2 == 2) {
                if (i2 == 3) {
                    this.J0.setVisibility(0);
                    this.P0.setText(FtpServerService.w(this.a1, this.c1));
                    this.P0.requestFocus();
                    if (TextUtils.isEmpty(this.b1)) {
                        this.R0.setVisibility(8);
                    } else {
                        this.R0.setVisibility(0);
                    }
                    g6();
                } else {
                    this.I0.setVisibility(0);
                    this.P0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    this.L0.requestFocus();
                    g6();
                }
                if (!z) {
                    if (!z2) {
                        this.E0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                        this.E0.setVisibility(8);
                        return;
                    } else {
                        this.E0.setText(R.string.dialog_msg_hotspot_is_on);
                        this.E0.setVisibility(0);
                        this.E0.setCompoundDrawables(null, null, null, null);
                        return;
                    }
                }
                if (!ax.X2.Q.d()) {
                    this.E0.setVisibility(8);
                    return;
                }
                this.E0.setText(str);
                Drawable c2 = C3045a.c(b2, R.drawable.ic_wifi);
                int e2 = C3180B.e(b2, 16);
                c2.setBounds(0, 0, e2, e2);
                this.E0.setCompoundDrawables(c2, null, null, null);
                this.E0.setVisibility(0);
            }
        }
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        if (!FtpServerService.x()) {
            return false;
        }
        V5();
        return true;
    }

    @Override // ax.a3.L.c
    public void X(String str) {
        if (b() == null || this.V0 == null) {
            return;
        }
        L5(C3598q.z0(b()).r(this.V0, ax.o3.o.c(b()), str));
    }

    public void Z5() {
        ax.o3.n nVar;
        if (this.h1) {
            this.h1 = false;
            this.U0.setVisibility(8);
            this.d1.removeCallbacks(this.m1);
            if (!ax.X2.Q.o1() || (nVar = this.i1) == null) {
                return;
            }
            nVar.s();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        N5();
        if (this.h1) {
            return;
        }
        this.h1 = true;
        this.U0.setVisibility(0);
        O5();
        this.d1.removeCallbacks(this.m1);
        this.d1.postDelayed(this.m1, 10000L);
    }

    public void c6() {
        V5();
    }

    public void g6() {
        if (this.k1 != 2) {
            this.Q0.setVisibility(8);
            this.T0.setVisibility(0);
        } else if (this.l1.size() == 0) {
            this.Q0.setVisibility(8);
            this.T0.setVisibility(0);
        } else {
            this.Q0.setVisibility(0);
            this.T0.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.C0 = activity.getApplicationContext();
        this.d1 = new Handler(Looper.getMainLooper());
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.X0 = (WifiManager) this.C0.getSystemService("wifi");
        C2267c c2267c = new C2267c(b());
        this.Y0 = c2267c;
        this.Z0 = c2267c.g();
        if (ax.X2.Q.o1()) {
            this.i1 = new ax.o3.n(this.C0);
        }
        P5();
        if (this.X0 == null) {
            WifiManager wifiManager = (WifiManager) this.C0.getSystemService("wifi");
            this.X0 = wifiManager;
            if (wifiManager == null) {
                I4(M0(R.string.error), 1);
                ax.Ha.c.h().f().b("WIFI MANAGER NULL").h();
                i3("on_create");
            }
        }
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3() || z) {
            return;
        }
        this.D0.setClipToPadding(false);
        ScrollView scrollView = this.D0;
        scrollView.setPadding(scrollView.getPaddingLeft(), this.D0.getPaddingTop(), this.D0.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_server);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_server, (ViewGroup) null);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.C0.unregisterReceiver(this.W0);
        a6();
        Z5();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            b6(null);
        } else if (G5()) {
            Y5();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        return 0;
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.W0;
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // ax.a3.L.c
    public void a() {
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
    }
}
