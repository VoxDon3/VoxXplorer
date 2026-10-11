/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface t
extends IInterface {
    public void O0(Status var1) throws RemoteException;

    public void Q0(GoogleSignInAccount var1, Status var2) throws RemoteException;

    public void e1(Status var1) throws RemoteException;
}

