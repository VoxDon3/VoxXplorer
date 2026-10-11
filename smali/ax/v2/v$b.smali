.class Lax/v2/v$b;
.super Lax/v2/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/v2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lax/v2/v;


# direct methods
.method constructor <init>(Lax/v2/v;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/v2/s;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/v2/v$b;->a:Lax/v2/v;

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
.method public a(Lax/v2/k;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/v2/v$b;->a:Lax/v2/v;

    .line 2
    .line 3
    iget v1, v0, Lax/v2/v;->P0:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    iput v1, v0, Lax/v2/v;->P0:I

    .line 8
    .line 9
    if-nez v1, :cond_10

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, v0, Lax/v2/v;->Q0:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/v2/k;->t()V

    .line 15
    .line 16
    .line 17
    :cond_10
    invoke-virtual {p1, p0}, Lax/v2/k;->Z(Lax/v2/k$f;)Lax/v2/k;

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
.end method

.method public g(Lax/v2/k;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/v2/v$b;->a:Lax/v2/v;

    .line 2
    .line 3
    iget-boolean v0, p1, Lax/v2/v;->Q0:Z

    .line 4
    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/v2/k;->k0()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/v2/v$b;->a:Lax/v2/v;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p1, Lax/v2/v;->Q0:Z

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
