/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.a3.t;
import ax.u3.h;

public class A
extends I {
    private static final String[] A0 = new String[]{"KB", "MB", "GB"};
    private g t0;
    private int u0;
    private int v0;
    private AutoCompleteTextView w0;
    private AutoCompleteTextView x0;
    private EditText y0;
    private EditText z0;

    static /* synthetic */ int l3(A a8, int n8) {
        a8.u0 = n8;
        return n8;
    }

    static /* synthetic */ int m3(A a8, int n8) {
        a8.v0 = n8;
        return n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long n3(int n8, int n9) {
        long l8;
        long l9;
        if (n9 == 0) {
            l9 = n8;
            l8 = 1000L;
            return l9 * l8;
        }
        if (n9 == 1) {
            l9 = n8;
            l8 = 1000000L;
            return l9 * l8;
        }
        if (n9 != 2) return n8;
        l9 = n8;
        l8 = 1000000000L;
        return l9 * l8;
    }

    public static A o3() {
        return new A();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long p3() {
        String string;
        block3: {
            long l8 = -1L;
            try {
                string = this.y0.getText().toString();
                if (!TextUtils.isEmpty((CharSequence)string)) break block3;
                return -1L;
            }
            catch (Exception exception) {
                return l8;
            }
        }
        return this.n3(Integer.parseInt(string), this.u0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long q3() {
        String string;
        block3: {
            long l8 = -1L;
            try {
                string = this.z0.getText().toString();
                if (!TextUtils.isEmpty((CharSequence)string)) break block3;
                return -1L;
            }
            catch (Exception exception) {
                return l8;
            }
        }
        return this.n3(Integer.parseInt(string), this.v0);
    }

    private void s3(Context context, AutoCompleteTextView autoCompleteTextView) {
        String[] stringArray = A0;
        autoCompleteTextView.setAdapter((ListAdapter)new f(context, stringArray));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final A a;
            {
                this.a = a8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                A.l3(this.a, n8);
            }
        });
        this.u0 = 0;
        autoCompleteTextView.setText((CharSequence)stringArray[0]);
    }

    private void t3(Context context, AutoCompleteTextView autoCompleteTextView) {
        String[] stringArray = A0;
        autoCompleteTextView.setAdapter((ListAdapter)new f(context, stringArray));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final A a;
            {
                this.a = a8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                A.m3(this.a, n8);
            }
        });
        this.v0 = 0;
        autoCompleteTextView.setText((CharSequence)stringArray[0]);
    }

    @Override
    public Dialog g3() {
        AutoCompleteTextView autoCompleteTextView;
        Context context = this.b();
        a.a a8 = h.a((Context)this.f0());
        View view = LayoutInflater.from((Context)context).inflate(2131558506, null, false);
        this.w0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131362338);
        this.s3(context, autoCompleteTextView);
        this.x0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131362977);
        this.t3(context, autoCompleteTextView);
        this.y0 = (EditText)view.findViewById(2131362335);
        this.z0 = (EditText)view.findViewById(2131362970);
        a8.p(2131952660);
        a8.setView(view);
        a8.b(true);
        a8.j(new DialogInterface.OnCancelListener(this){
            final A a;
            {
                this.a = a8;
            }

            public void onCancel(DialogInterface dialogInterface) {
                if (this.a.t0 != null) {
                    this.a.t0.a();
                }
            }
        });
        a8.setPositiveButton(17039370, new t(this){
            final A b;
            {
                this.b = a8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                if (this.b.t0 != null) {
                    this.b.t0.b(this.b.p3(), this.b.q3());
                }
            }
        });
        a8.setNegativeButton(0x1040000, new t(this){
            final A b;
            {
                this.b = a8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                if (this.b.t0 != null) {
                    this.b.t0.a();
                }
            }
        });
        return a8.create();
    }

    @Override
    public void onCancel(DialogInterface object) {
        object = this.t0;
        if (object != null) {
            object.a();
        }
    }

    public void r3(g g8) {
        this.t0 = g8;
    }

    static class f
    extends ArrayAdapter<String> {
        private String[] a;

        f(Context context, String[] stringArray) {
            super(context, 2131558576, (Object[])stringArray);
            this.a = stringArray;
        }

        public Filter getFilter() {
            return new Filter(this){
                final f a;
                {
                    this.a = f8;
                }

                protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                    charSequence = new Filter.FilterResults();
                    ((Filter.FilterResults)charSequence).values = this.a.a;
                    ((Filter.FilterResults)charSequence).count = this.a.a.length;
                    return charSequence;
                }

                protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                }
            };
        }
    }

    public static interface g {
        public void a();

        public void b(long var1, long var3);
    }
}

