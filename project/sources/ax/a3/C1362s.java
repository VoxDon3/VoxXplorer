package ax.a3;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ax.u3.AbstractC3199q;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.a3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1362s extends I {
    private List<ax.Q2.f> t0;
    private List<Integer> u0;
    Handler v0 = new Handler(Looper.getMainLooper());

    /* renamed from: ax.a3.s$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            C1362s.this.new b().h(new Void[0]);
        }
    }

    /* renamed from: ax.a3.s$b */
    private class b extends AbstractC3199q<Void, Void, Void> {
        private ProgressDialog h;
        private int i;
        Context j;

        /* renamed from: ax.a3.s$b$a */
        class a implements Runnable {
            final /* synthetic */ int c0;
            final /* synthetic */ ax.Q2.f q;

            a(ax.Q2.f fVar, int i) {
                this.q = fVar;
                this.c0 = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1362s.this.P0() instanceof ax.g3.m) {
                    ((ax.g3.m) C1362s.this.P0()).d(this.q, this.c0);
                }
            }
        }

        public b() {
            super(AbstractC3199q.e.HIGH);
            this.i = 0;
            this.j = C1362s.this.f0().getApplicationContext();
            this.h = new ProgressDialog(C1362s.this.f0());
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            if (ax.X2.P.a()) {
                this.h.setMessage(C1362s.this.M0(R.string.deleting));
            } else {
                this.h.setMessage(C1362s.this.M0(R.string.removing));
            }
            this.h.setIndeterminate(true);
            this.h.show();
        }

        void w(ax.Q2.f fVar, int i) {
            C1362s.this.v0.post(new a(fVar, i));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            for (int i = 0; i < C1362s.this.t0.size(); i++) {
                ax.Q2.f fVar = (ax.Q2.f) C1362s.this.t0.get(i);
                int intValue = ((Integer) C1362s.this.u0.get(i)).intValue();
                com.voxdon.xplorer.file.T.d(this.j, fVar).a(intValue);
                ax.V2.b.g(this.j, ax.c3.K.a(fVar, intValue));
                w(fVar, intValue);
                this.i++;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Void r3) {
            this.h.dismiss();
            if (C1362s.this.P0() instanceof ax.g3.m) {
                ((ax.g3.m) C1362s.this.P0()).u(this.i);
            }
            super.q(r3);
        }
    }

    public static C1362s k3(List<ax.c3.K> list) {
        C1362s c1362s = new C1362s();
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (ax.c3.K k : list) {
            arrayList.add(k.d());
            arrayList2.add(Integer.valueOf(k.b()));
        }
        bundle.putSerializable("locations", arrayList);
        bundle.putIntegerArrayList("keys", arrayList2);
        c1362s.v2(bundle);
        return c1362s;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.t0 = (List) j0().getSerializable("locations");
        this.u0 = j0().getIntegerArrayList("keys");
    }

    @Override // ax.a3.I
    public Dialog g3() {
        int size = this.t0.size();
        return C3190h.a(f0()).p(R.string.menu_remove).f(ax.X2.P.a() ? G0().getQuantityString(R.plurals.confirm_delete_items_plurals, size, Integer.valueOf(size)) : G0().getQuantityString(R.plurals.confirm_remove_items_plurals, size, Integer.valueOf(size))).setPositiveButton(android.R.string.ok, new a()).setNegativeButton(android.R.string.cancel, null).create();
    }
}
