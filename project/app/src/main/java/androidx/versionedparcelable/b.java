/*
 * Decompiled with CFR 0.152.
 */
package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.a;
import java.lang.reflect.Method;

class b
extends a {
    private final SparseIntArray d = new SparseIntArray();
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i = -1;
    private int j;
    private int k = -1;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ax.B.a<String, Method>(), new ax.B.a<String, Method>(), new ax.B.a<String, Class>());
    }

    private b(Parcel parcel, int n8, int n9, String string, ax.B.a<String, Method> a8, ax.B.a<String, Method> a9, ax.B.a<String, Class> a10) {
        super(a8, a9, a10);
        this.e = parcel;
        this.f = n8;
        this.g = n9;
        this.j = n8;
        this.h = string;
    }

    @Override
    public void A(byte[] byArray) {
        if (byArray != null) {
            this.e.writeInt(byArray.length);
            this.e.writeByteArray(byArray);
            return;
        }
        this.e.writeInt(-1);
    }

    @Override
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)this.e, (int)0);
    }

    @Override
    public void E(int n8) {
        this.e.writeInt(n8);
    }

    @Override
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override
    public void I(String string) {
        this.e.writeString(string);
    }

    @Override
    public void a() {
        int n8 = this.i;
        if (n8 >= 0) {
            int n9 = this.d.get(n8);
            n8 = this.e.dataPosition();
            this.e.setDataPosition(n9);
            this.e.writeInt(n8 - n9);
            this.e.setDataPosition(n8);
        }
    }

    @Override
    protected a b() {
        int n8;
        Parcel parcel = this.e;
        int n9 = parcel.dataPosition();
        int n10 = n8 = this.j;
        if (n8 == this.f) {
            n10 = this.g;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h);
        stringBuilder.append("  ");
        return new b(parcel, n9, n10, stringBuilder.toString(), this.a, this.b, this.c);
    }

    @Override
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override
    public byte[] i() {
        int n8 = this.e.readInt();
        if (n8 < 0) {
            return null;
        }
        byte[] byArray = new byte[n8];
        this.e.readByteArray(byArray);
        return byArray;
    }

    @Override
    protected CharSequence k() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override
    public boolean m(int n8) {
        while (this.j < this.g) {
            int n9 = this.k;
            if (n9 == n8) {
                return true;
            }
            if (String.valueOf(n9).compareTo(String.valueOf(n8)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            n9 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += n9;
        }
        return this.k == n8;
    }

    @Override
    public int o() {
        return this.e.readInt();
    }

    @Override
    public <T extends Parcelable> T q() {
        return (T)this.e.readParcelable(this.getClass().getClassLoader());
    }

    @Override
    public String s() {
        return this.e.readString();
    }

    @Override
    public void w(int n8) {
        this.a();
        this.i = n8;
        this.d.put(n8, this.e.dataPosition());
        this.E(0);
        this.E(n8);
    }

    @Override
    public void y(boolean bl) {
        this.e.writeInt(bl ? 1 : 0);
    }
}

