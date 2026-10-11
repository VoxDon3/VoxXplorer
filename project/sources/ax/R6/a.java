package ax.R6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.B.k;
import ax.k0.AbstractC2357a;

/* loaded from: classes3.dex */
public class a extends AbstractC2357a {
    public static final Parcelable.Creator<a> CREATOR = new C0184a();
    public final k<String, Bundle> d0;

    /* renamed from: ax.R6.a$a, reason: collision with other inner class name */
    class C0184a implements Parcelable.ClassLoaderCreator<a> {
        C0184a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0184a c0184a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.d0 + "}";
    }

    @Override // ax.k0.AbstractC2357a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.d0.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.d0.f(i2);
            bundleArr[i2] = this.d0.k(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.d0 = new k<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.d0 = new k<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.d0.put(strArr[i], bundleArr[i]);
        }
    }
}
