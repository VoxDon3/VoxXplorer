/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ax.Q2.a;
import ax.Q2.i;
import ax.T2.h;
import ax.U2.d;
import ax.V2.c;
import ax.W2.e;
import ax.W2.h;
import ax.W2.k;
import ax.W2.t;
import ax.W2.z;
import ax.Z2.b;
import ax.Z2.c;
import ax.Z2.j;
import ax.Z2.k;
import ax.Z2.p;
import ax.a3.Q;
import ax.a3.a;
import ax.a3.f;
import ax.a3.l;
import ax.a3.m;
import ax.a3.p;
import ax.a3.x;
import ax.b3.s;
import ax.c0.A;
import ax.c3.K;
import ax.c3.V;
import ax.c3.d0;
import ax.d3.A;
import ax.d3.B;
import ax.d3.C;
import ax.d3.D;
import ax.d3.F;
import ax.d3.G;
import ax.d3.H;
import ax.d3.J;
import ax.d3.n;
import ax.t3.i;
import ax.u.w;
import ax.u3.c;
import ax.u3.g;
import ax.u3.q;
import ax.u3.u;
import ax.u3.z;
import ax.x3.d;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.v;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.provider.MyFileProvider;
import com.alphainventor.filemanager.service.CommandService;
import com.alphainventor.filemanager.service.FileObserverService;
import com.alphainventor.filemanager.service.HttpServerService;
import com.alphainventor.filemanager.sharing.QuickShareProvider;
import com.alphainventor.filemanager.viewer.e;
import com.alphainventor.filemanager.widget.PathBar;
import com.alphainventor.filemanager.widget.a;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class E
extends H
implements c.a,
ax.g3.f,
Q.f {
    private static final Logger r2 = ax.Q2.g.a(E.class);
    private Drawable A1;
    private Drawable B1;
    private SwipeRefreshLayout C0;
    protected View.OnClickListener C1;
    private SwipeRefreshLayout D0;
    private boolean D1 = false;
    private SwipeRefreshLayout E0;
    private boolean E1 = false;
    private SwipeRefreshLayout F0;
    private int F1 = -1;
    private RecyclerView G0;
    private ax.Q2.f G1;
    private View H0;
    private boolean H1 = false;
    private i I0;
    private boolean I1 = true;
    private boolean J0;
    private boolean J1 = false;
    private ListView K0;
    private k0 K1;
    private GridView L0;
    private boolean L1 = false;
    private View M0;
    private boolean M1 = false;
    private AbsListView N0;
    private boolean N1 = false;
    private int O0;
    private int O1 = -1;
    private String P0;
    private int P1 = -1;
    private View Q0;
    private int Q1 = -1;
    private TextView R0;
    private boolean R1;
    private TextView S0;
    private int S1 = -1;
    private TextView T0;
    private int T1;
    private CoordinatorLayout U0;
    private int U1;
    private View V0;
    private long V1;
    protected PathBar W0;
    private StringBuffer W1;
    private EditText X0;
    private Handler X1;
    private ax.x3.d Y0;
    private boolean Y1 = true;
    private w Z0;
    private boolean Z1 = true;
    private w a1;
    private boolean a2 = false;
    private n.r b1 = new n.r();
    private String b2;
    protected a c1;
    private String c2;
    protected a d1;
    private String d2;
    protected a e1;
    private Set<String> e2;
    private ax.V2.c f1;
    private final BroadcastReceiver f2;
    private ax.r3.d g1;
    private MediaControllerCompat g2;
    private com.alphainventor.filemanager.file.o h1;
    AbsListView.MultiChoiceModeListener h2;
    private com.alphainventor.filemanager.file.n i1;
    AbsListView.MultiChoiceModeListener i2;
    private com.alphainventor.filemanager.file.n j1;
    AdapterView.OnItemClickListener j2;
    private long k1 = -1L;
    AdapterView.OnItemClickListener k2;
    private String l1;
    AdapterView.OnItemClickListener l2;
    private long m1;
    private MediaControllerCompat.a m2;
    private String n1;
    BroadcastReceiver n2;
    private boolean o1;
    BroadcastReceiver o2;
    private String p1;
    BroadcastReceiver p2;
    private List<com.alphainventor.filemanager.file.n> q1;
    Runnable q2;
    private String r1;
    private boolean s1;
    private com.alphainventor.filemanager.file.n t1;
    private r0 u1;
    private q0 v1;
    private n0 w1;
    private boolean x1;
    private MenuItem y1;
    private MenuItem z1;

    public E() {
        this.K1 = k0.q;
        this.W1 = new StringBuffer();
        this.X1 = new Handler(Looper.getMainLooper());
        this.f2 = new BroadcastReceiver(this){
            final E a;
            {
                this.a = e8;
            }

            public void onReceive(Context context, Intent intent) {
                boolean bl = intent.getBooleanExtra("CONNECTED", false);
                this.a.j8(bl);
            }
        };
        this.h2 = new AbsListView.MultiChoiceModeListener(this){
            private AccessibilityManager a;
            final E b;
            {
                this.b = e8;
            }

            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return this.b.J7(menuItem.getItemId(), false, false);
            }

            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                AccessibilityManager accessibilityManager;
                this.a = accessibilityManager = (AccessibilityManager)this.b.b().getSystemService("accessibility");
                if (!accessibilityManager.isTouchExplorationEnabled()) {
                    this.a = null;
                }
                this.b.b3(actionMode, menu, 2131689473);
                this.b.g9();
                this.b.X3(n.o.c0);
                return true;
            }

            public void onDestroyActionMode(ActionMode actionMode) {
                this.b.a3();
                this.b.b1.c();
                this.b.W3(n.o.c0);
                this.a = null;
            }

            public void onItemCheckedStateChanged(ActionMode actionMode, int n8, long l8, boolean bl) {
                this.b.b1.f(n8, bl);
                if (this.b.b1.a()) {
                    Object object = this.a;
                    if (object != null && object.isTouchExplorationEnabled()) {
                        n8 = this.b.N0.getCheckedItemCount();
                        object = this.b.o3().getResources().getQuantityString(2131820560, n8, new Object[]{n8});
                        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
                        accessibilityEvent.setEventType(16384);
                        accessibilityEvent.getText().add(object);
                        this.a.sendAccessibilityEvent(accessibilityEvent);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.b.N0.getCheckedItemCount());
                    ((StringBuilder)object).append("/");
                    ((StringBuilder)object).append(this.b.N0.getCount());
                    actionMode.setTitle((CharSequence)((StringBuilder)object).toString());
                    actionMode.invalidate();
                }
            }

            public boolean onPrepareActionMode(ActionMode object, Menu object2) {
                if (this.b.c1.getCount() == 0) {
                    if (this.b.i1 != null) {
                        object2 = ax.Ha.c.h().n("AMO STATE").j();
                        object = new StringBuilder();
                        ((StringBuilder)object).append("LOADED:");
                        ((StringBuilder)object).append(this.b.o1);
                        ((StringBuilder)object).append(":");
                        ((StringBuilder)object).append(this.b.N0.getCheckedItemCount());
                        ((StringBuilder)object).append(":");
                        ((StringBuilder)object).append(this.b.N0.getCount());
                        ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    }
                    return false;
                }
                object = object2.findItem(2131362541);
                if (object != null) {
                    z.C(this.b.o3(), (MenuItem)object, 2131099680);
                    if (this.b.b1.b()) {
                        object.setEnabled(true);
                    } else {
                        object.setEnabled(false);
                    }
                }
                if (this.b.N0.getCheckedItemCount() == 0) {
                    return false;
                }
                if (this.b.N0.getCheckedItemCount() == 1) {
                    object = this.b.u7(false);
                    if (object.size() > 0) {
                        this.b.l8((com.alphainventor.filemanager.file.n)object.get(0));
                    }
                } else {
                    object = this.b;
                    ((E)object).k8(((E)object).u7(false));
                }
                this.b.Y0.B();
                return false;
            }
        };
        this.i2 = new AbsListView.MultiChoiceModeListener(this){
            private AccessibilityManager a;
            private boolean b;
            private ax.Q2.j c;
            final E d;
            {
                this.d = e8;
            }

            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return this.d.J7(menuItem.getItemId(), false, false);
            }

            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                boolean bl;
                Object object = (AccessibilityManager)this.d.b().getSystemService("accessibility");
                this.a = object;
                if (!object.isTouchExplorationEnabled()) {
                    this.a = null;
                }
                object = this.d.v3().g0();
                this.c = object;
                this.b = bl = ((ax.Q2.j)object).e();
                if (bl) {
                    this.d.b3(actionMode, menu, 2131689474);
                } else {
                    this.d.b3(actionMode, menu, 0);
                }
                this.d.X3(n.o.d0);
                return true;
            }

            public void onDestroyActionMode(ActionMode actionMode) {
                if (this.d.f0() == null) {
                    return;
                }
                this.d.v3().h0().F(false);
                this.d.a3();
                this.d.b1.c();
                this.d.W3(n.o.d0);
                this.a = null;
            }

            public void onItemCheckedStateChanged(ActionMode object, int n8, long l8, boolean bl) {
                int n9;
                boolean bl2;
                if (this.b) {
                    this.d.b1.f(n8, bl);
                    bl2 = this.d.b1.a();
                } else {
                    bl2 = true;
                }
                if (bl2) {
                    Object object2 = this.a;
                    if (object2 != null && object2.isTouchExplorationEnabled()) {
                        n9 = this.d.N0.getCheckedItemCount();
                        object2 = this.d.o3().getResources().getQuantityString(2131820560, n9, new Object[]{n9});
                        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
                        accessibilityEvent.setEventType(16384);
                        accessibilityEvent.getText().add(object2);
                        this.a.sendAccessibilityEvent(accessibilityEvent);
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(this.d.N0.getCheckedItemCount());
                    ((StringBuilder)object2).append("/");
                    ((StringBuilder)object2).append(this.d.N0.getCount());
                    object.setTitle((CharSequence)((StringBuilder)object2).toString());
                    object.invalidate();
                }
                object = (com.alphainventor.filemanager.file.n)this.d.c1.getItem(n8);
                if (bl && object != null) {
                    n9 = this.d.v3() != null && this.d.v3().g0().d() ? 1 : 0;
                    if (n9 == 0 && object.isDirectory()) {
                        this.d.N0.setItemChecked(n8, false);
                        return;
                    }
                    if (!this.c.h(object.s())) {
                        this.d.N0.setItemChecked(n8, false);
                        return;
                    }
                }
                if (!this.b && this.d.N0.getCheckedItemCount() > 1) {
                    object = this.d.N0.getCheckedItemPositions();
                    for (n9 = 0; n9 < object.size(); ++n9) {
                        if (!object.valueAt(n9) || n8 == object.keyAt(n9)) continue;
                        this.d.N0.setItemChecked(object.keyAt(n9), false);
                        return;
                    }
                }
            }

            public boolean onPrepareActionMode(ActionMode object, Menu menu) {
                if (this.d.c1.getCount() == 0) {
                    return false;
                }
                object = menu.findItem(2131362541);
                if (object != null) {
                    z.C(this.d.o3(), (MenuItem)object, 2131099680);
                    if (this.d.b1.b()) {
                        object.setEnabled(true);
                    } else {
                        object.setEnabled(false);
                    }
                }
                object = this.d.v3().h0();
                if (this.d.Y7()) {
                    if (this.d.N0.getCheckedItemCount() <= 0) {
                        ((ax.x3.A)object).F(false);
                    } else {
                        ((ax.x3.A)object).F(true);
                    }
                } else {
                    ((ax.x3.A)object).F(false);
                }
                return false;
            }
        };
        this.j2 = new ax.g3.d(this){
            final E c;
            {
                this.c = e8;
            }

            @Override
            public void a(AdapterView<?> adapterView, View view, int n8, long l8) {
                if (n8 >= 0 && n8 < this.c.c1.getCount()) {
                    this.c.t7().setItemChecked(n8, this.c.t7().isItemChecked(n8) ^ true);
                }
            }
        };
        this.k2 = new ax.g3.d(this, 500L){
            final E c;
            {
                this.c = e8;
                super(l8);
            }

            @Override
            public void a(AdapterView<?> object, View view, int n8, long l8) {
                if (n8 >= 0 && n8 < this.c.c1.getCount()) {
                    object = (com.alphainventor.filemanager.file.n)this.c.c1.getItem(n8);
                    this.c.D8(object);
                    if (object.isDirectory() && ax.c3.B.q((com.alphainventor.filemanager.file.n)object) == 0 && ax.Q2.f.k0(this.c.z3()) && !ax.c3.C.e((String)(object = d0.h(((com.alphainventor.filemanager.file.n)object).E())))) {
                        ax.Q2.a.i().m("general", "first_dir").c("info", (String)object).e();
                    }
                }
            }
        };
        this.l2 = new ax.g3.d(this, 400L){
            final E c;
            {
                this.c = e8;
                super(l8);
            }

            @Override
            public void a(AdapterView<?> object, View view, int n8, long l8) {
                if (n8 >= 0 && n8 < this.c.c1.getCount()) {
                    object = (com.alphainventor.filemanager.file.n)this.c.c1.getItem(n8);
                    if (!object.isDirectory()) {
                        this.c.N0.setItemChecked(n8, true);
                        return;
                    }
                    this.c.D8((com.alphainventor.filemanager.file.n)object);
                }
            }
        };
        this.m2 = new MediaControllerCompat.a(this){
            final E d;
            {
                this.d = e8;
            }

            @Override
            public void d(MediaMetadataCompat mediaMetadataCompat) {
                this.d.g8();
            }

            @Override
            public void e(PlaybackStateCompat playbackStateCompat) {
                this.d.g8();
            }
        };
        this.n2 = new BroadcastReceiver(this){
            final E a;
            {
                this.a = e8;
            }

            public void onReceive(Context context, Intent intent) {
                this.a.j9();
            }
        };
        this.o2 = new BroadcastReceiver(this){
            final E a;
            {
                this.a = e8;
            }

            public void onReceive(Context object, Intent intent) {
                if (!this.a.Z0() && (object = intent.getStringExtra("mimetype")) != null) {
                    this.a.N9((String)object);
                }
            }
        };
        this.p2 = new BroadcastReceiver(this){
            final E a;
            {
                this.a = e8;
            }

            public void onReceive(Context object, Intent object2) {
                object = object2.getStringExtra("filepath");
                object2 = object2.getStringExtra("location_uri");
                if (this.a.j1 != null && this.a.j1.N().getAbsolutePath().equals(object) && object2 != null && ((String)object2).equals(this.a.j1.Q())) {
                    this.a.q9();
                }
            }
        };
        this.q2 = new Runnable(this){
            final E q;
            {
                this.q = e8;
            }

            @Override
            public void run() {
                if (this.q.f0() == null) {
                    return;
                }
                this.q.N6(false);
            }
        };
    }

    private void A8(com.alphainventor.filemanager.file.n n8) {
        if (this.X0() && !this.d1() && !this.Z0()) {
            this.B8(this.Z6(n8), 0, false, n8.A());
        }
    }

    private void A9(boolean bl) {
        this.J0 = bl;
        if (this.H0 == null) {
            ax.u3.b.f();
            return;
        }
        this.ea(bl);
        this.h7(bl ^ true);
        this.N0.setEnabled(bl ^ true);
    }

    private boolean B8(Intent object, int n8, boolean bl, String charSequence) {
        block13: {
            Uri uri;
            block14: {
                block17: {
                    block16: {
                        block15: {
                            if (!this.X0() || this.Z0()) break block13;
                            if (charSequence != null) break block14;
                            if (object.getData() == null) break block15;
                            charSequence = d0.j(d0.h(object.getData().getPath()));
                            break block14;
                        }
                        if (!"com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(object.getAction()) || !object.hasExtra("com.filemanager.plugin.extra.DATA")) break block16;
                        charSequence = object.getStringExtra("com.filemanager.plugin.extra.DATA");
                        if (charSequence == null) break block17;
                        charSequence = d0.j(d0.h(Uri.parse((String)charSequence).getPath()));
                        break block14;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("What case is this?");
                    ((StringBuilder)charSequence).append(object);
                    ax.u3.b.g(((StringBuilder)charSequence).toString());
                }
                charSequence = "";
            }
            if (ax.c3.u.R((String)charSequence) && ax.c3.u.W(object) && object.getData() != null && object.getData().getPath() != null) {
                k k8 = ax.o3.c.z(object.getData().getPath());
                if (k8 != null) {
                    com.alphainventor.filemanager.file.n n9;
                    if (!ax.Q2.f.l0(this.z3()) && (n9 = this.j1) != null && n9.N().getPath().equals(k8.e())) {
                        object.setData(HttpServerService.l(com.alphainventor.filemanager.service.b.f(this.b()).h(), this.j1));
                        com.alphainventor.filemanager.service.b.f(this.b()).a(this.j1.Q());
                        HttpServerService.q(this.o3(), this.z3(), this.x3(), false, false, true, null);
                    } else {
                        com.alphainventor.filemanager.service.b.f(this.b()).a(k8.toString());
                        HttpServerService.q(this.o3(), k8.b(), k8.c(), false, false, true, null);
                    }
                }
            } else if (ax.c3.u.Y(object)) {
                boolean bl2 = ax.c3.u.W(object);
                boolean bl3 = MyFileProvider.E(object.getData());
                String string = object.getComponent().getPackageName();
                if (ax.Q2.f.n0(this.z3()) && (bl2 || bl3) && object.getData() != null && object.getData().getPath() != null && ax.c3.A.g((String)charSequence) == ax.c3.z.e0) {
                    com.alphainventor.filemanager.file.n n10 = this.j1;
                    if (n10 != null) {
                        object.putExtra("size", n10.p());
                    }
                    this.I6((Intent)object, bl2, bl3, string);
                    if (ax.u3.B.x((Parcelable)object) >= 524288) {
                        object.removeExtra("video_list");
                    }
                }
            } else if (ax.c3.u.X(object) && MyFileProvider.B(uri = object.getData())) {
                object.setDataAndType(MyFileProvider.i(uri), object.getType());
            }
            this.T8();
            this.J1 = bl = ax.c3.w.n(this, object, n8, bl);
            if (bl) {
                object = "success";
            } else {
                this.V6();
                object = "failure";
            }
            ax.Q2.a.i().m("command", "file_open").c("loc", this.z3().I()).c("ext", (String)charSequence).c("result", (String)object).e();
            return this.J1;
        }
        return false;
    }

    private void C8(Uri uri, String string, String string2, boolean bl, boolean bl2) {
        Q.R3(this, c.a.c0, uri, string, string2, bl, bl2);
    }

    private void C9(com.alphainventor.filemanager.file.n n8, long l8) {
        this.j1 = n8;
        ax.o3.e.b().h(n8, l8);
    }

    private void D8(com.alphainventor.filemanager.file.n n8) {
        if (this.f0() != null && this.X0() && !this.d1()) {
            if (n8.isDirectory()) {
                if (this.i1 != null) {
                    this.d9();
                }
                this.t8(n8, 0, 0);
                return;
            }
            if (this.K8()) {
                String string = n8.T();
                Object object = string;
                if (!d0.B(string)) {
                    object = ax.Ha.c.h().f().b("INVALID PARENT PATH");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("loc:");
                    stringBuilder.append((Object)this.z3());
                    stringBuilder.append(",path:");
                    stringBuilder.append(string);
                    ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    object = string;
                    if (string != null) {
                        object = string;
                        if (string.endsWith("/")) {
                            object = d0.U(string);
                        }
                    }
                }
                if (!d0.G(this.n1, (String)object)) {
                    this.d9();
                    this.u8((String)object, 0, 0);
                } else if (!this.o1 && !q.n(this.u1)) {
                    this.u8((String)object, 0, 0);
                }
            }
            this.x8(n8);
        }
    }

    private void D9(com.alphainventor.filemanager.file.n n8) {
        this.j1 = n8;
        ax.o3.e.b().h(n8, 0L);
    }

    static /* synthetic */ int E5(E e8, int n8) {
        e8.S1 = n8;
        return n8;
    }

    private void E6(List<com.alphainventor.filemanager.file.n> object) {
        String string = a.e.a(object);
        ax.Q2.a.i().m("menu_folder", "bookmark").c("loc", this.z3().I()).c("type", string).e();
        object = object.get(0);
        object = Bookmark.h(((com.alphainventor.filemanager.file.n)object).B(), this.A3(), ((com.alphainventor.filemanager.file.n)object).E(), object.t(), object.isDirectory());
        if (ax.V2.b.a((Context)this.f0(), (Bookmark)object, false)) {
            this.E4(2131952316, 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void E8(com.alphainventor.filemanager.file.n n8, String object, boolean bl) {
        Object object2;
        Object object3;
        block17: {
            int n9;
            block11: {
                block13: {
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    block10: {
                                        if (!this.X0()) return;
                                        if (this.d1()) return;
                                        if (this.Z0()) {
                                            return;
                                        }
                                        if (ax.c3.B.P(n8)) {
                                            object3 = (y)n8;
                                            this.D9(n8);
                                        } else {
                                            object2 = n8.N();
                                            this.C9(n8, ((File)object2).lastModified());
                                            object3 = ax.c3.x.f((File)object2);
                                            try {
                                                object3 = (y)((com.alphainventor.filemanager.file.o)object3).z(((File)object2).getAbsolutePath());
                                            }
                                            catch (ax.b3.j j8) {
                                                this.E4(2131951934, 1);
                                                j8.printStackTrace();
                                                return;
                                            }
                                        }
                                        boolean bl2 = ax.t3.j.C(this.o3());
                                        n9 = 0;
                                        if (!bl2 || !ax.c3.A.B((com.alphainventor.filemanager.file.n)object3, true) || object != null) break block10;
                                        object = this.Z6(n8);
                                        break block11;
                                    }
                                    if (!ax.t3.j.F(this.o3()) || !ax.c3.A.E((com.alphainventor.filemanager.file.n)object3) || object != null || Q.K3(this.o3(), c.a.c0, (com.alphainventor.filemanager.file.n)object3, false)) break block12;
                                    this.R8(n8);
                                    break block13;
                                }
                                if (!ax.t3.j.D(this.o3()) || !ax.c3.A.C((com.alphainventor.filemanager.file.n)object3) || object != null || Q.J3(this.o3(), (com.alphainventor.filemanager.file.n)object3, false)) break block14;
                                this.G8((com.alphainventor.filemanager.file.n)object3);
                                break block13;
                            }
                            if (!ax.t3.j.E(this.o3()) || (!ax.c3.A.D((com.alphainventor.filemanager.file.n)object3) || object != null) && (!V.c0.h().equals(object) || bl)) break block15;
                            object = ax.c3.w.g(this.o3(), n8, (y)object3);
                            bl = false;
                            n9 = 1002;
                            break block11;
                        }
                        if (!ax.c3.A.p(n8) || object != null) break block16;
                        this.k7(Collections.singletonList(n8));
                        break block13;
                    }
                    if (!ax.X2.Q.H1() || !ax.c3.A.K(n8) || object != null) break block17;
                    this.o8((ax.c3.k)object3);
                }
                object = null;
            }
            if (object == null) return;
            this.B8((Intent)object, n9, bl, n8.A());
            return;
        }
        object2 = ((y)object3).s();
        if (object == null) {
            object = object2;
        }
        this.ja(n8, ((y)object3).F0());
        this.s8((ax.c3.k)object3, (String)object2, (String)object, bl, true);
    }

    private void F6(com.alphainventor.filemanager.file.n object, long l8) {
        if (object != null && this.f0() != null && this.C7()) {
            object = Bookmark.j(this.A3(), ((com.alphainventor.filemanager.file.n)object).E(), object.t(), object.isDirectory(), l8);
            this.v3().r0((Bookmark)object);
        }
    }

    public static String F7(Context object, ax.Q2.f object2, int n8, String string, boolean bl) {
        object2 = ax.t3.e.j(object, object2, n8, string, bl);
        object = object2;
        if (bl) {
            if ("SizeUp".equals(object2)) {
                return "RecursiveUp";
            }
            object = object2;
            if ("SizeDown".equals(object2)) {
                object = "RecursiveDown";
            }
        }
        return object;
    }

    private void F8(com.alphainventor.filemanager.file.n n8) {
        if (this.X0() && !this.d1()) {
            String string = n8.s();
            File file = n8.N();
            if (n8 instanceof ax.c3.k) {
                this.D9(n8);
            } else {
                this.C9(n8, file.lastModified());
            }
            if (ax.c3.w.a(this.o3(), n8, string, false)) {
                this.ja(n8, file);
                this.y8(file, string, string, true, true);
                return;
            }
            this.ba(n8, true);
        }
    }

    private void F9() {
        if (this.u3() != null && !this.u3().e0) {
            return;
        }
        this.W0.setParentLocation(this.G1);
    }

    private void G6(Menu menu, boolean bl) {
        if (this.f0() != null) {
            if (bl) {
                menu.setGroupVisible(2131362357, false);
                menu.setGroupVisible(2131362358, true);
                return;
            }
            menu.setGroupVisible(2131362357, true);
            menu.setGroupVisible(2131362358, false);
            menu = menu.findItem(2131362502);
            if (menu != null) {
                menu.setVisible(false);
            }
        }
    }

    private void H9(List<com.alphainventor.filemanager.file.n> list) {
        z.c(this.v3());
        a a8 = this.d1;
        if (a8 != null) {
            a8.clear();
            this.d1.f0();
            this.d1.addAll(list);
        }
        if ((a8 = this.e1) != null) {
            a8.clear();
            this.e1.f0();
            this.e1.addAll(list);
        }
        this.g1.f();
        this.R6();
        this.g8();
    }

    static /* synthetic */ boolean I5(E e8, boolean bl) {
        e8.R1 = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void I6(Intent intent, boolean bl, boolean bl2, String string) {
        Context context = this.b();
        if (context == null) {
            return;
        }
        int n8 = bl ? com.alphainventor.filemanager.service.b.f(context).h() : 0;
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = this.c1.N();
        ArrayList<Uri> arrayList2 = new ArrayList<Uri>();
        ArrayList<Long> arrayList3 = new ArrayList<Long>();
        int n9 = 0;
        while (true) {
            if (n9 >= arrayList.size()) {
                intent.putExtra("video_list", (Parcelable[])arrayList2.toArray(new Uri[0]));
                if (arrayList3.size() != arrayList2.size()) return;
                intent.putExtra("video_list.size", ax.u7.h.k(arrayList3));
                return;
            }
            com.alphainventor.filemanager.file.n n10 = arrayList.get(n9);
            if (n10.G() == ax.c3.z.e0) {
                if (bl) {
                    com.alphainventor.filemanager.service.b.f(context).c(n10);
                    arrayList2.add(HttpServerService.l(n8, n10));
                    arrayList3.add(n10.p());
                } else {
                    try {
                        Uri uri = ax.c3.u.L(n10, bl2);
                        context.grantUriPermission(string, uri, 65);
                        arrayList2.add(uri);
                        arrayList3.add(n10.p());
                    }
                    catch (Exception exception) {}
                }
            }
            ++n9;
        }
    }

    private e.a I7(int n8, com.alphainventor.filemanager.file.n n9, boolean bl) {
        Uri uri = bl ? ax.c3.u.L(n9, true) : HttpServerService.l(n8, n9);
        n9 = (n9 = this.c1.V(n9)) != null ? (bl ? ax.c3.u.L(n9, true) : HttpServerService.l(n8, n9)) : null;
        return new e.a(uri, (Uri)n9);
    }

    private void I8(com.alphainventor.filemanager.file.n n8, boolean bl) {
        if (this.X0() && !this.d1()) {
            String string;
            String string2 = string = n8.s();
            if (ax.Q2.f.n0(n8.P())) {
                string2 = string;
                if ("application/octet-stream".equals(string)) {
                    string2 = ax.c3.v.e(n8, "application/octet-stream");
                }
            }
            if (!bl && ax.t3.j.F(this.o3()) && ax.c3.A.M(string2, false) && !Q.K3(this.o3(), c.a.c0, n8, true)) {
                this.R8(n8);
                return;
            }
            if (!bl && ax.t3.j.D(this.o3()) && ax.c3.A.C(n8) && !Q.J3(this.o3(), n8, true)) {
                this.G8(n8);
                return;
            }
            string = HttpServerService.l(com.alphainventor.filemanager.service.b.f(this.b()).h(), n8);
            Intent intent = ax.c3.u.n((Uri)string, string2, false, false);
            if (ax.u3.B.K(this.o3(), intent)) {
                com.alphainventor.filemanager.service.b.f(this.b()).c(n8);
                HttpServerService.q(this.o3(), this.z3(), this.x3(), false, true, true, intent);
                this.C8((Uri)string, string2, string2, bl, false);
                return;
            }
            this.g7(n8, bl, null);
        }
    }

    private Intent J6(com.alphainventor.filemanager.file.n n8) {
        boolean bl;
        if (this.c1 == null) {
            return null;
        }
        boolean bl2 = ax.c3.B.e(n8);
        int n9 = com.alphainventor.filemanager.service.b.f(this.b()).h();
        Uri uri = bl2 ? ax.c3.u.L(n8, true) : HttpServerService.l(n9, n8);
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = this.c1.N();
        Object object = arrayList.iterator();
        while (object.hasNext()) {
            com.alphainventor.filemanager.file.n n10 = object.next();
            bl = Q.I3(this.o3(), uri) ? ax.c3.A.F(n10) : ax.c3.A.E(n10);
            if (bl) continue;
            object.remove();
        }
        object = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            ((ArrayList)object).add(this.I7(n9, arrayList.get(i8), bl2));
        }
        if (((ArrayList)object).size() == 0) {
            ((ArrayList)object).add(this.I7(n9, n8, bl2));
        }
        bl = ax.Q2.f.g0(this.z3());
        uri = ax.c3.w.j(this.o3(), uri, (ArrayList<e.a>)object, bl, true);
        if (!bl2) {
            com.alphainventor.filemanager.service.b.f(this.b()).c(n8);
            if (arrayList.size() > 0) {
                com.alphainventor.filemanager.service.b.f(this.b()).b(arrayList);
            }
            HttpServerService.q(this.o3(), this.z3(), this.x3(), false, true, false, (Intent)uri);
        }
        return uri;
    }

    private void J8(List<com.alphainventor.filemanager.file.n> object) {
        ax.Q2.a.i().m("menu_folder", "open_parent").c("loc", this.z3().I()).e();
        if (object.size() <= 0 || (object = object.get(0)).isDirectory()) {
            return;
        }
        if (!(object instanceof com.alphainventor.filemanager.file.C)) {
            ax.u3.b.f();
            return;
        }
        object = (y)object;
        this.P8(Uri.parse((String)ax.c3.B.U(((y)object).B0(), ((com.alphainventor.filemanager.file.n)object).T())));
    }

    private void K9(K k8, String string) {
        a a8 = this.d1;
        if (a8 != null) {
            a8.t0(k8, string);
        }
        if ((a8 = this.e1) != null) {
            a8.t0(k8, string);
        }
    }

    private void L6() {
        this.M6();
        n0 n02 = this.w1;
        if (n02 != null) {
            n02.e();
        }
    }

    private void L7(com.alphainventor.filemanager.file.n n8, boolean bl) {
        new x.g(this.w7(), n8, bl, new x.f(){
            final com.alphainventor.filemanager.file.n a;
            final E b;
            {
                this.b = e8;
                this.a = n8;
            }

            @Override
            public void a() {
                this.b.E4(2131951927, 1);
            }

            @Override
            public void b(boolean bl) {
                if (this.b.L3()) {
                    this.b.c4(false);
                    if (bl) {
                        this.b.ha(this.a);
                    }
                }
            }
        }).i(new Void[0]);
    }

    private void L8() {
        String string = this.s1 ? "/" : d0.r(this.n1);
        c.a a8 = this.f1.c(string);
        if (a8 != null) {
            this.d9();
            this.t8(a8.a(), a8.b(), a8.i());
            return;
        }
        this.Z3(string);
    }

    private void M6() {
        q q8 = this.u1;
        if (q8 != null) {
            q8.e();
        }
        if ((q8 = this.v1) != null) {
            q8.e();
        }
    }

    private boolean M7() {
        Object object = this.f1;
        object = object != null ? ((ax.V2.c)object).e() : null;
        if (object != null) {
            ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", this.z3().I()).c("by", "hw_back").e();
            if (!((c.a)object).j()) {
                this.t8(((c.a)object).a(), ((c.a)object).b(), ((c.a)object).i());
            } else {
                this.M8(((c.a)object).f(), ((c.a)object).e(), ((c.a)object).c(), ((c.a)object).h(), ((c.a)object).d(), ((c.a)object).g());
                this.t8(((c.a)object).a(), ((c.a)object).b(), ((c.a)object).i());
            }
            return true;
        }
        return false;
    }

    private void M8(String string, String string2, p p8, String string3, int n8, int n9) {
        if (this.f0() != null && string2 != null && !string2.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("query", string2);
            bundle.putString("ROOT", string);
            bundle.putSerializable("LOCATION", (Serializable)((Object)this.z3()));
            bundle.putInt("LOCATION_KEY", this.x3());
            bundle.putBoolean("INCLUDE_SUBFOLDER", this.Y1);
            bundle.putSerializable("FILTER_INFO", (Serializable)p8);
            bundle.putString("SORT_METHOD", string3);
            bundle.putInt("INDEX", n8);
            bundle.putInt("TOP", n9);
            this.h3();
            this.I0.d(string2);
            ((MainActivity)this.f0()).f2(this.A3(), bundle);
        }
    }

    private void M9() {
        ax.a3.n n8 = ax.a3.n.l3(0, 2131951929, 17039370, 0, true, true);
        ax.u3.B.d0(this.A0(), n8, "confirm_access_denied", true);
    }

    private void N6(boolean bl) {
        if (this.J1) {
            ax.s3.u.j(this.o3()).a(120);
            com.alphainventor.filemanager.file.n n8 = this.j1;
            if (n8 != null) {
                String string = this.n1;
                if (string != null && !d0.I(string, n8.E())) {
                    this.J1 = false;
                    this.V6();
                    return;
                }
                if (!ax.c3.B.H(this.j1)) {
                    this.pa();
                }
            }
            if (bl) {
                this.J1 = false;
                this.V6();
            }
        }
    }

    private void N7() {
        if (this.f1 == null) {
            this.f1 = this.x7();
        }
        if (this.n1 == null) {
            this.n1 = this.A3().e();
            this.o1 = false;
        }
    }

    private void N9(String object) {
        if (this.f0() == null) {
            return;
        }
        f f8 = this.f0();
        String string = ax.w3.h.b((Context)f8, (String)object);
        Object object2 = this.D3(true);
        if (ax.w3.d.w((Context)f8, (String)object)) {
            object2 = ax.u3.B.T((View)object2, string, 0);
            ((Snackbar)object2).q0(2131951915, new ax.g3.c(this, (String)object){
                final String c;
                final E d;
                {
                    this.d = e8;
                    this.c = string;
                }

                public static /* synthetic */ void b(T t8, String string, Integer object) {
                    if (t8.d.b() != null) {
                        t8.d.W9(false);
                        if ((Integer)object == ax.w3.d.j) {
                            if (ax.P2.b.j()) {
                                object = t8.d;
                                ((ax.d3.n)object).G4(((Fragment)object).N0(2131952050, string), 2, 2131952292, new ax.g3.c(t8){
                                    final T c;
                                    {
                                        this.c = t8;
                                    }

                                    @Override
                                    public void a(View view) {
                                        if (this.c.d.f0() != null) {
                                            ax.u3.B.Y((Context)this.c.d.f0());
                                        }
                                    }
                                });
                            } else {
                                object = t8.d;
                                ((ax.d3.n)object).F4(((Fragment)object).N0(2131952050, string), 1);
                            }
                            t8.d.j9();
                            return;
                        }
                        if ((Integer)object == ax.w3.d.k) {
                            t8.d.E4(2131951927, 0);
                        }
                    }
                }

                @Override
                public void a(View view) {
                    if (this.d.f0() == null) {
                        return;
                    }
                    this.d.W9(true);
                    new ax.w3.d((Context)this.d.f0(), new G(this, this.c)).i(new Void[0]);
                }
            });
            object = object2;
        } else {
            object = ax.u3.B.T((View)object2, string, 0);
        }
        this.D4((Snackbar)object);
    }

    static /* synthetic */ String O5(E e8, String string) {
        e8.b2 = string;
        return string;
    }

    private void P6() {
        if (!this.L3()) {
            ax.Ha.b b8 = ax.Ha.c.h().d("STATCHK").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RESUMED:");
            stringBuilder.append(this.e1());
            b8.g(stringBuilder.toString()).h();
        }
    }

    private void P7() {
        if (ax.Q2.f.g0(this.z3())) {
            if (d0.E(this.i1)) {
                this.Y1 = true;
                this.Z1 = false;
                return;
            }
            this.Y1 = false;
            this.Z1 = false;
            return;
        }
        if (!this.a2) {
            this.Y1 = true;
            this.Z1 = true;
            this.a2 = true;
        }
    }

    public static /* synthetic */ void Q4(E e8, Bundle bundle) {
        e8.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            e8.n8();
        }
    }

    static /* synthetic */ q0 Q5(E e8, q0 q02) {
        e8.v1 = q02;
        return q02;
    }

    private void Q6() {
        a a8 = this.d1;
        if (a8 != null) {
            a8.clear();
        }
        if ((a8 = this.e1) != null) {
            a8.clear();
        }
        this.g1.f();
        this.R6();
        this.g8();
    }

    private void Q7(com.alphainventor.filemanager.file.n n8) {
        block4: {
            block5: {
                if (this.f0() == null || !this.X0()) break block4;
                if (!(n8 instanceof ax.c3.k)) {
                    ax.u3.b.f();
                    return;
                }
                if (!d.V(n8.A()) || !com.alphainventor.filemanager.shizuku.c.t().C()) break block5;
                com.alphainventor.filemanager.shizuku.c.t().m(new i.a(){
                    final com.alphainventor.filemanager.file.n a;
                    final E b;
                    {
                        this.b = e8;
                        this.a = n8;
                    }

                    @Override
                    public void a(boolean bl) {
                    }

                    @Override
                    public void b() {
                        if (this.b.X0()) {
                            new s0(this.b, (ax.c3.k)this.a).i(new String[0]);
                        }
                    }

                    @Override
                    public void c() {
                    }
                });
                if (com.alphainventor.filemanager.shizuku.c.t().A()) break block4;
            }
            new s0(this, (ax.c3.k)n8).i(new String[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Q8(y y8) {
        Exception exception2;
        block5: {
            Intent intent;
            block4: {
                block3: {
                    y8 = com.alphainventor.filemanager.file.g.m(this.A3(), y8.M0());
                    try {
                        intent = new Intent();
                        if (!ax.X2.Q.L0() || !ax.u3.B.L(this.o3(), "com.google.android.documentsui")) break block3;
                        intent.setPackage("com.google.android.documentsui");
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                if (ax.u3.B.L(this.o3(), "com.android.documentsui")) {
                    intent.setPackage("com.android.documentsui");
                }
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType((Uri)y8, "vnd.android.document/root");
            intent.setFlags(0x8000000);
            ax.c3.u.p0(this, intent);
            return;
        }
        exception2.printStackTrace();
    }

    public static /* synthetic */ void R4(E e8, boolean bl, Bundle bundle) {
        block3: {
            block4: {
                block5: {
                    block6: {
                        block7: {
                            block2: {
                                e8.getClass();
                                int n8 = bundle.getInt("result_selection", -1);
                                if (n8 == -1) break block2;
                                if (n8 == 0) break block3;
                                if (n8 == 1) break block4;
                                if (n8 == 2) break block5;
                                if (n8 == 3) break block6;
                                if (n8 == 4) break block7;
                            }
                            return;
                        }
                        e8.p8(V.g0, bl);
                        return;
                    }
                    e8.p8(V.f0, bl);
                    return;
                }
                e8.p8(V.e0, bl);
                return;
            }
            e8.p8(V.d0, bl);
            return;
        }
        e8.p8(V.c0, bl);
    }

    private void R6() {
        this.O1 = -1;
        this.V1 = 0L;
        this.W1.setLength(0);
    }

    private void R8(com.alphainventor.filemanager.file.n n8) {
        Intent intent = this.J6(n8);
        if (intent != null) {
            this.B8(intent, 0, false, n8.A());
        }
    }

    public static /* synthetic */ void S4(E e8, Bundle bundle) {
        e8.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            e8.I3();
        }
    }

    private void S8(List<com.alphainventor.filemanager.file.n> list) {
        ax.Q2.a.i().m("menu_folder", "open_with").c("loc", this.z3().I()).e();
        com.alphainventor.filemanager.file.n n8 = list.get(0);
        if (n8.isDirectory()) {
            return;
        }
        if (ax.c3.B.P(n8)) {
            this.F8(n8);
            return;
        }
        if (ax.c3.B.J(n8)) {
            this.w8((com.alphainventor.filemanager.file.i)n8);
            return;
        }
        if (ax.c3.A.G(n8)) {
            this.D9(n8);
            this.I8(n8, true);
            return;
        }
        list = new ArrayList<com.alphainventor.filemanager.file.n>();
        ((ArrayList)list).add(n8);
        this.f3(this.w7(), list, new n.p(){
            final com.alphainventor.filemanager.file.n a;
            final E b;
            {
                this.b = e8;
                this.a = n8;
            }

            @Override
            public void a() {
                if (!this.b.X0()) {
                    return;
                }
                this.b.F8(this.a);
            }
        });
    }

    private void S9(Throwable object, boolean bl) {
        this.ka(true);
        this.R0.setText(2131951945);
        if (bl && this.z3() == ax.Q2.f.p0 && this.n1 == null) {
            this.S0.setText(2131952453);
            return;
        }
        if (object instanceof ax.b3.e) {
            if (ax.t3.j.o(this.o3())) {
                ax.Ha.c.h().f().d("Debug Mode : Loading Error : Access Denied").l((Throwable)object).h();
                TextView textView = this.S0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.M0(2131951929));
                stringBuilder.append(" : ");
                stringBuilder.append(((Throwable)object).getMessage());
                textView.setText((CharSequence)stringBuilder.toString());
            } else {
                this.S0.setText(2131951929);
            }
            if (this.T0 != null) {
                if (ax.X2.Q.L() && (object = this.i1) instanceof y && ((y)object).a1()) {
                    if (com.alphainventor.filemanager.shizuku.c.t().C()) {
                        this.T0.setVisibility(0);
                        this.T0.setText(2131952365);
                        this.T0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                            final E c;
                            {
                                this.c = e8;
                            }

                            @Override
                            public void a(View view) {
                                if (this.c.X0()) {
                                    com.alphainventor.filemanager.shizuku.c.t().F(this.c);
                                }
                            }
                        });
                        return;
                    }
                    if (ax.X2.J.D(this.o3())) {
                        this.T0.setVisibility(8);
                        return;
                    }
                    if (this.z3() != ax.Q2.f.t0) {
                        object = (y)this.i1;
                        this.T0.setVisibility(0);
                        this.T0.setOnClickListener((View.OnClickListener)new ax.g3.c(this, (y)object){
                            final y c;
                            final E d;
                            {
                                this.d = e8;
                                this.c = y8;
                            }

                            @Override
                            public void a(View object) {
                                object = this.c;
                                if (object != null) {
                                    this.d.Q8((y)object);
                                }
                            }
                        });
                        return;
                    }
                } else {
                    this.T0.setVisibility(8);
                }
            }
            return;
        }
        if (object instanceof ax.b3.t) {
            if (ax.X2.P.a()) {
                this.S0.setText(2131951929);
                return;
            }
            this.S0.setText(2131951939);
            return;
        }
        if (object instanceof ax.b3.g) {
            this.S0.setText(2131952047);
            return;
        }
        if (ax.Q2.f.n0(this.z3())) {
            if (object != null && ax.t3.j.o(this.o3())) {
                ax.Ha.c.h().f().d("Debug Mode : Loading Error : Check network").l((Throwable)object).h();
                CharSequence charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.M0(2131951931));
                ((StringBuilder)charSequence).append(":\n");
                ((StringBuilder)charSequence).append(((Throwable)object).getMessage());
                String string = ((StringBuilder)charSequence).toString();
                charSequence = string;
                if (((Throwable)object).getCause() != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append("\n");
                    ((StringBuilder)charSequence).append(((Throwable)object).getCause().getMessage());
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                this.S0.setText(charSequence);
                return;
            }
            this.S0.setText(2131951931);
            return;
        }
        if (object != null && ax.t3.j.o(this.o3())) {
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Cause:");
            ((StringBuilder)charSequence).append(((Throwable)object).getMessage());
            String string = ((StringBuilder)charSequence).toString();
            charSequence = string;
            if (((Throwable)object).getCause() != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("\n");
                ((StringBuilder)charSequence).append(((Throwable)object).getCause().getMessage());
                charSequence = ((StringBuilder)charSequence).toString();
            }
            this.S0.setText(charSequence);
            return;
        }
        this.S0.setText((CharSequence)"");
    }

    private void T6() {
        for (int i8 = 0; i8 < this.N0.getChildCount(); ++i8) {
            ((a.c)this.N0.getChildAt(i8).getTag()).t();
        }
    }

    private void T8() {
        this.L1 = true;
    }

    static /* synthetic */ boolean U5(E e8, boolean bl) {
        e8.x1 = bl;
        return bl;
    }

    private boolean U7(e.e object) {
        object = ((e.e)object).c;
        return object != null && this.i1 != null && !((com.alphainventor.filemanager.file.n)object).Q().equals(this.i1.Q());
    }

    private void U9(String string) {
        int n8 = this.c1.O(string);
        if (n8 >= 0) {
            this.Z9(n8);
        }
    }

    private void V6() {
        if (this.j1 == null) {
            return;
        }
        this.j1 = null;
        ax.o3.e.b().a();
        this.k1 = -1L;
        if (this.b() != null) {
            FileObserverService.b(this.b());
        }
        ax.o3.b.j().n();
    }

    private boolean V7() {
        return this.N0.getCheckedItemCount() > 1;
    }

    private void W6(List<com.alphainventor.filemanager.file.n> object) {
        if (this.X9(this.A3())) {
            return;
        }
        Object object2 = a.e.a(object);
        ax.Q2.a.i().m("menu_folder", "compress").c("loc", this.z3().I()).c("type", (String)object2).e();
        object2 = ax.W2.k.n();
        ((ax.W2.k)object2).k(this.w7(), (List<com.alphainventor.filemanager.file.n>)object, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                super.a(b8, string, string2, arrayList, object);
                this.b.j9();
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        });
        object = m.m3(((ax.W2.k)object2).l());
        ((m)object).p3(new m.f(){
            final ax.W2.k a;
            final E b;
            {
                this.b = e8;
                this.a = k8;
            }

            @Override
            public void a(String string, k.a a8) {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    this.a.p(string);
                    this.a.o(a8);
                    try {
                        this.b.l(this.a, true);
                        return;
                    }
                    catch (ax.b3.c c8) {
                        this.b.J4(2131951927, 1);
                    }
                }
            }
        });
        this.A((e)object, "compressFileName", true);
    }

    private boolean W7() {
        Object object = this.v3();
        if (object == null) {
            return false;
        }
        return (object = ((com.alphainventor.filemanager.activity.b)object).h0()) != null && ((ax.x3.d)object).k() == 0;
    }

    public static boolean X7(Context context, com.alphainventor.filemanager.file.n n8) {
        boolean bl;
        if (TextUtils.isEmpty((CharSequence)n8.A())) {
            return true;
        }
        if (ax.t3.j.C(context) && ax.c3.A.B(n8, true)) {
            return false;
        }
        if (ax.t3.j.D(context) && ax.c3.A.C(n8)) {
            return false;
        }
        if (ax.t3.j.E(context) && ax.c3.A.D(n8)) {
            return false;
        }
        if (ax.t3.j.F(context) && ax.c3.A.E(n8)) {
            return false;
        }
        if (ax.c3.A.p(n8)) {
            return false;
        }
        if (ax.X2.Q.H1() && ax.c3.A.Q(n8)) {
            return false;
        }
        String string = n8.s();
        if (!"application/octet-stream".equals(string) && !TextUtils.isEmpty((CharSequence)string)) {
            bl = false;
        } else {
            string = ax.c3.v.e(n8, "application/octet-stream");
            bl = true;
        }
        if ("application/octet-stream".equals(string) && !ax.c3.B.C(context, n8)) {
            return true;
        }
        if (ax.c3.w.a(context, n8, string, false)) {
            return false;
        }
        if (!bl) {
            String string2 = ax.c3.v.e(n8, "application/octet-stream");
            if (string != null && !string.equals(string2) && ax.c3.w.a(context, n8, string2, false)) {
                return false;
            }
        }
        return true;
    }

    private void X8() {
        int n8;
        int n9;
        AbsListView absListView = this.N0;
        GridView gridView = this.L0;
        if (absListView == gridView && !gridView.isInTouchMode() && !this.R1 && this.L0.getChildCount() != 0 && (n9 = this.L0.getSelectedItemPosition()) != -1 && (gridView = this.L0.getChildAt(n9 - (n8 = this.L0.getFirstVisiblePosition()))) != null) {
            this.R1 = true;
            this.S1 = n9;
            this.T1 = gridView.getTop();
            this.U1 = gridView.getHeight();
            this.L0.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this){
                final E a;
                {
                    this.a = e8;
                }

                public void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
                    this.a.L0.removeOnLayoutChangeListener((View.OnLayoutChangeListener)this);
                    n8 = this.a.S1;
                    n10 = this.a.T1;
                    n9 = this.a.L0.getPaddingTop();
                    n13 = this.a.U1;
                    E.I5(this.a, false);
                    E.E5(this.a, -1);
                    if (this.a.K3() && n8 >= 0 && n8 < this.a.L0.getCount()) {
                        n11 = this.a.L0.getHeight();
                        n12 = this.a.L0.getPaddingBottom();
                        n9 = Math.max(this.a.L0.getPaddingTop(), Math.min(n10 - n9, n11 - n12 - n13));
                        this.a.L0.post(new Runnable(){
                            final int c0;
                            final P d0;
                            final int q;
                            {
                                this.d0 = p8;
                                this.q = n8;
                                this.c0 = n9;
                            }

                            @Override
                            public void run() {
                                if (this.d0.a.f0() == null) {
                                    return;
                                }
                                this.d0.a.L0.setSelectionFromTop(this.q, this.c0);
                            }
                        });
                    }
                }
            });
        }
    }

    private boolean X9(K k8) {
        if (x.C1(this.o3(), k8, null)) {
            this.o9(3, k8, null, false);
            return true;
        }
        return false;
    }

    static /* synthetic */ com.alphainventor.filemanager.file.n Y4(E e8, com.alphainventor.filemanager.file.n n8) {
        e8.i1 = n8;
        return n8;
    }

    private void Y6() {
        if (this.Z0()) {
            return;
        }
        if (this.S7()) {
            this.h9();
            return;
        }
        this.X6();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Intent Z6(com.alphainventor.filemanager.file.n arrayList) {
        int n8;
        String string;
        if (this.o1) {
            string = this.n1;
            ArrayList<com.alphainventor.filemanager.file.n> arrayList2 = this.c1.P();
            int n9 = -1;
            for (n8 = 0; n8 < arrayList2.size(); ++n8) {
                com.alphainventor.filemanager.file.n n10 = (com.alphainventor.filemanager.file.n)arrayList2.get(n8);
                if (!((com.alphainventor.filemanager.file.n)((Object)arrayList)).E().equals(n10.E())) continue;
                n9 = n8;
            }
            if (n9 != -1) {
                arrayList = arrayList2;
                n8 = n9;
                return ax.c3.w.c((Context)this.f0(), this.A3(), string, arrayList, n8, true);
            }
            arrayList2 = new ArrayList();
            arrayList2.add((com.alphainventor.filemanager.file.n)((Object)arrayList));
            arrayList = arrayList2;
        } else {
            string = ((com.alphainventor.filemanager.file.n)((Object)arrayList)).E();
            ArrayList<ArrayList<Object>> arrayList3 = new ArrayList<ArrayList<Object>>();
            arrayList3.add(arrayList);
            arrayList = arrayList3;
        }
        n8 = 0;
        return ax.c3.w.c((Context)this.f0(), this.A3(), string, arrayList, n8, true);
    }

    private boolean Z7(int n8) {
        return n8 == 2131362542 || n8 == 2131362540 || n8 == 2131362541;
        {
        }
    }

    private void Z9(int n8) {
        int n9 = this.N0.getHeight() / 2;
        AbsListView absListView = this.N0;
        if (!(absListView instanceof ListView) && absListView.isInTouchMode()) {
            this.N0.setSelection(n8);
            this.N0.post(new Runnable(){
                final E c0;
                final int q;
                {
                    this.c0 = e8;
                    this.q = n8;
                }

                @Override
                public void run() {
                    this.c0.N0.scrollListBy(this.q * -1);
                }
            });
            return;
        }
        this.N0.setSelectionFromTop(n8, n9);
    }

    static /* synthetic */ boolean a5(E e8, boolean bl) {
        e8.o1 = bl;
        return bl;
    }

    static /* synthetic */ String a6(E e8, String string) {
        e8.P0 = string;
        return string;
    }

    private boolean a9(int n8) {
        char c8 = (char)n8;
        long l8 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        n8 = this.N0.getSelectedItemPosition();
        int n9 = -1;
        if (n8 < 0 || this.O1 != n8) {
            n8 = -1;
        }
        int n10 = n9;
        if (this.W1.length() == 1) {
            n10 = n9;
            if (this.W1.charAt(0) == c8) {
                n10 = n9;
                if (n8 >= 0) {
                    n10 = n9 = this.c1.M(n8 + 1, String.valueOf(c8));
                    if (n9 >= 0) {
                        this.W1.setLength(0);
                        n10 = n9;
                    }
                }
            }
        }
        n9 = n10;
        if (n10 < 0) {
            n10 = n8;
            if (n8 < 0) {
                n10 = 0;
            }
            if (this.V1 < l8 - 3000L) {
                this.W1.setLength(0);
                n10 = 0;
            }
            stringBuilder.append(this.W1);
            stringBuilder.append(c8);
            n9 = n8 = this.c1.M(n10, stringBuilder.toString());
            if (n8 < 0) {
                n9 = n8;
                if (this.W1.length() != 0) {
                    n9 = n8;
                    if (this.V1 < l8 - 1500L) {
                        this.W1.setLength(0);
                        n9 = this.c1.M(0, String.valueOf(c8));
                    }
                }
            }
        }
        this.V1 = System.currentTimeMillis();
        if (n9 >= 0) {
            this.Z9(n9);
            this.W1.append(c8);
            this.O1 = n9;
            return true;
        }
        return false;
    }

    private void b7(List<com.alphainventor.filemanager.file.n> list, int n8) {
        CharSequence charSequence;
        if (!this.a8()) {
            return;
        }
        String string = a.e.a(list);
        if (this.H1) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.z3().I());
            ((StringBuilder)charSequence).append("-analysis");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.z3().I();
        }
        ax.Q2.a.i().m("menu_folder", "delete").c("loc", (String)charSequence).c("type", string).e();
        this.c7(list, n8);
    }

    private void ba(com.alphainventor.filemanager.file.n n8, boolean bl) {
        this.t1 = n8;
        this.A(ax.a3.J.i3(), "open_as", true);
        J.c(this, "request_open_as", new B(this, bl));
    }

    static /* synthetic */ String d6(E e8) {
        return e8.c2;
    }

    private boolean d8(AbsListView absListView, int n8, int n9, KeyEvent keyEvent) {
        int n10;
        if (this.P1 == -1) {
            n10 = absListView.getSelectedItemPosition();
            if (n10 == -1) {
                return false;
            }
            this.P1 = n10;
            this.Q1 = n10;
            absListView.setItemChecked(n10, true);
        } else {
            n10 = this.Q1;
        }
        int n11 = n8 + n10;
        if (n11 >= 0 && n11 < absListView.getCount()) {
            int n12 = Math.min(this.P1, n10);
            int n13 = Math.max(this.P1, n10);
            int n14 = Math.min(this.P1, n11);
            int n15 = Math.max(this.P1, n11);
            n8 = n12;
            while (true) {
                if (n8 > n13) break;
                if (n8 < n14 || n8 > n15) {
                    absListView.setItemChecked(n8, false);
                }
                ++n8;
            }
            for (n10 = n14; n10 <= n15; ++n10) {
                if (n10 >= n12 && n10 <= n13) continue;
                absListView.setItemChecked(n10, true);
            }
            this.Q1 = n11;
            this.e8(absListView, n11, n9, keyEvent);
        }
        return true;
    }

    private void d9() {
        if (this.o1) {
            int n8 = this.N0.getFirstVisiblePosition();
            AbsListView absListView = this.N0;
            int n9 = 0;
            if ((absListView = absListView.getChildAt(0)) != null) {
                n9 = absListView.getTop() - this.N0.getPaddingTop();
            }
            this.f1.f(this.i1, n8, n9);
        }
    }

    static /* synthetic */ String e6(E e8, String string) {
        e8.c2 = string;
        return string;
    }

    /*
     * Unable to fully structure code
     */
    private void e8(AbsListView var1_1, int var2_2, int var3_3, KeyEvent var4_4) {
        block5: {
            block7: {
                block6: {
                    if (!(var1_1 instanceof GridView)) break block5;
                    var5_5 = var1_1.getPaddingTop();
                    var3_3 = var1_1.getFirstVisiblePosition();
                    var6_6 = var1_1.getLastVisiblePosition();
                    if (var2_2 < var3_3 || var2_2 > var6_6) break block6;
                    var4_4 = var1_1.getChildAt(var2_2 - var3_3);
                    if (var4_4 == null) ** GOTO lbl-1000
                    var5_5 = var4_4.getTop();
                    var3_3 = var4_4.getHeight();
                    break block7;
                }
                if (var2_2 > var6_6 && var1_1.getChildCount() > 0) {
                    var3_3 = var1_1.getChildAt(var1_1.getChildCount() - 1).getHeight();
                    var5_5 = Math.max(var1_1.getPaddingTop(), var1_1.getHeight() - var1_1.getPaddingBottom() - var3_3);
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = 0;
                }
            }
            var6_6 = var3_3;
            if (var3_3 == 0) {
                var6_6 = var3_3;
                if (var1_1.getChildCount() > 0) {
                    var6_6 = var1_1.getChildAt(0).getHeight();
                }
            }
            if (this.R1) {
                this.S1 = var2_2;
                this.T1 = var5_5;
                this.U1 = var6_6;
                return;
            }
            var1_1.setSelectionFromTop(var2_2, var5_5);
            return;
        }
        var1_1.onKeyDown(var3_3, new KeyEvent(var4_4.getDownTime(), var4_4.getEventTime(), var4_4.getAction(), var3_3, var4_4.getRepeatCount(), 0, var4_4.getDeviceId(), var4_4.getScanCode(), var4_4.getFlags(), var4_4.getSource()));
    }

    private void ea(boolean bl) {
        if (bl) {
            this.H0.setVisibility(0);
            this.I0.g();
            this.G0.setAdapter(this.I0.f());
            return;
        }
        this.H0.setVisibility(8);
    }

    static /* synthetic */ String f6(E e8, String string) {
        e8.d2 = string;
        return string;
    }

    private void f7(String string) {
        if (string != null && !string.isEmpty()) {
            this.L6();
            this.M8(this.C3(), string, null, null, -1, -1);
        }
        this.X0.setText((CharSequence)"");
        this.y1.collapseActionView();
        ((InputMethodManager)this.f0().getSystemService("input_method")).hideSoftInputFromWindow(this.X0.getWindowToken(), 2);
    }

    private void f9(List<com.alphainventor.filemanager.file.n> object) {
        if (this.f0() == null) {
            return;
        }
        if (!ax.Q2.f.Y(this.z3())) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid quick share location:");
            ((StringBuilder)object).append(this.z3().I());
            ax.u3.b.g(((StringBuilder)object).toString());
            this.E4(2131951927, 1);
            return;
        }
        if (QuickShareProvider.c() == null) {
            this.E4(2131951927, 1);
            return;
        }
        new o0(this, (List<com.alphainventor.filemanager.file.n>)object).i(new String[0]);
    }

    static /* synthetic */ boolean g6(E e8) {
        return e8.J0;
    }

    private void g7(com.alphainventor.filemanager.file.n n8, boolean bl, Intent intent) {
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
        arrayList.add(n8);
        this.f3(this.w7(), arrayList, new n.p(){
            final Intent a;
            final com.alphainventor.filemanager.file.n b;
            final boolean c;
            final E d;
            {
                this.d = e8;
                this.a = intent;
                this.b = n8;
                this.c = bl;
            }

            @Override
            public void a() {
                if (!this.d.X0()) {
                    return;
                }
                if (this.a != null) {
                    E e8 = this.d;
                    com.alphainventor.filemanager.file.n n8 = this.b;
                    e8.C9(n8, n8.N().lastModified());
                    e8 = this.d;
                    n8 = this.b;
                    e8.ja(n8, n8.N());
                    this.d.B8(this.a, 0, false, this.b.A());
                    return;
                }
                this.d.E8(this.b, null, this.c);
            }
        });
    }

    private void g8() {
        a a8 = this.d1;
        if (a8 != null) {
            a8.notifyDataSetChanged();
        }
        if ((a8 = this.e1) != null) {
            a8.notifyDataSetChanged();
        }
    }

    private void g9() {
        int n8;
        this.e4(false);
        if (this.K3()) {
            if (this.Y0.k() != 0) {
                this.X8();
            }
            this.Y0.y(0);
            this.Y0.A();
            this.N0.post(new Runnable(this){
                final E q;
                {
                    this.q = e8;
                }

                @Override
                public void run() {
                    if (this.q.K3()) {
                        int n8 = this.q.g3();
                        int n9 = this.q.Y0.i();
                        int n10 = n8;
                        if (n8 < 0) {
                            n10 = -1;
                        }
                        n8 = n9;
                        if (n9 < 0) {
                            n8 = -1;
                        }
                        this.q.K0.setNextFocusLeftId(n10);
                        this.q.L0.setNextFocusLeftId(n10);
                        this.q.K0.setNextFocusRightId(n8);
                        this.q.L0.setNextFocusRightId(n8);
                    }
                }
            });
            return;
        }
        if (!this.W7() || (n8 = this.q7()) < 0) {
            n8 = -1;
        }
        int n9 = this.W0.getParentButtonId();
        this.K0.setNextFocusLeftId(n9);
        this.L0.setNextFocusLeftId(n9);
        this.K0.setNextFocusRightId(n8);
        this.L0.setNextFocusRightId(n8);
        this.Y0.y(8);
    }

    private void ga(e.e e8) {
        com.alphainventor.filemanager.file.o o8;
        if (this.b() == null) {
            return;
        }
        if (e8 == null) {
            ax.u3.b.f();
            return;
        }
        ax.x3.x x8 = new ax.x3.x((Context)new ax.s.c(this.b(), 2132017450));
        if (this.U7(e8)) {
            x8.b(2131231145, 2131952294, new ax.g3.c(this, e8){
                final e.e c;
                final E d;
                {
                    this.d = e8;
                    this.c = e9;
                }

                @Override
                public void a(View view) {
                    view = Uri.parse((String)this.c.c.Q());
                    this.d.P8((Uri)view);
                }
            });
        }
        if (e8.a && (o8 = e8.b) != null && o8.a()) {
            x8.b(2131231097, 2131952252, new ax.g3.c(this, e8){
                final e.e c;
                final E d;
                {
                    this.d = e8;
                    this.c = e9;
                }

                @Override
                public void a(View object) {
                    if (this.d.f0() == null) {
                        return;
                    }
                    ax.W2.c c8 = ax.W2.c.q();
                    object = this.c;
                    c8.m(object.b, object.c, object.d, false);
                    this.d.J3();
                    this.d.e4(true);
                }
            });
        }
        if ((o8 = e8.b) != null) {
            o8.n0();
        }
        x8.c(this.V0, 0, -ax.u3.B.e(this.b(), 8), new PopupWindow.OnDismissListener(){
            final e.e a;
            final E b;
            {
                this.b = e8;
                this.a = e9;
            }

            public void onDismiss() {
                com.alphainventor.filemanager.file.o o8 = this.a.b;
                if (o8 != null) {
                    o8.k0(false);
                }
            }
        });
    }

    static /* synthetic */ void h6(E e8, List list) {
        e8.H9(list);
    }

    private void h7(boolean bl) {
        this.D0.setEnabled(bl);
        this.E0.setEnabled(bl);
        this.C0.setEnabled(bl);
        this.W0.setActionButtonEnabled(bl);
    }

    private void ha(com.alphainventor.filemanager.file.n n8) {
        if (this.b() == null) {
            return;
        }
        String string = this.N0(2131952346, n8.B());
        this.D4(ax.u3.B.O((View)this.U0, string, 0, 2131952309, false, new ax.g3.c(this, n8){
            final com.alphainventor.filemanager.file.n c;
            final E d;
            {
                this.d = e8;
                this.c = n8;
            }

            @Override
            public void a(View view) {
                this.d.L7(this.c, false);
            }
        }));
    }

    static /* synthetic */ Set i6(E e8) {
        return e8.e2;
    }

    private void i9() {
        MediaControllerCompat mediaControllerCompat;
        if (this.f0() != null && (mediaControllerCompat = MediaControllerCompat.c(this.f0())) != null) {
            MediaControllerCompat mediaControllerCompat2 = this.g2;
            if (mediaControllerCompat2 != null && mediaControllerCompat2 != mediaControllerCompat) {
                this.oa();
            }
            this.g2 = mediaControllerCompat;
            mediaControllerCompat.j(this.m2);
        }
    }

    static /* synthetic */ void j6(E e8, K k8, String string) {
        e8.K9(k8, string);
    }

    private void j7(String object) {
        String string = object;
        if (!d0.B((String)object)) {
            ax.Ha.c.h().d("Open Not Normalized Path").j().g(object).h();
            string = d0.U((String)object);
        }
        if ((object = this.w1) != null && !((q)object).isCancelled()) {
            this.w1.e();
        }
        if (!this.S7() && !ax.Q2.f.D0(this.z3())) {
            ax.Ha.b b8 = ax.Ha.c.h().b("!! NOT CONNECT EXECUTE OPEN TASK !!").j();
            object = new StringBuilder();
            ((StringBuilder)object).append("location: ");
            ((StringBuilder)object).append((Object)this.z3());
            ((StringBuilder)object).append(",");
            ((StringBuilder)object).append(this.e1());
            ((StringBuilder)object).append(",");
            ((StringBuilder)object).append(this.S3());
            b8.g(((StringBuilder)object).toString()).h();
        }
        this.w1 = object = new n0(this, string);
        ((q)object).i(new String[0]);
    }

    private void ja(com.alphainventor.filemanager.file.n n8, File file) {
        if (ax.Q2.f.n0(n8.P()) && ax.c3.A.u(n8)) {
            FileObserverService.a(this.b(), n8, file);
        }
    }

    static /* synthetic */ void k6(E e8, K k8, String string) {
        e8.z9(k8, string);
    }

    private void k7(List<com.alphainventor.filemanager.file.n> list) {
        ax.Q2.a.i().m("menu_folder", "extract").c("loc", this.z3().I()).e();
        ax.a3.x x8 = new ax.a3.x();
        Bundle bundle = new Bundle();
        this.q1 = list;
        if (list.isEmpty()) {
            ax.u3.b.f();
            return;
        }
        if (list.size() == 1) {
            this.r1 = list.get(0).T();
        } else {
            String string;
            this.r1 = string = this.n1;
            if (TextUtils.isEmpty((CharSequence)string)) {
                ax.u3.b.g("Current Path is Null");
                return;
            }
        }
        bundle.putString("fileName", list.get(0).B());
        bundle.putInt("numArchiveFiles", list.size());
        int n8 = !this.a8() ? 2 : (ax.c3.B.D(list) ? 0 : 1);
        bundle.putInt("showOption", n8);
        x8.v2(bundle);
        x8.D2(this, 0);
        this.A(x8, "extract", true);
    }

    private void ka(boolean bl) {
        if (bl) {
            this.F0.setVisibility(4);
            this.C0.setVisibility(0);
            return;
        }
        this.F0.setVisibility(0);
        this.C0.setVisibility(4);
    }

    static /* synthetic */ void l6(E e8, String string) {
        e8.U9(string);
    }

    private void l9() {
        if (this.i1 != null) {
            b.k().v(this.i1);
        }
    }

    private void la(int n8) {
        this.r9();
        this.D0.setVisibility(8);
        this.E0.setVisibility(8);
        if (this.z3() == ax.Q2.f.l1) {
            a a8;
            this.N0 = this.K0;
            this.F0 = this.D0;
            this.c1 = a8 = this.d1;
            a8.o0(20);
        } else if (n8 == 0) {
            a a9;
            this.N0 = this.K0;
            this.F0 = this.D0;
            this.c1 = a9 = this.d1;
            a9.o0(0);
        } else if (n8 == 1) {
            a a10;
            this.N0 = this.K0;
            this.F0 = this.D0;
            this.c1 = a10 = this.d1;
            a10.o0(1);
        } else if (n8 == 10) {
            a a11;
            this.N0 = this.K0;
            this.F0 = this.D0;
            this.c1 = a11 = this.d1;
            a11.o0(10);
        } else if (n8 == 2) {
            a a12;
            this.N0 = this.L0;
            this.F0 = this.E0;
            this.c1 = a12 = this.e1;
            a12.o0(2);
        } else if (n8 == 12) {
            a a13;
            this.N0 = this.L0;
            this.F0 = this.E0;
            this.c1 = a13 = this.e1;
            a13.o0(12);
        } else if (n8 == 16) {
            a a14;
            this.N0 = this.L0;
            this.F0 = this.E0;
            this.c1 = a14 = this.e1;
            a14.o0(16);
        }
        this.F0.setVisibility(0);
        this.N0.setAdapter((ListAdapter)this.c1);
        this.O0 = n8;
        this.y9(this.v3().i0().x);
    }

    private void m9(List<com.alphainventor.filemanager.file.n> list) {
        if (list.size() <= 0 || !this.a8()) {
            return;
        }
        String string = a.e.a(list);
        ax.Q2.a.i().m("menu_folder", "rename").c("loc", this.z3().I()).c("type", string).e();
        ax.W2.z.o(this.w7(), this.n1, list, this, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                super.a(b8, string, string2, arrayList, object);
                this.b.j9();
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        }, new z.c(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public boolean a(String string) {
                return this.a.n1 != null && this.a.c1.X(string);
            }
        });
    }

    private void ma(List<com.alphainventor.filemanager.file.n> object) {
        if (object.size() < 1) {
            return;
        }
        object = object.get(0);
        this.L7((com.alphainventor.filemanager.file.n)object, object.h() ^ true);
    }

    static /* synthetic */ boolean n5(E e8, boolean bl) {
        e8.Y1 = bl;
        return bl;
    }

    static /* synthetic */ void n6(E e8, String string) {
        e8.u9(string);
    }

    static /* synthetic */ String o6(E e8) {
        return e8.l1;
    }

    private void o7(List<com.alphainventor.filemanager.file.n> list, boolean bl) {
        if (bl && !this.a8()) {
            return;
        }
        this.F6(this.i1, System.currentTimeMillis());
        String string = a.e.a(list);
        ax.Q2.a a8 = ax.Q2.a.i();
        String string2 = bl ? "cut" : "copy";
        a8.m("menu_folder", string2).c("loc", this.z3().I()).c("type", string).e();
        ax.W2.c.q().m(this.w7(), this.i1, list, bl);
        this.J3();
        this.e4(true);
    }

    private void o8(ax.c3.k k8) {
        this.w4(ax.c3.x.e(k8.R()), k8, new a.c(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a(ax.c3.k k8) {
                if (this.a.b() != null) {
                    if (ax.c3.A.Q(k8)) {
                        this.a.Q7(k8);
                        return;
                    }
                    Intent intent = ax.c3.u.n(ax.c3.u.g(k8), k8.s(), true, false);
                    if (ax.u3.B.L(this.a.o3(), "com.google.android.packageinstaller")) {
                        intent.setPackage("com.google.android.packageinstaller");
                        this.a.B8(intent, 0, false, k8.A());
                        return;
                    }
                    if (ax.c3.B.P(k8)) {
                        this.a.E8(k8, k8.s(), false);
                        return;
                    }
                    if (ax.c3.B.J(k8)) {
                        this.a.v8((com.alphainventor.filemanager.file.i)k8, k8.s(), false);
                    }
                }
            }
        });
    }

    private void oa() {
        if (this.g2 == null || this.f0() == null) {
            return;
        }
        this.g2.m(this.m2);
        this.g2 = null;
    }

    static /* synthetic */ String p6(E e8, String string) {
        e8.l1 = string;
        return string;
    }

    private void p7(List<com.alphainventor.filemanager.file.n> clipData) {
        boolean bl;
        if (this.f0() == null || (bl = clipData == null) | clipData.isEmpty()) {
            return;
        }
        clipData = u.b(clipData, clipData.get(0));
        u.c((Context)this.f0(), clipData);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void pa() {
        Object object = this.j1;
        if (object == null) {
            return;
        }
        File file = ((com.alphainventor.filemanager.file.n)object).N();
        long l8 = ax.o3.e.b().d((com.alphainventor.filemanager.file.n)object);
        if (l8 == 0L) return;
        if (!file.exists()) return;
        long l9 = file.lastModified();
        boolean bl = l8 > System.currentTimeMillis() ? l9 != l8 : l9 > l8;
        boolean bl2 = this.k1 == l9;
        if (!bl) return;
        if (!bl2) {
            try {
                com.alphainventor.filemanager.file.o o8 = ax.c3.x.f(file);
                ax.W2.B b8 = ax.W2.B.l();
                com.alphainventor.filemanager.file.o o9 = this.w7();
                l0 l02 = new l0(this, (com.alphainventor.filemanager.file.n)object, file){
                    final com.alphainventor.filemanager.file.n b;
                    final File c;
                    final E d;
                    {
                        this.d = e8;
                        this.b = n8;
                        this.c = file;
                        super(e8);
                    }

                    @Override
                    public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                        super.a(b8, string, string2, arrayList, object);
                        ax.o3.e.b().j(this.b, this.c.lastModified());
                        ax.o3.b.j().p(this.b.Q());
                        E.x5(this.d, -1L);
                        this.d.j9();
                        this.d.y4(b8, string, string2, arrayList);
                    }

                    @Override
                    public void b() {
                        super.b();
                    }
                };
                b8.k(o8, file, o9, (com.alphainventor.filemanager.file.n)object, l02);
                this.l(b8, true);
                this.k1 = l9;
                return;
            }
            catch (ax.b3.c c8) {
                StringBuilder stringBuilder;
                Object object2;
                if (this.f0() == null) {
                    ax.Ha.c.i(this.o3()).f().b("UPLOAD NOTI PROBLEM NULL ACTIVITY").h();
                    return;
                }
                f f8 = this.f0();
                if (f8 instanceof MainActivity) {
                    object2 = null;
                    bl = true;
                } else if (ax.X2.Q.x1() && (object2 = (ActivityManager)f8.getSystemService("activity")) != null) {
                    List list = object2.getAppTasks();
                    object = list.iterator();
                    stringBuilder = null;
                    bl2 = false;
                    while (true) {
                        bl = bl2;
                        object2 = stringBuilder;
                        if (object.hasNext()) {
                            if (((ActivityManager.AppTask)object.next()).getTaskInfo().id != f8.getTaskId()) continue;
                            object2 = A.a(((ActivityManager.AppTask)list.get(0)).getTaskInfo());
                            stringBuilder = object2;
                            if (object2 == null) continue;
                            stringBuilder = object2;
                            if (!MainActivity.class.getName().equals(object2.getClassName())) continue;
                            bl2 = true;
                            stringBuilder = object2;
                            continue;
                        }
                        break;
                    }
                } else {
                    object2 = null;
                    bl = false;
                }
                if (bl) {
                    object2 = this.o3().getString(2131951791, new Object[]{file.getName()});
                    object2 = ax.s3.u.j(this.o3()).i((CharSequence)object2, null);
                    ax.s3.u.j(this.o3()).l(120, (Notification)object2);
                    this.N1 = true;
                    object2 = ax.Ha.c.i(this.o3()).f().b("UPLOAD COMMAND NOT STARTED NOTI SENT");
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("activity:");
                    stringBuilder.append(f8.getClass().getName());
                    ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("activity:");
                stringBuilder.append(f8.getClass().getName());
                stringBuilder.append(",base:");
                stringBuilder.append(object2);
                object2 = stringBuilder.toString();
                ax.Ha.c.i(this.o3()).f().b("UPLOAD NOTI PROBLEM").g(object2).h();
                return;
            }
        }
        CommandService commandService = CommandService.q();
        if (commandService == null) return;
        Iterator<ax.W2.j> iterator = commandService.p(this.A3(), 5).iterator();
        while (iterator.hasNext()) {
            ax.W2.j j8 = iterator.next();
            commandService.I(this.v3(), j8, true);
        }
    }

    static /* synthetic */ boolean q6(E e8, boolean bl) {
        e8.J1 = bl;
        return bl;
    }

    private int q7() {
        if (this.v3() == null) {
            return -1;
        }
        return this.v3().h0().C();
    }

    private void q9() {
        this.X1.removeCallbacks(this.q2);
        this.X1.postDelayed(this.q2, 300L);
    }

    private void qa(com.alphainventor.filemanager.file.n n8, long l8) {
        if (this.j1 == null) {
            this.j1 = n8;
            ax.o3.e.b().j(n8, l8);
        }
    }

    static /* synthetic */ long r6(E e8) {
        return e8.m1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<com.alphainventor.filemanager.file.n> r7(List<com.alphainventor.filemanager.file.n> var1_1) {
        var2_2 = new ArrayList<com.alphainventor.filemanager.file.n>();
        var1_1 = var1_1.iterator();
        block2: while (true) {
            if (!var1_1.hasNext()) {
                return var2_2;
            }
            var4_4 = (com.alphainventor.filemanager.file.n)var1_1.next();
            if (!var4_4.isDirectory()) {
                var2_2.add((com.alphainventor.filemanager.file.n)var4_4);
                continue;
            }
            var3_3 = new Stack<com.alphainventor.filemanager.file.n>();
            var3_3.push((com.alphainventor.filemanager.file.n)var4_4);
            block3: while (true) {
                if (var3_3.size() > 0) ** break;
                continue block2;
                var4_4 = (com.alphainventor.filemanager.file.n)var3_3.pop();
                try {
                    var4_4 = this.w7().f0((com.alphainventor.filemanager.file.n)var4_4).iterator();
                    while (true) {
                        if (!var4_4.hasNext()) continue block3;
                        var5_6 = (com.alphainventor.filemanager.file.n)var4_4.next();
                        if (var5_6.isDirectory()) {
                            var3_3.push(var5_6);
                            continue;
                        }
                        var2_2.add(var5_6);
                    }
                }
                catch (ax.b3.j var4_5) {
                    continue;
                }
                break;
            }
            break;
        }
    }

    private void r9() {
        this.P1 = -1;
        this.Q1 = -1;
    }

    private void ra() {
        MenuItem menuItem;
        if (this.b() != null && (menuItem = this.z1) != null) {
            if (this.Y1) {
                menuItem.setIcon(this.B1);
                this.z1.setTitle((CharSequence)this.M0(2131952111));
            } else {
                menuItem.setIcon(this.A1);
                this.z1.setTitle((CharSequence)this.M0(2131952114));
            }
            this.z1.setEnabled(this.Z1);
        }
    }

    static /* synthetic */ long s6(E e8, long l8) {
        e8.m1 = l8;
        return l8;
    }

    private void s8(ax.c3.k k8, String string, String string2, boolean bl, boolean bl2) {
        this.C8(Q.E3(k8), string, string2, bl, bl2);
    }

    private void sa(List<com.alphainventor.filemanager.file.n> object) {
        object = object.get(0);
    }

    static /* synthetic */ void t6(E e8, com.alphainventor.filemanager.file.n n8, long l8) {
        e8.qa(n8, l8);
    }

    private void t8(com.alphainventor.filemanager.file.n n8, int n9, int n10) {
        String string = this.n1;
        if (string != null && !string.equals(n8.E())) {
            this.S6();
        }
        this.i1 = n8;
        this.n1 = n8.E();
        this.o1 = false;
        this.b8(n9, n10);
        this.e4(false);
        this.N4();
        this.V6();
    }

    private void t9(List<com.alphainventor.filemanager.file.n> list) {
        ax.Q2.a.i().m("menu_folder", "restore").c("loc", this.z3().I()).e();
        ax.W2.x x8 = ax.W2.x.l();
        x8.k(this.w7(), list, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                super.a(b8, string, string2, arrayList, object);
                this.b.j9();
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        });
        try {
            this.l(x8, true);
            return;
        }
        catch (ax.b3.c c8) {
            this.J4(2131951927, 1);
            return;
        }
    }

    private List<com.alphainventor.filemanager.file.n> u7(boolean bl) {
        return ax.x3.u.a(this.N0, (ListAdapter)this.c1, bl);
    }

    private void u9(String string) {
        a a8 = this.d1;
        if (a8 != null) {
            a8.k0(string);
        }
        if ((a8 = this.e1) != null) {
            a8.k0(string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void v8(com.alphainventor.filemanager.file.i i8, String string, boolean bl) {
        block9: {
            int n8;
            block7: {
                block8: {
                    block6: {
                        if (!this.X0()) return;
                        if (this.d1()) return;
                        if (this.Z0()) return;
                        this.D9(i8);
                        boolean bl2 = ax.t3.j.C(this.o3());
                        n8 = 0;
                        if (!bl2 || !ax.c3.A.B(i8, true) || string != null) break block6;
                        string = this.Z6(i8);
                        break block7;
                    }
                    if (ax.t3.j.F(this.o3()) && ax.c3.A.E(i8) && string == null && !Q.K3(this.o3(), c.a.c0, i8, false)) {
                        this.R8(i8);
                        return;
                    }
                    if (ax.t3.j.D(this.o3()) && ax.c3.A.C(i8) && string == null && !Q.J3(this.o3(), i8, false)) {
                        this.G8(i8);
                        return;
                    }
                    if (!ax.t3.j.E(this.o3()) || (!ax.c3.A.D(i8) || string != null) && !V.c0.h().equals(string)) break block8;
                    string = ax.c3.w.f(this.o3(), i8);
                    bl = false;
                    n8 = 1002;
                    break block7;
                }
                if (ax.c3.A.p(i8) && string == null) {
                    this.k7(Collections.singletonList(i8));
                    return;
                }
                if (ax.X2.Q.H1() && ax.c3.A.K(i8) && string == null) {
                    this.o8(i8);
                    return;
                }
                break block9;
            }
            if (string == null) return;
            this.B8((Intent)string, n8, bl, i8.A());
            return;
        }
        String string2 = i8.s();
        if (string == null) {
            string = string2;
        }
        this.s8(i8, string2, string, bl, true);
    }

    private void w8(com.alphainventor.filemanager.file.i i8) {
        if (this.X0() && !this.d1()) {
            String string = i8.s();
            this.D9(i8);
            if (ax.c3.w.a(this.o3(), i8, string, false)) {
                this.s8(i8, string, string, true, true);
                return;
            }
            this.ba(i8, true);
        }
    }

    static /* synthetic */ long x5(E e8, long l8) {
        e8.k1 = l8;
        return l8;
    }

    static /* synthetic */ boolean x6(E e8, boolean bl) {
        e8.E1 = bl;
        return bl;
    }

    private void x8(com.alphainventor.filemanager.file.n n8) {
        Object object;
        long l8 = System.currentTimeMillis();
        this.F6(this.i1, l8);
        this.F6(n8, l8 + 1L);
        this.V6();
        this.C9(n8, 0L);
        Intent intent = Q.A3(this.o3(), n8);
        if (n8 instanceof ax.c3.E && (object = (ax.c3.E)n8).j0()) {
            this.z8((ax.c3.E)object);
        } else if (intent != null) {
            if (ax.c3.u.S(intent)) {
                this.A8(n8);
            } else if (ax.c3.u.T(intent)) {
                this.G8(n8);
            } else if (ax.c3.u.U(intent)) {
                this.R8(n8);
            } else if (ax.c3.B.H(n8)) {
                this.D9(n8);
                this.B8(intent, 0, false, n8.A());
            } else {
                this.g7(n8, false, intent);
            }
        } else if (E.X7(this.o3(), n8)) {
            object = n8.G();
            if (ax.c3.z.r0 == object) {
                this.E4(2131952449, 1);
            } else {
                if (!TextUtils.isEmpty((CharSequence)n8.A())) {
                    this.E4(2131952449, 1);
                }
                this.ba(n8, true);
            }
        } else if (ax.c3.B.P(n8)) {
            this.E8(n8, null, false);
        } else if (ax.c3.B.J(n8)) {
            this.v8((com.alphainventor.filemanager.file.i)n8, null, false);
        } else if (ax.c3.A.B(n8, false) && ax.t3.j.C(this.o3())) {
            this.A8(n8);
        } else if (ax.c3.A.G(n8)) {
            this.I8(n8, false);
        } else {
            this.g7(n8, false, null);
        }
        if (this.f0() != null) {
            this.v3().w0(this.z3(), this.x3(), n8.E(), false);
        }
    }

    private int y7() {
        if (!this.z3().P()) {
            return 2;
        }
        return ax.t3.e.d(this.o3(), this.z3(), this.x3(), this.n1, this.H1);
    }

    private void y8(File file, String string, String string2, boolean bl, boolean bl2) {
        this.C8(ax.c3.u.w(file), string, string2, bl, bl2);
    }

    private void y9(int n8) {
        int n9;
        block8: {
            block7: {
                if (this.f0() == null) break block7;
                int n10 = this.z7();
                n9 = this.y7();
                if (n10 == 2) break block8;
                if (n10 == 12 || n10 == 16) {
                    n8 = this.G0().getConfiguration().orientation == 1 ? (n8 <= 480 ? 3 : (n8 <= 600 ? 4 : (n8 /= 150))) : (n8 <= 640 ? 5 : (n8 <= 960 ? 6 : (n8 /= 145)));
                    int n11 = n8;
                    if (n9 == 4) {
                        n11 = n8 - 1;
                    }
                    if (n10 == 12) {
                        this.L0.setNumColumns(n11);
                        return;
                    }
                    if (n10 == 16) {
                        this.L0.setNumColumns(n11 + 1);
                    }
                }
            }
            return;
        }
        int n12 = ax.u3.B.e(this.b(), n8);
        n8 = n9 == 4 ? this.G0().getDimensionPixelSize(2131165404) : this.G0().getDimensionPixelSize(2131165405);
        n8 = (n12 - this.G0().getDimensionPixelSize(2131165413) * 2) / n8;
        this.L0.setNumColumns(n8);
    }

    private void z8(ax.c3.E e8) {
        String string = e8.f0();
        if (string == null) {
            this.E4(2131951927, 1);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)string));
        intent.setFlags(0x10000000);
        this.B8(intent, 0, false, e8.A());
    }

    private void z9(K object, String string) {
        boolean bl = ax.t3.e.c(this.o3(), object.d(), object.b(), string, false);
        object = this.d1;
        if (object != null) {
            ((a)((Object)object)).j0(bl);
        }
        if ((object = this.e1) != null) {
            ((a)((Object)object)).j0(bl);
        }
    }

    protected AdapterView.OnItemClickListener A7() {
        return this.k2;
    }

    @Override
    public void B() {
        this.w7().n0();
    }

    protected abstract String B7();

    void B9(boolean bl) {
        if (!this.X0()) {
            return;
        }
        this.F0.post(new Runnable(){
            final E c0;
            final boolean q;
            {
                this.c0 = e8;
                this.q = bl;
            }

            @Override
            public void run() {
                if (this.c0.X0()) {
                    if (this.c0.F0.m() != this.q) {
                        this.c0.F0.setRefreshing(this.q);
                    }
                    if (this.c0.C0.m() != this.q) {
                        this.c0.C0.setRefreshing(this.q);
                    }
                }
            }
        });
    }

    @Override
    public String C3() {
        return this.n1;
    }

    protected boolean C7() {
        return true;
    }

    @Override
    public void D1() {
        if (this.L1) {
            this.M1 = true;
            this.L1 = false;
        }
        super.D1();
    }

    protected int D7() {
        if (!this.z3().P()) {
            return ax.t3.e.b(this.z3());
        }
        if (this.n1 == null && this.A3().e() != null) {
            ax.Ha.b b8 = ax.Ha.c.h().f().b("current path == null in getSavedListViewType");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location:");
            stringBuilder.append((Object)this.z3());
            b8.g(stringBuilder.toString()).h();
        }
        return ax.t3.e.k(this.o3(), this.z3(), this.x3(), this.n1, this.H1);
    }

    protected AdapterView.OnItemClickListener E7() {
        return this.l2;
    }

    public void E9(ax.Q2.f f8) {
        this.G1 = f8;
        if (this.W0 != null) {
            this.F9();
        }
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
        if (this.f0() != null) {
            this.Y8(menu);
            this.i7(menu, 2131362538);
            this.i7(menu, 2131362530);
            this.i7(menu, 2131362551);
            ax.n.a a8 = ((ax.n.c)this.f0()).getSupportActionBar();
            MenuItem menuItem = menu.findItem(2131362551);
            if (menuItem != null && a8 != null) {
                menuItem.setIcon(z.p(a8.m(), this.D7()));
            }
            this.G6(menu, false);
            if (this.d2 != null && (menu = this.y1) != null && this.X0 != null) {
                menu.expandActionView();
                this.X0.setText((CharSequence)this.d2);
                this.X0.setSelection(this.d2.length());
                this.d2 = null;
            }
        }
    }

    protected String G7(String string) {
        return E.F7(this.o3(), this.z3(), this.x3(), string, this.H1);
    }

    protected boolean G8(com.alphainventor.filemanager.file.n n8) {
        if (this.n1 != null && this.c1 != null) {
            if (ax.X2.Q.h0()) {
                MyFileProvider.y(this.b());
            }
            this.z3();
            Object object = ax.Q2.f.l0;
            object = this.c1.N();
            boolean bl = this.H8(n8, ax.c3.B.U(this.A3(), this.n1), (List<com.alphainventor.filemanager.file.n>)object, 0);
            ax.Q2.a.i().m("command", "file_open").c("loc", this.z3().I()).c("ext", n8.A()).c("result", "success").e();
            ax.Q2.a.i().m("music_player", "open_player").c("loc", this.z3().I()).c("ext", n8.A()).e();
            ax.Q2.a.i().o("music_player_open").b("loc", this.z3().I()).b("ext", n8.A()).c();
            return bl;
        }
        ax.Q2.a.i().m("command", "file_open").c("loc", n8.P().I()).c("ext", n8.A()).c("result", "failure").e();
        return false;
    }

    protected void G9(boolean bl) {
        this.s1 = bl;
        this.W0.setIsTwoDepth(bl);
    }

    @Override
    public void H1() {
        super.H1();
        if (this.M1 || this.P3()) {
            r2.fine("refresh on resume");
            this.Y6();
            this.N6(false);
            this.M1 = false;
        }
        if (this.N1) {
            ax.s3.u.j(this.o3()).a(120);
        }
    }

    public void H6() {
        if (!this.H1) {
            if (!ax.Q2.f.U(this.z3())) {
                Object object = ax.Ha.c.h().d("INVALID ANALYZE CURRENT PATH!!!!");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("location:");
                stringBuilder.append(this.z3().I());
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid Analyze Location : ");
                ((StringBuilder)object).append(this.z3().I());
                ax.u3.b.e(((StringBuilder)object).toString());
                return;
            }
            this.I9(true);
            this.c4(false);
            return;
        }
        if (this.G1 == null) {
            this.I9(false);
            this.c4(false);
        }
    }

    protected AdapterView.OnItemClickListener H7() {
        return this.j2;
    }

    public boolean H8(com.alphainventor.filemanager.file.n n8, String string, List<com.alphainventor.filemanager.file.n> list, int n9) {
        if (this.f0() == null) {
            return false;
        }
        return ((com.alphainventor.filemanager.activity.b)this.f0()).y0(n8, string, list, false, n9);
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putString("path", this.n1);
        if (this.J1 && this.j1 != null && ax.o3.e.b().d(this.j1) != 0L) {
            bundle.putString("file_open_path", this.j1.E());
            bundle.putLong("file_open_last_modified", ax.o3.e.b().d(this.j1));
        }
    }

    public void I9(boolean bl) {
        if (this.H1 && !bl) {
            h.S(this.A3()).G0();
        }
        if (!this.H1 && bl) {
            h.S(this.A3()).J0();
        }
        this.H1 = bl;
    }

    @Override
    public void J1() {
        super.J1();
        this.Y6();
        this.N6(false);
        this.M1 = false;
        this.i9();
        g.a().d("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED", this.f2);
    }

    protected boolean J7(int n8, boolean bl, boolean bl2) {
        Object object;
        boolean bl3 = false;
        bl2 = bl2 && this.N0.hasFocus() && this.N0.getSelectedItemPosition() != -1;
        if (!this.K3() && !bl2) {
            if (this.Y0.k() == 0) {
                ax.Ha.c.h().d("HCM: NOTRECHABLE").h();
                this.W3(this.m3());
            }
            return false;
        }
        this.P6();
        if (n8 != 2131361999 && !this.Z7(n8) && ax.W2.c.q().v()) {
            this.X2(false);
        }
        if ((object = this.u7(bl2)).isEmpty()) {
            if (bl2) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("NOSEL KEY:").j();
                object = new StringBuilder();
                ((StringBuilder)object).append("count:");
                ((StringBuilder)object).append(this.c1.getCount());
                ((StringBuilder)object).append(",pos:");
                ((StringBuilder)object).append(this.N0.getSelectedItemPosition());
                b8.g(((StringBuilder)object).toString()).h();
            } else {
                ax.Ha.b b9 = ax.Ha.c.h().f().d("NOSEL:").j();
                object = new StringBuilder();
                ((StringBuilder)object).append(this.K3());
                ((StringBuilder)object).append(":");
                bl = bl3;
                if (this.f0() == null) {
                    bl = true;
                }
                ((StringBuilder)object).append(bl);
                b9.g(((StringBuilder)object).toString()).h();
                this.E4(2131951927, 1);
            }
            this.h3();
            return true;
        }
        return this.K7(n8, (List<com.alphainventor.filemanager.file.n>)object, bl);
    }

    public void J9(Context context, boolean bl) {
        if (ax.Q2.f.U(this.z3())) {
            this.I9(bl);
            if (bl) {
                ax.t3.e.q(context, this.z3(), this.x3(), null, true, 1);
                ax.t3.e.p(context, this.z3(), this.x3(), null, true, "SizeDown");
            }
        }
    }

    @Override
    public void K1() {
        r2.fine("onStop");
        super.K1();
        this.oa();
        g.a().h(this.f2);
        if (ax.Q2.f.n0(this.z3())) {
            this.g1.f();
        }
    }

    protected boolean K6() {
        return this.a8();
    }

    protected boolean K7(int n8, List<com.alphainventor.filemanager.file.n> object, boolean bl) {
        com.alphainventor.filemanager.file.j j8 = ax.Q2.f.A0(this.z3()) ? x.R0(this.o3(), object) : null;
        switch (n8) {
            default: {
                break;
            }
            case 2131361930: 
            case 2131361931: 
            case 2131361939: 
            case 2131361941: 
            case 2131361943: 
            case 2131361944: {
                if (j8 == null) break;
                this.o9(3, j8.a, j8.b, false);
                return true;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 2131362546: {
                this.T2(object.get(0), this.g1);
                this.h3();
                return true;
            }
            case 2131362545: {
                this.t4(this.w7(), (List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362542: {
                ax.Q2.a.i().m("menu_folder", "selection_settings").e();
                object = ax.a3.T.i3(this);
                J.c(this, "selection_settings_popup_request", new C(this));
                this.A((e)object, "settings", true);
                return true;
            }
            case 2131362541: {
                this.b1.e(this.N0);
                this.I3();
                return true;
            }
            case 2131362540: {
                if (object.size() == this.c1.getCount()) {
                    ax.Q2.a.i().m("menu_folder", "deselect").c("loc", this.z3().I()).e();
                    this.h3();
                    return true;
                }
                ax.Q2.a.i().m("menu_folder", "select_all").c("loc", this.z3().I()).e();
                this.b1.d(this.N0);
                return true;
            }
            case 2131362534: {
                this.sa((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362529: {
                this.f9((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362524: {
                this.S8((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362523: {
                this.J8((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362521: {
                this.ba(object.get(0), true);
                this.h3();
                return true;
            }
            case 2131362515: {
                this.ma((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362512: {
                this.k7((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362505: {
                this.W6((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131362504: {
                this.E6((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131361999: {
                this.h3();
                return true;
            }
            case 2131361944: {
                this.t9((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131361943: {
                this.m9((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131361941: {
                this.b7((List<com.alphainventor.filemanager.file.n>)object, 2);
                this.h3();
                return true;
            }
            case 2131361940: 
            case 2131362528: {
                this.B4(this.w7(), (List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131361939: {
                this.b7((List<com.alphainventor.filemanager.file.n>)object, 1);
                this.h3();
                return true;
            }
            case 2131361931: {
                this.b7((List<com.alphainventor.filemanager.file.n>)object, 0);
                this.h3();
                return true;
            }
            case 2131361930: {
                this.o7((List<com.alphainventor.filemanager.file.n>)object, true);
                this.h3();
                return true;
            }
            case 2131361929: {
                this.p7((List<com.alphainventor.filemanager.file.n>)object);
                this.h3();
                return true;
            }
            case 2131361928: 
        }
        this.o7((List<com.alphainventor.filemanager.file.n>)object, false);
        this.h3();
        return true;
    }

    protected boolean K8() {
        return true;
    }

    @Override
    public void L() {
    }

    @Override
    @SuppressLint(value={"InlinedApi"})
    public void L1(View object, Bundle bundle) {
        super.L1((View)object, bundle);
        Object object2 = (SwipeRefreshLayout)object.findViewById(2131362457);
        this.D0 = object2;
        ((SwipeRefreshLayout)object2).setOnChildScrollUpCallback(new ax.x3.g());
        object2 = (SwipeRefreshLayout)object.findViewById(2131362355);
        this.E0 = object2;
        ((SwipeRefreshLayout)object2).setOnChildScrollUpCallback(new ax.x3.g());
        this.C0 = (SwipeRefreshLayout)object.findViewById(2131362555);
        object2 = (RecyclerView)object.findViewById(2131362377);
        this.G0 = object2;
        ((RecyclerView)object2).setLayoutManager(new LinearLayoutManager(this.b(), 1, false));
        this.H0 = object.findViewById(2131362376);
        this.K0 = (ListView)object.findViewById(2131362452);
        this.L0 = (GridView)object.findViewById(2131362350);
        this.Q0 = object.findViewById(2131362552);
        this.R0 = (TextView)object.findViewById(2131362469);
        this.S0 = (TextView)object.findViewById(2131362907);
        this.T0 = (TextView)object.findViewById(2131362042);
        this.U0 = (CoordinatorLayout)object.findViewById(2131362848);
        this.V0 = object.findViewById(2131361952);
        this.W0 = (PathBar)object.findViewById(2131362680);
        this.F9();
        this.W0.setLocationUnit(this.A3());
        this.W0.setRootInfo(this.B7());
        this.W0.setPathBarListener(new PathBar.h(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                this.a.i3(string);
            }

            @Override
            public void b(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                if (!this.a.T7()) {
                    return;
                }
                this.a.Z3(string);
            }

            @Override
            public void c(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                this.a.L8();
            }

            @Override
            public void d(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                this.a.U3(string);
            }

            @Override
            public void e() {
                if (this.a.K3()) {
                    this.a.h3();
                }
                if (this.a.z3() == ax.Q2.f.F0) {
                    ax.t3.k.D(System.currentTimeMillis());
                    this.a.c4(true);
                    return;
                }
                ax.Q2.a.i().m("menu_folder", "analyze").c("loc", this.a.z3().I()).c("by", "pathbar_analysis").e();
                this.a.O8();
            }
        });
        this.Y0 = new ax.x3.d(this.v3(), object.findViewById(2131361934), object.findViewById(2131361945));
        this.L9();
        this.H0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final E c;
            {
                this.c = e8;
            }

            @Override
            public void a(View view) {
                if (this.c.X0 != null && this.c.X0.isShown()) {
                    this.c.y1.collapseActionView();
                }
            }
        });
        this.K0.setChoiceMode(3);
        this.L0.setChoiceMode(3);
        object = new ArrayList();
        if (!ax.Q2.p.a(this.o3())) {
            object2 = this.K0;
            object2.setOnScrollListener((AbsListView.OnScrollListener)new m0((AbsListView)object2));
            object2 = this.L0;
            object2.setOnScrollListener((AbsListView.OnScrollListener)new m0((AbsListView)object2));
        }
        object2 = new View.OnKeyListener(this){
            final E a;
            {
                this.a = e8;
            }

            public boolean onKey(View view, int n8, KeyEvent keyEvent) {
                int n9 = keyEvent.getAction();
                int n10 = 1;
                int n11 = 1;
                if (n9 == 1 && (n8 == 59 || n8 == 60)) {
                    this.a.r9();
                }
                if (keyEvent.getAction() == 0) {
                    n9 = -1;
                    if (n8 != 62) {
                        if (n8 != 66 && n8 != 160) {
                            switch (n8) {
                                default: {
                                    break;
                                }
                                case 21: 
                                case 22: {
                                    if (view instanceof GridView && keyEvent.isShiftPressed()) {
                                        if (n8 == 21) {
                                            n11 = -1;
                                        }
                                        return this.a.d8((AbsListView)view, n11, n8, keyEvent);
                                    }
                                    this.a.r9();
                                    break;
                                }
                                case 19: 
                                case 20: {
                                    if (keyEvent.isShiftPressed()) {
                                        n11 = n8 == 19 ? n9 : 1;
                                        if (view instanceof GridView) {
                                            n10 = Math.max(1, ((GridView)view).getNumColumns());
                                        }
                                        return this.a.d8((AbsListView)view, n11 * n10, n8, keyEvent);
                                    }
                                    this.a.r9();
                                    break;
                                }
                            }
                        } else if (keyEvent.isShiftPressed()) {
                            if (this.a.N0 != null && !this.a.V7()) {
                                this.a.J7(2131362524, false, true);
                            }
                            return true;
                        }
                    } else {
                        n8 = this.a.N0.getSelectedItemPosition();
                        if (n8 != -1) {
                            this.a.N0.setItemChecked(n8, this.a.N0.isItemChecked(n8) ^ true);
                        }
                        return true;
                    }
                }
                return false;
            }
        };
        this.K0.setOnKeyListener((View.OnKeyListener)object2);
        this.L0.setOnKeyListener((View.OnKeyListener)object2);
        object2 = new ax.x3.z(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a(int n8) {
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void b(int n8) {
                IndexOutOfBoundsException indexOutOfBoundsException2;
                block4: {
                    if (n8 < 0) return;
                    if (n8 >= this.a.c1.getCount()) {
                        return;
                    }
                    try {
                        com.alphainventor.filemanager.file.n n9;
                        if (this.a.v3().g0().g() && !this.a.K3() && this.a.Y7() && !this.a.v3().g0().d() && (n9 = (com.alphainventor.filemanager.file.n)this.a.c1.getItem(n8)).isDirectory()) {
                            this.a.D8(n9);
                            return;
                        }
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block4;
                    }
                    this.a.N0.setItemChecked(n8, this.a.N0.isItemChecked(n8) ^ true);
                    return;
                }
                ax.Ha.c.h().f().d("Toggle position problem").l(indexOutOfBoundsException2).h();
            }

            @Override
            public void c(int n8, View view, int n9, int n10) {
                if (n8 >= 0 && n8 < this.a.c1.getCount()) {
                    if (this.a.N0.isItemChecked(n8)) {
                        if (ax.X2.Q.m1() && F.a(this.a.v3()) && ax.Q2.f.Y(this.a.z3())) {
                            List list = this.a.u7(true);
                            this.a.c1.z0(list, view, n8, n9, n10);
                            return;
                        }
                    } else {
                        boolean bl = this.a.K3();
                        this.b(n8);
                        if (this.a.K3() && this.a.b1.b()) {
                            this.a.b1.e(this.a.N0);
                            this.a.I3();
                            return;
                        }
                        if (!bl && ax.X2.Q.m1() && F.a(this.a.v3()) && ax.Q2.f.Y(this.a.z3())) {
                            List list = this.a.u7(true);
                            this.a.c1.z0(list, view, n8, n9, n10);
                        }
                    }
                }
            }
        };
        if (this.d1 == null) {
            this.d1 = new a((Context)this.f0(), (List<com.alphainventor.filemanager.file.n>)object, this.w7(), this.g1, 0, (ax.x3.z)object2, this.fa(), true);
        }
        this.K0.setAdapter((ListAdapter)this.d1);
        if (this.e1 == null) {
            this.e1 = new a((Context)this.f0(), (List<com.alphainventor.filemanager.file.n>)object, this.w7(), this.g1, 2, (ax.x3.z)object2, false, false);
        }
        this.L0.setAdapter((ListAdapter)this.e1);
        this.D0.setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a() {
                if (!this.a.T7() && !ax.Q2.f.D0(this.a.z3())) {
                    this.a.B9(false);
                    return;
                }
                this.a.c4(true);
            }
        });
        this.E0.setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a() {
                if (!this.a.T7() && !ax.Q2.f.D0(this.a.z3())) {
                    this.a.B9(false);
                    return;
                }
                this.a.c4(true);
            }
        });
        this.C0.setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public void a() {
                if (!this.a.T7() && !ax.Q2.f.D0(this.a.z3())) {
                    this.a.B9(false);
                    return;
                }
                this.a.c4(true);
            }
        });
        this.s9();
        this.la(this.z7());
        this.c1.m0(this.y7());
        this.c1.A0();
        this.x2(true);
        object = new i(this.b(), "file");
        this.I0 = object;
        ((i)object).i(new ax.g3.d(this, 400L){
            final E c;
            {
                this.c = e8;
                super(l8);
            }

            @Override
            public void a(AdapterView<?> object, View view, int n8, long l8) {
                if (this.c.X0 != null) {
                    object = this.c.I0.e(n8);
                    this.c.f7(object);
                }
            }
        });
        if (bundle != null && !bundle.isEmpty()) {
            this.n1 = bundle.getString("path");
            this.o1 = false;
            this.l1 = bundle.getString("file_open_path");
            this.m1 = bundle.getLong("file_open_last_modified");
        }
    }

    protected void L9() {
        Object object = new ax.g3.c(this){
            final E c;
            {
                this.c = e8;
            }

            @Override
            public void a(View view) {
                if (this.c.Y0.k() != 0) {
                    return;
                }
                this.c.J7(view.getId(), false, false);
            }
        };
        this.C1 = object;
        object = this.Y0.d(2131361928, 2131952251, 2131231115, (View.OnClickListener)object);
        object.setOnLongClickListener(new View.OnLongClickListener(this){
            final E a;
            {
                this.a = e8;
            }

            public boolean onLongClick(View view) {
                if (u.a(this.a.u7(false))) {
                    this.a.O9();
                    return true;
                }
                return this.a.Y0.h().onLongClick(view);
            }
        });
        this.Y0.d(2131361930, 2131952274, 2131231143, this.C1);
        this.Y0.d(2131361943, 2131952290, 2131231202, this.C1);
        Object object2 = this.Y0.d(2131361931, 2131952255, 2131231124, this.C1);
        this.Y0.e();
        object2.setOnLongClickListener(new View.OnLongClickListener(this){
            final E a;
            {
                this.a = e8;
            }

            public boolean onLongClick(View view) {
                if (ax.Q2.f.l(this.a.z3())) {
                    this.a.Q9();
                    return true;
                }
                return this.a.Y0.h().onLongClick(view);
            }
        });
        this.Y0.n(new d.f(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public boolean a(int n8) {
                this.a.J7(n8, false, false);
                return false;
            }
        });
        ax.s.c c8 = new ax.s.c(this.b(), 2132017450);
        object2 = new w((Context)c8, (View)object2);
        this.Z0 = object2;
        ((w)object2).d(2131689490);
        this.Z0.f(new w.d(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.a.Z0.a();
                return this.a.J7(menuItem.getItemId(), false, false);
            }
        });
        object2 = this.Z0.b();
        if (object2 instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e)object2).b0(true);
        }
        this.a1 = object = new w((Context)c8, (View)object);
        ((w)object).d(2131689489);
        this.a1.f(new w.d(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                this.a.a1.a();
                return this.a.J7(menuItem.getItemId(), false, false);
            }
        });
        object = this.a1.b();
        if (object instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e)object).b0(true);
        }
    }

    @Override
    public void M4() {
        if (this.i1 == null) {
            if (this.o1) {
                if (ax.W2.c.q().t()) {
                    this.E4(2131952350, 0);
                } else {
                    this.E4(2131952328, 0);
                }
            }
            ax.Ha.b b8 = ax.Ha.c.h().c("Paste to CURRENT PATH INFO == NULL");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loaded:");
            stringBuilder.append(this.o1);
            b8.g(stringBuilder.toString()).h();
            return;
        }
        if (x.E1((Context)this.f0(), this.i1, true)) {
            this.p9(3, this.i1);
            return;
        }
        ax.W2.c.q().o(this.w7(), this.i1, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b object, String string, String string2, ArrayList<String> arrayList, Object object2) {
                boolean bl;
                block6: {
                    block4: {
                        Object object3;
                        block5: {
                            super.a((h.b)((Object)object), string, string2, arrayList, object2);
                            this.b.j9();
                            object3 = h.b.c0;
                            bl = false;
                            if (object != object3 || !(object2 instanceof e.e)) break block4;
                            object3 = (e.e)object2;
                            if (this.b.U7((e.e)object3)) break block5;
                            object2 = object3;
                            if (!((e.e)object3).a) break block6;
                        }
                        bl = true;
                        object2 = object3;
                        break block6;
                    }
                    object2 = null;
                }
                if (bl) {
                    if (object2 != null && (object = ((e.e)object2).b) != null) {
                        ((com.alphainventor.filemanager.file.o)object).n0();
                    }
                    this.b.H4(string, 1, new ax.g3.c(this, (e.e)object2){
                        final e.e c;
                        final U d;
                        {
                            this.d = u8;
                            this.c = e8;
                        }

                        @Override
                        public void a(View view) {
                            this.d.b.ga(this.c);
                        }
                    }, new Snackbar.a(this, (e.e)object2){
                        final e.e a;
                        final U b;
                        {
                            this.b = u8;
                            this.a = e8;
                        }

                        @Override
                        public void c(Snackbar object, int n8) {
                            object = this.a;
                            if (object != null && (object = ((e.e)object).b) != null) {
                                ((com.alphainventor.filemanager.file.o)object).k0(false);
                            }
                        }
                    });
                    return;
                }
                this.b.y4((h.b)((Object)object), string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        });
        try {
            this.l(ax.W2.c.q(), true);
        }
        catch (ax.b3.c c8) {
            this.J4(2131951927, 1);
        }
        this.J3();
        this.e4(true);
    }

    @Override
    public boolean N3() {
        if (this.v7() == null) {
            return false;
        }
        if (!this.a8()) {
            return false;
        }
        return ax.W2.c.q().k(this.v7());
    }

    public void N8() {
        if (this.n1 == null) {
            ax.Ha.b b8 = ax.Ha.c.h().b("Open settings with no path");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location:");
            stringBuilder.append((Object)this.z3());
            b8.g(stringBuilder.toString()).j().h();
        }
        this.A(ax.a3.d.i3(this, this.n1, this.V9()), "settings", true);
        J.c(this, "view_settings_request", new D(this));
    }

    protected boolean O6(List<com.alphainventor.filemanager.file.n> object) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (com.alphainventor.filemanager.file.n)object.next();
            if (!ax.c3.B.P((com.alphainventor.filemanager.file.n)object2) || ((com.alphainventor.filemanager.file.n)object2).P() != ax.Q2.f.o0 && ((com.alphainventor.filemanager.file.n)object2).P() != ax.Q2.f.p0 && !ax.Q2.f.g0(((com.alphainventor.filemanager.file.n)object2).P()) || !"/DCIM".equals(object2 = ((y)object2).C0()) && !"/DCIM/Camera".equals(object2)) continue;
            return true;
        }
        return false;
    }

    public void O7(Menu menu) {
        MenuItem menuItem;
        this.y1 = menuItem = menu.findItem(2131362538);
        if (menuItem != null) {
            if (this.J0) {
                ax.u3.b.e("init search is called when searching");
                this.A9(false);
            }
            menuItem = (EditText)ax.c0.A.a(this.y1).findViewById(2131362168);
            this.X0 = menuItem;
            menuItem.setOnFocusChangeListener(new View.OnFocusChangeListener(this){
                final E a;
                {
                    this.a = e8;
                }

                public void onFocusChange(View view, boolean bl) {
                    if (this.a.f0() != null) {
                        InputMethodManager inputMethodManager = (InputMethodManager)this.a.f0().getSystemService("input_method");
                        if (bl) {
                            view.postDelayed(new Runnable(){
                                final View c0;
                                final n d0;
                                final InputMethodManager q;
                                {
                                    this.d0 = n8;
                                    this.q = inputMethodManager;
                                    this.c0 = view;
                                }

                                @Override
                                public void run() {
                                    this.q.showSoftInput(this.c0, 1);
                                }
                            }, 100L);
                            return;
                        }
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                    }
                }
            });
            this.X0.setFocusable(true);
            ax.c0.A.h(this.y1, new A.c(){
                final Menu a;
                final E b;
                {
                    this.b = e8;
                    this.a = menu;
                }

                @Override
                public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                    this.b.X0.clearComposingText();
                    this.b.X0.setText((CharSequence)"");
                    this.b.X0.clearFocus();
                    this.b.A9(false);
                    this.b.X1.post(new Runnable(this){
                        final o q;
                        {
                            this.q = o8;
                        }

                        @Override
                        public void run() {
                            if (this.q.b.f0() == null) {
                                return;
                            }
                            o o8 = this.q;
                            o8.b.G6(o8.a, false);
                        }
                    });
                    return true;
                }

                @Override
                public boolean onMenuItemActionExpand(MenuItem menuItem) {
                    ax.Q2.a.i().m("menu_folder", "search").c("loc", this.b.z3().I()).e();
                    this.b.X0.requestFocus();
                    this.b.A9(true);
                    this.b.G6(this.a, true);
                    this.b.P7();
                    this.b.ra();
                    return true;
                }
            });
            this.X0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
                final E a;
                {
                    this.a = e8;
                }

                public boolean onEditorAction(TextView object, int n8, KeyEvent keyEvent) {
                    if (n8 != 0 && (n8 & 0xFF) == 0) {
                        return false;
                    }
                    if (this.a.f0() == null) {
                        return true;
                    }
                    object = this.a.X0.getText().toString();
                    this.a.f7((String)object);
                    return true;
                }
            });
            menu = menu.findItem(2131362539);
            this.z1 = menu;
            if (menu != null && this.b() != null) {
                menu = this.v3().e0().e().getContext();
                this.B1 = ax.o.a.b((Context)menu, 2131231068);
                this.A1 = ax.o.a.b((Context)menu, 2131231058);
                this.z1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this){
                    final E a;
                    {
                        this.a = e8;
                    }

                    public boolean onMenuItemClick(MenuItem object) {
                        if (!this.a.Z1) {
                            return true;
                        }
                        object = this.a;
                        E.n5((E)object, ((E)object).Y1 ^ true);
                        this.a.ra();
                        return true;
                    }
                });
            }
        }
    }

    public void O8() {
        MainActivity mainActivity = (MainActivity)this.f0();
        Bookmark bookmark = Bookmark.n((Context)mainActivity, h.B(this.A3()));
        mainActivity.d2(this.A3(), true, bookmark, "pathbar_analysis");
    }

    public void O9() {
        try {
            this.a1.g();
            return;
        }
        catch (WindowManager.BadTokenException badTokenException) {
            ax.Ha.b b8 = ax.Ha.c.h().d("BADTOKEN 3");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("activestate:");
            stringBuilder.append(this.L3());
            b8.g(stringBuilder.toString()).h();
            return;
        }
    }

    protected void P8(Uri object) {
        if (this.f0() == null) {
            return;
        }
        if (this.f0() instanceof MainActivity) {
            object = Bookmark.c(this.o3(), object);
            ((MainActivity)this.f0()).c2((Bookmark)object, null, null, null, new MainActivity.G(this){
                final E a;
                {
                    this.a = e8;
                }

                @Override
                public void a(ax.d3.n n8) {
                }
            });
            return;
        }
        ax.u3.b.f();
    }

    protected void P9(ax.W2.m m8, boolean bl) {
        ax.Q2.a a8 = ax.Q2.a.i();
        String string = bl ? "new_folder" : "new_file";
        a8.m("menu_folder", string).c("loc", this.z3().I()).e();
        this.A(ax.a3.p.l3(bl, new p.d(){
            final ax.W2.m a;
            final E b;
            {
                this.b = e8;
                this.a = m8;
            }

            @Override
            public l a(String object) {
                String string;
                ax.u3.b.c(TextUtils.isEmpty((CharSequence)object) ^ true);
                if (this.b.n1 != null && this.b.c1.X(string = d0.Q(this.a.m(), object))) {
                    return l.c0;
                }
                this.a.o((String)object);
                try {
                    this.b.l(this.a, false);
                    object = l.q;
                    return object;
                }
                catch (ax.b3.c c8) {
                    return l.d0;
                }
            }
        }), "createFileName", true);
    }

    public void Q9() {
        try {
            this.Z0.g();
            return;
        }
        catch (WindowManager.BadTokenException badTokenException) {
            ax.Ha.b b8 = ax.Ha.c.h().d("BADTOKEN 2");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("activestate:");
            stringBuilder.append(this.L3());
            b8.g(stringBuilder.toString()).h();
            return;
        }
    }

    public boolean R7() {
        return true;
    }

    protected boolean R9() {
        return false;
    }

    void S6() {
        this.e2 = null;
    }

    boolean S7() {
        if (this.h1 == null) {
            return false;
        }
        return this.w7().a();
    }

    @Override
    public void T(boolean bl, Object object) {
        if (bl) {
            this.v9(k0.d0);
        } else {
            this.B9(false);
            this.v9(k0.q);
        }
        this.m8(bl, object);
        this.w7().k0(false);
        if (bl) {
            this.E1 = false;
        }
    }

    boolean T7() {
        return this.S7() || this.K1 == k0.d0;
        {
        }
    }

    protected void T9(int n8, int n9) {
        this.ka(true);
        this.R0.setText(n8);
        if (n9 != 0) {
            this.S0.setText(n9);
        }
    }

    public void U6() {
        this.o1 = false;
        ax.V2.c c8 = this.f1;
        if (c8 != null) {
            c8.a();
        }
    }

    public void U8(String string) {
        this.c2 = string;
    }

    @Override
    public String V() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.z3().I());
        stringBuilder.append(this.x3());
        return stringBuilder.toString();
    }

    @Override
    public boolean V2() {
        if (this.K3()) {
            this.h3();
            return true;
        }
        EditText editText = this.X0;
        if (editText != null && editText.isShown()) {
            this.y1.collapseActionView();
            return true;
        }
        return this.M7();
    }

    @Override
    protected boolean V3() {
        ax.x3.d d8 = this.Y0;
        if (d8 != null && d8.m()) {
            return true;
        }
        return super.V3();
    }

    public void V8(com.alphainventor.filemanager.file.n n8) {
        this.b2 = n8.B();
    }

    public boolean V9() {
        return this.H1;
    }

    @Override
    public void W(int n8, Intent intent) {
        if (intent != null) {
            boolean bl = intent.hasExtra("custom_internal");
            int n9 = 0;
            if (bl) {
                if (intent.getIntExtra("custom_internal", 0) == 1) {
                    bl = intent.getBooleanExtra("show_chooser", false);
                    this.ba(this.j1, bl);
                    return;
                }
                ax.u3.b.f();
                return;
            }
            if (this.j1 != null && ax.c3.u.S(intent)) {
                ax.c3.w.b(intent.getData(), this.j1);
                this.A8(this.j1);
                return;
            }
            if (ax.c3.u.T(intent)) {
                k k8;
                if (intent.getData() != null && "http".equals(intent.getData().getScheme()) && (k8 = ax.o3.c.z(intent.getData().getPath())) != null && k8.e() != null) {
                    ArrayList<com.alphainventor.filemanager.file.n> arrayList = this.c1.N();
                    int n10 = arrayList.size();
                    for (n8 = n9; n8 < n10; ++n8) {
                        com.alphainventor.filemanager.file.n n11 = arrayList.get(n8);
                        if (!k8.e().equals(n11.E())) continue;
                        this.G8(n11);
                        return;
                    }
                }
                if (this.j1 != null) {
                    ax.c3.w.b(intent.getData(), this.j1);
                    this.G8(this.j1);
                    return;
                }
            } else {
                if (this.j1 != null && ax.c3.u.U(intent)) {
                    ax.c3.w.b(intent.getData(), this.j1);
                    this.R8(this.j1);
                    return;
                }
                this.B8(intent, n8, false, null);
            }
        }
    }

    @Override
    protected void W3(n.o o8) {
        super.W3(o8);
        if (this.f0() == null) {
            return;
        }
        this.W0.setBackgroundResource(2131230860);
        this.W0.s(true);
        this.d7();
        this.g9();
        if (this.X0()) {
            this.h7(true);
        }
        this.c1.g0(false);
    }

    public void W8() {
        this.M1 = true;
    }

    protected void W9(boolean bl) {
        View view;
        if (this.M0 == null && (view = (ViewStub)this.R0().findViewById(2131362340)) != null) {
            this.M0 = view.inflate();
        }
        if ((view = this.M0) != null) {
            if (bl) {
                view.setVisibility(0);
                return;
            }
            view.setVisibility(8);
        }
    }

    @Override
    protected void X3(n.o o8) {
        super.X3(o8);
        if (this.f0() == null) {
            return;
        }
        this.b1.c();
        this.h7(false);
        int n8 = ax.Q.b.c((Context)this.f0(), 2131100792);
        this.W0.setBackgroundColor(n8);
        this.W0.s(false);
        this.c1.g0(true);
    }

    protected void X6() {
        if (!this.S7()) {
            k0 k02 = this.K1;
            k0 k03 = k0.c0;
            if (k02 == k03 && (ax.Q2.f.X(this.z3()) || ax.Q2.f.p0(this.z3()))) {
                return;
            }
            if (this.K1 == k0.d0) {
                this.E1 = true;
            }
            this.v9(k03);
            this.B9(true);
            this.w7().K(this.f0(), this, this);
            return;
        }
        this.v9(k0.d0);
    }

    @Override
    public boolean Y3(int n8, KeyEvent keyEvent) {
        block12: {
            block20: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                block17: {
                                    block18: {
                                        block19: {
                                            if (keyEvent.getAction() != 0) break block12;
                                            if (n8 == 29) break block13;
                                            if (n8 == 31) break block14;
                                            if (n8 == 42) break block15;
                                            if (n8 == 50) break block16;
                                            if (n8 == 52) break block17;
                                            if (n8 == 132) break block18;
                                            if (n8 == 111) break block19;
                                            if (n8 == 112) {
                                                if (keyEvent.isShiftPressed()) {
                                                    this.J7(2131361939, false, true);
                                                } else {
                                                    this.J7(2131361931, false, true);
                                                }
                                                return true;
                                            }
                                            break block20;
                                        }
                                        if (keyEvent.hasNoModifiers() && this.K3()) {
                                            this.h3();
                                            return true;
                                        }
                                        break block15;
                                    }
                                    if (this.N0 != null && !this.V7()) {
                                        this.J7(2131361943, false, true);
                                    }
                                    return true;
                                }
                                if (keyEvent.isCtrlPressed()) {
                                    this.J7(2131361930, false, true);
                                    return true;
                                }
                                break block20;
                            }
                            if (keyEvent.isCtrlPressed()) {
                                this.a4();
                                return true;
                            }
                            break block20;
                        }
                        if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                            this.a7(true);
                            return true;
                        }
                        break block20;
                    }
                    if (keyEvent.isCtrlPressed()) {
                        this.J7(2131361928, false, true);
                        return true;
                    }
                    break block20;
                }
                if (keyEvent.isCtrlPressed()) {
                    keyEvent = this.N0;
                    if (keyEvent != null) {
                        this.b1.d((AbsListView)keyEvent);
                    }
                    return true;
                }
            }
            if ((n8 = keyEvent.getUnicodeChar()) >= 32) {
                return this.a9(n8);
            }
        }
        return false;
    }

    public boolean Y7() {
        return true;
    }

    void Y8(Menu menu) {
        this.i7(menu, 2131362517);
        menu = menu.findItem(2131362517);
        if (menu != null && !this.K6()) {
            menu.setEnabled(false);
        }
    }

    protected boolean Y9(String string) {
        return ax.t3.e.h(this.o3(), this.z3(), this.x3(), string, this.H1);
    }

    @Override
    public void Z3(String string) {
        Object object;
        if (this.n1 == null) {
            this.N7();
        }
        if (string != null && (object = this.n1) != null) {
            this.c2 = null;
            this.d2 = null;
            if (!((String)object).equals(string)) {
                if (this.X0() && !this.S7() && !ax.Q2.f.D0(this.z3()) && this.f1.b(string) != null) {
                    ax.Ha.b b8 = ax.Ha.c.h().b("!! ADDED BUT NOT CONNECT OPEN !!").j();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("location: ");
                    ((StringBuilder)object).append((Object)this.z3());
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.e1());
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.S3());
                    b8.g(((StringBuilder)object).toString()).h();
                }
                if (this.X0() && this.S3()) {
                    if (!this.S7()) {
                        this.L6();
                        this.p1 = string;
                        this.D1 = true;
                        this.X6();
                        return;
                    }
                    object = this.f1.b(string);
                    if (object != null) {
                        this.D8((com.alphainventor.filemanager.file.n)object);
                        return;
                    }
                    this.L6();
                    this.j7(string);
                    return;
                }
                this.p1 = string;
                this.D1 = true;
                return;
            }
            if (this.X0() && this.S7()) {
                this.j9();
            }
            if (this.f0() != null) {
                this.v3().w0(this.z3(), this.x3(), string, true);
            }
        }
    }

    void Z8(boolean bl, Object object) {
        if (bl) {
            this.h9();
            object = "success";
        } else {
            this.K4(this.N0(2131952325, this.A3().f(this.o3())), 1);
            this.i3("on_connect_result");
            object = "failure";
        }
        ax.Q2.a.i().m("network", "connect_cloud").c("loc", this.z3().I()).c("result", (String)object).e();
    }

    protected void a7(boolean bl) {
        if (!this.a8()) {
            return;
        }
        if (this.i1 != null && x.E1(this.o3(), this.i1, false)) {
            this.p9(3, this.i1);
            return;
        }
        ax.W2.m m8 = ax.W2.m.n();
        m8.k(this.w7(), this.n1, bl, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                super.a(b8, string, string2, arrayList, object);
                this.b.j9();
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        });
        this.P9(m8, bl);
    }

    public boolean a8() {
        if (this.w7() == null) {
            ax.u3.b.f();
            return false;
        }
        return this.w7().e0(this.v7());
    }

    protected void aa() {
        if (this.b() != null) {
            String string = this.M0(2131952335);
            String string2 = this.M0(2131951929);
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("/DCIM/Camera");
            this.y4(h.b.d0, string, string2, arrayList);
        }
    }

    @Override
    protected boolean b4(int n8) {
        boolean bl = false;
        switch (n8) {
            default: {
                return false;
            }
            case 2131362551: {
                ax.Q2.a.i().m("menu_folder", "view_settings").c("loc", this.z3().I()).e();
                this.N8();
                return true;
            }
            case 2131362518: 
            case 2131362519: {
                if (n8 == 2131362519) {
                    bl = true;
                }
                this.a7(bl);
                return true;
            }
            case 2131362502: 
        }
        ax.Q2.a.i().m("menu_folder", "analyze_path").c("loc", this.z3().I()).e();
        this.H6();
        return true;
    }

    public void b8(int n8, int n9) {
        this.c8(n8, n9, true);
        if (this.f0() != null) {
            this.v3().w0(this.z3(), this.x3(), this.n1, true);
        }
    }

    void b9() {
        if (ax.W2.w.c().f()) {
            Object object = ax.W2.w.c().d();
            String string = ax.W2.w.c().e();
            if (object == this.A3() && (object = this.n1) != null && ((String)object).equals(string)) {
                this.w9();
            }
        }
    }

    @Override
    public void c4(boolean bl) {
        if (bl) {
            this.w7().g();
            this.S6();
        }
        this.l9();
        this.k9(true);
    }

    protected void c7(List<com.alphainventor.filemanager.file.n> list, int n8) {
        boolean bl = ax.Q2.f.l(this.z3());
        if (this.O6(list)) {
            this.aa();
            return;
        }
        ax.W2.o.m(this.w7(), list, n8, bl, this, true, new l0(this){
            final E b;
            {
                this.b = e8;
                super(e8);
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                super.a(b8, string, string2, arrayList, object);
                this.b.h8(b8);
                if (b8 == h.b.c0 && arrayList != null && arrayList.size() > 0) {
                    this.b.z4(string, arrayList);
                    return;
                }
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
                super.b();
            }
        }, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c8(int n8, int n9, boolean bl) {
        r0 r02;
        block5: {
            Object object;
            block8: {
                block6: {
                    block7: {
                        if (!this.X0()) return;
                        if (this.d1()) {
                            return;
                        }
                        try {
                            if (this.T7()) break block5;
                            object = this.F0;
                            if (object == null) break block6;
                            if (!((SwipeRefreshLayout)object).m()) break block7;
                            object = "true";
                            break block8;
                        }
                        catch (Exception exception) {
                            break block5;
                        }
                    }
                    object = "false";
                    break block8;
                }
                object = "null";
            }
            ax.Ha.b b8 = ax.Ha.c.h().f().b("!! NOT CONNECT SCANTASK!!!!").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.z3().I());
            stringBuilder.append(",refreshing:");
            stringBuilder.append((String)object);
            stringBuilder.append(",connectionstatus:");
            stringBuilder.append((Object)this.K1);
            b8.g(stringBuilder.toString()).h();
            return;
        }
        this.M6();
        int n10 = this.z7();
        if (n10 != this.O0) {
            this.la(n10);
        }
        n10 = this.y7();
        if (this.c1.S() != n10) {
            this.c1.m0(n10);
            this.y9(this.v3().i0().x);
        }
        this.c1.A0();
        this.b9();
        this.W0.h(this.n1);
        this.u1 = r02 = new r0(this, n8, n9, bl);
        r02.i(new Void[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    void c9(boolean bl, Object object, String object2) {
        block8: {
            block9: {
                boolean bl2;
                block10: {
                    block12: {
                        String string;
                        boolean bl3;
                        block11: {
                            block7: {
                                bl3 = false;
                                if (!bl) break block7;
                                if ((object = object != null && object instanceof String ? (String)object : null) != null && !this.D1 && !this.E1) {
                                    this.u8((String)object, 0, 0);
                                } else {
                                    this.h9();
                                }
                                object = "success";
                                break block8;
                            }
                            if (this.Z0()) break block9;
                            string = this.N0(2131952325, object2);
                            bl2 = bl3;
                            object2 = string;
                            if (!ax.t3.j.o(this.o3())) break block10;
                            if (!(object instanceof String)) break block11;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append(string);
                            ((StringBuilder)object2).append(" : ");
                            ((StringBuilder)object2).append(object);
                            object = ((StringBuilder)object2).toString();
                            break block12;
                        }
                        bl2 = bl3;
                        object2 = string;
                        if (!(object instanceof Exception)) break block10;
                        object = (Exception)object;
                        bl2 = bl3;
                        object2 = string;
                        if (((Throwable)object).getMessage() == null) break block10;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(string);
                        ((StringBuilder)object2).append(" : ");
                        ((StringBuilder)object2).append(((Throwable)object).getMessage());
                        object = ((StringBuilder)object2).toString();
                    }
                    bl2 = true;
                    object2 = object;
                }
                if (bl2) {
                    this.I4((String)object2, 1);
                } else {
                    this.K4((String)object2, 1);
                }
            }
            this.i3("on_connect_result");
            object = "failure";
        }
        ax.Q2.a.i().m("network", "connect_remote").c("loc", this.z3().I()).c("result", (String)object).e();
    }

    protected boolean ca() {
        return false;
    }

    protected void d7() {
        this.Y0.f();
        this.Z0.a();
        this.a1.a();
    }

    protected boolean da(com.alphainventor.filemanager.file.o o8, com.alphainventor.filemanager.file.n n8) {
        ax.Q2.f f8 = o8.S();
        if (f8 != ax.Q2.f.o0 && f8 != ax.Q2.f.p0) {
            return !o8.c0(n8) && o8.u0(n8);
        }
        return "/DCIM/Camera".equals(n8.W());
    }

    protected boolean e7() {
        return true;
    }

    public void e9(String string, String string2, p p8, String string3, int n8, int n9) {
        this.f1.g(this.n1, this.i1, string, string2, p8, string3, n8, n9);
    }

    @Override
    public void f() {
        if (this.f0() == null) {
            return;
        }
        this.E4(2131952448, 1);
    }

    boolean f8(List<com.alphainventor.filemanager.file.n> object) {
        if (ax.Q2.f.F0(this.z3())) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!((com.alphainventor.filemanager.file.n)object.next()).isDirectory()) continue;
                return true;
            }
        }
        return false;
    }

    protected boolean fa() {
        return ax.t3.k.I() || this.H1;
        {
        }
    }

    @Override
    public void h3() {
        this.r9();
        super.h3();
        if (this.Y0.k() != 8) {
            ax.Ha.c.h().f().c("BOTTOM MENU VISIBILITY NOT GONE!!!!").h();
            this.Y0.y(8);
        }
    }

    protected void h8(h.b b8) {
        this.j9();
    }

    protected void h9() {
        if (this.D1) {
            this.j7(this.p1);
            this.D1 = false;
        } else if (this.o1) {
            this.j9();
        } else {
            this.b8(0, 0);
        }
        this.e4(false);
        this.E1 = false;
    }

    @Override
    public void i1(int n8, int n9, Intent intent) {
        super.i1(n8, n9, intent);
        if (n8 == 1002) {
            this.N6(true);
        }
    }

    @Override
    public void i4() {
        super.i4();
        if (this.K0 != null && this.L0 != null) {
            this.s9();
        }
    }

    void i7(Menu menu, int n8) {
        if ((menu = menu.findItem(n8)) != null) {
            if (this.i1 != null && this.T7()) {
                menu.setEnabled(true);
                return;
            }
            menu.setEnabled(false);
        }
    }

    protected void i8(boolean bl) {
        if (this.v3() != null) {
            this.v3().t0(this.z3(), this.x3(), this.n1, bl);
        }
    }

    protected void ia(Menu menu) {
        menu.findItem(2131362538).setShowAsActionFlags(8);
    }

    @Override
    public void j1(Activity object) {
        super.j1((Activity)object);
        this.G1 = (ax.Q2.f)((Object)this.j0().getSerializable("parent_location"));
        if (this.h1 != null) {
            ax.Ha.c.h().d("ATTACHED AGAIN!!!!!").g("").h();
        }
        object = ax.c3.x.e(this.A3());
        this.h1 = object;
        ((com.alphainventor.filemanager.file.o)object).n0();
        if (this.h1.i0()) {
            com.alphainventor.filemanager.service.b.f(this.o3()).e(this.h1);
        }
        this.N7();
        if (this.g1 == null) {
            this.g1 = new ax.r3.d(this.o3(), this.w7());
        }
        g.a().d("check_file_update", this.p2);
        g.a().d("local.intent.action.SHOW_CODEC_DOWNLOAD", this.o2);
    }

    @Override
    public void j3() {
        AbsListView absListView = this.N0;
        if (absListView != null) {
            absListView.requestFocus();
        }
    }

    @Override
    public void j4() {
        if (this.f0() == null) {
            return;
        }
        this.k4(this.h1, this.u7(false));
    }

    protected void j8(boolean bl) {
        if (bl) {
            this.i9();
            return;
        }
        this.oa();
    }

    public void j9() {
        a a8 = this.c1;
        if (a8 != null && a8.getCount() > 0 && this.o1) {
            this.k9(false);
            return;
        }
        this.k9(true);
    }

    protected void k8(List<com.alphainventor.filemanager.file.n> list) {
        if (!this.a8()) {
            this.Y0.o(2131361930, false);
            this.Y0.o(2131361943, false);
            this.Y0.o(2131361931, false);
        } else {
            this.Y0.o(2131361930, true);
            this.Y0.o(2131361943, true);
            this.Y0.o(2131361931, true);
        }
        this.Y0.l(2131689505);
        boolean bl = ax.c3.B.B(list);
        if (bl) {
            this.Y0.t(2131362545, false);
        }
        if (bl && this.f0() != null && QuickShareProvider.a((Context)this.f0()) && ax.Q2.f.l0(this.z3())) {
            this.Y0.t(2131362529, true);
        } else {
            this.Y0.t(2131362529, false);
        }
        if (ax.Q2.f.l0(this.z3())) {
            if (ax.c3.A.t(list)) {
                this.Y0.t(2131362505, false);
            } else {
                this.Y0.t(2131362505, true);
            }
        } else {
            this.Y0.t(2131362505, false);
        }
        if (ax.Q2.f.l0(this.z3())) {
            if (ax.c3.A.A(list)) {
                this.Y0.t(2131362512, true);
                return;
            }
            this.Y0.t(2131362512, false);
            return;
        }
        this.Y0.t(2131362512, false);
    }

    public void k9(boolean bl) {
        if (bl) {
            this.c8(0, 0, true);
            return;
        }
        this.c8(-1, -1, false);
    }

    @Override
    public void l(ax.W2.h h8, boolean bl) throws ax.b3.c {
        super.l(h8, bl);
        this.F6(this.i1, System.currentTimeMillis());
    }

    protected void l7(t.a a8, String string, ParcelFileDescriptor parcelFileDescriptor, com.alphainventor.filemanager.file.n n8, ax.c3.k k8, String string2, com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list) {
        if (!this.X9(o8.T())) {
            t t8 = t.n();
            t8.l(a8, string, parcelFileDescriptor, n8, k8, o8, string2, list, new l0(this){
                final E b;
                {
                    this.b = e8;
                    super(e8);
                }

                @Override
                public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                    super.a(b8, string, string2, arrayList, object);
                    this.b.j9();
                    this.b.y4(b8, string, string2, arrayList);
                }

                @Override
                public void b() {
                    super.b();
                }
            });
            try {
                this.l(t8, true);
                return;
            }
            catch (ax.b3.c c8) {
                this.J4(2131951927, 1);
            }
        }
    }

    protected void l8(com.alphainventor.filemanager.file.n n8) {
        if (n8 == null) {
            return;
        }
        if (!this.a8()) {
            this.Y0.o(2131361930, false);
            this.Y0.o(2131361943, false);
            this.Y0.o(2131361931, false);
        } else {
            this.Y0.o(2131361930, true);
            this.Y0.o(2131361943, true);
            this.Y0.o(2131361931, true);
        }
        this.Y0.l(2131689507);
        if (ax.Q2.f.l0(this.z3())) {
            if (ax.c3.A.s(n8)) {
                this.Y0.t(2131362505, false);
            } else {
                this.Y0.t(2131362505, true);
            }
        } else {
            this.Y0.t(2131362505, false);
        }
        if (this.f0() != null && QuickShareProvider.a((Context)this.f0()) && ax.Q2.f.l0(this.z3())) {
            if (n8.isDirectory()) {
                this.Y0.t(2131362529, true);
            } else {
                this.Y0.t(2131362529, false);
            }
        } else {
            this.Y0.t(2131362529, false);
        }
        if (ax.Q2.f.l0(this.z3())) {
            if (ax.c3.A.z(n8)) {
                this.Y0.t(2131362512, true);
            } else {
                this.Y0.t(2131362512, false);
            }
        } else {
            this.Y0.t(2131362512, false);
        }
        if (ax.t3.j.y(this.o3()) && n8.isDirectory() && ax.Q2.f.j(n8.P()) && ax.c3.B.P(n8)) {
            if (n8.h()) {
                y.b b8 = ((y)n8).H0();
                if (b8 == y.b.d0 || b8 == y.b.e0) {
                    this.Y0.r(2131362515, 2131952310);
                    this.Y0.t(2131362515, true);
                    this.Y0.p(2131362515, 2131231084);
                }
            } else {
                this.Y0.r(2131362515, 2131952267);
                this.Y0.t(2131362515, true);
                this.Y0.p(2131362515, 2131231067);
            }
        }
        this.Y0.t(2131362545, n8.isDirectory() ^ true);
        this.Y0.t(2131362524, n8.isDirectory() ^ true);
        this.Y0.t(2131362504, false);
        if (ax.t3.j.x(this.o3()) && this.R7()) {
            this.Y0.t(2131362546, true);
        } else {
            this.Y0.t(2131362546, false);
        }
        if (ax.t3.j.z(this.o3())) {
            this.Y0.t(2131362521, n8.isDirectory() ^ true);
        } else {
            this.Y0.t(2131362521, false);
        }
        if (this.z3() == ax.Q2.f.F0) {
            this.Y0.t(2131362523, true);
            return;
        }
        this.Y0.t(2131362523, false);
    }

    protected void m7(List<com.alphainventor.filemanager.file.n> list, com.alphainventor.filemanager.file.o o8, x.b b8, String string) {
        if (!this.X9(o8.T())) {
            t t8 = t.n();
            t8.m(list, o8, b8, string, new l0(this){
                final E b;
                {
                    this.b = e8;
                    super(e8);
                }

                @Override
                public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                    super.a(b8, string, string2, arrayList, object);
                    this.b.j9();
                    this.b.y4(b8, string, string2, arrayList);
                }

                @Override
                public void b() {
                    super.b();
                }
            });
            try {
                this.l(t8, true);
                return;
            }
            catch (ax.b3.c c8) {
                this.J4(2131951927, 1);
            }
        }
    }

    protected void m8(boolean bl, Object object) {
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        if (object != null) {
            Logger logger = r2;
            object = new StringBuilder();
            ((StringBuilder)object).append("Fragment onCreate SavedInstance : tag=");
            ((StringBuilder)object).append(this.O0());
            ((StringBuilder)object).append(",hidden=");
            ((StringBuilder)object).append(this.Z0());
            logger.severe(((StringBuilder)object).toString());
            if (this.e7() && this.Z0()) {
                try {
                    this.f0().getSupportFragmentManager().o().q(this).j();
                    return;
                }
                catch (Exception exception) {
                    ax.Ha.c.h().b("remove saved instance error").l(exception).h();
                }
            }
        }
    }

    public void n7(x.b object) {
        Object object2;
        List<com.alphainventor.filemanager.file.n> list;
        block15: {
            block16: {
                block8: {
                    block9: {
                        block12: {
                            t.a a8;
                            block13: {
                                block14: {
                                    block11: {
                                        block10: {
                                            if (this.f0() == null) break block8;
                                            list = this.q1;
                                            if (list == null) {
                                                list = ax.Ha.c.h().d("EXTRACTTO!!!:NULL");
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append("type:");
                                                stringBuilder.append(((Enum)object).name());
                                                ((ax.Ha.b)((Object)list)).g(stringBuilder.toString()).h();
                                                return;
                                            }
                                            object2 = this.r1;
                                            this.q1 = null;
                                            this.r1 = null;
                                            if (list.size() != 1) break block9;
                                            object2 = (com.alphainventor.filemanager.file.n)list.get(0);
                                            a8 = t.k(((com.alphainventor.filemanager.file.n)object2).B());
                                            if (!ax.c3.B.H((com.alphainventor.filemanager.file.n)object2)) break block10;
                                            list = (ax.c3.k)object2;
                                            break block11;
                                        }
                                        if (!((com.alphainventor.filemanager.file.n)object2).N().exists()) break block12;
                                        File file = ((com.alphainventor.filemanager.file.n)object2).N();
                                        list = ax.c3.x.f(file);
                                        try {
                                            list = (y)((com.alphainventor.filemanager.file.o)((Object)list)).z(file.getAbsolutePath());
                                        }
                                        catch (ax.b3.j j8) {
                                            this.E4(2131951927, 1);
                                            return;
                                        }
                                    }
                                    int n8 = f0.a[((Enum)object).ordinal()];
                                    if (n8 == 1) break block13;
                                    if (n8 == 2) break block14;
                                    if (n8 == 3) {
                                        this.q8(this.A3(), a8, ((com.alphainventor.filemanager.file.n)object2).B(), null, (com.alphainventor.filemanager.file.n)object2, (ax.c3.k)((Object)list), null);
                                        return;
                                    }
                                    break block8;
                                }
                                object = d0.e(((com.alphainventor.filemanager.file.n)object2).T(), ((com.alphainventor.filemanager.file.n)object2).B());
                                this.l7(a8, ((com.alphainventor.filemanager.file.n)object2).B(), null, (com.alphainventor.filemanager.file.n)object2, (ax.c3.k)((Object)list), (String)object, this.w7(), null);
                                return;
                            }
                            object = ((com.alphainventor.filemanager.file.n)object2).T();
                            this.l7(a8, ((com.alphainventor.filemanager.file.n)object2).B(), null, (com.alphainventor.filemanager.file.n)object2, (ax.c3.k)((Object)list), (String)object, this.w7(), null);
                            return;
                        }
                        object = ax.Ha.c.h().f().b("INVALID EXTRACT SOURCE FILE INFO");
                        list = new StringBuilder();
                        ((StringBuilder)((Object)list)).append("loc:");
                        ((StringBuilder)((Object)list)).append(this.z3().I());
                        ((StringBuilder)((Object)list)).append(",info:");
                        ((StringBuilder)((Object)list)).append(((com.alphainventor.filemanager.file.n)object2).P().I());
                        ((ax.Ha.b)object).g(((StringBuilder)((Object)list)).toString()).h();
                        this.E4(2131951927, 1);
                        ax.u3.b.f();
                        return;
                    }
                    int n9 = f0.a[((Enum)object).ordinal()];
                    if (n9 == 1 || n9 == 2) break block15;
                    if (n9 == 3) break block16;
                }
                return;
            }
            this.r8(this.A3(), new f.j(){
                final List a;
                final x.b b;
                final E c;
                {
                    this.c = e8;
                    this.a = list;
                    this.b = b8;
                }

                @Override
                public void a() {
                }

                @Override
                public void b() {
                }

                @Override
                public void c(com.alphainventor.filemanager.file.o object, com.alphainventor.filemanager.file.n n8) {
                    if (n8 != null) {
                        object = this.c;
                        ((E)object).m7(this.a, ((E)object).w7(), this.b, n8.E());
                    }
                }
            });
            return;
        }
        this.m7(list, this.w7(), (x.b)((Object)object), (String)object2);
    }

    public void n8() {
        if (ax.Q2.f.m0(this.z3())) {
            Comparable<StringBuilder> comparable;
            if (this.n1 == null) {
                ax.Ha.b b8 = ax.Ha.c.h().b("no current path onSettingsChanged");
                comparable = new StringBuilder();
                comparable.append("location:");
                comparable.append((Object)this.z3());
                b8.g(comparable.toString()).h();
            }
            if (!ax.t3.e.j(this.o3(), this.z3(), this.x3(), this.n1, this.H1).equals(this.P0)) {
                this.g1.D(this.z3().t());
                comparable = this.i1;
                if (comparable != null && d0.E((com.alphainventor.filemanager.file.n)comparable)) {
                    this.T6();
                }
            }
        }
        this.h9();
        if (this.f0() != null) {
            this.J3();
        }
    }

    protected void n9(K k8, boolean bl) {
        this.o9(0, k8, null, bl);
    }

    public void na(String string) {
        if (this.n1 != null && !d0.D(this.A3(), this.n1)) {
            if (!this.S7()) {
                this.i3(string);
                return;
            }
            this.L8();
            ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", this.z3().I()).c("by", "toolbar_back").e();
            return;
        }
        this.i3(string);
    }

    public void o9(int n8, K k8, String string, boolean bl) {
        this.v3().R(n8, k8, string, false, bl);
        this.T8();
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3()) {
            View view;
            if (!bl) {
                this.K0.setClipToPadding(false);
                view = this.K0;
                view.setPadding(view.getPaddingLeft(), this.K0.getPaddingTop(), this.K0.getPaddingRight(), b8.d);
                this.L0.setClipToPadding(false);
                view = this.L0;
                view.setPadding(view.getPaddingLeft(), this.L0.getPaddingTop(), this.L0.getPaddingRight(), b8.d);
            }
            if ((view = this.V0) != null) {
                view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
                if (!bl) {
                    view.bottomMargin = b8.d;
                    return;
                }
                view.bottomMargin = 0;
            }
        }
    }

    public void p8(V v8, boolean bl) {
        com.alphainventor.filemanager.file.n n8 = this.t1;
        if (n8 == null) {
            ax.Ha.c.h().d("OPEN AS FILEINFO == null").h();
            return;
        }
        if (ax.c3.B.P(n8)) {
            this.E8(n8, v8.h(), bl);
            return;
        }
        if (ax.c3.B.J(n8)) {
            this.v8((com.alphainventor.filemanager.file.i)n8, v8.h(), bl);
            return;
        }
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
        arrayList.add(n8);
        this.f3(this.w7(), arrayList, new n.p(){
            final com.alphainventor.filemanager.file.n a;
            final V b;
            final boolean c;
            final E d;
            {
                this.d = e8;
                this.a = n8;
                this.b = v8;
                this.c = bl;
            }

            @Override
            public void a() {
                if (!this.d.X0()) {
                    return;
                }
                this.d.E8(this.a, this.b.h(), this.c);
            }
        });
    }

    public void p9(int n8, com.alphainventor.filemanager.file.n object) {
        Object object2;
        if (ax.c3.B.P((com.alphainventor.filemanager.file.n)object)) {
            object2 = (y)object;
            object = ((y)object2).B0();
            object2 = ((y)object2).M0();
        } else {
            object = ((com.alphainventor.filemanager.file.n)object).R();
            object2 = null;
        }
        if (j.F().E0((K)object) && object2 != null && y.U0((K)object, (String)object2)) {
            this.M9();
            return;
        }
        this.o9(n8, (K)object, (String)object2, false);
    }

    @Override
    public void q() {
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689493);
        this.O7(menu);
        this.ia(menu);
        if (!this.z3().P()) {
            menu.removeItem(2131362551);
        }
    }

    protected void q8(K object, t.a a8, String string, ParcelFileDescriptor parcelFileDescriptor, com.alphainventor.filemanager.file.n n8, ax.c3.k k8, List<com.alphainventor.filemanager.file.n> list) {
        object = ax.a3.f.F3(this, (K)object);
        ((ax.a3.f)object).P3(new f.j(){
            final t.a a;
            final String b;
            final ParcelFileDescriptor c;
            final com.alphainventor.filemanager.file.n d;
            final ax.c3.k e;
            final List f;
            final E g;
            {
                this.g = e8;
                this.a = a8;
                this.b = string;
                this.c = parcelFileDescriptor;
                this.d = n8;
                this.e = k8;
                this.f = list;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a() {
                ParcelFileDescriptor parcelFileDescriptor = this.c;
                if (parcelFileDescriptor == null) return;
                try {
                    parcelFileDescriptor.close();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }

            @Override
            public void b() {
            }

            @Override
            public void c(com.alphainventor.filemanager.file.o o8, com.alphainventor.filemanager.file.n n8) {
                if (n8 != null) {
                    this.g.l7(this.a, this.b, this.c, this.d, this.e, n8.E(), o8, this.f);
                }
            }
        });
        this.A((e)object, "directory", true);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558554, null);
    }

    protected void r8(K object, f.j j8) {
        object = ax.a3.f.F3(this, (K)object);
        ((ax.a3.f)object).P3(j8);
        this.A((e)object, "directory", true);
    }

    @Override
    public void s1() {
        super.s1();
        this.V6();
    }

    protected ax.x3.d s7() {
        return this.Y0;
    }

    protected void s9() {
        if (this.v3().g0().g()) {
            this.K0.setMultiChoiceModeListener(this.i2);
            this.L0.setMultiChoiceModeListener(this.i2);
            this.K0.setOnItemClickListener(this.E7());
            this.L0.setOnItemClickListener(this.E7());
            this.d1.p0(this.E7());
            this.e1.p0(this.E7());
            return;
        }
        this.K0.setMultiChoiceModeListener(this.h2);
        this.L0.setMultiChoiceModeListener(this.h2);
        this.K0.setOnItemClickListener(this.A7());
        this.L0.setOnItemClickListener(this.A7());
        this.d1.p0(this.A7());
        this.e1.p0(this.A7());
    }

    @Override
    public void t(int n8, int n9) {
        super.t(n8, n9);
        this.y9(n8);
    }

    protected AbsListView t7() {
        return this.N0;
    }

    @Override
    public void u1() {
        super.u1();
        this.g1.f();
    }

    protected void u8(String string, int n8, int n9) {
        this.n1 = string;
        this.i1 = null;
        this.o1 = false;
        this.b8(n8, n9);
        this.e4(false);
        this.V6();
    }

    @Override
    public void v1() {
        super.v1();
        this.f1.a();
        this.L6();
        Object object = this.h1;
        if (object != null) {
            int n8 = ((com.alphainventor.filemanager.file.o)object).U();
            object = r2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.z3().I());
            stringBuilder.append(" retain count : ");
            stringBuilder.append(n8);
            ((Logger)object).fine(stringBuilder.toString());
            if (this.h1.i0()) {
                com.alphainventor.filemanager.service.b.f(this.o3()).o(this.h1);
            }
            this.h1.k0(false);
            this.v9(k0.e0);
        }
        if (this.H1) {
            h.S(this.A3()).G0();
        }
        g.a().h(this.p2);
        g.a().h(this.n2);
        g.a().h(this.o2);
    }

    protected com.alphainventor.filemanager.file.n v7() {
        return this.i1;
    }

    protected void v9(k0 k02) {
        this.K1 = k02;
    }

    public com.alphainventor.filemanager.file.o w7() {
        int n8 = this.h1.U();
        if (n8 <= 0 && this.I1) {
            this.I1 = false;
            Object object = ax.Ha.c.h().d("FGFO").j();
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.d1());
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append(this.X0());
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append(this.z3().I());
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append(this.h1.R());
            ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
            object2 = r2;
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid operator retain count: ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" location:");
            ((StringBuilder)object).append(this.z3().I());
            ((Logger)object2).severe(((StringBuilder)object).toString());
            ((Logger)object2).severe("------stack trace------");
            new RuntimeException().printStackTrace();
            ((Logger)object2).severe("-----------------------");
        }
        return this.h1;
    }

    void w9() {
        this.e2 = ax.W2.w.c().b();
        ax.W2.w.c().a();
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl) {
            this.X6();
            return;
        }
        this.V6();
    }

    @Override
    public int x3() {
        if (this.F1 < 0) {
            this.F1 = this.j0().getInt("location_key");
        }
        return this.F1;
    }

    public ax.V2.c x7() {
        return ax.V2.c.d(this.A3());
    }

    protected void x9(View.OnClickListener onClickListener) {
        this.Q0.setOnClickListener(onClickListener);
    }

    @Override
    public abstract ax.Q2.f z3();

    protected int z7() {
        int n8;
        int n9 = this.D7();
        if (!this.z3().P()) {
            n8 = n9;
        } else {
            n8 = n9;
            if (ax.Q2.f.m0(this.z3())) {
                Object object = this.i1;
                object = object == null ? this.n1 : ((com.alphainventor.filemanager.file.n)object).E();
                if (d0.D(this.A3(), (String)object)) {
                    if (n9 == 2) {
                        return 12;
                    }
                    return 10;
                }
                n8 = n9;
                if (n9 == 2) {
                    n8 = 16;
                }
            }
        }
        return n8;
    }

    static final class k0
    extends Enum<k0> {
        public static final /* enum */ k0 c0;
        public static final /* enum */ k0 d0;
        public static final /* enum */ k0 e0;
        private static final k0[] f0;
        public static final /* enum */ k0 q;

        static {
            q = new k0();
            c0 = new k0();
            d0 = new k0();
            e0 = new k0();
            f0 = k0.d();
        }

        private static /* synthetic */ k0[] d() {
            return new k0[]{q, c0, d0, e0};
        }

        public static k0 valueOf(String string) {
            return Enum.valueOf(k0.class, string);
        }

        public static k0[] values() {
            return (k0[])f0.clone();
        }
    }

    class l0
    implements h.a {
        final E a;

        l0(E e8) {
            this.a = e8;
        }

        @Override
        public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
            this.a.S6();
        }

        @Override
        public void b() {
        }
    }

    static class m0
    implements AbsListView.OnScrollListener {
        AbsListView a;
        int b;
        final Runnable c = new Runnable(this){
            final m0 q;
            {
                this.q = m02;
            }

            @Override
            public void run() {
                m0 m02 = this.q;
                if (m02.b == 0) {
                    m02.a.setFastScrollEnabled(false);
                }
            }
        };
        final Runnable d = new Runnable(this){
            final m0 q;
            {
                this.q = m02;
            }

            @Override
            public void run() {
                m0 m02 = this.q;
                if (m02.b == 2) {
                    m02.a.setFastScrollEnabled(true);
                }
            }
        };

        m0(AbsListView absListView) {
            this.a = absListView;
        }

        public void onScroll(AbsListView absListView, int n8, int n9, int n10) {
            if (this.b == 0) {
                this.a.removeCallbacks(this.c);
                if (this.a.isFastScrollEnabled()) {
                    this.a.postDelayed(this.c, 500L);
                }
            }
        }

        public void onScrollStateChanged(AbsListView object, int n8) {
            object = (a)this.a.getAdapter();
            if (object == null) {
                return;
            }
            this.a.removeCallbacks(this.d);
            this.a.removeCallbacks(this.c);
            boolean bl = n8 == 2;
            object.q0(bl);
            if (n8 == 2) {
                int n9 = this.a.getChildCount();
                int n10 = object.getCount();
                if (n9 > 0 && n10 / n9 >= 4) {
                    this.a.postDelayed(this.d, 1000L);
                }
            } else if (n8 != 0) {
                if (this.a.isFastScrollEnabled()) {
                    this.a.postDelayed(this.c, 500L);
                }
            } else if (n8 == 0 && this.a.isFastScrollEnabled()) {
                this.a.postDelayed(this.c, 100L);
            }
            this.b = n8;
        }
    }

    private class n0
    extends q<String, Void, com.alphainventor.filemanager.file.n> {
        com.alphainventor.filemanager.file.o h;
        Throwable i;
        String j;
        final E k;

        public n0(E e8, String string) {
            this.k = e8;
            super(q.e.d0);
            this.h = e8.w7();
            this.j = string;
        }

        @Override
        protected void o() {
            this.k.w7().k0(false);
        }

        @Override
        protected void r() {
            this.h.n0();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected com.alphainventor.filemanager.file.n w(String ... object) {
            ax.b3.j j82;
            block4: {
                try {
                    if (!this.k.S7() && !ax.Q2.f.D0(this.k.z3())) {
                        return null;
                    }
                }
                catch (ax.b3.j j82) {
                    break block4;
                }
                object = this.h.z(this.j);
                if (object != null) {
                    object.n();
                }
                return object;
            }
            j82.printStackTrace();
            this.i = j82;
            return null;
        }

        protected void x(com.alphainventor.filemanager.file.n n8) {
            this.h.k0(false);
            if (n8 != null) {
                if (n8.n()) {
                    this.k.D8(n8);
                    return;
                }
                this.k.B9(false);
                this.k.E4(2131952548, 1);
                this.k.k9(true);
                return;
            }
            this.k.B9(false);
            if (this.k.i1 == null) {
                this.k.S9(this.i, false);
                return;
            }
            this.k.E4(2131951934, 1);
        }
    }

    class o0
    extends q<String, Void, List<com.alphainventor.filemanager.file.n>> {
        private List<com.alphainventor.filemanager.file.n> h;
        final E i;

        o0(E e8, List<com.alphainventor.filemanager.file.n> list) {
            this.i = e8;
            super(q.e.e0);
            this.h = list;
        }

        @Override
        protected void r() {
            this.i.W9(true);
        }

        protected List<com.alphainventor.filemanager.file.n> w(String ... stringArray) {
            return this.i.r7(this.h);
        }

        protected void x(List<com.alphainventor.filemanager.file.n> list) {
            this.i.W9(false);
            if (list != null && !list.isEmpty()) {
                try {
                    QuickShareProvider.c().d((Context)this.i.f0(), this.i.i1, list);
                    return;
                }
                catch (Exception exception) {
                    this.i.E4(2131951927, 1);
                    return;
                }
            }
            this.i.E4(2131951935, 1);
        }
    }

    protected class p0
    extends q<String, Void, Void> {
        final E h;

        p0(E e8) {
            this.h = e8;
            super(q.e.d0);
        }

        protected Void w(String ... stringArray) {
            this.h.w7().b();
            return null;
        }

        protected void x(Void void_) {
            E.x6(this.h, true);
            this.h.X6();
        }
    }

    private class q0
    extends q<Void, Integer, Boolean> {
        List<com.alphainventor.filemanager.file.n> h;
        com.alphainventor.filemanager.file.o i;
        private boolean j;
        private String k;
        private ax.c3.k0 l;
        private com.alphainventor.filemanager.file.n m;
        final E n;

        public q0(E e8, List<com.alphainventor.filemanager.file.n> list, com.alphainventor.filemanager.file.n n8) {
            this.n = e8;
            super(q.e.g0);
            this.h = new ArrayList<com.alphainventor.filemanager.file.n>(list);
            this.i = e8.w7();
            this.j = false;
            this.m = n8;
        }

        @Override
        protected void o() {
            if (!this.j) {
                this.i.k0(false);
                this.j = true;
                this.k = "onCancel";
                return;
            }
            ax.Ha.c.h().f().c("SCANMORETASK RELEASE TWICE 2").g(this.k).h();
        }

        @Override
        protected void r() {
            this.i.n0();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Void ... object) {
            boolean bl = d0.E(this.m);
            if (!this.i.q0()) {
                return Boolean.FALSE;
            }
            if (this.i.d0() && ax.Q2.f.n0(this.n.z3()) && bl) {
                if (this.isCancelled()) {
                    return Boolean.FALSE;
                }
                if (!this.n.S7()) {
                    return Boolean.FALSE;
                }
                try {
                    this.l = this.i.W();
                    this.v(-1);
                }
                catch (ax.b3.j j8) {
                    // empty catch block
                }
            }
            if (!ax.Q2.f.B0(this.n.z3())) {
                return Boolean.FALSE;
            }
            if (!this.n.S7() && ax.Q2.f.D0(this.n.z3())) {
                try {
                    this.i.z(this.n.z3().r());
                }
                catch (ax.b3.j j9) {
                    // empty catch block
                }
            }
            int n8 = 0;
            while (true) {
                block17: {
                    ax.b3.j j102222;
                    block20: {
                        block19: {
                            block18: {
                                if (n8 >= this.h.size()) {
                                    return Boolean.TRUE;
                                }
                                if (this.isCancelled()) {
                                    return Boolean.FALSE;
                                }
                                if (!this.n.S7()) {
                                    return Boolean.FALSE;
                                }
                                object = this.h.get(n8);
                                try {
                                    if (!object.isDirectory()) break block17;
                                    if (!this.i.u0((com.alphainventor.filemanager.file.n)object)) break block18;
                                    this.i.q((com.alphainventor.filemanager.file.n)object, m.f.q);
                                    break block19;
                                }
                                catch (ax.b3.j j102222) {
                                    break block20;
                                }
                            }
                            this.i.s((com.alphainventor.filemanager.file.n)object, m.f.q);
                        }
                        this.v(n8);
                        break block17;
                    }
                    j102222.printStackTrace();
                    return Boolean.FALSE;
                    catch (ax.b3.e e8) {}
                }
                ++n8;
            }
        }

        protected void x(Boolean bl) {
            if (!this.j) {
                this.i.k0(false);
                this.j = true;
                this.k = "onPost";
            } else {
                ax.Ha.c.h().f().c("SCANMORETASK RELEASE TWICE 1").g(this.k).h();
            }
            if (this.n.X0() && !this.n.d1() && bl.booleanValue()) {
                this.n.g8();
            }
        }

        protected void y(Integer ... object) {
            if (this.n.X0()) {
                boolean bl = false;
                int n8 = object[0];
                if (n8 == -1) {
                    object = this.l;
                    if (object != null) {
                        this.n.W0.setStorageSpace((ax.c3.k0)object);
                        if (this.l.b == 0L && this.i.S() != ax.Q2.f.P0) {
                            object = ax.Ha.c.h().f().b("StorageSpace Total 0");
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("LOC:");
                            stringBuilder.append(this.i.S().I());
                            stringBuilder.append(",used > 0:");
                            if (this.l.a > 0L) {
                                bl = true;
                            }
                            stringBuilder.append(bl);
                            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                            return;
                        }
                    }
                } else {
                    Object object2;
                    object = this.h.get(n8);
                    if (n8 < this.n.c1.getCount() && this.n.c1.getItem(n8) == object && (object2 = this.n.N0.getChildAt(n8 - this.n.N0.getFirstVisiblePosition())) != null && ((a.c)(object2 = (a.c)object2.getTag())).A() != null && ((a.c)object2).A().equals(((com.alphainventor.filemanager.file.n)object).Q())) {
                        ((a.c)object2).y((com.alphainventor.filemanager.file.n)object, n8);
                    }
                }
            }
        }
    }

    private class r0
    extends q<Void, Void, List<com.alphainventor.filemanager.file.n>> {
        ax.b3.j h;
        boolean i;
        private int j;
        private int k;
        private com.alphainventor.filemanager.file.o l;
        private boolean m;
        private String n;
        private long o;
        private long p;
        private boolean q;
        private ax.c3.k0 r;
        private boolean s;
        private com.alphainventor.filemanager.file.n t;
        private boolean u;
        final E v;

        public r0(E e8, int n8, int n9, boolean bl) {
            this.v = e8;
            super(q.e.d0);
            this.h = null;
            this.i = e8.b2 != null ? true : bl;
            this.j = n8;
            this.k = n9;
            this.l = e8.w7();
            this.m = false;
            this.o = -1L;
            this.p = -1L;
            this.s = false;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void B() throws ax.b3.j {
            Throwable throwable2;
            if (this.v.f0() == null) {
                return;
            }
            h h8 = ax.T2.h.S(this.v.A3());
            if (!h8.k0()) {
                CountDownLatch countDownLatch;
                block10: {
                    countDownLatch = new CountDownLatch(1);
                    this.v.B9(true);
                    Object object = this.v.X1;
                    ax.u3.c c8 = new Runnable(this){
                        final r0 q;
                        {
                            this.q = r02;
                        }

                        @Override
                        public void run() {
                            this.q.I();
                        }
                    };
                    object.post((Runnable)((Object)c8));
                    this.u = false;
                    object = new h.g(){
                        final CountDownLatch a;
                        final r0 b;
                        {
                            this.b = r02;
                            this.a = countDownLatch;
                        }

                        @Override
                        public void a() {
                        }

                        @Override
                        public void b() {
                            this.b.v.X1.post(new Runnable(this){
                                final c q;
                                {
                                    this.q = c8;
                                }

                                @Override
                                public void run() {
                                    this.q.b.E();
                                    this.q.a.countDown();
                                }
                            });
                        }

                        @Override
                        public void c(String string, boolean bl) {
                        }

                        @Override
                        public void d(int n8) {
                            this.b.v.X1.post(new Runnable(){
                                final c c0;
                                final int q;
                                {
                                    this.c0 = c8;
                                    this.q = n8;
                                }

                                @Override
                                public void run() {
                                    this.c0.b.v.S0.setText(this.q);
                                }
                            });
                        }
                    };
                    c8 = new ax.u3.c(this){
                        final r0 a;
                        {
                            this.a = r02;
                        }

                        @Override
                        public boolean isCancelled() {
                            return this.a.u;
                        }
                    };
                    h8.f(false, (h.g)object, c8);
                    {
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (ax.b3.a a8) {}
                        {
                            this.v.I9(false);
                        }
                    }
                    try {
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                countDownLatch.await(5L, TimeUnit.SECONDS);
                throw throwable2;
            }
            this.o = h8.Y(this.t);
            this.p = h8.F(this.t);
            return;
            catch (InterruptedException interruptedException) {
                throw throwable2;
            }
        }

        private void C() {
            com.alphainventor.filemanager.shizuku.c.t().m(new i.a(this){
                final r0 a;
                {
                    this.a = r02;
                }

                @Override
                public void a(boolean bl) {
                }

                @Override
                public void b() {
                    if (this.a.v.X0()) {
                        this.a.v.c4(false);
                    }
                }

                @Override
                public void c() {
                }
            });
        }

        private void E() {
            this.v.ka(false);
            this.v.S0.setText((CharSequence)"");
            if (this.v.T0 != null) {
                this.v.T0.setVisibility(8);
                this.v.T0.setOnClickListener(null);
            }
        }

        private void G(com.alphainventor.filemanager.file.n object) {
            y y8;
            if (ax.X2.Q.L() && ax.c3.B.P((com.alphainventor.filemanager.file.n)object) && !this.v.v3().M() && ax.X2.Q.f() && (y8 = (y)object).a1() && !y8.T0()) {
                if (!ax.X2.Q.C1()) {
                    object = y8.M0();
                } else {
                    ax.u3.b.f();
                    object = null;
                }
                if (object != null) {
                    ax.Z2.j.F().E0(y8.B0());
                }
                this.v.v3().R(0, this.v.A3(), (String)object, true, true);
            }
        }

        private void H(List<com.alphainventor.filemanager.file.n> list, Set<String> set) {
            block7: {
                block6: {
                    if (set.isEmpty()) break block6;
                    this.v.N0.clearChoices();
                    int n8 = 0;
                    for (int i8 = 0; i8 < list.size(); ++i8) {
                        int n9 = n8;
                        if (set.contains(list.get(i8).E())) {
                            this.v.N0.setItemChecked(i8, true);
                            n9 = n8 + 1;
                        }
                        n8 = n9;
                    }
                    if (n8 != 0) break block7;
                    if (this.v.K3()) {
                        this.v.h3();
                    }
                }
                return;
            }
            this.v.I3();
        }

        private void I() {
            if (this.v.f0() != null) {
                this.v.ka(true);
                this.v.R0.setText((CharSequence)"");
                this.v.S0.setText((CharSequence)"");
                if (this.v.T0 != null) {
                    this.v.T0.setVisibility(0);
                    this.v.T0.setOnClickListener(new View.OnClickListener(this){
                        final r0 a;
                        {
                            this.a = r02;
                        }

                        public void onClick(View view) {
                            r0.x(this.a, true);
                        }
                    });
                    this.v.T0.setText(0x1040000);
                }
            }
        }

        static /* synthetic */ boolean x(r0 r02, boolean bl) {
            r02.u = bl;
            return bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected List<com.alphainventor.filemanager.file.n> D(Void ... object) {
            ax.b3.e e82;
            block23: {
                ax.b3.j j82;
                block22: {
                    Iterator iterator;
                    boolean bl;
                    block21: {
                        block24: {
                            if (this.v.n1 == null) {
                                return null;
                            }
                            if (!this.v.S7() && !ax.Q2.f.D0(this.v.z3())) {
                                return null;
                            }
                            object = this.v.i1;
                            this.t = object;
                            if (object == null) {
                                try {
                                    this.t = object = this.l.z(this.v.n1);
                                    E.Y4(this.v, (com.alphainventor.filemanager.file.n)object);
                                }
                                catch (ax.b3.j j9) {
                                    j9.printStackTrace();
                                    this.h = j9;
                                    return null;
                                }
                            }
                            if (this.v.i1 == null) return null;
                            object = this.t;
                            if (object == null) {
                                return null;
                            }
                            if (!object.n()) {
                                this.t = null;
                                E.Y4(this.v, null);
                                this.h = new ax.b3.t("ScanTask : File not exist");
                                return null;
                            }
                            if (!this.t.isDirectory()) {
                                object = ax.Ha.c.h().f().d("SCANOTD");
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(this.v.z3().I());
                                stringBuilder.append(":");
                                stringBuilder.append(this.v.n1);
                                object.g(stringBuilder.toString()).h();
                                this.t = null;
                                E.Y4(this.v, null);
                                object = new StringBuilder();
                                object.append("ScanTask : not directory (");
                                object.append(this.v.n1);
                                object.append(")");
                                this.h = new ax.b3.j(object.toString());
                                return null;
                            }
                            if (this.isCancelled()) {
                                return null;
                            }
                            bl = d0.E(this.t);
                            if (ax.Q2.f.h(this.v.z3()) && bl) {
                                this.r = this.l.W();
                            }
                            if (ax.Q2.f.J0 != this.v.z3() || !com.alphainventor.filemanager.file.Q.B0(this.t.E())) break block24;
                            try {
                                this.r = ((com.alphainventor.filemanager.file.Q)this.l.u()).u0(this.t);
                            }
                            catch (ax.b3.j j10) {}
                        }
                        if ((object = this.v.i1) != (iterator = this.t)) {
                            return null;
                        }
                        try {
                            if (!this.v.da(this.l, (com.alphainventor.filemanager.file.n)((Object)iterator))) break block21;
                            this.v.B9(true);
                        }
                        catch (ax.b3.j j82) {
                            break block22;
                        }
                        catch (ax.b3.e e82) {
                            break block23;
                        }
                    }
                    if (this.v.H1) {
                        this.B();
                    }
                    object = this.v;
                    E.a6((E)object, object.G7(((E)object).n1));
                    object = this.v.z3() == ax.Q2.f.z0 && ax.c3.q.f(this.v.P0) ? m.f.c0 : m.f.q;
                    iterator = this.l.g0(this.t, (m.f)((Object)object), true, true);
                    if (this.t instanceof com.alphainventor.filemanager.file.C && iterator != null && iterator.size() > 500) {
                        this.v.B9(true);
                    }
                    object = this.v;
                    this.q = bl = object.Y9(((E)object).n1);
                    object = ax.c3.B.h((List<com.alphainventor.filemanager.file.n>)((Object)iterator), null, bl, ax.c3.B.P(this.t));
                    long l8 = System.currentTimeMillis();
                    object = ax.c3.q.g((List<com.alphainventor.filemanager.file.n>)object, ax.c3.q.c(this.v.P0));
                    Object object22 = r2;
                    iterator = new Iterator();
                    ((StringBuilder)((Object)iterator)).append("sort files : ");
                    ((StringBuilder)((Object)iterator)).append(System.currentTimeMillis() - l8);
                    ((Logger)object22).fine(((StringBuilder)((Object)iterator)).toString());
                    if (ax.Q2.f.h0(this.t) && object != null) {
                        for (Object object22 : object) {
                            ((v)object22).r1();
                            if (object22.n()) continue;
                            this.s = true;
                            break;
                        }
                    }
                    if (object != null) return object;
                    object22 = new StringBuilder();
                    ((StringBuilder)object22).append("List returns null! : cache =");
                    ((StringBuilder)object22).append(this.l.c0(this.t));
                    iterator = new Iterator(((StringBuilder)object22).toString());
                    this.h = iterator;
                    return object;
                }
                j82.printStackTrace();
                this.h = j82;
                return null;
            }
            e82.printStackTrace();
            this.h = e82;
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void F(List<com.alphainventor.filemanager.file.n> var1_1) {
            block54: {
                block52: {
                    block53: {
                        E.U5(this.v, false);
                        if (!this.v.X0() || this.v.d1()) break block52;
                        this.v.B9(false);
                        var5_3 = E.X4(this.v);
                        var6_4 = this.t;
                        if (var5_3 == var6_4) ** GOTO lbl23
                        if (this.m) break block53;
lbl10:
                        // 3 sources

                        while (true) {
                            this.l.k0(false);
                            this.m = true;
                            this.n = "onPost";
                            ** GOTO lbl18
                            break;
                        }
                    }
lbl16:
                    // 3 sources

                    while (true) {
                        ax.Ha.c.h().f().c("SCANTASK RELEASE TWICE 1").g(this.n).h();
lbl18:
                        // 2 sources

                        E.O5(this.v, null);
                        return;
                    }
                    {
                        block56: {
                            block57: {
                                catch (Throwable var1_2) {
                                    break block54;
                                }
lbl23:
                                // 1 sources

                                var6_4 = var7_5 = Collections.EMPTY_SET;
                                if (this.v.K3()) {
                                    var5_3 = var7_5;
                                    if (!this.i) {
                                        var8_6 = E.z6(this.v, false);
                                        var5_3 = var7_5;
                                        if (!var8_6.isEmpty()) {
                                            var6_4 = new HashSet(var8_6.size());
                                            var7_5 = var8_6.iterator();
                                            while (true) {
                                                var5_3 = var6_4;
                                                if (!var7_5.hasNext()) break;
                                                var6_4.add(((com.alphainventor.filemanager.file.n)var7_5.next()).E());
                                            }
                                        }
                                    }
                                    var6_4 = var5_3;
                                    if (var5_3.isEmpty()) {
                                        this.v.h3();
                                        var6_4 = var5_3;
                                    }
                                }
                                E.a5(this.v, true);
                                var5_3 = this.r;
                                if (var5_3 != null) {
                                    this.v.W0.setStorageSpace((ax.c3.k0)var5_3);
                                    var3_7 = this.r.b;
                                } else {
                                    this.v.W0.i();
                                }
                                if (E.d6(this.v) != null) {
                                    var5_3 = this.v;
                                    E.f6((E)var5_3, E.d6((E)var5_3));
                                    E.e6(this.v, null);
                                }
                                if (!E.g6(this.v)) {
                                    this.v.J3();
                                }
                                this.v.e4(false);
                                if (var1_1 == null) break block57;
                                this.v.c1.n0(this.q);
                                E.h6(this.v, var1_1);
                                if (!var6_4.isEmpty()) {
                                    this.H((List<com.alphainventor.filemanager.file.n>)var1_1, (Set<String>)var6_4);
                                }
                                if (this.v.z3() == ax.Q2.f.z0 && ax.c3.q.f(E.Z5(this.v))) {
                                    this.v.c1.s0(true);
                                } else {
                                    this.v.c1.s0(false);
                                }
                                var5_3 = this.v;
                                var5_3.c1.i0(E.i6((E)var5_3));
                                if (E.Y5(this.v)) {
                                    this.v.c1.h0(this.p, this.o);
                                } else if (this.v.R9()) {
                                    this.v.c1.v0();
                                } else {
                                    this.v.c1.L();
                                }
                                var5_3 = this.v;
                                var5_3.c1.x0(var5_3.ca());
                                if (!ax.Q2.f.h0(E.X4(this.v)) && this.v.z3() != ax.Q2.f.o1) {
                                    this.v.c1.y0(false);
                                } else {
                                    this.v.c1.y0(true);
                                }
                                var5_3 = this.v;
                                E.j6((E)var5_3, var5_3.A3(), E.o5(this.v));
                                var5_3 = this.v;
                                E.k6((E)var5_3, var5_3.A3(), E.o5(this.v));
                                E.K5(this.v);
                                if (this.j != -1) {
                                    if (ax.X2.Q.v0()) {
                                        if (!(E.S5(this.v) instanceof ListView) && E.S5(this.v).isInTouchMode()) {
                                            E.S5(this.v).setSelection(this.j);
                                            var2_8 = this.k;
                                            var6_4 = E.S5(this.v);
                                            var5_3 = new Runnable(){
                                                final r0 c0;
                                                final int q;
                                                {
                                                    this.c0 = r02;
                                                    this.q = n8;
                                                }

                                                @Override
                                                public void run() {
                                                    if (this.q == this.c0.k) {
                                                        this.c0.v.N0.scrollListBy(this.c0.k * -1);
                                                    }
                                                }
                                            };
                                            var6_4.post(var5_3);
                                        } else {
                                            E.S5(this.v).setSelectionFromTop(this.j, this.k);
                                        }
                                    } else if (E.S5(this.v) instanceof ListView) {
                                        ((ListView)E.S5(this.v)).setSelectionFromTop(this.j, this.k);
                                    } else if (E.S5(this.v) instanceof GridView) {
                                        E.S5(this.v).setSelection(this.j);
                                        if (ax.X2.Q.c1()) {
                                            var2_8 = this.k;
                                            var6_4 = E.S5(this.v);
                                            var5_3 = new Runnable(){
                                                final r0 c0;
                                                final int q;
                                                {
                                                    this.c0 = r02;
                                                    this.q = n8;
                                                }

                                                @Override
                                                public void run() {
                                                    if (this.q == this.c0.k) {
                                                        this.c0.v.N0.scrollListBy(this.c0.k * -1);
                                                    }
                                                }
                                            };
                                            var6_4.post(var5_3);
                                        }
                                    }
                                }
                                if (E.N5(this.v) != null) {
                                    var5_3 = this.v;
                                    E.l6((E)var5_3, E.N5((E)var5_3));
                                    var5_3 = this.v;
                                    E.n6((E)var5_3, E.N5((E)var5_3));
                                    E.O5(this.v, null);
                                } else {
                                    E.n6(this.v, null);
                                }
                                if (var1_1.size() == 0) {
                                    E.T5(this.v, true);
                                    if (this.v.z3() == ax.Q2.f.o0 && d0.E(E.X4(this.v)) && !ax.Q2.e.K()) {
                                        E.V5(this.v).setText(2131952633);
                                        E.W5(this.v).setText((CharSequence)ax.Q2.e.s(this.v.o3()));
                                    } else {
                                        E.V5(this.v).setText(2131951923);
                                        E.W5(this.v).setText((CharSequence)"");
                                    }
                                    if (E.X5(this.v) != null) {
                                        E.X5(this.v).setVisibility(8);
                                    }
                                } else if (this.s) {
                                    this.s = false;
                                    this.v.c4(false);
                                } else {
                                    E.S5(this.v).requestFocus();
                                    E.T5(this.v, false);
                                    if (this.v.f8((List<com.alphainventor.filemanager.file.n>)var1_1)) {
                                        var5_3 = this.v;
                                        var6_4 = new q0((E)var5_3, (List<com.alphainventor.filemanager.file.n>)var1_1, E.X4((E)var5_3));
                                        E.Q5((E)var5_3, (q0)var6_4).i(new Void[0]);
                                    }
                                    if (E.o6(this.v) != null) {
                                        var1_1 = var1_1.iterator();
                                        while (var1_1.hasNext()) {
                                            var6_4 = (com.alphainventor.filemanager.file.n)var1_1.next();
                                            if (!E.o6(this.v).equals(var6_4.E())) continue;
                                            E.q6(this.v, true);
                                            var5_3 = this.v;
                                            E.t6((E)var5_3, (com.alphainventor.filemanager.file.n)var6_4, E.r6((E)var5_3));
                                            E.u6(this.v, false);
                                        }
                                        E.p6(this.v, null);
                                        E.s6(this.v, 0L);
                                    }
                                }
                                this.v.i8(true);
                                if (ax.X2.Q.L() && this.v.A3() == K.f && !ax.Z2.j.F().E0(this.v.A3())) {
                                    if (com.alphainventor.filemanager.shizuku.c.t().C()) {
                                        this.C();
                                        break block56;
                                    } else {
                                        this.G(E.X4(this.v));
                                    }
                                }
                                break block56;
                            }
                            E.v6(this.v, this.h, true);
                            this.v.i8(false);
                            if (ax.X2.Q.L() && this.v.v3() != null && ax.Q2.f.Q(this.v.A3()) && this.h instanceof ax.b3.e) {
                                if (com.alphainventor.filemanager.shizuku.c.t().C()) {
                                    this.C();
                                } else {
                                    this.G(E.X4(this.v));
                                }
                            }
                        }
                        if (this.m) ** GOTO lbl16
                        ** GOTO lbl10
                    }
                }
                ** while (this.m)
lbl180:
                // 1 sources

                ** while (true)
            }
            if (!this.m) {
                this.l.k0(false);
                this.m = true;
                this.n = "onPost";
            } else {
                ax.Ha.c.h().f().c("SCANTASK RELEASE TWICE 1").g(this.n).h();
            }
            E.O5(this.v, null);
            throw var1_2;
        }

        @Override
        protected void o() {
            E.U5(this.v, false);
            E.O5(this.v, null);
            this.v.B9(false);
            if (!this.m) {
                this.l.k0(false);
                this.m = true;
                this.n = "onCancel";
                return;
            }
            ax.Ha.c.h().f().c("SCANTASK RELEASE TWICE 2").g(this.n).h();
        }

        @Override
        protected void r() {
            this.l.n0();
            if (this.v.v1 != null) {
                this.v.v1.e();
            }
            if (this.i) {
                if (this.v.K3()) {
                    if (this.v.i1 != null) {
                        ax.Ha.b b8 = ax.Ha.c.h().f().d("AMOP:PRECLEAR").j();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("LOADED:");
                        stringBuilder.append(this.v.o1);
                        stringBuilder.append(":");
                        stringBuilder.append(this.v.N0.getCheckedItemCount());
                        stringBuilder.append(":");
                        stringBuilder.append(this.v.N0.getCount());
                        b8.g(stringBuilder.toString()).h();
                    }
                    this.v.h3();
                }
                this.v.Q6();
                this.v.ka(false);
            }
            E.U5(this.v, true);
        }
    }

    class s0
    extends q<String, Void, Boolean> {
        private ax.c3.k h;
        private String i;
        final E j;

        s0(E e8, ax.c3.k k8) {
            this.j = e8;
            super(q.e.e0);
            this.h = k8;
        }

        @Override
        protected void r() {
            this.j.W9(true);
        }

        protected Boolean w(String ... stringArray) {
            ax.b3.j j82;
            block5: {
                boolean bl;
                try {
                    bl = d.O(this.j.o3(), this.h);
                }
                catch (SecurityException securityException) {
                }
                catch (ax.b3.j j82) {
                    break block5;
                }
                return bl;
                if (securityException.getMessage() != null && securityException.getMessage().contains("FRP")) {
                    this.i = securityException.getMessage();
                }
                return Boolean.FALSE;
            }
            if (j82 instanceof s) {
                this.i = this.j.o3().getString(2131951952);
            }
            return Boolean.FALSE;
        }

        protected void x(Boolean object) {
            this.j.W9(false);
            if (object != null && ((Boolean)object).booleanValue()) {
                return;
            }
            if (this.i != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.j.o3().getString(2131951927));
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(this.i);
                object = ((StringBuilder)object).toString();
                this.j.F4((String)object, 1);
                return;
            }
            this.j.E4(2131951927, 1);
        }
    }
}

