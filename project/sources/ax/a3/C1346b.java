package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.c3.C1809B;
import ax.u3.C3180B;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1346b extends I {
    private View t0;
    private TextView u0;
    private Context v0;
    private ax.U2.f w0;
    private String x0;
    private e y0;

    /* renamed from: ax.a3.b$b, reason: collision with other inner class name */
    class C0247b extends ax.g3.c {
        C0247b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1346b.this.y0 != null) {
                C1346b.this.y0.c();
            }
            C1346b.this.O2();
        }
    }

    /* renamed from: ax.a3.b$c */
    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1346b.this.y0 != null) {
                C1346b.this.y0.b();
            }
            C1346b.this.O2();
        }
    }

    /* renamed from: ax.a3.b$d */
    class d extends ax.g3.c {
        d() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1346b.this.y0 != null) {
                C1346b.this.y0.a();
            }
            C1346b.this.O2();
        }
    }

    /* renamed from: ax.a3.b$e */
    public interface e {
        void a();

        void b();

        void c();
    }

    private void j3(androidx.appcompat.app.a aVar) {
        if (this.w0 == null) {
            if (f0() != null) {
                Toast.makeText(f0(), R.string.error_file_load, 1).show();
                return;
            }
            return;
        }
        if (b() == null) {
            return;
        }
        View findViewById = this.t0.findViewById(R.id.btn_open);
        findViewById.setOnClickListener(new C0247b());
        findViewById.requestFocus();
        this.t0.findViewById(R.id.btn_info).setOnClickListener(new c());
        View findViewById2 = this.t0.findViewById(R.id.btn_store);
        findViewById2.setOnClickListener(new d());
        try {
            if (f0().getPackageManager().getLaunchIntentForPackage(this.w0.r()) != null) {
                findViewById.setEnabled(true);
                findViewById.setAlpha(1.0f);
            } else {
                findViewById.setEnabled(false);
                findViewById.setAlpha(0.3f);
            }
        } catch (Exception unused) {
            findViewById.setEnabled(false);
            findViewById.setAlpha(0.3f);
        }
        if (!this.w0.B()) {
            findViewById2.setEnabled(false);
            findViewById2.setAlpha(0.3f);
        } else if (TextUtils.isEmpty(this.w0.m())) {
            findViewById2.setEnabled(false);
            findViewById2.setAlpha(0.3f);
        } else {
            findViewById2.setEnabled(true);
            findViewById2.setAlpha(1.0f);
        }
        int e2 = C3180B.e(this.v0, 32);
        Drawable l = this.w0.l();
        if (l instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) l).getBitmap();
            if (bitmap != null) {
                aVar.m(new BitmapDrawable(b().getResources(), ThumbnailUtils.extractThumbnail(bitmap, e2, e2)));
            }
        } else {
            aVar.m(l);
        }
        long s = this.w0.s();
        this.u0.setText(s < 0 ? "-" : C1809B.i(b(), s));
        ((TextView) this.t0.findViewById(R.id.file_date)).setText(this.w0.k(b()));
        ((TextView) this.t0.findViewById(R.id.install_date)).setText(this.w0.j(b()));
        ((TextView) this.t0.findViewById(R.id.version)).setText(this.w0.x());
        ((TextView) this.t0.findViewById(R.id.appid)).setText(this.w0.r());
    }

    public static C1346b k3(ax.U2.f fVar, e eVar) {
        C1346b c1346b = new C1346b();
        c1346b.m3(eVar);
        c1346b.l3(fVar);
        return c1346b;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        this.v0 = f0().getApplicationContext();
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_app_properties, (ViewGroup) null);
        this.t0 = inflate;
        this.u0 = (TextView) inflate.findViewById(R.id.file_size);
        a.C0006a b = C3190h.b(f0());
        b.setView(this.t0).setTitle(this.x0).setPositiveButton(android.R.string.ok, new a()).b(true);
        androidx.appcompat.app.a create = b.create();
        create.setCanceledOnTouchOutside(true);
        create.l(R.drawable.transparent);
        j3(create);
        return create;
    }

    public void l3(ax.U2.f fVar) {
        this.w0 = fVar;
        this.x0 = fVar.q();
    }

    public void m3(e eVar) {
        this.y0 = eVar;
    }

    /* renamed from: ax.a3.b$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
        }
    }
}
