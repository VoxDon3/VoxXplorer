.class public Lax/G4/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/G4/f;

.field private final b:Lax/G4/h0$a;


# direct methods
.method constructor <init>(Lax/G4/f;Lax/G4/h0$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_14

    .line 5
    .line 6
    iput-object p1, p0, Lax/G4/i0;->a:Lax/G4/f;

    .line 7
    .line 8
    if-eqz p2, :cond_c

    .line 9
    .line 10
    iput-object p2, p0, Lax/G4/i0;->b:Lax/G4/h0$a;

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
.method public a()Lax/G4/j0;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/G4/b0;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/G4/i0;->b:Lax/G4/h0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/G4/h0$a;->a()Lax/G4/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/G4/i0;->a:Lax/G4/f;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lax/G4/f;->s(Lax/G4/h0;)Lax/G4/j0;

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

.method public b(Lax/G4/f0;)Lax/G4/i0;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/G4/i0;->b:Lax/G4/h0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G4/h0$a;->b(Lax/G4/f0;)Lax/G4/h0$a;

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
