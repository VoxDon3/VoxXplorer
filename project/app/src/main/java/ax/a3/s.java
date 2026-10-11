/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ax.Q2.f;
import ax.X2.P;
import ax.a3.I;
import ax.a3.t;
import ax.c3.K;
import ax.g3.m;
import ax.u3.h;
import ax.u3.q;
import com.alphainventor.filemanager.file.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class s
extends I {
    private List<f> t0;
    private List<Integer> u0;
    Handler v0 = new Handler(Looper.getMainLooper());

    public static s k3(List<K> object) {
        s s8 = new s();
        Bundle bundle = new Bundle();
        ArrayList<f> arrayList = new ArrayList<f>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Iterator<K> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            arrayList.add(((K)object).d());
            arrayList2.add(((K)object).b());
        }
        bundle.putSerializable("locations", arrayList);
        bundle.putIntegerArrayList("keys", arrayList2);
        s8.v2(bundle);
        return s8;
    }

    @Override
    public void f3() {
        super.f3();
        this.t0 = (List)((Object)this.j0().getSerializable("locations"));
        this.u0 = this.j0().getIntegerArrayList("keys");
    }

    @Override
    public Dialog g3() {
        int n8 = this.t0.size();
        String string = P.a() ? this.G0().getQuantityString(2131820544, n8, new Object[]{n8}) : this.G0().getQuantityString(2131820546, n8, new Object[]{n8});
        return h.a((Context)this.f0()).p(2131952289).f(string).setPositiveButton(17039370, new t(this){
            final s b;
            {
                this.b = s8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                new b(this.b).h(new Void[0]);
            }
        }).setNegativeButton(0x1040000, null).create();
    }

    private class b
    extends q<Void, Void, Void> {
        private ProgressDialog h;
        private int i;
        Context j;
        final s k;

        public b(s s8) {
            this.k = s8;
            super(q.e.e0);
            this.i = 0;
            this.j = s8.f0().getApplicationContext();
            this.h = new ProgressDialog((Context)s8.f0());
        }

        @Override
        protected void r() {
            super.r();
            if (P.a()) {
                this.h.setMessage((CharSequence)this.k.M0(2131951804));
            } else {
                this.h.setMessage((CharSequence)this.k.M0(2131952535));
            }
            this.h.setIndeterminate(true);
            this.h.show();
        }

        void w(f f8, int n8) {
            this.k.v0.post(new Runnable(){
                final int c0;
                final b d0;
                final f q;
                {
                    this.d0 = b8;
                    this.q = f8;
                    this.c0 = n8;
                }

                @Override
                public void run() {
                    if (this.d0.k.P0() instanceof m) {
                        ((m)((Object)this.d0.k.P0())).d(this.q, this.c0);
                    }
                }
            });
        }

        protected Void x(Void ... object) {
            for (int i8 = 0; i8 < this.k.t0.size(); ++i8) {
                object = (f)((Object)this.k.t0.get(i8));
                int n8 = (Integer)this.k.u0.get(i8);
                T.d(this.j, (f)((Object)object)).a(n8);
                ax.V2.b.g(this.j, K.a((f)((Object)object), n8));
                this.w((f)((Object)object), n8);
                ++this.i;
            }
            return null;
        }

        protected void y(Void void_) {
            this.h.dismiss();
            if (this.k.P0() instanceof m) {
                ((m)((Object)this.k.P0())).u(this.i);
            }
            super.q(void_);
        }
    }
}

