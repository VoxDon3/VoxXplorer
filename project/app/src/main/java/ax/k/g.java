/*
 * Decompiled with CFR 0.152.
 */
package ax.k;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import ax.Gb.l;

@SuppressLint(value={"BanParcelableUsage"})
public final class g
implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;
    public static final c f0;
    private final Intent c0;
    private final int d0;
    private final int e0;
    private final IntentSender q;

    static {
        f0 = new c(null);
        CREATOR = new Parcelable.Creator<g>(){

            public g a(Parcel parcel) {
                l.f(parcel, "inParcel");
                return new g(parcel);
            }

            public g[] b(int n8) {
                return new g[n8];
            }
        };
    }

    public g(IntentSender intentSender, Intent intent, int n8, int n9) {
        l.f(intentSender, "intentSender");
        this.q = intentSender;
        this.c0 = intent;
        this.d0 = n8;
        this.e0 = n9;
    }

    public g(Parcel parcel) {
        l.f(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        l.c(parcelable);
        this((IntentSender)parcelable, (Intent)parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        l.f(parcel, "dest");
        parcel.writeParcelable((Parcelable)this.q, n8);
        parcel.writeParcelable((Parcelable)this.c0, n8);
        parcel.writeInt(this.d0);
        parcel.writeInt(this.e0);
    }

    public static final class a {
        private final IntentSender a;
        private Intent b;
        private int c;
        private int d;

        public a(IntentSender intentSender) {
            l.f(intentSender, "intentSender");
            this.a = intentSender;
        }

        public final g a() {
            return new g(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a c(int n8, int n9) {
            this.d = n8;
            this.c = n9;
            return this;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ax.Gb.g g8) {
            this();
        }
    }
}

