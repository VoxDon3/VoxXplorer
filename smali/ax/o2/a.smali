.class public final Lax/o2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/o2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o2/a$a;
    }
.end annotation


# static fields
.field public static final d0:Lax/o2/a$a;


# instance fields
.field private final c0:[Ljava/lang/Object;

.field private final q:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/o2/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/o2/a$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/o2/a;->d0:Lax/o2/a$a;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    const-string v0, "query"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lax/o2/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 4

    const-string v0, "query"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/o2/a;->q:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lax/o2/a;->c0:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lax/o2/i;)V
    .registers 4

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lax/o2/a;->d0:Lax/o2/a$a;

    .line 7
    .line 8
    iget-object v1, p0, Lax/o2/a;->c0:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lax/o2/a$a;->b(Lax/o2/i;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public b()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o2/a;->q:Ljava/lang/String;

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
