.class Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;


# direct methods
.method constructor <init>(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;->q:Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 22
.end method


# virtual methods
.method public run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;->q:Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->E(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)Lcom/box/androidsdk/content/models/BoxSession;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->B()Lcom/box/androidsdk/content/auth/BoxAuthentication$g;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$a;->q:Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->E(Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;)Lcom/box/androidsdk/content/models/BoxSession;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxSession;->U()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method
