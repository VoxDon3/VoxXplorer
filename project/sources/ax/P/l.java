package ax.P;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l {

    public static class a {
        final Bundle a;
        private IconCompat b;
        private final u[] c;
        private final u[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;

        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;

        /* renamed from: ax.P.l$a$a, reason: collision with other inner class name */
        public static final class C0164a {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<u> f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;

            public C0164a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.i && this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<u> arrayList3 = this.f;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        u uVar = arrayList3.get(i);
                        i++;
                        u uVar2 = uVar;
                        if (uVar2.j()) {
                            arrayList.add(uVar2);
                        } else {
                            arrayList2.add(uVar2);
                        }
                    }
                }
                return new a(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (u[]) arrayList2.toArray(new u[arrayList2.size()]), arrayList.isEmpty() ? null : (u[]) arrayList.toArray(new u[arrayList.size()]), this.d, this.g, this.h, this.i, this.j);
            }

            private C0164a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = d.e(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = uVarArr == null ? null : new ArrayList<>(Arrays.asList(uVarArr));
                this.d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
                this.j = z4;
            }
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m(null, HttpUrl.FRAGMENT_ENCODE_SET, i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.m(null, HttpUrl.FRAGMENT_ENCODE_SET, i);
            }
            return this.b;
        }

        public u[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, u[] uVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.r() == 2) {
                this.i = iconCompat.o();
            }
            this.j = d.e(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = uVarArr;
            this.d = uVarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class b extends f {
        private CharSequence e;

        @Override // ax.P.l.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // ax.P.l.f
        public void b(k kVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // ax.P.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.e = d.e(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static abstract class f {
        protected d a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public abstract void b(k kVar);

        protected String c() {
            return null;
        }

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.w(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ax.O.c.b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ax.O.c.a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        ax.Q.d N;
        long O;
        int P;
        int Q;
        boolean R;
        Notification S;
        boolean T;
        Object U;

        @Deprecated
        public ArrayList<String> V;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<s> c;
        ArrayList<a> d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        IconCompat j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        f p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        public d(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void l(int i, boolean z) {
            if (z) {
                Notification notification = this.S;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.S;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public d A(long j) {
            this.S.when = j;
            return this;
        }

        public d a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public d b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new n(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d f(boolean z) {
            l(16, z);
            return this;
        }

        public d g(String str) {
            this.K = str;
            return this;
        }

        public d h(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f = e(charSequence);
            return this;
        }

        public d j(CharSequence charSequence) {
            this.e = e(charSequence);
            return this;
        }

        public d k(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public d m(int i) {
            this.Q = i;
            return this;
        }

        public d n(Bitmap bitmap) {
            this.j = bitmap == null ? null : IconCompat.i(l.b(this.a, bitmap));
            return this;
        }

        public d o(boolean z) {
            this.z = z;
            return this;
        }

        public d p(boolean z) {
            l(2, z);
            return this;
        }

        public d q(boolean z) {
            l(8, z);
            return this;
        }

        public d r(int i) {
            this.m = i;
            return this;
        }

        public d s(int i, int i2, boolean z) {
            this.t = i;
            this.u = i2;
            this.v = z;
            return this;
        }

        public d t(boolean z) {
            this.n = z;
            return this;
        }

        public d u(boolean z) {
            this.T = z;
            return this;
        }

        public d v(int i) {
            this.S.icon = i;
            return this;
        }

        public d w(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public d x(CharSequence charSequence) {
            this.S.tickerText = e(charSequence);
            return this;
        }

        public d y(boolean z) {
            this.o = z;
            return this;
        }

        public d z(int i) {
            this.F = i;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }
    }

    public static class e extends f {
        private int e;
        private s f;
        private PendingIntent g;
        private PendingIntent h;
        private PendingIntent i;
        private boolean j;
        private Integer k;
        private Integer l;
        private IconCompat m;
        private CharSequence n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i = this.e;
            if (i == 1) {
                return this.a.a.getResources().getString(ax.O.f.e);
            }
            if (i == 2) {
                return this.a.a.getResources().getString(ax.O.f.f);
            }
            if (i != 3) {
                return null;
            }
            return this.a.a.getResources().getString(ax.O.f.g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ax.Q.b.c(this.a.a, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a a2 = new a.C0164a(IconCompat.l(this.a.a, i), spannableStringBuilder, pendingIntent).a();
            a2.c().putBoolean("key_action_priority", true);
            return a2;
        }

        private a l() {
            int i = ax.O.d.b;
            int i2 = ax.O.d.a;
            PendingIntent pendingIntent = this.g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.j;
            return k(z ? i : i2, z ? ax.O.f.b : ax.O.f.a, this.k, ax.O.b.a, pendingIntent);
        }

        private a m() {
            int i = ax.O.d.c;
            PendingIntent pendingIntent = this.h;
            return pendingIntent == null ? k(i, ax.O.f.d, this.l, ax.O.b.b, this.i) : k(i, ax.O.f.c, this.l, ax.O.b.b, pendingIntent);
        }

        @Override // ax.P.l.f
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.e);
            bundle.putBoolean("android.callIsVideo", this.j);
            s sVar = this.f;
            if (sVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(sVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", sVar.i());
                }
            }
            IconCompat iconCompat = this.m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable("android.verificationIcon", b.a(iconCompat.y(this.a.a)));
                } else {
                    bundle.putParcelable("android.verificationIconCompat", iconCompat.w());
                }
            }
            bundle.putCharSequence("android.verificationText", this.n);
            bundle.putParcelable("android.answerIntent", this.g);
            bundle.putParcelable("android.declineIntent", this.h);
            bundle.putParcelable("android.hangUpIntent", this.i);
            Integer num = this.k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // ax.P.l.f
        public void b(k kVar) {
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a2 = null;
            charSequence = null;
            if (i < 31) {
                Notification.Builder a3 = kVar.a();
                s sVar = this.f;
                a3.setContentTitle(sVar != null ? sVar.c() : null);
                Bundle bundle = this.a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequence = this.a.D.getCharSequence("android.text");
                }
                if (charSequence == null) {
                    charSequence = i();
                }
                a3.setContentText(charSequence);
                s sVar2 = this.f;
                if (sVar2 != null) {
                    if (i >= 23 && sVar2.a() != null) {
                        b.c(a3, this.f.a().y(this.a.a));
                    }
                    if (i >= 28) {
                        c.a(a3, this.f.h());
                    } else {
                        a.a(a3, this.f.d());
                    }
                }
                a.b(a3, "call");
                return;
            }
            int i2 = this.e;
            if (i2 == 1) {
                a2 = d.a(this.f.h(), this.h, this.g);
            } else if (i2 == 2) {
                a2 = d.b(this.f.h(), this.i);
            } else if (i2 == 3) {
                a2 = d.c(this.f.h(), this.i, this.g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.e));
            }
            if (a2 != null) {
                a2.setBuilder(kVar.a());
                Integer num = this.k;
                if (num != null) {
                    d.d(a2, num.intValue());
                }
                Integer num2 = this.l;
                if (num2 != null) {
                    d.f(a2, num2.intValue());
                }
                d.i(a2, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    d.h(a2, iconCompat.y(this.a.a));
                }
                d.g(a2, this.j);
            }
        }

        @Override // ax.P.l.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a m = m();
            a l = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m);
            ArrayList<a> arrayList2 = this.a.b;
            int i = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    a aVar = arrayList2.get(i2);
                    i2++;
                    a aVar2 = aVar;
                    if (aVar2.j()) {
                        arrayList.add(aVar2);
                    } else if (!j(aVar2) && i > 1) {
                        arrayList.add(aVar2);
                        i--;
                    }
                    if (l != null && i == 1) {
                        arrayList.add(l);
                        i--;
                    }
                }
            }
            if (l != null && i >= 1) {
                arrayList.add(l);
            }
            return arrayList;
        }

        static class b {
            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Parcelable a(Icon icon) {
                return icon;
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }
    }
}
