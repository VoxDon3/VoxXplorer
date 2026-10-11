.class public final synthetic Lax/w5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lax/p5/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;Ljava/lang/Iterable;Lax/p5/p;J)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/m;->a:Lax/w5/r;

    iput-object p2, p0, Lax/w5/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lax/w5/m;->c:Lax/p5/p;

    iput-wide p4, p0, Lax/w5/m;->d:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/w5/m;->a:Lax/w5/r;

    iget-object v1, p0, Lax/w5/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lax/w5/m;->c:Lax/p5/p;

    iget-wide v3, p0, Lax/w5/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lax/w5/r;->b(Lax/w5/r;Ljava/lang/Iterable;Lax/p5/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
