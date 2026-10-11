package ax.k;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import ax.Gb.l;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: ax.k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356g implements Parcelable {
    private final Intent c0;
    private final int d0;
    private final int e0;
    private final IntentSender q;
    public static final c f0 = new c(null);
    public static final Parcelable.Creator<C2356g> CREATOR = new b();

    /* renamed from: ax.k.g$a */
    public static final class a {
        private final IntentSender a;
        private Intent b;
        private int c;
        private int d;

        public a(IntentSender intentSender) {
            l.f(intentSender, "intentSender");
            this.a = intentSender;
        }

        public final C2356g a() {
            return new C2356g(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }
    }

    /* renamed from: ax.k.g$b */
    public static final class b implements Parcelable.Creator<C2356g> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2356g createFromParcel(Parcel parcel) {
            l.f(parcel, "inParcel");
            return new C2356g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2356g[] newArray(int i) {
            return new C2356g[i];
        }
    }

    /* renamed from: ax.k.g$c */
    public static final class c {
        public /* synthetic */ c(ax.Gb.g gVar) {
            this();
        }

        private c() {
        }
    }

    public C2356g(IntentSender intentSender, Intent intent, int i, int i2) {
        l.f(intentSender, "intentSender");
        this.q = intentSender;
        this.c0 = intent;
        this.d0 = i;
        this.e0 = i2;
    }

    public final Intent a() {
        return this.c0;
    }

    public final int b() {
        return this.d0;
    }

    public final int c() {
        return this.e0;
    }

    public final IntentSender d() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.f(parcel, "dest");
        parcel.writeParcelable(this.q, i);
        parcel.writeParcelable(this.c0, i);
        parcel.writeInt(this.d0);
        parcel.writeInt(this.e0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2356g(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            ax.Gb.l.f(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            ax.Gb.l.c(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.k.C2356g.<init>(android.os.Parcel):void");
    }
}
