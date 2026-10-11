.class Lcom/voxdon/xplorer/file/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/g3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/q;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/g3/i;

.field final synthetic b:Lcom/voxdon/xplorer/file/q;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/q;Lax/g3/i;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/q$c;->b:Lcom/voxdon/xplorer/file/q;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/q$c;->a:Lax/g3/i;

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
.method public a(JJ)V
    .registers 10

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/q$c;->a:Lax/g3/i;

    .line 2
    .line 3
    if-eqz v0, :cond_15

    .line 4
    .line 5
    cmp-long v1, p1, p3

    .line 6
    .line 7
    if-nez v1, :cond_c

    .line 8
    .line 9
    invoke-interface {v0, p3, p4, p3, p4}, Lax/g3/i;->a(JJ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    const-wide/16 v1, 0x2

    .line 14
    .line 15
    div-long v3, p3, v1

    .line 16
    .line 17
    div-long/2addr p1, v1

    .line 18
    add-long/2addr v3, p1

    .line 19
    invoke-interface {v0, v3, v4, p3, p4}, Lax/g3/i;->a(JJ)V

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
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
