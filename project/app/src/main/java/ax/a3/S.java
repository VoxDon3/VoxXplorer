/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.Z2.p;
import ax.a3.A;
import ax.a3.I;
import ax.a3.t;
import ax.c3.y;
import ax.g3.c;
import ax.u3.B;
import ax.u3.a;
import ax.u3.b;
import ax.u3.h;
import com.google.android.material.datepicker.k;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.TimeZone;

public class S
extends I {
    private static final TimeZone J0 = java.util.DesugarTimeZone.getTimeZone((String)"UTC");
    private String[] A0;
    private int B0 = -1;
    private int C0 = -1;
    private int D0 = -1;
    private long E0 = -1L;
    private long F0 = -1L;
    private long G0 = -1L;
    private long H0 = -1L;
    private ArrayList<String> I0;
    private k t0;
    private p u0;
    AutoCompleteTextView v0;
    AutoCompleteTextView w0;
    AutoCompleteTextView x0;
    private String[] y0;
    private String[] z0;

    public static S B3() {
        return new S();
    }

    private String C3(long l8, long l9) {
        return y.d(l8, l9, true);
    }

    private int E3() {
        int n8;
        Calendar calendar = Calendar.getInstance();
        int n9 = n8 = calendar.getFirstDayOfWeek() - calendar.get(7);
        if (n8 > 0) {
            n9 = n8 - 7;
        }
        return n9;
    }

    private void H3(int n8, long l8, long l9, boolean bl) {
        if (n8 == -1) {
            this.B0 = n8;
            this.v0.setText((CharSequence)"");
            return;
        }
        if (n8 == 5) {
            this.B0 = n8;
            this.K3(l8, l9, bl);
            return;
        }
        this.B0 = n8;
        this.v0.setText((CharSequence)this.y0[n8]);
    }

    private void I3(int n8, long l8, long l9) {
        if (n8 == -1) {
            this.C0 = n8;
            this.w0.setText((CharSequence)"");
            return;
        }
        if (n8 == 7) {
            this.C0 = n8;
            if (l8 > l9) {
                this.L3(l9, l8);
                return;
            }
            this.L3(l8, l9);
            return;
        }
        this.C0 = n8;
        this.w0.setText((CharSequence)this.z0[n8]);
    }

    private void J3(int n8, String string) {
        this.D0 = n8;
        this.x0.setText((CharSequence)this.G3(string));
    }

    private void K3(long l8, long l9, boolean bl) {
        if (bl) {
            this.E0 = this.A3(l8);
            this.F0 = this.z3(l9);
        } else {
            this.E0 = this.y3(l8);
            this.F0 = this.x3(l9);
        }
        String string = DateUtils.formatDateRange((Context)this.b(), (long)this.E0, (long)this.F0, (int)524304);
        this.v0.setText((CharSequence)string);
    }

    private void L3(long l8, long l9) {
        this.G0 = l8;
        this.H0 = l9;
        String string = this.C3(l8, l9);
        this.w0.setText((CharSequence)string);
    }

    private void O3(Context object, AutoCompleteTextView autoCompleteTextView) {
        this.y0 = object.getResources().getStringArray(2130903045);
        autoCompleteTextView.setAdapter((ListAdapter)new j((Context)object, this.y0));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final S a;
            {
                this.a = s8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                if (n8 == 5) {
                    this.a.R3();
                    return;
                }
                S.s3(this.a, n8);
            }
        });
        object = this.u0;
        int n8 = object.g0;
        if (n8 >= 0) {
            if (n8 == 0) {
                object.g0 = -1;
            }
            this.H3(object.g0, object.q, object.c0, false);
        }
    }

    private void P3(Context object, AutoCompleteTextView autoCompleteTextView) {
        this.z0 = object.getResources().getStringArray(2130903069);
        autoCompleteTextView.setAdapter((ListAdapter)new j((Context)object, this.z0));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final S a;
            {
                this.a = s8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                if (n8 == 7) {
                    this.a.S3();
                    return;
                }
                S.p3(this.a, n8);
            }
        });
        object = this.u0;
        int n8 = object.h0;
        if (n8 >= 0) {
            if (n8 == 0) {
                object.h0 = -1;
            }
            this.I3(object.h0, object.d0, object.e0);
        }
    }

    private void Q3(Context object, AutoCompleteTextView autoCompleteTextView) {
        ArrayList<String> arrayList = new ArrayList<String>(this.I0);
        arrayList.add(0, object.getResources().getString(2131952472));
        this.A0 = arrayList.toArray(new String[0]);
        autoCompleteTextView.setAdapter((ListAdapter)new j((Context)object, this.A0));
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final S a;
            {
                this.a = s8;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                S.t3(this.a, n8);
            }
        });
        object = this.u0;
        int n8 = object.i0;
        if (n8 >= 0) {
            if (n8 == 0) {
                object.i0 = -1;
            }
            this.J3(object.i0, object.f0);
        }
    }

    private void R3() {
        com.google.android.material.datepicker.k<ax.b0.c<Long, Long>> k8 = k.c.c().a();
        k8.i3(new ax.A6.j<ax.b0.c<Long, Long>>(this){
            final S a;
            {
                this.a = s8;
            }

            public void b(ax.b0.c<Long, Long> c8) {
                this.a.H3(5, (Long)c8.a, (Long)c8.b, true);
            }
        });
        k8.g3(new DialogInterface.OnCancelListener(this){
            final S a;
            {
                this.a = s8;
            }

            public void onCancel(DialogInterface object) {
                object = this.a;
                ((S)object).H3(((S)object).B0, this.a.E0, this.a.F0, false);
            }
        });
        k8.h3(new c(this){
            final S c;
            {
                this.c = s8;
            }

            @Override
            public void a(View object) {
                object = this.c;
                ((S)object).H3(((S)object).B0, this.c.E0, this.c.F0, false);
            }
        });
        B.d0(this.A0(), k8, "custom_picker", true);
    }

    private void S3() {
        A a8 = A.o3();
        a8.r3(new A.g(this){
            final S a;
            {
                this.a = s8;
            }

            @Override
            public void a() {
                S s8 = this.a;
                s8.I3(s8.C0, this.a.G0, this.a.H0);
            }

            @Override
            public void b(long l8, long l9) {
                this.a.I3(7, l8, l9);
            }
        });
        B.d0(this.A0(), a8, "custom_picker", true);
    }

    private void T3() {
        int n8;
        p p8 = this.u0;
        p8.h0 = n8 = this.C0;
        if (n8 != -1 && n8 != 0) {
            if (n8 == 1) {
                p8.d0 = 0L;
                p8.e0 = 0L;
            } else if (n8 == 2) {
                p8.d0 = 0L;
                p8.e0 = 16000L;
            } else if (n8 == 3) {
                p8.d0 = 16000L;
                p8.e0 = 1000000L;
            } else if (n8 == 4) {
                p8.d0 = 1000000L;
                p8.e0 = 128000000L;
            } else if (n8 == 5) {
                p8.d0 = 128000000L;
                p8.e0 = 1000000000L;
            } else if (n8 == 6) {
                p8.d0 = 1000000000L;
                p8.e0 = -1L;
            } else if (n8 == 7) {
                p8.d0 = this.G0;
                p8.e0 = this.H0;
            } else {
                b.f();
            }
        } else {
            p8.d0 = -1L;
            p8.e0 = -1L;
        }
        this.u0.k0 = this.u0.b() ? this.w0.getText().toString() : null;
        p8 = this.u0;
        p8.g0 = n8 = this.B0;
        if (n8 != -1 && n8 != 0) {
            if (n8 == 1) {
                p8.q = this.D3(0, true);
                this.u0.c0 = this.D3(0, false);
            } else if (n8 == 2) {
                p8.q = this.D3(-1, true);
                this.u0.c0 = this.D3(-1, false);
            } else if (n8 == 3) {
                p8.q = this.D3(this.E3(), true);
                this.u0.c0 = this.D3(0, false);
            } else if (n8 == 4) {
                int n9 = this.E3();
                n8 = this.E3();
                this.u0.q = this.D3(n9 - 7, true);
                this.u0.c0 = this.D3(n8 - 1, false);
            } else if (n8 == 5) {
                p8.q = this.E0;
                p8.c0 = this.F0;
            } else {
                b.f();
            }
        } else {
            p8.q = -1L;
            p8.c0 = -1L;
        }
        this.u0.j0 = this.u0.c() ? this.v0.getText().toString() : null;
        p8 = this.u0;
        p8.i0 = n8 = this.D0;
        p8.f0 = n8 >= 0 && n8 != 0 ? this.F3(n8) : null;
        if (this.u0.d()) {
            this.u0.l0 = this.x0.getText().toString();
            return;
        }
        this.u0.l0 = null;
    }

    static /* synthetic */ int p3(S s8, int n8) {
        s8.C0 = n8;
        return n8;
    }

    static /* synthetic */ int s3(S s8, int n8) {
        s8.B0 = n8;
        return n8;
    }

    static /* synthetic */ int t3(S s8, int n8) {
        s8.D0 = n8;
        return n8;
    }

    public long A3(long l8) {
        Calendar calendar = Calendar.getInstance(J0);
        calendar.setTimeInMillis(l8);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis();
    }

    public long D3(int n8, boolean bl) {
        Calendar calendar = Calendar.getInstance();
        if (bl) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
        }
        calendar.add(5, n8);
        return calendar.getTimeInMillis();
    }

    public String F3(int n8) {
        if (n8 <= 0) {
            return null;
        }
        int n9 = n8 - 1;
        if (n9 >= this.I0.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ExtList Outofbound :");
            stringBuilder.append(this.I0.size());
            stringBuilder.append(":");
            stringBuilder.append(n8);
            b.g(stringBuilder.toString());
            return null;
        }
        return this.I0.get(n9);
    }

    public String G3(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public void M3(ax.B.b<String> collection) {
        collection = new ArrayList<String>(collection);
        this.I0 = collection;
        j.List._EL.sort(collection, (Comparator)new i());
    }

    public void N3(p p8, k k8) {
        this.u0 = p8;
        this.t0 = k8;
    }

    @Override
    public Dialog g3() {
        AutoCompleteTextView autoCompleteTextView;
        Context context = this.b();
        a.a a8 = h.a((Context)this.f0());
        View view = LayoutInflater.from((Context)context).inflate(2131558520, null, false);
        this.v0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131362095);
        this.O3(context, autoCompleteTextView);
        this.w0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131362834);
        this.P3(context, autoCompleteTextView);
        this.x0 = autoCompleteTextView = (AutoCompleteTextView)view.findViewById(2131363010);
        this.Q3(context, autoCompleteTextView);
        a8.p(2131952266);
        a8.setView(view);
        a8.b(true);
        a8.setPositiveButton(17039370, new t(this){
            final S b;
            {
                this.b = s8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                this.b.T3();
                if (this.b.t0 != null) {
                    this.b.t0.a();
                }
            }
        });
        a8.setNegativeButton(0x1040000, null);
        return a8.create();
    }

    public long x3(long l8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l8);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public long y3(long l8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l8);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public long z3(long l8) {
        Calendar calendar = Calendar.getInstance(J0);
        calendar.setTimeInMillis(l8);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 23, 59, 59);
        calendar2.set(14, 999);
        return calendar2.getTimeInMillis();
    }

    public static class i
    implements Comparator<String> {
        Collator c0;
        a q;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public i() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            this.c0.setStrength(3);
            this.q = new a(this.c0);
        }

        public int a(String string, String string2) {
            try {
                int n8 = this.q.a(string, string2);
                return n8;
            }
            catch (Exception exception) {
                return this.c0.compare(string, string2);
            }
        }
    }

    static class j
    extends ArrayAdapter<String> {
        private final String[] a;

        j(Context context, String[] stringArray) {
            super(context, 2131558576, (Object[])stringArray);
            this.a = stringArray;
        }

        public Filter getFilter() {
            return new Filter(this){
                final j a;
                {
                    this.a = j8;
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

    public static interface k {
        public void a();
    }
}

