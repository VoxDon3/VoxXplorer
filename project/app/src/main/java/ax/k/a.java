/*
 * Decompiled with CFR 0.152.
 */
package ax.k;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.Gb.g;
import ax.Gb.l;

@SuppressLint(value={"BanParcelableUsage"})
public final class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;
    public static final b d0;
    private final Intent c0;
    private final int q;

    static {
        d0 = new b(null);
        CREATOR = new Parcelable.Creator<a>(){

            public a a(Parcel parcel) {
                l.f(parcel, "parcel");
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
    }

    public a(int n8, Intent intent) {
        this.q = n8;
        this.c0 = intent;
    }

    public a(Parcel object) {
        l.f(object, "parcel");
        int n8 = object.readInt();
        object = object.readInt() == 0 ? null : (Intent)Intent.CREATOR.createFromParcel(object);
        this(n8, (Intent)object);
    }

    public final Intent a() {
        return this.c0;
    }

    public final int b() {
        return this.q;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityResult{resultCode=");
        stringBuilder.append(d0.a(this.q));
        stringBuilder.append(", data=");
        stringBuilder.append(this.c0);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        l.f(parcel, "dest");
        parcel.writeInt(this.q);
        int n9 = this.c0 == null ? 0 : 1;
        parcel.writeInt(n9);
        Intent intent = this.c0;
        if (intent != null) {
            intent.writeToParcel(parcel, n8);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final String a(int n8) {
            if (n8 != -1) {
                if (n8 != 0) {
                    return String.valueOf(n8);
                }
                return "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }
    }
}

