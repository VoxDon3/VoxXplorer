/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;
    public static final List<String> g0;
    public final String c0;
    public final Set<String> d0;
    public final List<String> e0;
    public final boolean f0;
    public final c q;

    static {
        g0 = java.util.DesugarCollections.unmodifiableList(Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "org.mozilla.firefox", "org.mozilla.firefox_beta", "org.mozilla.fenix"));
        CREATOR = new Parcelable.Creator<b>(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };
    }

    protected b(Parcel parcel) {
        int n8;
        AbstractCollection abstractCollection;
        this.q = c.h(parcel.readByte());
        this.c0 = parcel.readString();
        int n9 = parcel.readInt();
        boolean bl = false;
        if (n9 > 0) {
            abstractCollection = new HashSet<String>(n9);
            for (n8 = 0; n8 < n9; ++n8) {
                abstractCollection.add(parcel.readString());
            }
            this.d0 = java.util.DesugarCollections.unmodifiableSet(abstractCollection);
        } else {
            this.d0 = Collections.EMPTY_SET;
        }
        n9 = parcel.readInt();
        if (n9 > 0) {
            abstractCollection = new ArrayList();
            for (n8 = 0; n8 < n9; ++n8) {
                abstractCollection.add((String)parcel.readString());
            }
            this.e0 = java.util.DesugarCollections.unmodifiableList(abstractCollection);
        } else {
            this.e0 = Collections.EMPTY_LIST;
        }
        if (parcel.readByte() != 0) {
            bl = true;
        }
        this.f0 = bl;
    }

    b(b b8) {
        this.q = b8.a;
        this.c0 = b8.b;
        this.d0 = java.util.DesugarCollections.unmodifiableSet((Set)b8.c);
        this.e0 = java.util.DesugarCollections.unmodifiableList((List)b8.d);
        this.f0 = b8.e;
    }

    public static b a() {
        return new b();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (b)object;
            if (this.f0 != ((b)object).f0) {
                return false;
            }
            if (this.q != ((b)object).q) {
                return false;
            }
            if (!this.c0.equals(((b)object).c0)) {
                return false;
            }
            return this.d0.equals(((b)object).d0);
        }
        return false;
    }

    public int hashCode() {
        return ((((Object)((Object)this.q)).hashCode() * 31 + this.c0.hashCode()) * 31 + this.d0.hashCode()) * 31 + this.f0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthorizationRequest{type=");
        stringBuilder.append((Object)this.q);
        stringBuilder.append(", clientId='");
        stringBuilder.append(this.c0);
        stringBuilder.append('\'');
        stringBuilder.append(", permissions=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", customTabsPackages=");
        stringBuilder.append(this.e0);
        stringBuilder.append(", forceAccessApproval=");
        stringBuilder.append(this.f0);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeByte((byte)this.q.q);
        parcel.writeString(this.c0);
        parcel.writeInt(this.d0.size());
        Iterator<String> iterator = this.d0.iterator();
        while (iterator.hasNext()) {
            parcel.writeString(iterator.next());
        }
        parcel.writeInt(this.e0.size());
        iterator = this.e0.iterator();
        while (iterator.hasNext()) {
            parcel.writeString(iterator.next());
        }
        parcel.writeByte((byte)(this.f0 ? 1 : 0));
    }

    public static class b {
        private c a;
        private String b;
        private final Set<String> c;
        private final List<String> d = new ArrayList<String>(g0);
        private boolean e = false;

        b() {
            this.c = new HashSet<String>();
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass()) {
                object = (b)object;
                if (this.e != ((b)object).e) {
                    return false;
                }
                if (this.a != ((b)object).a) {
                    return false;
                }
                if (!j.Objects.equals((Object)this.b, (Object)((b)object).b)) {
                    return false;
                }
                return this.c.equals(((b)object).c);
            }
            return false;
        }

        public b f(String string) {
            this.c.add(string);
            return this;
        }

        public b g() {
            if (this.a != null) {
                if (this.b != null) {
                    return new b(this);
                }
                throw new IllegalStateException("setClientId() not called.");
            }
            throw new IllegalStateException("setType() not called.");
        }

        public b h(String string) {
            this.b = string;
            return this;
        }

        public int hashCode() {
            Object object = this.a;
            int n8 = 0;
            int n9 = object != null ? object.hashCode() : 0;
            object = this.b;
            if (object != null) {
                n8 = ((String)object).hashCode();
            }
            return ((n9 * 31 + n8) * 31 + this.c.hashCode()) * 31 + this.e;
        }

        public b i(boolean bl) {
            this.e = bl;
            return this;
        }

        public b j(c c8) {
            this.a = c8;
            return this;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Builder{type=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", clientId='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append(", permissions=");
            stringBuilder.append(this.c);
            stringBuilder.append(", customTabsPackages=");
            stringBuilder.append(this.d);
            stringBuilder.append(", forceAccessApproval=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0 = new c(0);
        public static final /* enum */ c d0 = new c(1);
        private static final c[] e0 = c.d();
        protected final int q;

        private c(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ c[] d() {
            return new c[]{c0, d0};
        }

        static c h(int n8) {
            if (n8 != 0) {
                if (n8 == 1) {
                    return d0;
                }
                throw new IllegalArgumentException();
            }
            return c0;
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

