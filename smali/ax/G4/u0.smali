.class public Lax/G4/u0;
.super Lax/x4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/x4/e<",
        "Lax/G4/t;",
        "Lax/G4/v0;",
        "Lax/G4/w0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lax/G4/f;

.field private final b:Lax/G4/t0$a;


# direct methods
.method constructor <init>(Lax/G4/f;Lax/G4/t0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/x4/e;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_14

    .line 5
    .line 6
    iput-object p1, p0, Lax/G4/u0;->a:Lax/G4/f;

    .line 7
    .line 8
    if-eqz p2, :cond_c

    .line 9
    .line 10
    iput-object p2, p0, Lax/G4/u0;->b:Lax/G4/t0$a;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    new-instance p1, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string p2, "_builder"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_14
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p2, "_client"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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
.method public bridge synthetic a()Lax/p4/o;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/p4/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/G4/u0;->d()Lax/G4/O0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public d()Lax/G4/O0;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/w0;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/u0;->b:Lax/G4/t0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/G4/t0$a;->e()Lax/G4/t0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/G4/u0;->a:Lax/G4/f;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lax/G4/f;->u(Lax/G4/t0;)Lax/G4/O0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

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
.end method

.method public e(Ljava/lang/Boolean;)Lax/G4/u0;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/u0;->b:Lax/G4/t0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/t0$a;->f(Ljava/lang/Boolean;)Lax/G4/t0$a;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public f(Ljava/util/Date;)Lax/G4/u0;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/u0;->b:Lax/G4/t0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/t0$a;->g(Ljava/util/Date;)Lax/G4/t0$a;

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public g(Lax/G4/T0;)Lax/G4/u0;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/u0;->b:Lax/G4/t0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/t0$a;->h(Lax/G4/T0;)Lax/G4/t0$a;

    .line 4
    .line 5
    .line 6
    return-object p0
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
