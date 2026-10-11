/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
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
import ax.P.k;
import ax.P.m;
import ax.P.n;
import ax.P.s;
import ax.P.u;
import java.util.ArrayList;
import java.util.Arrays;

public class l {
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            context = context.getResources();
            int n8 = context.getDimensionPixelSize(ax.O.c.b);
            int n9 = context.getDimensionPixelSize(ax.O.c.a);
            if (bitmap.getWidth() <= n8 && bitmap.getHeight() <= n9) {
                return bitmap;
            }
            double d8 = Math.min((double)n8 / (double)Math.max(1, bitmap.getWidth()), (double)n9 / (double)Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)((int)Math.ceil((double)bitmap.getWidth() * d8)), (int)((int)Math.ceil((double)bitmap.getHeight() * d8)), (boolean)true);
        }
        return bitmap;
    }

    public static class ax.P.l$a {
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

        public ax.P.l$a(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            IconCompat iconCompat = null;
            if (n8 != 0) {
                iconCompat = IconCompat.m(null, "", n8);
            }
            this(iconCompat, charSequence, pendingIntent);
        }

        public ax.P.l$a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        ax.P.l$a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uArray, u[] uArray2, boolean bl, int n8, boolean bl2, boolean bl3, boolean bl4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.r() == 2) {
                this.i = iconCompat.o();
            }
            this.j = ax.P.l$d.e(charSequence);
            this.k = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.a = bundle;
            this.c = uArray;
            this.d = uArray2;
            this.e = bl;
            this.g = n8;
            this.f = bl2;
            this.h = bl3;
            this.l = bl4;
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
            int n8;
            if (this.b == null && (n8 = this.i) != 0) {
                this.b = IconCompat.m(null, "", n8);
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

        public static final class a {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d = true;
            private final Bundle e;
            private ArrayList<u> f;
            private int g;
            private boolean h = true;
            private boolean i;
            private boolean j;

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private a(IconCompat object, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uArray, boolean bl, int n8, boolean bl2, boolean bl3, boolean bl4) {
                this.a = object;
                this.b = ax.P.l$d.e(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                object = uArray == null ? null : new ArrayList<u>(Arrays.asList(uArray));
                this.f = object;
                this.d = bl;
                this.g = n8;
                this.h = bl2;
                this.i = bl3;
                this.j = bl4;
            }

            private void b() {
                if (!this.i || this.c != null) {
                    return;
                }
                throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
            }

            public ax.P.l$a a() {
                u[] uArray;
                Object object;
                block3: {
                    this.b();
                    object = new ArrayList();
                    ArrayList<u> arrayList = new ArrayList<u>();
                    uArray = this.f;
                    if (uArray != null) {
                        int n8 = uArray.size();
                        for (int i8 = 0; i8 < n8; ++i8) {
                            u u8 = uArray.get(i8);
                            if (u8.j()) {
                                object.add(u8);
                                continue;
                            }
                            arrayList.add(u8);
                        }
                    }
                    boolean bl = object.isEmpty();
                    uArray = null;
                    object = bl ? null : object.toArray(new u[object.size()]);
                    if (arrayList.isEmpty()) break block3;
                    uArray = arrayList.toArray(new u[arrayList.size()]);
                }
                return new ax.P.l$a(this.a, this.b, this.c, this.e, uArray, (u[])object, this.d, this.g, this.h, this.i, this.j);
            }
        }
    }

    public static class b
    extends f {
        private CharSequence e;

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override
        public void b(k k8) {
            k8 = new Notification.BigTextStyle(k8.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                k8.setSummaryText(this.c);
            }
        }

        @Override
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.e = d.e(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c c8) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E = 0;
        int F = 0;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L = 0;
        String M;
        ax.Q.d N;
        long O;
        int P = 0;
        int Q = 0;
        boolean R;
        Notification S;
        boolean T;
        Object U;
        @Deprecated
        public ArrayList<String> V;
        public Context a;
        public ArrayList<a> b = new ArrayList();
        public ArrayList<s> c = new ArrayList();
        ArrayList<a> d = new ArrayList();
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        IconCompat j;
        CharSequence k;
        int l;
        int m;
        boolean n = true;
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
        boolean z = false;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String string) {
            Notification notification;
            this.S = notification = new Notification();
            this.a = context;
            this.K = string;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList();
            this.R = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence.length() > 5120) {
                charSequence2 = charSequence.subSequence(0, 5120);
            }
            return charSequence2;
        }

        private void l(int n8, boolean bl) {
            if (bl) {
                Notification notification = this.S;
                notification.flags = n8 | notification.flags;
                return;
            }
            Notification notification = this.S;
            notification.flags = ~n8 & notification.flags;
        }

        public d A(long l8) {
            this.S.when = l8;
            return this;
        }

        public d a(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(n8, charSequence, pendingIntent));
            return this;
        }

        public d b(a a8) {
            if (a8 != null) {
                this.b.add(a8);
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

        public d f(boolean bl) {
            this.l(16, bl);
            return this;
        }

        public d g(String string) {
            this.K = string;
            return this;
        }

        public d h(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f = ax.P.l$d.e(charSequence);
            return this;
        }

        public d j(CharSequence charSequence) {
            this.e = ax.P.l$d.e(charSequence);
            return this;
        }

        public d k(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public d m(int n8) {
            this.Q = n8;
            return this;
        }

        public d n(Bitmap object) {
            object = object == null ? null : IconCompat.i(ax.P.l.b(this.a, object));
            this.j = object;
            return this;
        }

        public d o(boolean bl) {
            this.z = bl;
            return this;
        }

        public d p(boolean bl) {
            this.l(2, bl);
            return this;
        }

        public d q(boolean bl) {
            this.l(8, bl);
            return this;
        }

        public d r(int n8) {
            this.m = n8;
            return this;
        }

        public d s(int n8, int n9, boolean bl) {
            this.t = n8;
            this.u = n9;
            this.v = bl;
            return this;
        }

        public d t(boolean bl) {
            this.n = bl;
            return this;
        }

        public d u(boolean bl) {
            this.T = bl;
            return this;
        }

        public d v(int n8) {
            this.S.icon = n8;
            return this;
        }

        public d w(f f8) {
            if (this.p != f8) {
                this.p = f8;
                if (f8 != null) {
                    f8.g(this);
                }
            }
            return this;
        }

        public d x(CharSequence charSequence) {
            this.S.tickerText = ax.P.l$d.e(charSequence);
            return this;
        }

        public d y(boolean bl) {
            this.o = bl;
            return this;
        }

        public d z(int n8) {
            this.F = n8;
            return this;
        }
    }

    public static class e
    extends f {
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

        private String i() {
            int n8 = this.e;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return null;
                    }
                    return this.a.a.getResources().getString(ax.O.f.g);
                }
                return this.a.a.getResources().getString(ax.O.f.f);
            }
            return this.a.a.getResources().getString(ax.O.f.e);
        }

        private boolean j(ax.P.l$a a8) {
            return a8 != null && a8.c().getBoolean("key_action_priority");
        }

        private ax.P.l$a k(int n8, int n9, Integer object, int n10, PendingIntent pendingIntent) {
            Integer n11 = object;
            if (object == null) {
                n11 = ax.Q.b.c(this.a.a, n10);
            }
            object = new SpannableStringBuilder();
            object.append((CharSequence)this.a.a.getResources().getString(n9));
            object.setSpan((Object)new ForegroundColorSpan(n11.intValue()), 0, object.length(), 18);
            object = new a.a(IconCompat.l(this.a.a, n8), (CharSequence)object, pendingIntent).a();
            ((ax.P.l$a)object).c().putBoolean("key_action_priority", true);
            return object;
        }

        private ax.P.l$a l() {
            int n8 = ax.O.d.b;
            int n9 = ax.O.d.a;
            PendingIntent pendingIntent = this.g;
            if (pendingIntent == null) {
                return null;
            }
            boolean bl = this.j;
            if (bl) {
                n9 = n8;
            }
            n8 = bl ? ax.O.f.b : ax.O.f.a;
            return this.k(n9, n8, this.k, ax.O.b.a, pendingIntent);
        }

        private ax.P.l$a m() {
            int n8 = ax.O.d.c;
            PendingIntent pendingIntent = this.h;
            if (pendingIntent == null) {
                return this.k(n8, ax.O.f.d, this.l, ax.O.b.b, this.i);
            }
            return this.k(n8, ax.O.f.c, this.l, ax.O.b.b, pendingIntent);
        }

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.e);
            bundle.putBoolean("android.callIsVideo", this.j);
            Object object = this.f;
            if (object != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(((s)object).h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", (Parcelable)((s)object).i());
                }
            }
            if ((object = this.m) != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable("android.verificationIcon", b.a(((IconCompat)object).y(this.a.a)));
                } else {
                    bundle.putParcelable("android.verificationIconCompat", (Parcelable)((IconCompat)object).w());
                }
            }
            bundle.putCharSequence("android.verificationText", this.n);
            bundle.putParcelable("android.answerIntent", (Parcelable)this.g);
            bundle.putParcelable("android.declineIntent", (Parcelable)this.h);
            bundle.putParcelable("android.hangUpIntent", (Parcelable)this.i);
            object = this.k;
            if (object != null) {
                bundle.putInt("android.answerColor", ((Integer)object).intValue());
            }
            if ((object = this.l) != null) {
                bundle.putInt("android.declineColor", ((Integer)object).intValue());
            }
        }

        @Override
        public void b(k object) {
            int n8 = Build.VERSION.SDK_INT;
            Object object2 = null;
            Notification.Builder builder = null;
            if (n8 >= 31) {
                n8 = this.e;
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            object2 = builder;
                            if (Log.isLoggable((String)"NotifCompat", (int)3)) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("Unrecognized call type in CallStyle: ");
                                ((StringBuilder)object2).append(String.valueOf(this.e));
                                Log.d((String)"NotifCompat", (String)((StringBuilder)object2).toString());
                                object2 = builder;
                            }
                        } else {
                            object2 = d.c(this.f.h(), this.i, this.g);
                        }
                    } else {
                        object2 = d.b(this.f.h(), this.i);
                    }
                } else {
                    object2 = d.a(this.f.h(), this.h, this.g);
                }
                if (object2 != null) {
                    ax.P.m.a((Notification.CallStyle)object2, object.a());
                    object = this.k;
                    if (object != null) {
                        d.d((Notification.CallStyle)object2, (Integer)object);
                    }
                    if ((object = this.l) != null) {
                        d.f((Notification.CallStyle)object2, (Integer)object);
                    }
                    d.i((Notification.CallStyle)object2, this.n);
                    object = this.m;
                    if (object != null) {
                        d.h((Notification.CallStyle)object2, ((IconCompat)object).y(this.a.a));
                    }
                    d.g((Notification.CallStyle)object2, this.j);
                }
                return;
            }
            builder = object.a();
            object = this.f;
            object = object != null ? ((s)object).c() : null;
            builder.setContentTitle((CharSequence)object);
            Bundle bundle = this.a.D;
            object = object2;
            if (bundle != null) {
                object = object2;
                if (bundle.containsKey("android.text")) {
                    object = this.a.D.getCharSequence("android.text");
                }
            }
            object2 = object;
            if (object == null) {
                object2 = this.i();
            }
            builder.setContentText((CharSequence)object2);
            object = this.f;
            if (object != null) {
                if (n8 >= 23 && ((s)object).a() != null) {
                    b.c(builder, this.f.a().y(this.a.a));
                }
                if (n8 >= 28) {
                    c.a(builder, this.f.h());
                } else {
                    a.a(builder, this.f.d());
                }
            }
            a.b(builder, "call");
        }

        @Override
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<ax.P.l$a> h() {
            int n8;
            Object object = this.m();
            ax.P.l$a a8 = this.l();
            ArrayList<ax.P.l$a> arrayList = new ArrayList<ax.P.l$a>(3);
            arrayList.add((ax.P.l$a)object);
            object = this.a.b;
            int n9 = n8 = 2;
            if (object != null) {
                int n10 = ((ArrayList)object).size();
                int n11 = 0;
                while (true) {
                    n9 = n8;
                    if (n11 >= n10) break;
                    Object object2 = ((ArrayList)object).get(n11);
                    int n12 = n11 + 1;
                    if (((ax.P.l$a)(object2 = (ax.P.l$a)object2)).j()) {
                        arrayList.add((ax.P.l$a)object2);
                        n9 = n8;
                    } else if (this.j((ax.P.l$a)object2)) {
                        n9 = n8;
                    } else {
                        n9 = n8;
                        if (n8 > 1) {
                            arrayList.add((ax.P.l$a)object2);
                            n9 = n8 - 1;
                        }
                    }
                    n8 = n9;
                    n11 = n12;
                    if (a8 == null) continue;
                    n8 = n9;
                    n11 = n12;
                    if (n9 != 1) continue;
                    arrayList.add(a8);
                    n8 = n9 - 1;
                    n11 = n12;
                }
            }
            if (a8 != null && n9 >= 1) {
                arrayList.add(a8);
            }
            return arrayList;
        }

        static class a {
            static Notification.Builder a(Notification.Builder builder, String string) {
                return builder.addPerson(string);
            }

            static Notification.Builder b(Notification.Builder builder, String string) {
                return builder.setCategory(string);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
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

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall((Person)person, (PendingIntent)pendingIntent, (PendingIntent)pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall((Person)person, (PendingIntent)pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall((Person)person, (PendingIntent)pendingIntent, (PendingIntent)pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int n8) {
                return callStyle.setAnswerButtonColorHint(n8);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean bl) {
                return builder.setAuthenticationRequired(bl);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int n8) {
                return callStyle.setDeclineButtonColorHint(n8);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean bl) {
                return callStyle.setIsVideo(bl);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }
    }

    public static abstract class f {
        protected d a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
            CharSequence charSequence;
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            if ((charSequence = this.b) != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            if ((charSequence = this.c()) != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)charSequence);
            }
        }

        public abstract void b(k var1);

        protected String c() {
            return null;
        }

        public RemoteViews d(k k8) {
            return null;
        }

        public RemoteViews e(k k8) {
            return null;
        }

        public RemoteViews f(k k8) {
            return null;
        }

        public void g(d d8) {
            if (this.a != d8) {
                this.a = d8;
                if (d8 != null) {
                    d8.w(this);
                }
            }
        }
    }
}

