package com.voxdon.xplorer.viewer;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.A3.b;
import ax.Z2.c;
import ax.a3.Q;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1833v;
import ax.c3.C1834w;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.d3.M;
import ax.r3.C2947d;
import ax.t3.j;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.z3.ViewOnClickListenerC3543a;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.viewer.e;
import com.android.ex.photo.e;
import com.android.ex.photo.f;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class b extends com.android.ex.photo.f {
    private List<AbstractC3595n> P;
    private List<AbstractC3595n> Q;
    private boolean R;
    private boolean S;
    private C3596o T;
    private C2947d U;
    private Cursor V;
    private Cursor W;
    private Boolean X;
    private d Y;

    class a extends ax.g3.c {
        final /* synthetic */ Uri c;

        a(Uri uri) {
            this.c = uri;
        }

        @Override // ax.g3.c
        public void a(View view) {
            b.this.r(this.c, false);
        }
    }

    /* renamed from: com.voxdon.xplorer.viewer.b$b, reason: collision with other inner class name */
    class C0535b implements ViewOnClickListenerC3543a.h {
        final /* synthetic */ ViewOnClickListenerC3543a a;

        C0535b(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
            this.a = viewOnClickListenerC3543a;
        }

        @Override // ax.z3.ViewOnClickListenerC3543a.h
        public void a(boolean z) {
            if (b.this.y(this.a)) {
                b.this.g1(!z);
            }
        }
    }

    class c extends ax.g3.c {
        final /* synthetic */ AbstractC3595n c;
        final /* synthetic */ com.android.ex.photo.c d;

        c(AbstractC3595n abstractC3595n, com.android.ex.photo.c cVar) {
            this.c = abstractC3595n;
            this.d = cVar;
        }

        @Override // ax.g3.c
        public void a(View view) {
            b.this.b1((AbstractC1823k) this.c, this.d);
        }
    }

    class d extends AbstractC3199q<Void, Integer, Void> {
        int h;

        d(int i) {
            super(AbstractC3199q.e.HIGH);
            this.h = i;
        }

        private void w(int i) {
            List U0;
            if (isCancelled() || (U0 = b.this.U0()) == null || !b.this.a1(i)) {
                return;
            }
            AbstractC3595n abstractC3595n = (AbstractC3595n) U0.get(i);
            if (C1809B.P(abstractC3595n) || abstractC3595n.P() == ax.Q2.f.b1) {
                if (C2947d.l(b.this.O().b(), C1809B.Y(abstractC3595n)) == null) {
                    b.this.U.t(abstractC3595n);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            if (b.this.Y()) {
                return null;
            }
            w(this.h - 1);
            w(this.h + 1);
            w(this.h - 2);
            w(this.h + 2);
            return null;
        }
    }

    public static class e extends ax.K0.b {
        ArrayList<AbstractC3595n> w;

        public e(Context context, List<AbstractC3595n> list) {
            super(context);
            ArrayList<AbstractC3595n> arrayList = new ArrayList<>();
            this.w = arrayList;
            if (list != null) {
                arrayList.addAll(list);
            }
        }

        @Override // ax.K0.a
        /* renamed from: M */
        public Cursor I() {
            return b.O0(this.w);
        }
    }

    private enum f {
        BUILT_IN,
        GENERAL,
        IN_IMAGE_VIEWER
    }

    public b(f.g gVar, List<AbstractC3595n> list, C3596o c3596o) {
        super(gVar);
        this.P = list;
        this.T = c3596o;
        this.U = new C2947d(gVar.b(), this.T);
    }

    private static void N0(MatrixCursor matrixCursor, AbstractC3595n abstractC3595n) {
        String W = C1809B.P(abstractC3595n) ? C1809B.W(abstractC3595n) : C1809B.Y(abstractC3595n);
        if (C1809B.H(abstractC3595n) && abstractC3595n.p() < 50000) {
            W = null;
        }
        matrixCursor.newRow().add(abstractC3595n.Q()).add(abstractC3595n.B()).add(abstractC3595n.Q()).add(W).add(abstractC3595n.s());
    }

    public static MatrixCursor O0(ArrayList<AbstractC3595n> arrayList) {
        MatrixCursor matrixCursor = new MatrixCursor(ax.B3.a.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC3595n abstractC3595n = arrayList.get(i);
            i++;
            N0(matrixCursor, abstractC3595n);
        }
        return matrixCursor;
    }

    private ArrayList<e.a> Q0(Context context, Uri uri, List<AbstractC3595n> list) {
        boolean I3 = Q.I3(context, uri);
        ArrayList<e.a> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            AbstractC3595n abstractC3595n = list.get(i);
            if (I3 ? C1808A.F(abstractC3595n) : C1808A.E(abstractC3595n)) {
                arrayList.add(new e.a(C1832u.L(abstractC3595n, false), null));
            }
        }
        return arrayList;
    }

    private AbstractC3595n R0(String str) {
        List<AbstractC3595n> U0;
        if (str == null || (U0 = U0()) == null) {
            return null;
        }
        for (int i = 0; i < U0.size(); i++) {
            AbstractC3595n abstractC3595n = U0.get(i);
            if (str.equals(abstractC3595n.Q())) {
                return abstractC3595n;
            }
        }
        return null;
    }

    private int S0(Uri uri) {
        List<AbstractC3595n> U0;
        if (uri == null || (U0 = U0()) == null) {
            return -1;
        }
        for (int i = 0; i < U0.size(); i++) {
            AbstractC3595n abstractC3595n = U0.get(i);
            if (C1809B.H(abstractC3595n) && uri.equals(C1832u.L(abstractC3595n, false))) {
                return i;
            }
        }
        return -1;
    }

    private void T0(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        if (O() != null) {
            O().i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AbstractC3595n> U0() {
        return this.R ? this.Q : this.P;
    }

    public static Intent W0(Context context, AbstractC3595n abstractC3595n, boolean z) {
        C3184b.c(C1809B.H(abstractC3595n));
        return Q.z3(context, c.a.IN_IMAGE_VIEWER, C1809B.H(abstractC3595n) ? Q.E3(abstractC3595n) : C1832u.w(abstractC3595n.Z()), C1833v.e(abstractC3595n, "application/octet-stream"), true, z);
    }

    private View X0() {
        return N(R.id.btn_motion_play);
    }

    private View Y0(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        if (viewOnClickListenerC3543a.R0() == null) {
            return null;
        }
        return viewOnClickListenerC3543a.R0().findViewById(R.id.control_play);
    }

    private void Z0(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        View Y0 = Y0(viewOnClickListenerC3543a);
        if (Y0 != null) {
            Y0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a1(int i) {
        List<AbstractC3595n> U0 = U0();
        return U0 != null && i < U0.size() && i >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(AbstractC1823k abstractC1823k, com.android.ex.photo.c cVar) {
        if (O() == null) {
            return;
        }
        Activity activity = (Activity) O().b();
        try {
            Intent e2 = C1834w.e(activity, MyFileProvider.p(abstractC1823k, cVar.c, cVar.d, cVar.f));
            this.X = Boolean.valueOf(s());
            activity.startActivityForResult(e2, 36002);
        } catch (ActivityNotFoundException | IllegalArgumentException | SecurityException unused) {
            this.X = null;
            Toast.makeText(activity, R.string.error, 1).show();
        }
    }

    private void c1() {
        if (O() instanceof ImageViewerActivity) {
            ((ImageViewerActivity) O()).x0();
        }
    }

    private void d1(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        View Y0 = Y0(viewOnClickListenerC3543a);
        if (Y0 == null) {
            C3184b.f();
            return;
        }
        Uri parse = Uri.parse(viewOnClickListenerC3543a.Y2());
        if (l(parse)) {
            viewOnClickListenerC3543a.U2(false);
            Y0.setVisibility(0);
            Y0.setOnClickListener(new a(parse));
            Y0.requestFocus();
        } else {
            Y0.setVisibility(8);
        }
        if (!y(viewOnClickListenerC3543a)) {
            viewOnClickListenerC3543a.m3(null);
            return;
        }
        View X0 = X0();
        if (X0 == null) {
            C3184b.f();
            return;
        }
        AbstractC3595n R0 = R0(viewOnClickListenerC3543a.Y2());
        com.android.ex.photo.c X2 = viewOnClickListenerC3543a.X2();
        if (!C1809B.H(R0) || X2 == null || X2.g != R0 || !X2.b || X2.c < 0 || X2.d <= 0) {
            viewOnClickListenerC3543a.m3(null);
            g1(false);
        } else {
            viewOnClickListenerC3543a.m3(new C0535b(viewOnClickListenerC3543a));
            g1(!viewOnClickListenerC3543a.e3());
            X0.setOnClickListener(new c(R0, X2));
            X0.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(boolean z) {
        if (O() instanceof ImageViewerActivity) {
            ((ImageViewerActivity) O()).F0(z);
        }
    }

    @Override // com.android.ex.photo.f, com.android.ex.photo.e
    public void A(ViewOnClickListenerC3543a viewOnClickListenerC3543a, boolean z) {
        super.A(viewOnClickListenerC3543a, z);
        d1(viewOnClickListenerC3543a);
        T0(viewOnClickListenerC3543a);
        if (z) {
            return;
        }
        d1(viewOnClickListenerC3543a);
        Uri parse = Uri.parse(viewOnClickListenerC3543a.Y2());
        if (l(parse)) {
            AbstractC3595n R0 = R0(parse.toString());
            if (R0 == null || !R0.n()) {
                Z0(viewOnClickListenerC3543a);
            } else {
                viewOnClickListenerC3543a.W2().setVisibility(8);
            }
        }
    }

    @Override // com.android.ex.photo.f
    public void E0(boolean z) {
        if (z) {
            P0();
            this.R = true;
            D0(this.W);
            return;
        }
        Cursor cursor = this.V;
        if (cursor == null) {
            C3184b.f();
            return;
        }
        this.R = false;
        D0(cursor);
        Cursor cursor2 = this.W;
        if (cursor2 != null) {
            cursor2.close();
            this.W = null;
            this.Q = null;
        }
    }

    @Override // com.android.ex.photo.f
    public void F0() {
        int currentItem = this.n.getCurrentItem();
        int i = currentItem + 1;
        boolean z = this.j >= 0;
        List<AbstractC3595n> U0 = U0();
        if (this.k || !z || i <= 0 || U0 == null) {
            this.x = null;
        } else if (this.j > 1) {
            this.x = O().getResources().getString(R.string.photo_view_count, Integer.valueOf(i), Integer.valueOf(this.j));
            if (a1(currentItem)) {
                AbstractC3595n abstractC3595n = U0.get(currentItem);
                if (abstractC3595n != null) {
                    this.y = abstractC3595n.B();
                } else {
                    this.y = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            } else {
                this.y = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } else {
            AbstractC3595n abstractC3595n2 = U0.get(0);
            if (abstractC3595n2 != null) {
                this.x = abstractC3595n2.B();
            } else {
                this.x = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        x0(O().o());
    }

    @Override // com.android.ex.photo.f, androidx.viewpager.widget.ViewPager.j
    public void K(int i) {
        g1(false);
        super.K(i);
        d dVar = this.Y;
        if (dVar != null && !dVar.isCancelled() && AbstractC3199q.n(this.Y)) {
            this.Y.e();
        }
        d dVar2 = new d(i);
        this.Y = dVar2;
        dVar2.i(new Void[0]);
    }

    public void P0() {
        ArrayList arrayList = new ArrayList(this.P);
        Collections.shuffle(arrayList);
        this.Q = arrayList;
        Cursor cursor = this.W;
        if (cursor != null) {
            cursor.close();
        }
        this.W = O0(arrayList);
    }

    public Uri V0() {
        int currentItem = this.n.getCurrentItem();
        Cursor x = this.p.x();
        if (x == null || x.isClosed()) {
            return null;
        }
        x.moveToPosition(currentItem);
        return Uri.parse(this.p.E(x));
    }

    @Override // com.android.ex.photo.f, com.android.ex.photo.e
    public void c(boolean z) {
        super.c(z);
        c1();
    }

    @Override // com.android.ex.photo.f
    public void d0(int i, int i2, Intent intent) {
        int S0;
        if (i != 36001 || i2 != -1 || intent == null || (S0 = S0(intent.getData())) < 0) {
            return;
        }
        V().setCurrentItem(S0);
    }

    public void e1() {
        this.S = true;
        this.k = true;
        O().getSupportLoaderManager().g(100, null, this);
    }

    public void f1() {
        e.b P = P();
        if (P != null) {
            P.k();
        }
    }

    @Override // com.android.ex.photo.f, com.android.ex.photo.e
    public void g(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        super.g(viewOnClickListenerC3543a);
        d1(viewOnClickListenerC3543a);
        T0(viewOnClickListenerC3543a);
    }

    @Override // com.android.ex.photo.e
    public void i(com.android.ex.photo.c cVar, View view) {
        ax.w3.e eVar;
        Uri V0;
        if (O() == null) {
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof ax.w3.e) {
            eVar = (ax.w3.e) tag;
        } else {
            eVar = new ax.w3.e(view);
            view.setTag(eVar);
        }
        eVar.d(O().b(), cVar, (cVar != null || (V0 = V0()) == null) ? null : R0(V0.toString()));
    }

    @Override // ax.J0.a.InterfaceC0095a
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void v(ax.K0.c<Cursor> cVar, Cursor cursor) {
        if (cursor == null || cursor != this.V) {
            this.V = cursor;
            try {
                super.v(cVar, cursor);
            } catch (NoSuchMethodError e2) {
                ax.Ha.c.h().d("IVOLF:").l(e2).h();
            }
            if (this.S) {
                this.S = false;
                if (O() != null) {
                    ((ImageViewerActivity) O()).y0();
                    F0();
                }
            }
        }
    }

    @Override // com.android.ex.photo.e
    public boolean l(Uri uri) {
        return EnumC1837z.VIDEO == C1808A.g(d0.k(uri.getPath()));
    }

    @Override // com.android.ex.photo.f
    public void o0() {
        super.o0();
        if (O() == null) {
            return;
        }
        Boolean bool = this.X;
        if (bool != null) {
            y0(bool.booleanValue(), false);
            this.X = null;
        } else {
            if (O().r()) {
                return;
            }
            y0(false, false);
        }
    }

    @Override // com.android.ex.photo.e
    public void r(Uri uri, boolean z) {
        AbstractC3595n R0;
        f fVar;
        if (O() == null || (R0 = R0(uri.toString())) == null) {
            return;
        }
        List<AbstractC3595n> U0 = U0();
        if (!C1809B.H(R0)) {
            try {
                C3605y O = R0.O();
                if (O != null) {
                    if (C1809B.F(O, R0)) {
                        try {
                            U0 = Collections.singletonList(O);
                        } catch (C1495j unused) {
                        }
                        R0 = O;
                    }
                }
            } catch (C1495j unused2) {
            }
        } else if (U0 == null) {
            C3184b.e("what case is this?");
            U0 = Collections.singletonList(R0);
        }
        Activity activity = (Activity) O().b();
        if (!C1809B.H(R0)) {
            ax.Ha.c.h().f().b("NOT REACHABLE : IMAGE VIEWER").j().g("PLAY VIDEO:" + uri.toString() + ",fileinfo:" + R0.R()).h();
            Toast.makeText(activity, R.string.error, 1).show();
            return;
        }
        AbstractC1823k abstractC1823k = (AbstractC1823k) R0;
        if (z) {
            fVar = f.BUILT_IN;
        } else {
            c.a aVar = c.a.GENERAL;
            if (Q.K3(activity, aVar, abstractC1823k, false) && !Q.N3(activity, aVar, abstractC1823k, false)) {
                fVar = f.GENERAL;
            } else if (j.F(activity) && C1808A.E(abstractC1823k)) {
                fVar = f.BUILT_IN;
            } else {
                Intent W0 = W0(activity, abstractC1823k, true);
                fVar = (W0 == null || !C1832u.U(W0)) ? f.IN_IMAGE_VIEWER : f.BUILT_IN;
            }
        }
        if (fVar == f.BUILT_IN) {
            Uri L = C1832u.L(abstractC1823k, false);
            ArrayList<e.a> Q0 = Q0(activity, L, U0);
            try {
                ax.Q2.a.i().m("command", "file_open").c("loc", "ImageViewerActivity").c("ext", abstractC1823k.A()).c("result", "success").e();
                activity.startActivityForResult(C1834w.j(activity, L, Q0, true, false), 36001);
                return;
            } catch (ActivityNotFoundException | NullPointerException | SecurityException e2) {
                Toast.makeText(activity, R.string.error, 1).show();
                ax.Ha.c.h().f().b("PVI:").l(e2).h();
                return;
            }
        }
        if (fVar == f.GENERAL) {
            Fragment m = O().m();
            if (m instanceof M) {
                ((M) m).M2(c.a.GENERAL, abstractC1823k, abstractC1823k.s(), false, false);
                return;
            }
            return;
        }
        Fragment m2 = O().m();
        if (m2 instanceof M) {
            ((M) m2).M2(c.a.IN_IMAGE_VIEWER, abstractC1823k, abstractC1823k.s(), false, false);
        }
    }

    @Override // com.android.ex.photo.f, ax.J0.a.InterfaceC0095a
    public ax.K0.c<Cursor> w(int i, Bundle bundle) {
        return i == 100 ? new e(O().b(), this.P) : super.w(i, bundle);
    }

    @Override // com.android.ex.photo.f, com.android.ex.photo.e
    public ax.K0.c<b.a> z(int i, Bundle bundle, String str) {
        if (i != 1) {
            if (i == 2) {
                return new ax.w3.f(O().b(), this.T, null, str, true, false);
            }
            if (i != 3) {
                return super.z(i, bundle, str);
            }
        }
        return new ax.w3.f(O().b(), this.T, R0(str), str, false, bundle != null ? bundle.getBoolean("use_factory_if_possible", true) : true);
    }
}
