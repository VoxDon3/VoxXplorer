package com.pcloud.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class b implements Parcelable {
    public final String c0;
    public final Set<String> d0;
    public final List<String> e0;
    public final boolean f0;
    public final c q;
    public static final List<String> g0 = DesugarCollections.unmodifiableList(Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "org.mozilla.firefox", "org.mozilla.firefox_beta", "org.mozilla.fenix"));
    public static final Parcelable.Creator<b> CREATOR = new a();

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

    /* renamed from: com.pcloud.sdk.b$b, reason: collision with other inner class name */
    public static class C0569b {
        private c a;
        private String b;
        private boolean e = false;
        private final List<String> d = new ArrayList(b.g0);
        private final Set<String> c = new HashSet();

        C0569b() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0569b c0569b = (C0569b) obj;
            if (this.e == c0569b.e && this.a == c0569b.a && Objects.equals(this.b, c0569b.b)) {
                return this.c.equals(c0569b.c);
            }
            return false;
        }

        public C0569b f(String str) {
            this.c.add(str);
            return this;
        }

        public b g() {
            if (this.a == null) {
                throw new IllegalStateException("setType() not called.");
            }
            if (this.b != null) {
                return new b(this);
            }
            throw new IllegalStateException("setClientId() not called.");
        }

        public C0569b h(String str) {
            this.b = str;
            return this;
        }

        public int hashCode() {
            c cVar = this.a;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            String str = this.b;
            return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + (this.e ? 1 : 0);
        }

        public C0569b i(boolean z) {
            this.e = z;
            return this;
        }

        public C0569b j(c cVar) {
            this.a = cVar;
            return this;
        }

        public String toString() {
            return "Builder{type=" + this.a + ", clientId='" + this.b + "', permissions=" + this.c + ", customTabsPackages=" + this.d + ", forceAccessApproval=" + this.e + '}';
        }
    }

    public enum c {
        CODE(0),
        TOKEN(1);

        protected final int q;

        c(int i) {
            this.q = i;
        }

        static c h(int i) {
            if (i == 0) {
                return CODE;
            }
            if (i == 1) {
                return TOKEN;
            }
            throw new IllegalArgumentException();
        }
    }

    b(C0569b c0569b) {
        this.q = c0569b.a;
        this.c0 = c0569b.b;
        this.d0 = DesugarCollections.unmodifiableSet(c0569b.c);
        this.e0 = DesugarCollections.unmodifiableList(c0569b.d);
        this.f0 = c0569b.e;
    }

    public static C0569b a() {
        return new C0569b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f0 == bVar.f0 && this.q == bVar.q && this.c0.equals(bVar.c0)) {
            return this.d0.equals(bVar.d0);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.q.hashCode() * 31) + this.c0.hashCode()) * 31) + this.d0.hashCode()) * 31) + (this.f0 ? 1 : 0);
    }

    public String toString() {
        return "AuthorizationRequest{type=" + this.q + ", clientId='" + this.c0 + "', permissions=" + this.d0 + ", customTabsPackages=" + this.e0 + ", forceAccessApproval=" + this.f0 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.q.q);
        parcel.writeString(this.c0);
        parcel.writeInt(this.d0.size());
        Iterator<String> it = this.d0.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeInt(this.e0.size());
        Iterator<String> it2 = this.e0.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
        parcel.writeByte(this.f0 ? (byte) 1 : (byte) 0);
    }

    protected b(Parcel parcel) {
        this.q = c.h(parcel.readByte());
        this.c0 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            HashSet hashSet = new HashSet(readInt);
            for (int i = 0; i < readInt; i++) {
                hashSet.add(parcel.readString());
            }
            this.d0 = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            this.d0 = Collections.EMPTY_SET;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < readInt2; i2++) {
                arrayList.add(parcel.readString());
            }
            this.e0 = DesugarCollections.unmodifiableList(arrayList);
        } else {
            this.e0 = Collections.EMPTY_LIST;
        }
        this.f0 = parcel.readByte() != 0;
    }
}
