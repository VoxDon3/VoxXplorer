package ax.k0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: ax.k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2357a implements Parcelable {
    private final Parcelable q;
    public static final AbstractC2357a c0 = new C0346a();
    public static final Parcelable.Creator<AbstractC2357a> CREATOR = new b();

    /* renamed from: ax.k0.a$a, reason: collision with other inner class name */
    class C0346a extends AbstractC2357a {
        C0346a() {
            super((C0346a) null);
        }
    }

    /* renamed from: ax.k0.a$b */
    class b implements Parcelable.ClassLoaderCreator<AbstractC2357a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2357a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2357a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC2357a.c0;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC2357a[] newArray(int i) {
            return new AbstractC2357a[i];
        }
    }

    /* synthetic */ AbstractC2357a(C0346a c0346a) {
        this();
    }

    public final Parcelable a() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.q, i);
    }

    private AbstractC2357a() {
        this.q = null;
    }

    protected AbstractC2357a(Parcelable parcelable) {
        if (parcelable != null) {
            this.q = parcelable == c0 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC2357a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.q = readParcelable == null ? c0 : readParcelable;
    }
}
