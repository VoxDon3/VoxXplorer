/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

public interface a
extends IInterface {
    public void A(String var1, Bundle var2) throws RemoteException;

    public void G0(boolean var1) throws RemoteException;

    public void T0(boolean var1) throws RemoteException;

    public void U0(CharSequence var1) throws RemoteException;

    public void V1(PlaybackStateCompat var1) throws RemoteException;

    public void Z0() throws RemoteException;

    public void Z1(ParcelableVolumeInfo var1) throws RemoteException;

    public void j0() throws RemoteException;

    public void k0(Bundle var1) throws RemoteException;

    public void m0(List<MediaSessionCompat.QueueItem> var1) throws RemoteException;

    public void o1(int var1) throws RemoteException;

    public void u(MediaMetadataCompat var1) throws RemoteException;

    public void v(int var1) throws RemoteException;

    public static abstract class android.support.v4.media.session.a$a
    extends Binder
    implements android.support.v4.media.session.a {
        public android.support.v4.media.session.a$a() {
            this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static android.support.v4.media.session.a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (iInterface != null && iInterface instanceof android.support.v4.media.session.a) {
                return (android.support.v4.media.session.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (n8 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            boolean bl = false;
            boolean bl2 = false;
            switch (n8) {
                default: {
                    return super.onTransact(n8, parcel, parcel2, n9);
                }
                case 13: {
                    this.j0();
                    break;
                }
                case 12: {
                    this.o1(parcel.readInt());
                    break;
                }
                case 11: {
                    bl = bl2;
                    if (parcel.readInt() != 0) {
                        bl = true;
                    }
                    this.G0(bl);
                    break;
                }
                case 10: {
                    if (parcel.readInt() != 0) {
                        bl = true;
                    }
                    this.T0(bl);
                    break;
                }
                case 9: {
                    this.v(parcel.readInt());
                    break;
                }
                case 8: {
                    this.Z1((ParcelableVolumeInfo)b.d(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                }
                case 7: {
                    this.k0((Bundle)b.d(parcel, Bundle.CREATOR));
                    break;
                }
                case 6: {
                    this.U0((CharSequence)b.d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                }
                case 5: {
                    this.m0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                }
                case 4: {
                    this.u((MediaMetadataCompat)b.d(parcel, MediaMetadataCompat.CREATOR));
                    break;
                }
                case 3: {
                    this.V1((PlaybackStateCompat)b.d(parcel, PlaybackStateCompat.CREATOR));
                    break;
                }
                case 2: {
                    this.Z0();
                    break;
                }
                case 1: {
                    this.A(parcel.readString(), (Bundle)b.d(parcel, Bundle.CREATOR));
                }
            }
            return true;
        }

        private static class a
        implements android.support.v4.media.session.a {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void U0(CharSequence charSequence) throws RemoteException {
                Throwable throwable2;
                Parcel parcel;
                block4: {
                    block3: {
                        block2: {
                            parcel = Parcel.obtain();
                            try {
                                parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                                if (charSequence == null) break block2;
                                parcel.writeInt(1);
                                TextUtils.writeToParcel((CharSequence)charSequence, (Parcel)parcel, (int)0);
                                break block3;
                            }
                            catch (Throwable throwable2) {
                                break block4;
                            }
                        }
                        parcel.writeInt(0);
                    }
                    this.e.transact(6, parcel, null, 1);
                    parcel.recycle();
                    return;
                }
                parcel.recycle();
                throw throwable2;
            }

            @Override
            public void V1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, playbackStateCompat, 0);
                    this.e.transact(3, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void Z0() throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.e.transact(2, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            public IBinder asBinder() {
                return this.e;
            }

            @Override
            public void k0(Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, (Parcelable)bundle, 0);
                    this.e.transact(7, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void m0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.e(parcel, list, 0);
                    this.e.transact(5, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void o1(int n8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.writeInt(n8);
                    this.e.transact(12, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void u(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, mediaMetadataCompat, 0);
                    this.e.transact(4, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void v(int n8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.writeInt(n8);
                    this.e.transact(9, parcel, null, 1);
                    return;
                }
                finally {
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

