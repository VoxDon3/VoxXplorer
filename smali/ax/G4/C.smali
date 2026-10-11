.class public Lax/G4/C;
.super Lax/x4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/x4/c<",
        "Lax/G4/t;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lax/G4/f;

.field private final d:Lax/G4/n0$a;


# direct methods
.method constructor <init>(Lax/G4/f;Lax/G4/n0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/x4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_14

    .line 5
    .line 6
    iput-object p1, p0, Lax/G4/C;->c:Lax/G4/f;

    .line 7
    .line 8
    if-eqz p2, :cond_c

    .line 9
    .line 10
    iput-object p2, p0, Lax/G4/C;->d:Lax/G4/n0$a;

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
.method public c()Lax/p4/i;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/p4/i<",
            "Lax/G4/t;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/p0;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/C;->d:Lax/G4/n0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/G4/n0$a;->a()Lax/G4/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/G4/C;->c:Lax/G4/f;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/x4/c;->a()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v0, v2}, Lax/G4/f;->k(Lax/G4/n0;Ljava/util/List;)Lax/p4/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public d(Lax/G4/q0;)Lax/G4/C;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/C;->d:Lax/G4/n0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/n0$a;->b(Lax/G4/q0;)Lax/G4/n0$a;

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

.method public e(Lax/G4/s0;)Lax/G4/C;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/C;->d:Lax/G4/n0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/n0$a;->c(Lax/G4/s0;)Lax/G4/n0$a;

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
