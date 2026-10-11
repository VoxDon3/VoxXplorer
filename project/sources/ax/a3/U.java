package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class U extends I {
    private c t0;
    private ax.Q2.f u0;
    private TextView v0;
    private EditText w0;
    private b x0;

    class a implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        /* renamed from: ax.a3.U$a$a, reason: collision with other inner class name */
        class C0245a extends ax.g3.c {
            C0245a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                U.this.n3();
            }
        }

        a(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new C0245a());
        }
    }

    class b extends AbstractC3199q<Void, Void, d> {
        Context h;
        String i;
        Button j;

        b(Context context, String str) {
            super(AbstractC3199q.e.NORMAL);
            this.h = context;
            this.i = str;
            if (U.this.Q2() != null) {
                this.j = ((androidx.appcompat.app.a) U.this.Q2()).i(-1);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            super.r();
            Button button = this.j;
            if (button != null) {
                button.setEnabled(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public d g(Void... voidArr) {
            if (U.this.u0 == ax.Q2.f.T0) {
                return com.voxdon.xplorer.file.D.X0(this.h, this.i, true);
            }
            if (U.this.u0 == ax.Q2.f.U0) {
                return com.voxdon.xplorer.file.H.T0(this.i, true);
            }
            C3184b.f();
            return d.ERROR;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(d dVar) {
            if (U.this.f0() == null) {
                return;
            }
            Button button = this.j;
            if (button != null) {
                button.setEnabled(true);
            }
            if (dVar == d.SUCCESS) {
                if (U.this.t0 != null) {
                    U.this.t0.c(U.this.u0, this.i);
                }
                U.this.O2();
            } else if (dVar == d.NETWORK_ERROR) {
                U.this.v0.setText(R.string.error_network);
            } else if (dVar == d.ERROR_ACCESS_DENIED) {
                U.this.v0.setText(R.string.error_access_denied);
            } else {
                U.this.v0.setText(R.string.error_invalid_address);
            }
        }
    }

    public interface c {
        void c(ax.Q2.f fVar, String str);
    }

    public enum d {
        SUCCESS,
        NETWORK_ERROR,
        ERROR,
        ERROR_ACCESS_DENIED
    }

    public static U l3(ax.Q2.f fVar) {
        U u = new U();
        Bundle bundle = new Bundle();
        bundle.putSerializable("location", fVar);
        u.v2(bundle);
        return u;
    }

    private boolean m3(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        this.u0 = (ax.Q2.f) j0().getSerializable("location");
        if (f0() instanceof c) {
            this.t0 = (c) f0();
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        String str;
        a.C0006a a2 = C3190h.a(f0());
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(f0()).inflate(R.layout.dialog_server_address, (ViewGroup) null);
        EditText editText = (EditText) linearLayout.findViewById(R.id.address);
        this.w0 = editText;
        editText.requestFocus();
        this.v0 = (TextView) linearLayout.findViewById(R.id.error_message);
        ax.Q2.f fVar = this.u0;
        if (fVar == ax.Q2.f.T0) {
            str = fVar.M(b());
        } else if (fVar == ax.Q2.f.U0) {
            str = fVar.M(b());
        } else {
            C3184b.f();
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        androidx.appcompat.app.a create = a2.setView(linearLayout).setTitle(str).setPositiveButton(android.R.string.ok, null).setNegativeButton(android.R.string.cancel, null).create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new a(create));
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    void n3() {
        if (f0() == null) {
            return;
        }
        ((InputMethodManager) f0().getSystemService("input_method")).hideSoftInputFromInputMethod(this.w0.getWindowToken(), 0);
        String trim = this.w0.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            this.v0.setText(R.string.error_invalid_address);
            return;
        }
        if (!m3(trim)) {
            this.v0.setText(R.string.error_invalid_address);
            return;
        }
        if (trim.endsWith("/")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        if (AbstractC3199q.n(this.x0)) {
            return;
        }
        b bVar = new b(b(), trim);
        this.x0 = bVar;
        bVar.h(new Void[0]);
    }
}
