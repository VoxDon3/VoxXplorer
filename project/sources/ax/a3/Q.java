package ax.a3;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.Z2.c;
import ax.Z2.h;
import ax.a3.C1358n;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1833v;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.activity.DefaultsSettingsActivity;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.R;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Q extends I implements C1358n.c {
    private static final Logger N0 = Logger.getLogger("FileManager.FileIntent");
    boolean A0;
    boolean B0;
    h C0;
    boolean D0;
    boolean E0;
    g F0;
    private ListView H0;
    private String I0;
    private List<h.a> J0;
    private boolean K0;
    ax.Z2.h t0;
    boolean u0;
    private c.a v0;
    String w0;
    String x0;
    String y0;
    Uri z0;
    private int G0 = -1;
    private LruCache<ResolveInfo, Drawable> L0 = new LruCache<>(30);
    private HashMap<ResolveInfo, CharSequence> M0 = new HashMap<>();

    class a implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;
        final /* synthetic */ Context b;

        /* renamed from: ax.a3.Q$a$a, reason: collision with other inner class name */
        class C0244a extends ax.g3.c {
            C0244a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (Q.this.b() == null) {
                    return;
                }
                int checkedItemPosition = Q.this.H0.getCheckedItemPosition();
                if (checkedItemPosition < 0 || checkedItemPosition >= Q.this.F0.getCount()) {
                    ax.Ha.c.h().f().b("RESOLVE DIALOG INEXT OUT OF BOUND").g("pos:" + checkedItemPosition).h();
                    return;
                }
                boolean i = ax.t3.h.i(a.this.b);
                Q q = Q.this;
                Intent G3 = q.G3(q.F0.getItem(checkedItemPosition), true, false, i);
                if (G3 == null) {
                    Q.this.W3();
                } else {
                    Q.this.P3(G3);
                    Q.this.O2();
                }
            }
        }

        class b extends ax.g3.c {
            b() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (Q.this.b() == null) {
                    return;
                }
                int checkedItemPosition = Q.this.H0.getCheckedItemPosition();
                if (checkedItemPosition < 0 || checkedItemPosition >= Q.this.F0.getCount()) {
                    ax.Ha.c.h().f().b("RESOLVE DIALOG INEXT OUT OF BOUND 2").g("pos:" + checkedItemPosition).h();
                    return;
                }
                boolean i = ax.t3.h.i(a.this.b);
                Q q = Q.this;
                Intent G3 = q.G3(q.F0.getItem(checkedItemPosition), true, true, i);
                if (G3 == null) {
                    Q.this.W3();
                } else {
                    Q.this.P3(G3);
                    Q.this.O2();
                }
            }
        }

        a(androidx.appcompat.app.a aVar, Context context) {
            this.a = aVar;
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new C0244a());
            this.a.i(-2).setOnClickListener(new b());
            Q q = Q.this;
            if (q.D0) {
                q.x3(this.a, true);
            } else {
                q.x3(this.a, false);
            }
        }
    }

    class b extends ax.g3.d {
        b() {
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            Q.this.S3(i, d.NORMAL);
        }
    }

    class c implements AdapterView.OnItemLongClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (Q.this.f0() == null) {
                return false;
            }
            try {
                C1832u.p0(Q.this, C1832u.d(Q.this.F0.getItem(i).a.getPackageName()));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(Q.this.f0(), R.string.no_application, 1).show();
            }
            return true;
        }
    }

    enum d {
        NORMAL,
        LONG,
        CHOICE,
        ICON
    }

    static class e extends AbstractC3199q<Void, Void, Drawable> {
        private ResolveInfo h;
        private i i;
        private ax.Z2.h j;
        private LruCache<ResolveInfo, Drawable> k;

        e(ax.Z2.h hVar, i iVar, LruCache<ResolveInfo, Drawable> lruCache, ResolveInfo resolveInfo) {
            super(AbstractC3199q.e.HIGH);
            this.j = hVar;
            this.i = iVar;
            this.k = lruCache;
            this.h = resolveInfo;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Drawable g(Void... voidArr) {
            Drawable c = this.j.c(this.h);
            Context context = this.i.c.getContext();
            if (c != null) {
                int e = C3180B.e(context, 32);
                c.setBounds(0, 0, e, e);
            }
            return c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Drawable drawable) {
            ResolveInfo resolveInfo = this.i.b;
            ResolveInfo resolveInfo2 = this.h;
            if (resolveInfo != resolveInfo2) {
                return;
            }
            if (drawable != null) {
                this.k.put(resolveInfo2, drawable);
            }
            this.i.c.setImageDrawable(drawable);
        }
    }

    public interface f {
        void L();

        void W(int i, Intent intent);

        void f();
    }

    class g extends BaseAdapter {
        private List<h.a> a;
        private Context b;
        private PackageManager c;
        private ax.Z2.h d;
        private boolean e;

        class a implements CompoundButton.OnCheckedChangeListener {
            final /* synthetic */ h.a a;

            a(h.a aVar) {
                this.a = aVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.i(z);
            }
        }

        g(Context context, ax.Z2.h hVar, List<h.a> list) {
            this.b = context;
            this.c = context.getPackageManager();
            this.a = list;
            this.d = hVar;
        }

        @Override // android.widget.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h.a getItem(int i) {
            return this.a.get(i);
        }

        public void b(boolean z) {
            this.e = z;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            i iVar;
            if (view != null) {
                iVar = (i) view.getTag();
            } else {
                view = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.item_resolver_list, viewGroup, false);
                iVar = Q.this.new i(view);
                view.setTag(iVar);
            }
            iVar.a = i;
            h.a item = getItem(i);
            if (item.h()) {
                Intent d = item.d(0);
                int intExtra = d.getIntExtra("title_resource", 0);
                String M0 = intExtra != 0 ? Q.this.M0(intExtra) : HttpUrl.FRAGMENT_ENCODE_SET;
                iVar.b = null;
                iVar.d.setText(M0);
                iVar.c.setImageResource(d.getIntExtra("icon_resource", 0));
                iVar.e.setVisibility(8);
                return view;
            }
            ResolveInfo f = item.f(0);
            iVar.b = f;
            CharSequence charSequence = (CharSequence) Q.this.M0.get(f);
            if (charSequence == null) {
                charSequence = item.e(this.c);
                Q.this.M0.put(f, charSequence);
            }
            iVar.d.setText(charSequence);
            e eVar = iVar.h;
            if (eVar != null) {
                eVar.e();
                iVar.h = null;
            }
            Drawable drawable = (Drawable) Q.this.L0.get(f);
            if (drawable != null) {
                iVar.c.setImageDrawable(drawable);
            } else {
                iVar.c.setImageDrawable(null);
                e eVar2 = new e(this.d, iVar, Q.this.L0, f);
                iVar.h = eVar2;
                eVar2.i(new Void[0]);
            }
            Q q = Q.this;
            if (q.u0 && q.C0 == h.FILE && !this.e && (ax.Z2.h.g(item) || ax.Z2.h.j(this.b, item.a))) {
                iVar.e.setVisibility(0);
            } else {
                iVar.e.setVisibility(8);
            }
            if (!item.g() || item.c() <= 1) {
                iVar.g.setVisibility(8);
                iVar.g.setOnCheckedChangeListener(null);
                return view;
            }
            iVar.g.setVisibility(0);
            iVar.g.setChecked(item.j());
            iVar.g.setOnCheckedChangeListener(new a(item));
            return view;
        }
    }

    public enum h {
        FILE,
        CONTENT,
        HTTP
    }

    class i {
        int a;
        ResolveInfo b;
        ImageView c;
        TextView d;
        View e;
        View f;
        CheckBox g;
        e h;

        class a extends ax.g3.c {
            final /* synthetic */ Q c;

            a(Q q) {
                this.c = q;
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (Q.this.b() == null) {
                    return;
                }
                if (C1832u.Q(Q.this.b())) {
                    Q.this.V3();
                } else {
                    Q.this.W3();
                }
            }
        }

        class b extends ax.g3.c {
            final /* synthetic */ Q c;

            b(Q q) {
                this.c = q;
            }

            @Override // ax.g3.c
            public void a(View view) {
                i iVar = i.this;
                Q.this.S3(iVar.a, d.CHOICE);
            }
        }

        i(View view) {
            this.c = (ImageView) view.findViewById(R.id.icon);
            this.d = (TextView) view.findViewById(android.R.id.text1);
            this.e = view.findViewById(R.id.need_compatibility_mode);
            this.f = view.findViewById(R.id.choice_indicator);
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.use_http_scheme);
            this.g = checkBox;
            checkBox.setButtonDrawable(R.drawable.checkbox_http);
            this.e.setOnClickListener(new a(Q.this));
            this.f.setOnClickListener(new b(Q.this));
        }
    }

    public static Intent A3(Context context, AbstractC3595n abstractC3595n) {
        Uri w;
        String e2 = C1833v.e(abstractC3595n, "application/octet-stream");
        if (C1809B.H(abstractC3595n)) {
            w = E3(abstractC3595n);
        } else {
            if (C1808A.G(abstractC3595n)) {
                return null;
            }
            w = C1832u.w(abstractC3595n.N());
        }
        return z3(context, c.a.GENERAL, w, e2, true, false);
    }

    private static Intent B3(Context context, AbstractC3595n abstractC3595n, boolean z) {
        return z3(context, c.a.GENERAL, z ? HttpServerService.l(0, abstractC3595n) : C1832u.H(abstractC3595n, true), abstractC3595n.s(), true, true);
    }

    private static Intent C3(Context context, c.a aVar, AbstractC3595n abstractC3595n, boolean z) {
        return z3(context, aVar, z ? HttpServerService.l(0, abstractC3595n) : C1832u.L(abstractC3595n, true), abstractC3595n.s(), true, true);
    }

    private static Uri D3(Context context, Uri uri) {
        return C1832u.u(context, new File(uri.getPath()));
    }

    public static Uri E3(AbstractC3595n abstractC3595n) {
        if (abstractC3595n instanceof C3605y) {
            return C1832u.w(((C3605y) abstractC3595n).F0());
        }
        if (abstractC3595n instanceof C3590i) {
            return C1832u.p((C3590i) abstractC3595n);
        }
        C3184b.g("Not allowed fileinfo : " + abstractC3595n.getClass().getName());
        return null;
    }

    private static List<ax.Z2.c> F3(Context context, Uri uri, String str) {
        String k = d0.k(uri.getPath());
        if (C1833v.j(str) && TextUtils.isEmpty(k)) {
            return null;
        }
        return ax.t3.h.g(context, ax.t3.h.d(str, k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent G3(h.a aVar, boolean z, boolean z2, boolean z3) {
        Uri b2;
        Context b3 = b();
        boolean z4 = false;
        Intent intent = new Intent(aVar.d(0));
        ResolveInfo f2 = aVar.f(0);
        if (intent.getData() != null && "http".equals(intent.getData().getScheme()) && aVar.c() > 1) {
            if (ax.Z2.h.l(b3, aVar.a)) {
                intent = new Intent(aVar.d(1));
                f2 = aVar.f(1);
            } else if (!aVar.g() || !aVar.j()) {
                intent = new Intent(aVar.d(1));
                f2 = aVar.f(1);
            }
        }
        if (aVar.h()) {
            return aVar.d(0);
        }
        ComponentName componentName = aVar.a;
        intent.setComponent(componentName);
        h H3 = H3(intent.getData());
        Intent intent2 = null;
        if (this.u0 && H3 == h.FILE && b() != null) {
            if (!C1832u.Q(b())) {
                return null;
            }
            intent2 = C1832u.b(intent);
            z4 = true;
        }
        if (z3 && this.u0) {
            h hVar = this.C0;
            h hVar2 = h.FILE;
            if (hVar == hVar2 && H3 == h.CONTENT && !ax.X2.Q.U1() && !ax.Z2.h.k(b3, aVar.a) && aVar.c() > 1) {
                Intent d2 = aVar.d(1);
                if (H3(d2.getData()) == hVar2 && C1832u.Q(b3)) {
                    d2.setComponent(aVar.a);
                    intent2 = C1832u.b(d2);
                    f2 = aVar.f(1);
                    intent = d2;
                    z4 = true;
                }
            }
        }
        if (this.u0 && !z4 && this.C0 == h.FILE && H3 == h.CONTENT && componentName != null && !"com.voxdon.xplorer".equals(componentName.getPackageName()) && (b2 = ax.c3.N.b(b(), this.z0.getPath())) != null) {
            intent.setDataAndType(b2, intent.getType());
        }
        if (intent2 == null) {
            intent2 = intent;
        }
        if (z) {
            ax.t3.h.j(b3, ax.t3.h.d(this.w0, this.I0), this.y0, this.z0.getScheme(), aVar.a);
            if (z2) {
                ax.t3.h.a(b3, aVar.a, 1);
                return intent2;
            }
            U3(intent, f2, z4);
            ax.t3.h.a(b3, aVar.a, 5);
        }
        return intent2;
    }

    private static h H3(Uri uri) {
        if (C1832u.P(uri)) {
            return h.FILE;
        }
        if (C1832u.Z(uri)) {
            return h.HTTP;
        }
        if (C1832u.O(uri)) {
            return h.CONTENT;
        }
        C3184b.f();
        return null;
    }

    public static boolean I3(Context context, Uri uri) {
        uri.buildUpon().path("/storage/emulated/0/urionly.mkv");
        Intent z3 = z3(context, c.a.IN_IMAGE_VIEWER, uri, "video/x-matroska", true, true);
        if (z3 == null && (z3 = z3(context, c.a.GENERAL, uri, "video/x-matroska", true, true)) == null) {
            return false;
        }
        return C1832u.U(z3);
    }

    public static boolean J3(Context context, AbstractC3595n abstractC3595n, boolean z) {
        Intent B3 = B3(context, abstractC3595n, z);
        return (B3 == null || C1832u.T(B3)) ? false : true;
    }

    public static boolean K3(Context context, c.a aVar, AbstractC3595n abstractC3595n, boolean z) {
        Intent C3 = C3(context, aVar, abstractC3595n, z);
        return (C3 == null || C1832u.U(C3)) ? false : true;
    }

    private void L() {
        N0.fine("onIntentResolveCancelled");
        ax.d3.J.e(this, "resolver_request_key", "fragment_result", 3);
    }

    private boolean L3(String str, Uri uri) {
        return (C1833v.j(str) || C1833v.i(str) || uri == null || uri.getPath() == null || !uri.getPath().contains(ax.Q2.f.O0.I())) ? false : true;
    }

    private static boolean M3(String str) {
        return ax.c3.V.j(str);
    }

    public static boolean N3(Context context, c.a aVar, AbstractC3595n abstractC3595n, boolean z) {
        Intent C3 = C3(context, aVar, abstractC3595n, z);
        if (C3 == null) {
            return false;
        }
        return C1832u.S(C3);
    }

    private static boolean O3(String str) {
        return "file".equals(str) || "content".equals(str) || "http".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(Intent intent) {
        N0.fine("onIntentResolved : " + intent);
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_result", 1);
        bundle.putParcelable("resolver_result_intent", intent);
        ax.d3.J.f(this, "resolver_request_key", bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void Q3(Fragment fragment, int i2, Intent intent) {
        if (fragment != 0 && fragment.b() != null && intent.getComponent() != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (C1809B.E(data.getScheme())) {
                try {
                    try {
                        fragment.b().grantUriPermission(intent.getComponent().getPackageName(), data, ax.X2.Q.s0() ? 67 : 3);
                    } catch (IllegalArgumentException unused) {
                        fragment.b().grantUriPermission(intent.getComponent().getPackageName(), data, 3);
                    }
                } catch (SecurityException | UndeclaredThrowableException unused2) {
                }
            }
        }
        if (fragment instanceof f) {
            ((f) fragment).W(i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R3(final Fragment fragment, c.a aVar, Uri uri, String str, String str2, boolean z, boolean z2) {
        Intent z3;
        C3184b.c(O3(uri.getScheme()));
        Logger logger = N0;
        logger.fine("open mimetype : " + str);
        if (!(fragment instanceof f)) {
            C3184b.f();
            return;
        }
        if (fragment.b() == null) {
            logger.severe("onIntentResolveCancelled : no context");
            ((f) fragment).L();
            return;
        }
        if (!z && C3180B.j(str, str2) && (z3 = z3(fragment.b(), aVar, uri, str, z2, false)) != null) {
            logger.fine("onIntentResolved by default : " + z3);
            Q3(fragment, 0, z3);
            return;
        }
        if (C3180B.F(fragment, false)) {
            C3180B.d0(fragment.A0(), w3(fragment, 0, aVar, uri, str, str2, z, z2), "resolver", true);
            ax.d3.J.c(fragment, "resolver_request_key", new Consumer() { // from class: ax.a3.P
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void s(Object obj) {
                    Q.i3(Fragment.this, (Bundle) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            logger.severe("onIntentResolveCancelled: not active state");
            ((f) fragment).L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3(int i2, d dVar) {
        if (b() == null || Q2() == null) {
            return;
        }
        Context b2 = b();
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        h.a item = this.F0.getItem(i2);
        if (dVar == d.LONG || dVar == d.CHOICE || !((dVar == d.NORMAL && (this.D0 || !this.E0)) || this.G0 == i2 || item.h())) {
            x3(aVar, true);
        } else {
            Intent G3 = G3(item, true, true, ax.t3.h.i(b2));
            if (G3 != null) {
                P3(G3);
                O2();
            } else {
                W3();
            }
        }
        if (dVar != d.NORMAL) {
            this.H0.setItemChecked(i2, true);
        }
        this.G0 = i2;
    }

    private void T3(Context context, String str, c.a aVar, String str2, String str3, String str4, ComponentName componentName, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str4) || L3(str, this.z0)) {
            ax.t3.h.k(context, ax.t3.h.d(str, str4), ax.Z2.c.a(aVar, str2, str3, str4, componentName, z), z2);
            return;
        }
        ax.Ha.c.h().f().b("RESOLVER INVALID EXTENSION").g("mimetype:" + str + ",uri:" + this.z0).h();
    }

    private void U3(Intent intent, ResolveInfo resolveInfo, boolean z) {
        IntentFilter intentFilter;
        Context b2 = b();
        boolean R = C1832u.R(this.I0);
        Q q = this;
        q.T3(b2, this.w0, this.v0, intent.getScheme(), this.y0, this.I0, intent.getComponent(), z, R);
        ArrayList arrayList = new ArrayList();
        if (R || (intentFilter = resolveInfo.filter) == null) {
            return;
        }
        int i2 = 0;
        if (intentFilter.countDataSchemes() == 0) {
            arrayList.add("file");
            arrayList.add("content");
        } else {
            for (int i3 = 0; i3 < resolveInfo.filter.countDataSchemes(); i3++) {
                String dataScheme = resolveInfo.filter.getDataScheme(i3);
                if (O3(dataScheme)) {
                    arrayList.add(dataScheme);
                }
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            int i4 = i2 + 1;
            String str = (String) arrayList.get(i2);
            if (str != null && !str.equals(intent.getScheme())) {
                q.T3(b2, q.w0, q.v0, str, q.y0, q.I0, intent.getComponent(), false, false);
            }
            q = this;
            i2 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3() {
        if (f0() == null) {
            return;
        }
        F2(new Intent(f0(), (Class<?>) DefaultsSettingsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W3() {
        C1358n k3 = C1358n.k3(0, R.string.msg_need_file_uri_plugin, R.string.menu_install, android.R.string.cancel);
        k3.D2(this, 0);
        C3180B.d0(s0(), k3, "fileuri", true);
    }

    private void f() {
        N0.fine("onIntentNotResolved");
        ax.d3.J.e(this, "resolver_request_key", "fragment_result", 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i3(Fragment fragment, Bundle bundle) {
        int i2 = bundle.getInt("fragment_result", -1);
        if (i2 >= 0 && (fragment instanceof f)) {
            f fVar = (f) fragment;
            if (i2 == 1) {
                fVar.W(0, (Intent) bundle.getParcelable("resolver_result_intent"));
            } else if (i2 == 2) {
                fVar.f();
            } else if (i2 == 3) {
                fVar.L();
            }
        }
    }

    private boolean s3() {
        Uri uri = this.z0;
        if (uri == null) {
            C3184b.f();
            return false;
        }
        if (this.v0 == c.a.IN_IMAGE_VIEWER) {
            return false;
        }
        String k = d0.k(uri.getPath());
        if (ax.c3.V.IMAGE.h().equals(this.y0)) {
            return true;
        }
        if (M3(this.y0)) {
            return false;
        }
        return C1808A.w(k);
    }

    private boolean t3() {
        if (ax.c3.V.AUDIO.h().equals(this.y0)) {
            return true;
        }
        if (M3(this.y0)) {
            return false;
        }
        return C1808A.x(d0.k(this.z0.getPath()));
    }

    private static boolean u3(String str, String str2) {
        return (C1833v.j(str) && TextUtils.isEmpty(str2)) ? false : true;
    }

    private static boolean v3(Uri uri) {
        String path = uri.getPath();
        h H3 = H3(uri);
        if (path == null || !path.contains(".localcache")) {
            return H3 == h.FILE || H3 == h.CONTENT;
        }
        return false;
    }

    private static Q w3(Fragment fragment, int i2, c.a aVar, Uri uri, String str, String str2, boolean z, boolean z2) {
        Q q = new Q();
        Bundle bundle = new Bundle();
        bundle.putParcelable("URI", uri);
        bundle.putString("MIME_TYPE", str);
        bundle.putString("OPEN_MIME_TYPE", str2);
        bundle.putBoolean("SHOW_CHOOSER", z);
        bundle.putBoolean("NEW_TASK", z2);
        bundle.putSerializable("CONDITION", aVar);
        q.v2(bundle);
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x3(androidx.appcompat.app.a aVar, boolean z) {
        Button i2 = aVar.i(-1);
        if (i2 != null) {
            if (this.E0) {
                i2.setEnabled(z);
            } else {
                i2.setEnabled(false);
            }
        }
        Button i3 = aVar.i(-2);
        if (i3 != null) {
            i3.setEnabled(z);
        }
    }

    private static ax.Z2.c y3(List<ax.Z2.c> list, c.a aVar, String str) {
        for (ax.Z2.c cVar : list) {
            if (cVar.b.equals(str) && aVar == cVar.a) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r6 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent z3(android.content.Context r7, ax.Z2.c.a r8, android.net.Uri r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            java.util.List r10 = F3(r7, r9, r10)
            r0 = 0
            if (r10 == 0) goto Ld2
            int r1 = r10.size()
            if (r1 != 0) goto Lf
            goto Ld2
        Lf:
            boolean r1 = ax.X2.Q.N()
            boolean r2 = ax.c3.C1832u.P(r9)
            r3 = 0
            if (r2 == 0) goto L58
            if (r1 == 0) goto L58
            boolean r2 = ax.c3.C1832u.Q(r7)
            if (r2 == 0) goto L30
            java.lang.String r2 = "file"
            ax.Z2.c r2 = y3(r10, r8, r2)
            if (r2 == 0) goto L30
            boolean r2 = r2.f
            if (r2 == 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 != 0) goto L55
            java.lang.String r4 = r9.getPath()
            java.lang.String r4 = ax.c3.d0.k(r4)
            boolean r4 = ax.c3.C1832u.R(r4)
            if (r4 == 0) goto L4f
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r9.getPath()
            r4.<init>(r5)
            android.net.Uri r4 = ax.c3.C1832u.C(r7, r4)
            goto L50
        L4f:
            r4 = r0
        L50:
            android.net.Uri r5 = D3(r7, r9)
            goto L5b
        L55:
            r4 = r0
            r5 = r4
            goto L5b
        L58:
            r4 = r0
            r5 = r4
            r2 = 0
        L5b:
            if (r5 != 0) goto L5e
            r5 = r9
        L5e:
            if (r4 == 0) goto L6d
            java.lang.String r6 = r4.getScheme()
            ax.Z2.c r6 = y3(r10, r8, r6)
            if (r6 == 0) goto L6b
            goto L6f
        L6b:
            r4 = r5
            goto L6f
        L6d:
            r6 = r0
            goto L6b
        L6f:
            if (r6 != 0) goto L79
            java.lang.String r5 = r4.getScheme()
            ax.Z2.c r6 = y3(r10, r8, r5)
        L79:
            if (r6 != 0) goto L7c
            return r0
        L7c:
            boolean r8 = v3(r4)
            java.lang.String r10 = r6.c
            android.content.Intent r8 = ax.c3.C1832u.n(r4, r10, r11, r8)
            android.content.ComponentName r10 = r6.e
            r8.setComponent(r10)
            android.content.pm.PackageManager r11 = r7.getPackageManager()
            android.content.pm.ActivityInfo r11 = r8.resolveActivityInfo(r11, r3)
            if (r11 != 0) goto L96
            return r0
        L96:
            if (r12 == 0) goto L99
            goto Ld1
        L99:
            if (r2 == 0) goto La0
            android.content.Intent r7 = ax.c3.C1832u.b(r8)
            return r7
        La0:
            if (r1 == 0) goto Ld1
            ax.a3.Q$h r11 = H3(r9)
            ax.a3.Q$h r12 = H3(r4)
            ax.a3.Q$h r0 = ax.a3.Q.h.FILE
            if (r11 != r0) goto Ld1
            ax.a3.Q$h r11 = ax.a3.Q.h.CONTENT
            if (r12 != r11) goto Ld1
            if (r10 == 0) goto Ld1
            java.lang.String r11 = "com.voxdon.xplorer"
            java.lang.String r10 = r10.getPackageName()
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto Ld1
            java.lang.String r9 = r9.getPath()
            android.net.Uri r7 = ax.c3.N.b(r7, r9)
            if (r7 == 0) goto Ld1
            java.lang.String r9 = r8.getType()
            r8.setDataAndType(r7, r9)
        Ld1:
            return r8
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.Q.z3(android.content.Context, ax.Z2.c$a, android.net.Uri, java.lang.String, boolean, boolean):android.content.Intent");
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        g gVar = this.F0;
        if (gVar != null) {
            gVar.b(ax.t3.h.i(b()));
        }
    }

    @Override // ax.a3.C1358n.c
    public void P(C1358n c1358n) {
        try {
            C1832u.p0(this, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.voxdon.plugin.fileuri")));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(b(), R.string.no_application, 1).show();
        }
    }

    @Override // ax.a3.I
    public void f3() {
        Intent G3;
        Uri C;
        super.f3();
        androidx.fragment.app.f f0 = f0();
        ArrayList arrayList = new ArrayList();
        if (this.C0 != h.FILE) {
            arrayList.add(C1832u.n(this.z0, this.y0, this.B0, this.K0));
        } else if (this.u0) {
            File file = new File(this.z0.getPath());
            if (C1832u.R(d0.k(this.z0.getPath())) && (C = C1832u.C(f0, file)) != null) {
                arrayList.add(C1832u.n(C, this.y0, this.B0, this.K0));
                this.t0.p(true);
            }
            arrayList.add(C1832u.n(C1832u.u(f0, file), this.y0, this.B0, this.K0));
            if (ax.X2.Q.O() || C1832u.Q(b())) {
                arrayList.add(C1832u.n(this.z0, this.y0, this.B0, this.K0));
            }
        } else {
            arrayList.add(C1832u.n(this.z0, this.y0, this.B0, this.K0));
        }
        List<h.a> f2 = this.t0.f(true, false, arrayList, s3(), t3());
        this.J0 = f2;
        if (f2 != null) {
            this.t0.o(f0, this.z0, this.x0, this.y0, f2);
        }
        List<h.a> list = this.J0;
        if (list == null || list.size() == 0) {
            f();
            Z2(false);
            O2();
        } else {
            if (this.J0.size() != 1 || this.A0 || (G3 = G3(this.J0.get(0), false, true, ax.t3.h.i(f0))) == null) {
                return;
            }
            P3(G3);
            Z2(false);
            O2();
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        androidx.fragment.app.f f0 = f0();
        a.C0006a a2 = C3190h.a(f0);
        this.F0 = new g(f0, this.t0, this.J0);
        View inflate = LayoutInflater.from(f0).inflate(R.layout.dialog_resolver, (ViewGroup) null, false);
        this.H0 = (ListView) inflate.findViewById(R.id.list);
        this.F0.b(ax.t3.h.i(f0));
        this.H0.setAdapter((ListAdapter) this.F0);
        this.D0 = false;
        ComponentName e2 = ax.t3.h.e(f0, this.x0, this.y0, this.z0.getScheme());
        if (e2 != null) {
            for (int i2 = 0; i2 < this.J0.size(); i2++) {
                if (e2.equals(this.J0.get(i2).a)) {
                    this.D0 = true;
                    this.H0.setItemChecked(i2, true);
                    this.G0 = i2;
                }
            }
        }
        a2.setNegativeButton(R.string.activity_resolver_use_once, null);
        a2.setPositiveButton(R.string.activity_resolver_use_always, null);
        a2.p(R.string.menu_open_with);
        a2.b(true);
        a2.setView(inflate);
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(true);
        create.setOnShowListener(new a(create, f0));
        this.H0.setOnItemClickListener(new b());
        this.H0.setOnItemLongClickListener(new c());
        return create;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        this.u0 = ax.X2.Q.N();
        this.t0 = new ax.Z2.h(context);
        Bundle j0 = j0();
        this.w0 = j0.getString("MIME_TYPE");
        this.v0 = (c.a) j0.getSerializable("CONDITION");
        this.y0 = j0.getString("OPEN_MIME_TYPE");
        this.z0 = (Uri) j0.getParcelable("URI");
        this.A0 = j0.getBoolean("SHOW_CHOOSER");
        this.B0 = j0.getBoolean("NEW_TASK");
        this.C0 = H3(this.z0);
        String k = d0.k(this.z0.getPath());
        this.I0 = k;
        this.E0 = u3(this.w0, k);
        this.x0 = ax.t3.h.d(this.w0, this.I0);
        this.K0 = v3(this.z0);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        L();
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        ax.d3.J.b(this, "resolver_request_key");
    }

    @Override // ax.a3.C1358n.c
    public void G(C1358n c1358n) {
    }

    @Override // ax.a3.C1358n.c
    public void Z(C1358n c1358n) {
    }
}
