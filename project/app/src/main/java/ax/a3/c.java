/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.Q2.f;
import ax.a3.I;
import ax.a3.l;
import ax.c3.d0;
import ax.u3.b;
import com.alphainventor.filemanager.file.n;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class c
extends I {
    private View A0;
    private View B0;
    private View C0;
    private View D0;
    private View E0;
    private EditText F0;
    private EditText G0;
    private EditText H0;
    private EditText I0;
    private h J0;
    private boolean K0 = false;
    private f L0;
    private boolean M0;
    private ArrayList<String> N0;
    private List<String> O0;
    private boolean P0;
    private String Q0;
    private boolean R0;
    private TextInputLayout t0;
    private TextInputLayout u0;
    private EditText v0;
    private EditText w0;
    private View x0;
    private ListView y0;
    private View z0;

    private void A3() {
        int n8;
        this.H3(true);
        this.D3(0, 1);
        Editable editable = this.v0.getText();
        if (!this.x3() && (n8 = this.v0.getSelectionStart()) >= 0) {
            editable.insert(n8, (CharSequence)"(###)");
        }
    }

    private static boolean B3(List<n> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (((n)object.next()).isDirectory()) continue;
            return false;
        }
        return true;
    }

    private void C3() {
        block11: {
            block10: {
                if (this.K0) break block10;
                String string = this.v0.getText().toString().trim();
                Object object = this.w0.getText().toString().trim();
                if ((!this.P0 || ((String)object).equals(this.Q0)) && TextUtils.isEmpty((CharSequence)string)) {
                    this.G3();
                    return;
                }
                if (d0.c(string) || d0.c((String)object)) break block11;
                object = this.O0;
                if (object == null) {
                    b.f();
                    return;
                }
                object = object.iterator();
                while (object.hasNext()) {
                    if (!TextUtils.isEmpty((CharSequence)((String)object.next()))) continue;
                    this.G3();
                    return;
                }
                object = this.J0;
                if (object != null) {
                    if ((object = object.a(this.O0)) == l.q) {
                        this.K0 = true;
                        this.N2();
                        return;
                    }
                    if (object == l.c0) {
                        this.t0.setError(this.M0(2131952343));
                        return;
                    }
                    if (object == l.d0) {
                        this.t0.setError(this.M0(2131951927));
                        return;
                    }
                    b.f();
                }
            }
            return;
        }
        this.t0.setError(this.M0(2131951793));
    }

    private void D3(int n8, int n9) {
        this.F0.setText((CharSequence)String.valueOf(n8));
        this.G0.setText((CharSequence)String.valueOf(n9));
    }

    private void F3() {
        this.R0 = true;
        this.C0.setVisibility(0);
    }

    private void G3() {
        if (this.M0) {
            this.t0.setError(this.M0(2131952070));
            return;
        }
        this.t0.setError(this.M0(2131952052));
    }

    private void H3(boolean bl) {
        if (bl) {
            this.D0.setVisibility(0);
            return;
        }
        this.D0.setVisibility(8);
    }

    private void I3(boolean bl) {
        if (bl) {
            this.E0.setVisibility(0);
            return;
        }
        this.E0.setVisibility(8);
    }

    private void J3() {
        Context context = this.y0.getContext();
        Object object = this.v0.getText().toString().trim();
        String string = this.w0.getText().toString().trim();
        object = this.P0 && !string.equals(this.Q0) ? this.s3((List<String>)this.N0, (String)object, string) : (TextUtils.isEmpty((CharSequence)object) ? this.N0 : this.s3(this.N0, (String)object, null));
        this.O0 = object;
        object = new ArrayAdapter(context, 2131558567, this.O0);
        this.y0.setAdapter((ListAdapter)object);
    }

    private String r3(String string) {
        String string2 = this.H0.getText().toString();
        String string3 = this.I0.getText().toString();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return string;
        }
        return string.replace(string2, string3);
    }

    public static c t3(f f8, List<n> list) {
        c c8 = new c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", (Serializable)((Object)f8));
        bundle.putBoolean("IS_DIRECTORY", c.B3(list));
        bundle.putStringArrayList("FILENAME_LIST", c.u3(list));
        c8.v2(bundle);
        return c8;
    }

    private static ArrayList<String> u3(List<n> list) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            arrayList.add(list.get(i8).B());
        }
        return arrayList;
    }

    private int v3() {
        String string = this.F0.getText().toString();
        try {
            int n8 = Integer.parseInt(string);
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private int w3() {
        String string = this.G0.getText().toString();
        try {
            int n8 = Integer.parseInt(string);
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return 1;
        }
    }

    private boolean x3() {
        return this.v0.getText().toString().contains("###");
    }

    private void y3() {
        int n8;
        this.I3(true);
        Editable editable = this.v0.getText();
        if (!editable.toString().contains("%%%") && (n8 = this.v0.getSelectionStart()) >= 0) {
            editable.insert(n8, (CharSequence)"%%%");
        }
    }

    private void z3() {
        int n8;
        this.H3(true);
        this.D3(4, 1);
        Editable editable = this.v0.getText();
        if (!this.x3() && (n8 = this.v0.getSelectionStart()) >= 0) {
            editable.insert(n8, (CharSequence)"###");
        }
    }

    public void E3(h h8) {
        this.J0 = h8;
    }

    @Override
    public void f3() {
        super.f3();
        this.L0 = (f)((Object)this.j0().getSerializable("LOCATION"));
        this.M0 = this.j0().getBoolean("IS_DIRECTORY");
        this.N0 = this.j0().getStringArrayList("FILENAME_LIST");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Dialog g3() {
        Object object;
        a.a a8 = ax.u3.h.a((Context)this.f0()).p(2131952244);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558490, null, false);
        this.t0 = (TextInputLayout)view.findViewById(2131362306);
        this.u0 = (TextInputLayout)view.findViewById(2131362255);
        this.v0 = (EditText)view.findViewById(2131362274);
        this.w0 = (EditText)view.findViewById(2131362269);
        this.x0 = view.findViewById(2131362146);
        this.y0 = (ListView)view.findViewById(2131362452);
        this.C0 = view.findViewById(2131362328);
        this.z0 = view.findViewById(2131362406);
        this.A0 = view.findViewById(2131362408);
        this.B0 = view.findViewById(2131362407);
        this.D0 = view.findViewById(2131362329);
        this.E0 = view.findViewById(2131362330);
        this.F0 = (EditText)view.findViewById(2131362171);
        this.G0 = (EditText)view.findViewById(2131362174);
        this.H0 = (EditText)view.findViewById(2131362169);
        this.I0 = (EditText)view.findViewById(2131362173);
        this.J3();
        this.z0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final c c;
            {
                this.c = c8;
            }

            @Override
            public void a(View view) {
                this.c.y3();
            }
        });
        this.A0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final c c;
            {
                this.c = c8;
            }

            @Override
            public void a(View view) {
                this.c.A3();
            }
        });
        this.B0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final c c;
            {
                this.c = c8;
            }

            @Override
            public void a(View view) {
                this.c.z3();
            }
        });
        if (d0.a(this.N0)) {
            this.u0.setVisibility(0);
            this.x0.setVisibility(0);
            this.Q0 = object = d0.f(this.N0.get(0));
            this.w0.setText((CharSequence)object);
            this.P0 = true;
        }
        this.v0.addTextChangedListener(new TextWatcher(this){
            final c a;
            {
                this.a = c8;
            }

            public void afterTextChanged(Editable editable) {
                if (!this.a.P0 && TextUtils.isEmpty((CharSequence)editable.toString())) {
                    this.a.G3();
                } else if (d0.c(editable.toString())) {
                    this.a.t0.setError(this.a.M0(2131951793));
                } else {
                    this.a.t0.setError(null);
                    this.a.t0.setErrorEnabled(false);
                }
                this.a.J3();
            }

            public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }

            public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }
        });
        object = new TextWatcher(this){
            final c a;
            {
                this.a = c8;
            }

            public void afterTextChanged(Editable editable) {
                this.a.J3();
            }

            public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }

            public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }
        };
        this.F0.addTextChangedListener((TextWatcher)object);
        this.G0.addTextChangedListener((TextWatcher)object);
        this.w0.addTextChangedListener((TextWatcher)object);
        this.H0.addTextChangedListener((TextWatcher)object);
        this.I0.addTextChangedListener((TextWatcher)object);
        this.v0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            final c a;
            {
                this.a = c8;
            }

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66 || n8 == 6) {
                    if (keyEvent != null && keyEvent.getAction() == 1) {
                        return true;
                    }
                    this.a.C3();
                    return true;
                }
                return false;
            }
        });
        try {
            this.v0.requestFocus();
        }
        catch (Exception exception) {}
        a8.b(true);
        a8.setView(view);
        a8.setNegativeButton(0x1040000, null);
        a8.setPositiveButton(17039370, null);
        a8.i(2131952273, null);
        a a9 = a8.create();
        a9.getWindow().setSoftInputMode(36);
        a9.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final c b;
            {
                this.b = c8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final g c;
                    {
                        this.c = g8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.b.C3();
                    }
                });
                dialogInterface = this.a.i(-3);
                dialogInterface.setOnClickListener((View.OnClickListener)new ax.g3.c(this, (Button)dialogInterface){
                    final Button c;
                    final g d;
                    {
                        this.d = g8;
                        this.c = button;
                    }

                    @Override
                    public void a(View view) {
                        this.d.b.F3();
                        this.c.setVisibility(8);
                    }
                });
            }
        });
        a9.setCanceledOnTouchOutside(true);
        return a9;
    }

    List<String> s3(List<String> list, String string, String string2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            CharSequence charSequence;
            CharSequence charSequence2 = list.get(i8);
            String string3 = string2 != null ? string2 : d0.f((String)charSequence2);
            if (TextUtils.isEmpty((CharSequence)string)) {
                charSequence2 = d0.g((String)charSequence2);
            } else if (this.R0 && (string.contains("%%%") || this.x3())) {
                charSequence = new StringBuilder(string);
                int n8 = ((StringBuilder)charSequence).indexOf("%%%");
                if (n8 >= 0) {
                    ((StringBuilder)charSequence).replace(n8, n8 + 3, this.r3(d0.g((String)charSequence2)));
                }
                int n9 = this.v3();
                int n10 = this.w3();
                n8 = ((StringBuilder)charSequence).indexOf("###");
                if (n8 >= 0) {
                    if (n9 == 0) {
                        charSequence2 = String.valueOf(n10 + i8);
                    } else {
                        Locale locale = Locale.US;
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("%0");
                        ((StringBuilder)charSequence2).append(n9);
                        ((StringBuilder)charSequence2).append("d");
                        charSequence2 = String.format(locale, ((StringBuilder)charSequence2).toString(), n10 + i8);
                    }
                    ((StringBuilder)charSequence).replace(n8, n8 + 3, (String)charSequence2);
                }
                charSequence2 = ((StringBuilder)charSequence).toString();
            } else {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(string);
                ((StringBuilder)charSequence2).append(" (");
                ((StringBuilder)charSequence2).append(i8 + 1);
                ((StringBuilder)charSequence2).append(")");
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            charSequence = charSequence2;
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(".");
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            arrayList.add((String)charSequence);
        }
        return arrayList;
    }

    public static interface h {
        public l a(List<String> var1);
    }
}

