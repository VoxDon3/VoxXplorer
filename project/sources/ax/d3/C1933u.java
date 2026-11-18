package ax.d3;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.a3.C1358n;
import ax.c3.C1832u;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1933u extends Fragment implements C1358n.c, Y {
    ListView d0;
    Switch e0;
    PackageManager f0;

    /* renamed from: ax.d3.u$a */
    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (C1933u.this.b() == null) {
                return;
            }
            if (!z || C1832u.Q(C1933u.this.b())) {
                ax.t3.h.n(C1933u.this.b(), z);
            } else if (C3180B.F(C1933u.this, true)) {
                C1933u.this.Q2();
                C1933u.this.e0.setChecked(false);
            }
        }
    }

    /* renamed from: ax.d3.u$b */
    class b extends ArrayAdapter<d> {

        /* renamed from: ax.d3.u$b$a */
        class a implements Runnable {
            final /* synthetic */ d q;

            a(d dVar) {
                this.q = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                C1933u.this.N2(bVar, this.q.a, null);
            }
        }

        /* renamed from: ax.d3.u$b$b, reason: collision with other inner class name */
        class ViewOnClickListenerC0285b implements View.OnClickListener {
            final /* synthetic */ d a;
            final /* synthetic */ ComponentName b;

            ViewOnClickListenerC0285b(d dVar, ComponentName componentName) {
                this.a = dVar;
                this.b = componentName;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b bVar = b.this;
                C1933u.this.N2(bVar, this.a.a, this.b);
            }
        }

        /* renamed from: ax.d3.u$b$c */
        class c implements View.OnLongClickListener {
            final /* synthetic */ ComponentName a;

            c(ComponentName componentName) {
                this.a = componentName;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (C1933u.this.f0() == null) {
                    return false;
                }
                try {
                    C1832u.p0(C1933u.this, C1832u.d(this.a.getPackageName()));
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(C1933u.this.f0(), R.string.no_application, 1).show();
                }
                return true;
            }
        }

        /* renamed from: ax.d3.u$b$d */
        class d implements Runnable {
            final /* synthetic */ ComponentName c0;
            final /* synthetic */ d q;

            d(d dVar, ComponentName componentName) {
                this.q = dVar;
                this.c0 = componentName;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                C1933u.this.N2(bVar, this.q.a, this.c0);
            }
        }

        b(Context context) {
            super(context, 0);
            a();
        }

        void a() {
            clear();
            addAll(C1933u.this.O2(getContext()));
            notifyDataSetChanged();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            c cVar;
            View view2;
            LayoutInflater from = LayoutInflater.from(getContext());
            boolean z = false;
            if (view == null) {
                view2 = from.inflate(R.layout.item_default_app_list, viewGroup, false);
                cVar = C1933u.this.new c(view2);
                view2.setTag(cVar);
            } else {
                cVar = (c) view.getTag();
                view2 = view;
            }
            d dVar = (d) getItem(i);
            cVar.a.setText(dVar.a);
            if (TextUtils.isEmpty(dVar.b)) {
                cVar.b.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                cVar.b.setText("." + dVar.b);
            }
            cVar.c.removeAllViews();
            if (dVar.c.size() == 0) {
                C3184b.e("no component default mimetype : " + dVar.a);
                new Handler(Looper.getMainLooper()).post(new a(dVar));
                return view2;
            }
            for (ComponentName componentName : dVar.c) {
                try {
                    View inflate = from.inflate(R.layout.item_default_app_list_part, cVar.c, z);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
                    TextView textView = (TextView) inflate.findViewById(R.id.app_name);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.activity_name);
                    ActivityInfo activityInfo = C1933u.this.f0.getActivityInfo(componentName, z ? 1 : 0);
                    ApplicationInfo applicationInfo = activityInfo.applicationInfo;
                    CharSequence loadLabel = applicationInfo != null ? applicationInfo.loadLabel(C1933u.this.f0) : null;
                    CharSequence loadLabel2 = activityInfo.loadLabel(C1933u.this.f0);
                    try {
                        imageView.setImageDrawable(activityInfo.loadIcon(C1933u.this.f0));
                        textView2.setText(loadLabel2);
                        if (loadLabel2.equals(loadLabel)) {
                            z = false;
                            textView.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                            textView.setVisibility(8);
                        } else {
                            textView.setText(loadLabel);
                            z = false;
                            textView.setVisibility(0);
                        }
                        inflate.findViewById(R.id.clear).setOnClickListener(new ViewOnClickListenerC0285b(dVar, componentName));
                        inflate.setOnLongClickListener(new c(componentName));
                        cVar.c.addView(inflate);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z = false;
                        new Handler(Looper.getMainLooper()).post(new d(dVar, componentName));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            return view2;
        }
    }

    /* renamed from: ax.d3.u$c */
    class c {
        TextView a;
        TextView b;
        LinearLayout c;

        c(View view) {
            this.a = (TextView) view.findViewById(R.id.mimetype);
            this.b = (TextView) view.findViewById(R.id.extension);
            this.c = (LinearLayout) view.findViewById(R.id.component_container);
        }
    }

    /* renamed from: ax.d3.u$d */
    class d {
        String a;
        String b;
        Set<ComponentName> c = new HashSet();

        d(String str, List<ax.Z2.c> list) {
            this.a = str;
            for (ax.Z2.c cVar : list) {
                this.c.add(cVar.e);
                this.b = cVar.d;
            }
        }
    }

    /* renamed from: ax.d3.u$e */
    class e implements Comparator<d> {
        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int a = C3180B.a(dVar.a, dVar2.a);
            return a != 0 ? a : C3180B.a(dVar.b, dVar2.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2(b bVar, String str, ComponentName componentName) {
        if (b() == null) {
            return;
        }
        if (componentName == null) {
            ax.t3.h.l(b(), str);
        } else {
            ax.t3.h.m(b(), str, componentName);
        }
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<d> O2(Context context) {
        ArrayList arrayList = new ArrayList();
        Map<String, List<ax.Z2.c>> b2 = ax.t3.h.b(context);
        for (String str : b2.keySet()) {
            arrayList.add(new d(str, b2.get(str)));
        }
        Collections.sort(arrayList, new e());
        return arrayList;
    }

    private void P2() {
        this.e0.setChecked(ax.t3.h.i(b()));
        this.e0.setOnCheckedChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        C1358n k3 = C1358n.k3(0, R.string.msg_need_file_uri_plugin, R.string.menu_install, android.R.string.cancel);
        k3.D2(this, 0);
        C3180B.d0(s0(), k3, "fileuri", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        P2();
    }

    @Override // androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        this.f0 = b().getPackageManager();
        Context b2 = b();
        this.d0 = (ListView) view.findViewById(R.id.list);
        this.d0.setEmptyView(view.findViewById(R.id.empty));
        this.e0 = (Switch) view.findViewById(R.id.compatibility_mode);
        if (!ax.X2.Q.N() || (!ax.X2.Q.O() && !C1832u.Q(b()))) {
            this.e0.setVisibility(8);
        }
        this.d0.setAdapter((ListAdapter) new b(b2));
        P2();
    }

    @Override // ax.a3.C1358n.c
    public void P(C1358n c1358n) {
        try {
            C1832u.p0(this, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.voxdon.plugin.fileuri")));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(b(), R.string.no_application, 1).show();
        }
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        if (z) {
            return;
        }
        this.d0.setPadding(0, 0, 0, bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_defaults, (ViewGroup) null);
    }

    @Override // ax.a3.C1358n.c
    public void G(C1358n c1358n) {
    }

    @Override // ax.a3.C1358n.c
    public void Z(C1358n c1358n) {
    }
}
