/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import ax.Q2.a;
import ax.Q2.f;
import ax.Q2.j;
import ax.T.b;
import ax.W2.h;
import ax.W2.o;
import ax.W2.z;
import ax.Z2.p;
import ax.a3.S;
import ax.a3.V;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.q;
import ax.c3.x;
import ax.d3.E;
import ax.d3.H;
import ax.d3.n;
import ax.g3.c;
import ax.g3.h;
import ax.n3.a;
import ax.r3.d;
import ax.t3.k;
import ax.u3.q;
import ax.u3.z;
import ax.x3.A;
import ax.x3.d;
import ax.x3.h;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.widget.FileListView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class j0
extends H
implements h {
    private int C0 = -1;
    private String D0;
    private K E0;
    private List<com.voxdon.xplorer.file.n> F0;
    private Set<com.voxdon.xplorer.file.n> G0;
    private Map<String, com.voxdon.xplorer.file.n> H0;
    private q I0;
    private String J0 = "None";
    private com.voxdon.xplorer.widget.a K0;
    private String L0;
    private int M0;
    private int N0;
    private u O0;
    private com.voxdon.xplorer.file.o P0;
    private d Q0;
    private FileListView R0;
    private View S0;
    private View T0;
    private View U0;
    private TextView V0;
    protected ax.x3.d W0;
    private boolean X0;
    private boolean Y0;
    private Handler Z0 = new Handler(Looper.getMainLooper());
    private n.r a1 = new n.r();
    private final Object b1 = new Object();
    private long c1;
    private boolean d1;
    private p e1 = new p();
    AdapterView.OnItemClickListener f1 = new AdapterView.OnItemClickListener(this){
        final j0 a;
        {
            this.a = j02;
        }

        public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
            if (this.a.F0 != null && n8 >= 0 && n8 < this.a.K0.getCount()) {
                object = (com.voxdon.xplorer.file.n)this.a.K0.getItem(n8);
                if (this.a.Y0 && !object.isDirectory()) {
                    this.a.R0.setItemChecked(n8, true);
                    return;
                }
                this.a.Q5((com.voxdon.xplorer.file.n)object);
            }
        }
    };
    AbsListView.MultiChoiceModeListener g1 = new AbsListView.MultiChoiceModeListener(this){
        private boolean a;
        private j b;
        final j0 c;
        {
            this.c = j02;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            j j8;
            this.b = j8 = this.c.v3().g0();
            this.a = j8.e();
            this.c.b3(actionMode, menu, 0);
            this.c.X3(n.o.d0);
            return true;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            if (this.c.v3() == null) {
                return;
            }
            this.c.v3().h0().F(false);
            this.c.a3();
            this.c.W3(n.o.d0);
        }

        public void onItemCheckedStateChanged(ActionMode object, int n8, long l8, boolean bl) {
            this.c.e6((ActionMode)object);
            object.invalidate();
            object = (com.voxdon.xplorer.file.n)this.c.K0.getItem(n8);
            if (bl) {
                if (object.isDirectory()) {
                    this.c.R0.setItemChecked(n8, false);
                    return;
                }
                if (!this.b.h(object.s())) {
                    this.c.R0.setItemChecked(n8, false);
                    return;
                }
            }
            if (!this.a && this.c.R0.getCheckedItemCount() > 1) {
                object = this.c.R0.getCheckedItemPositions();
                for (int i8 = 0; i8 < object.size(); ++i8) {
                    if (!object.valueAt(i8) || n8 == object.keyAt(i8)) continue;
                    this.c.R0.setItemChecked(object.keyAt(i8), false);
                    return;
                }
            }
        }

        public boolean onPrepareActionMode(ActionMode object, Menu menu) {
            if (this.c.K0.getCount() == 0) {
                return false;
            }
            object = this.c.v3().h0();
            if (this.c.N5()) {
                if (this.c.R0.getCheckedItemCount() <= 0) {
                    ((A)object).F(false);
                } else {
                    ((A)object).F(true);
                }
            } else {
                ((A)object).F(false);
            }
            return false;
        }
    };
    private Runnable h1 = new Runnable(this){
        final j0 q;
        {
            this.q = j02;
        }

        @Override
        public void run() {
            this.q.A5();
        }
    };
    AbsListView.MultiChoiceModeListener i1 = new AbsListView.MultiChoiceModeListener(this){
        final j0 a;
        {
            this.a = j02;
        }

        public boolean onActionItemClicked(ActionMode object, MenuItem menuItem) {
            if (!this.a.K3()) {
                return false;
            }
            object = this.a.J5(false);
            switch (menuItem.getItemId()) {
                default: {
                    return false;
                }
                case 2131362541: {
                    this.a.a1.e((AbsListView)this.a.R0);
                    this.a.I3();
                    return true;
                }
                case 2131362540: 
            }
            if (object.size() == this.a.K0.getCount()) {
                ax.Q2.a.i().m("menu_folder", "deselect").c("loc", this.a.z3().I()).e();
                this.a.h3();
                return true;
            }
            ax.Q2.a.i().m("menu_folder", "select_all").c("loc", this.a.z3().I()).e();
            this.a.a1.d((AbsListView)this.a.R0);
            return true;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (this.a.K0 == null) {
                return false;
            }
            this.a.b3(actionMode, menu, 2131689475);
            this.a.a1.c();
            this.a.V5();
            this.a.K0.u0(true);
            this.a.X3(n.o.c0);
            return true;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            if (this.a.v3() == null) {
                return;
            }
            this.a.a3();
            this.a.W3(n.o.c0);
            this.a.a1.c();
            this.a.K0.u0(false);
            this.a.V5();
        }

        public void onItemCheckedStateChanged(ActionMode actionMode, int n8, long l8, boolean bl) {
            this.a.a1.f(n8, bl);
            this.a.f6(n8);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.R0.getCheckedItemCount());
            stringBuilder.append("/");
            stringBuilder.append(this.a.R0.getCount());
            actionMode.setTitle((CharSequence)stringBuilder.toString());
            actionMode.invalidate();
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (this.a.K0.getCount() == 0) {
                return false;
            }
            actionMode = menu.findItem(2131362541);
            if (actionMode != null) {
                z.C(this.a.o3(), (MenuItem)actionMode, 2131099680);
                if (this.a.a1.b()) {
                    actionMode.setEnabled(true);
                } else {
                    actionMode.setEnabled(false);
                }
            }
            this.a.P5();
            return false;
        }
    };

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A5() {
        if (this.f0() == null) {
            return;
        }
        boolean bl = this.K0.getCount() == 0;
        Set<com.voxdon.xplorer.file.n> set = this.b1;
        synchronized (set) {
            int n8;
            com.voxdon.xplorer.file.n n9;
            ArrayList<Integer> arrayList;
            Object object;
            try {
                object = ax.x3.u.a((AbsListView)this.R0, (ListAdapter)this.K0, false);
                this.R0.getCheckedItemCount();
                this.K0.clear();
                if (this.e1.a()) {
                    this.K0.addAll(this.G0);
                } else {
                    this.K0.addAll(this.I5(this.G0));
                }
                arrayList = new ArrayList<Integer>();
                object = object.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                if (!object.hasNext()) break;
                n9 = (com.voxdon.xplorer.file.n)object.next();
                try {
                    n8 = this.K0.getPosition(n9);
                    this.R0.setItemChecked(n8, true);
                    arrayList.add(n8);
                }
                catch (Exception exception) {}
            }
            n9 = this.R0.getCheckedItemPositions();
            n8 = 0;
            while (true) {
                block18: {
                    block19: {
                        boolean bl2;
                        int n10;
                        if (n8 >= n9.size()) break block19;
                        if (!n9.valueAt(n8) || (n10 = n9.keyAt(n8)) >= this.K0.getCount() || (bl2 = arrayList.contains(n10))) break block18;
                        try {
                            this.R0.setItemChecked(n10, false);
                            break block18;
                        }
                        catch (Exception exception) {}
                    }
                    // MONITOREXIT @DISABLED, blocks:[5, 10] lbl40 : MonitorExitStatement: MONITOREXIT : var5_2
                    this.K0.notifyDataSetChanged();
                    if (this.k3() != null) {
                        this.e6(this.k3());
                    }
                    if (bl) {
                        this.R0.requestFocus();
                    }
                    if (this.K0.getCount() != 0) {
                        this.S0.setVisibility(8);
                        return;
                    }
                    this.S0.setVisibility(0);
                    set = this.G0;
                    if (set != null && !set.isEmpty()) {
                        this.T0.setVisibility(8);
                        return;
                    }
                    this.T0.setVisibility(0);
                    return;
                }
                ++n8;
            }
        }
    }

    private String B5() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\"");
        stringBuilder.append(this.L0);
        stringBuilder.append("\"");
        p p8 = this.e1;
        if (p8 != null && p8.j0 != null) {
            stringBuilder.append(", \"");
            stringBuilder.append(this.e1.j0);
            stringBuilder.append("\"");
        }
        if ((p8 = this.e1) != null && p8.k0 != null) {
            stringBuilder.append(", \"");
            stringBuilder.append(this.e1.k0);
            stringBuilder.append("\"");
        }
        return stringBuilder.toString();
    }

    private void C5() {
        this.D5();
        this.i3("search_result");
    }

    private void D5() {
        u u8 = this.O0;
        if (u8 != null && !u8.isCancelled()) {
            this.O0.w();
        }
    }

    private Set<com.voxdon.xplorer.file.n> E5(Comparator<com.voxdon.xplorer.file.n> comparator) {
        return java.util.DesugarCollections.synchronizedSet(new TreeSet<com.voxdon.xplorer.file.n>(comparator));
    }

    private void F5(List<com.voxdon.xplorer.file.n> list, int n8) {
        String string = a.e.a(list);
        String string2 = this.z3().I();
        ax.Q2.a.i().m("menu_folder", "delete").c("loc", string2).c("type", string).e();
        boolean bl = f.l(this.E0.d());
        o.m(this.P0, list, n8, bl, this, true, new h.a(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                this.a.W5();
                if (b8 == h.b.c0 && arrayList != null && arrayList.size() > 0) {
                    this.a.z4(string, arrayList);
                    return;
                }
                this.a.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
            }
        }, null);
    }

    private void G5() {
        this.V0.setText((CharSequence)this.B5());
        this.U0.setVisibility(0);
        this.F0 = new ArrayList<com.voxdon.xplorer.file.n>();
        ax.u3.b.a(this.I0.d());
        this.G0 = this.E5(this.I0.b());
        this.H0 = java.util.DesugarCollections.synchronizedMap(new HashMap());
        Object object = this.P0;
        if (object != null) {
            ((com.voxdon.xplorer.file.o)object).k0(false);
        }
        object = x.e(this.E0);
        this.P0 = object;
        ((com.voxdon.xplorer.file.o)object).n0();
        if (this.Q0 == null) {
            this.Q0 = new d(this.o3(), this.P0);
        }
        object = new ax.x3.z(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a(int n8) {
                ax.Z2.q q8;
                if (n8 >= 0 && n8 < this.a.K0.getCount() && (q8 = this.a.K0.U(n8)) != null) {
                    boolean bl = ax.Z2.q.d((AbsListView)this.a.R0, q8);
                    for (n8 = q8.c(); n8 <= q8.a(); ++n8) {
                        this.a.R0.setItemChecked(n8, bl ^ true);
                    }
                }
            }

            @Override
            public void b(int n8) {
                if (n8 >= 0 && n8 < this.a.K0.getCount()) {
                    this.a.R0.setItemChecked(n8, this.a.R0.isItemChecked(n8) ^ true);
                }
            }

            @Override
            public void c(int n8, View view, int n9, int n10) {
                if (n8 >= 0 && n8 < this.a.K0.getCount()) {
                    this.b(n8);
                    if (this.a.K3() && this.a.a1.b()) {
                        this.a.a1.e((AbsListView)this.a.R0);
                        this.a.I3();
                    }
                }
            }
        };
        object = new com.voxdon.xplorer.widget.a((Context)this.f0(), this.F0, this.P0, this.Q0, 3, (ax.x3.z)object, this.c6(), true);
        this.K0 = object;
        ((com.voxdon.xplorer.widget.a)((Object)object)).l0(this.L0);
        this.K0.p0(this.f1);
        this.K0.t0(this.E0, this.D0);
        this.K0.y0(false);
        this.K0.x0(this.d1);
        this.g6();
        this.R0.setAdapter((ListAdapter)this.K0);
        if (!this.P0.a()) {
            this.C5();
            return;
        }
        this.O0 = object = new u(this, this.L0, this.D0, this.E0, this.P0);
        ((ax.u3.q)object).h(new Void[0]);
    }

    private void H5(List<com.voxdon.xplorer.file.n> list, boolean bl) {
        a.e.a(list);
        ax.W2.c.q().m(this.P0, null, list, bl);
        this.f0().supportInvalidateOptionsMenu();
        this.e4(true);
    }

    private List<com.voxdon.xplorer.file.n> J5(boolean bl) {
        return ax.x3.u.a((AbsListView)this.R0, (ListAdapter)this.K0, bl);
    }

    private List<com.voxdon.xplorer.file.n> K5(boolean bl) {
        List<com.voxdon.xplorer.file.n> list = ax.x3.u.a((AbsListView)this.R0, (ListAdapter)this.K0, bl);
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        for (com.voxdon.xplorer.file.n n8 : list) {
            if (!n8.isDirectory()) continue;
            arrayList.add(n8);
        }
        int n9 = arrayList.size();
        int n10 = 0;
        block1: while (n10 < n9) {
            Iterator<Object> iterator = arrayList.get(n10);
            int n11 = n10 + 1;
            com.voxdon.xplorer.file.n n12 = (com.voxdon.xplorer.file.n)((Object)iterator);
            iterator = list.iterator();
            while (true) {
                com.voxdon.xplorer.file.n n8;
                n10 = n11;
                if (!iterator.hasNext()) continue block1;
                n8 = (com.voxdon.xplorer.file.n)iterator.next();
                if (n8.E().length() <= n12.E().length() || !d0.I(n12.E(), n8.E())) continue;
                iterator.remove();
            }
        }
        return list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ax.B.b<String> L5() {
        ax.B.b<String> b8 = new ax.B.b<String>();
        Object object = this.b1;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                block8: {
                    try {
                        Object object2 = this.G0;
                        if (object2 == null) break block8;
                        Iterator<com.voxdon.xplorer.file.n> iterator = object2.iterator();
                        while (iterator.hasNext()) {
                            Object object3 = iterator.next();
                            if (object3.isDirectory()) continue;
                            object2 = ((com.voxdon.xplorer.file.n)object3).A();
                            if (object2 != null && ((String)object2).length() > 8) {
                                object3 = ((com.voxdon.xplorer.file.n)object3).B();
                                int n8 = 0;
                                for (int i8 = 0; i8 < ((String)object3).length(); ++i8) {
                                    int n9 = n8;
                                    if (((String)object3).charAt(i8) == '.') {
                                        n9 = n8 + 1;
                                    }
                                    n8 = n9;
                                }
                                if (n8 > 1) continue;
                            }
                            b8.add((String)object2);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                return b8;
            }
            throw throwable2;
        }
    }

    private void M5(View view) {
        String string = this.N0(2131952562, this.E0.f(this.o3()));
        MainActivity mainActivity = (MainActivity)this.f0();
        if (d0.D(this.E0, this.D0)) {
            mainActivity.z2(string, null);
        } else {
            mainActivity.z2(string, d0.v(this.E0, this.D0, Boolean.TRUE));
        }
        this.U0 = view.findViewById(2131362720);
        this.V0 = (TextView)view.findViewById(2131362723);
        this.W0 = new ax.x3.d(this.v3(), view.findViewById(2131361934), view.findViewById(2131361945));
        this.a6();
        this.R0 = (FileListView)view.findViewById(2131362452);
        this.S0 = view.findViewById(2131362178);
        this.T0 = view = view.findViewById(2131361981);
        view.setOnClickListener((View.OnClickListener)new c(this){
            final j0 c;
            {
                this.c = j02;
            }

            @Override
            public void a(View view) {
                this.c.S5();
            }
        });
        this.V0.setOnClickListener((View.OnClickListener)new c(this){
            final j0 c;
            {
                this.c = j02;
            }

            @Override
            public void a(View view) {
                this.c.S5();
            }
        });
        this.R0.setChoiceMode(3);
        this.R0.setOnItemClickListener(this.f1);
        if (this.v3().g0().g()) {
            this.Y0 = true;
            this.R0.setMultiChoiceModeListener(this.g1);
            return;
        }
        this.Y0 = false;
        this.R0.setMultiChoiceModeListener(this.i1);
    }

    private boolean N5() {
        return true;
    }

    private void O5(int n8, boolean bl, boolean bl2) {
        List<com.voxdon.xplorer.file.n> list;
        if (ax.W2.c.q().v()) {
            this.X2(false);
        }
        if ((list = this.K5(bl = bl2 && this.R0.hasFocus() && this.R0.getSelectedItemPosition() != -1)).size() <= 0) {
            ax.Ha.b b8 = ax.Ha.c.h().f().d("NO SELECTED ITEM");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size:");
            stringBuilder.append(list.size());
            b8.g(stringBuilder.toString()).h();
            this.h3();
            return;
        }
        switch (n8) {
            default: {
                return;
            }
            case 2131361948: 
            case 2131362545: {
                this.t4(this.P0, list);
                this.h3();
                return;
            }
            case 2131361943: 
            case 2131362532: {
                this.X5(list);
                this.h3();
                return;
            }
            case 2131361940: 
            case 2131362528: {
                this.B4(this.P0, list);
                this.h3();
                return;
            }
            case 2131361937: {
                this.R5(list.get(0));
                this.h3();
                return;
            }
            case 2131361931: {
                this.F5(list, 0);
                this.h3();
                return;
            }
            case 2131361930: {
                this.H5(list, true);
                this.h3();
                return;
            }
            case 2131361928: 
        }
        this.H5(list, false);
        this.h3();
    }

    private void P5() {
        int n8 = this.R0.getCheckedItemCount();
        if (n8 != 0) {
            if (n8 == 1) {
                this.W0.o(2131361937, true);
                this.W0.t(2131362532, true);
            } else {
                this.W0.o(2131361937, false);
                this.W0.t(2131362532, false);
            }
            if (B.B(this.K5(false))) {
                this.W0.t(2131362545, false);
                return;
            }
            this.W0.t(2131362545, true);
        }
    }

    private void Q5(com.voxdon.xplorer.file.n n8) {
        this.T5(Uri.parse((String)n8.Q()), null);
    }

    private void R5(com.voxdon.xplorer.file.n n8) {
        ax.Q2.a.i().m("menu_search", "search_open_parent").c("loc", this.E0.d().I()).e();
        this.T5(Uri.parse((String)n8.S()), n8);
    }

    private void S5() {
        MainActivity mainActivity = (MainActivity)this.f0();
        if (mainActivity == null) {
            return;
        }
        mainActivity.c2(Bookmark.d(this.o3(), this.E0, this.D0), null, null, new MainActivity.H(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a(n n8) {
            }
        }, new MainActivity.G(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a(n n8) {
                if (n8 instanceof E) {
                    ((E)n8).U8(this.a.L0);
                }
            }
        });
        this.C5();
    }

    private void T5(Uri object, com.voxdon.xplorer.file.n n8) {
        MainActivity mainActivity = (MainActivity)this.f0();
        if (mainActivity == null) {
            return;
        }
        object = Bookmark.c(this.o3(), object);
        int n9 = this.R0.getFirstVisiblePosition();
        FileListView fileListView = this.R0;
        int n10 = 0;
        if ((fileListView = fileListView.getChildAt(0)) != null) {
            n10 = fileListView.getTop() - this.R0.getPaddingTop();
        }
        mainActivity.c2((Bookmark)object, null, null, new MainActivity.H(){
            final com.voxdon.xplorer.file.n a;
            final j0 b;
            {
                this.b = j02;
                this.a = n8;
            }

            @Override
            public void a(n n8) {
                com.voxdon.xplorer.file.n n9;
                if (n8 instanceof E && (n9 = this.a) != null) {
                    ((E)n8).V8(n9);
                }
            }
        }, new MainActivity.G(){
            final int a;
            final int b;
            final j0 c;
            {
                this.c = j02;
                this.a = n8;
                this.b = n9;
            }

            @Override
            public void a(n n8) {
                if (n8 instanceof E) {
                    ((E)n8).e9(this.c.D0, this.c.L0, this.c.e1, this.c.J0, this.a, this.b);
                }
            }
        });
        this.C5();
    }

    private void U5() {
        this.D0 = this.j0().getString("ROOT");
        this.E0 = K.a((f)((Object)this.j0().getSerializable("LOCATION")), this.j0().getInt("LOCATION_KEY", 0));
        this.L0 = this.j0().getString("query");
        this.d1 = this.j0().getBoolean("INCLUDE_SUBFOLDER");
        Object object = (p)this.j0().getSerializable("FILTER_INFO");
        if (object != null) {
            this.e1.f((p)object);
        }
        object = this.j0().getString("SORT_METHOD");
        this.M0 = this.j0().getInt("INDEX");
        this.N0 = this.j0().getInt("TOP");
        this.J0 = object != null ? object : (this.d1 ? "None" : E.F7(this.o3(), this.E0.d(), this.E0.b(), this.D0, false));
        if ("None".equals(this.J0)) {
            this.I0 = q.a("SearchPath");
            return;
        }
        this.I0 = q.a(this.J0);
    }

    private void V5() {
        this.e4(false);
        if (this.K3()) {
            this.W0.y(0);
            this.W0.A();
            return;
        }
        this.W0.y(8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void W5() {
        u u8;
        if (this.G0 == null) {
            return;
        }
        if (this.f0() == null) {
            return;
        }
        Object object = this.b1;
        synchronized (object) {
            this.G0.clear();
        }
        this.H0.clear();
        this.K0.clear();
        this.O0 = u8 = new u(this, this.L0, this.D0, this.E0, this.P0);
        u8.h(new Void[0]);
        u8 = this.S0;
        if (u8 == null) return;
        u8.setVisibility(8);
    }

    private void X5(List<com.voxdon.xplorer.file.n> list) {
        if (list.size() <= 0) {
            return;
        }
        String string = a.e.a(list);
        Object object = this.z3().I();
        ax.Q2.a.i().m("menu_folder", "rename").c("loc", (String)object).c("type", string).e();
        if (list.size() != 1) {
            ax.u3.b.f();
            return;
        }
        object = list.get(0);
        ax.W2.z.o(this.P0, ((com.voxdon.xplorer.file.n)object).T(), list, this, new h.a(){
            final com.voxdon.xplorer.file.n a;
            final j0 b;
            {
                this.b = j02;
                this.a = n8;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (b8 == h.b.c0) {
                    if (arrayList != null && arrayList.size() == 1) {
                        object = this.b.b1;
                        synchronized (object) {
                            this.b.G0.remove(this.a);
                        }
                        object = arrayList.get(0);
                        String string3 = d0.Q(this.a.T(), (String)object);
                        if (this.b.f0() != null && this.b.P0 != null) {
                            object = this.b;
                            new t((j0)object, ((j0)object).P0, this.b.L0, this.b.D0, this.b.E0, string3).h(new Void[0]);
                        }
                    } else {
                        this.b.W5();
                    }
                }
                this.b.y4(b8, string, string2, arrayList);
            }

            @Override
            public void b() {
            }
        }, new z.c(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public boolean a(String string) {
                return this.a.K0 != null && this.a.K0.X(string);
            }
        });
    }

    private void Y5(K k8, String string, String string2) {
        if (k8 != null && string != null && string2 != null) {
            ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>(this.G0);
            ax.Z2.b.k().o(k8, string, string2, arrayList);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Z5(String object) {
        this.I0 = "None".equals(object) ? q.a("SearchPath") : q.a((String)object);
        if (this.P0 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("no sort method : ");
            stringBuilder.append((String)object);
            ax.u3.b.g(stringBuilder.toString());
            return;
        }
        Object object2 = this.b1;
        synchronized (object2) {
            this.J0 = object;
            object = this.E5(this.I0.b());
            object.addAll(this.G0);
            this.G0 = object;
            q.h(this.F0, this.I0);
        }
        this.g6();
        this.K0.notifyDataSetChanged();
    }

    private void b6() {
        S s8 = S.B3();
        s8.M3(this.L5());
        s8.N3(this.e1, new S.k(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a() {
                this.a.V0.setText((CharSequence)this.a.B5());
                this.a.A5();
            }
        });
        this.A(s8, "option", true);
    }

    private void d6() {
        V v8 = V.l3(this.J0);
        v8.m3(new V.b(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public void a(String string) {
                this.a.Z5(string);
            }
        });
        this.A(v8, "option", true);
    }

    private void e6(ActionMode actionMode) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.R0.getCheckedItemCount());
        stringBuilder.append("/");
        stringBuilder.append(this.R0.getCount());
        actionMode.setTitle((CharSequence)stringBuilder.toString());
    }

    private void f6(int n8) {
        boolean bl;
        ax.Z2.q q8;
        if (n8 >= 0 && n8 < this.K0.getCount() && this.K0.B0() && (q8 = this.K0.U(n8)) != null && (bl = ax.Z2.q.d((AbsListView)this.R0, q8)) != q8.e()) {
            q8.f(bl);
            this.K0.notifyDataSetChanged();
        }
    }

    private void g6() {
        if (!"DateDown".equals(this.J0) && !"DateUp".equals(this.J0)) {
            if (!"TypeDown".equals(this.J0) && !"TypeUp".equals(this.J0)) {
                this.K0.r0(false, 0);
                return;
            }
            this.K0.r0(true, 2);
            return;
        }
        this.K0.r0(true, 1);
    }

    static /* synthetic */ u m5(j0 j02, u u8) {
        j02.O0 = u8;
        return u8;
    }

    static /* synthetic */ long p5(j0 j02, long l8) {
        j02.c1 = l8;
        return l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z5(List<com.voxdon.xplorer.file.n> list) {
        Object object = this.b1;
        synchronized (object) {
            Iterator<com.voxdon.xplorer.file.n> iterator;
            try {
                iterator = list.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                if (!iterator.hasNext()) {
                    this.G0.addAll(list);
                    return;
                }
                com.voxdon.xplorer.file.n n8 = iterator.next();
                String string = n8.E().toLowerCase(Locale.ROOT);
                if (this.H0.containsKey(string)) {
                    com.voxdon.xplorer.file.n n9 = this.H0.get(string);
                    this.G0.remove(n9);
                }
                this.H0.put(string, n8);
            }
        }
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 2131362514) {
            if (n8 != 2131362548) {
                return super.B1(menuItem);
            }
            this.d6();
            return true;
        }
        this.b6();
        return true;
    }

    @Override
    public String C3() {
        return "/";
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
    }

    @Override
    public void H1() {
        super.H1();
        if (!this.X0) {
            this.X0 = true;
            this.G5();
        }
    }

    List<com.voxdon.xplorer.file.n> I5(Set<com.voxdon.xplorer.file.n> object) {
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        object = object.iterator();
        while (object.hasNext()) {
            com.voxdon.xplorer.file.n n8 = (com.voxdon.xplorer.file.n)object.next();
            if (!this.e1.e(n8)) continue;
            arrayList.add(n8);
        }
        return arrayList;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.x2(true);
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
        this.D5();
        return false;
    }

    @Override
    protected boolean V3() {
        ax.x3.d d8 = this.W0;
        if (d8 != null && d8.m()) {
            return true;
        }
        return super.V3();
    }

    @Override
    protected void W3(n.o o8) {
        super.W3(o8);
        if (this.f0() == null) {
            return;
        }
        this.V0.setBackgroundResource(2131230867);
        this.K0.g0(false);
    }

    @Override
    protected void X3(n.o o8) {
        super.X3(o8);
        if (this.f0() == null) {
            return;
        }
        int n8 = ax.Q.b.c((Context)this.f0(), 2131100792);
        this.V0.setBackgroundColor(n8);
        this.K0.g0(true);
    }

    @Override
    public void Y(List<com.voxdon.xplorer.file.n> list, boolean bl) {
        long l8;
        block5: {
            block4: {
                if (this.f0() == null || list == null) break block4;
                if (!list.isEmpty()) {
                    this.z5(list);
                }
                l8 = System.currentTimeMillis();
                if (bl || l8 - this.c1 >= 250L) break block5;
            }
            return;
        }
        this.c1 = l8;
        this.Z0.post(this.h1);
    }

    @Override
    public void Z3(String string) {
    }

    protected void a6() {
        c c8 = new c(this){
            final j0 c;
            {
                this.c = j02;
            }

            @Override
            public void a(View view) {
                if (this.c.W0.k() != 0) {
                    return;
                }
                this.c.O5(view.getId(), false, false);
            }
        };
        this.W0.d(2131361928, 2131952251, 2131231115, c8);
        this.W0.d(2131361930, 2131952274, 2131231143, c8);
        this.W0.d(2131361931, 2131952255, 2131231124, c8);
        this.W0.d(2131361937, 2131952281, 2131231145, c8);
        this.W0.e();
        this.W0.n(new d.f(this){
            final j0 a;
            {
                this.a = j02;
            }

            @Override
            public boolean a(int n8) {
                this.a.O5(n8, false, false);
                return false;
            }
        });
        this.W0.l(2131689506);
    }

    @Override
    public void c4(boolean bl) {
        this.W5();
    }

    protected boolean c6() {
        return k.I();
    }

    @Override
    public void i() {
        Object object;
        if (this.R0() == null || (object = this.R0().findViewById(0x1020002)) == null) {
            return;
        }
        object = ax.u3.B.S((View)object, 2131951937, -2).q0(17039370, new View.OnClickListener(this){
            final j0 a;
            {
                this.a = j02;
            }

            public void onClick(View view) {
            }
        });
        ((TextView)((BaseTransientBottomBar)object).H().findViewById(2131362849)).setTextColor(-256);
        this.D4((Snackbar)object);
    }

    @Override
    public void j3() {
        FileListView fileListView = this.R0;
        if (fileListView != null) {
            fileListView.requestFocus();
        }
    }

    @Override
    public void j4() {
        if (this.f0() == null) {
            return;
        }
        this.k4(this.P0, this.K5(false));
    }

    @Override
    public void k1(Context context) {
        super.k1(context);
        this.U5();
    }

    @Override
    public void o() {
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3() && !bl) {
            this.R0.setClipToPadding(false);
            FileListView fileListView = this.R0;
            fileListView.setPadding(fileListView.getPaddingLeft(), this.R0.getPaddingTop(), this.R0.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689501);
    }

    @Override
    protected int q3() {
        if (this.b() == null) {
            return 0;
        }
        return ax.Q.b.c(this.b(), 2131100780);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131558558, null);
        this.M5((View)layoutInflater);
        return layoutInflater;
    }

    @Override
    protected int r3() {
        if (this.b() == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return ax.Q.b.c(this.b(), 2131100838);
        }
        return ax.Q.b.c(this.b(), 2131100784);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void s1() {
        com.voxdon.xplorer.file.o o8;
        this.D5();
        if (this.F0 != null) {
            this.K0.clear();
            Object object = this.b1;
            synchronized (object) {
                this.G0.clear();
            }
            this.H0.clear();
        }
        if ((o8 = this.P0) != null) {
            o8.k0(false);
            this.P0 = null;
        }
        super.s1();
    }

    @Override
    protected h.a s3() {
        return h.a.q;
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (bl) {
            this.C5();
        }
    }

    @Override
    public int x3() {
        if (this.C0 < 0) {
            this.C0 = this.j0().getInt("location_key");
        }
        return this.C0;
    }

    @Override
    public f z3() {
        return f.s1;
    }

    class t
    extends ax.u3.q<Void, Void, Boolean> {
        private String h;
        private String i;
        private String j;
        private K k;
        private com.voxdon.xplorer.file.o l;
        final j0 m;

        t(j0 j02, com.voxdon.xplorer.file.o o8, String string, String string2, K k8, String string3) {
            this.m = j02;
            super(q.e.d0);
            this.l = o8;
            this.i = string;
            this.j = string2;
            this.k = k8;
            this.h = string3;
        }

        @Override
        protected void o() {
            com.voxdon.xplorer.file.o o8 = this.l;
            if (o8 != null) {
                o8.k0(false);
            }
        }

        @Override
        protected void r() {
            com.voxdon.xplorer.file.o o8 = this.l;
            if (o8 != null) {
                o8.n0();
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected Boolean w(Void ... object) {
            com.voxdon.xplorer.file.n n8;
            try {
                n8 = this.l.z(this.h);
                if (n8 == null) return Boolean.FALSE;
            }
            catch (ax.b3.j j8) {
                return Boolean.FALSE;
            }
            if (!n8.n()) return Boolean.FALSE;
            this.m.z5(Collections.singletonList(n8));
            return Boolean.TRUE;
        }

        protected void x(Boolean object) {
            if (((Boolean)object).booleanValue()) {
                this.m.A5();
                this.m.Y5(this.k, this.j, this.i);
            } else {
                this.m.W5();
            }
            object = this.l;
            if (object != null) {
                ((com.voxdon.xplorer.file.o)object).k0(false);
            }
        }
    }

    class u
    extends ax.u3.q<Void, Void, Void> {
        private a h;
        private String i;
        private String j;
        private K k;
        private com.voxdon.xplorer.file.o l;
        private boolean m;
        final j0 n;

        public u(j0 j02, String string, String string2, K k8, com.voxdon.xplorer.file.o o8) {
            this.n = j02;
            super(q.e.d0);
            this.i = string;
            this.j = string2;
            this.k = k8;
            this.l = o8;
        }

        @Override
        protected void o() {
            com.voxdon.xplorer.file.o o8 = this.l;
            if (o8 != null) {
                o8.k0(false);
            }
        }

        @Override
        protected void r() {
            com.voxdon.xplorer.file.o o8 = this.l;
            if (o8 != null) {
                o8.n0();
            }
        }

        public void w() {
            a a8 = this.h;
            if (a8 != null) {
                a8.a();
            }
            this.e();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Void x(Void ... object) {
            object = this.n.M0 >= 0 && this.n.N0 >= 0 ? ax.Z2.b.k().l(this.k, this.j, this.i) : null;
            if (object != null) {
                Object object2 = this.n.b1;
                synchronized (object2) {
                    this.n.G0.addAll(object);
                    this.m = true;
                    return null;
                }
            }
            this.h = object = new a(this.n.o3(), this.k, this.n);
            ((a)object).b(this.j, this.i, this.n.d1);
            this.m = false;
            return null;
        }

        protected void y(Void object) {
            object = this.l;
            if (object != null) {
                ((com.voxdon.xplorer.file.o)object).k0(false);
            }
            j0.m5(this.n, null);
            this.n.U0.setVisibility(8);
            this.n.A5();
            j0.p5(this.n, 0L);
            if (this.n.M0 >= 0 && this.n.N0 != 0) {
                this.n.R0.setSelectionFromTop(this.n.M0, this.n.N0);
            }
            if (!this.m) {
                this.n.Y5(this.k, this.j, this.i);
            }
        }
    }
}

