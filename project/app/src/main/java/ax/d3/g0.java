/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import ax.Q2.a;
import ax.Q2.f;
import ax.T2.h;
import ax.W2.h;
import ax.W2.o;
import ax.c3.K;
import ax.d3.E;
import ax.u3.b;
import com.alphainventor.filemanager.file.n;
import java.util.ArrayList;
import java.util.List;

public class g0
extends E {
    private void ta() {
        a.i().m("menu_recycle_bin", "empty_recycle_bin").e();
        o.n(this, this.va(), new h.a(this){
            final g0 a;
            {
                this.a = g02;
            }

            @Override
            public void a(h.b object, String object2, String object3, ArrayList<String> arrayList, Object object4) {
                object3 = h.b.d0;
                boolean bl = false;
                if (object == object3 && "NEED_STORAGE_PERMISSION".equals(object2)) {
                    if (arrayList != null) {
                        object2 = K.h(arrayList.get(0));
                        object = arrayList.get(1);
                        boolean bl2 = arrayList.size() == 2;
                        b.c(bl2);
                        bl2 = bl;
                        if (object2 != null) {
                            bl2 = true;
                        }
                        b.c(bl2);
                        this.a.Z2((K)object2, (String)object);
                        return;
                    }
                    this.a.Z2(K.f, null);
                    return;
                }
                this.a.c4(false);
            }

            @Override
            public void b() {
            }
        });
    }

    private h ua() {
        if (this.x3() == 0) {
            return h.a0();
        }
        return h.S(h.q(this.x3()));
    }

    private K va() {
        if (this.x3() == 0) {
            return null;
        }
        return h.q(this.x3());
    }

    @Override
    protected AdapterView.OnItemClickListener A7() {
        return this.H7();
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131362510) {
            return super.B1(menuItem);
        }
        this.ta();
        return true;
    }

    @Override
    protected String B7() {
        return this.A3().f(this.b());
    }

    @Override
    protected boolean C7() {
        return false;
    }

    @Override
    protected AdapterView.OnItemClickListener E7() {
        return this.H7();
    }

    @Override
    protected String G7(String string) {
        return "DateDownNoSeparate";
    }

    @Override
    protected boolean K7(int n8, List<n> list, boolean bl) {
        if (n8 != 2131361939 && n8 != 2131361944) {
            return super.K7(n8, list, bl);
        }
        this.ua().v0();
        return super.K7(n8, list, bl);
    }

    @Override
    protected boolean K8() {
        return false;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override
    protected void L9() {
        super.L9();
        this.s7().t(2131361928, false);
        this.s7().t(2131361930, false);
        this.s7().t(2131361943, false);
        this.s7().t(2131361935, false);
        this.s7().t(2131361931, false);
        this.s7().d(2131361944, 2131952293, 2131231209, this.C1);
        this.s7().d(2131361939, 2131952284, 2131231125, this.C1);
    }

    @Override
    public boolean N3() {
        return false;
    }

    @Override
    protected boolean R9() {
        return true;
    }

    @Override
    public boolean Y7() {
        return false;
    }

    @Override
    protected boolean Y9(String string) {
        return true;
    }

    @Override
    public void c4(boolean bl) {
        super.c4(bl);
    }

    @Override
    protected boolean ca() {
        return true;
    }

    @Override
    protected boolean fa() {
        return true;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override
    protected void k8(List<n> list) {
        super.k8(list);
        this.s7().o(2131361944, true);
        this.s7().o(2131361939, true);
    }

    @Override
    protected void l8(n n8) {
        super.l8(n8);
        this.s7().o(2131361944, true);
        this.s7().o(2131361939, true);
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689499);
    }

    @Override
    public void v1() {
        super.v1();
    }

    @Override
    public f z3() {
        return f.o1;
    }
}

