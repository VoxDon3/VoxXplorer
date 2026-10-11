.class public Lax/G4/n;
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

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lax/G4/f;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/x4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_d

    .line 5
    .line 6
    iput-object p1, p0, Lax/G4/n;->c:Lax/G4/f;

    .line 7
    .line 8
    iput-object p2, p0, Lax/G4/n;->d:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lax/G4/n;->e:Ljava/lang/String;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string p2, "_client"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
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
            Lax/G4/p;,
            Lax/p4/j;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/G4/m;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/n;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/n;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lax/G4/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lax/G4/n;->c:Lax/G4/f;

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/x4/c;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v0, v2}, Lax/G4/f;->g(Lax/G4/m;Ljava/util/List;)Lax/p4/i;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
    .line 21
.end method
