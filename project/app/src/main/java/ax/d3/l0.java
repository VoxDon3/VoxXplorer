/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Q2.f;
import ax.T.b;
import ax.X2.Q;
import ax.Z2.s;
import ax.a3.L;
import ax.a3.t;
import ax.c3.u;
import ax.d3.n;
import ax.o3.n;
import ax.u3.h;
import ax.x3.B;
import ax.x3.J;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.q;
import com.voxdon.xplorer.service.FtpServerService;
import com.voxdon.xplorer.widget.RefreshProgressBar;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class l0
extends n
implements L.c {
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
    private ax.i3.c Y0;
    private ax.i3.b Z0;
    private String a1;
    private String b1;
    private int c1;
    private Handler d1;
    private FtpServerService e1;
    private ServiceConnection f1;
    private boolean g1;
    private boolean h1;
    private ax.o3.n i1;
    private J j1;
    private int k1 = 1;
    private final List<ax.o3.o> l1 = java.util.DesugarCollections.synchronizedList(new ArrayList());
    private Runnable m1 = new Runnable(this){
        final l0 q;
        {
            this.q = l02;
        }

        @Override
        public void run() {
            this.q.Z5();
        }
    };
    n.i n1 = new n.i(this){
        final l0 a;
        {
            this.a = l02;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void a(String string) {
            if (string == null) {
                return;
            }
            List list = this.a.l1;
            // MONITORENTER : list
            Iterator iterator = this.a.l1.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                if (!((ax.o3.o)iterator.next()).k(string)) continue;
                iterator.remove();
                bl = true;
            }
            if (!bl) return;
            this.a.K5();
        }

        @Override
        public void b(ax.o3.o o8) {
            this.a.Z5();
            this.a.x5(o8);
        }
    };

    private void A5() {
        block5: {
            boolean bl;
            block4: {
                bl = this.X0.setWifiEnabled(true);
                androidx.fragment.app.f f8 = this.f0();
                if (f8 == null) break block4;
                this.F4(f8.getString(2131951872, new Object[]{f8.getString(2131952695)}), 1);
            }
            if (bl) break block5;
            try {
                this.M5();
                return;
            }
            catch (Exception exception) {
                this.M5();
            }
        }
    }

    public static String B5() {
        return String.valueOf(new Random().nextInt(899999) + 100000);
    }

    private int C5(Context context) {
        int n8;
        int n9 = n8 = ax.o3.h.b(context);
        if (!this.H5(n8)) {
            n9 = ax.u3.B.u();
            ax.o3.h.g((Context)this.f0(), n9);
        }
        return n9;
    }

    private String D5() {
        return this.Y0.b();
    }

    private void F5() {
        String string;
        this.b1 = string = ax.o3.h.a((Context)this.f0());
        if (string == null) {
            this.F0.setChecked(true);
        } else {
            this.F0.setChecked(false);
            this.N0.setText((CharSequence)this.b1);
            int n8 = ax.o3.h.b((Context)this.f0());
            if (n8 > 0) {
                this.c1 = n8;
                this.O0.setText((CharSequence)String.valueOf(n8));
            }
        }
        boolean bl = ax.o3.h.k((Context)this.f0());
        this.G0.setChecked(bl);
    }

    private boolean G5() {
        int n8 = this.k1;
        return n8 == 2 || n8 == 3;
        {
        }
    }

    private boolean H5(int n8) {
        return n8 > 0 && n8 <= 65534 && ax.u3.B.M(n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean I5() {
        boolean bl = false;
        WifiManager wifiManager = this.X0;
        boolean bl2 = bl;
        if (wifiManager == null) return bl2;
        bl2 = bl;
        try {
            if (wifiManager.getWifiState() != 3) return bl2;
            int n8 = this.X0.getConnectionInfo().getIpAddress();
            bl2 = bl;
            if (n8 == 0) return bl2;
            return true;
        }
        catch (NullPointerException | SecurityException runtimeException) {
            return bl;
        }
    }

    private void J5(boolean bl) {
        if (this.f0() == null) {
            return;
        }
        if (bl) {
            this.f0().getWindow().addFlags(128);
            return;
        }
        this.f0().getWindow().clearFlags(128);
    }

    private void K5() {
        this.j1.r();
        this.g6();
    }

    private void L5(int n8) {
        if (this.f0() instanceof MainActivity) {
            s s8 = q.z0(this.b()).f(n8);
            ((MainActivity)this.f0()).g2(s8, this.A3(), "server_fragment");
        }
    }

    private void M5() {
        try {
            Intent intent = new Intent("android.settings.WIFI_SETTINGS");
            u.p0(this, intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.E4(2131952448, 1);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void N5() {
        if (!this.X0()) {
            return;
        }
        this.H0.setVisibility(8);
        this.I0.setVisibility(8);
        this.J0.setVisibility(8);
        var5_1 = this.I5();
        var4_2 = false;
        var2_3 = false;
        var3_4 = false;
        if (var5_1) {
            this.a1 = this.E5();
            var6_5 = l0.R5(this.X0.getConnectionInfo().getSSID());
            var2_3 = true;
lbl14:
            // 2 sources

            while (true) {
                var1_6 = false;
lbl16:
                // 2 sources

                while (true) {
                    var3_4 = false;
                    ** GOTO lbl36
                    break;
                }
                break;
            }
        } else if (this.Z0 == ax.i3.b.e0) {
            this.a1 = this.D5();
            var6_5 = this.Y0.f();
            var6_5 = var6_5 != null ? var6_5.SSID : "";
            var1_6 = false;
            var3_4 = true;
        } else {
            if (ax.i3.a.j(this.C0)) {
                var6_5 = ax.i3.a.d();
                this.a1 = var6_5 != null ? var6_5 : "x.x.x.x";
                var6_5 = "";
                var1_6 = true;
                var2_3 = var4_2;
                ** continue;
            }
            var6_5 = "";
            var2_3 = var3_4;
            ** continue;
        }
lbl36:
        // 2 sources

        if (!(var2_3 || var1_6 || var3_4)) {
            if (this.k1 == 3 && this.g1) {
                this.a6();
            }
            this.k1 = 1;
            this.b6(null);
        } else if (FtpServerService.x()) {
            this.k1 = 3;
            this.b6(null);
        } else {
            this.k1 = 2;
            this.Y5();
        }
        this.U5(this.k1, var2_3, var3_4, var6_5);
        this.J3();
    }

    private void O5() {
        ax.o3.n n8;
        if (Q.o1() && (n8 = this.i1) != null) {
            if (!n8.x()) {
                this.Y5();
                return;
            }
            this.b6(new n.j(this){
                final l0 a;
                {
                    this.a = l02;
                }

                @Override
                public void a() {
                    this.a.d1.postDelayed(new Runnable(this){
                        final e q;
                        {
                            this.q = e8;
                        }

                        @Override
                        public void run() {
                            if (this.q.a.X0() && this.q.a.b() != null && !this.q.a.Z0() && this.q.a.k1 != 3 && this.q.a.k1 != 1) {
                                this.q.a.Y5();
                            }
                        }
                    }, 1000L);
                }
            });
        }
    }

    private void P5() {
        this.W0 = new BroadcastReceiver(this){
            final l0 a;
            {
                this.a = l02;
            }

            public void onReceive(Context context, Intent intent) {
                if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction())) {
                    int n8 = intent.getIntExtra("wifi_state", -1);
                    l0.Z4(this.a, ax.i3.c.a(n8));
                }
                this.a.N5();
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
        Q.k(37, 36);
        this.C0.registerReceiver(this.W0, intentFilter);
    }

    private void Q5() {
        ax.o3.n n8;
        if (!TextUtils.isEmpty((CharSequence)this.b1) && Q.o1() && (n8 = this.i1) != null) {
            n8.A(this.a1, this.c1);
        }
    }

    public static String R5(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.length();
        String string2 = string;
        if (n8 > 1) {
            string2 = string;
            if (string.charAt(0) == '\"') {
                string2 = string;
                if (string.charAt(--n8) == '\"') {
                    string2 = string.substring(1, n8);
                }
            }
        }
        return string2;
    }

    private void S5() {
        if (ax.o3.h.b(this.o3()) != this.c1) {
            ax.o3.h.g(this.o3(), this.c1);
        }
    }

    private void T5(boolean bl) {
        this.g1 = bl;
        if (bl) {
            this.Q5();
            return;
        }
        this.e6();
    }

    private void V5() {
        h.a((Context)this.f0()).p(2131951890).e(2131951876).setPositiveButton(17039370, new t(this){
            final l0 b;
            {
                this.b = l02;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                this.b.i3("ftp_server_dialog");
            }
        }).setNegativeButton(0x1040000, null).create().show();
    }

    private void W5(ax.o3.o object) {
        if (this.b() == null) {
            return;
        }
        this.V0 = object;
        object = L.o3(this, ((ax.o3.o)object).e());
        ax.u3.B.d0(this.A0(), (androidx.fragment.app.e)object, "password", true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void X5() {
        this.J5(true);
        if (this.g1) return;
        if (this.F0.isChecked()) {
            this.c1 = this.C5(this.o3());
            this.b1 = l0.B5();
        } else {
            String string;
            block9: {
                try {
                    int n8;
                    this.c1 = n8 = Integer.parseInt(this.O0.getText().toString());
                    if (n8 <= 65534) break block9;
                    this.c1 = 65534;
                }
                catch (NumberFormatException numberFormatException) {
                    this.F4(this.G0().getString(2131951926), 1);
                    return;
                }
                this.O0.setText((CharSequence)String.valueOf(65534));
            }
            if (!ax.u3.B.M(this.c1)) {
                this.F4(this.G0().getString(2131952505, new Object[]{this.c1}), 1);
                this.O0.requestFocus();
                return;
            }
            this.b1 = string = this.N0.getText().toString();
            if (TextUtils.isEmpty((CharSequence)string)) {
                this.b1 = "";
            } else {
                try {
                    Integer.parseInt(this.b1);
                }
                catch (NumberFormatException numberFormatException) {
                    this.b1 = l0.B5();
                }
            }
        }
        this.N0.setText((CharSequence)this.b1);
        this.S0.setText((CharSequence)this.b1);
        this.f6();
        this.S5();
        this.k1 = 3;
        this.y5();
    }

    private void Y5() {
        ax.o3.n n8;
        if (Q.o1() && (n8 = this.i1) != null && !n8.x()) {
            this.l1.clear();
            this.K5();
            this.i1.F(this.n1);
        }
    }

    static /* synthetic */ ax.i3.b Z4(l0 l02, ax.i3.b b8) {
        l02.Z0 = b8;
        return b8;
    }

    private void a6() {
        this.J5(false);
        if (this.g1) {
            this.d6();
        }
    }

    private void b6(n.j j8) {
        if (j8 == null) {
            this.Z5();
        }
        if (Q.o1() && this.i1 != null) {
            this.l1.clear();
            this.i1.H(j8);
            this.K5();
        }
    }

    private void d6() {
        ax.u3.b.b(this.f1);
        this.C0.unbindService(this.f1);
        this.f1 = null;
        this.e1 = null;
        this.T5(false);
        this.N5();
    }

    private void e6() {
        ax.o3.n n8;
        if (Q.o1() && (n8 = this.i1) != null) {
            n8.J();
        }
    }

    private void f6() {
        if (!this.F0.isChecked()) {
            ax.o3.h.f((Context)this.f0(), this.b1);
            return;
        }
        ax.o3.h.f((Context)this.f0(), null);
    }

    static /* synthetic */ FtpServerService g5(l0 l02, FtpServerService ftpServerService) {
        l02.e1 = ftpServerService;
        return ftpServerService;
    }

    private void h6() {
        ax.o3.h.j((Context)this.f0(), this.G0.isChecked());
    }

    static /* synthetic */ int s5(l0 l02, int n8) {
        l02.c1 = n8;
        return n8;
    }

    static /* synthetic */ String v5(l0 l02, String string) {
        l02.b1 = string;
        return string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void x5(ax.o3.o o8) {
        if (this.f0() == null) return;
        if (!this.X0()) {
            return;
        }
        List<ax.o3.o> list = this.l1;
        synchronized (list) {
            int n8 = 0;
            int n9 = 0;
            try {
                int n10;
                int n11;
                while (true) {
                    block13: {
                        block12: {
                            int n12 = this.l1.size();
                            n11 = 1;
                            n10 = n8;
                            if (n9 >= n12) break block12;
                            ax.o3.o o9 = this.l1.get(n9);
                            if (!o9.k(o8.j())) break block13;
                            if (!o9.equals(o8)) {
                                this.l1.set(n9, o8);
                                n9 = 1;
                                n10 = 1;
                                break;
                            }
                            n10 = 1;
                        }
                        n8 = 0;
                        n9 = n10;
                        n10 = n8;
                        break;
                    }
                    ++n9;
                }
                if (n9 == 0) {
                    this.l1.add(o8);
                    n10 = n11;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl33 : MonitorExitStatement: MONITOREXIT : var7_3
                if (n10 == 0) return;
                this.K5();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private void y5() {
        ServiceConnection serviceConnection;
        if (this.f1 != null) {
            return;
        }
        Intent intent = new Intent((Context)this.f0(), FtpServerService.class);
        intent.putExtra("extra_ip_address", this.a1);
        intent.putExtra("extra_port_number", this.c1);
        intent.putExtra("extra_password", this.b1);
        this.f1 = serviceConnection = new ServiceConnection(this){
            final l0 q;
            {
                this.q = l02;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                l0.g5(this.q, ((FtpServerService.c)iBinder).a());
                this.q.e1.C(this.q.G0.isChecked());
                this.q.e1.B(new FtpServerService.e(this){
                    final c a;
                    {
                        this.a = c8;
                    }

                    @Override
                    public void a(String string) {
                        if (this.a.q.f0() == null) {
                            return;
                        }
                        this.a.q.f0().runOnUiThread(new Runnable(){
                            final a c0;
                            final String q;
                            {
                                this.c0 = a8;
                                this.q = string;
                            }

                            @Override
                            public void run() {
                                if (this.c0.a.q.f0() instanceof MainActivity) {
                                    ((MainActivity)this.c0.a.q.f0()).a(this.q);
                                }
                            }
                        });
                    }

                    @Override
                    public void b() {
                        if (this.a.q.f0() == null) {
                            return;
                        }
                        this.a.q.f0().runOnUiThread(new Runnable(this){
                            final a q;
                            {
                                this.q = a8;
                            }

                            @Override
                            public void run() {
                                this.q.a.q.N5();
                            }
                        });
                    }

                    @Override
                    public void c() {
                        if (this.a.q.f0() == null) {
                            return;
                        }
                        this.a.q.f0().runOnUiThread(new Runnable(this){
                            final a q;
                            {
                                this.q = a8;
                            }

                            @Override
                            public void run() {
                                this.q.a.q.N5();
                            }
                        });
                    }
                });
                this.q.T5(true);
                this.q.N5();
            }

            public void onServiceDisconnected(ComponentName componentName) {
                if (this.q.g1 && this.q.f1 == this) {
                    this.q.d6();
                }
            }
        };
        this.C0.bindService(intent, serviceConnection, 1);
    }

    private void z5() {
        ClipboardManager clipboardManager;
        String string = this.P0.getText().toString();
        if (!TextUtils.isEmpty((CharSequence)string) && this.b() != null && (clipboardManager = (ClipboardManager)this.b().getSystemService("clipboard")) != null) {
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"", (CharSequence)string));
                this.E4(2131952367, 0);
                return;
            }
            catch (Exception exception) {
                this.E4(2131951927, 0);
            }
        }
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131362537) {
            return super.B1(menuItem);
        }
        this.c4(false);
        return true;
    }

    @Override
    public String C3() {
        return null;
    }

    @Override
    public void D1() {
        super.D1();
        this.b6(null);
    }

    public String E5() {
        StringBuilder stringBuilder;
        int n8 = this.X0.getConnectionInfo().getIpAddress();
        if (n8 == 0) {
            return "x.x.x.x";
        }
        int n9 = n8;
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            n9 = Integer.reverseBytes(n8);
        }
        long l8 = n9;
        try {
            String string = InetAddress.getByAddress(BigInteger.valueOf(l8).toByteArray()).getHostAddress();
            return string;
        }
        catch (ArithmeticException arithmeticException) {
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        ((Throwable)((Object)stringBuilder)).printStackTrace();
        ax.Ha.b b8 = ax.Ha.c.h().f().d("Invalid IpAddress").l((Throwable)((Object)stringBuilder));
        stringBuilder = new StringBuilder();
        stringBuilder.append("ip : ");
        stringBuilder.append(n9);
        b8.g(stringBuilder.toString()).h();
        return "x.x.x.x";
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
        menu = menu.findItem(2131362537);
        if (menu != null) {
            if (Q.o1() && this.i1 != null) {
                if (this.k1 == 2) {
                    menu.setVisible(true);
                    return;
                }
                menu.setVisible(false);
                return;
            }
            menu.setVisible(false);
        }
    }

    @Override
    public void H1() {
        super.H1();
        if (this.G5() && !this.Z0()) {
            this.Y5();
        }
    }

    @Override
    public void L1(View object, Bundle bundle) {
        super.L1((View)object, bundle);
        this.x2(true);
        this.D0 = (ScrollView)object.findViewById(2131362760);
        this.U0 = (RefreshProgressBar)object.findViewById(2131362720);
        this.I0 = object.findViewById(2131362898);
        this.J0 = object.findViewById(2131362897);
        this.H0 = object.findViewById(2131362899);
        this.K0 = object.findViewById(2131363009);
        this.L0 = object.findViewById(2131362882);
        this.T0 = object.findViewById(2131362792);
        this.E0 = (TextView)object.findViewById(2131363051);
        this.R0 = object.findViewById(2131362668);
        this.S0 = (TextView)object.findViewById(2131362667);
        bundle = (TextView)object.findViewById(2131362421);
        this.P0 = bundle;
        bundle.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final l0 c;
            {
                this.c = l02;
            }

            @Override
            public void a(View view) {
                this.c.z5();
            }
        });
        this.P0.setOnLongClickListener(new View.OnLongClickListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            public boolean onLongClick(View view) {
                this.a.z5();
                return true;
            }
        });
        this.F0 = (CheckBox)object.findViewById(2131362726);
        this.G0 = (CheckBox)object.findViewById(2131362828);
        this.O0 = (EditText)object.findViewById(2131362703);
        this.N0 = (EditText)object.findViewById(2131362669);
        this.M0 = object.findViewById(2131362670);
        this.F0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            /*
             * Loose catch block
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCheckedChanged(CompoundButton object, boolean bl) {
                block6: {
                    Object var2_4;
                    if (var2_4 != false) {
                        this.a.M0.setVisibility(8);
                        this.a.N0.setEnabled(false);
                        this.a.N0.setText(null);
                        this.a.f6();
                        int n8 = Integer.parseInt(this.a.O0.getText().toString());
                        if (this.a.H5(n8)) {
                            l0.s5(this.a, n8);
                            this.a.S5();
                        }
                        break block6;
                    }
                    this.a.M0.setVisibility(0);
                    this.a.N0.setEnabled(true);
                    if (this.a.N0.getText().length() == 0) {
                        if (this.a.b1 == null) {
                            l0.v5(this.a, l0.B5());
                        }
                        this.a.N0.setText((CharSequence)this.a.b1);
                        this.a.f6();
                    }
                    this.a.O0.setEnabled(true);
                    if (this.a.O0.getText().length() != 0) return;
                    l0 l02 = this.a;
                    l0.s5(l02, l02.C5(l02.O0.getContext()));
                    this.a.O0.setText((CharSequence)String.valueOf(this.a.c1));
                    return;
                    catch (NumberFormatException numberFormatException) {}
                }
                this.a.O0.setEnabled(false);
                this.a.O0.setText(null);
            }
        });
        this.G0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final l0 a;
            {
                this.a = l02;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                this.a.h6();
            }
        });
        this.K0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final l0 c;
            {
                this.c = l02;
            }

            @Override
            public void a(View view) {
                this.c.A5();
            }
        });
        this.L0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final l0 c;
            {
                this.c = l02;
            }

            @Override
            public void a(View view) {
                this.c.X5();
            }
        });
        object.findViewById(2131362902).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final l0 c;
            {
                this.c = l02;
            }

            @Override
            public void a(View view) {
                this.c.a6();
            }
        });
        this.Q0 = (RecyclerView)object.findViewById(2131362121);
        object = new LinearLayoutManager((Context)this.f0(), 0, false);
        this.Q0.setLayoutManager((RecyclerView.p)object);
        object = new J(this.b(), this.l1);
        this.j1 = object;
        ((J)object).Q(new B(this){
            final l0 a;
            {
                this.a = l02;
            }

            @Override
            public void a(View object, int n8) {
                if (this.a.b() != null && n8 >= 0 && n8 < this.a.l1.size()) {
                    object = (ax.o3.o)this.a.l1.get(n8);
                    n8 = q.z0(this.a.b()).q((ax.o3.o)object);
                    if (n8 != 0) {
                        this.a.L5(n8);
                        return;
                    }
                    this.a.W5((ax.o3.o)object);
                }
            }
        });
        this.Q0.setAdapter(this.j1);
        this.F5();
        this.N5();
    }

    @Override
    public void M4() {
    }

    @Override
    public boolean N3() {
        return false;
    }

    public void U5(int n8, boolean bl, boolean bl2, String string) {
        Context context;
        block12: {
            block11: {
                if (!this.X0()) break block11;
                context = this.b();
                if (n8 == 1) {
                    this.H0.setVisibility(0);
                    this.K0.requestFocus();
                    this.E0.setText(2131951874);
                    this.E0.setCompoundDrawables(null, null, null, null);
                    this.g6();
                    return;
                }
                if (n8 == 3 || n8 == 2) break block12;
            }
            return;
        }
        if (n8 == 3) {
            this.J0.setVisibility(0);
            this.P0.setText((CharSequence)FtpServerService.w(this.a1, this.c1));
            this.P0.requestFocus();
            if (TextUtils.isEmpty((CharSequence)this.b1)) {
                this.R0.setVisibility(8);
            } else {
                this.R0.setVisibility(0);
            }
            this.g6();
        } else {
            this.I0.setVisibility(0);
            this.P0.setText((CharSequence)"");
            this.L0.requestFocus();
            this.g6();
        }
        if (bl) {
            if (Q.d()) {
                this.E0.setText((CharSequence)string);
                string = ax.s3.a.c(context, 2131231255);
                n8 = ax.u3.B.e(context, 16);
                string.setBounds(0, 0, n8, n8);
                this.E0.setCompoundDrawables((Drawable)string, null, null, null);
                this.E0.setVisibility(0);
                return;
            }
            this.E0.setVisibility(8);
            return;
        }
        if (bl2) {
            this.E0.setText(2131951873);
            this.E0.setVisibility(0);
            this.E0.setCompoundDrawables(null, null, null, null);
            return;
        }
        this.E0.setText((CharSequence)"");
        this.E0.setVisibility(8);
    }

    @Override
    public boolean V2() {
        if (FtpServerService.x()) {
            this.V5();
            return true;
        }
        return false;
    }

    @Override
    public void X(String string) {
        if (this.b() == null || this.V0 == null) {
            return;
        }
        String string2 = ax.o3.o.c(this.b());
        this.L5(q.z0(this.b()).r(this.V0, string2, string));
    }

    @Override
    public void Z3(String string) {
    }

    public void Z5() {
        if (this.h1) {
            ax.o3.n n8;
            this.h1 = false;
            this.U0.setVisibility(8);
            this.d1.removeCallbacks(this.m1);
            if (Q.o1() && (n8 = this.i1) != null) {
                n8.s();
            }
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void c4(boolean bl) {
        this.N5();
        if (!this.h1) {
            this.h1 = true;
            this.U0.setVisibility(0);
            this.O5();
            this.d1.removeCallbacks(this.m1);
            this.d1.postDelayed(this.m1, 10000L);
        }
    }

    public void c6() {
        this.V5();
    }

    public void g6() {
        if (this.k1 == 2) {
            if (this.l1.size() == 0) {
                this.Q0.setVisibility(8);
                this.T0.setVisibility(0);
                return;
            }
            this.Q0.setVisibility(0);
            this.T0.setVisibility(8);
            return;
        }
        this.Q0.setVisibility(8);
        this.T0.setVisibility(0);
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.C0 = activity.getApplicationContext();
        this.d1 = new Handler(Looper.getMainLooper());
    }

    @Override
    public void j3() {
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        this.X0 = (WifiManager)this.C0.getSystemService("wifi");
        object = new ax.i3.c(this.b());
        this.Y0 = object;
        this.Z0 = ((ax.i3.c)object).g();
        if (Q.o1()) {
            this.i1 = new ax.o3.n(this.C0);
        }
        this.P5();
        if (this.X0 == null) {
            object = (WifiManager)this.C0.getSystemService("wifi");
            this.X0 = object;
            if (object == null) {
                this.I4(this.M0(2131951927), 1);
                ax.Ha.c.h().f().b("WIFI MANAGER NULL").h();
                this.i3("on_create");
            }
        }
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3() && !bl) {
            this.D0.setClipToPadding(false);
            ScrollView scrollView = this.D0;
            scrollView.setPadding(scrollView.getPaddingLeft(), this.D0.getPaddingTop(), this.D0.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689502);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558559, null);
    }

    @Override
    public void s1() {
        super.s1();
        this.C0.unregisterReceiver(this.W0);
        this.a6();
        this.Z5();
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (bl) {
            this.b6(null);
            return;
        }
        if (this.G5()) {
            this.Y5();
        }
    }

    @Override
    public int x3() {
        return 0;
    }

    @Override
    public f z3() {
        return f.W0;
    }

    public static interface o {
        public void a(String var1);
    }
}

