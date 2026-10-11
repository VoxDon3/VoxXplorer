package ax.h;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.h.InterfaceC2139a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: ax.h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2140b implements Parcelable {
    public static final Parcelable.Creator<C2140b> CREATOR = new a();
    InterfaceC2139a d0;
    final boolean q = false;
    final Handler c0 = null;

    /* renamed from: ax.h.b$a */
    class a implements Parcelable.Creator<C2140b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2140b createFromParcel(Parcel parcel) {
            return new C2140b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2140b[] newArray(int i) {
            return new C2140b[i];
        }
    }

    /* renamed from: ax.h.b$b, reason: collision with other inner class name */
    class BinderC0322b extends InterfaceC2139a.AbstractBinderC0320a {
        BinderC0322b() {
        }

        @Override // ax.h.InterfaceC2139a
        public void X1(int i, Bundle bundle) {
            C2140b c2140b = C2140b.this;
            Handler handler = c2140b.c0;
            if (handler != null) {
                handler.post(c2140b.new c(i, bundle));
            } else {
                c2140b.a(i, bundle);
            }
        }
    }

    /* renamed from: ax.h.b$c */
    class c implements Runnable {
        final Bundle c0;
        final int q;

        c(int i, Bundle bundle) {
            this.q = i;
            this.c0 = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2140b.this.a(this.q, this.c0);
        }
    }

    C2140b(Parcel parcel) {
        this.d0 = InterfaceC2139a.AbstractBinderC0320a.r(parcel.readStrongBinder());
    }

    public void b(int i, Bundle bundle) {
        if (this.q) {
            Handler handler = this.c0;
            if (handler != null) {
                handler.post(new c(i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        InterfaceC2139a interfaceC2139a = this.d0;
        if (interfaceC2139a != null) {
            try {
                interfaceC2139a.X1(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.d0 == null) {
                    this.d0 = new BinderC0322b();
                }
                parcel.writeStrongBinder(this.d0.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i, Bundle bundle) {
    }
}
