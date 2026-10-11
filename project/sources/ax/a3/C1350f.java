package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.W2.h;
import ax.a3.C1360p;
import ax.b3.C1488c;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1829q;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.d3.AbstractC1927n;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.a3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1350f extends I implements AdapterView.OnItemClickListener {
    private TextView A0;
    private ProgressBar B0;
    private j C0;
    private l D0;
    private k E0;
    private List<AbstractC3595n> F0;
    private i G0;
    private m H0;
    private String I0;
    private AbstractC3595n J0;
    private C3596o K0;
    private ax.c3.K L0;
    private int M0;
    private int N0;
    private int O0;
    private ax.c3.K P0;
    private int t0;
    private boolean u0;
    private View v0;
    private ListView w0;
    private ImageButton x0;
    private ImageButton y0;
    private TextView z0;

    /* renamed from: ax.a3.f$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (C1350f.this.J0 == null) {
                return;
            }
            C1350f.this.C0.c(C1350f.this.K0, C1350f.this.J0);
            C1350f.this.O2();
        }
    }

    /* renamed from: ax.a3.f$b */
    class b extends AbstractDialogInterfaceOnClickListenerC1363t {
        b() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            C1350f.this.C0.b();
            C1350f.this.O2();
        }
    }

    /* renamed from: ax.a3.f$c */
    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1350f.this.K3();
        }
    }

    /* renamed from: ax.a3.f$d */
    class d extends ax.g3.c {
        d() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1350f.this.H3();
        }
    }

    /* renamed from: ax.a3.f$e */
    class e implements DialogInterface.OnCancelListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C1350f.this.C0.a();
        }
    }

    /* renamed from: ax.a3.f$f, reason: collision with other inner class name */
    class DialogInterfaceOnKeyListenerC0250f implements DialogInterface.OnKeyListener {
        DialogInterfaceOnKeyListenerC0250f() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 0 || C1350f.this.M3()) {
                return false;
            }
            C1350f.this.K3();
            return true;
        }
    }

    /* renamed from: ax.a3.f$h */
    class h implements C1360p.d {
        final /* synthetic */ ax.W2.m a;
        final /* synthetic */ AbstractC1927n b;

        h(ax.W2.m mVar, AbstractC1927n abstractC1927n) {
            this.a = mVar;
            this.b = abstractC1927n;
        }

        @Override // ax.a3.C1360p.d
        public EnumC1356l a(String str) {
            C3184b.c(!TextUtils.isEmpty(str));
            if (C1350f.this.F0 != null) {
                String Q = d0.Q(this.a.m(), str);
                Iterator it = C1350f.this.F0.iterator();
                while (it.hasNext()) {
                    if (Q.equals(((AbstractC3595n) it.next()).E())) {
                        return EnumC1356l.FAILURE_FILENAME_CONFLICT;
                    }
                }
            }
            this.a.o(str);
            try {
                this.b.l(this.a, false);
                return EnumC1356l.SUCCESS;
            } catch (C1488c unused) {
                return EnumC1356l.FAILURE_COMMAND_START;
            }
        }
    }

    /* renamed from: ax.a3.f$i */
    private class i extends AbstractC3199q<Void, Void, AbstractC3595n> {
        private String h;
        C3596o i;

        public i(C3596o c3596o, String str) {
            super(AbstractC3199q.e.HIGHER);
            this.i = c3596o;
            this.h = str;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            this.i.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC3595n g(Void... voidArr) {
            try {
                AbstractC3595n z = this.i.z(this.h);
                if (this.i.S() != ax.Q2.f.q0 || z.n() || !d0.E(z)) {
                    return z;
                }
                this.i.k(z, true);
                return this.i.z(this.h);
            } catch (C1495j unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(AbstractC3595n abstractC3595n) {
            this.i.k0(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(AbstractC3595n abstractC3595n) {
            if (abstractC3595n != null) {
                C1350f.this.J0 = abstractC3595n;
                C1350f.this.O3(this.i, abstractC3595n);
            } else if (C1350f.this.J0 == null) {
                C1350f.this.K3();
            } else {
                C1350f.this.N3();
            }
            this.i.k0(true);
        }
    }

    /* renamed from: ax.a3.f$j */
    public interface j {
        void a();

        void b();

        void c(C3596o c3596o, AbstractC3595n abstractC3595n);
    }

    /* renamed from: ax.a3.f$k */
    private class k extends ArrayAdapter<AbstractC3595n> {
        private Context a;

        /* renamed from: ax.a3.f$k$a */
        class a {
            private ImageView a;
            private TextView b;
            private String c;

            public a(View view) {
                b(view);
            }

            private void b(View view) {
                this.a = (ImageView) view.findViewById(R.id.choose_path_item_iv_icon);
                this.b = (TextView) view.findViewById(R.id.choose_path_item_iv_path);
            }

            private void c(ImageView imageView, boolean z) {
                imageView.setAlpha(z ? 0.5f : 1.0f);
            }

            void a(AbstractC3595n abstractC3595n) {
                if (abstractC3595n == null) {
                    return;
                }
                String str = this.c;
                if (str == null || !str.equals(abstractC3595n.t())) {
                    this.c = abstractC3595n.t();
                    ImageView imageView = this.a;
                    imageView.setImageDrawable(abstractC3595n.Y(imageView.getContext()));
                    this.b.setText(abstractC3595n.B());
                    c(this.a, abstractC3595n.h());
                }
            }
        }

        public k(Context context, List<AbstractC3595n> list) {
            super(context, 0, list);
            this.a = context;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            AbstractC3595n abstractC3595n = (AbstractC3595n) getItem(i);
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(R.layout.choose_path_item, viewGroup, false);
                aVar = new a(view);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.a(abstractC3595n);
            return view;
        }
    }

    /* renamed from: ax.a3.f$l */
    private class l extends ArrayAdapter<ax.c3.K> {
        private Context a;

        /* renamed from: ax.a3.f$l$a */
        class a {
            private ImageView a;
            private TextView b;

            public a(View view) {
                b(view);
            }

            private void b(View view) {
                this.a = (ImageView) view.findViewById(R.id.choose_path_item_iv_icon);
                this.b = (TextView) view.findViewById(R.id.choose_path_item_iv_path);
            }

            void a(ax.c3.K k) {
                if (k == null) {
                    return;
                }
                this.a.setImageResource(ax.s3.b.k(k.d(), null));
                this.b.setText(k.f(l.this.a));
            }
        }

        public l(Context context, List<ax.c3.K> list) {
            super(context, 0, list);
            this.a = context;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            ax.c3.K k = (ax.c3.K) getItem(i);
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(R.layout.choose_path_item, viewGroup, false);
                aVar = new a(view);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.a(k);
            return view;
        }
    }

    /* renamed from: ax.a3.f$m */
    private class m extends AbstractC3199q<Void, Void, List<AbstractC3595n>> {
        private AbstractC3595n h;
        private C1495j i;
        private C3596o j;
        private Context k;

        public m(C3596o c3596o, AbstractC3595n abstractC3595n) {
            super(AbstractC3199q.e.HIGHER);
            this.h = abstractC3595n;
            this.j = c3596o;
            this.k = c3596o.t();
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            this.j.n0();
            C1350f.this.E0.clear();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(Void... voidArr) {
            AbstractC3595n abstractC3595n;
            try {
                if (C1350f.this.L0.d() != ax.Q2.f.n0 && (abstractC3595n = this.h) != null) {
                    return C1829q.g(C1809B.h(this.j.f0(abstractC3595n), null, ax.t3.e.h(C1350f.this.f0(), C1350f.this.L0.d(), C1350f.this.L0.b(), this.h.E(), false), true), C1829q.c("NameUp"));
                }
                return null;
            } catch (C1490e e) {
                e.printStackTrace();
                this.i = e;
                return null;
            } catch (C1495j e2) {
                e2.printStackTrace();
                this.i = e2;
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(List<AbstractC3595n> list) {
            this.j.k0(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            this.j.k0(false);
            if (C1350f.this.L0.d() == ax.Q2.f.n0) {
                C1350f.this.J0 = null;
                C1350f.this.I0 = null;
                C1350f.this.w0.setAdapter((ListAdapter) C1350f.this.D0);
                C1350f.this.W3(null);
            } else {
                C1350f.this.J0 = this.h;
                if (list != null) {
                    C1350f.this.F0.clear();
                    C1350f.this.F0.addAll(list);
                    C1350f.this.E0.notifyDataSetChanged();
                    C1350f.this.w0.setSelectionAfterHeaderView();
                    String W = C1350f.this.J0.W();
                    C1350f.this.R3(C1350f.this.L0.f(this.k));
                    C1350f.this.z0.setText(W);
                    if (C1350f.this.F0.size() > 0) {
                        C1350f.this.U3(false);
                    } else {
                        C1350f.this.U3(true);
                    }
                } else {
                    C1350f.this.U3(true);
                    if (this.i instanceof C1490e) {
                        Toast.makeText(C1350f.this.f0(), R.string.error_access_denied, 1).show();
                    } else {
                        Toast.makeText(C1350f.this.f0(), R.string.error, 1).show();
                    }
                }
                C1350f.this.W3(this.h);
            }
            C1350f.this.L3();
            C1350f.this.I3(true);
        }
    }

    private boolean D3() {
        return this.t0 == 1;
    }

    private void E3(String str) {
        if (str != null) {
            i iVar = this.G0;
            if (iVar != null && !iVar.isCancelled()) {
                this.G0.e();
            }
            if (this.K0 == null) {
                ax.Ha.c.h().f().b("CHOOSE FILE CD NULL").j().h();
                return;
            }
            this.I0 = str;
            W3(null);
            I3(false);
            i iVar2 = new i(this.K0, str);
            this.G0 = iVar2;
            iVar2.h(new Void[0]);
        }
    }

    public static C1350f F3(ax.d3.E e2, ax.c3.K k2) {
        C1350f c1350f = new C1350f();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 1);
        if (k2 != null) {
            bundle.putSerializable("location", k2.d());
            bundle.putSerializable("key", Integer.valueOf(k2.b()));
        }
        c1350f.v2(bundle);
        c1350f.D2(e2, 0);
        return c1350f;
    }

    public static C1350f G3(boolean z) {
        C1350f c1350f = new C1350f();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_type", 2);
        bundle.putBoolean("has_private_key", z);
        c1350f.v2(bundle);
        return c1350f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3() {
        if (this.K0 == null) {
            return;
        }
        if (this.J0 != null) {
            ax.W2.m n = ax.W2.m.n();
            n.k(this.K0, this.J0.E(), true, new g());
            S3(n, true);
        } else {
            ax.Ha.c.h().f().b("CREATE NEW FOLDER IN CHOOSEFILE").g("PATH : " + this.I0).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(boolean z) {
        this.y0.setEnabled(z);
        if (z) {
            this.y0.setAlpha(1.0f);
        } else {
            this.y0.setAlpha(0.1f);
        }
    }

    private List<ax.c3.K> J3() {
        List<ax.c3.K> A;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ax.c3.K.e);
        ax.Z2.j.F().K0();
        if (ax.Z2.j.F().t0()) {
            arrayList.add(ax.c3.K.f);
        }
        if (D3() && ax.X2.Q.S1() && (A = ax.Z2.j.F().A()) != null) {
            arrayList.addAll(A);
        }
        arrayList.add(ax.c3.K.i);
        ax.c3.K k2 = this.P0;
        if (k2 != null && k2 != ax.c3.K.h && !arrayList.contains(k2)) {
            if (ax.Q2.f.j0(this.P0.d())) {
                arrayList.add(this.P0);
                return arrayList;
            }
            if (D3() && ax.Q2.f.e0(this.P0.d())) {
                arrayList.add(this.P0);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3() {
        if (this.J0 == null || this.L0.e() == null || this.L0.e().equals(this.J0.E())) {
            V3(ax.c3.K.a(ax.Q2.f.n0, 0));
            W3(null);
        } else {
            if ("/".equals(this.J0.E())) {
                return;
            }
            E3(this.J0.T());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3() {
        this.B0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M3() {
        return this.L0 == ax.c3.K.a(ax.Q2.f.n0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N3() {
        ax.c3.K k2;
        if (this.J0 == null || (k2 = this.L0) == null || k2.d() == ax.Q2.f.n0) {
            return;
        }
        E3(this.J0.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O3(C3596o c3596o, AbstractC3595n abstractC3595n) {
        if (abstractC3595n.isDirectory()) {
            m mVar = this.H0;
            if (mVar != null && !mVar.isCancelled()) {
                this.H0.e();
            }
            W3(null);
            T3();
            I3(false);
            m mVar2 = new m(c3596o, abstractC3595n);
            this.H0 = mVar2;
            mVar2.h(new Void[0]);
        }
    }

    private void Q3(int i2) {
        if (Q2() == null) {
            return;
        }
        Q2().setTitle(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str) {
        if (Q2() == null) {
            return;
        }
        Q2().setTitle(str);
    }

    private void T3() {
        this.B0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U3(boolean z) {
        if (z) {
            this.w0.setVisibility(8);
            this.A0.setVisibility(0);
        } else {
            this.A0.setVisibility(8);
            this.w0.setVisibility(0);
        }
    }

    private void V3(ax.c3.K k2) {
        this.L0 = k2;
        if (k2.d() != ax.Q2.f.n0) {
            C3596o e2 = C1835x.e(this.L0);
            this.K0 = e2;
            if (!e2.a()) {
                this.K0.h(null);
            }
            this.w0.setAdapter((ListAdapter) this.E0);
            this.v0.setVisibility(0);
            return;
        }
        this.K0 = null;
        this.J0 = null;
        this.w0.setAdapter((ListAdapter) this.D0);
        this.v0.setVisibility(8);
        this.z0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.F0.clear();
        Q3(this.M0);
        U3(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3(AbstractC3595n abstractC3595n) {
        Button i2;
        if (Q2() == null || (i2 = ((androidx.appcompat.app.a) Q2()).i(-1)) == null) {
            return;
        }
        if (abstractC3595n == null) {
            i2.setEnabled(false);
        } else if (abstractC3595n.j()) {
            i2.setEnabled(true);
        } else {
            i2.setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        if (Q2() != null) {
            V3(this.L0);
            W3(null);
        }
    }

    public void P3(j jVar) {
        this.C0 = jVar;
    }

    protected void S3(ax.W2.m mVar, boolean z) {
        if (X0() && s0() != null && (P0() instanceof AbstractC1927n)) {
            AbstractC1927n abstractC1927n = (AbstractC1927n) P0();
            abstractC1927n.A(C1360p.l3(z, new h(mVar, abstractC1927n)), "createFileName", true);
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a a2 = C3190h.a(f0());
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(f0()).inflate(R.layout.dialog_choose_extract_path, (ViewGroup) null);
        this.v0 = relativeLayout.findViewById(R.id.dialog_choose_extract_path_rl_current_path);
        this.w0 = (ListView) relativeLayout.findViewById(R.id.dialog_choose_extract_path_lv_directory);
        this.x0 = (ImageButton) relativeLayout.findViewById(R.id.dialog_choose_extract_path_ib_up);
        this.y0 = (ImageButton) relativeLayout.findViewById(R.id.dialog_choose_extract_path_ib_new_folder);
        this.z0 = (TextView) relativeLayout.findViewById(R.id.dialog_choose_extract_path_tv_current_path);
        this.A0 = (TextView) relativeLayout.findViewById(R.id.dialog_choose_extract_path_tv_empty);
        this.B0 = (ProgressBar) relativeLayout.findViewById(R.id.dialog_choose_extract_path_pb_loading);
        this.L0 = ax.c3.K.a(ax.Q2.f.n0, 0);
        int i2 = this.t0;
        if (i2 == 1) {
            this.M0 = R.string.dialog_title_choose_extract_path;
            this.N0 = R.string.dialog_button_extract_here;
            this.O0 = 0;
        } else if (i2 == 2) {
            this.M0 = R.string.dialog_title_choose_file;
            this.N0 = 0;
            if (this.u0) {
                this.O0 = R.string.menu_clear;
            } else {
                this.O0 = 0;
            }
            this.y0.setVisibility(8);
        }
        this.F0 = new ArrayList();
        this.E0 = new k(f0(), this.F0);
        this.w0.setOnItemClickListener(this);
        this.v0.setVisibility(8);
        this.D0 = new l(f0(), J3());
        int i3 = this.N0;
        if (i3 != 0) {
            a2.setPositiveButton(i3, new a());
        }
        int i4 = this.O0;
        if (i4 != 0) {
            a2.i(i4, new b());
        }
        this.x0.setOnClickListener(new c());
        this.y0.setOnClickListener(new d());
        a2.setNegativeButton(android.R.string.cancel, null);
        a2.j(new e());
        a2.k(new DialogInterfaceOnKeyListenerC0250f());
        return a2.setView(relativeLayout).p(this.M0).create();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        Bundle j0 = j0();
        if (j0 != null) {
            int i2 = j0.getInt("dialog_type", 0);
            this.t0 = i2;
            if (i2 == 2) {
                this.u0 = j0.getBoolean("has_private_key");
            }
            ax.Q2.f fVar = (ax.Q2.f) j0.getSerializable("location");
            if (fVar != null) {
                this.P0 = ax.c3.K.a(fVar, j0.getInt("key"));
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        if (this.L0.d() == ax.Q2.f.n0) {
            ax.c3.K k2 = (ax.c3.K) this.D0.getItem(i2);
            V3(k2);
            E3(k2.e());
            return;
        }
        AbstractC3595n abstractC3595n = (AbstractC3595n) this.E0.getItem(i2);
        if (abstractC3595n.isDirectory()) {
            O3(this.K0, abstractC3595n);
            return;
        }
        if (this.t0 == 2) {
            if (com.voxdon.xplorer.file.L.G0(this.K0, abstractC3595n)) {
                this.C0.c(this.K0, abstractC3595n);
                O2();
                return;
            }
            Toast.makeText(b(), M0(R.string.error_invalid_file_format) + "\n\n(e.g. ssh-keygen -t rsa -m PEM)", 0).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        m mVar = this.H0;
        if (mVar != null && !mVar.isCancelled()) {
            this.H0.e();
        }
        i iVar = this.G0;
        if (iVar != null && !iVar.isCancelled()) {
            this.G0.e();
        }
        super.s1();
    }

    /* renamed from: ax.a3.f$g */
    class g implements h.a {
        g() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (C1350f.this.b() == null) {
                return;
            }
            C1350f.this.N3();
            Toast.makeText(C1350f.this.b(), str, 1).show();
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }
}
