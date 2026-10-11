/*
 * Decompiled with CFR 0.152.
 */
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
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public interface b
extends IInterface {
    public void B0(String var1, Bundle var2) throws RemoteException;

    public void C0() throws RemoteException;

    public void D1(long var1) throws RemoteException;

    public void E0(Uri var1, Bundle var2) throws RemoteException;

    public void E1(boolean var1) throws RemoteException;

    public ParcelableVolumeInfo F1() throws RemoteException;

    public void G(String var1, Bundle var2) throws RemoteException;

    public void H(android.support.v4.media.session.a var1) throws RemoteException;

    public boolean J() throws RemoteException;

    public void K(RatingCompat var1) throws RemoteException;

    public void M(int var1, int var2, String var3) throws RemoteException;

    public void O(Uri var1, Bundle var2) throws RemoteException;

    public void S(MediaDescriptionCompat var1) throws RemoteException;

    public boolean S0(KeyEvent var1) throws RemoteException;

    public String T1() throws RemoteException;

    public boolean U() throws RemoteException;

    public void V(MediaDescriptionCompat var1) throws RemoteException;

    public void V0(int var1, int var2, String var3) throws RemoteException;

    public PendingIntent W() throws RemoteException;

    public void Y0(RatingCompat var1, Bundle var2) throws RemoteException;

    public int a0() throws RemoteException;

    public void a1(MediaDescriptionCompat var1, int var2) throws RemoteException;

    public void c0(String var1, Bundle var2) throws RemoteException;

    public void f() throws RemoteException;

    public void f1(boolean var1) throws RemoteException;

    public void g(float var1) throws RemoteException;

    public Bundle getExtras() throws RemoteException;

    public PlaybackStateCompat i() throws RemoteException;

    public void j(int var1) throws RemoteException;

    public void k() throws RemoteException;

    public String l() throws RemoteException;

    public void l1(int var1) throws RemoteException;

    public void m() throws RemoteException;

    public boolean m1() throws RemoteException;

    public CharSequence n0() throws RemoteException;

    public void next() throws RemoteException;

    public int o() throws RemoteException;

    public void p(int var1) throws RemoteException;

    public void previous() throws RemoteException;

    public MediaMetadataCompat s() throws RemoteException;

    public void s0(String var1, Bundle var2) throws RemoteException;

    public void s1(String var1, Bundle var2, MediaSessionCompat.ResultReceiverWrapper var3) throws RemoteException;

    public void stop() throws RemoteException;

    public void t(long var1) throws RemoteException;

    public Bundle u0() throws RemoteException;

    public void v0(android.support.v4.media.session.a var1) throws RemoteException;

    public List<MediaSessionCompat.QueueItem> v1() throws RemoteException;

    public int x() throws RemoteException;

    public void x0(String var1, Bundle var2) throws RemoteException;

    public long y() throws RemoteException;

    public void y1() throws RemoteException;

    public static abstract class android.support.v4.media.session.b$a
    extends Binder
    implements b {
        public android.support.v4.media.session.b$a() {
            this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterface != null && iInterface instanceof b) {
                return (b)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel object, Parcel parcel, int n9) throws RemoteException {
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                object.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (n8 == 1598968902) {
                parcel.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            boolean bl = false;
            boolean bl2 = false;
            switch (n8) {
                default: {
                    return super.onTransact(n8, object, parcel, n9);
                }
                case 51: {
                    this.Y0((RatingCompat)b.d(object, RatingCompat.CREATOR), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 50: {
                    object = this.u0();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 49: {
                    this.g(object.readFloat());
                    parcel.writeNoException();
                    break;
                }
                case 48: {
                    this.p(object.readInt());
                    parcel.writeNoException();
                    break;
                }
                case 47: {
                    n8 = this.x();
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 46: {
                    if (object.readInt() != 0) {
                        bl2 = true;
                    }
                    this.f1(bl2);
                    parcel.writeNoException();
                    break;
                }
                case 45: {
                    n8 = this.m1() ? 1 : 0;
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 44: {
                    this.l1(object.readInt());
                    parcel.writeNoException();
                    break;
                }
                case 43: {
                    this.S((MediaDescriptionCompat)b.d(object, MediaDescriptionCompat.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 42: {
                    this.a1((MediaDescriptionCompat)b.d(object, MediaDescriptionCompat.CREATOR), object.readInt());
                    parcel.writeNoException();
                    break;
                }
                case 41: {
                    this.V((MediaDescriptionCompat)b.d(object, MediaDescriptionCompat.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 40: {
                    bl2 = bl;
                    if (object.readInt() != 0) {
                        bl2 = true;
                    }
                    this.E1(bl2);
                    parcel.writeNoException();
                    break;
                }
                case 39: {
                    this.j(object.readInt());
                    parcel.writeNoException();
                    break;
                }
                case 38: {
                    n8 = this.J() ? 1 : 0;
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 37: {
                    n8 = this.o();
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 36: {
                    this.O((Uri)b.d(object, Uri.CREATOR), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 35: {
                    this.c0(object.readString(), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 34: {
                    this.s0(object.readString(), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 33: {
                    this.k();
                    parcel.writeNoException();
                    break;
                }
                case 32: {
                    n8 = this.a0();
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 31: {
                    object = this.getExtras();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 30: {
                    object = this.n0();
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        TextUtils.writeToParcel((CharSequence)object, (Parcel)parcel, (int)1);
                        break;
                    }
                    parcel.writeInt(0);
                    break;
                }
                case 29: {
                    object = this.v1();
                    parcel.writeNoException();
                    b.e(parcel, (List)object, 1);
                    break;
                }
                case 28: {
                    object = this.i();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 27: {
                    object = this.s();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 26: {
                    this.G(object.readString(), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 25: {
                    this.K((RatingCompat)b.d(object, RatingCompat.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 24: {
                    this.t(object.readLong());
                    parcel.writeNoException();
                    break;
                }
                case 23: {
                    this.y1();
                    parcel.writeNoException();
                    break;
                }
                case 22: {
                    this.C0();
                    parcel.writeNoException();
                    break;
                }
                case 21: {
                    this.previous();
                    parcel.writeNoException();
                    break;
                }
                case 20: {
                    this.next();
                    parcel.writeNoException();
                    break;
                }
                case 19: {
                    this.stop();
                    parcel.writeNoException();
                    break;
                }
                case 18: {
                    this.f();
                    parcel.writeNoException();
                    break;
                }
                case 17: {
                    this.D1(object.readLong());
                    parcel.writeNoException();
                    break;
                }
                case 16: {
                    this.E0((Uri)b.d(object, Uri.CREATOR), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 15: {
                    this.B0(object.readString(), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 14: {
                    this.x0(object.readString(), (Bundle)b.d(object, Bundle.CREATOR));
                    parcel.writeNoException();
                    break;
                }
                case 13: {
                    this.m();
                    parcel.writeNoException();
                    break;
                }
                case 12: {
                    this.M(object.readInt(), object.readInt(), object.readString());
                    parcel.writeNoException();
                    break;
                }
                case 11: {
                    this.V0(object.readInt(), object.readInt(), object.readString());
                    parcel.writeNoException();
                    break;
                }
                case 10: {
                    object = this.F1();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 9: {
                    long l8 = this.y();
                    parcel.writeNoException();
                    parcel.writeLong(l8);
                    break;
                }
                case 8: {
                    object = this.W();
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                    break;
                }
                case 7: {
                    object = this.l();
                    parcel.writeNoException();
                    parcel.writeString((String)object);
                    break;
                }
                case 6: {
                    object = this.T1();
                    parcel.writeNoException();
                    parcel.writeString((String)object);
                    break;
                }
                case 5: {
                    n8 = this.U() ? 1 : 0;
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 4: {
                    this.v0(a.a.r(object.readStrongBinder()));
                    parcel.writeNoException();
                    break;
                }
                case 3: {
                    this.H(a.a.r(object.readStrongBinder()));
                    parcel.writeNoException();
                    break;
                }
                case 2: {
                    n8 = this.S0((KeyEvent)b.d(object, KeyEvent.CREATOR)) ? 1 : 0;
                    parcel.writeNoException();
                    parcel.writeInt(n8);
                    break;
                }
                case 1: {
                    this.s1(object.readString(), (Bundle)b.d(object, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper)b.d(object, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel.writeNoException();
                }
            }
            return true;
        }

        private static class a
        implements b {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public void E0(Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    b.f(parcel, (Parcelable)uri, 0);
                    b.f(parcel, (Parcelable)bundle, 0);
                    this.e.transact(16, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void H(android.support.v4.media.session.a a8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeStrongInterface((IInterface)a8);
                    this.e.transact(3, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void O(Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    b.f(parcel, (Parcelable)uri, 0);
                    b.f(parcel, (Parcelable)bundle, 0);
                    this.e.transact(36, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public boolean S0(KeyEvent keyEvent) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    b.f(parcel2, (Parcelable)keyEvent, 0);
                    this.e.transact(2, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            public IBinder asBinder() {
                return this.e;
            }

            @Override
            public void f() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(18, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void g(float f8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeFloat(f8);
                    this.e.transact(49, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public Bundle getExtras() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(31, parcel, parcel2, 0);
                    parcel2.readException();
                    Bundle bundle = (Bundle)b.d(parcel2, Bundle.CREATOR);
                    return bundle;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public PlaybackStateCompat i() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(28, parcel, parcel2, 0);
                    parcel2.readException();
                    PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat)b.d(parcel2, PlaybackStateCompat.CREATOR);
                    return playbackStateCompat;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void j(int n8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeInt(n8);
                    this.e.transact(39, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void m() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(13, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void next() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(20, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public int o() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(37, parcel, parcel2, 0);
                    parcel2.readException();
                    int n8 = parcel2.readInt();
                    return n8;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void p(int n8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeInt(n8);
                    this.e.transact(48, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void previous() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(21, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public MediaMetadataCompat s() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(27, parcel, parcel2, 0);
                    parcel2.readException();
                    MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)b.d(parcel2, MediaMetadataCompat.CREATOR);
                    return mediaMetadataCompat;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void stop() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(19, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void t(long l8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeLong(l8);
                    this.e.transact(24, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public void v0(android.support.v4.media.session.a a8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeStrongInterface((IInterface)a8);
                    this.e.transact(4, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public int x() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.e.transact(47, parcel, parcel2, 0);
                    parcel2.readException();
                    int n8 = parcel2.readInt();
                    return n8;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }
    }

    public static class b {
        private static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return (T)creator.createFromParcel(parcel);
            }
            return null;
        }

        private static <T extends Parcelable> void e(Parcel parcel, List<T> list, int n8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int n9 = list.size();
            parcel.writeInt(n9);
            for (int i8 = 0; i8 < n9; ++i8) {
                b.f(parcel, (Parcelable)list.get(i8), n8);
            }
        }

        private static <T extends Parcelable> void f(Parcel parcel, T t8, int n8) {
            if (t8 != null) {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }
}

