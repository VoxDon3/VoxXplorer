.class Lcom/voxdon/xplorer/service/CommandService$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/service/CommandService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Lax/a3/y;

.field b:Lax/a3/y;

.field c:Lax/R2/a;

.field d:Lax/a3/j;


# direct methods
.method public constructor <init>(Lax/R2/a;Lax/a3/y;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->c:Lax/R2/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/voxdon/xplorer/service/CommandService$c;->a:Lax/a3/y;

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
.method public a()Lax/R2/a;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$c;->c:Lax/R2/a;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public b()Lax/a3/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$c;->d:Lax/a3/j;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public c(Z)Lax/a3/y;
    .registers 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget-object p1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->a:Lax/a3/y;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_5
    iget-object p1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->b:Lax/a3/y;

    .line 7
    .line 8
    return-object p1
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

.method public d(Lax/a3/y;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$c;->a:Lax/a3/y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne v0, p1, :cond_7

    .line 5
    .line 6
    iput-object v1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->a:Lax/a3/y;

    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/service/CommandService$c;->b:Lax/a3/y;

    .line 9
    .line 10
    if-ne v0, p1, :cond_d

    .line 11
    .line 12
    iput-object v1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->b:Lax/a3/y;

    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e(Lax/a3/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/service/CommandService$c;->d:Lax/a3/j;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method public f(ZLax/a3/y;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/service/CommandService$c;->a:Lax/a3/y;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iput-object p2, p0, Lcom/voxdon/xplorer/service/CommandService$c;->b:Lax/a3/y;

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
