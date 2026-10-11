package ax.a3;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.text.Selection;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.c3.C1832u;
import ax.c3.EnumC1837z;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3597p;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.C3606z;
import com.voxdon.xplorer.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class z extends I {
    private boolean A0;
    private String B0;
    private boolean C0;
    private ax.U2.a D0;
    private View t0;
    private TextView u0;
    private TextView v0;
    private Context w0;
    private C3596o x0;
    private List<AbstractC3595n> y0;
    private AbstractC3595n z0;

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (z.this.D0 != null) {
                try {
                    C1832u.p0(z.this, C1832u.m(z.this.D0.c));
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(z.this.w0, R.string.no_application, 1).show();
                }
            }
        }
    }

    class c implements View.OnLongClickListener {

        class a implements Runnable {
            final /* synthetic */ View.OnLongClickListener c0;
            final /* synthetic */ TextView q;

            a(TextView textView, View.OnLongClickListener onLongClickListener) {
                this.q = textView;
                this.c0 = onLongClickListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.q.setOnLongClickListener(null);
                Selection.selectAll((Spannable) this.q.getText());
                this.q.performLongClick();
                this.q.setOnLongClickListener(this.c0);
            }
        }

        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            TextView textView = (TextView) view;
            textView.post(new a(textView, this));
            return true;
        }
    }

    class d extends ax.g3.c {
        d() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            z.this.y3();
        }
    }

    public class f extends AbstractC3199q<Void, Void, ax.U2.a> {
        f() {
            super(AbstractC3199q.e.HIGH);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public ax.U2.a g(Void... voidArr) {
            if (z.this.z0 instanceof C3605y) {
                return ax.U2.d.q(z.this.w0, (C3605y) z.this.z0);
            }
            C3184b.f();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(ax.U2.a aVar) {
            Button i;
            if (z.this.b() == null) {
                return;
            }
            z.this.D0 = aVar;
            if (z.this.D0 != null) {
                ((TextView) z.this.t0.findViewById(R.id.extra1_text)).setText(z.this.D0.a + "\n" + z.this.D0.b);
                if (z.this.Q2() == null || (i = ((androidx.appcompat.app.a) z.this.Q2()).i(-3)) == null) {
                    return;
                }
                i.setVisibility(0);
            }
        }
    }

    public class g extends AbstractC3199q<Void, Void, ax.U2.a> {
        private AbstractC1823k h;
        private String i;
        private String j;

        g(AbstractC1823k abstractC1823k) {
            super(AbstractC3199q.e.HIGH);
            this.h = abstractC1823k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public ax.U2.a g(Void... voidArr) {
            EnumC1837z G = this.h.G();
            if (G == EnumC1837z.IMAGE) {
                this.i = this.h.f0();
                return null;
            }
            if (G == EnumC1837z.VIDEO) {
                this.i = this.h.h0();
                this.j = this.h.g0();
                return null;
            }
            if (G != EnumC1837z.AUDIO) {
                return null;
            }
            this.i = this.h.g0();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(ax.U2.a aVar) {
            if (this.i != null) {
                ((TextView) z.this.t0.findViewById(R.id.extra1_text)).setText(this.i);
            }
            if (this.j != null) {
                ((TextView) z.this.t0.findViewById(R.id.extra2_text)).setText(this.j);
            }
        }
    }

    private void q3(androidx.appcompat.app.a aVar) {
        if (this.y0 == null) {
            if (f0() != null) {
                Toast.makeText(f0(), R.string.error_file_load, 1).show();
            }
        } else {
            if (b() == null) {
                return;
            }
            this.x0.n0();
            this.t0.findViewById(R.id.type_container).setVisibility(8);
            this.t0.findViewById(R.id.date_container).setVisibility(8);
            this.t0.findViewById(R.id.permission_container).setVisibility(8);
            this.t0.findViewById(R.id.hidden_container).setVisibility(8);
            this.t0.findViewById(R.id.path_container).setVisibility(8);
            this.t0.findViewById(R.id.contents_container).setVisibility(0);
            new C3587f(C3587f.c.PROPERTIES, this.x0, this.y0, false, new b()).i(new Void[0]);
            this.x0.k0(false);
        }
    }

    private void r3(androidx.appcompat.app.a aVar) {
        if (this.y0 == null) {
            if (f0() != null) {
                Toast.makeText(f0(), R.string.error_file_load, 1).show();
                return;
            }
            return;
        }
        if (b() == null) {
            return;
        }
        this.x0.n0();
        ((TextView) this.t0.findViewById(R.id.file_type)).setText(v3());
        ((TextView) this.t0.findViewById(R.id.file_date)).setText(C1831t.b(b(), this.z0.q()));
        if (this.z0.R() == ax.c3.K.h) {
            ((TextView) this.t0.findViewById(R.id.file_permissions)).setText(u3());
        } else {
            this.t0.findViewById(R.id.permission_container).setVisibility(8);
        }
        if (this.z0.h()) {
            this.t0.findViewById(R.id.hidden_container).setVisibility(0);
            ((TextView) this.t0.findViewById(R.id.file_hidden)).setText(s3());
        } else {
            this.t0.findViewById(R.id.hidden_container).setVisibility(8);
        }
        ((TextView) this.t0.findViewById(R.id.file_path)).setText(t3());
        ((TextView) this.t0.findViewById(R.id.file_path)).setOnLongClickListener(new c());
        int e2 = C3180B.e(this.w0, 32);
        Drawable Y = this.z0.Y(b());
        if (Y instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) Y).getBitmap();
            if (bitmap != null) {
                aVar.m(new BitmapDrawable(b().getResources(), ThumbnailUtils.extractThumbnail(bitmap, e2, e2)));
            }
        } else {
            aVar.m(Y);
        }
        new C2947d(this.w0, this.x0).v(this.z0, aVar, e2);
        if (this.z0.isDirectory()) {
            this.u0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            long p = this.z0.p();
            if (p == 0) {
                this.u0.setText(this.z0.I(true));
            } else {
                this.u0.setText(N0(R.string.file_size, this.z0.I(true), NumberFormat.getInstance().format(p)));
            }
        }
        if (!this.z0.isDirectory() && C1809B.H(this.z0)) {
            AbstractC3595n abstractC3595n = this.z0;
            AbstractC1823k abstractC1823k = (AbstractC1823k) abstractC3595n;
            EnumC1837z G = abstractC3595n.G();
            if (G != null) {
                if (G == EnumC1837z.IMAGE) {
                    this.t0.findViewById(R.id.extra1_container).setVisibility(0);
                    ((TextView) this.t0.findViewById(R.id.extra1_label)).setText(R.string.dialog_entry_resolution);
                    new g(abstractC1823k).i(new Void[0]);
                } else if (G == EnumC1837z.VIDEO) {
                    this.t0.findViewById(R.id.extra1_container).setVisibility(0);
                    ((TextView) this.t0.findViewById(R.id.extra1_label)).setText(R.string.dialog_entry_resolution);
                    this.t0.findViewById(R.id.extra2_container).setVisibility(0);
                    ((TextView) this.t0.findViewById(R.id.extra2_label)).setText(R.string.dialog_entry_duration);
                    new g(abstractC1823k).i(new Void[0]);
                } else if (G == EnumC1837z.AUDIO) {
                    this.t0.findViewById(R.id.extra1_container).setVisibility(0);
                    ((TextView) this.t0.findViewById(R.id.extra1_label)).setText(R.string.dialog_entry_duration);
                    new g(abstractC1823k).i(new Void[0]);
                } else if (G == EnumC1837z.APK) {
                    this.t0.findViewById(R.id.extra1_container).setVisibility(0);
                    ((TextView) this.t0.findViewById(R.id.extra1_label)).setText(R.string.dialog_entry_app_info);
                }
            }
        }
        if (!this.z0.isDirectory()) {
            this.t0.findViewById(R.id.checksum_container).setVisibility(0);
            this.t0.findViewById(R.id.btn_checksum).setOnClickListener(new d());
        }
        if (this.z0.isDirectory()) {
            this.t0.findViewById(R.id.contents_container).setVisibility(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.z0);
            new C3587f(C3587f.c.PROPERTIES, this.x0, arrayList, false, new e()).i(new Void[0]);
        }
        this.x0.k0(false);
    }

    private int s3() {
        return this.z0.h() ? R.string.yes : R.string.no;
    }

    private String t3() {
        return this.z0.E();
    }

    private String u3() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.z0.R() == ax.c3.K.h) {
            C3597p o = ax.Z2.j.F().q() ? C3606z.Y().o(this.z0.E()) : C3606z.X().o(this.z0.E());
            if (o != null && o.a != null && o.b != null && (str = o.c) != null) {
                sb.append(str);
                sb.append("\n");
                sb.append(o.a);
                sb.append(" ");
                sb.append(o.b);
            }
        }
        if (sb.length() == 0) {
            if (this.z0.d()) {
                sb.append(this.w0.getString(R.string.permission_read));
                sb.append(" ");
            }
            if (this.z0.j()) {
                sb.append(this.w0.getString(R.string.permission_write));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private int v3() {
        return this.z0.isDirectory() ? R.string.filetype_folder : R.string.filetype_file;
    }

    private void w3() {
        new f().i(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
        if (this.z0 == null) {
            C3184b.f();
            return;
        }
        C1349e c1349e = new C1349e();
        c1349e.n3(this.w0, this.x0, this.z0);
        C3180B.d0(s0(), c1349e, "checksum", true);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        androidx.appcompat.app.a aVar;
        super.J1();
        if (this.C0 && this.D0 == null && (aVar = (androidx.appcompat.app.a) Q2()) != null) {
            aVar.i(-3).setVisibility(8);
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        this.w0 = f0().getApplicationContext();
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_file_properties, (ViewGroup) null);
        this.t0 = inflate;
        this.u0 = (TextView) inflate.findViewById(R.id.file_size);
        this.v0 = (TextView) this.t0.findViewById(R.id.file_contents);
        a.C0006a b2 = C3190h.b(f0());
        b2.setView(this.t0).setTitle(this.B0).setPositiveButton(android.R.string.ok, null).b(true);
        AbstractC3595n abstractC3595n = this.z0;
        if (abstractC3595n != null && !abstractC3595n.isDirectory() && C1809B.P(this.z0) && this.z0.G() == EnumC1837z.APK) {
            this.C0 = true;
            w3();
            b2.i(R.string.menu_store, new a());
        }
        androidx.appcompat.app.a create = b2.create();
        create.setCanceledOnTouchOutside(true);
        if (!this.A0) {
            q3(create);
            return create;
        }
        create.l(R.drawable.transparent);
        r3(create);
        return create;
    }

    public void x3(Context context, C3596o c3596o, List<AbstractC3595n> list) {
        this.x0 = c3596o;
        this.y0 = list;
        boolean z = list.size() == 1;
        this.A0 = z;
        if (!z) {
            this.B0 = context.getResources().getQuantityString(R.plurals.num_items_plurals, list.size(), Integer.valueOf(list.size()));
            return;
        }
        AbstractC3595n abstractC3595n = this.y0.get(0);
        this.z0 = abstractC3595n;
        this.B0 = abstractC3595n.B();
    }

    class b implements C3587f.b {
        b() {
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void b(int i, int i2, long j) {
            if (z.this.Q2() == null || z.this.b() == null || !z.this.X0()) {
                return;
            }
            z.this.v0.setText(z.this.N0(R.string.file_count, Integer.valueOf(i), Integer.valueOf(i2)));
            TextView textView = z.this.u0;
            z zVar = z.this;
            textView.setText(zVar.N0(R.string.file_size, C1809B.i(zVar.b(), j), NumberFormat.getInstance().format(j)));
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void a(int i, int i2, long j, Map<String, C3587f.a> map) {
        }
    }

    class e implements C3587f.b {
        e() {
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void b(int i, int i2, long j) {
            if (z.this.Q2() == null || z.this.b() == null || !z.this.X0()) {
                return;
            }
            z.this.v0.setText(z.this.N0(R.string.file_count, Integer.valueOf(i), Integer.valueOf(i2)));
            TextView textView = z.this.u0;
            z zVar = z.this;
            textView.setText(zVar.N0(R.string.file_size, C1809B.i(zVar.b(), j), NumberFormat.getInstance().format(j)));
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void a(int i, int i2, long j, Map<String, C3587f.a> map) {
        }
    }
}
