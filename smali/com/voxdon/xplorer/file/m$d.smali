.class public Lcom/voxdon/xplorer/file/m$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lcom/voxdon/xplorer/file/m;


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/m;)V
    .registers 3

    .line 1
    sget-object v0, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/file/m$d;->h:Lcom/voxdon/xplorer/file/m;

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
.end method


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m$d;->w([Ljava/lang/Long;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected varargs w([Ljava/lang/Long;)Ljava/lang/Long;
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/file/m$d;->h:Lcom/voxdon/xplorer/file/m;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/voxdon/xplorer/file/c;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    iget-object p1, p0, Lcom/voxdon/xplorer/file/m$d;->h:Lcom/voxdon/xplorer/file/m;

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/voxdon/xplorer/file/c;->b()V

    .line 12
    .line 13
    .line 14
    :cond_d
    const/4 p1, 0x0

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
