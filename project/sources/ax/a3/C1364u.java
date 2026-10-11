package ax.a3;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1364u extends I {
    private c t0;

    /* renamed from: ax.a3.u$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1364u.this.t0.a(true);
            C1364u.this.O2();
        }
    }

    /* renamed from: ax.a3.u$b */
    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1364u.this.t0.a(false);
            C1364u.this.O2();
        }
    }

    /* renamed from: ax.a3.u$c */
    public interface c {
        void a(boolean z);
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        Button i;
        super.H1();
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        if (aVar == null || (i = aVar.i(-1)) == null) {
            return;
        }
        i.requestFocus();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        Y2(false);
        a.C0006a a2 = C3190h.a(f0());
        a2.p(R.string.location_dropbox);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_dropbox_option, (ViewGroup) null, false);
        a2.setView(inflate);
        inflate.findViewById(R.id.btn_team).setOnClickListener(new a());
        inflate.findViewById(R.id.btn_user).setOnClickListener(new b());
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public void j3(c cVar) {
        this.t0 = cVar;
    }
}
