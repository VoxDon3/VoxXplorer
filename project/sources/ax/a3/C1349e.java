package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.b3.C1495j;
import ax.u3.AbstractC3199q;
import ax.u3.C3186d;
import ax.u3.C3190h;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.io.IOException;

/* renamed from: ax.a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1349e extends I {
    private String A0;
    private View B0;
    private b C0;
    private View t0;
    private TextView u0;
    private TextView v0;
    private TextView w0;
    private Context x0;
    private C3596o y0;
    private AbstractC3595n z0;

    /* renamed from: ax.a3.e$a */
    class a implements View.OnLongClickListener {

        /* renamed from: ax.a3.e$a$a, reason: collision with other inner class name */
        class RunnableC0249a implements Runnable {
            final /* synthetic */ View.OnLongClickListener c0;
            final /* synthetic */ TextView q;

            RunnableC0249a(TextView textView, View.OnLongClickListener onLongClickListener) {
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

        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            TextView textView = (TextView) view;
            textView.post(new RunnableC0249a(textView, this));
            return true;
        }
    }

    /* renamed from: ax.a3.e$b */
    public class b extends AbstractC3199q<Void, C3186d.a, C3186d.a> {
        b() {
            super(AbstractC3199q.e.NORMAL);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C1349e.this.y0.n0();
            C1349e.this.B0.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C3186d.a g(Void... voidArr) {
            if (C1349e.this.b() != null && !isCancelled()) {
                try {
                    return C3186d.a(C1349e.this.y0.J(C1349e.this.z0, 0L), this);
                } catch (C1495j | IOException unused) {
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(C3186d.a aVar) {
            C1349e.this.y0.k0(false);
            C1349e.this.B0.setVisibility(8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(C3186d.a aVar) {
            C1349e.this.y0.k0(false);
            C1349e.this.B0.setVisibility(8);
            C1349e.this.o3(aVar);
        }
    }

    private void m3(androidx.appcompat.app.a aVar) {
        if (b() == null) {
            return;
        }
        this.y0.n0();
        ((TextView) this.t0.findViewById(R.id.filename)).setText(this.z0.B());
        a aVar2 = new a();
        this.u0.setOnLongClickListener(aVar2);
        this.v0.setOnLongClickListener(aVar2);
        this.w0.setOnLongClickListener(aVar2);
        b bVar = new b();
        this.C0 = bVar;
        bVar.i(new Void[0]);
        this.y0.k0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(C3186d.a aVar) {
        if (aVar == null) {
            this.u0.setText(R.string.error);
            this.v0.setText(R.string.error);
            this.w0.setText(R.string.error);
            return;
        }
        String str = aVar.a;
        if (str != null) {
            this.u0.setText(str);
        } else {
            this.u0.setText(R.string.error);
        }
        String str2 = aVar.b;
        if (str2 != null) {
            this.v0.setText(str2);
        } else {
            this.v0.setText(R.string.error);
        }
        String str3 = aVar.c;
        if (str3 != null) {
            this.w0.setText(str3);
        } else {
            this.w0.setText(R.string.error);
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        this.x0 = f0().getApplicationContext();
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_checksum, (ViewGroup) null);
        this.t0 = inflate;
        this.B0 = inflate.findViewById(R.id.progressbar);
        this.u0 = (TextView) this.t0.findViewById(R.id.checksum_md5);
        this.v0 = (TextView) this.t0.findViewById(R.id.checksum_sha1);
        this.w0 = (TextView) this.t0.findViewById(R.id.checksum_sha256);
        a.C0006a a2 = C3190h.a(f0());
        a2.setView(this.t0).setTitle(this.A0).setPositiveButton(android.R.string.ok, null).b(true);
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(true);
        m3(create);
        return create;
    }

    public void n3(Context context, C3596o c3596o, AbstractC3595n abstractC3595n) {
        this.y0 = c3596o;
        this.z0 = abstractC3595n;
        this.A0 = context.getString(R.string.file_checksums);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        b bVar = this.C0;
        if (bVar != null) {
            bVar.e();
        }
    }
}
