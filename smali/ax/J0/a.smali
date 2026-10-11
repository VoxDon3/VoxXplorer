.class public abstract Lax/J0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/J0/a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static c(Lax/G0/h;)Lax/J0/a;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lax/G0/h;",
            ":",
            "Lax/G0/v;",
            ">(TT;)",
            "Lax/J0/a;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/J0/b;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Lax/G0/v;

    .line 5
    .line 6
    invoke-interface {v1}, Lax/G0/v;->getViewModelStore()Landroidx/lifecycle/r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, p0, v1}, Lax/J0/b;-><init>(Lax/G0/h;Landroidx/lifecycle/r;)V

    .line 11
    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public abstract a(I)V
.end method

.method public abstract b(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract d(I)Lax/K0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lax/K0/c<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract e(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Lax/J0/a$a<",
            "TD;>;)",
            "Lax/K0/c<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract f()V
.end method

.method public abstract g(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Lax/J0/a$a<",
            "TD;>;)",
            "Lax/K0/c<",
            "TD;>;"
        }
    .end annotation
.end method
