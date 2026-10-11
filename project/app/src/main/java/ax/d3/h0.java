/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.appcompat.view.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import ax.Q2.a;
import ax.Q2.f;
import ax.T.b;
import ax.Z2.s;
import ax.a3.O;
import ax.a3.v;
import ax.c3.K;
import ax.d3.n;
import ax.g3.d;
import ax.g3.m;
import ax.i2.I;
import ax.t3.k;
import ax.x3.F;
import ax.x3.G;
import ax.x3.H;
import ax.x3.I;
import ax.x3.d;
import ax.x3.t;
import ax.x3.y;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.file.T;
import com.alphainventor.filemanager.service.CommandService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class h0
extends n
implements MainActivity.J,
ax.g3.n,
m {
    private RecyclerView C0;
    private RecyclerView D0;
    private H E0;
    private H F0;
    private G G0;
    private boolean H0;
    private t I0;
    private I J0;
    private ax.x3.d K0;
    private a.a L0;

    private void a5(List<s> list) {
        if (list.size() == 0) {
            return;
        }
        this.U2(list.get(0));
    }

    private void b5(List<s> object) {
        if (object.size() == 0) {
            return;
        }
        object = object.get(0);
        this.S2(((s)object).e(), (s)object, false);
    }

    private void c5(List<s> object) {
        if (object.size() == 0) {
            return;
        }
        ArrayList<K> arrayList = new ArrayList<K>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((s)object.next()).e());
        }
        object = ax.a3.s.k3(arrayList);
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "delete", true);
    }

    private void d5(List<s> object) {
        if (object.size() == 0) {
            return;
        }
        if (CommandService.y((K)(object = object.get(0).e()))) {
            this.E4(2131951966, 1);
            return;
        }
        object = v.C3((K)object);
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "edit", true);
    }

    private boolean f5(int n8) {
        if (n8 != 2131362540) {
            return false;
        }
        if (this.e5().size() == this.F0.X()) {
            this.h3();
            return true;
        }
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (n8 = 0; n8 < this.F0.X(); ++n8) {
            arrayList.add(this.F0.m(n8));
        }
        this.J0.c().p(arrayList, true);
        return false;
    }

    private void g5(List<s> object) {
        if (object.size() == 0) {
            return;
        }
        object = O.i3(object.get(0).e());
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "rename", true);
    }

    private void h5() {
        this.K0.d(2131361932, 2131952257, 2131231130, new ax.g3.c(this){
            final h0 c;
            {
                this.c = h02;
            }

            @Override
            public void a(View object) {
                a.i().m("menu_network", "edit_location").c("loc", this.c.z3().I()).e();
                object = this.c;
                ((h0)object).d5(((h0)object).e5());
                this.c.h3();
            }
        });
        this.K0.d(2131361943, 2131952290, 2131231202, new ax.g3.c(this){
            final h0 c;
            {
                this.c = h02;
            }

            @Override
            public void a(View object) {
                a.i().m("menu_network", "rename_location").c("loc", this.c.z3().I()).e();
                object = this.c;
                ((h0)object).g5(((h0)object).e5());
                this.c.h3();
            }
        });
        this.K0.d(2131361942, 2131952289, 2131231124, new ax.g3.c(this){
            final h0 c;
            {
                this.c = h02;
            }

            @Override
            public void a(View object) {
                a.i().m("menu_network", "delete_location").c("loc", this.c.z3().I()).e();
                object = this.c;
                ((h0)object).c5(((h0)object).e5());
                this.c.h3();
            }
        });
        this.K0.e();
        this.K0.l(2131689508);
        this.K0.n(new d.f(this){
            final h0 a;
            {
                this.a = h02;
            }

            @Override
            public boolean a(int n8) {
                if (n8 != 2131362504) {
                    if (n8 == 2131362546) {
                        h0 h02 = this.a;
                        h02.b5(h02.e5());
                        this.a.h3();
                    }
                } else {
                    h0 h03 = this.a;
                    h03.a5(h03.e5());
                    this.a.h3();
                }
                return false;
            }
        });
    }

    private void i5(boolean bl) {
        if (this.f0() == null) {
            return;
        }
        this.H0 = bl;
        if (bl) {
            this.C0.setVisibility(4);
            this.D0.setVisibility(0);
            if (this.E0 == null) {
                Object object = new H((Context)this.f0(), null, false);
                this.E0 = object;
                this.D0.setAdapter((RecyclerView.h)object);
                this.I0 = object = new t(this.E0, true, false);
                object = new i((i.e)object);
                ((i)object).m(this.D0);
                this.E0.h0(new F(){
                    final i a;
                    final h0 b;
                    {
                        this.b = h02;
                        this.a = i8;
                    }

                    @Override
                    public void a(RecyclerView.F f8) {
                        this.a.H(f8);
                    }
                });
            }
            this.E0.d0(T.e((Context)this.f0()));
            this.E0.c0(true);
            ((ax.n.c)this.f0()).startSupportActionMode(new a.a(this){
                final h0 a;
                {
                    this.a = h02;
                }

                @Override
                public void a(androidx.appcompat.view.a a8) {
                    this.a.a3();
                    this.a.W3(n.o.f0);
                }

                @Override
                public boolean b(androidx.appcompat.view.a a8, Menu menu) {
                    this.a.d3(a8, menu, 2131689476);
                    this.a.X3(n.o.f0);
                    return true;
                }

                @Override
                public boolean c(androidx.appcompat.view.a a8, Menu menu) {
                    return false;
                }

                @Override
                public boolean d(androidx.appcompat.view.a a8, MenuItem menuItem) {
                    return false;
                }
            });
            return;
        }
        if (this.E0.Z()) {
            T.i((Context)this.f0(), this.E0.Y(), this.E0.W());
            this.E0.c0(false);
        }
        this.C0.setVisibility(0);
        this.D0.setVisibility(4);
        this.F0.d0(T.e((Context)this.f0()));
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public boolean B1(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 2131362501) {
            if (n8 != 2131362508) {
                return super.B1(menuItem);
            }
            this.i5(true);
            return true;
        }
        a.i().m("menu_network", "add_remote").c("by", "actionbar").e();
        ((MainActivity)this.f0()).C2();
        return true;
    }

    @Override
    public void C() {
        this.c4(false);
    }

    @Override
    public String C3() {
        return null;
    }

    @Override
    public void E(f f8, int n8) {
        this.c4(false);
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
        MenuItem menuItem = menu.findItem(2131362501);
        menu = menu.findItem(2131362508);
        if (menuItem != null && menu != null) {
            if (this.F0.l() > 0) {
                menuItem.setVisible(false);
                menu.setVisible(true);
                return;
            }
            menuItem.setVisible(true);
            menu.setVisible(false);
        }
    }

    @Override
    public void H1() {
        super.H1();
        this.c4(false);
    }

    @Override
    public void L1(View object, Bundle object2) {
        super.L1((View)object, (Bundle)object2);
        this.K0 = new ax.x3.d((ax.n.c)this.f0(), object.findViewById(2131361934), object.findViewById(2131361945));
        this.h5();
        object2 = (RecyclerView)object.findViewById(2131362729);
        this.C0 = object2;
        ((RecyclerView)object2).setItemAnimator(null);
        this.C0.setHasFixedSize(true);
        this.C0.setLayoutManager(new LinearLayoutManager(this.b(), 1, false));
        this.C0.j(new androidx.recyclerview.widget.f(this.b(), 1));
        object = (RecyclerView)object.findViewById(2131362730);
        this.D0 = object;
        ((RecyclerView)object).setHasFixedSize(true);
        this.D0.setLayoutManager(new LinearLayoutManager(this.b(), 1, false));
        this.D0.j(new androidx.recyclerview.widget.f(this.b(), 1));
        this.L0 = new a.a(this){
            final h0 a;
            {
                this.a = h02;
            }

            @Override
            public void a(androidx.appcompat.view.a a8) {
                this.a.a3();
                this.a.W3(n.o.e0);
            }

            @Override
            public boolean b(androidx.appcompat.view.a a8, Menu menu) {
                this.a.d3(a8, menu, 0x7F0F0000);
                this.a.X3(n.o.e0);
                return true;
            }

            @Override
            public boolean c(androidx.appcompat.view.a d8, Menu object) {
                d8 = this.a.J0.c().j();
                if (d8.size() == 1) {
                    object = d8.iterator();
                    d8 = null;
                    int n8 = 0;
                    while (object.hasNext()) {
                        d8 = (Long)object.next();
                        ++n8;
                    }
                    if (n8 != 1) {
                        this.a.h3();
                        return false;
                    }
                    if (d8 == null) {
                        this.a.h3();
                        return false;
                    }
                    this.a.K0.o(2131361932, true);
                    this.a.K0.o(2131361943, true);
                    this.a.K0.o(2131361935, true);
                } else {
                    this.a.K0.o(2131361932, false);
                    this.a.K0.o(2131361943, false);
                    this.a.K0.o(2131361935, false);
                }
                return false;
            }

            @Override
            public boolean d(androidx.appcompat.view.a a8, MenuItem menuItem) {
                return this.a.f5(menuItem.getItemId());
            }
        };
        object = new y(this){
            final h0 a;
            {
                this.a = h02;
            }

            @Override
            public void a(long l8) {
                ax.i2.I<Long> i8 = this.a.J0.c();
                if (i8.m(l8)) {
                    i8.f(l8);
                    return;
                }
                i8.o(l8);
            }
        };
        this.F0 = new H((Context)this.f0(), (y)object, k.I());
        this.G0 = new G((Context)this.f0(), 2131952241);
        object = new c(new c.a.a().b(true).c(c.a.b.d0).a(), this.F0, this.G0);
        this.C0.setAdapter((RecyclerView.h)object);
        this.J0 = object = I.a(this.C0, this.F0);
        this.F0.i0(((I)object).c());
        this.J0.c().b(new I.b(this){
            final h0 a;
            {
                this.a = h02;
            }

            @Override
            public void b() {
                block5: {
                    block4: {
                        if (this.a.f0() == null) break block4;
                        int n8 = this.a.J0.c().j().size();
                        if (n8 <= 0) break block5;
                        androidx.appcompat.view.a a8 = !this.a.K3() ? ((ax.n.c)this.a.f0()).startSupportActionMode(this.a.L0) : this.a.E3();
                        if (a8 != null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(n8);
                            stringBuilder.append("/");
                            stringBuilder.append(this.a.F0.X());
                            a8.r(stringBuilder.toString());
                            a8.k();
                        }
                    }
                    return;
                }
                this.a.h3();
            }
        });
        this.G0.S(new d(this){
            final h0 c;
            {
                this.c = h02;
            }

            @Override
            public void a(AdapterView<?> adapterView, View view, int n8, long l8) {
                a.i().m("menu_network", "add_remote").c("by", "footer").e();
                if (this.c.f0() instanceof MainActivity) {
                    ((MainActivity)this.c.f0()).C2();
                }
            }
        });
        this.F0.e0(new d(this){
            final h0 c;
            {
                this.c = h02;
            }

            @Override
            public void a(AdapterView<?> object, View view, int n8, long l8) {
                if (n8 <= this.c.F0.l()) {
                    object = this.c.F0.U(n8);
                    if (this.c.f0() instanceof MainActivity) {
                        ((MainActivity)this.c.f0()).g2((s)object, null, "remote_fragment");
                    }
                }
            }
        });
        this.F0.f0(new AdapterView.OnItemLongClickListener(this){
            final h0 a;
            {
                this.a = h02;
            }

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                if (n8 <= this.a.F0.l() && l8 != -1L) {
                    this.a.J0.c().p(Collections.singletonList(l8), true);
                    return true;
                }
                return false;
            }
        });
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
        if (this.K3()) {
            this.h3();
            return true;
        }
        return false;
    }

    @Override
    protected boolean V3() {
        ax.x3.d d8 = this.K0;
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
        if (o8 == n.o.e0) {
            this.F0.g0(this.C0, false);
            this.G0.T(this.C0, false);
            this.J0.c().e();
            this.K0.y(8);
        } else if (o8 == n.o.f0) {
            this.i5(false);
        }
        this.e4(false);
    }

    @Override
    protected void X3(n.o o8) {
        super.X3(o8);
        if (this.f0() != null && o8 == n.o.e0) {
            this.F0.g0(this.C0, true);
            this.G0.T(this.C0, true);
            this.K0.y(0);
            this.K0.A();
        }
    }

    @Override
    public void Z3(String string) {
    }

    @Override
    public void c4(boolean bl) {
        if (this.f0() != null) {
            this.F0.d0(T.e((Context)this.f0()));
            H h8 = this.E0;
            if (h8 != null) {
                h8.d0(T.e((Context)this.f0()));
            }
        }
    }

    @Override
    public void d(f f8, int n8) {
        if (this.f0() instanceof MainActivity) {
            ((MainActivity)this.f0()).E1("remote_fragment").d(f8, n8);
        }
    }

    public List<s> e5() {
        ArrayList<s> arrayList = new ArrayList<s>();
        for (Long l8 : this.J0.c().j()) {
            if (l8 == null) continue;
            try {
                int n8 = this.J0.b(l8);
                arrayList.add(this.F0.U(n8));
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        }
        return arrayList;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        ((MainActivity)activity).h1(this);
    }

    @Override
    public void j3() {
        RecyclerView recyclerView = this.C0;
        if (recyclerView != null) {
            recyclerView.requestFocus();
        }
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3() && !bl) {
            this.C0.setClipToPadding(false);
            RecyclerView recyclerView = this.C0;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.C0.getPaddingTop(), this.C0.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689498);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558560, null);
    }

    @Override
    public void u(int n8) {
        if (this.f0() != null) {
            this.F4(this.f0().getResources().getQuantityString(2131820553, n8, new Object[]{n8}), 1);
            if (n8 > 0) {
                this.c4(false);
            }
        }
    }

    @Override
    public void v1() {
        ((MainActivity)this.f0()).p2(this);
        super.v1();
    }

    @Override
    public int x3() {
        return 0;
    }

    @Override
    public f z3() {
        return f.G0;
    }
}

