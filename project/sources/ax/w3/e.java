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
import ax.P0.C0900i;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.N;
import ax.P0.P;
import ax.U0.m;
import ax.X2.Q;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.c3.C1832u;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.i1.Z;
import ax.i1.q0;
import ax.m1.j;
import ax.u3.C3184b;
import ax.y0.C3495a;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class e {
    private static final Pattern t = Pattern.compile(".*[1-9].*");
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
    double q;
    double r;
    View.OnClickListener s = new a();

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            e eVar = e.this;
            double d = eVar.q;
            if (d == 0.0d && eVar.r == 0.0d) {
                return;
            }
            try {
                e.this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ROOT, "geo:%.6f,%.6f?q=%.6f,%.6f", Double.valueOf(d), Double.valueOf(e.this.r), Double.valueOf(e.this.q), Double.valueOf(e.this.r)))));
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    class b implements InterfaceC2209F.c {
        final /* synthetic */ N.b a;

        b(N.b bVar) {
            this.a = bVar;
        }

        @Override // ax.i1.InterfaceC2209F.c
        public void a(InterfaceC2209F interfaceC2209F, N n) {
            if (n == null || n.i() <= 0) {
                return;
            }
            n.f(0, this.a);
        }
    }

    static {
        Locale locale = Locale.US;
        u = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        if (Q.G1()) {
            try {
                v = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSX", locale);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (v == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSS'Z'", Locale.US);
            v = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }
        w = new SimpleDateFormat("yyyy MM dd", Locale.US);
    }

    public e(View view) {
        this.q = 0.0d;
        this.r = 0.0d;
        this.a = view;
        this.g = (TextView) view.findViewById(R.id.detail_1);
        this.h = (TextView) view.findViewById(R.id.detail_2);
        this.i = (TextView) view.findViewById(R.id.detail_3);
        this.j = (TextView) view.findViewById(R.id.detail_4);
        this.e = (TextView) view.findViewById(R.id.image_size);
        this.f = (TextView) view.findViewById(R.id.duration);
        this.k = (TextView) view.findViewById(R.id.exif_camera);
        this.l = (TextView) view.findViewById(R.id.exif_datetime);
        this.b = (TextView) view.findViewById(R.id.file_name);
        this.d = (TextView) view.findViewById(R.id.file_size);
        this.c = (TextView) view.findViewById(R.id.file_path);
        this.m = (ImageView) view.findViewById(R.id.info_icon);
        this.n = (ImageView) view.findViewById(R.id.details_icon);
        this.o = (ImageView) view.findViewById(R.id.gps_icon);
        this.p = (TextView) view.findViewById(R.id.gps_text);
        this.o.setOnClickListener(this.s);
        this.p.setOnClickListener(this.s);
        this.q = 0.0d;
        this.r = 0.0d;
    }

    private void c(Context context, long j, boolean z) {
        this.l.setText(j > 0 ? z ? C1831t.c(context, j) : C1831t.b(context, j) : "-");
    }

    private void e(C3495a c3495a) {
        double[] s;
        if (c3495a == null || (s = c3495a.s()) == null) {
            p();
            return;
        }
        this.q = s[0];
        this.r = s[1];
        g();
    }

    private void f(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(str);
            if (matcher.find() && matcher.groupCount() == 2) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null && group2 != null) {
                    try {
                        this.q = Double.parseDouble(group);
                        this.r = Double.parseDouble(group2);
                        g();
                        return;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        p();
    }

    private void g() {
        this.p.setText(String.format(Locale.ROOT, "%.6f, %.6f", Double.valueOf(this.q), Double.valueOf(this.r)));
    }

    private void h(Context context, com.android.ex.photo.c cVar) {
        C3495a c3495a = cVar.h;
        long n = c3495a != null ? n(c3495a) : 0L;
        if (n <= 0) {
            n = cVar.i;
        }
        c(context, n, false);
    }

    private void i(C3495a c3495a) {
        boolean z;
        boolean z2;
        this.n.setImageResource(R.drawable.ic_photo_camera);
        if (c3495a == null) {
            o();
            return;
        }
        t();
        String i = c3495a.i("Model");
        String i2 = c3495a.i("Make");
        if (i2 == null || i == null) {
            s(this.k);
            z = false;
        } else {
            if (i2.length() > 0) {
                i2 = i2.substring(0, 1).toUpperCase() + i2.substring(1);
            }
            this.k.setText(String.format("%s %s", i2, i));
            z = true;
        }
        double k = c3495a.k("FNumber", -1.0d);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        this.g.setText(k > 0.0d ? String.format(Locale.US, "ƒ/%.1f", Double.valueOf(k)) : HttpUrl.FRAGMENT_ENCODE_SET);
        double k2 = c3495a.k("FocalLength", -1.0d);
        this.h.setText(k2 > 0.0d ? String.format(Locale.US, "%.2f mm", Double.valueOf(k2)) : HttpUrl.FRAGMENT_ENCODE_SET);
        if (k <= 0.0d || k2 <= 0.0d) {
            s(this.g);
            s(this.h);
            z2 = false;
        } else {
            z2 = true;
        }
        double k3 = c3495a.k("ExposureTime", -1.0d);
        this.i.setText(k3 <= 0.0d ? HttpUrl.FRAGMENT_ENCODE_SET : k3 < 1.0d ? String.format(Locale.US, "1/%d s", Long.valueOf(Math.round(1.0d / k3))) : String.format(Locale.US, "%.1f s", Double.valueOf(k3)));
        int l = c3495a.l("PhotographicSensitivity", -1);
        if (l == -1) {
            l = c3495a.l("ISOSpeedRatings", -1);
        }
        if (l > 0) {
            str = String.format(Locale.US, "ISO %d", Integer.valueOf(l));
        }
        this.j.setText(str);
        if (l <= 0 || k3 <= 0.0d) {
            s(this.i);
            s(this.j);
            if (z2 || z) {
                return;
            }
            s(this.n);
        }
    }

    private void j(com.android.ex.photo.c cVar) {
        C3495a c3495a;
        int i = cVar.j;
        int i2 = cVar.k;
        if ((i <= 0 || i2 <= 0) && (c3495a = cVar.h) != null) {
            int l = c3495a.l("ImageWidth", -1);
            int l2 = cVar.h.l("ImageLength", -1);
            if (l >= 0 && l2 >= 0) {
                i2 = l2;
                i = l;
            }
        }
        this.e.setText((i <= 0 || i2 <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : String.format(Locale.US, "%d x %d", Integer.valueOf(i), Integer.valueOf(i2)));
        this.f.setText(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void k(Context context, String str, long j) {
        long j2;
        boolean z = false;
        if (str != null) {
            try {
                j2 = v.parse(str).getTime();
            } catch (ParseException unused) {
                j2 = 0;
            }
            if (j2 <= 0) {
                String id = w.getTimeZone().getID();
                TimeZone timeZone = TimeZone.getDefault();
                if (id != null && !id.equals(timeZone.getID())) {
                    w.setTimeZone(timeZone);
                }
                try {
                    j2 = w.parse(str).getTime();
                    z = true;
                } catch (ParseException unused2) {
                }
            }
        } else {
            j2 = 0;
        }
        if (j2 > 0) {
            j = j2;
        }
        c(context, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, String str2) {
        if (str == null && str2 == null) {
            o();
            return;
        }
        t();
        s(this.k);
        this.n.setImageResource(R.drawable.ic_movie_info);
        if (TextUtils.isEmpty(str)) {
            this.g.setText("?");
        } else {
            this.g.setText(str);
        }
        if (TextUtils.isEmpty(str2)) {
            this.i.setText("?");
        } else {
            this.i.setText(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = -1
            if (r7 == 0) goto L16
            if (r8 == 0) goto L16
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L13
            int r0 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L11
            r4 = r0
            r0 = r7
            r7 = r4
            goto L17
        L11:
            goto L15
        L13:
            r7 = -1
        L15:
            r0 = r7
        L16:
            r7 = -1
        L17:
            java.lang.String r8 = ""
            if (r0 <= 0) goto L37
            if (r7 <= 0) goto L37
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r7
            java.lang.String r7 = "%1$s x %2$s"
            java.lang.String r7 = java.lang.String.format(r1, r7, r2)
            goto L38
        L37:
            r7 = r8
        L38:
            android.widget.TextView r0 = r5.e
            r0.setText(r7)
            if (r6 == 0) goto L44
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L44
            goto L46
        L44:
            r6 = -1
        L46:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L50
            java.lang.String r8 = ax.u3.C3180B.n(r6)
        L50:
            android.widget.TextView r6 = r5.f
            r6.setText(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.e.m(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private void o() {
        s(this.n);
        s(this.k);
        s(this.g);
        s(this.h);
        s(this.i);
        s(this.j);
    }

    private void p() {
        s(this.o);
        s(this.p);
    }

    private void q() {
        this.b.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.c.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.d.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.e.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.f.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.l.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        this.m.setImageDrawable(null);
        o();
        p();
    }

    private void r(View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).height = -2;
    }

    private void s(View view) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).height = 0;
    }

    private void t() {
        r(this.n);
        r(this.k);
        r(this.g);
        r(this.h);
        r(this.i);
        r(this.j);
    }

    private void u(com.android.ex.photo.c cVar, Context context) {
        try {
            AbstractC3595n abstractC3595n = (AbstractC3595n) cVar.g;
            if (!C1809B.H(abstractC3595n)) {
                C3184b.g("Invalid file info 2 : " + abstractC3595n.P().I());
                return;
            }
            Z e = new Z.b(new m(context, "FileManager")).e(C0915y.b(C1832u.L(abstractC3595n, false)));
            N.b bVar = new N.b();
            b bVar2 = new b(bVar);
            e.z(bVar2, new j.b(context).a());
            e.i(new InterfaceC2209F.b(0), new ax.m1.h(true, 65536), 0L).n(new c(e, bVar2, cVar, bVar), 0L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d(Context context, com.android.ex.photo.c cVar, AbstractC3595n abstractC3595n) {
        if (cVar == null) {
            q();
            if (abstractC3595n == null) {
                return;
            }
            cVar = new com.android.ex.photo.c();
            cVar.g = abstractC3595n;
            cVar.l = abstractC3595n.T();
            cVar.m = abstractC3595n.B();
            cVar.i = abstractC3595n.q();
            cVar.n = abstractC3595n.I(true);
        }
        this.c.setText(cVar.l);
        this.b.setText(cVar.m);
        this.d.setText(cVar.n);
        if (!cVar.a) {
            this.m.setImageResource(R.drawable.ic_photo);
            e(cVar.h);
            h(context, cVar);
            j(cVar);
            i(cVar.h);
            return;
        }
        this.m.setImageResource(R.drawable.ic_video);
        f(cVar.s);
        k(context, cVar.o, cVar.i);
        m(cVar.p, cVar.q, cVar.r);
        String str = cVar.t;
        if (str != null || cVar.u != null) {
            l(str, cVar.u);
        }
        if (cVar.t == null || cVar.u == null) {
            u(cVar, context);
        }
    }

    public long n(C3495a c3495a) {
        String i = c3495a.i("DateTimeOriginal");
        if (i == null) {
            i = c3495a.i("DateTime");
        }
        if (i != null && t.matcher(i).matches()) {
            try {
                String id = u.getTimeZone().getID();
                TimeZone timeZone = TimeZone.getDefault();
                if (id != null && !id.equals(timeZone.getID())) {
                    u.setTimeZone(timeZone);
                }
                return u.parse(i).getTime();
            } catch (ParseException unused) {
            }
        }
        return -1L;
    }

    class c implements InterfaceC2206C.a {
        final /* synthetic */ InterfaceC2209F.c c0;
        final /* synthetic */ com.android.ex.photo.c d0;
        final /* synthetic */ N.b e0;
        final /* synthetic */ Z q;

        c(Z z, InterfaceC2209F.c cVar, com.android.ex.photo.c cVar2, N.b bVar) {
            this.q = z;
            this.c0 = cVar;
            this.d0 = cVar2;
            this.e0 = bVar;
        }

        @Override // ax.i1.InterfaceC2206C.a
        public void f(InterfaceC2206C interfaceC2206C) {
            try {
                q0 t = interfaceC2206C.t();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                for (int i = 0; i < t.a; i++) {
                    P c = t.c(i);
                    for (int i2 = 0; i2 < c.a; i2++) {
                        C0912v b = c.b(i2);
                        String str5 = b.o;
                        if (str5 != null) {
                            String a = h.a(str5);
                            if (str5.startsWith("video") && !TextUtils.isEmpty(a)) {
                                int i3 = b.v;
                                if (i3 > 0 && b.w > 0) {
                                    str3 = String.valueOf(i3);
                                    str4 = String.valueOf(b.w);
                                }
                                str = a;
                            } else if (str5.startsWith("audio") && !TextUtils.isEmpty(a)) {
                                str2 = a;
                            }
                        }
                    }
                }
                this.q.e(interfaceC2206C);
                this.q.b(this.c0);
                e.this.l(str, str2);
                com.android.ex.photo.c cVar = this.d0;
                cVar.t = str;
                cVar.u = str2;
                long j = this.e0.d;
                if (j == 0 || str3 == null || str4 == null) {
                    return;
                }
                String valueOf = String.valueOf(C0900i.a(j));
                e.this.m(valueOf, str3, str4);
                com.android.ex.photo.c cVar2 = this.d0;
                cVar2.p = valueOf;
                cVar2.q = str3;
                cVar2.r = str4;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // ax.i1.f0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(InterfaceC2206C interfaceC2206C) {
        }
    }
}
