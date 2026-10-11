package ax.k;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.Gb.l;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: ax.k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350a implements Parcelable {
    private final Intent c0;
    private final int q;
    public static final b d0 = new b(null);
    public static final Parcelable.Creator<C2350a> CREATOR = new C0344a();

    /* renamed from: ax.k.a$a, reason: collision with other inner class name */
    public static final class C0344a implements Parcelable.Creator<C2350a> {
        C0344a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2350a createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new C2350a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2350a[] newArray(int i) {
            return new C2350a[i];
        }
    }

    /* renamed from: ax.k.a$b */
    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        public final String a(int i) {
            return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public C2350a(int i, Intent intent) {
        this.q = i;
        this.c0 = intent;
    }

    public final Intent a() {
        return this.c0;
    }

    public final int b() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d0.a(this.q) + ", data=" + this.c0 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.f(parcel, "dest");
        parcel.writeInt(this.q);
        parcel.writeInt(this.c0 == null ? 0 : 1);
        Intent intent = this.c0;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2350a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        l.f(parcel, "parcel");
    }
}
