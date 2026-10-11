package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.c3.C1835x;
import ax.i3.C2265a;
import ax.nb.C2644g;
import ax.pb.C2794a0;
import ax.pb.C2796b0;
import ax.pb.C2820u;
import ax.u3.AbstractC3199q;
import ax.u3.C3190h;
import ax.u3.C3198p;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.a3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1352h extends androidx.fragment.app.e implements AdapterView.OnItemClickListener {
    private C3596o A0;
    private ListView t0;
    private View u0;
    private TextView v0;
    private ProgressBar w0;
    private f x0;
    private List<d> y0;
    private e z0;

    /* renamed from: ax.a3.h$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1352h.this.f0() instanceof MainActivity) {
                if (C1352h.this.z0 != null && !C1352h.this.z0.isCancelled()) {
                    C1352h.this.z0.e();
                }
                ((MainActivity) C1352h.this.f0()).w1().a(null);
            }
        }
    }

    /* renamed from: ax.a3.h$b */
    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1352h.this.p3();
        }
    }

    /* renamed from: ax.a3.h$c */
    public interface c {
        void a(d dVar);
    }

    /* renamed from: ax.a3.h$d */
    public static class d {
        public String a;
        public String b;

        d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: ax.a3.h$e */
    private class e extends AbstractC3199q<Void, Integer, List<d>> {
        List<d> h;

        /* renamed from: ax.a3.h$e$a */
        class a implements C3198p.b {
            a() {
            }

            @Override // ax.u3.C3198p.b
            public void a(String str) {
                e.this.y(new d(C1352h.n3(str), str));
                e.this.v(new Integer[0]);
            }
        }

        /* renamed from: ax.a3.h$e$b */
        class b implements Callable<Void> {
            b() {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                try {
                    try {
                        C2796b0[] M = new C2796b0("smb://").M();
                        for (int i = 0; i < M.length; i++) {
                            try {
                                for (C2796b0 c2796b0 : M[i].M()) {
                                    String host = c2796b0.getURL().getHost();
                                    if (host != null) {
                                        e.this.y(new d(host, null));
                                    }
                                }
                            } catch (C2820u e) {
                                e.printStackTrace();
                                String m3 = C1352h.this.m3(M[i]);
                                if (m3 != null) {
                                    e.this.y(new d(m3, null));
                                }
                            } catch (C2794a0 e2) {
                                e2.printStackTrace();
                            }
                        }
                    } catch (MalformedURLException e3) {
                        e3.printStackTrace();
                    }
                } catch (C2794a0 e4) {
                    e4.printStackTrace();
                }
                e.this.v(new Integer[0]);
                return null;
            }
        }

        public e() {
            super(AbstractC3199q.e.HIGH);
            this.h = DesugarCollections.synchronizedList(new ArrayList());
        }

        private Future<Void> B() {
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
            Future<Void> submit = newFixedThreadPool.submit(new b());
            newFixedThreadPool.shutdown();
            return submit;
        }

        private void z() {
            androidx.fragment.app.f f0 = C1352h.this.f0();
            if (f0 == null) {
                return;
            }
            Future<Void> B = B();
            try {
                B.get(1000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            byte[] f = C2265a.f(f0);
            if (f[0] != 0) {
                List<Future<C3198p.c>> b2 = C3198p.b(f, 500, 20, new a());
                ArrayList arrayList = new ArrayList();
                for (Future<C3198p.c> future : b2) {
                    if (isCancelled()) {
                        future.cancel(true);
                    } else {
                        try {
                            C3198p.c cVar = future.get();
                            if (cVar.b) {
                                arrayList.add(cVar.a);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            try {
                B.get();
            } catch (InterruptedException | ExecutionException unused2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public List<d> g(Void... voidArr) {
            this.h.clear();
            z();
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void p(List<d> list) {
            C1352h.this.A0.k0(false);
            if (C1352h.this.f0() == null) {
                return;
            }
            C1352h.this.o3();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void q(List<d> list) {
            C1352h.this.A0.k0(false);
            if (C1352h.this.f0() == null) {
                return;
            }
            if (list != null) {
                C1352h.this.y0.clear();
                C1352h.this.y0.addAll(list);
                C1352h.this.x0.notifyDataSetChanged();
                C1352h.this.t0.setSelectionAfterHeaderView();
                if (C1352h.this.y0.size() > 0) {
                    C1352h.this.r3(false);
                } else {
                    C1352h.this.r3(true);
                }
            } else {
                C1352h.this.r3(true);
                Toast.makeText(C1352h.this.f0(), R.string.error_check_network, 1).show();
            }
            C1352h.this.o3();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void s(Integer... numArr) {
            if (C1352h.this.f0() == null) {
                return;
            }
            C1352h.this.y0.clear();
            C1352h.this.y0.addAll(this.h);
            C1352h.this.x0.notifyDataSetChanged();
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            C1352h.this.A0.n0();
        }

        synchronized void y(d dVar) {
            d dVar2;
            try {
                Iterator<d> it = this.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar2 = null;
                        break;
                    }
                    dVar2 = it.next();
                    String str = dVar.a;
                    if (str != null && str.equals(dVar2.a)) {
                        break;
                    }
                }
                if (dVar2 == null) {
                    this.h.add(dVar);
                } else if (dVar2.b != null) {
                    this.h.remove(dVar2);
                    this.h.add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ax.a3.h$f */
    private class f extends ArrayAdapter<d> {
        private Context a;

        /* renamed from: ax.a3.h$f$a */
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

            void a(d dVar) {
                this.a.setImageResource(ax.s3.b.k(ax.Q2.f.J0, null));
                this.b.setText(dVar.a);
            }
        }

        public f(Context context, List<d> list) {
            super(context, 0, list);
            this.a = context;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            d dVar = (d) getItem(i);
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(R.layout.choose_path_item, viewGroup, false);
                aVar = new a(view);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.a(dVar);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String m3(C2796b0 c2796b0) {
        try {
            String host = c2796b0.getURL().getHost();
            for (C2644g c2644g : C2644g.k(host)) {
                if (!c2644g.r().equals(host) && !c2644g.x()) {
                    return c2644g.r();
                }
            }
            return null;
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String n3(String str) {
        String str2 = null;
        try {
            C2644g[] j = C2644g.j(C2644g.n(str, 32, null), 2, 3000);
            if (j != null && j.length > 0) {
                int length = j.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C2644g c2644g = j[i];
                    if (!c2644g.x()) {
                        str2 = c2644g.r();
                        break;
                    }
                    i++;
                }
                if (str2 == null) {
                    str2 = j[0].r();
                }
            }
        } catch (UnknownHostException unused) {
        }
        return str2 == null ? str : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        this.u0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p3() {
        e eVar = this.z0;
        if (eVar != null && !eVar.isCancelled()) {
            this.z0.e();
        }
        q3();
        e eVar2 = new e();
        this.z0 = eVar2;
        eVar2.i(new Void[0]);
    }

    private void q3() {
        this.u0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r3(boolean z) {
        if (z) {
            this.t0.setVisibility(8);
            this.v0.setVisibility(0);
        } else {
            this.v0.setVisibility(8);
            this.t0.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        if (aVar != null) {
            aVar.i(-1).setOnClickListener(new a());
            aVar.i(-3).setOnClickListener(new b());
        }
        p3();
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        a.C0006a a2 = C3190h.a(f0());
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(f0()).inflate(R.layout.dialog_choose_smb, (ViewGroup) null);
        this.t0 = (ListView) relativeLayout.findViewById(R.id.dialog_choose_smb_lv_smb);
        this.u0 = relativeLayout.findViewById(R.id.progressbar);
        this.v0 = (TextView) relativeLayout.findViewById(R.id.dialog_choose_smb_tv_empty);
        this.w0 = (ProgressBar) relativeLayout.findViewById(R.id.dialog_choose_smb_pb_loading);
        this.A0 = C1835x.d(ax.Q2.f.J0, 0);
        this.y0 = new ArrayList();
        f fVar = new f(f0(), this.y0);
        this.x0 = fVar;
        this.t0.setAdapter((ListAdapter) fVar);
        this.t0.setOnItemClickListener(this);
        a2.setPositiveButton(R.string.dialog_button_manual_input, null);
        a2.setNegativeButton(R.string.dialog_button_cancel, null);
        return a2.setView(relativeLayout).p(R.string.location_lan).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (f0() instanceof MainActivity) {
            e eVar = this.z0;
            if (eVar != null && !eVar.isCancelled()) {
                this.z0.e();
            }
            ((MainActivity) f0()).w1().a((d) this.x0.getItem(i));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        e eVar = this.z0;
        if (eVar != null && !eVar.isCancelled()) {
            this.z0.e();
        }
        super.s1();
    }
}
