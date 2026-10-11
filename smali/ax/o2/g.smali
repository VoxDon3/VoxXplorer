.class public interface abstract Lax/o2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract C(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract E0()Z
.end method

.method public abstract J(Ljava/lang/String;)Lax/o2/k;
.end method

.method public abstract Y()V
.end method

.method public abstract Z(Ljava/lang/String;[Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation
.end method

.method public abstract a0()V
.end method

.method public abstract b0(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public abstract h0(Ljava/lang/String;)Landroid/database/Cursor;
.end method

.method public abstract isOpen()Z
.end method

.method public abstract j0()V
.end method

.method public abstract n0(Lax/o2/j;)Landroid/database/Cursor;
.end method

.method public abstract r()V
.end method

.method public abstract x()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract y(Lax/o2/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
.end method

.method public abstract z0()Z
.end method
