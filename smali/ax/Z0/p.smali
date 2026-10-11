.class public final synthetic Lax/Z0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Ljava/lang/String;JJ)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/p;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/p;->b:Ljava/lang/String;

    iput-wide p3, p0, Lax/Z0/p;->c:J

    iput-wide p5, p0, Lax/Z0/p;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/Z0/p;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/p;->b:Ljava/lang/String;

    iget-wide v2, p0, Lax/Z0/p;->c:J

    iget-wide v4, p0, Lax/Z0/p;->d:J

    move-object v6, p1

    check-cast v6, Lax/Z0/c;

    invoke-static/range {v0 .. v6}, Lax/Z0/u0;->z0(Lax/Z0/c$a;Ljava/lang/String;JJLax/Z0/c;)V

    return-void
.end method
