package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.c3.EnumC1837z;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1345a extends I {
    private Context A0;
    private C3596o B0;
    private AbstractC1823k C0;
    private String D0;
    private boolean E0;
    private ax.U2.a F0;
    private c G0;
    private View t0;
    private View u0;
    private TextView v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private View z0;

    /* renamed from: ax.a3.a$a, reason: collision with other inner class name */
    class C0246a extends ax.g3.c {
        C0246a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1345a.this.G0 != null) {
                C1345a.this.G0.a(C1345a.this.C0);
            }
            C1345a.this.O2();
        }
    }

    /* renamed from: ax.a3.a$b */
    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1345a.this.O2();
        }
    }

    /* renamed from: ax.a3.a$c */
    public interface c {
        void a(AbstractC1823k abstractC1823k);
    }

    /* renamed from: ax.a3.a$d */
    public class d extends AbstractC3199q<Void, Void, ax.U2.a> {
        private ax.U2.f h;

        d() {
            super(AbstractC3199q.e.HIGH);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            C1345a.this.u0.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public ax.U2.a g(Void... voidArr) {
            if (!(C1345a.this.C0 instanceof C3605y)) {
                C3184b.f();
                return null;
            }
            ax.U2.a q = ax.U2.d.q(C1345a.this.A0, (C3605y) C1345a.this.C0);
            if (q != null) {
                this.h = ax.U2.d.F(C1345a.this.A0).x(q.c);
            }
            return q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(ax.U2.a aVar) {
            if (C1345a.this.b() == null) {
                return;
            }
            C1345a.this.u0.setVisibility(8);
            C1345a.this.F0 = aVar;
            if (C1345a.this.F0 != null) {
                ((TextView) C1345a.this.t0.findViewById(R.id.extra1_text)).setText(C1345a.this.F0.c + "\n" + C1345a.this.F0.b + " (" + C1345a.this.F0.d + ")");
                ((TextView) C1345a.this.t0.findViewById(R.id.app_name)).setText(C1345a.this.F0.a);
                if (this.h != null) {
                    ((TextView) C1345a.this.t0.findViewById(R.id.installed_info)).setText(this.h.x() + " (" + this.h.y() + ")");
                    if (this.h.y() >= C1345a.this.F0.d) {
                        C1345a.this.x0.setVisibility(0);
                        if (this.h.y() > C1345a.this.F0.d) {
                            C1345a.this.x0.setText(R.string.msg_newer_version_installed);
                            C1345a.this.y0.setEnabled(false);
                            C1345a.this.z0.requestFocus();
                        } else {
                            C1345a.this.x0.setText(R.string.msg_already_installed_version);
                            C1345a.this.y0.setEnabled(true);
                            C1345a.this.y0.requestFocus();
                        }
                    } else {
                        C1345a.this.x0.setVisibility(8);
                        C1345a.this.y0.setEnabled(true);
                        C1345a.this.y0.requestFocus();
                    }
                    C1345a.this.y0.setText(R.string.menu_update);
                } else {
                    C1345a.this.t0.findViewById(R.id.installed_container).setVisibility(8);
                    C1345a.this.x0.setVisibility(8);
                    C1345a.this.y0.setEnabled(true);
                    C1345a.this.y0.requestFocus();
                }
            } else {
                C1345a.this.y0.setEnabled(true);
                C1345a.this.y0.requestFocus();
            }
            C1345a.this.z0.setEnabled(true);
        }
    }

    private void s3(androidx.appcompat.app.a aVar) {
        EnumC1837z G;
        if (this.C0 == null) {
            if (f0() != null) {
                Toast.makeText(f0(), R.string.error_file_load, 1).show();
                return;
            }
            return;
        }
        if (b() == null) {
            return;
        }
        this.B0.n0();
        ((TextView) this.t0.findViewById(R.id.file_date)).setText(C1831t.b(b(), this.C0.q()));
        this.y0.setOnClickListener(new C0246a());
        this.z0.setOnClickListener(new b());
        this.y0.requestFocus();
        this.y0.setEnabled(false);
        this.z0.setEnabled(false);
        int e = C3180B.e(this.A0, 32);
        Drawable Y = this.C0.Y(b());
        if (Y instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) Y).getBitmap();
            if (bitmap != null) {
                aVar.m(new BitmapDrawable(b().getResources(), ThumbnailUtils.extractThumbnail(bitmap, e, e)));
            }
        } else {
            aVar.m(this.C0.Y(b()));
        }
        new C2947d(this.A0, this.B0).v(this.C0, aVar, e);
        if (this.C0.isDirectory()) {
            this.v0.setText(this.C0.I(true));
        } else {
            this.C0.p();
            this.v0.setText(this.C0.I(true));
        }
        if (!this.C0.isDirectory() && C1809B.H(this.C0) && (G = this.C0.G()) != null && G == EnumC1837z.APK) {
            this.t0.findViewById(R.id.extra1_container).setVisibility(0);
            ((TextView) this.t0.findViewById(R.id.extra1_label)).setText(R.string.dialog_entry_app_info);
        }
        this.B0.k0(false);
    }

    private void t3() {
        new d().i(new Void[0]);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        androidx.appcompat.app.a aVar;
        super.J1();
        if (this.E0 && this.F0 == null && (aVar = (androidx.appcompat.app.a) Q2()) != null) {
            aVar.i(-3).setVisibility(8);
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        this.A0 = f0().getApplicationContext();
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_apk_properties, (ViewGroup) null);
        this.t0 = inflate;
        this.u0 = inflate.findViewById(R.id.indeterminate_progress);
        this.v0 = (TextView) this.t0.findViewById(R.id.file_size);
        this.w0 = (TextView) this.t0.findViewById(R.id.file_contents);
        this.y0 = (TextView) this.t0.findViewById(R.id.btn_install);
        this.z0 = this.t0.findViewById(R.id.btn_cancel);
        this.x0 = (TextView) this.t0.findViewById(R.id.msg_newer_version_installed);
        a.C0006a b2 = C3190h.b(f0());
        b2.setView(this.t0).setTitle(this.D0).b(true);
        androidx.appcompat.app.a create = b2.create();
        create.setCanceledOnTouchOutside(true);
        create.l(R.drawable.transparent);
        s3(create);
        AbstractC1823k abstractC1823k = this.C0;
        if (abstractC1823k != null && !abstractC1823k.isDirectory() && C1809B.P(this.C0) && this.C0.G() == EnumC1837z.APK) {
            this.E0 = true;
            t3();
        }
        return create;
    }

    public void u3(c cVar) {
        this.G0 = cVar;
    }

    public void v3(Context context, C3596o c3596o, AbstractC1823k abstractC1823k) {
        this.B0 = c3596o;
        this.C0 = abstractC1823k;
        this.D0 = abstractC1823k.B();
    }
}
