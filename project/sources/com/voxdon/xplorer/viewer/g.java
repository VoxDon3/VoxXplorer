package com.voxdon.xplorer.viewer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.C0641d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.P0.C0912v;
import ax.P0.H;
import ax.P0.Q;
import ax.P0.T;
import ax.P0.V;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.a2.C1322f;
import ax.r7.AbstractC2991z;
import ax.u3.C3184b;
import com.voxdon.xplorer.viewer.g;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private final PopupWindow a;
    private final RecyclerView b;
    private final Context c;
    private final c d;
    private final e e;
    private final b f;
    private final C1322f g;
    private final int h;
    private boolean i;
    private h j;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public final class b extends AbstractC0536g {
        public b(Context context, c cVar) {
            super(context, cVar);
        }

        public static /* synthetic */ void U(b bVar, H h, View view) {
            bVar.getClass();
            if (h == null || !h.c0(29)) {
                return;
            }
            ((H) d0.i(h)).w(h.k0().I().G(1).U(1, false).F());
            g.this.a.dismiss();
        }

        private boolean V(T t) {
            for (int i = 0; i < this.d.size(); i++) {
                if (t.D.containsKey(this.d.get(i).a.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.voxdon.xplorer.viewer.g.AbstractC0536g
        public void R(d dVar) {
            dVar.u.setText(R.string.exo_track_selection_auto);
            final H h = g.this.h();
            if (h == null) {
                return;
            }
            dVar.v.setVisibility(V(((H) C0968a.e(h)).k0()) ? 4 : 0);
            dVar.a.setOnClickListener(new View.OnClickListener() { // from class: ax.w3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.b.U(g.b.this, h, view);
                }
            });
        }

        @Override // com.voxdon.xplorer.viewer.g.AbstractC0536g
        public void T(String str) {
        }

        public void W(List<f> list) {
            this.d = list;
        }
    }

    public interface c {
        H h();

        C0641d k();
    }

    public static class d extends RecyclerView.F {
        public final TextView u;
        public final View v;

        public d(View view) {
            super(view);
            if (d0.a < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(R.id.exo_text);
            this.v = view.findViewById(R.id.exo_check);
        }
    }

    public final class e extends AbstractC0536g {
        public e(Context context, c cVar) {
            super(context, cVar);
        }

        public static /* synthetic */ void U(e eVar, View view) {
            g.this.l();
            if (g.this.j != null) {
                g.this.j.a(false);
            }
            g.this.a.dismiss();
        }

        @Override // com.voxdon.xplorer.viewer.g.AbstractC0536g, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public void B(d dVar, int i) {
            super.B(dVar, i);
            if (i > 0) {
                dVar.v.setVisibility(this.d.get(i + (-1)).a() ? 0 : 4);
            }
        }

        @Override // com.voxdon.xplorer.viewer.g.AbstractC0536g
        public void R(d dVar) {
            boolean z;
            dVar.u.setText(R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.d.size()) {
                    z = true;
                    break;
                } else {
                    if (this.d.get(i).a()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            dVar.v.setVisibility(z ? 0 : 4);
            dVar.a.setOnClickListener(new View.OnClickListener() { // from class: ax.w3.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.e.U(g.e.this, view);
                }
            });
        }

        @Override // com.voxdon.xplorer.viewer.g.AbstractC0536g
        public void T(String str) {
            if (g.this.j != null) {
                g.this.j.a(true);
            }
        }

        public void V(List<f> list) {
            this.d = list;
        }
    }

    public static final class f {
        public final V.a a;
        public final int b;
        public final String c;

        public f(V v, int i, int i2, String str) {
            this.a = v.a().get(i);
            this.b = i2;
            this.c = str;
        }

        public boolean a() {
            return this.a.i(this.b);
        }
    }

    /* renamed from: com.voxdon.xplorer.viewer.g$g, reason: collision with other inner class name */
    public abstract class AbstractC0536g extends RecyclerView.h<d> {
        protected List<f> d = new ArrayList();
        protected Context e;
        protected c f;

        protected AbstractC0536g(Context context, c cVar) {
            this.e = context;
            this.f = cVar;
        }

        public static /* synthetic */ void N(AbstractC0536g abstractC0536g, H h, f fVar, View view) {
            g.this.m(h, fVar);
            abstractC0536g.T(fVar.c);
            g.this.a.dismiss();
        }

        protected void O() {
            this.d = Collections.EMPTY_LIST;
        }

        protected Context P() {
            return this.e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: Q */
        public void B(d dVar, int i) {
            final H h = g.this.h();
            if (h == null) {
                return;
            }
            if (i == 0) {
                R(dVar);
                return;
            }
            final f fVar = this.d.get(i - 1);
            boolean z = h.k0().D.get(fVar.a.a()) != null && fVar.a();
            dVar.u.setText(fVar.c);
            dVar.v.setVisibility(z ? 0 : 4);
            dVar.a.setOnClickListener(new View.OnClickListener() { // from class: ax.w3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.AbstractC0536g.N(g.AbstractC0536g.this, h, fVar, view);
                }
            });
        }

        protected abstract void R(d dVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public d D(ViewGroup viewGroup, int i) {
            return new d(LayoutInflater.from(P()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        protected abstract void T(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int l() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }
    }

    public interface h {
        void a(boolean z);
    }

    g(Context context, c cVar) {
        this.c = context;
        this.d = cVar;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.exo_settings_offset);
        this.e = new e(context, cVar);
        this.f = new b(context, cVar);
        this.g = new C1322f(context.getResources());
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(g()).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(g()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.a = popupWindow;
        if (d0.a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(new a());
    }

    private void e(RecyclerView.h<?> hVar, View view) {
        this.b.setAdapter(hVar);
        p();
        this.i = false;
        this.a.dismiss();
        this.i = true;
        this.a.showAsDropDown(view, 0, ((-this.a.getHeight()) - this.h) - view.getHeight());
    }

    private AbstractC2991z<f> f(V v, int i) {
        AbstractC2991z.a aVar = new AbstractC2991z.a();
        AbstractC2991z<V.a> a2 = v.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            V.a aVar2 = a2.get(i2);
            if (aVar2.d() == i) {
                for (int i3 = 0; i3 < aVar2.a; i3++) {
                    if (aVar2.j(i3)) {
                        C0912v b2 = aVar2.b(i3);
                        if ((b2.e & 2) == 0) {
                            aVar.a(new f(v, i2, i3, this.g.a(b2)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private Context g() {
        return this.c;
    }

    private void j() {
        H h2 = h();
        if (h2 == null) {
            C3184b.g("player is null when init trackselectionadapter");
        }
        this.e.O();
        this.f.O();
        if (h2 != null && h2.c0(30) && h2.c0(29)) {
            V X = h2.X();
            this.f.W(f(X, 1));
            this.e.V(f(X, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(H h2, f fVar) {
        if (h2.c0(29)) {
            h2.w(h2.k0().I().N(new Q(fVar.a.a(), AbstractC2991z.A(Integer.valueOf(fVar.b)))).U(fVar.a.d(), false).F());
        }
    }

    private void p() {
        C0641d i = i();
        this.b.measure(0, 0);
        this.a.setWidth(Math.min(this.b.getMeasuredWidth(), i.getWidth() - (this.h * 2)));
        this.a.setHeight(Math.min(i.getHeight() - (this.h * 2), this.b.getMeasuredHeight()));
    }

    public void d() {
        this.i = false;
        this.a.dismiss();
        this.i = true;
    }

    protected H h() {
        return this.d.h();
    }

    protected C0641d i() {
        return this.d.k();
    }

    public void k() {
        H h2 = h();
        if (h2 == null) {
            return;
        }
        AbstractC2991z<f> f2 = f(h2.X(), 3);
        if (f2.size() == 0) {
            C3184b.g("no subtitle track");
            return;
        }
        if (f2.size() != 1) {
            C3184b.g("subtitle count : " + f2.size());
        }
        m(h2, f2.get(0));
    }

    public void l() {
        H h2 = h();
        if (h2 == null || !h2.c0(29)) {
            return;
        }
        h2.w(h2.k0().I().G(3).M(-3).U(3, true).F());
    }

    public void n(View view) {
        e(this.f, view);
    }

    public void o(View view, h hVar) {
        e(this.e, view);
        this.j = hVar;
    }

    public void q() {
        j();
    }
}
