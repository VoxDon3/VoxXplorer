package ax.P0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: ax.P0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906o implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C0906o> CREATOR = new a();
    private int c0;
    public final String d0;
    public final int e0;
    private final b[] q;

    /* renamed from: ax.P0.o$a */
    class a implements Parcelable.Creator<C0906o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0906o createFromParcel(Parcel parcel) {
            return new C0906o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0906o[] newArray(int i) {
            return new C0906o[i];
        }
    }

    /* renamed from: ax.P0.o$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final UUID c0;
        public final String d0;
        public final String e0;
        public final byte[] f0;
        private int q;

        /* renamed from: ax.P0.o$b$a */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.c0, this.d0, this.e0, bArr);
        }

        public boolean b() {
            return this.f0 != null;
        }

        public boolean c(UUID uuid) {
            return C0900i.a.equals(this.c0) || uuid.equals(this.c0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.d0, bVar.d0) && Objects.equals(this.e0, bVar.e0) && Objects.equals(this.c0, bVar.c0) && Arrays.equals(this.f0, bVar.f0);
        }

        public int hashCode() {
            if (this.q == 0) {
                int hashCode = this.c0.hashCode() * 31;
                String str = this.d0;
                this.q = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e0.hashCode()) * 31) + Arrays.hashCode(this.f0);
            }
            return this.q;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.c0.getMostSignificantBits());
            parcel.writeLong(this.c0.getLeastSignificantBits());
            parcel.writeString(this.d0);
            parcel.writeString(this.e0);
            parcel.writeByteArray(this.f0);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.c0 = (UUID) C0968a.e(uuid);
            this.d0 = str;
            this.e0 = D.t((String) C0968a.e(str2));
            this.f0 = bArr;
        }

        b(Parcel parcel) {
            this.c0 = new UUID(parcel.readLong(), parcel.readLong());
            this.d0 = parcel.readString();
            this.e0 = (String) d0.i(parcel.readString());
            this.f0 = parcel.createByteArray();
        }
    }

    public C0906o(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).c0.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C0906o d(C0906o c0906o, C0906o c0906o2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c0906o != null) {
            str = c0906o.d0;
            for (b bVar : c0906o.q) {
                if (bVar.b()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c0906o2 != null) {
            if (str == null) {
                str = c0906o2.d0;
            }
            int size = arrayList.size();
            for (b bVar2 : c0906o2.q) {
                if (bVar2.b() && !b(arrayList, size, bVar2.c0)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0906o(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C0900i.a;
        return uuid.equals(bVar.c0) ? uuid.equals(bVar2.c0) ? 0 : 1 : bVar.c0.compareTo(bVar2.c0);
    }

    public C0906o c(String str) {
        return Objects.equals(this.d0, str) ? this : new C0906o(str, false, this.q);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i) {
        return this.q[i];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0906o.class == obj.getClass()) {
            C0906o c0906o = (C0906o) obj;
            if (Objects.equals(this.d0, c0906o.d0) && Arrays.equals(this.q, c0906o.q)) {
                return true;
            }
        }
        return false;
    }

    public C0906o f(C0906o c0906o) {
        String str;
        String str2 = this.d0;
        C0968a.g(str2 == null || (str = c0906o.d0) == null || TextUtils.equals(str2, str));
        String str3 = this.d0;
        if (str3 == null) {
            str3 = c0906o.d0;
        }
        return new C0906o(str3, (b[]) d0.f1(this.q, c0906o.q));
    }

    public int hashCode() {
        if (this.c0 == 0) {
            String str = this.d0;
            this.c0 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.q);
        }
        return this.c0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d0);
        parcel.writeTypedArray(this.q, 0);
    }

    public C0906o(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C0906o(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C0906o(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private C0906o(String str, boolean z, b... bVarArr) {
        this.d0 = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.q = bVarArr;
        this.e0 = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    C0906o(Parcel parcel) {
        this.d0 = parcel.readString();
        b[] bVarArr = (b[]) d0.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.q = bVarArr;
        this.e0 = bVarArr.length;
    }
}
