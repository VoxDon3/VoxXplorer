/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ax.P0.N;
import ax.P0.P;
import ax.P0.i;
import ax.P0.v;
import ax.P0.y;
import ax.U0.g;
import ax.U0.m;
import ax.X2.Q;
import ax.c3.B;
import ax.c3.t;
import ax.c3.u;
import ax.i1.C;
import ax.i1.F;
import ax.i1.Z;
import ax.i1.q0;
import ax.m1.j;
import ax.u3.b;
import ax.w3.h;
import ax.y0.a;
import com.voxdon.xplorer.file.n;
import com.android.ex.photo.c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e {
    private static final Pattern t;
    private static SimpleDateFormat u;
    private static SimpleDateFormat v;
    private static SimpleDateFormat w;
    View a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    ImageView m;
    ImageView n;
    ImageView o;
    TextView p;
    double q = 0.0;
    double r = 0.0;
    View.OnClickListener s = new ax.g3.c(this){
        final e c;
        {
            this.c = e8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(View object) {
            e e8 = this.c;
            double d8 = e8.q;
            if (d8 == 0.0 && e8.r == 0.0) {
                return;
            }
            try {
                String string = String.format(Locale.ROOT, "geo:%.6f,%.6f?q=%.6f,%.6f", d8, this.c.r, this.c.q, this.c.r);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                this.c.a.getContext().startActivity(intent);
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                return;
            }
        }
    };

    static {
        SimpleDateFormat simpleDateFormat;
        t = Pattern.compile(".*[1-9].*");
        Locale locale = Locale.US;
        u = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        if (Q.G1()) {
            try {
                v = simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSX", locale);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (v == null) {
            v = simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        }
        w = new SimpleDateFormat("yyyy MM dd", Locale.US);
    }

    public e(View view) {
        this.a = view;
        this.g = (TextView)view.findViewById(2131362115);
        this.h = (TextView)view.findViewById(2131362116);
        this.i = (TextView)view.findViewById(2131362117);
        this.j = (TextView)view.findViewById(2131362118);
        this.e = (TextView)view.findViewById(2131362396);
        this.f = (TextView)view.findViewById(2131362162);
        this.k = (TextView)view.findViewById(2131362196);
        this.l = (TextView)view.findViewById(2131362197);
        this.b = (TextView)view.findViewById(2131362274);
        this.d = (TextView)view.findViewById(2131362302);
        this.c = (TextView)view.findViewById(2131362275);
        this.m = (ImageView)view.findViewById(2131362403);
        this.n = (ImageView)view.findViewById(2131362119);
        this.o = (ImageView)view.findViewById(2131362345);
        this.p = (TextView)view.findViewById(2131362346);
        this.o.setOnClickListener(this.s);
        this.p.setOnClickListener(this.s);
        this.q = 0.0;
        this.r = 0.0;
    }

    private void c(Context object, long l8, boolean bl) {
        object = l8 > 0L ? (bl ? ax.c3.t.c(object, l8) : ax.c3.t.b(object, l8)) : "-";
        this.l.setText((CharSequence)object);
    }

    private void e(a object) {
        if (object != null && (object = (Object)((a)object).s()) != null) {
            this.q = (double)object[0];
            this.r = (double)object[1];
            this.g();
            return;
        }
        this.p();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(String string) {
        Object object;
        if (string != null && ((Matcher)(object = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(string))).find() && ((Matcher)object).groupCount() == 2) {
            string = ((Matcher)object).group(1);
            object = ((Matcher)object).group(2);
            if (string != null && object != null) {
                try {
                    this.q = Double.parseDouble(string);
                    this.r = Double.parseDouble((String)object);
                    this.g();
                    return;
                }
                catch (NumberFormatException numberFormatException) {}
            }
        }
        this.p();
    }

    private void g() {
        this.p.setText((CharSequence)String.format(Locale.ROOT, "%.6f, %.6f", this.q, this.r));
    }

    private void h(Context context, c c8) {
        a a8 = c8.h;
        long l8 = a8 != null ? this.n(a8) : 0L;
        long l9 = l8;
        if (l8 <= 0L) {
            l9 = c8.i;
        }
        this.c(context, l9, false);
    }

    private void i(a object) {
        this.n.setImageResource(2131231190);
        if (object != null) {
            boolean bl;
            CharSequence charSequence;
            this.t();
            String string = ((a)object).i("Model");
            String string2 = ((a)object).i("Make");
            if (string2 != null && string != null) {
                charSequence = string2;
                if (string2.length() > 0) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2.substring(0, 1).toUpperCase());
                    ((StringBuilder)charSequence).append(string2.substring(1));
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                this.k.setText((CharSequence)String.format("%s %s", charSequence, string));
                bl = true;
            } else {
                this.s((View)this.k);
                bl = false;
            }
            double d8 = ((a)object).k("FNumber", -1.0);
            string2 = "";
            double d9 = d8 - 0.0;
            double d10 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
            charSequence = d10 > 0 ? String.format(Locale.US, "\u0192/%.1f", d8) : "";
            this.g.setText(charSequence);
            d8 = ((a)object).k("FocalLength", -1.0);
            double d11 = d8 - 0.0;
            double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
            charSequence = d12 > 0 ? String.format(Locale.US, "%.2f mm", d8) : "";
            this.h.setText(charSequence);
            if (d10 > 0 && d12 > 0) {
                d10 = 1.0;
            } else {
                this.s((View)this.g);
                this.s((View)this.h);
                d10 = 0.0;
            }
            d8 = ((a)object).k("ExposureTime", -1.0);
            if (d8 <= 0.0) {
                charSequence = "";
            } else if (d8 < 1.0) {
                long l8 = Math.round(1.0 / d8);
                charSequence = String.format(Locale.US, "1/%d s", l8);
            } else {
                charSequence = String.format(Locale.US, "%.1f s", d8);
            }
            this.i.setText(charSequence);
            int n8 = ((a)object).l("PhotographicSensitivity", -1);
            d12 = n8;
            if (n8 == -1) {
                d12 = ((a)object).l("ISOSpeedRatings", -1);
            }
            object = string2;
            if (d12 > 0) {
                object = String.format(Locale.US, "ISO %d", (int)d12);
            }
            this.j.setText((CharSequence)object);
            if (d12 > 0 && d8 > 0.0) {
                return;
            }
            this.s((View)this.i);
            this.s((View)this.j);
            if (d10 == false && !bl) {
                this.s((View)this.n);
            }
            return;
        }
        this.o();
    }

    private void j(c object) {
        int n8;
        int n9;
        block7: {
            int n10;
            int n11;
            block6: {
                n11 = ((c)object).j;
                n10 = ((c)object).k;
                if (n11 <= 0) break block6;
                n9 = n11;
                n8 = n10;
                if (n10 > 0) break block7;
            }
            a a8 = ((c)object).h;
            n9 = n11;
            n8 = n10;
            if (a8 != null) {
                int n12 = a8.l("ImageWidth", -1);
                int n13 = ((c)object).h.l("ImageLength", -1);
                n9 = n11;
                n8 = n10;
                if (n12 >= 0) {
                    n9 = n11;
                    n8 = n10;
                    if (n13 >= 0) {
                        n8 = n13;
                        n9 = n12;
                    }
                }
            }
        }
        object = n9 > 0 && n8 > 0 ? String.format(Locale.US, "%d x %d", n9, n8) : "";
        this.e.setText((CharSequence)object);
        this.f.setText((CharSequence)"");
    }

    private void k(Context context, String string, long l8) {
        long l9;
        boolean bl;
        boolean bl2 = false;
        if (string != null) {
            long l10;
            try {
                l10 = v.parse(string).getTime();
            }
            catch (ParseException parseException) {
                l10 = 0L;
            }
            bl = bl2;
            l9 = l10;
            if (l10 <= 0L) {
                String string2 = w.getTimeZone().getID();
                TimeZone timeZone = TimeZone.getDefault();
                if (string2 != null && !string2.equals(timeZone.getID())) {
                    w.setTimeZone(timeZone);
                }
                try {
                    l9 = w.parse(string).getTime();
                    bl = true;
                }
                catch (ParseException parseException) {
                    bl = bl2;
                    l9 = l10;
                }
            }
        } else {
            l9 = 0L;
            bl = bl2;
        }
        if (l9 > 0L) {
            l8 = l9;
        }
        this.c(context, l8, bl);
    }

    private void l(String string, String string2) {
        if (string == null && string2 == null) {
            this.o();
            return;
        }
        this.t();
        this.s((View)this.k);
        this.n.setImageResource(2131231172);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.g.setText((CharSequence)string);
        } else {
            this.g.setText((CharSequence)"?");
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            this.i.setText((CharSequence)string2);
            return;
        }
        this.i.setText((CharSequence)"?");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(String string, String string2, String string3) {
        long l8;
        int n8;
        int n9;
        block10: {
            int n10;
            block11: {
                n10 = n9 = -1;
                if (string2 != null) {
                    n10 = n9;
                    if (string3 != null) {
                        n10 = Integer.parseInt(string2);
                        try {
                            n8 = Integer.parseInt(string3);
                            n9 = n10;
                            n10 = n8;
                            n8 = n9;
                            n9 = n10;
                            break block10;
                        }
                        catch (NumberFormatException numberFormatException) {
                            break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            n10 = -1;
                        }
                    }
                }
            }
            n9 = -1;
            n8 = n10;
        }
        string3 = "";
        string2 = n8 > 0 && n9 > 0 ? String.format(Locale.US, "%1$s x %2$s", n8, n9) : "";
        this.e.setText((CharSequence)string2);
        if (string != null) {
            try {
                l8 = Long.parseLong(string);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        l8 = -1L;
        string = string3;
        if (l8 > 0L) {
            string = ax.u3.B.n(l8);
        }
        this.f.setText((CharSequence)string);
    }

    private void o() {
        this.s((View)this.n);
        this.s((View)this.k);
        this.s((View)this.g);
        this.s((View)this.h);
        this.s((View)this.i);
        this.s((View)this.j);
    }

    private void p() {
        this.s((View)this.o);
        this.s((View)this.p);
    }

    private void q() {
        this.b.setText((CharSequence)"");
        this.c.setText((CharSequence)"");
        this.d.setText((CharSequence)"");
        this.e.setText((CharSequence)"");
        this.f.setText((CharSequence)"");
        this.l.setText((CharSequence)"");
        this.m.setImageDrawable(null);
        this.o();
        this.p();
    }

    private void r(View view) {
        ((ViewGroup.MarginLayoutParams)view.getLayoutParams()).height = -2;
    }

    private void s(View view) {
        ((ViewGroup.MarginLayoutParams)view.getLayoutParams()).height = 0;
    }

    private void t() {
        this.r((View)this.n);
        this.r((View)this.k);
        this.r((View)this.g);
        this.r((View)this.h);
        this.r((View)this.i);
        this.r((View)this.j);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u(c object, Context object2) {
        Exception exception2;
        block3: {
            F.c c8;
            try {
                c8 = (n)((c)object).g;
                if (B.H((n)((Object)c8))) {
                    c8 = ax.c3.u.L((n)((Object)c8), false);
                    Object object3 = new m((Context)object2, "FileManager");
                    Object object4 = new Z.b((g.a)object3);
                    object4 = ((Z.b)object4).i(y.b((Uri)c8));
                    object3 = new N.b();
                    c8 = new F.c(){
                        final N.b a;
                        final e b;
                        {
                            this.b = e8;
                            this.a = b8;
                        }

                        @Override
                        public void a(F f8, N n8) {
                            if (n8 != null && n8.i() > 0) {
                                n8.f(0, this.a);
                            }
                        }
                    };
                    C.a a8 = new j.b((Context)object2);
                    ((ax.i1.a)object4).z(c8, ((j.b)((Object)a8)).a());
                    object2 = new F.b(0);
                    a8 = new ax.m1.h(true, 65536);
                    object2 = ((Z)object4).i((F.b)object2, (ax.m1.b)((Object)a8), 0L);
                    a8 = new C.a(){
                        final F.c c0;
                        final c d0;
                        final N.b e0;
                        final e f0;
                        final Z q;
                        {
                            this.f0 = e8;
                            this.q = z8;
                            this.c0 = c8;
                            this.d0 = c9;
                            this.e0 = b8;
                        }

                        public void a(C c8) {
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public void f(C object) {
                            try {
                                String string;
                                q0 q02 = object.t();
                                Object object2 = null;
                                String string2 = null;
                                String string3 = string = null;
                                for (int i8 = 0; i8 < q02.a; ++i8) {
                                    P p8 = q02.c(i8);
                                    for (int i9 = 0; i9 < p8.a; ++i9) {
                                        v v8 = p8.b(i9);
                                        String string4 = v8.o;
                                        Object object3 = object2;
                                        String string5 = string2;
                                        String string6 = string;
                                        Object object4 = string3;
                                        if (string4 != null) {
                                            String string7 = ax.w3.h.a(string4);
                                            if (string4.startsWith("video") && !TextUtils.isEmpty((CharSequence)string7)) {
                                                int n8 = v8.v;
                                                string6 = string;
                                                object2 = string3;
                                                if (n8 > 0) {
                                                    string6 = string;
                                                    object2 = string3;
                                                    if (v8.w > 0) {
                                                        string6 = String.valueOf(n8);
                                                        object2 = String.valueOf(v8.w);
                                                    }
                                                }
                                                object3 = string7;
                                                string5 = string2;
                                                object4 = object2;
                                            } else {
                                                object3 = object2;
                                                string5 = string2;
                                                string6 = string;
                                                object4 = string3;
                                                if (string4.startsWith("audio")) {
                                                    object3 = object2;
                                                    string5 = string2;
                                                    string6 = string;
                                                    object4 = string3;
                                                    if (!TextUtils.isEmpty((CharSequence)string7)) {
                                                        object4 = string3;
                                                        string6 = string;
                                                        string5 = string7;
                                                        object3 = object2;
                                                    }
                                                }
                                            }
                                        }
                                        object2 = object3;
                                        string2 = string5;
                                        string = string6;
                                        string3 = object4;
                                    }
                                }
                                this.q.e((C)object);
                                this.q.b(this.c0);
                                this.f0.l(object2, string2);
                                object = this.d0;
                                ((c)object).t = object2;
                                ((c)object).u = string2;
                                long l8 = this.e0.d;
                                if (l8 == 0L || string == null || string3 == null) return;
                                object = String.valueOf(ax.P0.i.a(l8));
                                this.f0.m((String)object, string, string3);
                                object2 = this.d0;
                                ((c)object2).p = object;
                                ((c)object2).q = string;
                                ((c)object2).r = string3;
                                return;
                            }
                            catch (Exception exception) {}
                            exception.printStackTrace();
                        }
                    };
                    object2.n(a8, 0L);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid file info 2 : ");
            ((StringBuilder)object).append(((n)((Object)c8)).P().I());
            ax.u3.b.g(((StringBuilder)object).toString());
            return;
        }
        exception2.printStackTrace();
    }

    public void d(Context context, c object, n n8) {
        c c8;
        block7: {
            block6: {
                block5: {
                    c8 = object;
                    if (object != null) break block5;
                    this.q();
                    if (n8 == null) break block6;
                    c8 = new c();
                    c8.g = n8;
                    c8.l = n8.T();
                    c8.m = n8.B();
                    c8.i = n8.q();
                    c8.n = n8.I(true);
                }
                this.c.setText((CharSequence)c8.l);
                this.b.setText((CharSequence)c8.m);
                this.d.setText((CharSequence)c8.n);
                if (!c8.a) {
                    this.m.setImageResource(2131231189);
                    this.e(c8.h);
                    this.h(context, c8);
                    this.j(c8);
                    this.i(c8.h);
                    return;
                }
                this.m.setImageResource(2131231253);
                this.f(c8.s);
                this.k(context, c8.o, c8.i);
                this.m(c8.p, c8.q, c8.r);
                object = c8.t;
                if (object != null || c8.u != null) {
                    this.l((String)object, c8.u);
                }
                if (c8.t == null || c8.u == null) break block7;
            }
            return;
        }
        this.u(c8, context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long n(a object) {
        Object object2 = ((a)object).i("DateTimeOriginal");
        String string = object2;
        if (object2 == null) {
            string = ((a)object).i("DateTime");
        }
        if (string == null) return -1L;
        if (!t.matcher(string).matches()) {
            return -1L;
        }
        try {
            object = u.getTimeZone().getID();
            object2 = TimeZone.getDefault();
            if (object == null) return u.parse(string).getTime();
            if (((String)object).equals(((TimeZone)object2).getID())) return u.parse(string).getTime();
            u.setTimeZone((TimeZone)object2);
            return u.parse(string).getTime();
        }
        catch (ParseException parseException) {
            return -1L;
        }
    }
}

