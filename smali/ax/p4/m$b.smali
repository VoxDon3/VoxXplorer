.class public final Lax/p4/m$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/p4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lax/s4/a;

.field private d:I


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/p4/m$b;->a:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lax/p4/m$b;->b:Ljava/lang/String;

    .line 5
    sget-object p1, Lax/s4/b;->e:Lax/s4/b;

    iput-object p1, p0, Lax/p4/m$b;->c:Lax/s4/a;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lax/p4/m$b;->d:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lax/p4/m$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/p4/m$b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lax/p4/m;
    .registers 7

    .line 1
    new-instance v0, Lax/p4/m;

    .line 2
    .line 3
    iget-object v1, p0, Lax/p4/m$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/p4/m$b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lax/p4/m$b;->c:Lax/s4/a;

    .line 8
    .line 9
    iget v4, p0, Lax/p4/m$b;->d:I

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v0 .. v5}, Lax/p4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/s4/a;ILax/p4/m$a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Lax/s4/a;)Lax/p4/m$b;
    .registers 3

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iput-object p1, p0, Lax/p4/m$b;->c:Lax/s4/a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "httpRequestor"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
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
