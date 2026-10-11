/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.e;
import ax.Q2.f;
import ax.Z2.s;
import ax.a3.o;
import ax.d3.E;
import ax.i3.a;
import com.alphainventor.filemanager.file.L;

public class p0
extends E {
    @Override
    protected String B7() {
        return L.A0(this.o3()).f(this.x3()).b();
    }

    @Override
    protected void m8(boolean bl, Object object) {
        s s8;
        block5: {
            Object object2;
            String string;
            Object object3;
            block6: {
                block4: {
                    a.e(this.o3()).p(this.V());
                    if (!this.X0()) break block4;
                    s8 = L.A0(this.o3()).f(this.x3());
                    if (bl || !(object instanceof L.f)) break block5;
                    object3 = (L.f)object;
                    string = ((L.f)object3).e();
                    object2 = ((L.f)object3).g();
                    object3 = ((L.f)object3).f();
                    if (!this.f1()) break block6;
                    object = o.k3((String)object2, (String)object3);
                    if (this.f0() != null) {
                        Toast.makeText((Context)this.f0(), (CharSequence)object, (int)1).show();
                    }
                }
                return;
            }
            object2 = o.l3(s8.c(), (String)object2, (String)object3);
            ((e)object2).c3(this.A0(), "save_confirm");
            ((o)object2).m3(new o.e(){
                final String a;
                final boolean b;
                final Object c;
                final s d;
                final p0 e;
                {
                    this.e = p02;
                    this.a = string;
                    this.b = bl;
                    this.c = object;
                    this.d = s8;
                }

                @Override
                public void a(boolean bl) {
                    if (this.e.f0() == null) {
                        return;
                    }
                    if (bl) {
                        L.A0(this.e.o3()).p(this.e.x3(), this.a);
                        this.e.X6();
                        return;
                    }
                    this.e.c9(this.b, this.c, this.d.f());
                }
            });
            return;
        }
        this.c9(bl, object, s8.f());
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        a.e(this.o3()).a(this);
    }

    @Override
    public void q() {
        new E.p0(this).i(new String[0]);
    }

    @Override
    public void v1() {
        super.v1();
        a.e(this.o3()).o(this);
    }

    @Override
    public f z3() {
        return f.I0;
    }
}

