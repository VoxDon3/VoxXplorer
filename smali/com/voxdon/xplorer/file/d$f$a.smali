.class Lcom/voxdon/xplorer/file/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/box/androidsdk/content/auth/BoxAuthentication$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/d$f;->k(Lcom/voxdon/xplorer/activity/a;Lax/g3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lcom/voxdon/xplorer/file/d$f;

.field final synthetic q:Lax/g3/k;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/d$f;Lax/g3/k;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/d$f$a;->c0:Lcom/voxdon/xplorer/file/d$f;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/d$f$a;->q:Lax/g3/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V
    .registers 3

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/file/d;->k0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "Box : onAuthFailure"

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Lcom/voxdon/xplorer/file/d$f$a$b;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Lcom/voxdon/xplorer/file/d$f$a$b;-><init>(Lcom/voxdon/xplorer/file/d$f$a;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public g(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 3

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/file/d;->k0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "Box : onRefreshed"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 22
.end method

.method public h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 5

    .line 1
    invoke-static {}, Lcom/voxdon/xplorer/file/d;->k0()Ljava/util/logging/Logger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Box : onAuthCreated"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/voxdon/xplorer/file/d$f$a;->c0:Lcom/voxdon/xplorer/file/d$f;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/d$f;->m()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lcom/voxdon/xplorer/file/d$f$a;->c0:Lcom/voxdon/xplorer/file/d$f;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lcom/voxdon/xplorer/file/d$f;->l(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-ltz v0, :cond_20

    .line 31
    .line 32
    move v1, v0

    .line 33
    :cond_20
    iget-object v0, p0, Lcom/voxdon/xplorer/file/d$f$a;->c0:Lcom/voxdon/xplorer/file/d$f;

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Lcom/voxdon/xplorer/file/d$f;->o(ILcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lcom/voxdon/xplorer/file/d$f$a$a;

    .line 48
    .line 49
    invoke-direct {v0, p0, v1}, Lcom/voxdon/xplorer/file/d$f$a$a;-><init>(Lcom/voxdon/xplorer/file/d$f$a;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
