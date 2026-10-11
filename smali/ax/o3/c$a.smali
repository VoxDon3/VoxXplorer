.class Lax/o3/c$a;
.super Lax/Ya/a$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lax/o3/c;


# direct methods
.method constructor <init>(Lax/o3/c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/c$a;->c:Lax/o3/c;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/Ya/a$g;-><init>()V

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
.method public a(Lax/Ya/a$c;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/Ya/a$g;->a(Lax/Ya/a$c;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/o3/c$a;->c:Lax/o3/c;

    .line 5
    .line 6
    invoke-static {p1}, Lax/o3/c;->x(Lax/o3/c;)Lcom/voxdon/xplorer/service/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lax/Ya/a$g;->d()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/service/b;->m(I)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method public c(Lax/Ya/a$c;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/Ya/a$g;->c(Lax/Ya/a$c;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/o3/c$a;->c:Lax/o3/c;

    .line 5
    .line 6
    invoke-static {p1}, Lax/o3/c;->x(Lax/o3/c;)Lcom/voxdon/xplorer/service/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lax/Ya/a$g;->d()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/service/b;->m(I)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method
