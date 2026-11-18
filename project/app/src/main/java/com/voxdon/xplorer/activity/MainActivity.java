/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriPermission;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.t;
import ax.Q2.m;
import ax.S2.b;
import ax.V2.d;
import ax.X2.Q;
import ax.Z2.f;
import ax.Z2.j;
import ax.Z2.k;
import ax.Z2.l;
import ax.Z2.s;
import ax.a3.B;
import ax.a3.D;
import ax.a3.U;
import ax.a3.h;
import ax.a3.i;
import ax.a3.n;
import ax.a3.u;
import ax.a3.v;
import ax.a3.w;
import ax.c3.L;
import ax.c3.d0;
import ax.c3.u;
import ax.c3.x;
import ax.d3.E;
import ax.d3.e0;
import ax.d3.l0;
import ax.i.r;
import ax.t3.c;
import ax.t3.g;
import ax.u3.q;
import ax.x3.A;
import ax.x3.d;
import com.voxdon.xplorer.activity.ArchiveActivity;
import com.voxdon.xplorer.activity.DevSettingsActivity;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.activity.SettingsActivity;
import com.voxdon.xplorer.activity.UsbAttachActivity;
import com.voxdon.xplorer.activity.a;
import com.voxdon.xplorer.activity.b;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.I;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.file.Y;
import com.voxdon.xplorer.file.d;
import com.voxdon.xplorer.file.k;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.musicplayer.FullScreenPlayerActivity;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.service.FtpServerService;
import com.voxdon.xplorer.service.HttpServerService;
import com.google.android.material.tabs.TabLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MainActivity
extends b
implements ax.g3.e,
l0.o,
U.c {
    private static final Logger E0 = ax.Q2.g.a(MainActivity.class);
    private View A;
    h.c A0;
    private TabLayout B;
    ax.g3.k B0;
    private FrameLayout C;
    ax.g3.b C0;
    private View D;
    b.d D0;
    private View E;
    private CoordinatorLayout F;
    private CoordinatorLayout G;
    private View H;
    private A I;
    private ViewGroup J;
    private Toolbar K;
    private ListView L;
    private ax.V2.f M;
    private l N;
    private d O;
    private View P;
    private Button Q;
    private ViewGroup R;
    private ViewGroup S;
    private ax.x3.h T;
    private ax.d3.n U;
    private Bookmark V;
    private f W;
    private ArrayList<J> X;
    private int Y;
    private boolean Z = false;
    private Runnable a0;
    private Bookmark b0;
    private Runnable c0;
    private Bookmark d0;
    private long e0;
    private Toast f0;
    private b.b g0;
    private long h0;
    private long i0;
    private View j0;
    private boolean k0;
    private Object l0;
    private K m0;
    private BroadcastReceiver n0;
    private BroadcastReceiver o0;
    private Boolean p0;
    private CountDownLatch q0;
    private e0 r0;
    private boolean s0;
    private Handler t0;
    private boolean u0;
    private ax.g3.c v0;
    Runnable w0;
    r x0;
    private final Object y = new Object();
    private Runnable y0;
    private DrawerLayout z;
    ax.g3.k z0;

    public MainActivity() {
        this.X = new ArrayList();
        this.g0 = b.b.q;
        this.q0 = new CountDownLatch(1);
        this.t0 = new Handler();
        this.v0 = new ax.g3.c(this, 100L){
            final MainActivity c;
            {
                this.c = mainActivity;
                super(l8);
            }

            @Override
            public void a(View object) {
                object = this.c.x1();
                if (object instanceof E) {
                    ((E)object).na("toolbar_back");
                    return;
                }
                if (object instanceof l0 && FtpServerService.x()) {
                    ((l0)object).c6();
                    return;
                }
                this.c.m2(true, "toolbar_back");
            }
        };
        this.w0 = new Runnable(this){
            final MainActivity q;
            {
                this.q = mainActivity;
            }

            @Override
            public void run() {
                if (this.q.H != null) {
                    this.q.Q1();
                }
            }
        };
        this.x0 = new r(this, true){
            final MainActivity d;
            {
                this.d = mainActivity;
                super(bl);
            }

            @Override
            public void d() {
                if (this.d.r0 == null || !this.d.r0.X0() || !this.d.r0.e3()) {
                    if (this.d.z.A(this.d.A)) {
                        this.d.z.d(this.d.A);
                        return;
                    }
                    if (this.d.Z1()) {
                        this.d.R1();
                        return;
                    }
                    if (this.d.x1() != null && !this.d.x1().V2()) {
                        if (this.d.x1().z3() == ax.Q2.f.l0) {
                            if (g.c() || !ax.m3.a.c(this.d)) {
                                this.d.m1();
                                return;
                            }
                        } else {
                            this.d.m2(true, "hw_back");
                        }
                    }
                }
            }
        };
        this.y0 = new Runnable(this){
            final MainActivity q;
            {
                this.q = mainActivity;
            }

            @Override
            public void run() {
                MainActivity.T0(this.q, false);
                this.q.p();
            }
        };
        this.z0 = new ax.g3.k(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            @Override
            public void a(ax.Q2.f f8, String string, int n8, String string2, String string3) {
            }

            @Override
            public void b(ax.Q2.f f8) {
            }

            @Override
            public void c(ax.Q2.f object, int n8) {
                this.a.j2();
                object = Bookmark.o(com.voxdon.xplorer.file.T.d(this.a.getApplicationContext(), object).f(n8));
                this.a.c2((Bookmark)object, "remote_add", null, null, null);
            }

            @Override
            public void d(ax.Q2.f f8, int n8, Map<String, Object> map) {
            }
        };
        this.A0 = new h.c(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            @Override
            public void a(h.d d8) {
                if (this.a.n()) {
                    return;
                }
                v v8 = new v();
                Bundle bundle = new Bundle();
                if (d8 != null) {
                    String string = d8.b;
                    if (string == null) {
                        bundle.putString("host", d8.a);
                    } else {
                        bundle.putString("host", string);
                        bundle.putString("display_name", d8.a);
                    }
                }
                bundle.putInt("action", 1);
                bundle.putInt("port", 0);
                bundle.putSerializable("location", (Serializable)((Object)ax.Q2.f.J0));
                v8.v2(bundle);
                v8.c3(this.a.getSupportFragmentManager(), "smb");
            }
        };
        this.B0 = new ax.g3.k(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            @Override
            public void a(ax.Q2.f object, String object2, int n8, String string, String string2) {
                object2 = this.a;
                object = object2 = object2.getString(2131952325, new Object[]{((ax.Q2.f)((Object)object)).M((Context)object2)});
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    if (ax.t3.j.o((Context)this.a.s())) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(" : ");
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                    } else {
                        object = object2;
                        if (string2.contains("ERR_SSL_VERSION_OR_CIPHER_MISMATCH")) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object2);
                            ((StringBuilder)object).append(" (");
                            ((StringBuilder)object).append(string2);
                            ((StringBuilder)object).append(")");
                            object = ((StringBuilder)object).toString();
                        }
                    }
                }
                Toast.makeText((Context)this.a, (CharSequence)object, (int)1).show();
            }

            @Override
            public void b(ax.Q2.f f8) {
            }

            @Override
            public void c(ax.Q2.f object, int n8) {
                this.a.j2();
                object = Bookmark.o(com.voxdon.xplorer.file.T.b(this.a.getApplicationContext(), object).f(n8));
                this.a.c2((Bookmark)object, "cloud_add", null, null, null);
            }

            @Override
            public void d(ax.Q2.f object, int n8, Map<String, Object> map) {
                if (object == ax.Q2.f.N0) {
                    object = new ax.a3.u();
                    ((e)object).c3(this.a.getSupportFragmentManager(), "dropbox_confirm");
                    ((ax.a3.u)object).j3(new u.c(){
                        final int a;
                        final h b;
                        {
                            this.b = h8;
                            this.a = n8;
                        }

                        @Override
                        public void a(boolean bl) {
                            if (this.b.a.s() == null) {
                                return;
                            }
                            k.a a8 = com.voxdon.xplorer.file.k.s0(this.b.a.getApplicationContext());
                            MainActivity mainActivity = this.b.a;
                            a8.l(mainActivity, mainActivity.B0, this.a, bl);
                        }
                    });
                    return;
                }
                ax.u3.b.f();
            }
        };
        this.C0 = new ax.g3.b(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void a(ax.Q2.f object, Object object2) {
                switch (com.voxdon.xplorer.activity.MainActivity$z.a[((Enum)object).ordinal()]) {
                    default: {
                        return;
                    }
                    case 13: {
                        this.a.j2();
                        object2 = com.voxdon.xplorer.file.d.r0(this.a.getApplicationContext());
                        object = this.a;
                        ((d.f)object2).k((a)object, ((MainActivity)object).B0);
                        return;
                    }
                    case 12: {
                        this.a.j2();
                        com.voxdon.xplorer.file.H.U0(this.a.getApplicationContext()).l(this.a);
                        return;
                    }
                    case 11: {
                        this.a.j2();
                        com.voxdon.xplorer.file.D.a1(this.a.getApplicationContext()).n(this.a);
                        return;
                    }
                    case 10: {
                        this.a.j2();
                        object = com.voxdon.xplorer.file.I.r0(this.a.getApplicationContext());
                        object2 = this.a;
                        ((I.d)object).q((a)object2, ((MainActivity)object2).B0);
                        return;
                    }
                    case 9: {
                        this.a.j2();
                        object2 = com.voxdon.xplorer.file.Y.t0(this.a.getApplicationContext());
                        object = this.a;
                        ((Y.e)object2).k((a)object, ((MainActivity)object).B0);
                        return;
                    }
                    case 8: {
                        this.a.j2();
                        object = OneDriveFileHelper.G0(this.a.getApplicationContext());
                        object2 = this.a;
                        ((OneDriveFileHelper.j)object).k((Activity)object2, ((MainActivity)object2).B0);
                        return;
                    }
                    case 7: {
                        int n8 = ax.J5.h.o().g((Context)this.a);
                        if (n8 == 0) {
                            try {
                                object = this.a;
                                u.q0((Activity)object, com.voxdon.xplorer.file.r.A0(object.getApplicationContext()).n(null), 1);
                                return;
                            }
                            catch (ActivityNotFoundException activityNotFoundException) {
                                Toast.makeText((Context)this.a, (int)2131951927, (int)1).show();
                            }
                            return;
                        }
                        ax.J5.h.o().l(this.a, n8, 10002).show();
                        return;
                    }
                    case 6: {
                        this.a.j2();
                        object = com.voxdon.xplorer.file.k.s0(this.a.getApplicationContext());
                        object2 = this.a;
                        ((k.a)object).k((Activity)object2, ((MainActivity)object2).B0);
                        return;
                    }
                    case 5: {
                        object2 = new v();
                        object = new Bundle();
                        object.putInt("action", 1);
                        object.putInt("port", com.voxdon.xplorer.file.W.w0());
                        object.putSerializable("location", (Serializable)((Object)ax.Q2.f.K0));
                        ((Fragment)object2).v2((Bundle)object);
                        this.a.A((e)object2, "webdav", true);
                        return;
                    }
                    case 4: {
                        object = new v();
                        object2 = new Bundle();
                        object2.putInt("action", 1);
                        object2.putInt("port", com.voxdon.xplorer.file.L.y0());
                        object2.putSerializable("location", (Serializable)((Object)ax.Q2.f.I0));
                        ((Fragment)object).v2((Bundle)object2);
                        this.a.A((e)object, "sftp", true);
                        return;
                    }
                    case 3: {
                        object2 = new v();
                        object = new Bundle();
                        object.putInt("action", 1);
                        object.putInt("port", com.voxdon.xplorer.file.q.w0());
                        object.putSerializable("location", (Serializable)((Object)ax.Q2.f.H0));
                        ((Fragment)object2).v2((Bundle)object);
                        this.a.A((e)object2, "ftp", true);
                        return;
                    }
                    case 2: {
                        object = new v();
                        object2 = new Bundle();
                        object2.putInt("action", 1);
                        object2.putInt("port", 0);
                        object2.putSerializable("location", (Serializable)((Object)ax.Q2.f.J0));
                        ((Fragment)object).v2((Bundle)object2);
                        this.a.A((e)object, "smb", true);
                        return;
                    }
                    case 1: 
                }
                object = new ax.a3.h();
                this.a.A((e)object, "chooseSmb", true);
            }
        };
        this.D0 = new b.d(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }
        };
    }

    private void D2(String string) {
        View view;
        this.G.removeAllViews();
        this.H = view = this.getLayoutInflater().inflate(2131558711, (ViewGroup)this.G, true).findViewById(2131362568);
        ((TextView)view.findViewById(2131362553)).setText((CharSequence)this.getString(2131952028, new Object[]{string}));
        string = AnimationUtils.loadAnimation((Context)this, (int)2130771996);
        this.H.startAnimation((Animation)string);
        this.B0();
        this.t0.postDelayed(this.w0, 30000L);
    }

    private void E2(Bookmark object, f f8) {
        int n8;
        if (f8 != null && f8.c()) {
            object = f8.a();
            n8 = f8.b();
        } else {
            n8 = 0;
            object = object != null && object.s().J() != null ? object.s().J() : null;
        }
        if (object != null && (n8 = this.N.c((ax.Q2.f)((Object)object), n8)) >= 0) {
            this.c2(this.N.d(n8), "show_parent", this.N.f(n8), null, null);
        }
    }

    private boolean F1(Intent object) {
        if (object != null && object.getAction() != null && "com.voxdon.xplorer.OPEN_ANALYSIS".equals(object.getAction())) {
            if ((object = object.getData() != null ? k.a(object.getData()).d() : null) != null) {
                ax.Q2.a.i().m("notification", "storage_full_noti_clicked").c("loc", ((ax.c3.K)object).d().I()).e();
                this.K2((ax.c3.K)object, true, "notification");
            } else {
                this.K2(null, false, "notification");
            }
            return true;
        }
        return false;
    }

    private boolean G1(Intent object) {
        if (object != null && !object.getBooleanExtra("com.filemanager.extra.HAS_PENDING_DIALOG", false)) {
            return false;
        }
        object = CommandService.q();
        if (object != null) {
            object.G(this);
        }
        ax.s3.u.j((Context)this).a(102);
        return true;
    }

    private boolean H1(Intent object) {
        if (object != null && object.getAction() != null && "com.voxdon.xplorer.OPEN_FILE".equals(object.getAction()) && object.getData() != null) {
            if ((object = Bookmark.c((Context)this, object.getData())) == null) {
                return false;
            }
            this.c2((Bookmark)object, null, null, null, null);
            return true;
        }
        return false;
    }

    private boolean I1(Intent object) {
        boolean bl;
        boolean bl2 = bl = false;
        if (object != null) {
            if (object.getAction() == null) {
                bl2 = bl;
            } else {
                bl2 = bl;
                if ("com.voxdon.xplorer.SAVE_FILE".equals(object.getAction())) {
                    this.q0("save_file");
                    object = this.d0();
                    bl2 = bl = true;
                    if (object != null) {
                        ((ax.d3.n)object).e4(true);
                        bl2 = bl;
                    }
                }
            }
        }
        return bl2;
    }

    private void J1(Intent intent) {
        this.g0().m(false);
        if (this.M1(intent) || this.H1(intent) || this.F1(intent) || this.I1(intent) || this.K1(intent) || this.P1(intent) || this.G1(intent) || this.L1(intent) || this.O1(intent)) {
            return;
        }
        this.N1(intent);
    }

    private boolean K1(Intent intent) {
        boolean bl = false;
        if (intent != null && intent.getAction() != null) {
            String string = intent.getAction();
            if (!("android.intent.action.GET_CONTENT".equals(string) || "android.intent.action.OPEN_DOCUMENT".equals(string) || "android.intent.action.PICK".equals(string) || "android.intent.action.CREATE_SHORTCUT".equals(string))) {
                return false;
            }
            if (ax.W2.c.q().v()) {
                ax.W2.c.q().l();
            }
            if (ax.X2.Q.l1()) {
                bl = intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false);
            }
            this.g0().i(intent.getStringExtra("com.filemanager.plugin.extra.CALLING_PACKAGE"));
            this.g0().l(intent.getAction());
            this.g0().m(true);
            this.g0().k(bl);
            this.g0().j(intent.getType());
            return true;
        }
        return false;
    }

    private boolean L1(Intent intent) {
        if (intent != null && intent.getAction() != null && "com.filemanager.SET_PERMISSION".equals(intent.getAction())) {
            this.s0 = true;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void L2(String string) {
        int n8;
        boolean bl = "Favorite".equals(string);
        int n9 = 0;
        int n10 = 4;
        if (bl) {
            n8 = 4;
        } else if ("History".equals(string)) {
            n8 = 4;
            n9 = 4;
            n10 = 0;
        } else {
            n8 = "LastVisited".equals(string) ? 0 : 4;
            n9 = 4;
        }
        string = this.D;
        if (string != null) {
            string.setVisibility(n9);
        }
        if ((string = this.E) != null) {
            string.setVisibility(n10);
        }
        if ((string = this.P) != null) {
            string.setVisibility(n8);
        }
    }

    private boolean M1(Intent intent) {
        if (intent != null && intent.getAction() != null) {
            String string = intent.getAction();
            string.getClass();
            if (!string.equals("com.example.android.uamp.open_ui")) {
                return false;
            }
            String string2 = intent.getStringExtra("PLAY_FOLDER_URI");
            string = new Intent((Context)this, FullScreenPlayerActivity.class).setFlags(0x24000000).putExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION", intent.getParcelableExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION"));
            if (string2 != null) {
                if (intent.getBooleanExtra("com.example.android.uamp.EXTRA_START_FULLSCREEN", false)) {
                    this.e2(string2, new Runnable(){
                        final MainActivity c0;
                        final Intent q;
                        {
                            this.c0 = mainActivity;
                            this.q = intent;
                        }

                        @Override
                        public void run() {
                            this.c0.startActivity(this.q);
                        }
                    });
                } else {
                    this.e2(string2, null);
                }
            } else {
                this.startActivity((Intent)string);
            }
            return true;
        }
        return false;
    }

    private boolean N1(Intent intent) {
        if (intent != null && intent.getAction() != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && "content".equals(intent.getData().getScheme())) {
            Toast.makeText((Context)this, (int)2131951943, (int)1).show();
        }
        return false;
    }

    private ax.d3.n N2(ax.Q2.f object, int n8, Bundle bundle, f f8) {
        ax.d3.n n9;
        String string = this.p1((ax.Q2.f)((Object)object), n8);
        ax.d3.n n10 = n9 = (ax.d3.n)this.getSupportFragmentManager().k0(string);
        if (n9 == null) {
            n9 = this.b2((ax.Q2.f)((Object)object));
            n10 = bundle;
            if (bundle == null) {
                n10 = new Bundle();
            }
            n10.putSerializable("location", (Serializable)object);
            n10.putInt("location_key", n8);
            n9.v2((Bundle)n10);
            n10 = n9;
        }
        if (n10 instanceof E) {
            object = (E)n10;
            if (f8 != null && f8.c()) {
                ((E)object).E9(f8.a());
            } else {
                ((E)object).E9(null);
            }
        }
        this.r2(n10, string);
        return n10;
    }

    private boolean O1(Intent object) {
        if (object != null && object.getAction() != null && "android.intent.action.VIEW_DOWNLOADS".equals(object.getAction())) {
            object = ax.c3.K.i;
            this.c2(Bookmark.i((Context)this, (ax.c3.K)object, ((ax.c3.K)object).e()), null, null, null, null);
            return true;
        }
        return false;
    }

    private void O2() {
        ax.u3.g.a().h(this.n0);
        ax.u3.g.a().h(this.o0);
        this.t0.removeCallbacks(this.w0);
    }

    static /* synthetic */ ax.V2.e P0(MainActivity mainActivity) {
        mainActivity.getClass();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean P1(Intent object) {
        boolean bl = false;
        if (object == null) return false;
        if (object.getAction() == null) {
            return false;
        }
        if (!"android.intent.action.VIEW".equals(object.getAction())) return false;
        if (object.getData() == null) return false;
        Uri uri = object.getData();
        Object object2 = object.getData().getScheme();
        if ("content".equals(object2) && "com.android.externalstorage.documents".equals(object.getData().getHost())) {
            object = com.voxdon.xplorer.file.g.r(uri);
            if (object == null) {
                return false;
            }
            this.c2(Bookmark.g((Context)this, ax.c3.d0.U((String)object)), null, null, null, null);
            return true;
        }
        if (object2 != null && !"file".equals(object2)) {
            if (!("smb".equals(object2) || "ftp".equals(object2) || "sftp".equals(object2))) {
                if (!"content".equals(object2)) return false;
                if (!"com.android.mtp.documents".equals(object.getData().getHost())) return false;
                if (!ax.X2.Q.k1()) return false;
                try {
                    Object object3 = this.getContentResolver().getPersistedUriPermissions();
                    Uri uri2 = ax.c3.L.r0(object.getData());
                    if (object3 != null) {
                        object3 = object3.iterator();
                        bl = false;
                        while (object3.hasNext()) {
                            boolean bl2;
                            object2 = (UriPermission)object3.next();
                            if (object2.getUri() == null || !(bl2 = object2.getUri().equals((Object)uri2))) continue;
                            bl = true;
                        }
                    }
                    if (!bl) {
                        object = j.F().V0(object.getData());
                        if (object == null) return true;
                        this.R(0, (ax.c3.K)object, null, true, true);
                        return true;
                    }
                    j.F().t();
                    return true;
                }
                catch (Exception exception) {
                    return false;
                }
            }
            String string = uri.getHost();
            if ("smb".equals(object2)) {
                object = com.voxdon.xplorer.file.Q.t0((Context)this).n();
            } else if ("ftp".equals(object2)) {
                object = com.voxdon.xplorer.file.q.z0((Context)this).p();
            } else {
                if (!"sftp".equals(object2)) return false;
                object = com.voxdon.xplorer.file.L.A0((Context)this).n();
            }
            object2 = object.iterator();
            object = null;
            while (object2.hasNext()) {
                s s8 = (s)object2.next();
                if (s8.c() == null || !s8.c().equals(string)) continue;
                object = s8.e();
            }
            if (object == null) {
                return false;
            }
            String string2 = uri.getPath();
            if (string2 == null) {
                return false;
            }
            this.c2(Bookmark.i((Context)this, (ax.c3.K)object, ax.c3.d0.U(string2)), null, null, null, null);
            return true;
        }
        object = uri.getPath();
        if (object == null) {
            return false;
        }
        this.c2(Bookmark.g((Context)this, ax.c3.d0.U((String)object)), null, null, null, null);
        return true;
    }

    private void Q1() {
        if (this.H == null) {
            return;
        }
        Animation animation = AnimationUtils.loadAnimation((Context)this, (int)2130771997);
        animation.setAnimationListener(new Animation.AnimationListener(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            public void onAnimationEnd(Animation animation) {
                if (this.a.H != null) {
                    this.a.H.setVisibility(8);
                    MainActivity.g1(this.a, null);
                    this.a.B0();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.H.startAnimation(animation);
    }

    private void Q2() {
        this.R2();
    }

    private void R2() {
        Bookmark bookmark = this.V;
        if (bookmark != null && bookmark.s() == ax.Q2.f.l0) {
            this.T.i();
            this.T.l(false);
        } else {
            this.T.l(true);
            bookmark = this.V;
            if (bookmark != null && bookmark.s() == ax.Q2.f.s1) {
                this.T.m(2131231109);
            } else {
                this.T.m(2131230781);
            }
        }
        this.k2();
    }

    private void S1() {
        this.T.n(this.v0);
    }

    static /* synthetic */ boolean T0(MainActivity mainActivity, boolean bl) {
        mainActivity.u0 = bl;
        return bl;
    }

    private void a2() {
        this.k2();
    }

    private ax.d3.n b2(ax.Q2.f object) {
        IllegalAccessException illegalAccessException2;
        block4: {
            if (object.A() == null) {
                return null;
            }
            try {
                object = object.A().newInstance();
                return object;
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block4;
            }
            instantiationException.printStackTrace();
            return null;
        }
        illegalAccessException2.printStackTrace();
        return null;
    }

    static /* synthetic */ View g1(MainActivity mainActivity, View view) {
        mainActivity.H = view;
        return view;
    }

    private void i1() {
        if (this.f0 != null) {
            this.t0.removeCallbacks(this.y0);
            this.f0.cancel();
            this.f0 = null;
        }
    }

    private void k1(Bundle object) {
        if ((object = object.get("androidx.lifecycle.BundlableSavedStateRegistry.key")) instanceof Bundle && (object = object.get("android:support:fragments")) instanceof Bundle) {
            for (Object object2 : object.keySet()) {
                if (object2 == null || !((String)object2).startsWith("fragment_") || !((object2 = object.get((String)object2)) instanceof Bundle) || !((object2 = ((Bundle)object2).get("state")) instanceof Parcelable) || (long)ax.u3.B.x((Parcelable)object2) < 524288L) continue;
                androidx.fragment.app.q.a(object2);
            }
        }
    }

    private void k2() {
        Bookmark bookmark = this.V;
        if (bookmark != null && ax.Q2.f.n(bookmark.s()) && !this.T1() && this.W1() && this.C1().i() > 1) {
            this.T.r(true);
            this.T.k(true);
            return;
        }
        this.T.r(false);
        this.T.k(false);
    }

    private void l1() {
        if (this.l0 != null) {
            this.l0 = null;
        }
    }

    private void l2() {
        this.n0 = new BroadcastReceiver(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            public void onReceive(Context context, Intent intent) {
                block6: {
                    block5: {
                        if (intent == null) break block5;
                        if (!"local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) break block6;
                        if (g.c()) {
                            if (this.a.Q != null) {
                                this.a.Q.setVisibility(8);
                            }
                            ax.t3.j.a(context);
                        }
                    }
                    return;
                }
                "local.intent.action.SETTING_CHANGED".equals(intent.getAction());
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.SETTING_CHANGED");
        ax.u3.g.a().c(intentFilter, this.n0);
        this.o0 = new BroadcastReceiver(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            public void onReceive(Context object, Intent intent) {
                if (intent != null) {
                    if ("local.intent.action.USB_IS_EJECTING".equals(intent.getAction())) {
                        object = intent.getStringExtra("desc");
                        this.a.D2((String)object);
                        return;
                    }
                    if ("local.intent.action.USB_IS_EJECTED".equals(intent.getAction())) {
                        this.a.Q1();
                    }
                }
            }
        };
        intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.USB_IS_EJECTING");
        intentFilter.addAction("local.intent.action.USB_IS_EJECTED");
        ax.u3.g.a().c(intentFilter, this.o0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m1() {
        if (this.e0 + 3500L > System.currentTimeMillis()) {
            ax.Q2.a.i().m("general", "double_back_exit").c("from", "Main").e();
            this.finish();
            this.i1();
            return;
        }
        if (this.U1() && ax.t3.a.k(this.b())) {
            w w8 = new w();
            ax.u3.B.d0(this.getSupportFragmentManager(), w8, "exitads", true);
        } else {
            if (!ax.t3.j.e((Context)this)) {
                ax.t3.j.r((Context)this);
            }
            this.u0 = true;
            this.p();
            this.t0.postDelayed(this.y0, 3500L);
            try {
                Toast toast;
                this.f0 = toast = Toast.makeText((Context)this, (int)2131951680, (int)1);
                toast.show();
            }
            catch (NullPointerException | SecurityException runtimeException) {}
        }
        this.e0 = System.currentTimeMillis();
    }

    private void n1(boolean bl) {
        if (bl) {
            this.S.setDescendantFocusability(131072);
            return;
        }
        this.S.setDescendantFocusability(393216);
    }

    private void n2(String object) {
        object = this.getSupportFragmentManager().k0((String)object);
        if (object != null) {
            if (object instanceof ax.d3.n) {
                ((ax.d3.n)object).q4();
            }
            this.getSupportFragmentManager().o().q((Fragment)object).j();
        }
    }

    private void o1(boolean bl) {
        if (bl) {
            this.R.setDescendantFocusability(131072);
            return;
        }
        this.R.setDescendantFocusability(393216);
    }

    private void p() {
        boolean bl;
        ax.d3.n n8 = this.x1();
        boolean bl2 = bl = true;
        if (n8 != null) {
            bl2 = bl;
            if (this.x1().z3() == ax.Q2.f.l0) {
                bl2 = true ^ this.u0;
            }
        }
        this.x0.j(bl2);
    }

    private String p1(ax.Q2.f f8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f8.I());
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    private String q1(Bookmark bookmark) {
        return this.p1(bookmark.s(), bookmark.t());
    }

    private void q2(ax.Q2.f f8, int n8) {
        this.n2(this.p1(f8, n8));
        this.runOnUiThread(new Runnable(){
            final int c0;
            final MainActivity d0;
            final ax.Q2.f q;
            {
                this.d0 = mainActivity;
                this.q = f8;
                this.c0 = n8;
            }

            @Override
            public void run() {
                this.d0.C1().s(this.q, this.c0);
                MainActivity.P0(this.d0);
                this.d0.N.h(this.q, this.c0);
                this.d0.j2();
            }
        });
    }

    private void r2(ax.d3.n n8, String string) {
        ax.d3.n n9;
        if (!this.Z && (n9 = this.d0()) != n8) {
            t t8 = this.getSupportFragmentManager().o();
            if (n9 != null && !n9.O3()) {
                t8.p(n9);
            }
            if (n8.X0()) {
                t8.v(n8);
            } else {
                t8.c(2131362331, n8, string);
            }
            t8.j();
        }
    }

    private void u2(Bookmark bookmark, f f8, ax.d3.n n8) {
        bookmark = Bookmark.f(bookmark);
        bookmark.G(n8.C3());
        this.N.a(bookmark, f8);
        this.V = bookmark;
        this.W = f8;
        this.U = n8;
        this.v2(bookmark);
        this.p();
    }

    private void v2(Bookmark object) {
        if (this.getSupportActionBar() != null && this.T != null) {
            String string = ax.Q2.f.H((Context)this, ((Bookmark)object).u());
            String string2 = ax.Q2.f.G((Context)this, ((Bookmark)object).u());
            if (((Bookmark)object).s() == ax.Q2.f.l0) {
                this.T.p(2131951672);
            } else if (((Bookmark)object).s() == ax.Q2.f.i1) {
                int n8 = ((Bookmark)object).t();
                if (ax.T2.h.C0(n8)) {
                    this.T.q(string);
                } else {
                    object = ax.T2.h.q(n8);
                    this.T.q(ax.Q2.f.H((Context)this, (ax.c3.K)object));
                }
            } else {
                this.T.q(string);
            }
            if (string2 != null) {
                this.T.o(string2);
                return;
            }
            this.T.o(null);
        }
    }

    private ax.c3.K y1() {
        ax.d3.n n8 = this.d0();
        if (n8 == null) {
            return null;
        }
        return n8.A3();
    }

    private String z1() {
        ax.d3.n n8 = this.d0();
        if (n8 == null) {
            return null;
        }
        return n8.C3();
    }

    public View A1() {
        return this.j0;
    }

    public void A2() {
        if (this.n()) {
            return;
        }
        i.d3().c3(this.getSupportFragmentManager(), "add_sublocation");
    }

    public long B1() {
        return this.h0;
    }

    public void B2() {
        if (this.n()) {
            return;
        }
        new ax.a3.g().c3(this.getSupportFragmentManager(), "add_sublocation");
    }

    public d C1() {
        if (this.O == null) {
            d d8;
            this.O = d8 = new d((Context)this);
            d8.o();
        }
        return this.O;
    }

    public void C2() {
        if (this.n()) {
            return;
        }
        i.e3().c3(this.getSupportFragmentManager(), "add_sublocation");
    }

    public ax.g3.k D1() {
        return this.z0;
    }

    public ax.g3.l E1(String string) {
        return new ax.g3.l(){
            final String a;
            final MainActivity b;
            {
                this.b = mainActivity;
                this.a = string;
            }

            @Override
            public void d(ax.Q2.f f8, int n8) {
                this.b.q2(f8, n8);
            }

            @Override
            public void e(s s8) {
                this.b.g2(s8, null, this.a);
            }
        };
    }

    public void F2(boolean bl) {
        Fragment fragment = this.getSupportFragmentManager().k0("permission_screen");
        t t8 = this.getSupportFragmentManager().o();
        if (fragment != null) {
            t8.q(fragment);
        }
        fragment = ax.d3.e0.V2(bl);
        this.r0 = fragment;
        t8.c(2131362746, fragment, "permission_screen");
        t8.j();
        this.z.setVisibility(4);
    }

    public void G2(String string) {
        this.c2(Bookmark.m((Context)this, ax.Q2.f.p1, 0), string, null, null, null);
    }

    public void H2(ax.c3.K k8, String string) {
        this.d2(k8, true, Bookmark.m((Context)this, ax.Q2.f.p1, 0), string);
    }

    public void I2() {
        Object object;
        block11: {
            if (this.m0 == null) {
                ax.u3.b.g("rewarded ads null?");
                return;
            }
            Object object2 = this.getSupportFragmentManager();
            object = ((FragmentManager)object2).k0("progress");
            if (object == null) break block11;
            try {
                object2 = ((FragmentManager)object2).o();
                ((t)object2).q((Fragment)object);
                ((t)object2).j();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if ((object = this.m0) == com.voxdon.xplorer.activity.MainActivity$K.c0) {
            this.m0 = com.voxdon.xplorer.activity.MainActivity$K.d0;
            this.A(new D(), "progress", true);
        } else if (object == com.voxdon.xplorer.activity.MainActivity$K.g0) {
            this.h2();
        } else if (object == com.voxdon.xplorer.activity.MainActivity$K.h0) {
            Toast.makeText((Context)this, (int)2131951948, (int)1).show();
        } else if (object == com.voxdon.xplorer.activity.MainActivity$K.e0 && (object = this.l0) != null) {
            ax.S2.b.m(this, object, this.D0);
        }
    }

    public void J2(boolean bl, String string) {
        if (this.n()) {
            return;
        }
        ax.Q2.a.i().m("ads", "rewarded_ads_open").c("from", string).e();
        int n8 = bl ? 2131952533 : 2131952551;
        n n9 = ax.a3.n.k3(n8, 2131952550, 2131952552, 0x1040000);
        n9.c3(this.getSupportFragmentManager(), "rewardads");
        n9.n3(new n.c(){
            final String a;
            final MainActivity b;
            {
                this.b = mainActivity;
                this.a = string;
            }

            @Override
            public void G(n n8) {
            }

            @Override
            public void P(n n8) {
                if (this.b.s() == null) {
                    return;
                }
                ((MainActivity)this.b.s()).I2();
                ax.Q2.a.i().o("ads_rewarded_dialog").b("unit", "desktop_reward").b("from", this.a).b("result", "confirm").c();
            }

            @Override
            public void Z(n n8) {
                ax.Q2.a.i().o("ads_rewarded_dialog").b("unit", "desktop_reward").b("from", this.a).b("result", "cancel").c();
            }
        });
    }

    public void K2(ax.c3.K k8, boolean bl, String string) {
        this.c2(Bookmark.n((Context)this, ax.T2.h.B(k8)), string, null, new H(){
            final boolean a;
            final MainActivity b;
            {
                this.b = mainActivity;
                this.a = bl;
            }

            @Override
            public void a(ax.d3.n n8) {
                if (this.a && n8 instanceof ax.d3.b) {
                    ((ax.d3.b)n8).W5();
                }
            }
        }, null);
    }

    @Override
    public void L0() {
        this.Q2();
        this.invalidateOptionsMenu();
        this.o1(true);
    }

    public void M2() {
        Object object;
        Object object2;
        if (this.J == null) {
            object2 = new ax.g3.c(this){
                final MainActivity c;
                {
                    this.c = mainActivity;
                }

                @Override
                public void a(View view) {
                    this.c.R1();
                }
            };
            this.J = (ViewGroup)this.findViewById(2131362991);
            object = (Toolbar)this.findViewById(2131362996);
            this.K = object;
            ((Toolbar)object).setNavigationIcon(2131231109);
            this.K.setNavigationOnClickListener((View.OnClickListener)object2);
            this.K.setNavigationContentDescription(2131951765);
            this.J.setOnClickListener((View.OnClickListener)object2);
            object2 = (ListView)this.findViewById(2131362992);
            this.L = object2;
            object2.setOnKeyListener(new View.OnKeyListener(this){
                final MainActivity a;
                {
                    this.a = mainActivity;
                }

                public boolean onKey(View view, int n8, KeyEvent keyEvent) {
                    if (n8 == 22 && keyEvent.getAction() == 0) {
                        this.a.L.setItemsCanFocus(true);
                        view = this.a.L.getSelectedView();
                        if (view != null && (view = view.findViewById(2131362040)) != null) {
                            view.requestFocus();
                        }
                        return true;
                    }
                    return false;
                }
            });
            object2 = new ax.V2.f((Context)this, this.C1());
            this.M = object2;
            this.L.setAdapter((ListAdapter)object2);
            this.L.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
                final MainActivity a;
                {
                    this.a = mainActivity;
                }

                public void onItemClick(AdapterView<?> object, View object2, int n8, long l8) {
                    object2 = this.a.y1();
                    object = this.a.z1();
                    if (object2 != null && object != null) {
                        object = Bookmark.i((Context)this.a, (ax.c3.K)object2, object);
                        this.a.C1().a((Bookmark)object);
                    }
                    if ((object = (Bookmark)this.a.M.getItem(n8)) != null) {
                        ax.Q2.a.i().m("menu_drawer", "open_in_drawer").c("by", "top_window").c("tgt", ((Bookmark)object).s().I()).e();
                        this.a.R1();
                        this.a.c2((Bookmark)object, "history", null, null, null);
                    }
                }
            });
        }
        this.J.setVisibility(0);
        object = (TextView)this.K.findViewById(2131362994);
        object2 = (TextView)this.K.findViewById(2131362993);
        object.setText((CharSequence)this.T.h());
        object = this.T.g();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            object2.setText((CharSequence)object);
            object2.setVisibility(0);
        } else {
            object2.setVisibility(8);
        }
        object2 = AnimationUtils.loadAnimation((Context)this, (int)2130772019);
        this.L.startAnimation((Animation)object2);
        object = this.y1();
        object2 = this.z1();
        this.M.d((ax.c3.K)object, (String)object2);
        this.o1(false);
        this.n1(false);
        this.J.requestFocus();
    }

    public void P2(ax.Q2.f f8, int n8) {
        this.N.l(f8, n8);
    }

    public void R1() {
        ViewGroup viewGroup = this.J;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
        this.o1(true);
        this.n1(true);
        this.S.requestFocus();
        this.k2();
    }

    public boolean T1() {
        return this.x1() != null && this.x1().K3();
    }

    public boolean U1() {
        return this.j0 != null && this.k0;
    }

    public boolean V1() {
        return this.s0;
    }

    public boolean W1() {
        return this.O != null;
    }

    public boolean X1() {
        e0 e02 = this.r0;
        if (e02 == null) {
            return false;
        }
        return e02.X0();
    }

    public boolean Y1() {
        return this.m0 == com.voxdon.xplorer.activity.MainActivity$K.e0 && this.l0 != null;
    }

    public boolean Z1() {
        ViewGroup viewGroup = this.J;
        if (viewGroup == null) {
            return false;
        }
        return viewGroup.getVisibility() == 0;
    }

    @Override
    public void a(String string) {
        ax.d3.n n8 = this.x1();
        if (n8 instanceof ax.d3.Q && n8.C3().equals(string)) {
            ((ax.d3.Q)n8).j9();
        }
    }

    @Override
    public void a0(ax.Q2.f f8, int n8, String string) {
        String string2 = this.p1(f8, n8);
        Bookmark bookmark = this.V;
        if (bookmark != null && this.q1(bookmark).equals(string2)) {
            this.m2(true, string);
            return;
        }
        this.n2(string2);
        this.N.h(f8, n8);
    }

    @Override
    public void c(ax.Q2.f f8, String string) {
        if (f8 == ax.Q2.f.T0) {
            com.voxdon.xplorer.file.D.a1(this.getApplicationContext()).k(this, string, this.B0);
            return;
        }
        if (f8 == ax.Q2.f.U0) {
            com.voxdon.xplorer.file.H.U0(this.getApplicationContext()).k(this, string, this.B0);
            return;
        }
        ax.u3.b.f();
    }

    public void c2(Bookmark object, String object2, f object3, H object4, G g8) {
        Object object5;
        if (this.Z) {
            object = ax.Ha.c.h().d("OPEN_BOOKMARK_AFTER_DESTORY").j();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("from:");
            ((StringBuilder)object3).append((String)object2);
            ((ax.Ha.b)object).g(((StringBuilder)object3).toString()).h();
            return;
        }
        ax.Q2.f f8 = ((Bookmark)object).s();
        int n8 = ((Bookmark)object).t();
        if (f8 == ax.Q2.f.Y0) {
            this.B2();
            return;
        }
        if (f8 == ax.Q2.f.Z0) {
            this.startActivity(new Intent((Context)this, PaymentActivity.class));
            return;
        }
        if (f8 == ax.Q2.f.X0) {
            this.e2(ax.c3.B.U(((Bookmark)object).u(), ((Bookmark)object).w()), null);
            return;
        }
        if (f8 == ax.Q2.f.a1) {
            this.startActivityForResult(new Intent((Context)this, DevSettingsActivity.class), 10004);
            return;
        }
        Object object6 = new Bundle();
        if (object3 != null && ((f)object3).c()) {
            object6.putSerializable("parent_location", (Serializable)((Object)((f)object3).a()));
        }
        if (object3 != null && (object5 = ((f)object3).d0) != null) {
            object6.putAll((Bundle)object5);
        }
        object5 = this.N2(f8, n8, (Bundle)object6, (f)object3);
        if (object2 != null) {
            Logger logger = E0;
            object6 = new StringBuilder();
            ((StringBuilder)object6).append("Open location : ");
            ((StringBuilder)object6).append(f8.I());
            logger.fine(((StringBuilder)object6).toString());
            ax.Q2.a.i().n("navigation", "open_location").c("loc", f8.I()).c("from", (String)object2).e();
        }
        if (object5 != null) {
            if (object4 != null) {
                object4.a((ax.d3.n)object5);
            }
            if (g8 != null) {
                this.y2((Bookmark)object, new Runnable(){
                    final ax.d3.n c0;
                    final MainActivity d0;
                    final G q;
                    {
                        this.d0 = mainActivity;
                        this.q = g8;
                        this.c0 = n8;
                    }

                    @Override
                    public void run() {
                        this.q.a(this.c0);
                    }
                });
            }
            if (((Bookmark)object).w() == null && ((Bookmark)object).u().e() != null) {
                if (((Bookmark)object).s() != ax.Q2.f.V0) {
                    object2 = ax.Ha.c.h().f().d("!!INVLIAD OPEN PATH!!").j();
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append(((Bookmark)object).s().I());
                    ((StringBuilder)object4).append(",");
                    ((StringBuilder)object4).append(((Bookmark)object).z());
                    ((ax.Ha.b)object2).g(((StringBuilder)object4).toString()).h();
                }
                ((Bookmark)object).G(((Bookmark)object).u().e());
            }
            if (!((Bookmark)object).A()) {
                object2 = Bookmark.f((Bookmark)object);
                ((Bookmark)object2).G(ax.c3.d0.r(((Bookmark)object).w()));
                this.x2((Bookmark)object2, new Runnable(){
                    final Bookmark c0;
                    final MainActivity d0;
                    final ax.d3.n q;
                    {
                        this.d0 = mainActivity;
                        this.q = n8;
                        this.c0 = bookmark;
                    }

                    @Override
                    public void run() {
                        this.q.Z3(this.c0.w());
                    }
                });
                ((ax.d3.n)object5).Z3(((Bookmark)object2).w());
            } else {
                ((ax.d3.n)object5).Z3(((Bookmark)object).w());
            }
            ((ax.d3.n)object5).n4((f)object3);
            this.u2((Bookmark)object, (f)object3, (ax.d3.n)object5);
            this.M0();
        }
        this.Q2();
    }

    @Override
    public ax.d3.n d0() {
        return this.U;
    }

    public void d2(ax.c3.K k8, boolean bl, Bookmark bookmark, String string) {
        if (k8.d() == ax.Q2.f.i1) {
            this.c2(bookmark, string, new f(k8, bl), new H(this){
                final MainActivity a;
                {
                    this.a = mainActivity;
                }

                @Override
                public void a(ax.d3.n n8) {
                    if (n8 instanceof E) {
                        n8 = (E)n8;
                        ((E)n8).U6();
                        ((E)n8).J9(this.a.getApplicationContext(), true);
                    }
                }
            }, null);
            return;
        }
        this.c2(bookmark, string, new f(k8, bl), null, null);
    }

    @Override
    public ax.x3.h e0() {
        return this.T;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e2(String object, Runnable object2) {
        Object object3;
        Object object4 = Uri.parse((String)object);
        boolean bl = k.g((Uri)object4, ax.Q2.f.X0);
        Object var5_6 = null;
        object = object4;
        if (bl) {
            Object object5;
            block16: {
                Intent intent;
                block15: {
                    object = k.a((Uri)object4);
                    object5 = x.e(((k)object).d());
                    bl = ((o)object5).a();
                    if (!bl) {
                        object = com.voxdon.xplorer.file.b.P0(((k)object).d());
                        object3 = null;
                    } else {
                        object3 = (com.voxdon.xplorer.file.b)((o)object5).u();
                        object = ((com.voxdon.xplorer.file.b)object3).O0();
                    }
                    if (object == null) {
                        return;
                    }
                    try {
                        intent = new Intent("android.intent.action.VIEW");
                        ComponentName componentName = new ComponentName((Context)this, ArchiveActivity.class);
                        intent.setComponent(componentName);
                        intent.putExtra("data_uri", (Parcelable)object);
                        intent.putExtra("open_uri", (Parcelable)object4);
                        if (!bl) break block15;
                        ((o)object5).n0();
                        intent.putExtra("open_uri_release", true);
                    }
                    catch (ActivityNotFoundException activityNotFoundException) {
                        break block16;
                    }
                }
                this.startActivity(intent);
            }
            if (object3 != null && ((com.voxdon.xplorer.file.b)object3).N0() == 1 && ((com.voxdon.xplorer.file.b)object3).V0() != null) {
                object5 = E0;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("Open local file archive viewer : ");
                ((StringBuilder)object4).append(object);
                ((Logger)object5).fine(((StringBuilder)object4).toString());
                object = ((com.voxdon.xplorer.file.b)object3).V0();
                if (ax.Z2.a.p((Context)this, ((com.voxdon.xplorer.file.n)object).T())) return;
                object = Uri.parse((String)((com.voxdon.xplorer.file.n)object).S());
            } else if (u.P((Uri)object)) {
                if (ax.Z2.a.p((Context)this, (String)(object = ax.c3.d0.r(object.getPath())))) return;
                object = Uri.parse((String)ax.c3.B.U(x.g((String)object).T(), (String)object));
            } else {
                if (!MyFileProvider.B((Uri)object)) {
                    if (!MyFileProvider.A((Uri)object)) return;
                }
                object4 = E0;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Open document file archive viewer : ");
                ((StringBuilder)object3).append(object);
                ((Logger)object4).fine(((StringBuilder)object3).toString());
                object = MyFileProvider.e((Uri)object);
                if (object == null) {
                    return;
                }
                object = Uri.parse((String)ax.c3.B.U(((k)object).d(), ax.c3.d0.r(((k)object).e())));
            }
        }
        if (object == null) {
            return;
        }
        object3 = Bookmark.c((Context)this, (Uri)object);
        if (object3 == null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Illegal location uri : ");
            ((StringBuilder)object2).append(object.toString());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        object = var5_6;
        if (object2 != null) {
            object = new G(){
                final Runnable a;
                final MainActivity b;
                {
                    this.b = mainActivity;
                    this.a = runnable2;
                }

                @Override
                public void a(ax.d3.n n8) {
                    this.a.run();
                }
            };
        }
        this.c2((Bookmark)object3, "location_uri", null, null, (G)object);
    }

    public void f2(ax.c3.K k8, Bundle bundle) {
        this.c2(Bookmark.m((Context)this, ax.Q2.f.s1, k8.hashCode()), "search", new f(k8, false, bundle), null, null);
    }

    @Override
    public void g(ax.c3.K k8) {
        if (k8.d() == ax.Q2.f.p0 && !j.F().t0()) {
            if (j.F().v0()) {
                this.N(k8);
                return;
            }
            Toast.makeText((Context)this, (int)2131952633, (int)1).show();
            return;
        }
        this.c2(Bookmark.n(this.getApplicationContext(), k8), "home", null, new H(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            @Override
            public void a(ax.d3.n n8) {
                if (n8 instanceof E) {
                    ((E)n8).U6();
                }
            }
        }, null);
    }

    public void g2(s object, ax.c3.K k8, String string) {
        object = Bookmark.o((s)object);
        if (k8 != null) {
            this.d2(k8, false, (Bookmark)object, string);
            return;
        }
        this.c2((Bookmark)object, string, null, null, null);
    }

    @Override
    public A h0() {
        if (this.I == null) {
            A a8;
            this.I = a8 = new A(this, (View)this.findViewById(2131362675), (View)this.findViewById(2131362676));
            a8.D();
            this.I.v(new d.h(this){
                final MainActivity a;
                {
                    this.a = mainActivity;
                }

                @Override
                public void a(int n8) {
                    this.a.B0();
                }
            });
        }
        return this.I;
    }

    public void h1(J j8) {
        this.X.add(j8);
    }

    public void h2() {
        ax.t3.a.f((Context)this);
        Intent intent = new Intent("local.intent.action.LICENSE_STATUS_CHANGED");
        ax.u3.g.a().e(intent);
        this.m0 = com.voxdon.xplorer.activity.MainActivity$K.q;
        this.l1();
    }

    public void i2(ax.Q2.f f8, int n8) {
        this.j2();
        this.P2(f8, n8);
        this.v2(this.V);
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        A a8;
        return ax.t3.a.i() || this.m0() || (a8 = this.I) != null && a8.m() || (a8 = this.H) != null && a8.getVisibility() == 0;
        {
        }
    }

    public void j1() {
        View view = this.j0;
        if (view != null) {
            ax.S2.b.a(view, (Context)this);
            this.j0 = null;
        }
    }

    public void j2() {
        this.s2();
    }

    public void m2(boolean bl, String string) {
        if (this.z.A(this.A)) {
            this.z.d(this.A);
        }
        Bookmark bookmark = this.V;
        f f8 = this.W;
        if (bookmark != null) {
            this.n2(this.q1(bookmark));
            this.N.h(bookmark.s(), bookmark.t());
        }
        this.c2(Bookmark.l((Context)this, ax.Q2.f.l0), string, null, null, null);
        if (bookmark != null && bl) {
            this.E2(bookmark, f8);
        }
    }

    public void o2() {
        if (this.r0 == null) {
            return;
        }
        t t8 = this.getSupportFragmentManager().o();
        t8.q(this.r0);
        t8.j();
        this.r0 = null;
        this.z.setVisibility(0);
    }

    @Override
    protected void onActivityResult(int n8, int n9, Intent object) {
        super.onActivityResult(n8, n9, (Intent)object);
        if (n8 != 1) {
            if (n8 != 10004) {
                if (n8 == 10006) {
                    com.voxdon.xplorer.file.I.r0(this.getApplicationContext()).t(n9, (Intent)object);
                    return;
                }
            } else {
                n8 = ax.t3.k.k();
                if (this.Y != n8) {
                    this.Y = n8;
                    this.Q2();
                    return;
                }
            }
        } else if (n9 == -1 && object != null && object.getExtras() != null && (object = object.getStringExtra("authAccount")) != null) {
            com.voxdon.xplorer.file.r.A0(this.getApplicationContext()).k((String)object, this.B0);
        }
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        if (!bl) {
            this.C.setPadding(0, 0, 0, b8.d);
            return;
        }
        this.C.setPadding(0, 0, 0, 0);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ax.u3.z.c(this);
        this.J();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ax.x3.h h8;
        DrawerLayout drawerLayout;
        super.onCreate(bundle);
        this.setContentView(2131558432);
        if (ax.X2.Q.N1() && ax.u3.z.w((Context)this)) {
            ax.X2.v.r(this.getWindow(), -16777216);
        }
        if (this.getSupportFragmentManager().v0() != null) {
            t t8 = this.getSupportFragmentManager().o();
            for (Fragment object2 : this.getSupportFragmentManager().v0()) {
                if (object2 instanceof ax.d3.n) {
                    t8.p(object2);
                    continue;
                }
                if (!(object2 instanceof e0)) continue;
                t8.q(object2);
            }
            t8.j();
        }
        this.z = drawerLayout = (DrawerLayout)((Object)this.findViewById(2131362160));
        drawerLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            public boolean onPreDraw() {
                ax.u3.z.c(this.a);
                this.a.q0.countDown();
                this.a.z.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                return true;
            }
        });
        this.z.setDrawerLockMode(1);
        this.F = (CoordinatorLayout)this.findViewById(2131361866);
        this.G = (CoordinatorLayout)this.findViewById(2131361864);
        this.R = (ViewGroup)this.findViewById(2131362982);
        this.S = (ViewGroup)this.findViewById(2131362331);
        this.A = this.findViewById(2131362928);
        this.B = (TabLayout)((Object)this.findViewById(2131362927));
        this.C = (FrameLayout)this.findViewById(2131362926);
        this.B.s();
        this.B.h(new TabLayout.d(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }

            @Override
            public void a(TabLayout.g g8) {
            }

            @Override
            public void b(TabLayout.g object) {
                if ((object = ((TabLayout.g)object).i()) != null) {
                    this.a.L2(object.toString());
                }
            }

            @Override
            public void c(TabLayout.g g8) {
            }
        });
        this.T = h8 = new ax.x3.h(this, this.R);
        h8.s(new ax.g3.c(this){
            final MainActivity c;
            {
                this.c = mainActivity;
            }

            @Override
            public void a(View view) {
                this.c.M2();
            }
        });
        this.k0();
        this.Y = ax.t3.k.k();
        this.N = new l((Context)this);
        this.S1();
        if (bundle == null) {
            this.c2(Bookmark.l((Context)this, ax.Q2.f.l0), "on_create", null, null, null);
            this.getSupportFragmentManager().g0();
            this.J1(this.getIntent());
        } else {
            this.Q2();
        }
        this.getOnBackPressedDispatcher().h(this, this.x0);
        new I(this).h(new Long[0]);
        this.l2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onCreatePanelMenu(int n8, Menu menu) {
        if (n8 == 0 && menu != this.T.f()) {
            return false;
        }
        return super.onCreatePanelMenu(n8, menu);
    }

    @Override
    protected void onDestroy() {
        this.Z = true;
        super.onDestroy();
        this.j1();
        this.O2();
        this.l1();
        this.i1();
        View view = this.s1();
        if (view != null) {
            ax.S2.b.a(view, (Context)this);
            this.F.removeAllViews();
        }
    }

    @Override
    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (this.x1() != null && this.x1().Y3(n8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public boolean onKeyLongPress(int n8, KeyEvent keyEvent) {
        if (n8 == 4 && this.x1() != null) {
            this.q0("long_back");
            return true;
        }
        return super.onKeyLongPress(n8, keyEvent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ax.u3.z.c(this);
        this.J1(intent);
    }

    public boolean onOptionsItemSelected(MenuItem object) {
        switch (object.getItemId()) {
            default: {
                return super.onOptionsItemSelected((MenuItem)object);
            }
            case 2131362544: {
                ax.Q2.a.i().m("menu_desktop", "general_settings").e();
                this.startActivity(new Intent((Context)this, SettingsActivity.class));
            }
            case 2131362538: {
                return true;
            }
            case 2131362530: {
                ax.Q2.a.i().m("menu_folder", "refresh").c("loc", this.V.s().I()).e();
                object = this.x1();
                if (object == null) break;
                ((ax.d3.n)object).c4(true);
            }
            case 16908332: 
        }
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        View view = this.j0;
        if (view != null) {
            ax.S2.b.c(view, (Context)this);
        }
        if ((view = this.s1()) != null) {
            ax.S2.b.c(view, (Context)this);
        }
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onRestoreInstanceState(Bundle object) {
        super.onRestoreInstanceState((Bundle)object);
        this.V = (Bookmark)object.getSerializable("CURRENT_BOOKMARK");
        this.W = (f)object.getParcelable("CURRENT_EXTRAINFO");
        ArrayList arrayList = (ArrayList)object.getSerializable("OPEN_BOOKMARK");
        object = (ArrayList)object.getSerializable("OPEN_EXTRAINFOS");
        if (arrayList != null) {
            this.N.i(arrayList);
        }
        if (object != null) {
            this.N.j((ArrayList<f>)object);
        }
        if ((object = this.V) != null) {
            this.c2((Bookmark)object, "on_restore_instance", this.W, null, null);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        com.voxdon.xplorer.file.k.s0(this.getApplicationContext()).p(this);
        this.j2();
        HttpServerService.v((Context)this);
        View view = this.j0;
        if (view != null) {
            ax.S2.b.l(view, (Context)this);
        }
        if ((view = this.s1()) != null) {
            ax.S2.b.l(view, (Context)this);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putSerializable("CURRENT_BOOKMARK", (Serializable)this.V);
            bundle.putParcelable("CURRENT_EXTRAINFO", (Parcelable)this.W);
            bundle.putSerializable("OPEN_BOOKMARK", this.N.e());
            bundle.putSerializable("OPEN_EXTRAINFOS", this.N.g());
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.h().d("MainActivity onSaveInstanceState Error").l(illegalStateException).h();
        }
        try {
            this.k1(bundle);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.C1().u();
    }

    @Override
    public void p0() {
        this.a2();
        this.e0().b();
        this.o1(false);
    }

    public void p2(J j8) {
        this.X.remove(j8);
    }

    @Override
    public void q0(String string) {
        if (this.z.A(this.A)) {
            this.z.d(this.A);
        }
        Bookmark bookmark = Bookmark.l((Context)this, ax.Q2.f.l0);
        bookmark.G("/moveToHome");
        this.c2(bookmark, string, null, null, null);
    }

    @Override
    public void r0(Bookmark bookmark) {
        Boolean bl = this.p0;
        if (bl != null && bl.booleanValue()) {
            ax.V2.a.b((Context)this).a(bookmark);
        }
        if (bookmark.A()) {
            this.C1().a(bookmark);
        }
    }

    public CoordinatorLayout r1() {
        return this.F;
    }

    View s1() {
        CoordinatorLayout coordinatorLayout = this.F;
        if (coordinatorLayout != null && (coordinatorLayout = coordinatorLayout.getChildAt(0)) != null) {
            return coordinatorLayout;
        }
        return null;
    }

    public void s2() {
        ArrayList<J> arrayList = this.X;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            J j8 = arrayList.get(i8);
            j8.C();
        }
    }

    @Override
    public void t0(ax.Q2.f f8, int n8, String string, boolean bl) {
        Bookmark bookmark = this.d0;
        if (bookmark != null && bookmark.s() == f8 && this.d0.t() == n8 && this.d0.w().equals(string)) {
            this.c0.run();
            this.c0 = null;
            this.d0 = null;
        }
    }

    public long t1() {
        if (this.i0 == 0L) {
            this.i0 = ax.t3.a.a();
        }
        return this.i0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void t2(b.b b8) {
        Object object = this.y;
        // MONITORENTER : object
        this.g0 = b8;
        // MONITOREXIT : object
        if (b8 != b.b.c0) return;
        if (ax.t3.a.h((Context)this) && !ax.S2.a.b() && !ax.u3.z.u((Context)this)) {
            ax.S2.a.a((Context)this);
        }
        if (!ax.t3.a.k((Context)this)) return;
        if (this.U1()) return;
        if (ax.u3.z.u((Context)this)) return;
        if (ax.t3.a.e()) {
            ax.S2.b.g(this, new b.c(this){
                final MainActivity a;
                {
                    this.a = mainActivity;
                }
            });
            return;
        }
        int n8 = c.n().l();
        n8 = ax.a3.B.l(this.s()) && w.n3(n8) ? w.m3((Context)this) : 300;
        this.j0 = ax.S2.b.h(this, n8, new b.a(this){
            final MainActivity a;
            {
                this.a = mainActivity;
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b.b u1() {
        Object object = this.y;
        synchronized (object) {
            return this.g0;
        }
    }

    public ax.g3.b v1() {
        return this.C0;
    }

    @Override
    public void w0(ax.Q2.f f8, int n8, String string, boolean bl) {
        Bookmark bookmark;
        int n9;
        if (bl && (n9 = this.N.c(f8, n8)) >= 0) {
            this.N.k(f8, n8, string);
            this.C1().c(this.N.d(n9));
            this.M0();
            this.k2();
        }
        if ((bookmark = this.b0) != null && bookmark.s() == f8 && this.b0.t() == n8 && this.b0.w().equals(string)) {
            this.a0.run();
            this.a0 = null;
            this.b0 = null;
        }
    }

    public h.c w1() {
        return this.A0;
    }

    public void w2(long l8) {
        this.h0 = l8;
    }

    @Override
    public void x0() {
        this.Q2();
    }

    public ax.d3.n x1() {
        Object object = this.V;
        if (object == null) {
            return null;
        }
        object = this.q1((Bookmark)object);
        return (ax.d3.n)this.getSupportFragmentManager().k0((String)object);
    }

    void x2(Bookmark bookmark, Runnable runnable2) {
        this.d0 = bookmark;
        this.c0 = runnable2;
    }

    void y2(Bookmark bookmark, Runnable runnable2) {
        this.b0 = bookmark;
        this.a0 = runnable2;
    }

    public void z2(String string, String string2) {
        ax.x3.h h8;
        if (this.getSupportActionBar() != null && (h8 = this.T) != null) {
            h8.q(string);
            if (string2 != null) {
                this.T.o(string2);
                return;
            }
            this.T.o(null);
        }
    }

    public static interface G {
        public void a(ax.d3.n var1);
    }

    public static interface H {
        public void a(ax.d3.n var1);
    }

    public static class I
    extends q<Long, Long, Long> {
        private MainActivity h;
        private boolean i;
        private boolean j;
        private CountDownLatch k;

        I(MainActivity mainActivity) {
            super(q.e.e0);
            this.h = mainActivity;
            this.k = mainActivity.q0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Long w(Long ... longArray) {
            if (ax.t3.k.v()) {
                ax.V2.b.d((Context)this.h);
            }
            try {
                this.k.await(3000L, TimeUnit.MILLISECONDS);
            }
            catch (Exception exception) {}
            try {
                Thread.sleep(100L);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!ax.u3.z.y() && !ax.u3.z.t((Context)this.h)) {
                boolean bl;
                this.i = bl = ax.u3.z.a(this.h);
                if (bl) {
                    this.j = bl = ax.u3.z.F((Context)this.h);
                    if (bl) {
                        if (!ax.X2.Q.J()) {
                            ax.u3.z.A((Context)this.h);
                        }
                    } else {
                        ax.Ha.c.h().f().b("WebView Locked detected!!").h();
                    }
                }
            }
            if (ax.X2.J.G() && ax.t3.j.b((Context)this.h)) {
                ax.t3.j.p((Context)this.h, false);
                ax.u3.B.c0((Context)this.h, UsbAttachActivity.class, false);
            }
            m.d(this.h.getApplicationContext());
            return null;
        }

        protected void x(Long l8) {
            if (!this.h.isFinishing()) {
                if (this.i) {
                    if (this.j) {
                        ax.u3.z.q(this.h);
                    }
                    ax.u3.z.g(this.h);
                }
                if (ax.t3.k.w((Context)this.h)) {
                    this.h.finish();
                }
            }
        }
    }

    public static interface J {
        public void C();
    }

    static final class K
    extends Enum<K> {
        public static final /* enum */ K c0;
        public static final /* enum */ K d0;
        public static final /* enum */ K e0;
        public static final /* enum */ K f0;
        public static final /* enum */ K g0;
        public static final /* enum */ K h0;
        private static final K[] i0;
        public static final /* enum */ K q;

        static {
            q = new K();
            c0 = new K();
            d0 = new K();
            e0 = new K();
            f0 = new K();
            g0 = new K();
            h0 = new K();
            i0 = com.voxdon.xplorer.activity.MainActivity$K.d();
        }

        private static /* synthetic */ K[] d() {
            return new K[]{q, c0, d0, e0, f0, g0, h0};
        }

        public static K valueOf(String string) {
            return Enum.valueOf(K.class, string);
        }

        public static K[] values() {
            return (K[])i0.clone();
        }
    }
}

