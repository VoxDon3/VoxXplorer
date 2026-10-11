/*
 * Decompiled with CFR 0.152.
 */
package ax.k0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint(value={"BanParcelableUsage"})
public abstract class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;
    public static final a c0;
    private final Parcelable q;

    static {
        c0 = new a(){};
        CREATOR = new Parcelable.ClassLoaderCreator<a>(){

            public a a(Parcel parcel) {
                return this.b(parcel, null);
            }

            public a b(Parcel parcel, ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return c0;
                }
                throw new IllegalStateException("superState must be null");
            }

            public a[] c(int n8) {
                return new a[n8];
            }
        };
    }

    private a() {
        this.q = null;
    }

    protected a(Parcel object, ClassLoader classLoader) {
        object = object.readParcelable(classLoader);
        if (object == null) {
            object = c0;
        }
        this.q = object;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == c0) {
                parcelable = null;
            }
            this.q = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable a() {
        return this.q;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeParcelable(this.q, n8);
    }
}

