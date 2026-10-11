/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.P0.D;
import ax.P0.i;
import ax.S0.a;
import ax.S0.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class o
implements Comparator<b>,
Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new Parcelable.Creator<o>(){

        public o a(Parcel parcel) {
            return new o(parcel);
        }

        public o[] b(int n8) {
            return new o[n8];
        }
    };
    private int c0;
    public final String d0;
    public final int e0;
    private final b[] q;

    o(Parcel bArray) {
        this.d0 = bArray.readString();
        bArray = ax.S0.d0.i((b[])bArray.createTypedArray(b.CREATOR));
        this.q = bArray;
        this.e0 = bArray.length;
    }

    public o(String string, List<b> list) {
        this(string, false, list.toArray(new b[0]));
    }

    private o(String bArray, boolean bl, b ... bArray2) {
        this.d0 = bArray;
        bArray = bArray2;
        if (bl) {
            bArray = (b[])bArray2.clone();
        }
        this.q = bArray;
        this.e0 = bArray.length;
        Arrays.sort(bArray, this);
    }

    public o(String string, b ... bArray) {
        this(string, true, bArray);
    }

    public o(List<b> list) {
        this(null, false, list.toArray(new b[0]));
    }

    public o(b ... bArray) {
        this((String)null, bArray);
    }

    private static boolean b(ArrayList<b> arrayList, int n8, UUID uUID) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!arrayList.get((int)i8).c0.equals(uUID)) continue;
            return true;
        }
        return false;
    }

    public static o d(o object, o object2) {
        int n8;
        int n9;
        b[] bArray;
        Object object3;
        ArrayList<b> arrayList = new ArrayList<b>();
        int n10 = 0;
        if (object != null) {
            object3 = ((o)object).d0;
            bArray = ((o)object).q;
            n9 = bArray.length;
            n8 = 0;
            while (true) {
                object = object3;
                if (n8 < n9) {
                    object = bArray[n8];
                    if (((b)object).b()) {
                        arrayList.add((b)object);
                    }
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        bArray = object;
        if (object2 != null) {
            object3 = object;
            if (object == null) {
                object3 = ((o)object2).d0;
            }
            int n11 = arrayList.size();
            object = ((o)object2).q;
            n9 = ((b[])object).length;
            n8 = n10;
            while (true) {
                bArray = object3;
                if (n8 >= n9) break;
                object2 = object[n8];
                if (((b)object2).b() && !o.b(arrayList, n11, ((b)object2).c0)) {
                    arrayList.add((b)object2);
                }
                ++n8;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new o((String)bArray, arrayList);
    }

    public int a(b b8, b b9) {
        UUID uUID = i.a;
        if (uUID.equals(b8.c0)) {
            if (uUID.equals(b9.c0)) {
                return 0;
            }
            return 1;
        }
        return b8.c0.compareTo(b9.c0);
    }

    public o c(String string) {
        if (j.Objects.equals((Object)this.d0, (Object)string)) {
            return this;
        }
        return new o(string, false, this.q);
    }

    public int describeContents() {
        return 0;
    }

    public b e(int n8) {
        return this.q[n8];
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && o.class == object.getClass()) {
            object = (o)object;
            if (j.Objects.equals((Object)this.d0, (Object)((o)object).d0) && Arrays.equals(this.q, ((o)object).q)) {
                return true;
            }
        }
        return false;
    }

    public o f(o o8) {
        String string;
        String string2 = this.d0;
        boolean bl = string2 == null || (string = o8.d0) == null || TextUtils.equals((CharSequence)string2, (CharSequence)string);
        a.g(bl);
        string2 = this.d0;
        if (string2 == null) {
            string2 = o8.d0;
        }
        return new o(string2, ax.S0.d0.f1(this.q, o8.q));
    }

    public int hashCode() {
        if (this.c0 == 0) {
            String string = this.d0;
            int n8 = string == null ? 0 : string.hashCode();
            this.c0 = n8 * 31 + Arrays.hashCode(this.q);
        }
        return this.c0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.d0);
        parcel.writeTypedArray((Parcelable[])this.q, 0);
    }

    public static final class b
    implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };
        public final UUID c0;
        public final String d0;
        public final String e0;
        public final byte[] f0;
        private int q;

        b(Parcel parcel) {
            this.c0 = new UUID(parcel.readLong(), parcel.readLong());
            this.d0 = parcel.readString();
            this.e0 = ax.S0.d0.i(parcel.readString());
            this.f0 = parcel.createByteArray();
        }

        public b(UUID uUID, String string, String string2, byte[] byArray) {
            this.c0 = a.e(uUID);
            this.d0 = string;
            this.e0 = D.t(a.e(string2));
            this.f0 = byArray;
        }

        public b(UUID uUID, String string, byte[] byArray) {
            this(uUID, null, string, byArray);
        }

        public b a(byte[] byArray) {
            return new b(this.c0, this.d0, this.e0, byArray);
        }

        public boolean b() {
            return this.f0 != null;
        }

        public boolean c(UUID uUID) {
            return i.a.equals(this.c0) || uUID.equals(this.c0);
            {
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object object) {
            if (!(object instanceof b)) {
                return false;
            }
            if (object == this) {
                return true;
            }
            object = (b)object;
            return j.Objects.equals((Object)this.d0, (Object)((b)object).d0) && j.Objects.equals((Object)this.e0, (Object)((b)object).e0) && j.Objects.equals((Object)this.c0, (Object)((b)object).c0) && Arrays.equals(this.f0, ((b)object).f0);
        }

        public int hashCode() {
            if (this.q == 0) {
                int n8 = this.c0.hashCode();
                String string = this.d0;
                int n9 = string == null ? 0 : string.hashCode();
                this.q = ((n8 * 31 + n9) * 31 + this.e0.hashCode()) * 31 + Arrays.hashCode(this.f0);
            }
            return this.q;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeLong(this.c0.getMostSignificantBits());
            parcel.writeLong(this.c0.getLeastSignificantBits());
            parcel.writeString(this.d0);
            parcel.writeString(this.e0);
            parcel.writeByteArray(this.f0);
        }
    }
}

