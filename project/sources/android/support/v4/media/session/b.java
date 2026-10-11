package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0004a implements b {
            private IBinder e;

            C0004a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void E0(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    C0005b.f(obtain, uri, 0);
                    C0005b.f(obtain, bundle, 0);
                    this.e.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void H(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface(aVar);
                    this.e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void O(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    C0005b.f(obtain, uri, 0);
                    C0005b.f(obtain, bundle, 0);
                    this.e.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean S0(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    C0005b.f(obtain, keyEvent, 0);
                    this.e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // android.support.v4.media.session.b
            public void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void g(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeFloat(f);
                    this.e.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C0005b.d(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PlaybackStateCompat) C0005b.d(obtain2, PlaybackStateCompat.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void j(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.e.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void p(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.e.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return (MediaMetadataCompat) C0005b.d(obtain2, MediaMetadataCompat.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void t(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.e.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void v0(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface(aVar);
                    this.e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int x() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0004a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    s1(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) C0005b.d(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    boolean S0 = S0((KeyEvent) C0005b.d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(S0 ? 1 : 0);
                    return true;
                case 3:
                    H(a.AbstractBinderC0002a.r(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    v0(a.AbstractBinderC0002a.r(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean U = U();
                    parcel2.writeNoException();
                    parcel2.writeInt(U ? 1 : 0);
                    return true;
                case 6:
                    String T1 = T1();
                    parcel2.writeNoException();
                    parcel2.writeString(T1);
                    return true;
                case 7:
                    String l = l();
                    parcel2.writeNoException();
                    parcel2.writeString(l);
                    return true;
                case 8:
                    PendingIntent W = W();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, W, 1);
                    return true;
                case 9:
                    long y = y();
                    parcel2.writeNoException();
                    parcel2.writeLong(y);
                    return true;
                case 10:
                    ParcelableVolumeInfo F1 = F1();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, F1, 1);
                    return true;
                case 11:
                    V0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    M(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    m();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    x0(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    B0(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    E0((Uri) C0005b.d(parcel, Uri.CREATOR), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    D1(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    f();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    C0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    y1();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    t(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    K((RatingCompat) C0005b.d(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    G(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    MediaMetadataCompat s = s();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, s, 1);
                    return true;
                case 28:
                    PlaybackStateCompat i3 = i();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, i3, 1);
                    return true;
                case 29:
                    List<MediaSessionCompat.QueueItem> v1 = v1();
                    parcel2.writeNoException();
                    C0005b.e(parcel2, v1, 1);
                    return true;
                case 30:
                    CharSequence n0 = n0();
                    parcel2.writeNoException();
                    if (n0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(n0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, extras, 1);
                    return true;
                case 32:
                    int a0 = a0();
                    parcel2.writeNoException();
                    parcel2.writeInt(a0);
                    return true;
                case 33:
                    k();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    s0(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    c0(parcel.readString(), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    O((Uri) C0005b.d(parcel, Uri.CREATOR), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    int o = o();
                    parcel2.writeNoException();
                    parcel2.writeInt(o);
                    return true;
                case 38:
                    boolean J = J();
                    parcel2.writeNoException();
                    parcel2.writeInt(J ? 1 : 0);
                    return true;
                case 39:
                    j(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    E1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    V((MediaDescriptionCompat) C0005b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    a1((MediaDescriptionCompat) C0005b.d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    S((MediaDescriptionCompat) C0005b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    l1(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    boolean m1 = m1();
                    parcel2.writeNoException();
                    parcel2.writeInt(m1 ? 1 : 0);
                    return true;
                case 46:
                    f1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    int x = x();
                    parcel2.writeNoException();
                    parcel2.writeInt(x);
                    return true;
                case 48:
                    p(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    g(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    Bundle u0 = u0();
                    parcel2.writeNoException();
                    C0005b.f(parcel2, u0, 1);
                    return true;
                case 51:
                    Y0((RatingCompat) C0005b.d(parcel, RatingCompat.CREATOR), (Bundle) C0005b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.b$b, reason: collision with other inner class name */
    public static class C0005b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void B0(String str, Bundle bundle) throws RemoteException;

    void C0() throws RemoteException;

    void D1(long j) throws RemoteException;

    void E0(Uri uri, Bundle bundle) throws RemoteException;

    void E1(boolean z) throws RemoteException;

    ParcelableVolumeInfo F1() throws RemoteException;

    void G(String str, Bundle bundle) throws RemoteException;

    void H(android.support.v4.media.session.a aVar) throws RemoteException;

    boolean J() throws RemoteException;

    void K(RatingCompat ratingCompat) throws RemoteException;

    void M(int i, int i2, String str) throws RemoteException;

    void O(Uri uri, Bundle bundle) throws RemoteException;

    void S(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    boolean S0(KeyEvent keyEvent) throws RemoteException;

    String T1() throws RemoteException;

    boolean U() throws RemoteException;

    void V(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void V0(int i, int i2, String str) throws RemoteException;

    PendingIntent W() throws RemoteException;

    void Y0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    int a0() throws RemoteException;

    void a1(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    void c0(String str, Bundle bundle) throws RemoteException;

    void f() throws RemoteException;

    void f1(boolean z) throws RemoteException;

    void g(float f) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    PlaybackStateCompat i() throws RemoteException;

    void j(int i) throws RemoteException;

    void k() throws RemoteException;

    String l() throws RemoteException;

    void l1(int i) throws RemoteException;

    void m() throws RemoteException;

    boolean m1() throws RemoteException;

    CharSequence n0() throws RemoteException;

    void next() throws RemoteException;

    int o() throws RemoteException;

    void p(int i) throws RemoteException;

    void previous() throws RemoteException;

    MediaMetadataCompat s() throws RemoteException;

    void s0(String str, Bundle bundle) throws RemoteException;

    void s1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void stop() throws RemoteException;

    void t(long j) throws RemoteException;

    Bundle u0() throws RemoteException;

    void v0(android.support.v4.media.session.a aVar) throws RemoteException;

    List<MediaSessionCompat.QueueItem> v1() throws RemoteException;

    int x() throws RemoteException;

    void x0(String str, Bundle bundle) throws RemoteException;

    long y() throws RemoteException;

    void y1() throws RemoteException;
}
