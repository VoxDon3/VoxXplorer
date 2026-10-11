.class Lax/J3/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/J3/i;->r(II)Lax/g4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c0:Lax/J3/i;

.field final synthetic q:Lax/g4/d;


# direct methods
.method constructor <init>(Lax/J3/i;Lax/g4/d;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/J3/i$a;->c0:Lax/J3/i;

    .line 2
    .line 3
    iput-object p2, p0, Lax/J3/i$a;->q:Lax/g4/d;

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
.method public run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/J3/i$a;->q:Lax/g4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/g4/d;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/J3/i$a;->c0:Lax/J3/i;

    .line 10
    .line 11
    iget-object v1, p0, Lax/J3/i$a;->q:Lax/g4/d;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/J3/i;->j(Lax/h4/e;)Lax/h4/e;

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
