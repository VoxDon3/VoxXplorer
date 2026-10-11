/*
 * Decompiled with CFR 0.152.
 */
package ax.p3;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>(){

        public a a(Parcel parcel) {
            a a8 = new a();
            a8.a(parcel);
            return a8;
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public String c0;
    public boolean d0 = false;
    public boolean e0 = false;
    public boolean f0 = false;
    public boolean g0 = false;
    public boolean h0 = false;
    public long i0 = 0L;
    public long j0 = 0L;
    public String q;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(Parcel parcel) {
        int n8 = parcel.dataPosition();
        int n9 = parcel.readInt();
        if (n9 >= 4) {
            block18: {
                block24: {
                    int n10;
                    block23: {
                        boolean bl;
                        boolean bl2;
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        n10 = parcel.dataPosition();
                                        if (n10 - n8 >= n9) {
                                            if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                                            break block18;
                                        }
                                        this.q = parcel.readString();
                                        n10 = parcel.dataPosition();
                                        if (n10 - n8 >= n9) {
                                            if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                                            break block18;
                                        }
                                        this.c0 = parcel.readString();
                                        n10 = parcel.dataPosition();
                                        if (n10 - n8 < n9) break block19;
                                        if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                                        break block18;
                                    }
                                    n10 = parcel.readInt();
                                    bl2 = false;
                                    bl = n10 != 0;
                                    this.d0 = bl;
                                    n10 = parcel.dataPosition();
                                    if (n10 - n8 < n9) break block20;
                                    if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                                    break block18;
                                }
                                bl = parcel.readInt() != 0;
                                this.e0 = bl;
                                n10 = parcel.dataPosition();
                                if (n10 - n8 < n9) break block21;
                                if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                                break block18;
                            }
                            bl = parcel.readInt() != 0;
                            this.f0 = bl;
                            n10 = parcel.dataPosition();
                            if (n10 - n8 < n9) break block22;
                            if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                            break block18;
                        }
                        bl = parcel.readInt() != 0;
                        this.g0 = bl;
                        n10 = parcel.dataPosition();
                        if (n10 - n8 >= n9) {
                            if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                            break block18;
                        }
                        bl = bl2;
                        if (parcel.readInt() != 0) {
                            bl = true;
                        }
                        this.h0 = bl;
                        n10 = parcel.dataPosition();
                        if (n10 - n8 < n9) break block23;
                        if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                        break block18;
                    }
                    this.i0 = parcel.readLong();
                    n10 = parcel.dataPosition();
                    if (n10 - n8 < n9) break block24;
                    if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
                    break block18;
                }
                this.j0 = parcel.readLong();
                if (n8 > Integer.MAX_VALUE - n9) throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(n8 + n9);
            return;
        }
        try {
            BadParcelableException badParcelableException = new BadParcelableException("Parcelable too small");
            throw badParcelableException;
        }
        catch (Throwable throwable) {}
        if (n8 > Integer.MAX_VALUE - n9) {
            throw new BadParcelableException("Overflow in the size of parcelable");
        }
        parcel.setDataPosition(n8 + n9);
        throw throwable;
    }

    public int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.q);
        parcel.writeString(this.c0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeLong(this.i0);
        parcel.writeLong(this.j0);
        n8 = parcel.dataPosition();
        parcel.setDataPosition(n9);
        parcel.writeInt(n8 - n9);
        parcel.setDataPosition(n8);
    }
}

