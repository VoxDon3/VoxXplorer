.class public Lcom/voxdon/xplorer/file/m$e;
.super Lax/c3/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "e"
.end annotation


# instance fields
.field a:Lcom/voxdon/xplorer/file/n;

.field final synthetic b:Lcom/voxdon/xplorer/file/m;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/m$e;->b:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/c3/G;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/voxdon/xplorer/file/m$e;->a:Lcom/voxdon/xplorer/file/n;

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
.method public a()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public c(J)Ljava/io/InputStream;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m$e;->b:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/file/m$e;->a:Lcom/voxdon/xplorer/file/n;

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2}, Lcom/voxdon/xplorer/file/c;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public d()J
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m$e;->a:Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/c3/b;->p()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public e()Lax/c3/K;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/m$e;->b:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/m;->v()Lax/c3/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
