package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class L extends AbstractC1354j {
    private TextInputLayout t0;
    private EditText u0;
    String v0;
    private int w0;
    private c x0;
    private String y0;

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            L.this.onCancel(dialogInterface);
        }
    }

    class b implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                String trim = L.this.u0.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    L.this.t0.setError(L.this.M0(R.string.error_password_empty));
                    return;
                }
                if (L.this.x0 != null) {
                    L.this.x0.X(trim);
                } else if (L.this.P0() instanceof c) {
                    ((c) L.this.P0()).X(trim);
                }
                L.this.O2();
            }
        }

        b(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
        }
    }

    public interface c {
        void X(String str);

        void a();
    }

    public static L n3(String str, String str2, c cVar) {
        L l = new L();
        l.p3(cVar);
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putInt("type", 1);
        if (str2 != null) {
            bundle.putString("error", str2);
        }
        l.v2(bundle);
        return l;
    }

    public static L o3(Fragment fragment, String str) {
        L l = new L();
        l.D2(fragment, 0);
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putInt("type", 2);
        l.v2(bundle);
        return l;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        if (j0() != null) {
            this.v0 = j0().getString("title");
            this.w0 = j0().getInt("type");
            this.y0 = j0().getString("error");
        }
    }

    @Override // ax.a3.I
    public Dialog g3() {
        a.C0006a title = C3190h.a(f0()).setTitle(this.v0);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_password_input, (ViewGroup) null, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.password_layout);
        this.t0 = textInputLayout;
        textInputLayout.setHint(M0(R.string.dialog_entry_password));
        if (!TextUtils.isEmpty(this.y0)) {
            this.t0.setError(this.y0);
        }
        EditText editText = (EditText) inflate.findViewById(R.id.password_edit);
        this.u0 = editText;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
        System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
        if (this.w0 == 2) {
            inputFilterArr[filters.length] = new InputFilter.LengthFilter(6);
        } else {
            inputFilterArr[filters.length] = new InputFilter.LengthFilter(64);
        }
        this.u0.setFilters(inputFilterArr);
        int i = this.w0;
        if (i == 2) {
            this.u0.setInputType(18);
        } else if (i == 1) {
            this.u0.setInputType(129);
        } else {
            C3184b.g("invlaid type :" + this.w0);
            this.u0.setInputType(129);
        }
        this.u0.requestFocus();
        title.b(true);
        title.setView(inflate);
        title.setNegativeButton(android.R.string.cancel, new a());
        title.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = title.create();
        create.getWindow().setSoftInputMode(36);
        create.setOnShowListener(new b(create));
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence i3(Context context) {
        return context.getString(R.string.msg_enter_password);
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence j3(Context context) {
        return context.getString(R.string.msg_enter_password);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        c cVar = this.x0;
        if (cVar != null) {
            cVar.a();
        } else if (P0() instanceof c) {
            ((c) P0()).a();
        }
    }

    public void p3(c cVar) {
        this.x0 = cVar;
    }
}
